package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class ex1 extends FutureTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rg f2016a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex1(rg rgVar, dx1 dx1Var) {
        super(dx1Var);
        this.f2016a = rgVar;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        rg rgVar = this.f2016a;
        try {
            Object obj = get();
            if (!rgVar.e.get()) {
                rgVar.a(obj);
            }
        } catch (InterruptedException unused) {
        } catch (CancellationException unused2) {
            if (!rgVar.e.get()) {
                rgVar.a(null);
            }
        } catch (ExecutionException e) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e.getCause());
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
