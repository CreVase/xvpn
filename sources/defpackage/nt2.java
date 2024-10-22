package defpackage;

import com.security.xvpn.z35kb.television.account.SignInActivity;

/* loaded from: classes2.dex */
public final class nt2 extends ji1 implements v31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ SignInActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nt2(SignInActivity signInActivity, int i) {
        super(0);
        this.f = i;
        this.g = signInActivity;
    }

    @Override // defpackage.v31
    public final /* bridge */ /* synthetic */ Object invoke() {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                m111invoke();
                return ch3Var;
            case 1:
                m111invoke();
                return ch3Var;
            default:
                m111invoke();
                return ch3Var;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m111invoke() {
        int i = this.f;
        SignInActivity signInActivity = this.g;
        switch (i) {
            case 0:
                int i2 = SignInActivity.A;
                signInActivity.R().f.i(Boolean.FALSE);
                return;
            case 1:
                int i3 = SignInActivity.A;
                signInActivity.R().g.i(Boolean.FALSE);
                return;
            default:
                int i4 = SignInActivity.A;
                signInActivity.R().h.i(Boolean.FALSE);
                return;
        }
    }
}
