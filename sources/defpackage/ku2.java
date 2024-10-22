package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.television.account.SignUpActivity;

/* loaded from: classes2.dex */
public final class ku2 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ SignUpActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ku2(SignUpActivity signUpActivity, int i) {
        super(1);
        this.f = i;
        this.g = signUpActivity;
    }

    public final void a(ad3 ad3Var) {
        int i = this.f;
        SignUpActivity signUpActivity = this.g;
        switch (i) {
            case 5:
                ad3Var.f61a = pd0.y(R.string.SignInFailed);
                ad3Var.f62b = pd0.y(R.string.TVAccountDeviceLimitReachedError);
                ad3Var.e = pd0.y(R.string.Okay);
                ad3Var.f = new lu2(signUpActivity, 1);
                ad3Var.g = new ku2(signUpActivity, 4);
                return;
            default:
                ad3Var.f61a = pd0.y(R.string.CreateAccountFailed);
                ad3Var.f62b = pd0.y(R.string.ProcessFailedCheckNetwork);
                ad3Var.e = pd0.y(R.string.Okay);
                ad3Var.f = new lu2(signUpActivity, 2);
                ad3Var.g = new ku2(signUpActivity, 7);
                return;
        }
    }

    public final void b(Boolean bool) {
        int i = this.f;
        SignUpActivity signUpActivity = this.g;
        switch (i) {
            case 2:
                if (bool.booleanValue()) {
                    lu2 lu2Var = new lu2(signUpActivity, 0);
                    signUpActivity.getClass();
                    signUpActivity.O(pd0.y(R.string.LoadingNormalText), lu2Var);
                    return;
                }
                signUpActivity.N();
                return;
            case 6:
                if (bool.booleanValue()) {
                    m20.a1(signUpActivity, new ku2(signUpActivity, 5));
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    m20.a1(signUpActivity, new ku2(signUpActivity, 8));
                    return;
                }
                return;
        }
    }

    public final void c(String str) {
        int i = this.f;
        AppCompatImageView appCompatImageView = null;
        SignUpActivity signUpActivity = this.g;
        switch (i) {
            case 0:
                AppCompatTextView appCompatTextView = signUpActivity.m;
                if (appCompatTextView == null) {
                    appCompatTextView = null;
                }
                appCompatTextView.setText(str);
                eu3 eu3Var = signUpActivity.h;
                if (eu3Var == null) {
                    eu3Var = null;
                }
                eu3Var.setBackground(xm3.b(str));
                AppCompatImageView appCompatImageView2 = signUpActivity.f;
                if (appCompatImageView2 != null) {
                    appCompatImageView = appCompatImageView2;
                }
                appCompatImageView.setImageTintList(xm3.a(str));
                return;
            default:
                AppCompatTextView appCompatTextView2 = signUpActivity.n;
                if (appCompatTextView2 == null) {
                    appCompatTextView2 = null;
                }
                appCompatTextView2.setText(str);
                eu3 eu3Var2 = signUpActivity.i;
                if (eu3Var2 == null) {
                    eu3Var2 = null;
                }
                eu3Var2.setBackground(xm3.b(str));
                AppCompatImageView appCompatImageView3 = signUpActivity.g;
                if (appCompatImageView3 != null) {
                    appCompatImageView = appCompatImageView3;
                }
                appCompatImageView.setImageTintList(xm3.a(str));
                return;
        }
    }

    public final void d() {
        int i = this.f;
        SignUpActivity signUpActivity = this.g;
        switch (i) {
            case 4:
                int i2 = SignUpActivity.q;
                signUpActivity.R().g.i(Boolean.FALSE);
                return;
            default:
                int i3 = SignUpActivity.q;
                signUpActivity.R().i.i(Boolean.FALSE);
                return;
        }
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        boolean z;
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                c((String) obj);
                return ch3Var;
            case 1:
                c((String) obj);
                return ch3Var;
            case 2:
                b((Boolean) obj);
                return ch3Var;
            case 3:
                Integer num = (Integer) obj;
                for (int i = 0; i < 3; i++) {
                    eu3 eu3Var = this.g.o;
                    if (eu3Var == null) {
                        eu3Var = null;
                    }
                    View childAt = eu3Var.getChildAt(i);
                    if (i < num.intValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    childAt.setSelected(z);
                }
                return ch3Var;
            case 4:
                d();
                return ch3Var;
            case 5:
                a((ad3) obj);
                return ch3Var;
            case 6:
                b((Boolean) obj);
                return ch3Var;
            case 7:
                d();
                return ch3Var;
            case 8:
                a((ad3) obj);
                return ch3Var;
            default:
                b((Boolean) obj);
                return ch3Var;
        }
    }
}
