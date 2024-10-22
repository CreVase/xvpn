package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class fo3 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f2128a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f2129b = new Object();
    public static WakeLock c;

    public static void a(Intent intent) {
        synchronized (f2129b) {
            if (c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                c.release();
            }
        }
    }

    public static void b(Context context, ur3 ur3Var, Intent intent) {
        synchronized (f2129b) {
            if (c == null) {
                WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                c = wakeLock;
                wakeLock.setReferenceCounted(true);
            }
            int i = 0;
            boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
            if (!booleanExtra) {
                c.acquire(f2128a);
            }
            ur3Var.b(intent).addOnCompleteListener(new z5(intent, i));
        }
    }

    public static ComponentName c(Context context, Intent intent) {
        synchronized (f2129b) {
            if (c == null) {
                WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                c = wakeLock;
                wakeLock.setReferenceCounted(true);
            }
            boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!booleanExtra) {
                c.acquire(f2128a);
            }
            return startService;
        }
    }
}
