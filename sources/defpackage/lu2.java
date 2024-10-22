package defpackage;

import com.security.xvpn.z35kb.television.account.SignUpActivity;

/* loaded from: classes2.dex */
public final class lu2 extends ji1 implements v31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ SignUpActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lu2(SignUpActivity signUpActivity, int i) {
        super(0);
        this.f = i;
        this.g = signUpActivity;
    }

    @Override // defpackage.v31
    public final /* bridge */ /* synthetic */ Object invoke() {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                m109invoke();
                return ch3Var;
            case 1:
                m109invoke();
                return ch3Var;
            default:
                m109invoke();
                return ch3Var;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m109invoke() {
        int i = this.f;
        SignUpActivity signUpActivity = this.g;
        switch (i) {
            case 0:
                int i2 = SignUpActivity.q;
                signUpActivity.R().f.i(Boolean.FALSE);
                return;
            case 1:
                int i3 = SignUpActivity.q;
                signUpActivity.R().g.i(Boolean.FALSE);
                return;
            default:
                int i4 = SignUpActivity.q;
                signUpActivity.R().i.i(Boolean.FALSE);
                return;
        }
    }
}
