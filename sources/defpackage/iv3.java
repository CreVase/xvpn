package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes2.dex */
public class iv3 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2655a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2656b;
    public hv3 c;

    public final boolean a() {
        boolean z;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        if (runningAppProcessInfo.importance == 100) {
            z = true;
        } else {
            z = false;
        }
        if (z || c()) {
            return true;
        }
        return false;
    }

    public void b(boolean z) {
    }

    public boolean c() {
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (!this.f2656b) {
            this.f2656b = true;
            if (this.f2655a) {
                b(true);
                hv3 hv3Var = this.c;
                if (hv3Var != null) {
                    hv3Var.a(true);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        boolean a2 = a();
        if (this.f2656b != a2) {
            this.f2656b = a2;
            if (this.f2655a) {
                b(a2);
                hv3 hv3Var = this.c;
                if (hv3Var != null) {
                    hv3Var.a(a2);
                }
            }
        }
    }
}
