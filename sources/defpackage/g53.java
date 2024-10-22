package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.net.VpnService;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.connlog.ConnectionLogActivity;
import com.security.xvpn.z35kb.purchase.GoogleIABHelper;
import com.security.xvpn.z35kb.purchase.GuideToPurchaseActivity;
import com.security.xvpn.z35kb.purchase.GuideToPurchaseNew1Activity;
import com.security.xvpn.z35kb.purchase.StartAppGuideToPurchaseActivity;
import com.security.xvpn.z35kb.quickconn.QuickConnectService;
import com.security.xvpn.z35kb.server.ServerChooseActivity;
import com.security.xvpn.z35kb.television.SplashActivity;
import com.security.xvpn.z35kb.widget.ConnectView;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.util.ActivityManager;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class g53 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2209a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2210b;

    public /* synthetic */ g53(Object obj, int i) {
        this.f2209a = i;
        this.f2210b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2209a;
        eu3 eu3Var = null;
        Intent intent = null;
        Object obj = this.f2210b;
        switch (i) {
            case 0:
                ((Bitmap) obj).recycle();
                return;
            case 1:
                eu3 eu3Var2 = ((ConnectionLogActivity) obj).k;
                if (eu3Var2 != null) {
                    eu3Var = eu3Var2;
                }
                tf3.V(eu3Var);
                return;
            case 2:
                List list = (List) obj;
                GoogleIABHelper googleIABHelper = GoogleIABHelper.g;
                googleIABHelper.getClass();
                list.isEmpty();
                googleIABHelper.o(pd0.y(R.string.LoadingAddPremium));
                ew3.b0(new cq0(18, googleIABHelper, list, ""));
                return;
            case 3:
                GoogleIABHelper.g.q("hk2rhsb287," + ((wp) obj).f5050a);
                return;
            case 4:
                int i2 = GuideToPurchaseActivity.p;
                ((GuideToPurchaseActivity) obj).e0();
                return;
            case 5:
                int i3 = GuideToPurchaseNew1Activity.p;
                ((GuideToPurchaseNew1Activity) obj).e0();
                return;
            case 6:
                int i4 = StartAppGuideToPurchaseActivity.n;
                ((StartAppGuideToPurchaseActivity) obj).c0();
                return;
            case 7:
                QuickConnectService quickConnectService = (QuickConnectService) obj;
                int i5 = QuickConnectService.d;
                XApplication.d();
                ya0.h = true;
                if (!ew3.X()) {
                    quickConnectService.getClass();
                    x31 x31Var = o12.f3580a;
                    d5.r(quickConnectService);
                    t23.a().b(quickConnectService, quickConnectService.f1614b);
                    return;
                }
                try {
                    intent = VpnService.prepare(quickConnectService);
                } catch (Throwable unused) {
                }
                if (intent != null) {
                    x31 x31Var2 = o12.f3580a;
                    d5.r(quickConnectService);
                    t23.a().b(quickConnectService, 1000000);
                    return;
                } else {
                    if (rt3.e().f4214b == 65286 || rt3.e().f4214b == 65285) {
                        ew3.S();
                    }
                    m20.R();
                    ew3.L0("UiTapToggleConnect", pe0.b());
                    pe0.e();
                    return;
                }
            case 8:
                boolean z = ServerChooseActivity.u;
                ((ServerChooseActivity) obj).n.j(ew3.I());
                return;
            case 9:
                AppCompatTextView appCompatTextView = (AppCompatTextView) obj;
                int i6 = SplashActivity.i;
                appCompatTextView.getPaint().setShader(new LinearGradient(0.0f, appCompatTextView.getHeight() / 2.0f, appCompatTextView.getWidth(), appCompatTextView.getHeight() / 2.0f, -12267312, -16759483, Shader.TileMode.REPEAT));
                appCompatTextView.invalidate();
                return;
            case 10:
                ConnectView connectView = (ConnectView) obj;
                connectView.s = false;
                connectView.invalidate();
                return;
            case 11:
                OMInjector.a((OMInjector) obj);
                return;
            default:
                ActivityManager.m93configChangeRunnable$lambda0((ActivityManager) obj);
                return;
        }
    }
}
