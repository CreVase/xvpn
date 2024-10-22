package defpackage;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final /* synthetic */ class yi3 implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f5344b;

    public /* synthetic */ yi3(int i, TaskCompletionSource taskCompletionSource) {
        this.f5343a = i;
        this.f5344b = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        int i = this.f5343a;
        TaskCompletionSource taskCompletionSource = this.f5344b;
        switch (i) {
            case 0:
                if (task.isSuccessful()) {
                    taskCompletionSource.trySetResult(task.getResult());
                } else if (task.getException() != null) {
                    taskCompletionSource.trySetException(task.getException());
                }
                return null;
            case 1:
                if (task.isSuccessful()) {
                    taskCompletionSource.setResult(task.getResult());
                } else if (task.getException() != null) {
                    taskCompletionSource.setException(task.getException());
                }
                return null;
            default:
                if (task.isSuccessful()) {
                    taskCompletionSource.trySetResult(task.getResult());
                } else if (task.getException() != null) {
                    taskCompletionSource.trySetException(task.getException());
                }
                return null;
        }
    }
}
