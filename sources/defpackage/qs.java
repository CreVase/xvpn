package defpackage;

/* loaded from: classes.dex */
public final class qs extends xs {
    public final int e;
    public final int f;

    public qs(byte[] bArr, int i, int i2) {
        super(bArr);
        vs.c(i, i + i2, bArr.length);
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.xs, defpackage.vs
    public final byte b(int i) {
        int i2 = this.f;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(hx2.m("Index < 0: ", i));
            }
            throw new ArrayIndexOutOfBoundsException(hx2.n("Index > length: ", i, ", ", i2));
        }
        return this.d[this.e + i];
    }

    @Override // defpackage.xs, defpackage.vs
    public final byte g(int i) {
        return this.d[this.e + i];
    }

    @Override // defpackage.xs
    public final int j() {
        return this.e;
    }

    @Override // defpackage.xs, defpackage.vs
    public final int size() {
        return this.f;
    }
}
