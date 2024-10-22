package defpackage;

/* loaded from: classes.dex */
public final class jo2 implements rc3 {

    /* renamed from: a, reason: collision with root package name */
    public final io2 f2802a;

    /* renamed from: b, reason: collision with root package name */
    public final r42 f2803b = new r42(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public jo2(io2 io2Var) {
        this.f2802a = io2Var;
    }

    @Override // defpackage.rc3
    public final void a(int i, r42 r42Var) {
        boolean z;
        int i2;
        boolean z2;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = r42Var.f4099b + r42Var.v();
        } else {
            i2 = -1;
        }
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            r42Var.G(i2);
            this.d = 0;
        }
        while (true) {
            int i3 = r42Var.c;
            int i4 = r42Var.f4099b;
            if (i3 - i4 > 0) {
                int i5 = this.d;
                r42 r42Var2 = this.f2803b;
                if (i5 < 3) {
                    if (i5 == 0) {
                        int v = r42Var.v();
                        r42Var.G(r42Var.f4099b - 1);
                        if (v == 255) {
                            this.f = true;
                            return;
                        }
                    }
                    int min = Math.min(r42Var.c - r42Var.f4099b, 3 - this.d);
                    r42Var.d(this.d, r42Var2.f4098a, min);
                    int i6 = this.d + min;
                    this.d = i6;
                    if (i6 == 3) {
                        r42Var2.G(0);
                        r42Var2.F(3);
                        r42Var2.H(1);
                        int v2 = r42Var2.v();
                        int v3 = r42Var2.v();
                        if ((v2 & 128) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.e = z2;
                        int i7 = (((v2 & 15) << 8) | v3) + 3;
                        this.c = i7;
                        byte[] bArr = r42Var2.f4098a;
                        if (bArr.length < i7) {
                            r42Var2.a(Math.min(4098, Math.max(i7, bArr.length * 2)));
                        }
                    }
                } else {
                    int min2 = Math.min(i3 - i4, this.c - i5);
                    r42Var.d(this.d, r42Var2.f4098a, min2);
                    int i8 = this.d + min2;
                    this.d = i8;
                    int i9 = this.c;
                    if (i8 != i9) {
                        continue;
                    } else {
                        if (this.e) {
                            byte[] bArr2 = r42Var2.f4098a;
                            int i10 = wi3.f5017a;
                            int i11 = -1;
                            for (int i12 = 0; i12 < i9; i12++) {
                                i11 = wi3.l[((i11 >>> 24) ^ (bArr2[i12] & 255)) & 255] ^ (i11 << 8);
                            }
                            if (i11 != 0) {
                                this.f = true;
                                return;
                            }
                            r42Var2.F(this.c - 4);
                        } else {
                            r42Var2.F(i9);
                        }
                        r42Var2.G(0);
                        this.f2802a.a(r42Var2);
                        this.d = 0;
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.rc3
    public final void b(f93 f93Var, fv0 fv0Var, qc3 qc3Var) {
        this.f2802a.b(f93Var, fv0Var, qc3Var);
        this.f = true;
    }

    @Override // defpackage.rc3
    public final void c() {
        this.f = true;
    }
}
