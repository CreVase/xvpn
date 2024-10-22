package defpackage;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.television.account.SignInActivity;

/* loaded from: classes2.dex */
public final class mt2 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ SignInActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mt2(SignInActivity signInActivity, int i) {
        super(1);
        this.f = i;
        this.g = signInActivity;
    }

    public final void a(ad3 ad3Var) {
        int i = this.f;
        SignInActivity signInActivity = this.g;
        switch (i) {
            case 7:
                ad3Var.f61a = pd0.y(R.string.SignInFailed);
                ad3Var.f62b = pd0.y(R.string.TVAccountDeviceLimitReachedError);
                ad3Var.e = pd0.y(R.string.Okay);
                ad3Var.f = new nt2(signInActivity, 1);
                ad3Var.g = new mt2(signInActivity, 6);
                return;
            default:
                ad3Var.f61a = pd0.y(R.string.SignInFailed);
                ad3Var.f62b = pd0.y(R.string.ProcessFailedCheckNetwork);
                ad3Var.e = pd0.y(R.string.Okay);
                ad3Var.f = new nt2(signInActivity, 2);
                ad3Var.g = new mt2(signInActivity, 9);
                return;
        }
    }

    public final void b(Boolean bool) {
        int i = this.f;
        SignInActivity signInActivity = this.g;
        switch (i) {
            case 5:
                if (bool.booleanValue()) {
                    nt2 nt2Var = new nt2(signInActivity, 0);
                    signInActivity.getClass();
                    signInActivity.O(pd0.y(R.string.LoadingNormalText), nt2Var);
                    return;
                }
                signInActivity.N();
                return;
            case 8:
                if (bool.booleanValue()) {
                    m20.a1(signInActivity, new mt2(signInActivity, 7));
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    m20.a1(signInActivity, new mt2(signInActivity, 10));
                    return;
                }
                return;
        }
    }

    public final void c(String str) {
        boolean z;
        int i = this.f;
        SignInActivity signInActivity = this.g;
        AppCompatImageView appCompatImageView = null;
        AppCompatImageView appCompatImageView2 = null;
        AppCompatTextView appCompatTextView = null;
        AppCompatTextView appCompatTextView2 = null;
        AppCompatTextView appCompatTextView3 = null;
        eu3 eu3Var = null;
        switch (i) {
            case 0:
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    eu3 eu3Var2 = signInActivity.k;
                    if (eu3Var2 == null) {
                        eu3Var2 = null;
                    }
                    tf3.v0(eu3Var2);
                    eu3 eu3Var3 = signInActivity.i;
                    if (eu3Var3 == null) {
                        eu3Var3 = null;
                    }
                    tf3.V(eu3Var3);
                    AppCompatTextView appCompatTextView4 = signInActivity.l;
                    if (appCompatTextView4 != null) {
                        appCompatTextView3 = appCompatTextView4;
                    }
                    appCompatTextView3.setText(str);
                    return;
                }
                eu3 eu3Var4 = signInActivity.k;
                if (eu3Var4 == null) {
                    eu3Var4 = null;
                }
                tf3.V(eu3Var4);
                eu3 eu3Var5 = signInActivity.i;
                if (eu3Var5 != null) {
                    eu3Var = eu3Var5;
                }
                tf3.v0(eu3Var);
                return;
            case 1:
                AppCompatTextView appCompatTextView5 = signInActivity.j;
                if (appCompatTextView5 != null) {
                    appCompatTextView2 = appCompatTextView5;
                }
                appCompatTextView2.setText(str);
                return;
            case 2:
                AppCompatTextView appCompatTextView6 = signInActivity.m;
                if (appCompatTextView6 != null) {
                    appCompatTextView = appCompatTextView6;
                }
                appCompatTextView.setText(str);
                return;
            case 3:
                AppCompatTextView appCompatTextView7 = signInActivity.t;
                if (appCompatTextView7 == null) {
                    appCompatTextView7 = null;
                }
                appCompatTextView7.setText(str);
                eu3 eu3Var6 = signInActivity.p;
                if (eu3Var6 == null) {
                    eu3Var6 = null;
                }
                eu3Var6.setBackground(xm3.b(str));
                AppCompatImageView appCompatImageView3 = signInActivity.n;
                if (appCompatImageView3 != null) {
                    appCompatImageView2 = appCompatImageView3;
                }
                appCompatImageView2.setImageTintList(xm3.a(str));
                return;
            default:
                AppCompatTextView appCompatTextView8 = signInActivity.u;
                if (appCompatTextView8 == null) {
                    appCompatTextView8 = null;
                }
                appCompatTextView8.setText(str);
                eu3 eu3Var7 = signInActivity.q;
                if (eu3Var7 == null) {
                    eu3Var7 = null;
                }
                eu3Var7.setBackground(xm3.b(str));
                AppCompatImageView appCompatImageView4 = signInActivity.o;
                if (appCompatImageView4 != null) {
                    appCompatImageView = appCompatImageView4;
                }
                appCompatImageView.setImageTintList(xm3.a(str));
                return;
        }
    }

    public final void d() {
        int i = this.f;
        SignInActivity signInActivity = this.g;
        switch (i) {
            case 6:
                int i2 = SignInActivity.A;
                signInActivity.R().g.i(Boolean.FALSE);
                return;
            default:
                int i3 = SignInActivity.A;
                signInActivity.R().h.i(Boolean.FALSE);
                return;
        }
    }

    @Override // defpackage.x31
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                c((String) obj);
                return ch3Var;
            case 1:
                c((String) obj);
                return ch3Var;
            case 2:
                c((String) obj);
                return ch3Var;
            case 3:
                c((String) obj);
                return ch3Var;
            case 4:
                c((String) obj);
                return ch3Var;
            case 5:
                b((Boolean) obj);
                return ch3Var;
            case 6:
                d();
                return ch3Var;
            case 7:
                a((ad3) obj);
                return ch3Var;
            case 8:
                b((Boolean) obj);
                return ch3Var;
            case 9:
                d();
                return ch3Var;
            case 10:
                a((ad3) obj);
                return ch3Var;
            default:
                b((Boolean) obj);
                return ch3Var;
        }
    }
}
