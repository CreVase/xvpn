package defpackage;

/* loaded from: classes.dex */
public final class d52 implements rc3 {

    /* renamed from: a, reason: collision with root package name */
    public final qp0 f1734a;

    /* renamed from: b, reason: collision with root package name */
    public final nn3 f1735b = new nn3(new byte[10], 2, (Object) null);
    public int c = 0;
    public int d;
    public f93 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public d52(qp0 qp0Var) {
        this.f1734a = qp0Var;
    }

    @Override // defpackage.rc3
    public final void a(int i, r42 r42Var) {
        boolean z;
        int i2;
        int i3;
        cp3.o(this.e);
        int i4 = i & 1;
        qp0 qp0Var = this.f1734a;
        int i5 = -1;
        int i6 = 3;
        int i7 = 2;
        if (i4 != 0) {
            int i8 = this.c;
            if (i8 != 0 && i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        if (this.j != -1) {
                            sn1.f();
                        }
                        qp0Var.d();
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    sn1.f();
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i9 = i;
        while (true) {
            int i10 = r42Var.c;
            int i11 = r42Var.f4099b;
            int i12 = i10 - i11;
            if (i12 > 0) {
                int i13 = this.c;
                if (i13 != 0) {
                    nn3 nn3Var = this.f1735b;
                    if (i13 != 1) {
                        if (i13 != i7) {
                            if (i13 == i6) {
                                int i14 = this.j;
                                if (i14 == i5) {
                                    i3 = 0;
                                } else {
                                    i3 = i12 - i14;
                                }
                                if (i3 > 0) {
                                    i12 -= i3;
                                    r42Var.F(i11 + i12);
                                }
                                qp0Var.a(r42Var);
                                int i15 = this.j;
                                if (i15 != i5) {
                                    int i16 = i15 - i12;
                                    this.j = i16;
                                    if (i16 == 0) {
                                        qp0Var.d();
                                        this.c = 1;
                                        this.d = 0;
                                    }
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else if (d(Math.min(10, this.i), r42Var, nn3Var.d) && d(this.i, r42Var, null)) {
                            nn3Var.o(0);
                            this.l = -9223372036854775807L;
                            int i17 = 4;
                            if (this.f) {
                                nn3Var.r(4);
                                nn3Var.r(1);
                                nn3Var.r(1);
                                long i18 = (nn3Var.i(15) << 15) | (nn3Var.i(i6) << 30) | nn3Var.i(15);
                                nn3Var.r(1);
                                if (!this.h && this.g) {
                                    nn3Var.r(4);
                                    nn3Var.r(1);
                                    nn3Var.r(1);
                                    nn3Var.r(1);
                                    this.e.b((nn3Var.i(15) << 15) | (nn3Var.i(i6) << 30) | nn3Var.i(15));
                                    this.h = true;
                                }
                                this.l = this.e.b(i18);
                            }
                            if (!this.k) {
                                i17 = 0;
                            }
                            i9 |= i17;
                            qp0Var.e(i9, this.l);
                            this.c = 3;
                            this.d = 0;
                        }
                    } else if (d(9, r42Var, nn3Var.d)) {
                        nn3Var.o(0);
                        if (nn3Var.i(24) != 1) {
                            sn1.f();
                            this.j = -1;
                            z = false;
                        } else {
                            nn3Var.r(8);
                            int i19 = nn3Var.i(16);
                            nn3Var.r(5);
                            this.k = nn3Var.h();
                            nn3Var.r(2);
                            this.f = nn3Var.h();
                            this.g = nn3Var.h();
                            nn3Var.r(6);
                            int i20 = nn3Var.i(8);
                            this.i = i20;
                            if (i19 == 0) {
                                this.j = -1;
                            } else {
                                int i21 = ((i19 + 6) - 9) - i20;
                                this.j = i21;
                                if (i21 < 0) {
                                    sn1.f();
                                    this.j = -1;
                                }
                            }
                            z = true;
                        }
                        if (z) {
                            i2 = 2;
                        } else {
                            i2 = 0;
                        }
                        this.c = i2;
                        this.d = 0;
                    }
                } else {
                    r42Var.H(i12);
                }
                i5 = -1;
                i6 = 3;
                i7 = 2;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.rc3
    public final void b(f93 f93Var, fv0 fv0Var, qc3 qc3Var) {
        this.e = f93Var;
        this.f1734a.f(fv0Var, qc3Var);
    }

    @Override // defpackage.rc3
    public final void c() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.f1734a.c();
    }

    public final boolean d(int i, r42 r42Var, byte[] bArr) {
        int min = Math.min(r42Var.c - r42Var.f4099b, i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            r42Var.H(min);
        } else {
            r42Var.d(this.d, bArr, min);
        }
        int i2 = this.d + min;
        this.d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }
}
