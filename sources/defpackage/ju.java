package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ju implements ml1 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f2828a;

    /* renamed from: b, reason: collision with root package name */
    public final iu f2829b = new iu(this);

    public ju(hu huVar) {
        this.f2828a = new WeakReference(huVar);
    }

    @Override // defpackage.ml1
    public final void addListener(Runnable runnable, Executor executor) {
        this.f2829b.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        hu huVar = (hu) this.f2828a.get();
        boolean cancel = this.f2829b.cancel(z);
        if (cancel && huVar != null) {
            huVar.f2485a = null;
            huVar.f2486b = null;
            huVar.c.h(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f2829b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2829b.f5254a instanceof r1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f2829b.isDone();
    }

    public final String toString() {
        return this.f2829b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f2829b.get(j, timeUnit);
    }
}
