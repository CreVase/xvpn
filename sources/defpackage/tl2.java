package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.protobuf.v;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

/* loaded from: classes.dex */
public final class tl2 implements u33 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4528a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4529b;
    public final File c;
    public final int d;
    public final u33 e;
    public fe0 f;
    public boolean g;

    public tl2(Context context, String str, File file, int i, u33 u33Var) {
        this.f4528a = context;
        this.f4529b = str;
        this.c = file;
        this.d = i;
        this.e = u33Var;
    }

    public final void a(File file) {
        ReadableByteChannel channel;
        Context context = this.f4528a;
        String str = this.f4529b;
        if (str != null) {
            channel = Channels.newChannel(context.getAssets().open(str));
        } else {
            File file2 = this.c;
            if (file2 != null) {
                channel = new FileInputStream(file2).getChannel();
            } else {
                throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
            }
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", context.getCacheDir());
        createTempFile.deleteOnExit();
        FileChannel channel2 = new FileOutputStream(createTempFile).getChannel();
        try {
            if (Build.VERSION.SDK_INT > 23) {
                channel2.transferFrom(channel, 0L, Long.MAX_VALUE);
            } else {
                InputStream newInputStream = Channels.newInputStream(channel);
                OutputStream newOutputStream = Channels.newOutputStream(channel2);
                byte[] bArr = new byte[v.DEFAULT_BUFFER_SIZE];
                while (true) {
                    int read = newInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    } else {
                        newOutputStream.write(bArr, 0, read);
                    }
                }
            }
            channel2.force(false);
            channel.close();
            channel2.close();
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                throw new IOException("Failed to create directories for " + file.getAbsolutePath());
            }
            if (createTempFile.renameTo(file)) {
                return;
            }
            throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
        } catch (Throwable th) {
            channel.close();
            channel2.close();
            throw th;
        }
    }

    public final void c() {
        boolean z;
        String databaseName = getDatabaseName();
        Context context = this.f4528a;
        File databasePath = context.getDatabasePath(databaseName);
        if (this.f != null) {
            z = false;
        } else {
            z = true;
        }
        n90 n90Var = new n90(databaseName, context.getFilesDir(), z);
        try {
            n90Var.f3416b.lock();
            if (n90Var.c) {
                try {
                    FileChannel channel = new FileOutputStream(n90Var.f3415a).getChannel();
                    n90Var.d = channel;
                    channel.lock();
                } catch (IOException e) {
                    throw new IllegalStateException("Unable to grab copy lock.", e);
                }
            }
            if (!databasePath.exists()) {
                try {
                    a(databasePath);
                } catch (IOException e2) {
                    throw new RuntimeException("Unable to copy database file.", e2);
                }
            } else {
                if (this.f == null) {
                    return;
                }
                try {
                    int c0 = ya0.c0(databasePath);
                    int i = this.d;
                    if (c0 == i) {
                        return;
                    }
                    if (this.f.a(c0, i)) {
                        return;
                    }
                    if (context.deleteDatabase(databaseName)) {
                        try {
                            a(databasePath);
                        } catch (IOException unused) {
                        }
                    }
                } catch (IOException unused2) {
                }
            }
        } finally {
            n90Var.a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.e.close();
        this.g = false;
    }

    @Override // defpackage.u33
    public final String getDatabaseName() {
        return this.e.getDatabaseName();
    }

    @Override // defpackage.u33
    public final synchronized r33 q() {
        if (!this.g) {
            c();
            this.g = true;
        }
        return this.e.q();
    }

    @Override // defpackage.u33
    public final void setWriteAheadLoggingEnabled(boolean z) {
        this.e.setWriteAheadLoggingEnabled(z);
    }
}
