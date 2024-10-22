package defpackage;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public final class k63 implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uu f2900a;

    public k63(vu vuVar) {
        this.f2900a = vuVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        Exception exception = task.getException();
        uu uuVar = this.f2900a;
        if (exception == null) {
            if (task.isCanceled()) {
                uuVar.i(null);
                return;
            } else {
                uuVar.resumeWith(task.getResult());
                return;
            }
        }
        uuVar.resumeWith(new pk2(exception));
    }
}
