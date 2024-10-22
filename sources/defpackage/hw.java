package defpackage;

import android.text.Editable;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.account.ChangePasswordActivity;
import com.security.xvpn.z35kb.widget.PasswordStrengthBar;

/* loaded from: classes2.dex */
public final class hw extends u73 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2494a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChangePasswordActivity f2495b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hw(ChangePasswordActivity changePasswordActivity, int i) {
        super(1);
        this.f2494a = i;
        this.f2495b = changePasswordActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = this.f2494a;
        ChangePasswordActivity changePasswordActivity = this.f2495b;
        switch (i) {
            case 0:
                yb2 d = ew3.d(changePasswordActivity.k.r.getText().toString());
                ((PasswordStrengthBar) changePasswordActivity.l.c).setPasswordLevel((int) d.f5312b);
                if (!"".equals(d.f5311a)) {
                    changePasswordActivity.k.p(pd0.y(R.string.PasswordTipsNotSupportCharacter));
                    return;
                } else {
                    changePasswordActivity.k.p("");
                    return;
                }
            default:
                changePasswordActivity.k.o("");
                return;
        }
    }
}
