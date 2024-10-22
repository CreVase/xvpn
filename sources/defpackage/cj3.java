package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.quickconn.QuickConnectService;

/* loaded from: classes2.dex */
public final class cj3 implements pt3, qt3 {

    /* renamed from: a, reason: collision with root package name */
    public final Service f651a;

    /* renamed from: b, reason: collision with root package name */
    public u02 f652b;
    public boolean c = true;

    public cj3(Service service) {
        this.f651a = service;
    }

    @Override // defpackage.pt3
    public final /* synthetic */ void C(String str) {
    }

    public final void a() {
        boolean z = XApplication.c;
        Service service = this.f651a;
        if (z && XApplication.d) {
            if (this.c) {
                this.c = false;
                u02 u02Var = new u02(service, "VPN Connect Status");
                u02Var.x.when = System.currentTimeMillis();
                u02Var.c("X-VPN Service");
                int i = Build.VERSION.SDK_INT;
                if (i >= 26) {
                    u02Var.u = 0;
                }
                if (i >= 24) {
                    u02Var.j = 1;
                }
                this.f652b = u02Var;
            } else {
                return;
            }
        }
        try {
            u02 u02Var2 = this.f652b;
            if (u02Var2 == null) {
                u02Var2 = null;
            }
            service.startForeground(1, u02Var2.a());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void b() {
        y51 y51Var = y51.f5272a;
        qi0 qi0Var = vl0.f4854a;
        zf3.T(y51Var, zo1.f5522a, new bj3(this, null), 2);
    }

    @Override // defpackage.pt3
    public final void c(int i) {
        if (!ew3.m0()) {
            Service service = this.f651a;
            if (i < 65285 && m20.L(service.getClass().getName(), "a.flfVpnV3")) {
                Intent intent = new Intent(service, (Class<?>) QuickConnectService.class);
                try {
                    service.startService(intent);
                } catch (Throwable unused) {
                    x80.startForegroundService(service, intent);
                }
            }
            if (i == 65286) {
                b();
                new l12(service).f3046b.cancelAll();
                try {
                    service.stopSelf();
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
        b();
    }

    @Override // defpackage.qt3
    public final void i(boolean z, boolean z2) {
        b();
    }
}
