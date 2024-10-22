package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class k50 implements pt3, qt3 {
    public static int c = 65286;

    /* renamed from: a, reason: collision with root package name */
    public static final k50 f2888a = new k50();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f2889b = ew3.X();
    public static final d42 e = d42.t;
    public static final gv2 d = gv2.o;

    public static u02 a(Context context) {
        String z;
        boolean z2;
        m02 m02Var;
        u02 u02Var = new u02(context, "VPN Connect Status");
        f2889b = ew3.X();
        long currentTimeMillis = System.currentTimeMillis();
        Notification notification = u02Var.x;
        notification.when = currentTimeMillis;
        int i = c;
        k50 k50Var = f2888a;
        switch (i) {
            case 65281:
                notification.icon = R.drawable.ic_notification_active;
                u02Var.r = -11153696;
                z = pd0.z(R.string.NotificationConnectingTo, k50Var.b());
                break;
            case 65282:
            case 65284:
            default:
                notification.icon = R.drawable.ic_notification_active;
                u02Var.r = -11153696;
                z = pd0.z(R.string.NotificationConnectedTo, k50Var.b());
                break;
            case 65283:
                notification.icon = R.drawable.ic_notification_active;
                u02Var.r = -11153696;
                z = pd0.z(R.string.NotificationReconnectingTo, k50Var.b());
                break;
            case 65285:
                notification.icon = R.drawable.ic_notification_active;
                u02Var.r = -8618884;
                z = pd0.z(R.string.NotificationDisconnectingTo, k50Var.b());
                break;
            case 65286:
                notification.icon = R.drawable.ic_notification_idle;
                u02Var.r = -8618884;
                if (f2889b) {
                    z = pd0.z(R.string.NotificationCurrectLocation, k50Var.b());
                    break;
                } else {
                    z = pd0.y(R.string.NotiticationPremiumAction);
                    break;
                }
        }
        u02Var.c(z);
        x31 x31Var = null;
        if (XApplication.c) {
            x31 x31Var2 = o12.f3580a;
            if (x31Var2 != null) {
                x31Var = x31Var2;
            }
            u02Var.g = (PendingIntent) x31Var.invoke(context);
        } else {
            x31 x31Var3 = o12.c;
            if (x31Var3 != null) {
                x31Var = x31Var3;
            }
            u02Var.g = (PendingIntent) x31Var.invoke(context);
        }
        if (c == 65286) {
            z2 = true;
        } else {
            z2 = false;
        }
        m02 m02Var2 = (m02) d.invoke(Boolean.valueOf(z2), context);
        ArrayList arrayList = u02Var.f4608b;
        if (m02Var2 != null) {
            arrayList.add(m02Var2);
        }
        if (!f2889b && (m02Var = (m02) e.invoke(context)) != null) {
            arrayList.add(m02Var);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            u02Var.u = 0;
        }
        if (i2 >= 24) {
            u02Var.j = 1;
        }
        return u02Var;
    }

    @Override // defpackage.pt3
    public final /* synthetic */ void C(String str) {
    }

    public final String b() {
        dc2 O = ew3.O();
        if (TextUtils.isEmpty((String) O.f1757b)) {
            return ew3.J(ew3.S0());
        }
        return (String) O.d;
    }

    @Override // defpackage.pt3
    public final void c(int i) {
        c = i;
    }

    @Override // defpackage.qt3
    public final void i(boolean z, boolean z2) {
        f2889b = z2;
    }
}
