package androidx.work;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Worker f291a;

    public a(Worker worker) {
        this.f291a = worker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Worker worker = this.f291a;
        try {
            worker.mFuture.h(worker.doWork());
        } catch (Throwable th) {
            worker.mFuture.i(th);
        }
    }
}
