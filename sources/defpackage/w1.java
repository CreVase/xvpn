package defpackage;

/* loaded from: classes.dex */
public final class w1 extends pe0 {
    public w1() {
        super(0);
    }

    @Override // defpackage.pe0
    public final void M(x1 x1Var, x1 x1Var2) {
        x1Var.f5103b = x1Var2;
    }

    @Override // defpackage.pe0
    public final void N(x1 x1Var, Thread thread) {
        x1Var.f5102a = thread;
    }

    @Override // defpackage.pe0
    public final boolean h(y1 y1Var, u1 u1Var, u1 u1Var2) {
        synchronized (y1Var) {
            if (y1Var.f5255b == u1Var) {
                y1Var.f5255b = u1Var2;
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.pe0
    public final boolean i(y1 y1Var, Object obj, Object obj2) {
        synchronized (y1Var) {
            if (y1Var.f5254a == obj) {
                y1Var.f5254a = obj2;
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.pe0
    public final boolean j(y1 y1Var, x1 x1Var, x1 x1Var2) {
        synchronized (y1Var) {
            if (y1Var.c == x1Var) {
                y1Var.c = x1Var2;
                return true;
            }
            return false;
        }
    }
}
