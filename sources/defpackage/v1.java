package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class v1 extends pe0 {
    public final AtomicReferenceFieldUpdater q;
    public final AtomicReferenceFieldUpdater r;
    public final AtomicReferenceFieldUpdater s;
    public final AtomicReferenceFieldUpdater t;
    public final AtomicReferenceFieldUpdater u;

    public v1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(0);
        this.q = atomicReferenceFieldUpdater;
        this.r = atomicReferenceFieldUpdater2;
        this.s = atomicReferenceFieldUpdater3;
        this.t = atomicReferenceFieldUpdater4;
        this.u = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.pe0
    public final void M(x1 x1Var, x1 x1Var2) {
        this.r.lazySet(x1Var, x1Var2);
    }

    @Override // defpackage.pe0
    public final void N(x1 x1Var, Thread thread) {
        this.q.lazySet(x1Var, thread);
    }

    @Override // defpackage.pe0
    public final boolean h(y1 y1Var, u1 u1Var, u1 u1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.t;
            if (atomicReferenceFieldUpdater.compareAndSet(y1Var, u1Var, u1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(y1Var) == u1Var);
        return false;
    }

    @Override // defpackage.pe0
    public final boolean i(y1 y1Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.u;
            if (atomicReferenceFieldUpdater.compareAndSet(y1Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(y1Var) == obj);
        return false;
    }

    @Override // defpackage.pe0
    public final boolean j(y1 y1Var, x1 x1Var, x1 x1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.s;
            if (atomicReferenceFieldUpdater.compareAndSet(y1Var, x1Var, x1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(y1Var) == x1Var);
        return false;
    }
}
