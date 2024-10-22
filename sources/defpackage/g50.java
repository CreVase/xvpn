package defpackage;

import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class g50 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ dn g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g50(dn dnVar, int i) {
        super(1);
        this.f = i;
        this.g = dnVar;
    }

    public final void a(p9 p9Var) {
        int i = this.f;
        dn dnVar = this.g;
        switch (i) {
            case 0:
                p9Var.f3798a = pd0.y(R.string.Tips);
                p9Var.f3799b = pd0.y(R.string.AccountExpiredError);
                p9Var.h = pd0.y(R.string.Cancel);
                p9.b(p9Var, pd0.y(R.string.SignIn), new tc0(dnVar, 5), 2);
                return;
            default:
                p9Var.f3798a = pd0.y(R.string.Disconnected);
                p9Var.f3799b = pd0.y(R.string.DisconnectByLimitTips);
                p9Var.d = pd0.y(R.string.UpgradeToUnlimited);
                p9Var.f = new tc0(dnVar, 6);
                p9Var.m.add(new o9(pd0.y(R.string.Cancel)));
                p9Var.k = y62.E;
                return;
        }
    }

    @Override // defpackage.x31
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                a((p9) obj);
                return ch3Var;
            default:
                a((p9) obj);
                return ch3Var;
        }
    }
}
