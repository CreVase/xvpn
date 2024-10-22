package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class rp2 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f4200b;
    public volatile Runnable d;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f4199a = new ArrayDeque();
    public final Object c = new Object();

    public rp2(ExecutorService executorService) {
        this.f4200b = executorService;
    }

    public final boolean a() {
        boolean z;
        synchronized (this.c) {
            if (!this.f4199a.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void b() {
        synchronized (this.c) {
            Runnable runnable = (Runnable) this.f4199a.poll();
            this.d = runnable;
            if (runnable != null) {
                this.f4200b.execute(this.d);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.c) {
            this.f4199a.add(new y4(this, runnable, 9));
            if (this.d == null) {
                b();
            }
        }
    }
}
