package defpackage;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final /* synthetic */ class oy3 implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3752a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f3753b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oy3(Object obj, TaskCompletionSource taskCompletionSource, int i) {
        this.f3752a = i;
        this.c = obj;
        this.f3753b = taskCompletionSource;
    }

    private final void a() {
        xy3 xy3Var = (xy3) this.c;
        TaskCompletionSource taskCompletionSource = this.f3753b;
        synchronized (xy3Var.f) {
            xy3Var.e.remove(taskCompletionSource);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f3752a) {
            case 0:
                az3 az3Var = (az3) this.c;
                TaskCompletionSource taskCompletionSource = this.f3753b;
                synchronized (az3Var.f) {
                    az3Var.e.remove(taskCompletionSource);
                }
                return;
            default:
                a();
                return;
        }
    }
}
