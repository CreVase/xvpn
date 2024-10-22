package defpackage;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public final class jq extends v {
    public final Thread d;
    public final ms0 e;

    public jq(t90 t90Var, Thread thread, ms0 ms0Var) {
        super(t90Var, true);
        this.d = thread;
        this.e = ms0Var;
    }

    @Override // defpackage.nf1
    public final void o(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.d;
        if (!m20.L(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
