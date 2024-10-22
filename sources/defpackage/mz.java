package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class mz extends ff1 {
    public final vu e;

    public mz(vu vuVar) {
        this.e = vuVar;
    }

    @Override // defpackage.x31
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        l((Throwable) obj);
        return ch3.f636a;
    }

    @Override // defpackage.if1
    public final void l(Throwable th) {
        boolean z;
        nf1 k = k();
        vu vuVar = this.e;
        Throwable q = vuVar.q(k);
        boolean z2 = false;
        if (vuVar.w()) {
            sl0 sl0Var = (sl0) vuVar.d;
            sl0Var.getClass();
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sl0.h;
                Object obj = atomicReferenceFieldUpdater.get(sl0Var);
                pq0 pq0Var = tf3.q;
                boolean z3 = true;
                if (m20.L(obj, pq0Var)) {
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(sl0Var, pq0Var, q)) {
                            z = true;
                            break;
                        } else if (atomicReferenceFieldUpdater.get(sl0Var) != pq0Var) {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        break;
                    }
                } else {
                    if (obj instanceof Throwable) {
                        break;
                    }
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(sl0Var, obj, null)) {
                            break;
                        } else if (atomicReferenceFieldUpdater.get(sl0Var) != obj) {
                            z3 = false;
                            break;
                        }
                    }
                    if (z3) {
                        break;
                    }
                }
            }
            z2 = true;
        }
        if (!z2) {
            vuVar.i(q);
            if (!vuVar.w()) {
                vuVar.o();
            }
        }
    }
}
