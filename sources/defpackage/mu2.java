package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.television.account.SignUpActivity;

/* loaded from: classes2.dex */
public final class mu2 implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3354a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SignUpActivity f3355b;

    public /* synthetic */ mu2(SignUpActivity signUpActivity, int i) {
        this.f3354a = i;
        this.f3355b = signUpActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        String str2;
        int i = this.f3354a;
        String str3 = "";
        SignUpActivity signUpActivity = this.f3355b;
        switch (i) {
            case 0:
                int i2 = SignUpActivity.q;
                hu2 R = signUpActivity.R();
                if (editable == null || (str2 = editable.toString()) == null) {
                    str2 = "";
                }
                String str4 = R.o;
                R.o = str2;
                if (!m20.L(str4, str2)) {
                    R.l.i("");
                    return;
                }
                return;
            default:
                int i3 = SignUpActivity.q;
                hu2 R2 = signUpActivity.R();
                if (editable == null || (str = editable.toString()) == null) {
                    str = "";
                }
                R2.p = str;
                yb2 d = ew3.d(str);
                ey1 ey1Var = R2.m;
                if (!m20.L(d.f5311a, "")) {
                    str3 = pd0.y(R.string.PasswordTipsNotSupportCharacter);
                }
                ey1Var.i(str3);
                R2.n.i(Integer.valueOf((int) d.f5312b));
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
