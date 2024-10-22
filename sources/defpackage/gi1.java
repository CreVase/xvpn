package defpackage;

import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class gi1 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ hi1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gi1(hi1 hi1Var, int i) {
        super(1);
        this.f = i;
        this.g = hi1Var;
    }

    public final void a(ad3 ad3Var) {
        int i = this.f;
        hi1 hi1Var = this.g;
        switch (i) {
            case 0:
                ad3Var.f61a = pd0.y(R.string.Notice);
                ad3Var.f62b = pd0.y(R.string.KillSwitchDisconnectConfirm);
                ad3Var.c = pd0.y(R.string.Disconnect);
                ad3Var.d = new fi1(hi1Var, 0);
                return;
            default:
                ad3Var.f61a = pd0.y(R.string.Notice);
                ad3Var.f62b = pd0.y(R.string.KillSwitchConfirm);
                ad3Var.e = pd0.y(R.string.Okay);
                ad3Var.f = new fi1(hi1Var, 1);
                return;
        }
    }

    @Override // defpackage.x31
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                a((ad3) obj);
                return ch3Var;
            default:
                a((ad3) obj);
                return ch3Var;
        }
    }
}
