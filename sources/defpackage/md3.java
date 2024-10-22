package defpackage;

import android.text.SpannableStringBuilder;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.purchase.BaseIAPHelper;
import com.security.xvpn.z35kb.util.ColorFontSpan;
import java.util.Map;

/* loaded from: classes2.dex */
public final class md3 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public static final md3 g = new md3(0);
    public static final md3 h = new md3(1);
    public static final md3 i = new md3(2);
    public static final md3 j = new md3(3);
    public static final md3 k = new md3(4);
    public static final md3 l = new md3(5);
    public static final md3 m = new md3(6);
    public static final md3 n = new md3(7);
    public static final md3 o = new md3(8);
    public static final md3 p = new md3(9);
    public static final md3 q = new md3(10);
    public static final md3 r = new md3(11);
    public static final md3 s = new md3(12);
    public static final md3 t = new md3(13);
    public static final md3 u = new md3(14);
    public static final md3 v = new md3(15);
    public static final md3 w = new md3(16);
    public static final md3 x = new md3(17);
    public static final md3 y = new md3(18);
    public static final md3 z = new md3(19);
    public static final md3 A = new md3(20);
    public static final md3 B = new md3(21);
    public static final md3 C = new md3(22);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ md3(int i2) {
        super(1);
        this.f = i2;
    }

    public final uh1 a(mh1 mh1Var) {
        switch (this.f) {
            case 18:
                uh1 l2 = zf3.l(mh1Var, new uh1[0]);
                if (l2 == null) {
                    return (uh1) x72.f5126a.get(mh1Var);
                }
                return l2;
            default:
                uh1 l3 = zf3.l(mh1Var, new uh1[0]);
                if (l3 == null) {
                    l3 = (uh1) x72.f5126a.get(mh1Var);
                }
                if (l3 != null) {
                    return t9.K(l3);
                }
                return null;
        }
    }

    public final void b(k00 k00Var) {
        switch (this.f) {
            case 20:
                return;
            default:
                k00.a(k00Var, "JsonPrimitive", new ig1(m01.q));
                k00.a(k00Var, "JsonNull", new ig1(m01.r));
                k00.a(k00Var, "JsonLiteral", new ig1(m01.s));
                k00.a(k00Var, "JsonObject", new ig1(m01.t));
                k00.a(k00Var, "JsonArray", new ig1(m01.u));
                return;
        }
    }

    public final void c(ad3 ad3Var) {
        switch (this.f) {
            case 1:
                ad3Var.f62b = pd0.y(R.string.AccountHoldRecovered);
                ad3Var.e = pd0.y(R.string.Okay);
                ad3Var.f = e.B;
                return;
            case 2:
                ad3Var.f62b = pd0.y(R.string.TvAccountPurchaseHoldPrompt);
                ad3Var.e = pd0.y(R.string.Okay);
                ad3Var.f = e.C;
                return;
            case 3:
                ad3Var.f61a = pd0.y(R.string.ProcessFailed);
                ad3Var.f62b = pd0.y(R.string.DeleteAccountFailedVIP);
                ad3Var.e = pd0.y(R.string.Okay);
                return;
            case 8:
                ad3Var.f61a = pd0.y(R.string.ProcessFailed);
                ad3Var.f62b = pd0.y(R.string.BlockPurchaseAreaTips);
                ad3Var.e = pd0.y(R.string.Okay);
                return;
            default:
                ad3Var.f61a = pd0.y(R.string.Notice);
                ad3Var.f62b = pd0.y(R.string.AppBypassListDisconnectConfirm);
                ad3Var.c = pd0.y(R.string.Disconnect);
                ad3Var.d = e.J;
                return;
        }
    }

    public final void d(BaseIAPHelper baseIAPHelper) {
        switch (this.f) {
            case 0:
                baseIAPHelper.l();
                return;
            case 4:
                baseIAPHelper.l();
                return;
            default:
                baseIAPHelper.l();
                return;
        }
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                d((BaseIAPHelper) obj);
                return ch3Var;
            case 1:
                c((ad3) obj);
                return ch3Var;
            case 2:
                c((ad3) obj);
                return ch3Var;
            case 3:
                c((ad3) obj);
                return ch3Var;
            case 4:
                d((BaseIAPHelper) obj);
                return ch3Var;
            case 5:
                uq uqVar = (uq) obj;
                String y2 = pd0.y(R.string.TvConnectPermissionNotice);
                uqVar.q = y2;
                AppCompatTextView appCompatTextView = uqVar.i;
                if (appCompatTextView != null) {
                    appCompatTextView.setText(y2);
                }
                uqVar.m = e.G;
                return ch3Var;
            case 6:
                return ch3Var;
            case 7:
                return ch3Var;
            case 8:
                c((ad3) obj);
                return ch3Var;
            case 9:
                c((ad3) obj);
                return ch3Var;
            case 10:
                d((BaseIAPHelper) obj);
                return ch3Var;
            case 11:
                sf sfVar = (sf) obj;
                int i2 = sfVar.f4329a;
                if (i2 != 2 && i2 != 3) {
                    uf.i.g(Boolean.FALSE);
                } else {
                    uf.e = sfVar;
                    Runnable runnable = uf.f;
                    if (runnable != null) {
                        ew3.b0(runnable);
                    }
                    uf.f = null;
                    uf.i.g(Boolean.TRUE);
                }
                pe0.a("AppUpdateManager", "init success:" + sfVar);
                return ch3Var;
            case 12:
                return ((lz1) obj).f3209a;
            case 13:
                bx3.i((SpannableStringBuilder) obj, pd0.y(R.string.GuideHeaderPremiumServersHighlight), new ColorFontSpan(n01.c(), -74696));
                return ch3Var;
            case 14:
                return (String) obj;
            case 15:
                r90 r90Var = (r90) obj;
                if (!(r90Var instanceof v90)) {
                    return null;
                }
                return (v90) r90Var;
            case 16:
                r90 r90Var2 = (r90) obj;
                if (!(r90Var2 instanceof us0)) {
                    return null;
                }
                return (us0) r90Var2;
            case 17:
                return null;
            case 18:
                return a((mh1) obj);
            case 19:
                return a((mh1) obj);
            case 20:
                b((k00) obj);
                return ch3Var;
            case 21:
                b((k00) obj);
                return ch3Var;
            default:
                Map.Entry entry = (Map.Entry) obj;
                String str = (String) entry.getKey();
                eg1 eg1Var = (eg1) entry.getValue();
                StringBuilder sb = new StringBuilder();
                a23.a(sb, str);
                sb.append(':');
                sb.append(eg1Var);
                return sb.toString();
        }
    }
}
