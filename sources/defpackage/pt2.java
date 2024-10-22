package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.security.xvpn.z35kb.television.account.SignInActivity;

/* loaded from: classes2.dex */
public final class pt2 implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SignInActivity f3915b;

    public /* synthetic */ pt2(SignInActivity signInActivity, int i) {
        this.f3914a = i;
        this.f3915b = signInActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        String str2;
        int i = this.f3914a;
        SignInActivity signInActivity = this.f3915b;
        switch (i) {
            case 0:
                int i2 = SignInActivity.A;
                hu2 R = signInActivity.R();
                if (editable == null || (str2 = editable.toString()) == null) {
                    str2 = "";
                }
                String str3 = R.o;
                R.o = str2;
                if (!m20.L(str3, str2)) {
                    R.j.i("");
                    return;
                }
                return;
            default:
                int i3 = SignInActivity.A;
                hu2 R2 = signInActivity.R();
                if (editable == null || (str = editable.toString()) == null) {
                    str = "";
                }
                R2.p = str;
                R2.k.i("");
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
