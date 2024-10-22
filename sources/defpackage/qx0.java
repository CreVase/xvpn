package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class qx0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f4066a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qa0 f4067b;
    public final /* synthetic */ at3 c;

    public qx0(boolean z, qa0 qa0Var, at3 at3Var) {
        this.f4066a = z;
        this.f4067b = qa0Var;
        this.c = at3Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.f4066a) {
            qa0 qa0Var = this.f4067b;
            qa0Var.getClass();
            dx1 dx1Var = new dx1(4, qa0Var, this.c);
            ExecutorService executorService = aj3.f99a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            ExecutorService executorService2 = qa0Var.l;
            executorService2.execute(new cq0(14, dx1Var, executorService2, taskCompletionSource));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
