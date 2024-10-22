package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.textfield.TextInputLayout;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.account.ResetPasswordActivity;
import com.security.xvpn.z35kb.livechat.ChatActivity;
import com.security.xvpn.z35kb.server.ServerChooseActivity;
import com.security.xvpn.z35kb.widget.PasswordStrengthBar;

/* loaded from: classes.dex */
public final class xn2 implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5190b;

    public /* synthetic */ xn2(Object obj, int i) {
        this.f5189a = i;
        this.f5190b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        int i = this.f5189a;
        boolean z = false;
        Object obj = this.f5190b;
        switch (i) {
            case 0:
                return;
            case 1:
                TextInputLayout textInputLayout = (TextInputLayout) obj;
                textInputLayout.u(!textInputLayout.L0, false);
                if (textInputLayout.k) {
                    textInputLayout.n(editable);
                }
                if (textInputLayout.s) {
                    textInputLayout.v(editable);
                    return;
                }
                return;
            case 2:
                ResetPasswordActivity resetPasswordActivity = (ResetPasswordActivity) obj;
                int i2 = ResetPasswordActivity.o;
                yb2 d = ew3.d(String.valueOf(resetPasswordActivity.a0().s.getText()));
                ((PasswordStrengthBar) resetPasswordActivity.b0().c).setPasswordLevel((int) d.f5312b);
                if (m20.L("", d.f5311a)) {
                    str = "";
                } else {
                    str = pd0.y(R.string.PasswordTipsNotSupportCharacter);
                }
                resetPasswordActivity.a0().w.setText(str);
                fl.g0(resetPasswordActivity.a0().w, !m20.L(str, ""));
                return;
            case 3:
                AppCompatImageView appCompatImageView = ((ChatActivity) obj).Z().h;
                if (i23.u1(editable.toString()).toString().length() > 0) {
                    z = true;
                }
                appCompatImageView.setEnabled(z);
                return;
            case 4:
                int i3 = jz.l;
                ((jz) obj).c();
                return;
            case 5:
                ((ServerChooseActivity) obj).m.i(String.valueOf(editable));
                return;
            case 6:
                return;
            default:
                int i4 = e8.j;
                ((e8) obj).z();
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f5189a;
        Object obj = this.f5190b;
        switch (i4) {
            case 0:
                SearchView searchView = (SearchView) obj;
                Editable text = searchView.p.getText();
                searchView.k0 = text;
                boolean z = !TextUtils.isEmpty(text);
                searchView.x(z);
                boolean z2 = !z;
                int i5 = 8;
                if (searchView.j0 && !searchView.N && z2) {
                    searchView.u.setVisibility(8);
                    i5 = 0;
                }
                searchView.w.setVisibility(i5);
                searchView.t();
                searchView.w();
                charSequence.toString();
                searchView.getClass();
                return;
            case 6:
                in1 in1Var = (in1) obj;
                if (charSequence == null) {
                    charSequence = "";
                }
                in1.D(in1Var, charSequence.toString());
                return;
            default:
                return;
        }
    }
}
