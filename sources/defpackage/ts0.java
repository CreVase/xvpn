package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class ts0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4565a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4566b;

    public /* synthetic */ ts0(Object obj, int i) {
        this.f4565a = i;
        this.f4566b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.f4565a;
        Object obj = this.f4566b;
        switch (i) {
            case 0:
                Handler handler = (Handler) obj;
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 1:
                ((Handler) ((y33) obj).c).post(runnable);
                return;
            default:
                ((Executor) obj).execute(new qw3(runnable, 15));
                return;
        }
    }

    public ts0(Handler handler) {
        this.f4565a = 0;
        this.f4566b = handler;
    }
}
