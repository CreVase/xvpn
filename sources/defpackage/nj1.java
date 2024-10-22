package defpackage;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class nj1 extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public long f3470a = 0;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f3470a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f3470a += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
            this.f3470a += i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
