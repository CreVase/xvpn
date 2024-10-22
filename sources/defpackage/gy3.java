package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public abstract class gy3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f2342a;

    public gy3() {
        this.f2342a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            TaskCompletionSource taskCompletionSource = this.f2342a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(e);
            }
        }
    }

    public gy3(TaskCompletionSource taskCompletionSource) {
        this.f2342a = taskCompletionSource;
    }
}
