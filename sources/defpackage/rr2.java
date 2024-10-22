package defpackage;

/* loaded from: classes.dex */
public final class rr2 extends g0 {
    public final boolean h(Object obj) {
        if (obj == null) {
            obj = g0.g;
        }
        if (g0.f.n(this, null, obj)) {
            g0.b(this);
            return true;
        }
        return false;
    }

    public final boolean i(Throwable th) {
        th.getClass();
        if (g0.f.n(this, null, new a0(th))) {
            g0.b(this);
            return true;
        }
        return false;
    }

    public final boolean j(ml1 ml1Var) {
        a0 a0Var;
        ml1Var.getClass();
        Object obj = this.f2184a;
        if (obj == null) {
            if (ml1Var.isDone()) {
                if (!g0.f.n(this, null, g0.e(ml1Var))) {
                    return false;
                }
                g0.b(this);
            } else {
                d0 d0Var = new d0(this, ml1Var);
                if (g0.f.n(this, null, d0Var)) {
                    try {
                        ml1Var.addListener(d0Var, ol0.f3687a);
                    } catch (Throwable th) {
                        try {
                            a0Var = new a0(th);
                        } catch (Throwable unused) {
                            a0Var = a0.f6b;
                        }
                        g0.f.n(this, d0Var, a0Var);
                    }
                } else {
                    obj = this.f2184a;
                }
            }
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        ml1Var.cancel(((z) obj).f5406a);
        return false;
    }
}
