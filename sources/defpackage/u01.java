package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import com.security.xvpn.z35kb.account.ForgetPasswordActivity;
import com.security.xvpn.z35kb.browser.BrowserToolbar;
import com.security.xvpn.z35kb.protocol.ProtocolSettingsActivity;

/* loaded from: classes2.dex */
public final class u01 extends u73 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4606b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u01(Object obj, int i) {
        super(1);
        this.f4605a = i;
        this.f4606b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = this.f4605a;
        Object obj = this.f4606b;
        switch (i) {
            case 0:
                ((ForgetPasswordActivity) obj).o.p("");
                return;
            case 1:
                ((wt2) obj).d.o("");
                return;
            case 2:
                BrowserToolbar browserToolbar = (BrowserToolbar) obj;
                fr frVar = browserToolbar.f1598a;
                if (frVar != null) {
                    frVar.a(9, editable.toString());
                }
                browserToolbar.postInvalidateOnAnimation();
                return;
            default:
                ((ProtocolSettingsActivity) obj).o = editable.toString();
                return;
        }
    }

    @Override // defpackage.u73, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f4605a;
        Object obj = this.f4606b;
        switch (i4) {
            case 0:
                ForgetPasswordActivity forgetPasswordActivity = (ForgetPasswordActivity) obj;
                String obj2 = forgetPasswordActivity.k.getText().toString();
                String replaceAll = obj2.replaceAll(" ", "");
                if (!TextUtils.equals(obj2, replaceAll)) {
                    forgetPasswordActivity.k.setText(replaceAll);
                    forgetPasswordActivity.k.setSelection(i);
                    return;
                }
                return;
            case 1:
                wt2 wt2Var = (wt2) obj;
                String obj3 = wt2Var.d.p.getText().toString();
                String replaceAll2 = obj3.replaceAll(" ", "");
                if (!TextUtils.equals(obj3, replaceAll2)) {
                    wt2Var.d.p.setText(replaceAll2);
                    wt2Var.d.p.setSelection(i);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
