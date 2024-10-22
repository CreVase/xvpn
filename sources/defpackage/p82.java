package defpackage;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
public abstract class p82 {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
