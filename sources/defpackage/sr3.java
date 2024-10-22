package defpackage;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class sr3 extends Binder {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4404b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final uo f4405a;

    public sr3(uo uoVar) {
        this.f4405a = uoVar;
    }

    public final void a(tr3 tr3Var) {
        if (Binder.getCallingUid() == Process.myUid()) {
            Intent intent = tr3Var.f4563a;
            sr0 sr0Var = (sr0) this.f4405a.f4707a;
            int i = sr0.f;
            sr0Var.getClass();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            sr0Var.f4398a.execute(new cq0(15, sr0Var, intent, taskCompletionSource));
            taskCompletionSource.getTask().addOnCompleteListener(new zf(19), new z5(tr3Var, 1));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
