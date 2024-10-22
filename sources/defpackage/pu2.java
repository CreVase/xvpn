package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.widget.PasswordStrengthBar;

/* loaded from: classes2.dex */
public final class pu2 extends u73 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3921a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qu2 f3922b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pu2(qu2 qu2Var, int i) {
        super(1);
        this.f3921a = i;
        this.f3922b = qu2Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = this.f3921a;
        qu2 qu2Var = this.f3922b;
        switch (i) {
            case 0:
                qu2Var.d.o("");
                return;
            default:
                yb2 d = ew3.d(qu2Var.d.q.getText().toString());
                ((PasswordStrengthBar) qu2Var.e.c).setPasswordLevel((int) d.f5312b);
                if (!"".equals(d.f5311a)) {
                    qu2Var.d.p(pd0.y(R.string.PasswordTipsNotSupportCharacter));
                    return;
                } else {
                    qu2Var.d.p("");
                    return;
                }
        }
    }

    @Override // defpackage.u73, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.f3921a) {
            case 0:
                qu2 qu2Var = this.f3922b;
                String obj = qu2Var.d.p.getText().toString();
                String replaceAll = obj.replaceAll(" ", "");
                if (!TextUtils.equals(obj, replaceAll)) {
                    qu2Var.d.p.setText(replaceAll);
                    qu2Var.d.p.setSelection(i);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
