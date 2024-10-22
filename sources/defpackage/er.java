package defpackage;

import a.bx;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.browser.BrowserToolbar;
import com.security.xvpn.z35kb.protocol.ProtocolSettingsActivity;
import com.security.xvpn.z35kb.television.account.SignInActivity;
import com.security.xvpn.z35kb.television.account.SignUpActivity;

/* loaded from: classes2.dex */
public final /* synthetic */ class er implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1976a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1977b;

    public /* synthetic */ er(Object obj, int i) {
        this.f1976a = i;
        this.f1977b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int i2;
        int i3 = this.f1976a;
        AppCompatEditText appCompatEditText = null;
        Object obj = this.f1977b;
        switch (i3) {
            case 0:
                BrowserToolbar browserToolbar = (BrowserToolbar) obj;
                if (browserToolbar.f1598a == null) {
                    return false;
                }
                String charSequence = textView.getText().toString();
                browserToolbar.K = charSequence;
                browserToolbar.b(5, charSequence);
                return true;
            case 1:
                o6 o6Var = (o6) obj;
                int i4 = ProtocolSettingsActivity.p;
                if (i != 6) {
                    return false;
                }
                o6Var.f3609b.callOnClick();
                return true;
            case 2:
                SignInActivity signInActivity = (SignInActivity) obj;
                if (i == 5) {
                    AppCompatEditText appCompatEditText2 = signInActivity.s;
                    if (appCompatEditText2 != null) {
                        appCompatEditText = appCompatEditText2;
                    }
                    xm3.g(appCompatEditText);
                    return true;
                }
                int i5 = SignInActivity.A;
                return false;
            case 3:
                SignUpActivity signUpActivity = (SignUpActivity) obj;
                if (i == 5) {
                    AppCompatEditText appCompatEditText3 = signUpActivity.l;
                    if (appCompatEditText3 != null) {
                        appCompatEditText = appCompatEditText3;
                    }
                    xm3.g(appCompatEditText);
                    return true;
                }
                int i6 = SignUpActivity.q;
                return false;
            default:
                xa2 xa2Var = (xa2) obj;
                int i7 = xa2.o;
                if (i != 6) {
                    return false;
                }
                String obj2 = textView.getText().toString();
                AppCompatEditText appCompatEditText4 = xa2Var.j;
                if (appCompatEditText4 != null) {
                    pe0.E(appCompatEditText4);
                }
                AppCompatEditText appCompatEditText5 = xa2Var.j;
                if (appCompatEditText5 != null) {
                    appCompatEditText5.clearFocus();
                }
                du3 du3Var = xa2Var.m;
                if (du3Var != null) {
                    du3Var.requestFocus();
                }
                bx j = hx2.j(obj2, 518);
                boolean q = j.q();
                j.h();
                AppCompatTextView appCompatTextView = xa2Var.n;
                if (appCompatTextView != null) {
                    m20.Y0(appCompatTextView);
                }
                if (q) {
                    AppCompatTextView appCompatTextView2 = xa2Var.n;
                    if (appCompatTextView2 != null) {
                        Context z = zf3.z();
                        if (z != null) {
                            if (Build.VERSION.SDK_INT >= 23) {
                                Resources resources = z.getResources();
                                if (resources != null) {
                                    i2 = resources.getColor(R.color.tvBlue, z.getTheme());
                                    appCompatTextView2.setTextColor(i2);
                                }
                            } else {
                                Resources resources2 = z.getResources();
                                if (resources2 != null) {
                                    i2 = resources2.getColor(R.color.tvBlue);
                                    appCompatTextView2.setTextColor(i2);
                                }
                            }
                        }
                        i2 = -16777216;
                        appCompatTextView2.setTextColor(i2);
                    }
                    AppCompatTextView appCompatTextView3 = xa2Var.n;
                    if (appCompatTextView3 != null) {
                        appCompatTextView3.setText(pd0.y(R.string.ApplySuccess));
                    }
                } else {
                    AppCompatTextView appCompatTextView4 = xa2Var.n;
                    if (appCompatTextView4 != null) {
                        appCompatTextView4.setTextColor(-3994098);
                    }
                    AppCompatTextView appCompatTextView5 = xa2Var.n;
                    if (appCompatTextView5 != null) {
                        appCompatTextView5.setText(pd0.y(R.string.ProtocolDomainInvalid));
                    }
                }
                return true;
        }
    }
}
