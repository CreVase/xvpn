package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public abstract class if1 extends mn1 implements yl0, vb1, x31 {
    public nf1 d;

    @Override // defpackage.vb1
    public final boolean a() {
        return true;
    }

    @Override // defpackage.vb1
    public final g02 c() {
        return null;
    }

    @Override // defpackage.yl0
    public final void d() {
        boolean z;
        mn1 mn1Var;
        boolean z2;
        nf1 k = k();
        do {
            Object F = k.F();
            z = false;
            if (F instanceof if1) {
                if (F == this) {
                    xq0 xq0Var = fl.m;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nf1.f3451a;
                        if (atomicReferenceFieldUpdater.compareAndSet(k, F, xq0Var)) {
                            z = true;
                            break;
                        } else if (atomicReferenceFieldUpdater.get(k) != F) {
                            break;
                        }
                    }
                } else {
                    return;
                }
            } else {
                if (!(F instanceof vb1) || ((vb1) F).c() == null) {
                    return;
                }
                do {
                    Object g = g();
                    if (g instanceof bj2) {
                        mn1 mn1Var2 = ((bj2) g).f475a;
                        return;
                    }
                    if (g == this) {
                        return;
                    }
                    mn1Var = (mn1) g;
                    mn1Var.getClass();
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = mn1.c;
                    bj2 bj2Var = (bj2) atomicReferenceFieldUpdater2.get(mn1Var);
                    if (bj2Var == null) {
                        bj2Var = new bj2(mn1Var);
                        atomicReferenceFieldUpdater2.lazySet(mn1Var, bj2Var);
                    }
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = mn1.f3319a;
                        if (atomicReferenceFieldUpdater3.compareAndSet(this, g, bj2Var)) {
                            z2 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater3.get(this) != g) {
                            z2 = false;
                            break;
                        }
                    }
                } while (!z2);
                mn1Var.e();
                return;
            }
        } while (!z);
    }

    public df1 getParent() {
        return k();
    }

    public final nf1 k() {
        nf1 nf1Var = this.d;
        if (nf1Var != null) {
            return nf1Var;
        }
        return null;
    }

    public abstract void l(Throwable th);

    @Override // defpackage.mn1
    public final String toString() {
        return getClass().getSimpleName() + '@' + pe0.u(this) + "[job@" + pe0.u(k()) + ']';
    }
}
