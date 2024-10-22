package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class c0 extends pd0 {
    public final AtomicReferenceFieldUpdater g;
    public final AtomicReferenceFieldUpdater h;
    public final AtomicReferenceFieldUpdater i;
    public final AtomicReferenceFieldUpdater j;
    public final AtomicReferenceFieldUpdater k;

    public c0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.g = atomicReferenceFieldUpdater;
        this.h = atomicReferenceFieldUpdater2;
        this.i = atomicReferenceFieldUpdater3;
        this.j = atomicReferenceFieldUpdater4;
        this.k = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.pd0
    public final void I(f0 f0Var, f0 f0Var2) {
        this.h.lazySet(f0Var, f0Var2);
    }

    @Override // defpackage.pd0
    public final void J(f0 f0Var, Thread thread) {
        this.g.lazySet(f0Var, thread);
    }

    @Override // defpackage.pd0
    public final boolean m(g0 g0Var, b0 b0Var, b0 b0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.j;
            if (atomicReferenceFieldUpdater.compareAndSet(g0Var, b0Var, b0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(g0Var) == b0Var);
        return false;
    }

    @Override // defpackage.pd0
    public final boolean n(g0 g0Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.k;
            if (atomicReferenceFieldUpdater.compareAndSet(g0Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(g0Var) == obj);
        return false;
    }

    @Override // defpackage.pd0
    public final boolean o(g0 g0Var, f0 f0Var, f0 f0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.i;
            if (atomicReferenceFieldUpdater.compareAndSet(g0Var, f0Var, f0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(g0Var) == f0Var);
        return false;
    }
}
