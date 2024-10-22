package defpackage;

/* loaded from: classes.dex */
public final class f2 implements qp0 {

    /* renamed from: a, reason: collision with root package name */
    public final nn3 f2031a;

    /* renamed from: b, reason: collision with root package name */
    public final r42 f2032b;
    public final String c;
    public String d;
    public xa3 e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public y01 k;
    public int l;
    public long m;

    public f2(String str) {
        nn3 nn3Var = new nn3(new byte[16], 2, (Object) null);
        this.f2031a = nn3Var;
        this.f2032b = new r42(nn3Var.d);
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = false;
        this.m = -9223372036854775807L;
        this.c = str;
    }

    @Override // defpackage.qp0
    public final void a(r42 r42Var) {
        int i;
        boolean z;
        boolean z2;
        int v;
        boolean z3;
        boolean z4;
        cp3.o(this.e);
        while (true) {
            int i2 = r42Var.c - r42Var.f4099b;
            if (i2 > 0) {
                int i3 = this.f;
                boolean z5 = true;
                r42 r42Var2 = this.f2032b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            int min = Math.min(i2, this.l - this.g);
                            this.e.b(min, r42Var);
                            int i4 = this.g + min;
                            this.g = i4;
                            int i5 = this.l;
                            if (i4 == i5) {
                                long j = this.m;
                                if (j != -9223372036854775807L) {
                                    this.e.a(j, 1, i5, 0, null);
                                    this.m += this.j;
                                }
                                this.f = 0;
                            }
                        }
                    } else {
                        byte[] bArr = r42Var2.f4098a;
                        int min2 = Math.min(i2, 16 - this.g);
                        r42Var.d(this.g, bArr, min2);
                        int i6 = this.g + min2;
                        this.g = i6;
                        if (i6 != 16) {
                            z5 = false;
                        }
                        if (z5) {
                            nn3 nn3Var = this.f2031a;
                            nn3Var.o(0);
                            yz2 Y = zf3.Y(nn3Var);
                            y01 y01Var = this.k;
                            if (y01Var == null || Y.c != y01Var.y || Y.f5405b != y01Var.z || !"audio/ac4".equals(y01Var.l)) {
                                x01 x01Var = new x01();
                                x01Var.f5098a = this.d;
                                x01Var.k = "audio/ac4";
                                x01Var.x = Y.c;
                                x01Var.y = Y.f5405b;
                                x01Var.c = this.c;
                                y01 y01Var2 = new y01(x01Var);
                                this.k = y01Var2;
                                this.e.e(y01Var2);
                            }
                            this.l = Y.d;
                            this.j = (Y.e * 1000000) / this.k.z;
                            r42Var2.G(0);
                            this.e.b(16, r42Var2);
                            this.f = 2;
                        }
                    }
                } else {
                    while (true) {
                        i = 64;
                        if (r42Var.c - r42Var.f4099b > 0) {
                            if (!this.h) {
                                if (r42Var.v() == 172) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                this.h = z2;
                            } else {
                                v = r42Var.v();
                                if (v == 172) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                this.h = z3;
                                if (v == 64 || v == 65) {
                                    break;
                                }
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    if (v == 65) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.i = z4;
                    z = true;
                    if (z) {
                        this.f = 1;
                        byte[] bArr2 = r42Var2.f4098a;
                        bArr2[0] = -84;
                        if (this.i) {
                            i = 65;
                        }
                        bArr2[1] = (byte) i;
                        this.g = 2;
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.qp0
    public final void c() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = false;
        this.m = -9223372036854775807L;
    }

    @Override // defpackage.qp0
    public final void d() {
    }

    @Override // defpackage.qp0
    public final void e(int i, long j) {
        if (j != -9223372036854775807L) {
            this.m = j;
        }
    }

    @Override // defpackage.qp0
    public final void f(fv0 fv0Var, qc3 qc3Var) {
        qc3Var.a();
        qc3Var.b();
        this.d = qc3Var.e;
        qc3Var.b();
        this.e = fv0Var.l(qc3Var.d, 1);
    }
}
