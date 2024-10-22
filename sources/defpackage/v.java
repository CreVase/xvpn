package defpackage;

/* loaded from: classes2.dex */
public abstract class v extends nf1 implements c90, aa0 {
    public final t90 c;

    public v(t90 t90Var, boolean z) {
        super(z);
        I((df1) t90Var.get(d5.g));
        this.c = t90Var.plus(this);
    }

    @Override // defpackage.nf1
    public final void H(j11 j11Var) {
        zf3.H(this.c, j11Var);
    }

    @Override // defpackage.nf1
    public final String M() {
        return super.M();
    }

    @Override // defpackage.nf1
    public final void P(Object obj) {
        boolean z;
        if (obj instanceof d30) {
            d30 d30Var = (d30) obj;
            Throwable th = d30Var.f1723a;
            d30Var.getClass();
            if (d30.f1722b.get(d30Var) != 0) {
                z = true;
            } else {
                z = false;
            }
            W(z, th);
            return;
        }
        X(obj);
    }

    public void W(boolean z, Throwable th) {
    }

    public void X(Object obj) {
    }

    public final void Y(int i, v vVar, l41 l41Var) {
        if (i != 0) {
            int i2 = i - 1;
            ch3 ch3Var = ch3.f636a;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            try {
                                t90 t90Var = this.c;
                                Object o0 = zf3.o0(t90Var, null);
                                try {
                                    fl.d(2, l41Var);
                                    Object invoke = l41Var.invoke(vVar, this);
                                    if (invoke != ba0.f430a) {
                                        resumeWith(invoke);
                                        return;
                                    }
                                    return;
                                } finally {
                                    zf3.e0(t90Var, o0);
                                }
                            } catch (Throwable th) {
                                return;
                            }
                        }
                        throw new j11(null);
                    }
                    t9.P(t9.z(vVar, this, l41Var)).resumeWith(ch3Var);
                    return;
                }
                return;
            }
            try {
                tf3.r0(t9.P(t9.z(vVar, this, l41Var)), ch3Var, null);
                return;
            } finally {
                resumeWith(new pk2(th));
            }
        }
        throw null;
    }

    @Override // defpackage.nf1, defpackage.df1
    public boolean a() {
        return super.a();
    }

    @Override // defpackage.c90
    public final t90 getContext() {
        return this.c;
    }

    @Override // defpackage.c90
    public final void resumeWith(Object obj) {
        Throwable a2 = qk2.a(obj);
        if (a2 != null) {
            obj = new d30(false, a2);
        }
        Object L = L(obj);
        if (L == fl.h) {
            return;
        }
        p(L);
    }

    @Override // defpackage.nf1
    public final String u() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // defpackage.aa0
    public final t90 w() {
        return this.c;
    }
}
