package defpackage;

import android.app.Activity;

/* loaded from: classes.dex */
public final class q82 extends yq0 {
    final /* synthetic */ t82 this$0;

    public q82(t82 t82Var) {
        this.this$0 = t82Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        this.this$0.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        t82 t82Var = this.this$0;
        int i = t82Var.f4464a + 1;
        t82Var.f4464a = i;
        if (i == 1 && t82Var.d) {
            t82Var.f.e(tj1.ON_START);
            t82Var.d = false;
        }
    }
}
