package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class tl0 extends tn2 {
    public static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(tl0.class, "_decision");
    private volatile int _decision;

    @Override // defpackage.tn2, defpackage.nf1
    public final void o(Object obj) {
        p(obj);
    }

    @Override // defpackage.tn2, defpackage.nf1
    public final void p(Object obj) {
        boolean z;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e;
            int i = atomicIntegerFieldUpdater.get(this);
            z = true;
            if (i != 0) {
                if (i == 1) {
                    z = false;
                } else {
                    throw new IllegalStateException("Already resumed".toString());
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, 0, 2)) {
                break;
            }
        }
        if (z) {
            return;
        }
        tf3.r0(t9.P(this.d), t9.e0(obj), null);
    }
}
