package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class nd0 {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f3440a;

    /* renamed from: b, reason: collision with root package name */
    public final px0 f3441b;
    public final Object c;
    public TaskCompletionSource d;
    public boolean e;
    public boolean f;
    public Boolean g;
    public final TaskCompletionSource h;

    public nd0(px0 px0Var) {
        Boolean bool;
        Object obj = new Object();
        this.c = obj;
        this.d = new TaskCompletionSource();
        this.e = false;
        this.f = false;
        this.h = new TaskCompletionSource();
        px0Var.a();
        Context context = px0Var.f3931a;
        this.f3441b = px0Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        this.f3440a = sharedPreferences;
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.f = false;
            bool = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            bool = null;
        }
        this.g = bool == null ? a(context) : bool;
        synchronized (obj) {
            if (b()) {
                this.d.trySetResult(null);
                this.e = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean a(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "firebase_crashlytics_collection_enabled"
            r1 = 0
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            if (r2 == 0) goto L32
            java.lang.String r5 = r5.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            r3 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r5 = r2.getApplicationInfo(r5, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            if (r5 == 0) goto L32
            android.os.Bundle r2 = r5.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            if (r2 == 0) goto L32
            boolean r2 = r2.containsKey(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            if (r2 == 0) goto L32
            android.os.Bundle r5 = r5.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            boolean r5 = r5.getBoolean(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            goto L33
        L2a:
            r5 = move-exception
            java.lang.String r0 = "FirebaseCrashlytics"
            java.lang.String r2 = "Could not read data collection permission from manifest"
            android.util.Log.e(r0, r2, r5)
        L32:
            r5 = r1
        L33:
            if (r5 != 0) goto L39
            r5 = 0
            r4.f = r5
            return r1
        L39:
            r0 = 1
            r4.f = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r5 = r0.equals(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nd0.a(android.content.Context):java.lang.Boolean");
    }

    public final synchronized boolean b() {
        boolean z;
        String str;
        String str2;
        Boolean bool = this.g;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            try {
                z = this.f3441b.f();
            } catch (IllegalStateException unused) {
                z = false;
            }
        }
        if (z) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.g == null) {
            str2 = "global Firebase setting";
        } else if (this.f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        String.format("Crashlytics automatic data collection %s by %s.", str, str2);
        return z;
    }
}
