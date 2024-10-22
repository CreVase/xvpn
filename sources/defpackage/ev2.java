package defpackage;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class ev2 extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final FileOutputStream f2001a;

    public ev2(FileOutputStream fileOutputStream) {
        this.f2001a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f2001a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f2001a.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f2001a.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f2001a.write(bArr, i, i2);
    }
}
