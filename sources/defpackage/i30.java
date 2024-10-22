package defpackage;

import androidx.activity.ComponentActivity;
import com.security.xvpn.z35kb.WebViewActivity;
import com.security.xvpn.z35kb.browser.PrivateBrowser;
import com.security.xvpn.z35kb.purchase.PurchaseActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class i30 implements v31 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2526a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2527b;

    public /* synthetic */ i30(Object obj, int i) {
        this.f2526a = i;
        this.f2527b = obj;
    }

    @Override // defpackage.v31
    public final Object invoke() {
        ch3 ch3Var = ch3.f636a;
        int i = this.f2526a;
        Object obj = this.f2527b;
        switch (i) {
            case 0:
                ((ComponentActivity) obj).reportFullyDrawn();
                return null;
            case 1:
                dp1 dp1Var = (dp1) obj;
                int i2 = dp1.q;
                tf3.x((dn) dp1Var.getActivity(), ew3.S0(), new bp1(dp1Var, 0));
                return null;
            case 2:
                ya0.H(((cp1) obj).c.getActivity(), PurchaseActivity.class);
                return ch3Var;
            case 3:
                int i3 = WebViewActivity.q;
                ((WebViewActivity) obj).finish();
                return ch3Var;
            case 4:
                lt3 lt3Var = (lt3) obj;
                int i4 = lt3.g;
                lt3Var.getClass();
                bx3.a(lt3Var);
                return ch3Var;
            default:
                int i5 = PrivateBrowser.L;
                ((PrivateBrowser) obj).finish();
                return ch3Var;
        }
    }
}
