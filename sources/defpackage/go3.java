package defpackage;

import android.content.Context;
import android.os.PowerManager;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class go3 {

    /* renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f2295a;

    static {
        bo1.e("WakeLocks");
        f2295a = new WeakHashMap();
    }

    public static PowerManager.WakeLock a(Context context, String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String p = hx2.p("WorkManager: ", str);
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, p);
        WeakHashMap weakHashMap = f2295a;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, p);
        }
        return newWakeLock;
    }
}
