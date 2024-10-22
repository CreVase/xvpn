package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class hz0 extends z71 {
    public r70[] a1;
    public int s0 = 0;
    public int t0 = 0;
    public int u0 = 0;
    public int v0 = 0;
    public int w0 = 0;
    public int x0 = 0;
    public boolean y0 = false;
    public int z0 = 0;
    public int A0 = 0;
    public final fp B0 = new fp();
    public mp3 C0 = null;
    public int D0 = -1;
    public int E0 = -1;
    public int F0 = -1;
    public int G0 = -1;
    public int H0 = -1;
    public int I0 = -1;
    public float J0 = 0.5f;
    public float K0 = 0.5f;
    public float L0 = 0.5f;
    public float M0 = 0.5f;
    public float N0 = 0.5f;
    public float O0 = 0.5f;
    public int P0 = 0;
    public int Q0 = 0;
    public int R0 = 2;
    public int S0 = 2;
    public int T0 = 0;
    public int U0 = -1;
    public int V0 = 0;
    public final ArrayList W0 = new ArrayList();
    public r70[] X0 = null;
    public r70[] Y0 = null;
    public int[] Z0 = null;
    public int b1 = 0;

    public final int S(int i, r70 r70Var) {
        if (r70Var == null) {
            return 0;
        }
        int[] iArr = r70Var.p0;
        if (iArr[1] == 3) {
            int i2 = r70Var.s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (r70Var.z * i);
                if (i3 != r70Var.l()) {
                    r70Var.g = true;
                    U(r70Var, iArr[0], r70Var.r(), 1, i3);
                }
                return i3;
            }
            if (i2 == 1) {
                return r70Var.l();
            }
            if (i2 == 3) {
                return (int) ((r70Var.r() * r70Var.W) + 0.5f);
            }
        }
        return r70Var.l();
    }

    public final int T(int i, r70 r70Var) {
        if (r70Var == null) {
            return 0;
        }
        int[] iArr = r70Var.p0;
        if (iArr[0] == 3) {
            int i2 = r70Var.r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (r70Var.w * i);
                if (i3 != r70Var.r()) {
                    r70Var.g = true;
                    U(r70Var, 1, i3, iArr[1], r70Var.l());
                }
                return i3;
            }
            if (i2 == 1) {
                return r70Var.r();
            }
            if (i2 == 3) {
                return (int) ((r70Var.l() * r70Var.W) + 0.5f);
            }
        }
        return r70Var.r();
    }

    public final void U(r70 r70Var, int i, int i2, int i3, int i4) {
        mp3 mp3Var;
        boolean z;
        r70 r70Var2;
        while (true) {
            mp3Var = this.C0;
            if (mp3Var != null || (r70Var2 = this.T) == null) {
                break;
            } else {
                this.C0 = ((s70) r70Var2).u0;
            }
        }
        fp fpVar = this.B0;
        fpVar.f2130a = i;
        fpVar.f2131b = i3;
        fpVar.c = i2;
        fpVar.d = i4;
        mp3Var.b(r70Var, fpVar);
        r70Var.O(fpVar.e);
        r70Var.L(fpVar.f);
        r70Var.E = fpVar.h;
        int i5 = fpVar.g;
        r70Var.a0 = i5;
        if (i5 > 0) {
            z = true;
        } else {
            z = false;
        }
        r70Var.E = z;
    }

    @Override // defpackage.z71, defpackage.x71
    public final void a() {
        for (int i = 0; i < this.r0; i++) {
            r70 r70Var = this.q0[i];
            if (r70Var != null) {
                r70Var.F = true;
            }
        }
    }

    @Override // defpackage.r70
    public final void c(ok1 ok1Var, boolean z) {
        boolean z2;
        boolean z3;
        r70 r70Var;
        float f;
        int i;
        boolean z4;
        super.c(ok1Var, z);
        r70 r70Var2 = this.T;
        if (r70Var2 != null && ((s70) r70Var2).v0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i2 = this.T0;
        ArrayList arrayList = this.W0;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        int size = arrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            fz0 fz0Var = (fz0) arrayList.get(i3);
                            if (i3 == size - 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            fz0Var.b(i3, z2, z4);
                        }
                    }
                } else if (this.Z0 != null && this.Y0 != null && this.X0 != null) {
                    for (int i4 = 0; i4 < this.b1; i4++) {
                        this.a1[i4].E();
                    }
                    int[] iArr = this.Z0;
                    int i5 = iArr[0];
                    int i6 = iArr[1];
                    float f2 = this.J0;
                    r70 r70Var3 = null;
                    int i7 = 0;
                    while (i7 < i5) {
                        if (z2) {
                            i = (i5 - i7) - 1;
                            f = 1.0f - this.J0;
                        } else {
                            f = f2;
                            i = i7;
                        }
                        r70 r70Var4 = this.Y0[i];
                        if (r70Var4 != null && r70Var4.g0 != 8) {
                            z60 z60Var = r70Var4.I;
                            if (i7 == 0) {
                                r70Var4.g(z60Var, this.I, this.w0);
                                r70Var4.i0 = this.D0;
                                r70Var4.d0 = f;
                            }
                            if (i7 == i5 - 1) {
                                r70Var4.g(r70Var4.K, this.K, this.x0);
                            }
                            if (i7 > 0 && r70Var3 != null) {
                                int i8 = this.P0;
                                z60 z60Var2 = r70Var3.K;
                                r70Var4.g(z60Var, z60Var2, i8);
                                r70Var3.g(z60Var2, z60Var, 0);
                            }
                            r70Var3 = r70Var4;
                        }
                        i7++;
                        f2 = f;
                    }
                    for (int i9 = 0; i9 < i6; i9++) {
                        r70 r70Var5 = this.X0[i9];
                        if (r70Var5 != null && r70Var5.g0 != 8) {
                            z60 z60Var3 = r70Var5.J;
                            if (i9 == 0) {
                                r70Var5.g(z60Var3, this.J, this.s0);
                                r70Var5.j0 = this.E0;
                                r70Var5.e0 = this.K0;
                            }
                            if (i9 == i6 - 1) {
                                r70Var5.g(r70Var5.L, this.L, this.t0);
                            }
                            if (i9 > 0 && r70Var3 != null) {
                                int i10 = this.Q0;
                                z60 z60Var4 = r70Var3.L;
                                r70Var5.g(z60Var3, z60Var4, i10);
                                r70Var3.g(z60Var4, z60Var3, 0);
                            }
                            r70Var3 = r70Var5;
                        }
                    }
                    for (int i11 = 0; i11 < i5; i11++) {
                        for (int i12 = 0; i12 < i6; i12++) {
                            int i13 = (i12 * i5) + i11;
                            if (this.V0 == 1) {
                                i13 = (i11 * i6) + i12;
                            }
                            r70[] r70VarArr = this.a1;
                            if (i13 < r70VarArr.length && (r70Var = r70VarArr[i13]) != null && r70Var.g0 != 8) {
                                r70 r70Var6 = this.Y0[i11];
                                r70 r70Var7 = this.X0[i12];
                                if (r70Var != r70Var6) {
                                    r70Var.g(r70Var.I, r70Var6.I, 0);
                                    r70Var.g(r70Var.K, r70Var6.K, 0);
                                }
                                if (r70Var != r70Var7) {
                                    r70Var.g(r70Var.J, r70Var7.J, 0);
                                    r70Var.g(r70Var.L, r70Var7.L, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                int size2 = arrayList.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    fz0 fz0Var2 = (fz0) arrayList.get(i14);
                    if (i14 == size2 - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    fz0Var2.b(i14, z2, z3);
                }
            }
        } else if (arrayList.size() > 0) {
            ((fz0) arrayList.get(0)).b(0, z2, true);
        }
        this.y0 = false;
    }
}
