package defpackage;

/* loaded from: classes.dex */
public final class e0 extends pd0 {
    @Override // defpackage.pd0
    public final void I(f0 f0Var, f0 f0Var2) {
        f0Var.f2024b = f0Var2;
    }

    @Override // defpackage.pd0
    public final void J(f0 f0Var, Thread thread) {
        f0Var.f2023a = thread;
    }

    @Override // defpackage.pd0
    public final boolean m(g0 g0Var, b0 b0Var, b0 b0Var2) {
        synchronized (g0Var) {
            if (g0Var.f2185b == b0Var) {
                g0Var.f2185b = b0Var2;
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.pd0
    public final boolean n(g0 g0Var, Object obj, Object obj2) {
        synchronized (g0Var) {
            if (g0Var.f2184a == obj) {
                g0Var.f2184a = obj2;
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.pd0
    public final boolean o(g0 g0Var, f0 f0Var, f0 f0Var2) {
        synchronized (g0Var) {
            if (g0Var.c == f0Var) {
                g0Var.c = f0Var2;
                return true;
            }
            return false;
        }
    }
}
