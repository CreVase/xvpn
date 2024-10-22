package defpackage;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class be0 extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final zd0 f452a;

    /* renamed from: b, reason: collision with root package name */
    public final ce0 f453b;
    public boolean d = false;
    public boolean e = false;
    public final byte[] c = new byte[1];

    public be0(j13 j13Var, ce0 ce0Var) {
        this.f452a = j13Var;
        this.f453b = ce0Var;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.e) {
            this.f452a.close();
            this.e = true;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.c;
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        cp3.m(!this.e);
        boolean z = this.d;
        zd0 zd0Var = this.f452a;
        if (!z) {
            zd0Var.c(this.f453b);
            this.d = true;
        }
        int read = zd0Var.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
