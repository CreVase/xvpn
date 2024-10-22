package defpackage;

import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.account.ChangePasswordActivity;
import com.security.xvpn.z35kb.television.HomeActivity;

/* loaded from: classes2.dex */
public final /* synthetic */ class gw implements v31 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2331a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChangePasswordActivity f2332b;

    public /* synthetic */ gw(ChangePasswordActivity changePasswordActivity, int i) {
        this.f2331a = i;
        this.f2332b = changePasswordActivity;
    }

    @Override // defpackage.v31
    public final Object invoke() {
        ch3 ch3Var = ch3.f636a;
        int i = this.f2331a;
        ChangePasswordActivity changePasswordActivity = this.f2332b;
        switch (i) {
            case 0:
                int i2 = ChangePasswordActivity.q;
                changePasswordActivity.getClass();
                if (XApplication.c) {
                    ya0.I(changePasswordActivity, HomeActivity.class);
                } else {
                    ya0.I(changePasswordActivity, MainActivity.class);
                }
                return ch3Var;
            case 1:
                int i3 = ChangePasswordActivity.q;
                changePasswordActivity.onBackPressed();
                return ch3Var;
            default:
                int i4 = ChangePasswordActivity.q;
                changePasswordActivity.onBackPressed();
                return ch3Var;
        }
    }
}
