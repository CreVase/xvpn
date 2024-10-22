package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public abstract class ny3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f3565a;

    public ny3() {
        this.f3565a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            TaskCompletionSource taskCompletionSource = this.f3565a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(e);
            }
        }
    }

    public ny3(TaskCompletionSource taskCompletionSource) {
        this.f3565a = taskCompletionSource;
    }
}
