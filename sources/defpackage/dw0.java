package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Queue;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class dw0 {
    public static final Object c = new Object();
    public static ur3 d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f1848a;

    /* renamed from: b, reason: collision with root package name */
    public final zf f1849b = new zf(14);

    public dw0(Context context) {
        this.f1848a = context;
    }

    public static Task a(Context context, Intent intent, boolean z) {
        ur3 ur3Var;
        synchronized (c) {
            if (d == null) {
                d = new ur3(context);
            }
            ur3Var = d;
        }
        if (z) {
            if (wq2.b().d(context)) {
                fo3.b(context, ur3Var, intent);
            } else {
                ur3Var.b(intent);
            }
            return Tasks.forResult(-1);
        }
        return ur3Var.b(intent).continueWith(new zf(16), new qb0(6));
    }

    public final Task b(final Intent intent) {
        boolean z;
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z2 = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean isAtLeastO = PlatformVersion.isAtLeastO();
        final Context context = this.f1848a;
        if (isAtLeastO && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        } else {
            z = false;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z2 = true;
        }
        if (z && !z2) {
            return a(context, intent, z2);
        }
        Callable callable = new Callable() { // from class: cw0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i;
                ComponentName startService;
                Context context2 = context;
                Intent intent2 = intent;
                wq2 b2 = wq2.b();
                ((Queue) b2.d).offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (b2) {
                    Object obj = b2.f5056a;
                    if (((String) obj) != null) {
                        str = (String) obj;
                    } else {
                        ResolveInfo resolveService = context2.getPackageManager().resolveService(intent3, 0);
                        if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                            if (context2.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                if (str2.startsWith(".")) {
                                    b2.f5056a = context2.getPackageName() + serviceInfo.name;
                                } else {
                                    b2.f5056a = serviceInfo.name;
                                }
                                str = (String) b2.f5056a;
                            }
                            Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            str = null;
                        }
                        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                        str = null;
                    }
                }
                if (str != null) {
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    if (b2.d(context2)) {
                        startService = fo3.c(context2, intent3);
                    } else {
                        startService = context2.startService(intent3);
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = 404;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
                    i = 402;
                } catch (SecurityException e2) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                    i = 401;
                }
                return Integer.valueOf(i);
            }
        };
        zf zfVar = this.f1849b;
        return Tasks.call(zfVar, callable).continueWithTask(zfVar, new bj0(context, intent, z2));
    }
}
