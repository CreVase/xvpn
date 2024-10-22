package defpackage;

/* loaded from: classes2.dex */
public final class so2 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4386a;

    /* renamed from: b, reason: collision with root package name */
    public int f4387b;
    public int c;
    public boolean d;
    public final boolean e;
    public so2 f;
    public so2 g;

    public so2() {
        this.f4386a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final so2 a() {
        so2 so2Var;
        so2 so2Var2 = this.f;
        if (so2Var2 != this) {
            so2Var = so2Var2;
        } else {
            so2Var = null;
        }
        so2 so2Var3 = this.g;
        so2Var3.f = so2Var2;
        this.f.g = so2Var3;
        this.f = null;
        this.g = null;
        return so2Var;
    }

    public final void b(so2 so2Var) {
        so2Var.g = this;
        so2Var.f = this.f;
        this.f.g = so2Var;
        this.f = so2Var;
    }

    public final so2 c() {
        this.d = true;
        return new so2(this.f4386a, this.f4387b, this.c, true, false);
    }

    public final void d(so2 so2Var, int i) {
        if (so2Var.e) {
            int i2 = so2Var.c;
            int i3 = i2 + i;
            byte[] bArr = so2Var.f4386a;
            if (i3 > 8192) {
                if (!so2Var.d) {
                    int i4 = so2Var.f4387b;
                    if (i3 - i4 <= 8192) {
                        System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
                        so2Var.c -= so2Var.f4387b;
                        so2Var.f4387b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            int i5 = so2Var.c;
            int i6 = this.f4387b;
            System.arraycopy(this.f4386a, i6, bArr, i5, (i6 + i) - i6);
            so2Var.c += i;
            this.f4387b += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public so2(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f4386a = bArr;
        this.f4387b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }
}
