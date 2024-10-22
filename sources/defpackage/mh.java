package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class mh extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final FileOutputStream f3294a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3295b = false;

    public mh(File file) {
        this.f3294a = new FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileOutputStream fileOutputStream = this.f3294a;
        if (this.f3295b) {
            return;
        }
        this.f3295b = true;
        flush();
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException e) {
            sn1.g("Failed to sync file descriptor:", e);
        }
        fileOutputStream.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f3294a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f3294a.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f3294a.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f3294a.write(bArr, i, i2);
    }
}
