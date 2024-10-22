package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class r6 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f4104a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f4105b;
    public final int c;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;

    public r6(Activity activity) {
        this.f4105b = activity;
        this.c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f4105b == activity) {
            this.f4105b = null;
            this.e = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityPaused(android.app.Activity r6) {
        /*
            r5 = this;
            boolean r0 = r5.e
            if (r0 == 0) goto L43
            boolean r0 = r5.f
            if (r0 != 0) goto L43
            boolean r0 = r5.d
            if (r0 != 0) goto L43
            java.lang.Object r0 = r5.f4104a
            r1 = 1
            java.lang.reflect.Field r2 = defpackage.s6.c     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = r2.get(r6)     // Catch: java.lang.Throwable -> L33
            if (r2 != r0) goto L3b
            int r0 = r6.hashCode()     // Catch: java.lang.Throwable -> L33
            int r3 = r5.c
            if (r0 == r3) goto L20
            goto L3b
        L20:
            java.lang.reflect.Field r0 = defpackage.s6.f4278b     // Catch: java.lang.Throwable -> L33
            java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Throwable -> L33
            android.os.Handler r0 = defpackage.s6.g     // Catch: java.lang.Throwable -> L33
            y4 r3 = new y4     // Catch: java.lang.Throwable -> L33
            r4 = 4
            r3.<init>(r6, r2, r4)     // Catch: java.lang.Throwable -> L33
            r0.postAtFrontOfQueue(r3)     // Catch: java.lang.Throwable -> L33
            r6 = 1
            goto L3c
        L33:
            r6 = move-exception
            java.lang.String r0 = "ActivityRecreator"
            java.lang.String r2 = "Exception while fetching field values"
            android.util.Log.e(r0, r2, r6)
        L3b:
            r6 = 0
        L3c:
            if (r6 == 0) goto L43
            r5.f = r1
            r6 = 0
            r5.f4104a = r6
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r6.onActivityPaused(android.app.Activity):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f4105b == activity) {
            this.d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
