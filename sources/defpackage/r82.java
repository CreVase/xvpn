package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class r82 extends yq0 {
    final /* synthetic */ t82 this$0;

    public r82(t82 t82Var) {
        this.this$0 = t82Var;
    }

    @Override // defpackage.yq0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = ij2.f2608b;
            ((ij2) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f2609a = this.this$0.h;
        }
    }

    @Override // defpackage.yq0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        t82 t82Var = this.this$0;
        int i = t82Var.f4465b - 1;
        t82Var.f4465b = i;
        if (i == 0) {
            t82Var.e.postDelayed(t82Var.g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        p82.a(activity, new q82(this.this$0));
    }

    @Override // defpackage.yq0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        t82 t82Var = this.this$0;
        int i = t82Var.f4464a - 1;
        t82Var.f4464a = i;
        if (i == 0 && t82Var.c) {
            t82Var.f.e(tj1.ON_STOP);
            t82Var.d = true;
        }
    }
}
