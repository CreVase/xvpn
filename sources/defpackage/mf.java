package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class mf implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3282a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f3283b = new ArrayDeque();
    public final Executor c;
    public Runnable d;

    public mf(nf nfVar) {
        this.c = nfVar;
    }

    public final void a() {
        synchronized (this.f3282a) {
            Runnable runnable = (Runnable) this.f3283b.poll();
            this.d = runnable;
            if (runnable != null) {
                this.c.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f3282a) {
            this.f3283b.add(new lf(0, this, runnable));
            if (this.d == null) {
                a();
            }
        }
    }
}
