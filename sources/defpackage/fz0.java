package defpackage;

/* loaded from: classes.dex */
public final class fz0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2178a;
    public z60 d;
    public z60 e;
    public z60 f;
    public z60 g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int q;
    public final /* synthetic */ hz0 r;

    /* renamed from: b, reason: collision with root package name */
    public r70 f2179b = null;
    public int c = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;

    public fz0(hz0 hz0Var, int i, z60 z60Var, z60 z60Var2, z60 z60Var3, z60 z60Var4, int i2) {
        this.r = hz0Var;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.q = 0;
        this.f2178a = i;
        this.d = z60Var;
        this.e = z60Var2;
        this.f = z60Var3;
        this.g = z60Var4;
        this.h = hz0Var.w0;
        this.i = hz0Var.s0;
        this.j = hz0Var.x0;
        this.k = hz0Var.t0;
        this.q = i2;
    }

    public final void a(r70 r70Var) {
        int i = this.f2178a;
        int i2 = 0;
        hz0 hz0Var = this.r;
        if (i == 0) {
            int T = hz0Var.T(this.q, r70Var);
            if (r70Var.p0[0] == 3) {
                this.p++;
                T = 0;
            }
            int i3 = hz0Var.P0;
            if (r70Var.g0 != 8) {
                i2 = i3;
            }
            this.l = T + i2 + this.l;
            int S = hz0Var.S(this.q, r70Var);
            if (this.f2179b == null || this.c < S) {
                this.f2179b = r70Var;
                this.c = S;
                this.m = S;
            }
        } else {
            int T2 = hz0Var.T(this.q, r70Var);
            int S2 = hz0Var.S(this.q, r70Var);
            if (r70Var.p0[1] == 3) {
                this.p++;
                S2 = 0;
            }
            int i4 = hz0Var.Q0;
            if (r70Var.g0 != 8) {
                i2 = i4;
            }
            this.m = S2 + i2 + this.m;
            if (this.f2179b == null || this.c < T2) {
                this.f2179b = r70Var;
                this.c = T2;
                this.l = T2;
            }
        }
        this.o++;
    }

    public final void b(int i, boolean z, boolean z2) {
        hz0 hz0Var;
        boolean z3;
        int i2;
        int i3;
        int i4;
        r70 r70Var;
        int i5;
        int i6;
        int i7;
        float f;
        float f2;
        int i8;
        float f3;
        float f4;
        int i9;
        int i10;
        int i11;
        int i12 = this.o;
        int i13 = 0;
        while (true) {
            hz0Var = this.r;
            if (i13 >= i12 || (i11 = this.n + i13) >= hz0Var.b1) {
                break;
            }
            r70 r70Var2 = hz0Var.a1[i11];
            if (r70Var2 != null) {
                r70Var2.E();
            }
            i13++;
        }
        if (i12 != 0 && this.f2179b != null) {
            if (z2 && i == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i14 = -1;
            int i15 = -1;
            for (int i16 = 0; i16 < i12; i16++) {
                if (z) {
                    i10 = (i12 - 1) - i16;
                } else {
                    i10 = i16;
                }
                int i17 = this.n + i10;
                if (i17 >= hz0Var.b1) {
                    break;
                }
                r70 r70Var3 = hz0Var.a1[i17];
                if (r70Var3 != null && r70Var3.g0 == 0) {
                    if (i14 == -1) {
                        i14 = i16;
                    }
                    i15 = i16;
                }
            }
            if (this.f2178a == 0) {
                r70 r70Var4 = this.f2179b;
                r70Var4.j0 = hz0Var.E0;
                int i18 = this.i;
                if (i > 0) {
                    i18 += hz0Var.Q0;
                }
                z60 z60Var = this.e;
                z60 z60Var2 = r70Var4.J;
                z60Var2.a(z60Var, i18);
                z60 z60Var3 = r70Var4.L;
                if (z2) {
                    z60Var3.a(this.g, this.k);
                }
                if (i > 0) {
                    this.e.d.L.a(z60Var2, 0);
                }
                if (hz0Var.S0 == 3 && !r70Var4.E) {
                    for (int i19 = 0; i19 < i12; i19++) {
                        if (z) {
                            i9 = (i12 - 1) - i19;
                        } else {
                            i9 = i19;
                        }
                        int i20 = this.n + i9;
                        if (i20 >= hz0Var.b1) {
                            break;
                        }
                        r70Var = hz0Var.a1[i20];
                        if (r70Var.E) {
                            break;
                        }
                    }
                }
                r70Var = r70Var4;
                r70 r70Var5 = null;
                int i21 = 0;
                while (i21 < i12) {
                    if (z) {
                        i5 = (i12 - 1) - i21;
                    } else {
                        i5 = i21;
                    }
                    int i22 = this.n + i5;
                    if (i22 < hz0Var.b1) {
                        r70 r70Var6 = hz0Var.a1[i22];
                        if (r70Var6 == null) {
                            i6 = i12;
                        } else {
                            z60 z60Var4 = r70Var6.I;
                            if (i21 == 0) {
                                r70Var6.g(z60Var4, this.d, this.h);
                            }
                            if (i5 == 0) {
                                int i23 = hz0Var.D0;
                                if (z) {
                                    i7 = i23;
                                    f = 1.0f - hz0Var.J0;
                                } else {
                                    i7 = i23;
                                    f = hz0Var.J0;
                                }
                                if (this.n == 0) {
                                    int i24 = hz0Var.F0;
                                    f2 = f;
                                    if (i24 != -1) {
                                        if (z) {
                                            f4 = 1.0f - hz0Var.L0;
                                        } else {
                                            f4 = hz0Var.L0;
                                        }
                                        f3 = f4;
                                        i8 = i24;
                                        r70Var6.i0 = i8;
                                        r70Var6.d0 = f3;
                                    }
                                } else {
                                    f2 = f;
                                }
                                if (z2 && (i8 = hz0Var.H0) != -1) {
                                    if (z) {
                                        f3 = 1.0f - hz0Var.N0;
                                    } else {
                                        f3 = hz0Var.N0;
                                    }
                                } else {
                                    i8 = i7;
                                    f3 = f2;
                                }
                                r70Var6.i0 = i8;
                                r70Var6.d0 = f3;
                            }
                            if (i21 == i12 - 1) {
                                i6 = i12;
                                r70Var6.g(r70Var6.K, this.f, this.j);
                            } else {
                                i6 = i12;
                            }
                            if (r70Var5 != null) {
                                int i25 = hz0Var.P0;
                                z60 z60Var5 = r70Var5.K;
                                z60Var4.a(z60Var5, i25);
                                if (i21 == i14) {
                                    int i26 = this.h;
                                    if (z60Var4.h()) {
                                        z60Var4.h = i26;
                                    }
                                }
                                z60Var5.a(z60Var4, 0);
                                if (i21 == i15 + 1) {
                                    int i27 = this.j;
                                    if (z60Var5.h()) {
                                        z60Var5.h = i27;
                                    }
                                }
                            }
                            if (r70Var6 != r70Var4) {
                                int i28 = hz0Var.S0;
                                if (i28 == 3 && r70Var.E && r70Var6 != r70Var && r70Var6.E) {
                                    r70Var6.M.a(r70Var.M, 0);
                                } else {
                                    z60 z60Var6 = r70Var6.J;
                                    if (i28 != 0) {
                                        z60 z60Var7 = r70Var6.L;
                                        if (i28 != 1) {
                                            if (z3) {
                                                z60Var6.a(this.e, this.i);
                                                z60Var7.a(this.g, this.k);
                                            } else {
                                                z60Var6.a(z60Var2, 0);
                                                z60Var7.a(z60Var3, 0);
                                            }
                                        } else {
                                            z60Var7.a(z60Var3, 0);
                                        }
                                    } else {
                                        z60Var6.a(z60Var2, 0);
                                    }
                                }
                            }
                            r70Var5 = r70Var6;
                        }
                        i21++;
                        i12 = i6;
                    } else {
                        return;
                    }
                }
                return;
            }
            r70 r70Var7 = this.f2179b;
            r70Var7.i0 = hz0Var.D0;
            int i29 = this.h;
            if (i > 0) {
                i29 += hz0Var.P0;
            }
            z60 z60Var8 = r70Var7.K;
            z60 z60Var9 = r70Var7.I;
            if (z) {
                z60Var8.a(this.f, i29);
                if (z2) {
                    z60Var9.a(this.d, this.j);
                }
                if (i > 0) {
                    this.f.d.I.a(z60Var8, 0);
                }
            } else {
                z60Var9.a(this.d, i29);
                if (z2) {
                    z60Var8.a(this.f, this.j);
                }
                if (i > 0) {
                    this.d.d.K.a(z60Var9, 0);
                }
            }
            int i30 = 0;
            r70 r70Var8 = null;
            while (i30 < i12) {
                int i31 = this.n + i30;
                if (i31 < hz0Var.b1) {
                    r70 r70Var9 = hz0Var.a1[i31];
                    if (r70Var9 == null) {
                        r70Var9 = r70Var8;
                    } else {
                        z60 z60Var10 = r70Var9.J;
                        if (i30 == 0) {
                            r70Var9.g(z60Var10, this.e, this.i);
                            int i32 = hz0Var.E0;
                            float f5 = hz0Var.K0;
                            if (this.n == 0) {
                                i4 = hz0Var.G0;
                                i2 = i32;
                                i3 = -1;
                                if (i4 != -1) {
                                    f5 = hz0Var.M0;
                                    r70Var9.j0 = i4;
                                    r70Var9.e0 = f5;
                                }
                            } else {
                                i2 = i32;
                                i3 = -1;
                            }
                            if (z2 && (i4 = hz0Var.I0) != i3) {
                                f5 = hz0Var.O0;
                            } else {
                                i4 = i2;
                            }
                            r70Var9.j0 = i4;
                            r70Var9.e0 = f5;
                        }
                        if (i30 == i12 - 1) {
                            r70Var9.g(r70Var9.L, this.g, this.k);
                        }
                        if (r70Var8 != null) {
                            int i33 = hz0Var.Q0;
                            z60 z60Var11 = r70Var8.L;
                            z60Var10.a(z60Var11, i33);
                            if (i30 == i14) {
                                int i34 = this.i;
                                if (z60Var10.h()) {
                                    z60Var10.h = i34;
                                }
                            }
                            z60Var11.a(z60Var10, 0);
                            if (i30 == i15 + 1) {
                                int i35 = this.k;
                                if (z60Var11.h()) {
                                    z60Var11.h = i35;
                                }
                            }
                        }
                        if (r70Var9 != r70Var7) {
                            z60 z60Var12 = r70Var9.K;
                            z60 z60Var13 = r70Var9.I;
                            if (z) {
                                int i36 = hz0Var.R0;
                                if (i36 != 0) {
                                    if (i36 != 1) {
                                        if (i36 == 2) {
                                            z60Var13.a(z60Var9, 0);
                                            z60Var12.a(z60Var8, 0);
                                        }
                                    } else {
                                        z60Var13.a(z60Var9, 0);
                                    }
                                } else {
                                    z60Var12.a(z60Var8, 0);
                                }
                                i30++;
                                r70Var8 = r70Var9;
                            } else {
                                int i37 = hz0Var.R0;
                                if (i37 != 0) {
                                    if (i37 != 1) {
                                        if (i37 == 2) {
                                            if (z3) {
                                                z60Var13.a(this.d, this.h);
                                                z60Var12.a(this.f, this.j);
                                            } else {
                                                z60Var13.a(z60Var9, 0);
                                                z60Var12.a(z60Var8, 0);
                                            }
                                        }
                                    } else {
                                        z60Var12.a(z60Var8, 0);
                                    }
                                } else {
                                    z60Var13.a(z60Var9, 0);
                                }
                                i30++;
                                r70Var8 = r70Var9;
                            }
                        }
                    }
                    i30++;
                    r70Var8 = r70Var9;
                } else {
                    return;
                }
            }
        }
    }

    public final int c() {
        if (this.f2178a == 1) {
            return this.m - this.r.Q0;
        }
        return this.m;
    }

    public final int d() {
        if (this.f2178a == 0) {
            return this.l - this.r.P0;
        }
        return this.l;
    }

    public final void e(int i) {
        hz0 hz0Var;
        int i2;
        int i3 = this.p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            hz0Var = this.r;
            if (i6 >= i4 || (i2 = this.n + i6) >= hz0Var.b1) {
                break;
            }
            r70 r70Var = hz0Var.a1[i2];
            if (this.f2178a == 0) {
                if (r70Var != null) {
                    int[] iArr = r70Var.p0;
                    if (iArr[0] == 3 && r70Var.r == 0) {
                        hz0Var.U(r70Var, 1, i5, iArr[1], r70Var.l());
                    }
                }
            } else if (r70Var != null) {
                int[] iArr2 = r70Var.p0;
                if (iArr2[1] == 3 && r70Var.s == 0) {
                    hz0Var.U(r70Var, iArr2[0], r70Var.r(), 1, i5);
                }
            }
            i6++;
        }
        this.l = 0;
        this.m = 0;
        this.f2179b = null;
        this.c = 0;
        int i7 = this.o;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.n + i8;
            if (i9 < hz0Var.b1) {
                r70 r70Var2 = hz0Var.a1[i9];
                if (this.f2178a == 0) {
                    int r = r70Var2.r();
                    int i10 = hz0Var.P0;
                    if (r70Var2.g0 == 8) {
                        i10 = 0;
                    }
                    this.l = r + i10 + this.l;
                    int S = hz0Var.S(this.q, r70Var2);
                    if (this.f2179b == null || this.c < S) {
                        this.f2179b = r70Var2;
                        this.c = S;
                        this.m = S;
                    }
                } else {
                    int T = hz0Var.T(this.q, r70Var2);
                    int S2 = hz0Var.S(this.q, r70Var2);
                    int i11 = hz0Var.Q0;
                    if (r70Var2.g0 == 8) {
                        i11 = 0;
                    }
                    this.m = S2 + i11 + this.m;
                    if (this.f2179b == null || this.c < T) {
                        this.f2179b = r70Var2;
                        this.c = T;
                        this.l = T;
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void f(int i, z60 z60Var, z60 z60Var2, z60 z60Var3, z60 z60Var4, int i2, int i3, int i4, int i5, int i6) {
        this.f2178a = i;
        this.d = z60Var;
        this.e = z60Var2;
        this.f = z60Var3;
        this.g = z60Var4;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.q = i6;
    }
}
