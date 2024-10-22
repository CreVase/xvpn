package defpackage;

import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class z3 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ f4 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z3(f4 f4Var, int i) {
        super(1);
        this.f = i;
        this.g = f4Var;
    }

    public final void a(ad3 ad3Var) {
        int i = this.f;
        f4 f4Var = this.g;
        switch (i) {
            case 0:
                ad3Var.f61a = pd0.y(R.string.ProcessFailed);
                ad3Var.f62b = pd0.y(R.string.DeleteAccountNetworkFailed);
                ad3Var.c = pd0.y(R.string.Retry);
                ad3Var.d = new y3(f4Var, 0);
                return;
            case 1:
                ad3Var.f61a = pd0.y(R.string.Warning);
                ad3Var.f62b = pd0.y(R.string.TvDeleteAccountVipAlert);
                ad3Var.c = pd0.y(R.string.Delete);
                ad3Var.d = new y3(f4Var, 5);
                return;
            case 2:
                ad3Var.f61a = pd0.y(R.string.Warning);
                ad3Var.f62b = pd0.y(R.string.TvDeleteAccountFreeAlert);
                ad3Var.c = pd0.y(R.string.Delete);
                ad3Var.d = new y3(f4Var, 6);
                return;
            default:
                ad3Var.f61a = pd0.y(R.string.Notice);
                ad3Var.f62b = pd0.y(R.string.DialogSignOutConfirm);
                ad3Var.c = pd0.y(R.string.Yes);
                ad3Var.d = new y3(f4Var, 8);
                ad3Var.e = pd0.y(R.string.No);
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
            case 1:
                a((ad3) obj);
                return ch3Var;
            case 2:
                a((ad3) obj);
                return ch3Var;
            default:
                a((ad3) obj);
                return ch3Var;
        }
    }
}
