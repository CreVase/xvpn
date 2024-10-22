package com.google.ads.conversiontracking;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PowerManager;
import android.os.Process;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class c implements Runnable {
    public static final long k;
    public static final long l;
    public static final Object m;
    public static c n;

    /* renamed from: a, reason: collision with root package name */
    public final long f1381a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1382b;
    public final b c;
    public final Context d;
    public final SharedPreferences h;
    public long i;
    public final Handler j;
    public final Object e = new Object();
    public final HashMap g = new HashMap();
    public final HashSet f = new HashSet();

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        k = timeUnit.toMillis(3600L);
        l = timeUnit.toMillis(30L);
        m = new Object();
    }

    public c(Context context, long j, long j2, b bVar) {
        this.d = context;
        this.f1382b = j;
        this.f1381a = j2;
        this.c = bVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("google_auto_usage", 0);
        this.h = sharedPreferences;
        if (this.i == 0) {
            HashMap hashMap = g.f1391a;
            this.i = sharedPreferences.getLong("end_of_interval", System.currentTimeMillis() + j);
        }
        HandlerThread handlerThread = new HandlerThread("Google Conversion SDK", 10);
        handlerThread.start();
        this.j = new Handler(handlerThread.getLooper());
        d();
    }

    public static c a(Context context) {
        synchronized (m) {
            if (n == null) {
                try {
                    n = new c(context, k, l, new b(context));
                } catch (Exception e) {
                    Log.e("GoogleConversionReporter", "Error starting automated usage thread", e);
                }
            }
        }
        return n;
    }

    public void b(String str) {
        synchronized (this.e) {
            this.f.add(str);
            this.g.remove(str);
        }
    }

    public void c(String str) {
        synchronized (this.e) {
            if (!this.f.contains(str) && !this.g.containsKey(str)) {
                this.c.a(str, this.i);
                this.g.put(str, Long.valueOf(this.i));
            }
        }
    }

    public boolean d(String str) {
        return this.g.containsKey(str);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        Context context = this.d;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid && runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && powerManager.isScreenOn()) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            b(this.f1381a);
            return;
        }
        synchronized (this.e) {
            for (Map.Entry entry : this.g.entrySet()) {
                String str = (String) entry.getKey();
                long longValue = ((Long) entry.getValue()).longValue();
                long j = this.i;
                if (longValue < j) {
                    entry.setValue(Long.valueOf(j));
                    this.c.a(str, this.i);
                }
            }
        }
        d();
        long c = c();
        this.h.edit().putLong("end_of_interval", c).commit();
        this.i = c;
    }

    public final void d() {
        synchronized (this.e) {
            long c = c();
            HashMap hashMap = g.f1391a;
            b(c - System.currentTimeMillis());
        }
    }

    public final void b(long j) {
        synchronized (this.e) {
            Handler handler = this.j;
            if (handler != null) {
                handler.removeCallbacks(this);
                this.j.postDelayed(this, j);
            }
        }
    }

    public void a(String str) {
        synchronized (this.e) {
            this.f.remove(str);
        }
        c(str);
    }

    public final long c() {
        HashMap hashMap = g.f1391a;
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.i;
        long j2 = this.f1382b;
        long j3 = currentTimeMillis >= j ? ((currentTimeMillis - j) / j2) + 1 : 0L;
        Long.signum(j3);
        return (j3 * j2) + j;
    }
}
