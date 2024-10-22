package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import defpackage.bo1;
import defpackage.dk1;
import defpackage.go3;
import defpackage.q43;
import defpackage.r43;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SystemAlarmService extends dk1 implements q43 {
    public static final String d = bo1.e("SystemAlarmService");

    /* renamed from: b, reason: collision with root package name */
    public r43 f294b;
    public boolean c;

    public final void a() {
        r43 r43Var = new r43(this);
        this.f294b = r43Var;
        if (r43Var.j != null) {
            bo1.c().b(r43.k, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            r43Var.j = this;
        }
    }

    public final void b() {
        this.c = true;
        bo1.c().a(new Throwable[0]);
        WeakHashMap weakHashMap = go3.f2295a;
        HashMap hashMap = new HashMap();
        WeakHashMap weakHashMap2 = go3.f2295a;
        synchronized (weakHashMap2) {
            hashMap.putAll(weakHashMap2);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                String.format("WakeLock held for %s", hashMap.get(wakeLock));
                bo1 c = bo1.c();
                WeakHashMap weakHashMap3 = go3.f2295a;
                c.f(new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // defpackage.dk1, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
        this.c = false;
    }

    @Override // defpackage.dk1, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.c = true;
        this.f294b.e();
    }

    @Override // defpackage.dk1, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.c) {
            bo1.c().d(d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f294b.e();
            a();
            this.c = false;
        }
        if (intent != null) {
            this.f294b.a(i2, intent);
            return 3;
        }
        return 3;
    }
}
