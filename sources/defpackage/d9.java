package defpackage;

import a.bx;
import a.du;
import android.view.ViewGroup;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.purchase.GoogleIABHelper;
import com.security.xvpn.z35kb.purchase.GuideToPurchaseActivity;
import com.security.xvpn.z35kb.purchase.GuideToPurchaseNew1Activity;
import com.security.xvpn.z35kb.purchase.GuideToPurchaseNew2Activity;
import com.security.xvpn.z35kb.purchase.StartAppGuideToPurchaseActivity;
import com.security.xvpn.z35kb.television.HomeActivity;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.internal.util.ThreadUtil;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Stack;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final /* synthetic */ class d9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1750a;

    public /* synthetic */ d9(int i) {
        this.f1750a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1750a) {
            case 0:
                int i = AlarmManagerSchedulerBroadcastReceiver.f1455a;
                return;
            case 1:
                ReentrantLock reentrantLock = yv3.c;
                synchronized (reentrantLock) {
                    reentrantLock.lock();
                    Iterator it = yv3.d.iterator();
                    while (it.hasNext()) {
                        WeakReference weakReference = (WeakReference) it.next();
                        if (weakReference.get() != null) {
                            xv3 xv3Var = (xv3) ((wv3) weakReference.get());
                            xv3Var.getClass();
                            try {
                                ((ViewGroup) xv3Var.getParent()).removeView(xv3Var);
                                yv3.f5397a = null;
                            } catch (Exception unused) {
                            }
                        }
                        it.remove();
                    }
                    yv3.c.unlock();
                }
                return;
            case 2:
                ((kn) d20.G0(x8.c.values())).f();
                return;
            case 3:
                x8 x8Var = x8.f5127a;
                ew3.p0("HomeBanner");
                return;
            case 4:
                x8 x8Var2 = x8.f5127a;
                ic G = zf3.G();
                if (G != null) {
                    tf3.h0(G, StartAppGuideToPurchaseActivity.class, null, 0, 6);
                    return;
                }
                return;
            case 5:
                XApplication.d();
                if (ew3.X()) {
                    du.d(675, null);
                    return;
                }
                rt3 e = rt3.e();
                e.getClass();
                String y = pd0.y(R.string.VpnAlwaysOnRequiredPremiumToast);
                if (!((XApplication) zf3.f5472a).c()) {
                    e.h.post(new to1(3, e, y));
                    return;
                }
                return;
            case 6:
                int i2 = MainActivity.y;
                if (cz.w <= 0) {
                    bx i3 = hx2.i(44);
                    boolean q = i3.q();
                    i3.h();
                    if (q) {
                        cz.v.j(1);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                du.d(242, null);
                return;
            case 8:
                du.d(184, null);
                return;
            case 9:
                boolean z = XApplication.c;
                du.d(216, null);
                du.d(243, null);
                Stack stack = XApplication.e;
                if (!stack.isEmpty() && !(stack.peek() instanceof MainActivity) && !(stack.peek() instanceof HomeActivity) && ew3.n0()) {
                    ew3.p();
                    return;
                }
                return;
            case 10:
                ew3.q();
                return;
            case 11:
                du.d(4, null);
                return;
            case 12:
                ew3.f("zst999hhzg");
                return;
            case 13:
                boolean z2 = h50.f2367a;
                ew3.q();
                rt3.e().i(false, ew3.X());
                return;
            case 14:
                t9.w0(((lt3) GoogleIABHelper.g.f1607a).getSupportFragmentManager(), d42.l);
                return;
            case 15:
                int i4 = GuideToPurchaseActivity.p;
                ew3.p0("OpenReplacement");
                return;
            case 16:
                int i5 = GuideToPurchaseNew1Activity.p;
                ew3.p0("OpenReplacement");
                return;
            case 17:
                int i6 = GuideToPurchaseNew2Activity.p;
                ew3.p0("OpenReplacement");
                return;
            case 18:
                int i7 = StartAppGuideToPurchaseActivity.n;
                ew3.p0("OpenReplacement");
                return;
            case 19:
                yb ybVar = yb.f5305b;
                XApplication.d();
                try {
                    ThreadUtil.INSTANCE.runOnUiThread(new d9(20));
                    try {
                        rx0.a().c(ew3.w());
                    } catch (Exception unused2) {
                    }
                    rt3.e().d();
                    return;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            case 20:
                yb.e.g(Boolean.TRUE);
                yb.d.g(Boolean.valueOf(ew3.o0()));
                return;
            case 21:
                AnalyticsClient.m9flushErrors$lambda3();
                return;
            case 22:
                AnalyticsClient.m11init$lambda0();
                return;
            default:
                AnalyticsClient.m10flushMetrics$lambda2();
                return;
        }
    }
}
