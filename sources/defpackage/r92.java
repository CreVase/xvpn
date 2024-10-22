package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class r92 implements rm2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4116a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u92 f4117b;

    public r92(u92 u92Var, int i) {
        this.f4117b = u92Var;
        this.f4116a = i;
    }

    @Override // defpackage.rm2
    public final void g() {
        u92 u92Var = this.f4117b;
        qm2 qm2Var = u92Var.s[this.f4116a];
        rn0 rn0Var = qm2Var.h;
        if (rn0Var != null && rn0Var.getState() == 1) {
            qn0 f = qm2Var.h.f();
            f.getClass();
            throw f;
        }
        int z = u92Var.d.z(u92Var.B);
        fm1 fm1Var = u92Var.k;
        IOException iOException = fm1Var.c;
        if (iOException == null) {
            zl1 zl1Var = fm1Var.f2118b;
            if (zl1Var != null) {
                if (z == Integer.MIN_VALUE) {
                    z = zl1Var.f5505a;
                }
                IOException iOException2 = zl1Var.e;
                if (iOException2 != null && zl1Var.f > z) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    @Override // defpackage.rm2
    public final int h(long j) {
        boolean z;
        u92 u92Var = this.f4117b;
        int i = this.f4116a;
        int i2 = 0;
        if (!u92Var.C()) {
            u92Var.y(i);
            qm2 qm2Var = u92Var.s[i];
            boolean z2 = u92Var.K;
            synchronized (qm2Var) {
                int k = qm2Var.k(qm2Var.s);
                int i3 = qm2Var.s;
                int i4 = qm2Var.p;
                if (i3 != i4) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && j >= qm2Var.n[k]) {
                    if (j > qm2Var.v && z2) {
                        i2 = i4 - i3;
                    } else {
                        int h = qm2Var.h(k, i4 - i3, j, true);
                        if (h != -1) {
                            i2 = h;
                        }
                    }
                }
            }
            qm2Var.t(i2);
            if (i2 == 0) {
                u92Var.z(i);
            }
        }
        return i2;
    }

    @Override // defpackage.rm2
    public final int i(x50 x50Var, ve0 ve0Var, int i) {
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        u92 u92Var = this.f4117b;
        int i3 = this.f4116a;
        if (u92Var.C()) {
            return -3;
        }
        u92Var.y(i3);
        qm2 qm2Var = u92Var.s[i3];
        boolean z4 = u92Var.K;
        qm2Var.getClass();
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        nm2 nm2Var = qm2Var.f4023b;
        synchronized (qm2Var) {
            ve0Var.e = false;
            int i4 = qm2Var.s;
            if (i4 != qm2Var.p) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (!z4 && !qm2Var.w) {
                    y01 y01Var = qm2Var.z;
                    if (y01Var != null && (z || y01Var != qm2Var.g)) {
                        qm2Var.o(y01Var, x50Var);
                        i2 = -5;
                    } else {
                        i2 = -3;
                    }
                }
                ve0Var.f3342b = 4;
                i2 = -4;
            } else {
                y01 y01Var2 = ((om2) qm2Var.c.g(qm2Var.q + i4)).f3694a;
                if (!z && y01Var2 == qm2Var.g) {
                    int k = qm2Var.k(qm2Var.s);
                    if (!qm2Var.n(k)) {
                        ve0Var.e = true;
                        i2 = -3;
                    } else {
                        ve0Var.f3342b = qm2Var.m[k];
                        if (qm2Var.s == qm2Var.p - 1 && (z4 || qm2Var.w)) {
                            ve0Var.e(536870912);
                        }
                        long j = qm2Var.n[k];
                        ve0Var.f = j;
                        if (j < qm2Var.t) {
                            ve0Var.e(Integer.MIN_VALUE);
                        }
                        nm2Var.f3490b = qm2Var.l[k];
                        nm2Var.f3489a = qm2Var.k[k];
                        nm2Var.c = qm2Var.o[k];
                        i2 = -4;
                    }
                }
                qm2Var.o(y01Var2, x50Var);
                i2 = -5;
            }
        }
        if (i2 == -4 && !ve0Var.g(4)) {
            if ((i & 1) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i & 4) == 0) {
                if (z3) {
                    mm2 mm2Var = qm2Var.f4022a;
                    mm2.e(mm2Var.e, ve0Var, qm2Var.f4023b, mm2Var.c);
                } else {
                    mm2 mm2Var2 = qm2Var.f4022a;
                    mm2Var2.e = mm2.e(mm2Var2.e, ve0Var, qm2Var.f4023b, mm2Var2.c);
                }
            }
            if (!z3) {
                qm2Var.s++;
            }
        }
        if (i2 == -3) {
            u92Var.z(i3);
        }
        return i2;
    }

    @Override // defpackage.rm2
    public final boolean isReady() {
        u92 u92Var = this.f4117b;
        if (!u92Var.C() && u92Var.s[this.f4116a].m(u92Var.K)) {
            return true;
        }
        return false;
    }
}
