package defpackage;

import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.WebViewActivity;
import com.security.xvpn.z35kb.browser.PrivateBrowser;
import com.security.xvpn.z35kb.menu.OtherDevicesForPlayStationActivity;
import com.security.xvpn.z35kb.view.a;

/* loaded from: classes2.dex */
public final /* synthetic */ class bp1 implements x31 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f503a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f504b;

    public /* synthetic */ bp1(Object obj, int i) {
        this.f503a = i;
        this.f504b = obj;
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        boolean z;
        ch3 ch3Var = ch3.f636a;
        int i = this.f503a;
        Object obj2 = this.f504b;
        switch (i) {
            case 0:
                ((dp1) obj2).e.d0();
                return null;
            case 1:
                cp1 cp1Var = (cp1) obj2;
                p9 p9Var = (p9) obj;
                cp1Var.getClass();
                p9Var.f3799b = pd0.y(R.string.DialogBrowserPremium);
                p9Var.d = pd0.y(R.string.GoPremium);
                p9Var.f = new i30(cp1Var, 2);
                p9Var.h = pd0.y(R.string.Cancel);
                return ch3Var;
            case 2:
                WebViewActivity webViewActivity = (WebViewActivity) obj2;
                p9 p9Var2 = (p9) obj;
                int i2 = WebViewActivity.q;
                webViewActivity.getClass();
                p9Var2.f3798a = pd0.y(R.string.Error);
                p9Var2.f3799b = pd0.y(R.string.DialogMissWebViewError);
                p9Var2.d = pd0.y(R.string.Close);
                p9Var2.f = new i30(webViewActivity, 3);
                return ch3Var;
            case 3:
                lt3 lt3Var = (lt3) obj2;
                p9 p9Var3 = (p9) obj;
                int i3 = lt3.g;
                lt3Var.getClass();
                p9Var3.f3798a = pd0.y(R.string.ProcessFailed);
                p9Var3.f3799b = pd0.y(R.string.SupportServerFailed);
                p9Var3.h = pd0.y(R.string.ContactUs);
                p9Var3.d = pd0.y(R.string.Cancel);
                p9Var3.j = new i30(lt3Var, 4);
                return ch3Var;
            case 4:
                PrivateBrowser privateBrowser = (PrivateBrowser) obj2;
                p9 p9Var4 = (p9) obj;
                int i4 = PrivateBrowser.L;
                privateBrowser.getClass();
                p9Var4.f3798a = pd0.y(R.string.Error);
                p9Var4.f3799b = pd0.y(R.string.DialogMissWebViewError);
                p9Var4.d = pd0.y(R.string.Close);
                p9Var4.f = new i30(privateBrowser, 5);
                return ch3Var;
            case 5:
                if (!((OtherDevicesForPlayStationActivity) obj2).n.isChecked() && !ew3.X()) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                p9 p9Var5 = (p9) obj;
                p9Var5.f3799b = ((a) obj2).m;
                p9Var5.d = pd0.y(R.string.Okay);
                return ch3Var;
        }
    }
}
