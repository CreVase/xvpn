package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class gk1 extends v90 implements vj0 {
    public static final AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(gk1.class, "runningWorkers");

    /* renamed from: b, reason: collision with root package name */
    public final v90 f2265b;
    public final int c;
    public final /* synthetic */ vj0 d;
    public final nn1 e;
    public final Object f;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public gk1(int i) {
        vj0 vj0Var;
        jh3 jh3Var = jh3.f2766b;
        this.f2265b = jh3Var;
        this.c = i;
        if (jh3Var instanceof vj0) {
            vj0Var = (vj0) jh3Var;
        } else {
            vj0Var = null;
        }
        this.d = vj0Var == null ? hh0.f2423a : vj0Var;
        this.e = new nn1();
        this.f = new Object();
    }

    @Override // defpackage.v90
    public final void K(t90 t90Var, Runnable runnable) {
        boolean z;
        Runnable M;
        this.e.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
        if (atomicIntegerFieldUpdater.get(this) < this.c) {
            synchronized (this.f) {
                if (atomicIntegerFieldUpdater.get(this) >= this.c) {
                    z = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z = true;
                }
            }
            if (z && (M = M()) != null) {
                this.f2265b.K(this, new y4(25, this, M));
            }
        }
    }

    public final Runnable M() {
        while (true) {
            Runnable runnable = (Runnable) this.e.d();
            if (runnable == null) {
                synchronized (this.f) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.e.c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return runnable;
            }
        }
    }

    @Override // defpackage.vj0
    public final void w(long j, vu vuVar) {
        this.d.w(j, vuVar);
    }
}
