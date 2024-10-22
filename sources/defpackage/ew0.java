package defpackage;

import a.du;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.activity.ComponentActivity;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.purchase.GoogleIABHelper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class ew0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2006a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2007b;

    public /* synthetic */ ew0(Object obj, int i) {
        this.f2006a = i;
        this.f2007b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Intent r6) {
        /*
            android.os.Bundle r6 = r6.getExtras()     // Catch: java.lang.RuntimeException -> Ld
            if (r6 == 0) goto Ld
            java.lang.String r0 = "gcm.n.analytics_data"
            android.os.Bundle r6 = r6.getBundle(r0)     // Catch: java.lang.RuntimeException -> Ld
            goto Le
        Ld:
            r6 = 0
        Le:
            java.lang.String r0 = "1"
            if (r6 != 0) goto L14
            r1 = 0
            goto L1e
        L14:
            java.lang.String r1 = "google.c.a.e"
            java.lang.String r1 = r6.getString(r1)
            boolean r1 = r0.equals(r1)
        L1e:
            if (r1 == 0) goto L80
            if (r6 != 0) goto L23
            goto L7b
        L23:
            java.lang.String r1 = "google.c.a.tc"
            java.lang.String r1 = r6.getString(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7b
            px0 r0 = defpackage.px0.b()
            r0.a()
            b40 r0 = r0.d
            java.lang.Class<qa> r1 = defpackage.qa.class
            java.lang.Object r0 = r0.a(r1)
            qa r0 = (defpackage.qa) r0
            if (r0 == 0) goto L7b
            java.lang.String r1 = "google.c.a.c_id"
            java.lang.String r1 = r6.getString(r1)
            ra r0 = (defpackage.ra) r0
            ji2 r2 = defpackage.dx3.c
            java.lang.String r3 = "fcm"
            boolean r2 = r2.contains(r3)
            r2 = r2 ^ 1
            if (r2 != 0) goto L57
            goto L5e
        L57:
            com.google.android.gms.measurement.api.AppMeasurementSdk r2 = r0.f4119a
            java.lang.String r4 = "_ln"
            r2.setUserProperty(r3, r4, r1)
        L5e:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r4 = "source"
            java.lang.String r5 = "Firebase"
            r2.putString(r4, r5)
            java.lang.String r4 = "medium"
            java.lang.String r5 = "notification"
            r2.putString(r4, r5)
            java.lang.String r4 = "campaign"
            r2.putString(r4, r1)
            java.lang.String r1 = "_cmp"
            r0.a(r3, r1, r2)
        L7b:
            java.lang.String r0 = "_no"
            defpackage.tf3.c0(r6, r0)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ew0.a(android.content.Intent):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i = this.f2006a;
        Object obj = this.f2007b;
        switch (i) {
            case 0:
                Intent intent = activity.getIntent();
                if (intent != null && ((Set) obj).add(intent)) {
                    if (Build.VERSION.SDK_INT <= 25) {
                        new Handler(Looper.getMainLooper()).post(new lf(27, this, intent));
                        return;
                    } else {
                        a(intent);
                        return;
                    }
                }
                return;
            case 1:
                return;
            default:
                if (activity instanceof lt3) {
                    XApplication.e.add(activity);
                    ((ComponentActivity) activity).getLifecycle().a(GoogleIABHelper.g);
                    return;
                } else {
                    ((XApplication) obj).f1593b.add(activity);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f2006a) {
            case 0:
            case 1:
                return;
            default:
                if (activity instanceof lt3) {
                    XApplication.e.remove(activity);
                    return;
                } else {
                    ((XApplication) this.f2007b).f1593b.remove(activity);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i = this.f2006a;
        Object obj = this.f2007b;
        switch (i) {
            case 0:
                if (activity.isFinishing()) {
                    ((Set) obj).remove(activity.getIntent());
                    return;
                }
                return;
            case 1:
                gr2 gr2Var = (gr2) obj;
                ((v73) gr2Var.f2310a).getClass();
                int i2 = po0.d;
                gr2Var.f = fl.d0(SystemClock.elapsedRealtime(), to0.c);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:            if (r3 != false) goto L32;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:            if (r4 != false) goto L32;     */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityResumed(android.app.Activity r11) {
        /*
            r10 = this;
            int r11 = r10.f2006a
            switch(r11) {
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.lang.Object r11 = r10.f2007b
            gr2 r11 = (defpackage.gr2) r11
            t83 r0 = r11.f2310a
            v73 r0 = (defpackage.v73) r0
            r0.getClass()
            int r0 = defpackage.po0.d
            long r0 = android.os.SystemClock.elapsedRealtime()
            to0 r2 = defpackage.to0.c
            long r0 = defpackage.fl.d0(r0, r2)
            long r2 = r11.f
            r4 = 1
            long r5 = r2 >> r4
            long r5 = -r5
            int r3 = (int) r2
            r2 = r3 & 1
            long r5 = r5 << r4
            long r2 = (long) r2
            long r5 = r5 + r2
            int r2 = defpackage.qo0.f4029a
            long r0 = defpackage.po0.f(r0, r5)
            lr2 r2 = r11.d
            cs2 r3 = r2.f3178a
            po0 r3 = r3.c()
            r5 = 0
            r7 = 0
            if (r3 == 0) goto L54
            long r8 = r3.f3883a
            int r3 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r3 <= 0) goto L44
            r3 = 1
            goto L45
        L44:
            r3 = 0
        L45:
            if (r3 == 0) goto L50
            boolean r3 = defpackage.po0.e(r8)
            r3 = r3 ^ r4
            if (r3 == 0) goto L50
            r3 = 1
            goto L51
        L50:
            r3 = 0
        L51:
            if (r3 == 0) goto L54
            goto L7b
        L54:
            cs2 r2 = r2.f3179b
            po0 r2 = r2.c()
            if (r2 == 0) goto L73
            long r8 = r2.f3883a
            int r2 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r2 <= 0) goto L64
            r2 = 1
            goto L65
        L64:
            r2 = 0
        L65:
            if (r2 == 0) goto L6f
            boolean r2 = defpackage.po0.e(r8)
            r2 = r2 ^ r4
            if (r2 == 0) goto L6f
            goto L70
        L6f:
            r4 = 0
        L70:
            if (r4 == 0) goto L73
            goto L7b
        L73:
            r2 = 30
            to0 r3 = defpackage.to0.e
            long r8 = defpackage.fl.c0(r2, r3)
        L7b:
            int r0 = defpackage.po0.c(r0, r8)
            if (r0 <= 0) goto L84
            r11.a()
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ew0.onActivityResumed(android.app.Activity):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.f2006a) {
            case 0:
            case 1:
                return;
            default:
                XApplication xApplication = (XApplication) this.f2007b;
                int i = xApplication.f1592a + 1;
                xApplication.f1592a = i;
                if (i == 1) {
                    pe0.a("UIPage EnterUI", new Object[0]);
                    du.d(466, null);
                    k13.f2871a.set(true);
                    if (!ew3.o0()) {
                        l83.a(activity);
                    }
                    ew3.b0(new d9(9));
                    return;
                }
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.f2006a) {
            case 0:
            case 1:
                return;
            default:
                XApplication xApplication = (XApplication) this.f2007b;
                int i = xApplication.f1592a - 1;
                xApplication.f1592a = i;
                if (i == 0) {
                    pe0.a("UIPage LeaveUI", new Object[0]);
                    du.d(244, null);
                    du.d(467, null);
                    ew3.g0("Background");
                    return;
                }
                return;
        }
    }

    public ew0() {
        this.f2006a = 0;
        this.f2007b = Collections.newSetFromMap(new WeakHashMap());
    }
}
