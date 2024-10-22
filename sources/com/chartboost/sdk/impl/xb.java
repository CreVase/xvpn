package com.chartboost.sdk.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public class xb implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1300a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1301b;
    public a c;

    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z);
    }

    public void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public ActivityManager.RunningAppProcessInfo b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    public boolean c() {
        return this.f1301b;
    }

    public boolean d() {
        return false;
    }

    public void e() {
        this.f1300a = true;
        boolean a2 = a();
        this.f1301b = a2;
        b(a2);
    }

    public void f() {
        this.f1300a = false;
        this.c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        a(a());
    }

    public void a(a aVar) {
        this.c = aVar;
    }

    public void b(boolean z) {
    }

    public final void a(boolean z) {
        if (this.f1301b != z) {
            this.f1301b = z;
            if (this.f1300a) {
                b(z);
                a aVar = this.c;
                if (aVar != null) {
                    aVar.a(z);
                }
            }
        }
    }

    public final boolean a() {
        return (b().importance == 100) || d();
    }
}
