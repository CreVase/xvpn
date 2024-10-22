package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.purchase.BaseIAPHelper;
import com.security.xvpn.z35kb.purchase.GoogleIABHelper;

/* loaded from: classes2.dex */
public final class d42 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public static final d42 g = new d42(0);
    public static final d42 h = new d42(1);
    public static final d42 i = new d42(2);
    public static final d42 j = new d42(3);
    public static final d42 k = new d42(4);
    public static final d42 l = new d42(5);
    public static final d42 m = new d42(6);
    public static final d42 n = new d42(7);
    public static final d42 o = new d42(8);
    public static final d42 p = new d42(9);
    public static final d42 q = new d42(10);
    public static final d42 r = new d42(11);
    public static final d42 s = new d42(12);
    public static final d42 t = new d42(13);
    public static final d42 u = new d42(14);
    public static final d42 v = new d42(15);
    public static final d42 w = new d42(16);
    public static final d42 x = new d42(17);
    public static final d42 y = new d42(19);
    public static final d42 z = new d42(20);
    public static final d42 A = new d42(21);
    public static final d42 B = new d42(22);
    public static final d42 C = new d42(23);
    public static final d42 D = new d42(24);
    public static final d42 E = new d42(25);
    public static final d42 F = new d42(26);
    public static final d42 G = new d42(27);
    public static final d42 H = new d42(28);
    public static final d42 I = new d42(29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d42(int i2) {
        super(1);
        this.f = i2;
    }

    public final void a(p9 p9Var) {
        switch (this.f) {
            case 0:
                p9Var.f3798a = pd0.y(R.string.LoginSuccess);
                p9.b(p9Var, pd0.y(R.string.OK), null, 6);
                return;
            case 1:
                p9Var.f3799b = pd0.y(R.string.ProcessFailedCheckNetwork);
                p9.b(p9Var, pd0.y(R.string.Okay), null, 6);
                return;
            case 2:
                p9Var.f3798a = pd0.y(R.string.ProcessFailed);
                p9Var.f3799b = pd0.y(R.string.AccountDeviceLimitReachedError);
                p9.b(p9Var, pd0.y(R.string.OK), null, 6);
                return;
            case 3:
                p9Var.f3798a = pd0.y(R.string.ProcessFailed);
                p9Var.f3799b = pd0.y(R.string.QRLoginFailedTips);
                p9.b(p9Var, pd0.y(R.string.Okay), null, 6);
                return;
            case 4:
            case 6:
            case 7:
            case 8:
            default:
                p9Var.f3799b = pd0.y(R.string.SpeedTestDisconnectTips);
                p9.b(p9Var, pd0.y(R.string.Disconnect), e.u, 2);
                p9.a(p9Var, pd0.y(R.string.Cancel), null, 6);
                return;
            case 5:
                p9Var.f3799b = pd0.y(R.string.AccountHoldRecovered);
                p9.b(p9Var, pd0.y(R.string.Okay), e.s, 2);
                return;
            case 9:
                p9Var.f3799b = pd0.y(R.string.UnsupportSubscriptionManage);
                p9.b(p9Var, pd0.y(R.string.OK), null, 6);
                return;
        }
    }

    public final void b(ad3 ad3Var) {
        int i2;
        switch (this.f) {
            case 15:
                ad3Var.f61a = pd0.y(R.string.ProcessFailed);
                ad3Var.f62b = pd0.y(R.string.BlockPurchaseAreaTips);
                ad3Var.e = pd0.y(R.string.Okay);
                return;
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            default:
                ad3Var.f61a = pd0.y(R.string.BindFailedTitle);
                String str = ew3.k().f4307a;
                SpannableString valueOf = SpannableString.valueOf(pd0.z(R.string.PremiumAlreadyBindFailed, str));
                Object[] objArr = new Object[1];
                Context z2 = zf3.z();
                if (z2 != null) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        Resources resources = z2.getResources();
                        if (resources != null) {
                            i2 = resources.getColor(R.color.tvBlue, z2.getTheme());
                        }
                    } else {
                        Resources resources2 = z2.getResources();
                        if (resources2 != null) {
                            i2 = resources2.getColor(R.color.tvBlue);
                        }
                    }
                    objArr[0] = new ForegroundColorSpan(i2);
                    bx3.i(valueOf, str, objArr);
                    ad3Var.f62b = valueOf;
                    ad3Var.e = pd0.y(R.string.Okay);
                    return;
                }
                i2 = -16777216;
                objArr[0] = new ForegroundColorSpan(i2);
                bx3.i(valueOf, str, objArr);
                ad3Var.f62b = valueOf;
                ad3Var.e = pd0.y(R.string.Okay);
                return;
            case 19:
                ad3Var.f61a = pd0.y(R.string.RestoreFailed);
                ad3Var.f62b = p71.m(pd0.y(R.string.PremiumBindKickedError), "\n", pd0.y(R.string.PremiumTakeBackByRestore));
                ad3.a(ad3Var, pd0.y(R.string.Cancel), null, 6);
                String y2 = pd0.y(R.string.RestorePurchase);
                e eVar = e.w;
                ad3Var.c = y2;
                ad3Var.d = eVar;
                return;
            case 22:
                ad3Var.i = false;
                ad3Var.f61a = pd0.y(R.string.NewTVUITipsTitle);
                ad3Var.f62b = pd0.y(R.string.NewTVUITipsMessage);
                ad3.a(ad3Var, pd0.y(R.string.Okay), e.x, 2);
                return;
            case 23:
                ad3Var.f61a = pd0.y(R.string.ProcessFailed);
                ad3Var.f62b = pd0.y(R.string.SupportServerFailed);
                ad3Var.e = pd0.y(R.string.Okay);
                return;
            case 24:
                ad3Var.f62b = pd0.y(R.string.UnsupportSubscriptionManage);
                ad3Var.e = pd0.y(R.string.Okay);
                return;
            case 25:
                ad3Var.f61a = pd0.y(R.string.FailedToSubscribe);
                ad3Var.f62b = pd0.y(R.string.FailedToSubscribeTvMobileActive);
                ad3Var.e = pd0.y(R.string.Okay);
                return;
            case 26:
                ad3Var.f61a = pd0.y(R.string.TvRestoreSuccess);
                ad3Var.f62b = pd0.y(R.string.TvRestoreSuccessTips);
                ad3Var.e = pd0.y(R.string.Okay);
                return;
            case 27:
                ad3Var.f61a = pd0.y(R.string.RestoreFailed);
                ad3Var.f62b = pd0.y(R.string.SubscriptionNotFound);
                ad3Var.e = pd0.y(R.string.OK);
                return;
        }
    }

    public final void c(BaseIAPHelper baseIAPHelper) {
        switch (this.f) {
            case 6:
                if (baseIAPHelper != null) {
                    baseIAPHelper.l();
                    return;
                }
                return;
            case 7:
                if (baseIAPHelper != null) {
                    baseIAPHelper.l();
                    return;
                }
                return;
            case 8:
                if (baseIAPHelper != null) {
                    baseIAPHelper.l();
                    return;
                }
                return;
            case 9:
            case 12:
            case 13:
            case 14:
            case 15:
            case 17:
            case 19:
            default:
                baseIAPHelper.d = 3842;
                baseIAPHelper.m();
                baseIAPHelper.j();
                return;
            case 10:
                baseIAPHelper.l();
                return;
            case 11:
                if (baseIAPHelper != null) {
                    baseIAPHelper.l();
                    return;
                }
                return;
            case 16:
                baseIAPHelper.l();
                return;
            case 18:
                baseIAPHelper.l();
                return;
            case 20:
                baseIAPHelper.c();
                return;
        }
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        x31 x31Var = null;
        boolean z2 = false;
        switch (this.f) {
            case 0:
                a((p9) obj);
                return ch3Var;
            case 1:
                a((p9) obj);
                return ch3Var;
            case 2:
                a((p9) obj);
                return ch3Var;
            case 3:
                a((p9) obj);
                return ch3Var;
            case 4:
                GoogleIABHelper.n = null;
                return ch3Var;
            case 5:
                a((p9) obj);
                return ch3Var;
            case 6:
                c((BaseIAPHelper) obj);
                return ch3Var;
            case 7:
                c((BaseIAPHelper) obj);
                return ch3Var;
            case 8:
                c((BaseIAPHelper) obj);
                return ch3Var;
            case 9:
                a((p9) obj);
                return ch3Var;
            case 10:
                c((BaseIAPHelper) obj);
                return ch3Var;
            case 11:
                c((BaseIAPHelper) obj);
                return ch3Var;
            case 12:
                if (!((Boolean) obj).booleanValue() && !ew3.X()) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 13:
                Context context = (Context) obj;
                String y2 = pd0.y(R.string.UpgradePremium);
                x31 x31Var2 = o12.f3581b;
                if (x31Var2 != null) {
                    x31Var = x31Var2;
                }
                return new m02(R.drawable.navigation_empty_icon, y2, (PendingIntent) x31Var.invoke(context));
            case 14:
                a((p9) obj);
                return ch3Var;
            case 15:
                b((ad3) obj);
                return ch3Var;
            case 16:
                c((BaseIAPHelper) obj);
                return ch3Var;
            case 17:
                AppCompatButton appCompatButton = ((uq) obj).k;
                if (appCompatButton != null) {
                    m20.u0(appCompatButton);
                }
                return ch3Var;
            case 18:
                c((BaseIAPHelper) obj);
                return ch3Var;
            case 19:
                b((ad3) obj);
                return ch3Var;
            case 20:
                c((BaseIAPHelper) obj);
                return ch3Var;
            case 21:
                TextView textView = (TextView) obj;
                textView.setTextSize(15.0f);
                textView.setLineSpacing(7 * tf3.F, 1.0f);
                textView.setTextColor(-6710887);
                textView.setPadding(0, tf3.K(3), 0, tf3.K(3));
                return ch3Var;
            case 22:
                b((ad3) obj);
                return ch3Var;
            case 23:
                b((ad3) obj);
                return ch3Var;
            case 24:
                b((ad3) obj);
                return ch3Var;
            case 25:
                b((ad3) obj);
                return ch3Var;
            case 26:
                b((ad3) obj);
                return ch3Var;
            case 27:
                b((ad3) obj);
                return ch3Var;
            case 28:
                c((BaseIAPHelper) obj);
                return ch3Var;
            default:
                b((ad3) obj);
                return ch3Var;
        }
    }
}
