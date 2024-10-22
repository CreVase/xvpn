package okhttp3.internal.io;

import defpackage.d93;
import defpackage.dw2;
import defpackage.e22;
import defpackage.m20;
import defpackage.mx2;
import defpackage.t9;
import defpackage.vg;
import defpackage.wg;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public interface FileSystem {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* loaded from: classes2.dex */
        public static final class SystemFileSystem implements FileSystem {
            @Override // okhttp3.internal.io.FileSystem
            public dw2 appendingSink(File file) throws FileNotFoundException {
                try {
                    Logger logger = e22.f1877a;
                    return new vg(new FileOutputStream(file, true), new d93());
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    Logger logger2 = e22.f1877a;
                    return new vg(new FileOutputStream(file, true), new d93());
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public void delete(File file) throws IOException {
                if (!file.delete() && file.exists()) {
                    throw new IOException(m20.d1(file, "failed to delete "));
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public void deleteContents(File file) throws IOException {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    int length = listFiles.length;
                    int i = 0;
                    while (i < length) {
                        File file2 = listFiles[i];
                        i++;
                        if (file2.isDirectory()) {
                            deleteContents(file2);
                        }
                        if (!file2.delete()) {
                            throw new IOException(m20.d1(file2, "failed to delete "));
                        }
                    }
                    return;
                }
                throw new IOException(m20.d1(file, "not a readable directory: "));
            }

            @Override // okhttp3.internal.io.FileSystem
            public boolean exists(File file) {
                return file.exists();
            }

            @Override // okhttp3.internal.io.FileSystem
            public void rename(File file, File file2) throws IOException {
                delete(file2);
                if (file.renameTo(file2)) {
                    return;
                }
                throw new IOException("failed to rename " + file + " to " + file2);
            }

            @Override // okhttp3.internal.io.FileSystem
            public dw2 sink(File file) throws FileNotFoundException {
                try {
                    return t9.y0(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return t9.y0(file);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public long size(File file) {
                return file.length();
            }

            @Override // okhttp3.internal.io.FileSystem
            public mx2 source(File file) throws FileNotFoundException {
                Logger logger = e22.f1877a;
                return new wg(new FileInputStream(file), d93.NONE);
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private Companion() {
        }
    }

    dw2 appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File file) throws IOException;

    boolean exists(File file);

    void rename(File file, File file2) throws IOException;

    dw2 sink(File file) throws FileNotFoundException;

    long size(File file);

    mx2 source(File file) throws FileNotFoundException;
}
