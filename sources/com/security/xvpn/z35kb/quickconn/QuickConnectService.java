package com.security.xvpn.z35kb.quickconn;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import com.security.xvpn.z35kb.MainActivity;
import defpackage.cj3;
import defpackage.d5;
import defpackage.ew3;
import defpackage.g53;
import defpackage.k50;
import defpackage.o12;
import defpackage.og;
import defpackage.rt3;
import defpackage.x31;
import defpackage.x80;

/* loaded from: classes2.dex */
public final class QuickConnectService extends Service {
    public static final /* synthetic */ int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public cj3 f1613a;

    /* renamed from: b, reason: collision with root package name */
    public int f1614b = 17;
    public QuickConnActionReciver c;

    public final void a() {
        boolean z = false;
        if (og.l1(new Integer[]{23, 17, 18, 39}, Integer.valueOf(this.f1614b)) >= 0) {
            z = true;
        }
        if (!z) {
            x31 x31Var = o12.f3580a;
            d5.v(this);
        }
        ew3.b0(new g53(this, 7));
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        x31 x31Var = o12.d;
        cj3 cj3Var = null;
        if (x31Var == null) {
            x31Var = null;
        }
        x31Var.invoke(this);
        this.f1613a = new cj3(this);
        k50 k50Var = k50.f2888a;
        k50.c = rt3.e().f4214b;
        startForeground(1, k50.a(this).a());
        rt3.e().d();
        rt3 e = rt3.e();
        cj3 cj3Var2 = this.f1613a;
        if (cj3Var2 == null) {
            cj3Var2 = null;
        }
        e.a(cj3Var2);
        rt3 e2 = rt3.e();
        cj3 cj3Var3 = this.f1613a;
        if (cj3Var3 != null) {
            cj3Var = cj3Var3;
        }
        e2.c(cj3Var);
        QuickConnActionReciver quickConnActionReciver = new QuickConnActionReciver();
        this.c = quickConnActionReciver;
        x80.registerReceiver(this, quickConnActionReciver, new IntentFilter("334gqdj8wm"), 4);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        rt3 e = rt3.e();
        cj3 cj3Var = this.f1613a;
        QuickConnActionReciver quickConnActionReciver = null;
        if (cj3Var == null) {
            cj3Var = null;
        }
        e.j(cj3Var);
        rt3 e2 = rt3.e();
        cj3 cj3Var2 = this.f1613a;
        if (cj3Var2 == null) {
            cj3Var2 = null;
        }
        e2.l(cj3Var2);
        try {
            QuickConnActionReciver quickConnActionReciver2 = this.c;
            if (quickConnActionReciver2 != null) {
                quickConnActionReciver = quickConnActionReciver2;
            }
            unregisterReceiver(quickConnActionReciver);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String stringExtra;
        int i3;
        if (intent != null && (stringExtra = intent.getStringExtra("x-vpn:quick_conn")) != null) {
            int i4 = 17;
            switch (stringExtra.hashCode()) {
                case -1977836468:
                    if (stringExtra.equals("x-vpn:quick_conn:notification")) {
                        if (rt3.e().f4214b == 65286) {
                            i3 = 19;
                        } else {
                            i3 = 20;
                        }
                        this.f1614b = i3;
                        a();
                        return 1;
                    }
                    return 1;
                case -1941780441:
                    if (stringExtra.equals("x-vpn:quick_conn:shortcut")) {
                        if (rt3.e().f4214b != 65286) {
                            i4 = 18;
                        }
                        this.f1614b = i4;
                        a();
                        return 1;
                    }
                    return 1;
                case -1844458907:
                    if (stringExtra.equals("x-vpn:quick_conn:widget")) {
                        if (rt3.e().f4214b != 65286) {
                            i4 = 18;
                        }
                        this.f1614b = i4;
                        a();
                        return 1;
                    }
                    return 1;
                case -1624353009:
                    if (stringExtra.equals("x-vpn:quick_conn:tile")) {
                        if (rt3.e().f4214b != 65286) {
                            i4 = 18;
                        }
                        this.f1614b = i4;
                        a();
                        return 1;
                    }
                    return 1;
                case 1192484133:
                    if (stringExtra.equals("x-vpn:quick_conn:launcherWidget")) {
                        this.f1614b = 39;
                        a();
                        return 1;
                    }
                    return 1;
                case 1286794669:
                    if (stringExtra.equals("x-vpn:quick_conn:launchApp")) {
                        Intent intent2 = new Intent(this, (Class<?>) MainActivity.class);
                        intent2.setFlags(270532608);
                        intent2.addCategory("android.intent.category.LAUNCHER");
                        startActivity(intent2);
                        return 1;
                    }
                    return 1;
                default:
                    return 1;
            }
        }
        return 1;
    }
}
