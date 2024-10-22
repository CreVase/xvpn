package defpackage;

/* loaded from: classes.dex */
public final class cn extends z71 {
    public int s0 = 0;
    public boolean t0 = true;
    public int u0 = 0;
    public boolean v0 = false;

    @Override // defpackage.r70
    public final boolean B() {
        return this.v0;
    }

    @Override // defpackage.r70
    public final boolean C() {
        return this.v0;
    }

    public final boolean S() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.r0;
            if (i4 >= i) {
                break;
            }
            r70 r70Var = this.q0[i4];
            if ((this.t0 || r70Var.d()) && ((((i2 = this.s0) == 0 || i2 == 1) && !r70Var.B()) || (((i3 = this.s0) == 2 || i3 == 3) && !r70Var.C()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.r0; i6++) {
            r70 r70Var2 = this.q0[i6];
            if (this.t0 || r70Var2.d()) {
                y60 y60Var = y60.BOTTOM;
                y60 y60Var2 = y60.TOP;
                y60 y60Var3 = y60.RIGHT;
                y60 y60Var4 = y60.LEFT;
                if (!z2) {
                    int i7 = this.s0;
                    if (i7 == 0) {
                        i5 = r70Var2.j(y60Var4).d();
                    } else if (i7 == 1) {
                        i5 = r70Var2.j(y60Var3).d();
                    } else if (i7 == 2) {
                        i5 = r70Var2.j(y60Var2).d();
                    } else if (i7 == 3) {
                        i5 = r70Var2.j(y60Var).d();
                    }
                    z2 = true;
                }
                int i8 = this.s0;
                if (i8 == 0) {
                    i5 = Math.min(i5, r70Var2.j(y60Var4).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, r70Var2.j(y60Var3).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, r70Var2.j(y60Var2).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, r70Var2.j(y60Var).d());
                }
            }
        }
        int i9 = i5 + this.u0;
        int i10 = this.s0;
        if (i10 != 0 && i10 != 1) {
            K(i9, i9);
        } else {
            J(i9, i9);
        }
        this.v0 = true;
        return true;
    }

    public final int T() {
        int i = this.s0;
        if (i != 0 && i != 1) {
            if (i == 2 || i == 3) {
                return 1;
            }
            return -1;
        }
        return 0;
    }

    @Override // defpackage.r70
    public final void c(ok1 ok1Var, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        z60[] z60VarArr = this.Q;
        z60 z60Var = this.I;
        z60VarArr[0] = z60Var;
        int i5 = 2;
        z60 z60Var2 = this.J;
        z60VarArr[2] = z60Var2;
        z60 z60Var3 = this.K;
        z60VarArr[1] = z60Var3;
        z60 z60Var4 = this.L;
        z60VarArr[3] = z60Var4;
        for (z60 z60Var5 : z60VarArr) {
            z60Var5.i = ok1Var.k(z60Var5);
        }
        int i6 = this.s0;
        if (i6 >= 0 && i6 < 4) {
            z60 z60Var6 = z60VarArr[i6];
            if (!this.v0) {
                S();
            }
            if (this.v0) {
                this.v0 = false;
                int i7 = this.s0;
                if (i7 != 0 && i7 != 1) {
                    if (i7 == 2 || i7 == 3) {
                        ok1Var.d(z60Var2.i, this.Z);
                        ok1Var.d(z60Var4.i, this.Z);
                        return;
                    }
                    return;
                }
                ok1Var.d(z60Var.i, this.Y);
                ok1Var.d(z60Var3.i, this.Y);
                return;
            }
            for (int i8 = 0; i8 < this.r0; i8++) {
                r70 r70Var = this.q0[i8];
                if ((this.t0 || r70Var.d()) && ((((i4 = this.s0) == 0 || i4 == 1) && r70Var.p0[0] == 3 && r70Var.I.f != null && r70Var.K.f != null) || ((i4 == 2 || i4 == 3) && r70Var.p0[1] == 3 && r70Var.J.f != null && r70Var.L.f != null))) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
            if (!z60Var.g() && !z60Var3.g()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z60Var2.g() && !z60Var4.g()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z2 && (((i3 = this.s0) == 0 && z3) || ((i3 == 2 && z4) || ((i3 == 1 && z3) || (i3 == 3 && z4))))) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                i = 4;
            } else {
                i = 5;
            }
            int i9 = 0;
            while (i9 < this.r0) {
                r70 r70Var2 = this.q0[i9];
                if (this.t0 || r70Var2.d()) {
                    ix2 k = ok1Var.k(r70Var2.Q[this.s0]);
                    int i10 = this.s0;
                    z60 z60Var7 = r70Var2.Q[i10];
                    z60Var7.i = k;
                    z60 z60Var8 = z60Var7.f;
                    if (z60Var8 != null && z60Var8.d == this) {
                        i2 = z60Var7.g + 0;
                    } else {
                        i2 = 0;
                    }
                    if (i10 != 0 && i10 != i5) {
                        ix2 ix2Var = z60Var6.i;
                        int i11 = this.u0 + i2;
                        mg l = ok1Var.l();
                        ix2 m = ok1Var.m();
                        m.d = 0;
                        l.b(ix2Var, k, m, i11);
                        ok1Var.c(l);
                    } else {
                        ix2 ix2Var2 = z60Var6.i;
                        int i12 = this.u0 - i2;
                        mg l2 = ok1Var.l();
                        ix2 m2 = ok1Var.m();
                        m2.d = 0;
                        l2.c(ix2Var2, k, m2, i12);
                        ok1Var.c(l2);
                    }
                    ok1Var.e(z60Var6.i, k, this.u0 + i2, i);
                }
                i9++;
                i5 = 2;
            }
            int i13 = this.s0;
            if (i13 == 0) {
                ok1Var.e(z60Var3.i, z60Var.i, 0, 8);
                ok1Var.e(z60Var.i, this.T.K.i, 0, 4);
                ok1Var.e(z60Var.i, this.T.I.i, 0, 0);
                return;
            }
            if (i13 == 1) {
                ok1Var.e(z60Var.i, z60Var3.i, 0, 8);
                ok1Var.e(z60Var.i, this.T.I.i, 0, 4);
                ok1Var.e(z60Var.i, this.T.K.i, 0, 0);
            } else if (i13 == 2) {
                ok1Var.e(z60Var4.i, z60Var2.i, 0, 8);
                ok1Var.e(z60Var2.i, this.T.L.i, 0, 4);
                ok1Var.e(z60Var2.i, this.T.J.i, 0, 0);
            } else if (i13 == 3) {
                ok1Var.e(z60Var2.i, z60Var4.i, 0, 8);
                ok1Var.e(z60Var2.i, this.T.J.i, 0, 4);
                ok1Var.e(z60Var2.i, this.T.L.i, 0, 0);
            }
        }
    }

    @Override // defpackage.r70
    public final boolean d() {
        return true;
    }

    @Override // defpackage.r70
    public final String toString() {
        String s = hx2.s(new StringBuilder("[Barrier] "), this.h0, " {");
        for (int i = 0; i < this.r0; i++) {
            r70 r70Var = this.q0[i];
            if (i > 0) {
                s = p71.l(s, ", ");
            }
            StringBuilder n = p71.n(s);
            n.append(r70Var.h0);
            s = n.toString();
        }
        return p71.l(s, "}");
    }
}
