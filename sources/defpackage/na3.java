package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class na3 implements Runnable {
    public static final Object f = new Object();
    public static Boolean g;
    public static Boolean h;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3426a;

    /* renamed from: b, reason: collision with root package name */
    public final f80 f3427b;
    public final PowerManager.WakeLock c;
    public final la3 d;
    public final long e;

    public na3(la3 la3Var, Context context, f80 f80Var, long j) {
        this.d = la3Var;
        this.f3426a = context;
        this.e = j;
        this.f3427b = f80Var;
        this.c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f) {
            Boolean bool = h;
            if (bool == null) {
                if (bool != null) {
                    booleanValue = bool.booleanValue();
                } else if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                    booleanValue = true;
                } else {
                    booleanValue = false;
                }
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            h = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    public static boolean b(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f) {
            Boolean bool = g;
            if (bool == null) {
                if (bool != null) {
                    booleanValue = bool.booleanValue();
                } else if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                    booleanValue = true;
                } else {
                    booleanValue = false;
                }
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            g = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    public final synchronized boolean c() {
        NetworkInfo networkInfo;
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f3426a.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null) {
            if (networkInfo.isConnected()) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        la3 la3Var = this.d;
        Context context = this.f3426a;
        boolean b2 = b(context);
        PowerManager.WakeLock wakeLock = this.c;
        if (b2) {
            wakeLock.acquire(w60.f4947a);
        }
        try {
            try {
                synchronized (la3Var) {
                    la3Var.g = true;
                }
            } catch (IOException e) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                la3Var.e(false);
                if (!b(context)) {
                    return;
                }
            }
            if (!this.f3427b.g()) {
                la3Var.e(false);
                if (b(context)) {
                    try {
                        wakeLock.release();
                        return;
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (a(context) && !c()) {
                context.registerReceiver(new ma3(this, this), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                if (b(context)) {
                    try {
                        wakeLock.release();
                        return;
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (la3Var.f()) {
                la3Var.e(false);
            } else {
                la3Var.g(this.e);
            }
            if (!b(context)) {
                return;
            }
            try {
                wakeLock.release();
            } catch (RuntimeException unused3) {
                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
            }
        } catch (Throwable th) {
            if (b(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
