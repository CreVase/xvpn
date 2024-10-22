package okhttp3.internal.cache;

import defpackage.d11;
import defpackage.dw2;
import defpackage.gq;
import defpackage.i23;
import defpackage.ii2;
import defpackage.j11;
import defpackage.m20;
import defpackage.mx2;
import defpackage.ng0;
import defpackage.rr;
import defpackage.tf3;
import defpackage.wg2;
import defpackage.xg2;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;

/* loaded from: classes2.dex */
public final class DiskLruCache implements Closeable, Flushable {
    private final int appVersion;
    private boolean civilizedFileSystem;
    private final TaskQueue cleanupQueue;
    private final DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;
    private final File directory;
    private final FileSystem fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    private rr journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries = new LinkedHashMap<>(0, 0.75f, true);
    private long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;
    public static final Companion Companion = new Companion(null);
    public static final String JOURNAL_FILE = "journal";
    public static final String JOURNAL_FILE_TEMP = "journal.tmp";
    public static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    public static final String MAGIC = "libcore.io.DiskLruCache";
    public static final String VERSION_1 = "1";
    public static final long ANY_SEQUENCE_NUMBER = -1;
    public static final ii2 LEGAL_KEY_PATTERN = new ii2("[a-z0-9_-]{1,120}");
    public static final String CLEAN = "CLEAN";
    public static final String DIRTY = "DIRTY";
    public static final String REMOVE = "REMOVE";
    public static final String READ = "READ";

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public final class Editor {
        private boolean done;
        private final Entry entry;
        private final boolean[] written;

        public Editor(Entry entry) {
            boolean[] zArr;
            this.entry = entry;
            if (entry.getReadable$okhttp()) {
                zArr = null;
            } else {
                zArr = new boolean[DiskLruCache.this.getValueCount$okhttp()];
            }
            this.written = zArr;
        }

        public final void abort() throws IOException {
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                if (!this.done) {
                    if (m20.L(getEntry$okhttp().getCurrentEditor$okhttp(), this)) {
                        diskLruCache.completeEdit$okhttp(this, false);
                    }
                    this.done = true;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void commit() throws IOException {
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                if (!this.done) {
                    if (m20.L(getEntry$okhttp().getCurrentEditor$okhttp(), this)) {
                        diskLruCache.completeEdit$okhttp(this, true);
                    }
                    this.done = true;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void detach$okhttp() {
            if (m20.L(this.entry.getCurrentEditor$okhttp(), this)) {
                if (DiskLruCache.this.civilizedFileSystem) {
                    DiskLruCache.this.completeEdit$okhttp(this, false);
                } else {
                    this.entry.setZombie$okhttp(true);
                }
            }
        }

        public final Entry getEntry$okhttp() {
            return this.entry;
        }

        public final boolean[] getWritten$okhttp() {
            return this.written;
        }

        public final dw2 newSink(int i) {
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                if (!this.done) {
                    if (!m20.L(getEntry$okhttp().getCurrentEditor$okhttp(), this)) {
                        return new gq();
                    }
                    if (!getEntry$okhttp().getReadable$okhttp()) {
                        getWritten$okhttp()[i] = true;
                    }
                    try {
                        return new FaultHidingSink(diskLruCache.getFileSystem$okhttp().sink(getEntry$okhttp().getDirtyFiles$okhttp().get(i)), new DiskLruCache$Editor$newSink$1$1(diskLruCache, this));
                    } catch (FileNotFoundException unused) {
                        return new gq();
                    }
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        public final mx2 newSource(int i) {
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                if (!this.done) {
                    mx2 mx2Var = null;
                    if (!getEntry$okhttp().getReadable$okhttp() || !m20.L(getEntry$okhttp().getCurrentEditor$okhttp(), this) || getEntry$okhttp().getZombie$okhttp()) {
                        return null;
                    }
                    try {
                        mx2Var = diskLruCache.getFileSystem$okhttp().source(getEntry$okhttp().getCleanFiles$okhttp().get(i));
                    } catch (FileNotFoundException unused) {
                    }
                    return mx2Var;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class Entry {
        private Editor currentEditor;
        private final String key;
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        private boolean zombie;
        private final List<File> cleanFiles = new ArrayList();
        private final List<File> dirtyFiles = new ArrayList();

        public Entry(String str) {
            this.key = str;
            this.lengths = new long[DiskLruCache.this.getValueCount$okhttp()];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int valueCount$okhttp = DiskLruCache.this.getValueCount$okhttp();
            for (int i = 0; i < valueCount$okhttp; i++) {
                sb.append(i);
                this.cleanFiles.add(new File(DiskLruCache.this.getDirectory(), sb.toString()));
                sb.append(".tmp");
                this.dirtyFiles.add(new File(DiskLruCache.this.getDirectory(), sb.toString()));
                sb.setLength(length);
            }
        }

        private final Void invalidLengths(List<String> list) throws IOException {
            throw new IOException(m20.d1(list, "unexpected journal line: "));
        }

        private final mx2 newSource(int i) {
            final mx2 source = DiskLruCache.this.getFileSystem$okhttp().source(this.cleanFiles.get(i));
            if (DiskLruCache.this.civilizedFileSystem) {
                return source;
            }
            this.lockingSourceCount++;
            final DiskLruCache diskLruCache = DiskLruCache.this;
            return new d11(diskLruCache, this) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
                private boolean closed;
                final /* synthetic */ DiskLruCache this$0;
                final /* synthetic */ DiskLruCache.Entry this$1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(mx2.this);
                    this.this$0 = diskLruCache;
                    this.this$1 = this;
                }

                @Override // defpackage.d11, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    super.close();
                    if (!this.closed) {
                        this.closed = true;
                        DiskLruCache diskLruCache2 = this.this$0;
                        DiskLruCache.Entry entry = this.this$1;
                        synchronized (diskLruCache2) {
                            entry.setLockingSourceCount$okhttp(entry.getLockingSourceCount$okhttp() - 1);
                            if (entry.getLockingSourceCount$okhttp() == 0 && entry.getZombie$okhttp()) {
                                diskLruCache2.removeEntry$okhttp(entry);
                            }
                        }
                    }
                }
            };
        }

        public final List<File> getCleanFiles$okhttp() {
            return this.cleanFiles;
        }

        public final Editor getCurrentEditor$okhttp() {
            return this.currentEditor;
        }

        public final List<File> getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }

        public final String getKey$okhttp() {
            return this.key;
        }

        public final long[] getLengths$okhttp() {
            return this.lengths;
        }

        public final int getLockingSourceCount$okhttp() {
            return this.lockingSourceCount;
        }

        public final boolean getReadable$okhttp() {
            return this.readable;
        }

        public final long getSequenceNumber$okhttp() {
            return this.sequenceNumber;
        }

        public final boolean getZombie$okhttp() {
            return this.zombie;
        }

        public final void setCurrentEditor$okhttp(Editor editor) {
            this.currentEditor = editor;
        }

        public final void setLengths$okhttp(List<String> list) throws IOException {
            if (list.size() == DiskLruCache.this.getValueCount$okhttp()) {
                try {
                    int size = list.size();
                    int i = 0;
                    while (i < size) {
                        int i2 = i + 1;
                        this.lengths[i] = Long.parseLong(list.get(i));
                        i = i2;
                    }
                    return;
                } catch (NumberFormatException unused) {
                    invalidLengths(list);
                    throw new j11(null);
                }
            }
            invalidLengths(list);
            throw new j11(null);
        }

        public final void setLockingSourceCount$okhttp(int i) {
            this.lockingSourceCount = i;
        }

        public final void setReadable$okhttp(boolean z) {
            this.readable = z;
        }

        public final void setSequenceNumber$okhttp(long j) {
            this.sequenceNumber = j;
        }

        public final void setZombie$okhttp(boolean z) {
            this.zombie = z;
        }

        public final Snapshot snapshot$okhttp() {
            DiskLruCache diskLruCache = DiskLruCache.this;
            if (Util.assertionsEnabled && !Thread.holdsLock(diskLruCache)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + diskLruCache);
            }
            if (!this.readable) {
                return null;
            }
            if (!DiskLruCache.this.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.lengths.clone();
            try {
                int valueCount$okhttp = DiskLruCache.this.getValueCount$okhttp();
                for (int i = 0; i < valueCount$okhttp; i++) {
                    arrayList.add(newSource(i));
                }
                return new Snapshot(this.key, this.sequenceNumber, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Util.closeQuietly((mx2) it.next());
                }
                try {
                    DiskLruCache.this.removeEntry$okhttp(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void writeLengths$okhttp(rr rrVar) throws IOException {
            long[] jArr = this.lengths;
            int length = jArr.length;
            int i = 0;
            while (i < length) {
                long j = jArr[i];
                i++;
                rrVar.k(32).G(j);
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class Snapshot implements Closeable {
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final List<mx2> sources;

        /* JADX WARN: Multi-variable type inference failed */
        public Snapshot(String str, long j, List<? extends mx2> list, long[] jArr) {
            this.key = str;
            this.sequenceNumber = j;
            this.sources = list;
            this.lengths = jArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator<mx2> it = this.sources.iterator();
            while (it.hasNext()) {
                Util.closeQuietly(it.next());
            }
        }

        public final Editor edit() throws IOException {
            return DiskLruCache.this.edit(this.key, this.sequenceNumber);
        }

        public final long getLength(int i) {
            return this.lengths[i];
        }

        public final mx2 getSource(int i) {
            return this.sources.get(i);
        }

        public final String key() {
            return this.key;
        }
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [okhttp3.internal.cache.DiskLruCache$cleanupTask$1] */
    public DiskLruCache(FileSystem fileSystem, File file, int i, int i2, long j, TaskRunner taskRunner) {
        boolean z;
        this.fileSystem = fileSystem;
        this.directory = file;
        this.appVersion = i;
        this.valueCount = i2;
        this.maxSize = j;
        this.cleanupQueue = taskRunner.newQueue();
        final String d1 = m20.d1(" Cache", Util.okHttpName);
        this.cleanupTask = new Task(d1) { // from class: okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                boolean z2;
                boolean journalRebuildRequired;
                DiskLruCache diskLruCache = DiskLruCache.this;
                synchronized (diskLruCache) {
                    z2 = diskLruCache.initialized;
                    if (!z2 || diskLruCache.getClosed$okhttp()) {
                        return -1L;
                    }
                    try {
                        diskLruCache.trimToSize();
                    } catch (IOException unused) {
                        diskLruCache.mostRecentTrimFailed = true;
                    }
                    try {
                        journalRebuildRequired = diskLruCache.journalRebuildRequired();
                        if (journalRebuildRequired) {
                            diskLruCache.rebuildJournal$okhttp();
                            diskLruCache.redundantOpCount = 0;
                        }
                    } catch (IOException unused2) {
                        diskLruCache.mostRecentRebuildFailed = true;
                        diskLruCache.journalWriter = new wg2(new gq());
                    }
                    return -1L;
                }
            }
        };
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 > 0) {
                this.journalFile = new File(file, JOURNAL_FILE);
                this.journalFileTmp = new File(file, JOURNAL_FILE_TEMP);
                this.journalFileBackup = new File(file, JOURNAL_FILE_BACKUP);
                return;
            }
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    private final synchronized void checkNotClosed() {
        if (!(!this.closed)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache.edit(str, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        if (i >= 2000 && i >= this.lruEntries.size()) {
            return true;
        }
        return false;
    }

    private final rr newJournalWriter() throws FileNotFoundException {
        return new wg2(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
    }

    private final void processJournal() throws IOException {
        this.fileSystem.delete(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            int i = 0;
            if (next.getCurrentEditor$okhttp() == null) {
                int i2 = this.valueCount;
                while (i < i2) {
                    this.size += next.getLengths$okhttp()[i];
                    i++;
                }
            } else {
                next.setCurrentEditor$okhttp(null);
                int i3 = this.valueCount;
                while (i < i3) {
                    this.fileSystem.delete(next.getCleanFiles$okhttp().get(i));
                    this.fileSystem.delete(next.getDirtyFiles$okhttp().get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    private final void readJournal() throws IOException {
        boolean z;
        xg2 xg2Var = new xg2(this.fileSystem.source(this.journalFile));
        try {
            String y = xg2Var.y();
            String y2 = xg2Var.y();
            String y3 = xg2Var.y();
            String y4 = xg2Var.y();
            String y5 = xg2Var.y();
            if (m20.L(MAGIC, y) && m20.L(VERSION_1, y2) && m20.L(String.valueOf(this.appVersion), y3) && m20.L(String.valueOf(getValueCount$okhttp()), y4)) {
                int i = 0;
                if (y5.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    while (true) {
                        try {
                            readJournalLine(xg2Var.y());
                            i++;
                        } catch (EOFException unused) {
                            this.redundantOpCount = i - getLruEntries$okhttp().size();
                            if (!xg2Var.j()) {
                                rebuildJournal$okhttp();
                            } else {
                                this.journalWriter = newJournalWriter();
                            }
                            tf3.y(xg2Var, null);
                            return;
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + y + ", " + y2 + ", " + y4 + ", " + y5 + ']');
        } finally {
        }
    }

    private final void readJournalLine(String str) throws IOException {
        String substring;
        int Y0 = i23.Y0(str, ' ', 0, false, 6);
        if (Y0 != -1) {
            int i = Y0 + 1;
            int Y02 = i23.Y0(str, ' ', i, false, 4);
            if (Y02 == -1) {
                substring = str.substring(i);
                String str2 = REMOVE;
                if (Y0 == str2.length() && i23.q1(str, str2, false)) {
                    this.lruEntries.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, Y02);
            }
            Entry entry = this.lruEntries.get(substring);
            if (entry == null) {
                entry = new Entry(substring);
                this.lruEntries.put(substring, entry);
            }
            if (Y02 != -1) {
                String str3 = CLEAN;
                if (Y0 == str3.length() && i23.q1(str, str3, false)) {
                    List<String> n1 = i23.n1(str.substring(Y02 + 1), new char[]{' '});
                    entry.setReadable$okhttp(true);
                    entry.setCurrentEditor$okhttp(null);
                    entry.setLengths$okhttp(n1);
                    return;
                }
            }
            if (Y02 == -1) {
                String str4 = DIRTY;
                if (Y0 == str4.length() && i23.q1(str, str4, false)) {
                    entry.setCurrentEditor$okhttp(new Editor(entry));
                    return;
                }
            }
            if (Y02 == -1) {
                String str5 = READ;
                if (Y0 == str5.length() && i23.q1(str, str5, false)) {
                    return;
                }
            }
            throw new IOException(m20.d1(str, "unexpected journal line: "));
        }
        throw new IOException(m20.d1(str, "unexpected journal line: "));
    }

    private final boolean removeOldestEntry() {
        for (Entry entry : this.lruEntries.values()) {
            if (!entry.getZombie$okhttp()) {
                removeEntry$okhttp(entry);
                return true;
            }
        }
        return false;
    }

    private final void validateKey(String str) {
        if (LEGAL_KEY_PATTERN.a(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        Editor currentEditor$okhttp;
        if (this.initialized && !this.closed) {
            int i = 0;
            Object[] array = this.lruEntries.values().toArray(new Entry[0]);
            if (array != null) {
                Entry[] entryArr = (Entry[]) array;
                int length = entryArr.length;
                while (i < length) {
                    Entry entry = entryArr[i];
                    i++;
                    if (entry.getCurrentEditor$okhttp() != null && (currentEditor$okhttp = entry.getCurrentEditor$okhttp()) != null) {
                        currentEditor$okhttp.detach$okhttp();
                    }
                }
                trimToSize();
                this.journalWriter.close();
                this.journalWriter = null;
                this.closed = true;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        this.closed = true;
    }

    public final synchronized void completeEdit$okhttp(Editor editor, boolean z) throws IOException {
        Entry entry$okhttp = editor.getEntry$okhttp();
        if (m20.L(entry$okhttp.getCurrentEditor$okhttp(), editor)) {
            int i = 0;
            if (z && !entry$okhttp.getReadable$okhttp()) {
                int i2 = this.valueCount;
                int i3 = 0;
                while (i3 < i2) {
                    int i4 = i3 + 1;
                    if (editor.getWritten$okhttp()[i3]) {
                        if (!this.fileSystem.exists(entry$okhttp.getDirtyFiles$okhttp().get(i3))) {
                            editor.abort();
                            return;
                        }
                        i3 = i4;
                    } else {
                        editor.abort();
                        throw new IllegalStateException(m20.d1(Integer.valueOf(i3), "Newly created entry didn't create value for index "));
                    }
                }
            }
            int i5 = this.valueCount;
            while (i < i5) {
                int i6 = i + 1;
                File file = entry$okhttp.getDirtyFiles$okhttp().get(i);
                if (z && !entry$okhttp.getZombie$okhttp()) {
                    if (this.fileSystem.exists(file)) {
                        File file2 = entry$okhttp.getCleanFiles$okhttp().get(i);
                        this.fileSystem.rename(file, file2);
                        long j = entry$okhttp.getLengths$okhttp()[i];
                        long size = this.fileSystem.size(file2);
                        entry$okhttp.getLengths$okhttp()[i] = size;
                        this.size = (this.size - j) + size;
                    }
                } else {
                    this.fileSystem.delete(file);
                }
                i = i6;
            }
            entry$okhttp.setCurrentEditor$okhttp(null);
            if (entry$okhttp.getZombie$okhttp()) {
                removeEntry$okhttp(entry$okhttp);
                return;
            }
            this.redundantOpCount++;
            rr rrVar = this.journalWriter;
            if (!entry$okhttp.getReadable$okhttp() && !z) {
                getLruEntries$okhttp().remove(entry$okhttp.getKey$okhttp());
                rrVar.p(REMOVE).k(32);
                rrVar.p(entry$okhttp.getKey$okhttp());
                rrVar.k(10);
                rrVar.flush();
                if (this.size <= this.maxSize || journalRebuildRequired()) {
                    TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
                }
                return;
            }
            entry$okhttp.setReadable$okhttp(true);
            rrVar.p(CLEAN).k(32);
            rrVar.p(entry$okhttp.getKey$okhttp());
            entry$okhttp.writeLengths$okhttp(rrVar);
            rrVar.k(10);
            if (z) {
                long j2 = this.nextSequenceNumber;
                this.nextSequenceNumber = 1 + j2;
                entry$okhttp.setSequenceNumber$okhttp(j2);
            }
            rrVar.flush();
            if (this.size <= this.maxSize) {
            }
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void delete() throws IOException {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    public final Editor edit(String str) throws IOException {
        return edit$default(this, str, 0L, 2, null);
    }

    public final synchronized void evictAll() throws IOException {
        initialize();
        Object[] array = this.lruEntries.values().toArray(new Entry[0]);
        if (array != null) {
            Entry[] entryArr = (Entry[]) array;
            int length = entryArr.length;
            int i = 0;
            while (i < length) {
                Entry entry = entryArr[i];
                i++;
                removeEntry$okhttp(entry);
            }
            this.mostRecentTrimFailed = false;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (!this.initialized) {
            return;
        }
        checkNotClosed();
        trimToSize();
        this.journalWriter.flush();
    }

    public final synchronized Snapshot get(String str) throws IOException {
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (entry == null) {
            return null;
        }
        Snapshot snapshot$okhttp = entry.snapshot$okhttp();
        if (snapshot$okhttp == null) {
            return null;
        }
        this.redundantOpCount++;
        this.journalWriter.p(READ).k(32).p(str).k(10);
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return snapshot$okhttp;
    }

    public final boolean getClosed$okhttp() {
        return this.closed;
    }

    public final File getDirectory() {
        return this.directory;
    }

    public final FileSystem getFileSystem$okhttp() {
        return this.fileSystem;
    }

    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
        return this.lruEntries;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    public final int getValueCount$okhttp() {
        return this.valueCount;
    }

    public final synchronized void initialize() throws IOException {
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        if (this.initialized) {
            return;
        }
        if (this.fileSystem.exists(this.journalFileBackup)) {
            if (this.fileSystem.exists(this.journalFile)) {
                this.fileSystem.delete(this.journalFileBackup);
            } else {
                this.fileSystem.rename(this.journalFileBackup, this.journalFile);
            }
        }
        this.civilizedFileSystem = Util.isCivilized(this.fileSystem, this.journalFileBackup);
        if (this.fileSystem.exists(this.journalFile)) {
            try {
                readJournal();
                processJournal();
                this.initialized = true;
                return;
            } catch (IOException e) {
                Platform.Companion.get().log("DiskLruCache " + this.directory + " is corrupt: " + ((Object) e.getMessage()) + ", removing", 5, e);
                try {
                    delete();
                    this.closed = false;
                } catch (Throwable th) {
                    this.closed = false;
                    throw th;
                }
            }
        }
        rebuildJournal$okhttp();
        this.initialized = true;
    }

    public final synchronized boolean isClosed() {
        return this.closed;
    }

    public final synchronized void rebuildJournal$okhttp() throws IOException {
        rr rrVar = this.journalWriter;
        if (rrVar != null) {
            rrVar.close();
        }
        wg2 wg2Var = new wg2(this.fileSystem.sink(this.journalFileTmp));
        try {
            wg2Var.p(MAGIC);
            wg2Var.k(10);
            wg2Var.p(VERSION_1);
            wg2Var.k(10);
            wg2Var.G(this.appVersion);
            wg2Var.k(10);
            wg2Var.G(getValueCount$okhttp());
            wg2Var.k(10);
            wg2Var.k(10);
            for (Entry entry : getLruEntries$okhttp().values()) {
                if (entry.getCurrentEditor$okhttp() != null) {
                    wg2Var.p(DIRTY);
                    wg2Var.k(32);
                    wg2Var.p(entry.getKey$okhttp());
                    wg2Var.k(10);
                } else {
                    wg2Var.p(CLEAN);
                    wg2Var.k(32);
                    wg2Var.p(entry.getKey$okhttp());
                    entry.writeLengths$okhttp(wg2Var);
                    wg2Var.k(10);
                }
            }
            tf3.y(wg2Var, null);
            if (this.fileSystem.exists(this.journalFile)) {
                this.fileSystem.rename(this.journalFile, this.journalFileBackup);
            }
            this.fileSystem.rename(this.journalFileTmp, this.journalFile);
            this.fileSystem.delete(this.journalFileBackup);
            this.journalWriter = newJournalWriter();
            this.hasJournalErrors = false;
            this.mostRecentRebuildFailed = false;
        } finally {
        }
    }

    public final synchronized boolean remove(String str) throws IOException {
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (entry == null) {
            return false;
        }
        boolean removeEntry$okhttp = removeEntry$okhttp(entry);
        if (removeEntry$okhttp && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        return removeEntry$okhttp;
    }

    public final boolean removeEntry$okhttp(Entry entry) throws IOException {
        rr rrVar;
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount$okhttp() > 0 && (rrVar = this.journalWriter) != null) {
                rrVar.p(DIRTY);
                rrVar.k(32);
                rrVar.p(entry.getKey$okhttp());
                rrVar.k(10);
                rrVar.flush();
            }
            if (entry.getLockingSourceCount$okhttp() > 0 || entry.getCurrentEditor$okhttp() != null) {
                entry.setZombie$okhttp(true);
                return true;
            }
        }
        Editor currentEditor$okhttp = entry.getCurrentEditor$okhttp();
        if (currentEditor$okhttp != null) {
            currentEditor$okhttp.detach$okhttp();
        }
        int i = this.valueCount;
        for (int i2 = 0; i2 < i; i2++) {
            this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i2));
            this.size -= entry.getLengths$okhttp()[i2];
            entry.getLengths$okhttp()[i2] = 0;
        }
        this.redundantOpCount++;
        rr rrVar2 = this.journalWriter;
        if (rrVar2 != null) {
            rrVar2.p(REMOVE);
            rrVar2.k(32);
            rrVar2.p(entry.getKey$okhttp());
            rrVar2.k(10);
        }
        this.lruEntries.remove(entry.getKey$okhttp());
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return true;
    }

    public final void setClosed$okhttp(boolean z) {
        this.closed = z;
    }

    public final synchronized void setMaxSize(long j) {
        this.maxSize = j;
        if (this.initialized) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    public final synchronized long size() throws IOException {
        initialize();
        return this.size;
    }

    public final synchronized Iterator<Snapshot> snapshots() throws IOException {
        initialize();
        return new DiskLruCache$snapshots$1(this);
    }

    public final void trimToSize() throws IOException {
        while (this.size > this.maxSize) {
            if (!removeOldestEntry()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    public final synchronized Editor edit(String str, long j) throws IOException {
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (j != ANY_SEQUENCE_NUMBER && (entry == null || entry.getSequenceNumber$okhttp() != j)) {
            return null;
        }
        if ((entry == null ? null : entry.getCurrentEditor$okhttp()) != null) {
            return null;
        }
        if (entry != null && entry.getLockingSourceCount$okhttp() != 0) {
            return null;
        }
        if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
            rr rrVar = this.journalWriter;
            rrVar.p(DIRTY).k(32).p(str).k(10);
            rrVar.flush();
            if (this.hasJournalErrors) {
                return null;
            }
            if (entry == null) {
                entry = new Entry(str);
                this.lruEntries.put(str, entry);
            }
            Editor editor = new Editor(entry);
            entry.setCurrentEditor$okhttp(editor);
            return editor;
        }
        TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        return null;
    }
}
