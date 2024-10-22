package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t61 extends r70 {
    public float q0 = -1.0f;
    public int r0 = -1;
    public int s0 = -1;
    public z60 t0 = this.J;
    public int u0 = 0;
    public boolean v0;

    public t61() {
        this.R.clear();
        this.R.add(this.t0);
        int length = this.Q.length;
        for (int i = 0; i < length; i++) {
            this.Q[i] = this.t0;
        }
    }

    @Override // defpackage.r70
    public final boolean B() {
        return this.v0;
    }

    @Override // defpackage.r70
    public final boolean C() {
        return this.v0;
    }

    @Override // defpackage.r70
    public final void Q(ok1 ok1Var, boolean z) {
        if (this.T == null) {
            return;
        }
        z60 z60Var = this.t0;
        ok1Var.getClass();
        int n = ok1.n(z60Var);
        if (this.u0 == 1) {
            this.Y = n;
            this.Z = 0;
            L(this.T.l());
            O(0);
            return;
        }
        this.Y = 0;
        this.Z = n;
        O(this.T.r());
        L(0);
    }

    public final void R(int i) {
        this.t0.l(i);
        this.v0 = true;
    }

    public final void S(int i) {
        if (this.u0 == i) {
            return;
        }
        this.u0 = i;
        ArrayList arrayList = this.R;
        arrayList.clear();
        if (this.u0 == 1) {
            this.t0 = this.I;
        } else {
            this.t0 = this.J;
        }
        arrayList.add(this.t0);
        z60[] z60VarArr = this.Q;
        int length = z60VarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            z60VarArr[i2] = this.t0;
        }
    }

    @Override // defpackage.r70
    public final void c(ok1 ok1Var, boolean z) {
        boolean z2;
        s70 s70Var = (s70) this.T;
        if (s70Var == null) {
            return;
        }
        Object j = s70Var.j(y60.LEFT);
        Object j2 = s70Var.j(y60.RIGHT);
        r70 r70Var = this.T;
        boolean z3 = true;
        if (r70Var != null && r70Var.p0[0] == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.u0 == 0) {
            j = s70Var.j(y60.TOP);
            j2 = s70Var.j(y60.BOTTOM);
            r70 r70Var2 = this.T;
            if (r70Var2 == null || r70Var2.p0[1] != 2) {
                z3 = false;
            }
            z2 = z3;
        }
        if (this.v0) {
            z60 z60Var = this.t0;
            if (z60Var.c) {
                ix2 k = ok1Var.k(z60Var);
                ok1Var.d(k, this.t0.d());
                if (this.r0 != -1) {
                    if (z2) {
                        ok1Var.f(ok1Var.k(j2), k, 0, 5);
                    }
                } else if (this.s0 != -1 && z2) {
                    ix2 k2 = ok1Var.k(j2);
                    ok1Var.f(k, ok1Var.k(j), 0, 5);
                    ok1Var.f(k2, k, 0, 5);
                }
                this.v0 = false;
                return;
            }
        }
        if (this.r0 != -1) {
            ix2 k3 = ok1Var.k(this.t0);
            ok1Var.e(k3, ok1Var.k(j), this.r0, 8);
            if (z2) {
                ok1Var.f(ok1Var.k(j2), k3, 0, 5);
                return;
            }
            return;
        }
        if (this.s0 != -1) {
            ix2 k4 = ok1Var.k(this.t0);
            ix2 k5 = ok1Var.k(j2);
            ok1Var.e(k4, k5, -this.s0, 8);
            if (z2) {
                ok1Var.f(k4, ok1Var.k(j), 0, 5);
                ok1Var.f(k5, k4, 0, 5);
                return;
            }
            return;
        }
        if (this.q0 != -1.0f) {
            ix2 k6 = ok1Var.k(this.t0);
            ix2 k7 = ok1Var.k(j2);
            float f = this.q0;
            mg l = ok1Var.l();
            l.d.k(k6, -1.0f);
            l.d.k(k7, f);
            ok1Var.c(l);
        }
    }

    @Override // defpackage.r70
    public final boolean d() {
        return true;
    }

    @Override // defpackage.r70
    public final z60 j(y60 y60Var) {
        int ordinal = y60Var.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return null;
                    }
                }
            }
            if (this.u0 == 0) {
                return this.t0;
            }
            return null;
        }
        if (this.u0 == 1) {
            return this.t0;
        }
        return null;
    }
}
