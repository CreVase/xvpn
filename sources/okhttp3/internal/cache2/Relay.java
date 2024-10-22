package okhttp3.internal.cache2;

import defpackage.at;
import defpackage.d93;
import defpackage.lr;
import defpackage.m20;
import defpackage.mx2;
import defpackage.ng0;
import defpackage.t9;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import okhttp3.internal.Util;

/* loaded from: classes2.dex */
public final class Relay {
    public static final Companion Companion = new Companion(null);
    private static final long FILE_HEADER_SIZE = 32;
    public static final at PREFIX_CLEAN;
    public static final at PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final lr buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final at metadata;
    private int sourceCount;
    private mx2 upstream;
    private final lr upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        public final Relay edit(File file, mx2 mx2Var, at atVar, long j) throws IOException {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, mx2Var, 0L, atVar, j, null);
            randomAccessFile.setLength(0L);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        public final Relay read(File file) throws IOException {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileOperator fileOperator = new FileOperator(randomAccessFile.getChannel());
            lr lrVar = new lr();
            fileOperator.read(0L, lrVar, Relay.FILE_HEADER_SIZE);
            if (m20.L(lrVar.e(r2.c()), Relay.PREFIX_CLEAN)) {
                long readLong = lrVar.readLong();
                long readLong2 = lrVar.readLong();
                lr lrVar2 = new lr();
                fileOperator.read(readLong + Relay.FILE_HEADER_SIZE, lrVar2, readLong2);
                return new Relay(randomAccessFile, null, readLong, lrVar2.u(), 0L, null);
            }
            throw new IOException("unreadable cache file");
        }
    }

    /* loaded from: classes2.dex */
    public final class RelaySource implements mx2 {
        private FileOperator fileOperator;
        private long sourcePos;
        private final d93 timeout = new d93();

        public RelaySource() {
            this.fileOperator = new FileOperator(Relay.this.getFile().getChannel());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.fileOperator == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            Relay relay = Relay.this;
            synchronized (relay) {
                relay.setSourceCount(relay.getSourceCount() - 1);
                if (relay.getSourceCount() == 0) {
                    RandomAccessFile file = relay.getFile();
                    relay.setFile(null);
                    randomAccessFile = file;
                }
            }
            if (randomAccessFile != null) {
                Util.closeQuietly(randomAccessFile);
            }
        }

        @Override // defpackage.mx2
        public long read(lr lrVar, long j) throws IOException {
            boolean z;
            char c = 1;
            if (this.fileOperator != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Relay relay = Relay.this;
                synchronized (relay) {
                    while (true) {
                        if (this.sourcePos != relay.getUpstreamPos()) {
                            long upstreamPos = relay.getUpstreamPos() - relay.getBuffer().f3176b;
                            if (this.sourcePos < upstreamPos) {
                                c = 2;
                            } else {
                                long min = Math.min(j, relay.getUpstreamPos() - this.sourcePos);
                                relay.getBuffer().w(this.sourcePos - upstreamPos, lrVar, min);
                                this.sourcePos += min;
                                return min;
                            }
                        } else {
                            if (relay.getComplete()) {
                                return -1L;
                            }
                            if (relay.getUpstreamReader() != null) {
                                this.timeout.waitUntilNotified(relay);
                            } else {
                                relay.setUpstreamReader(Thread.currentThread());
                                break;
                            }
                        }
                    }
                    if (c == 2) {
                        long min2 = Math.min(j, Relay.this.getUpstreamPos() - this.sourcePos);
                        this.fileOperator.read(this.sourcePos + Relay.FILE_HEADER_SIZE, lrVar, min2);
                        this.sourcePos += min2;
                        return min2;
                    }
                    try {
                        long read = Relay.this.getUpstream().read(Relay.this.getUpstreamBuffer(), Relay.this.getBufferMaxSize());
                        if (read == -1) {
                            Relay relay2 = Relay.this;
                            relay2.commit(relay2.getUpstreamPos());
                            Relay relay3 = Relay.this;
                            synchronized (relay3) {
                                relay3.setUpstreamReader(null);
                                relay3.notifyAll();
                            }
                            return -1L;
                        }
                        long min3 = Math.min(read, j);
                        Relay.this.getUpstreamBuffer().w(0L, lrVar, min3);
                        this.sourcePos += min3;
                        this.fileOperator.write(Relay.this.getUpstreamPos() + Relay.FILE_HEADER_SIZE, Relay.this.getUpstreamBuffer().clone(), read);
                        Relay relay4 = Relay.this;
                        synchronized (relay4) {
                            relay4.getBuffer().write(relay4.getUpstreamBuffer(), read);
                            if (relay4.getBuffer().f3176b > relay4.getBufferMaxSize()) {
                                relay4.getBuffer().skip(relay4.getBuffer().f3176b - relay4.getBufferMaxSize());
                            }
                            relay4.setUpstreamPos(relay4.getUpstreamPos() + read);
                        }
                        Relay relay5 = Relay.this;
                        synchronized (relay5) {
                            relay5.setUpstreamReader(null);
                            relay5.notifyAll();
                        }
                        return min3;
                    } catch (Throwable th) {
                        Relay relay6 = Relay.this;
                        synchronized (relay6) {
                            relay6.setUpstreamReader(null);
                            relay6.notifyAll();
                            throw th;
                        }
                    }
                }
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        @Override // defpackage.mx2
        public d93 timeout() {
            return this.timeout;
        }
    }

    static {
        at atVar = new at(t9.l("OkHttp cache v1\n"));
        atVar.c = "OkHttp cache v1\n";
        PREFIX_CLEAN = atVar;
        at atVar2 = new at(t9.l("OkHttp DIRTY :(\n"));
        atVar2.c = "OkHttp DIRTY :(\n";
        PREFIX_DIRTY = atVar2;
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, mx2 mx2Var, long j, at atVar, long j2, ng0 ng0Var) {
        this(randomAccessFile, mx2Var, j, atVar, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeHeader(at atVar, long j, long j2) throws IOException {
        boolean z;
        lr lrVar = new lr();
        atVar.k(lrVar, atVar.c());
        lrVar.Z(j);
        lrVar.Z(j2);
        if (lrVar.f3176b == FILE_HEADER_SIZE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            new FileOperator(this.file.getChannel()).write(0L, lrVar, FILE_HEADER_SIZE);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private final void writeMetadata(long j) throws IOException {
        lr lrVar = new lr();
        lrVar.U(this.metadata);
        new FileOperator(this.file.getChannel()).write(FILE_HEADER_SIZE + j, lrVar, this.metadata.c());
    }

    public final void commit(long j) throws IOException {
        writeMetadata(j);
        this.file.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j, this.metadata.c());
        this.file.getChannel().force(false);
        synchronized (this) {
            setComplete(true);
        }
        mx2 mx2Var = this.upstream;
        if (mx2Var != null) {
            Util.closeQuietly(mx2Var);
        }
        this.upstream = null;
    }

    public final lr getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    public final mx2 getUpstream() {
        return this.upstream;
    }

    public final lr getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        if (this.file == null) {
            return true;
        }
        return false;
    }

    public final at metadata() {
        return this.metadata;
    }

    public final mx2 newSource() {
        synchronized (this) {
            if (getFile() == null) {
                return null;
            }
            setSourceCount(getSourceCount() + 1);
            return new RelaySource();
        }
    }

    public final void setComplete(boolean z) {
        this.complete = z;
    }

    public final void setFile(RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i) {
        this.sourceCount = i;
    }

    public final void setUpstream(mx2 mx2Var) {
        this.upstream = mx2Var;
    }

    public final void setUpstreamPos(long j) {
        this.upstreamPos = j;
    }

    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }

    private Relay(RandomAccessFile randomAccessFile, mx2 mx2Var, long j, at atVar, long j2) {
        this.file = randomAccessFile;
        this.upstream = mx2Var;
        this.upstreamPos = j;
        this.metadata = atVar;
        this.bufferMaxSize = j2;
        this.upstreamBuffer = new lr();
        this.complete = mx2Var == null;
        this.buffer = new lr();
    }
}
