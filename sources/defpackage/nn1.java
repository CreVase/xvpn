package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class nn1 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3497a = AtomicReferenceFieldUpdater.newUpdater(nn1.class, Object.class, "_cur");
    private volatile Object _cur = new pn1(8, false);

    public final boolean a(Object obj) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3497a;
            pn1 pn1Var = (pn1) atomicReferenceFieldUpdater.get(this);
            int a2 = pn1Var.a(obj);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                if (a2 == 2) {
                    return false;
                }
            } else {
                pn1 c = pn1Var.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, pn1Var, c) && atomicReferenceFieldUpdater.get(this) == pn1Var) {
                }
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3497a;
            pn1 pn1Var = (pn1) atomicReferenceFieldUpdater.get(this);
            if (pn1Var.b()) {
                return;
            }
            pn1 c = pn1Var.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, pn1Var, c) && atomicReferenceFieldUpdater.get(this) == pn1Var) {
            }
        }
    }

    public final int c() {
        pn1 pn1Var = (pn1) f3497a.get(this);
        pn1Var.getClass();
        long j = pn1.f.get(pn1Var);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0)));
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3497a;
            pn1 pn1Var = (pn1) atomicReferenceFieldUpdater.get(this);
            Object d = pn1Var.d();
            if (d != pn1.g) {
                return d;
            }
            pn1 c = pn1Var.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, pn1Var, c) && atomicReferenceFieldUpdater.get(this) == pn1Var) {
            }
        }
    }
}
