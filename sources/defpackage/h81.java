package defpackage;

import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.television.HomeActivity;

/* loaded from: classes2.dex */
public final class h81 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ he3 g;
    public final /* synthetic */ HomeActivity h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h81(he3 he3Var, HomeActivity homeActivity, int i) {
        super(1);
        this.f = i;
        this.g = he3Var;
        this.h = homeActivity;
    }

    public final void a(ad3 ad3Var) {
        String y;
        String y2;
        int i = this.f;
        HomeActivity homeActivity = this.h;
        he3 he3Var = this.g;
        switch (i) {
            case 0:
                ae3 ae3Var = (ae3) he3Var;
                ad3Var.f61a = ae3Var.f71b;
                ad3Var.f62b = ae3Var.c;
                int i2 = ae3Var.f70a;
                if (i2 != 1 && i2 != 2 && i2 != 3) {
                    y = pd0.y(R.string.Okay);
                } else {
                    y = pd0.y(R.string.Cancel);
                }
                ad3.a(ad3Var, y, null, 6);
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            y2 = "";
                        } else {
                            y2 = pd0.y(R.string.Retry);
                        }
                    } else {
                        y2 = pd0.y(R.string.SignIn);
                    }
                } else {
                    y2 = pd0.y(R.string.UpgradeToUnlimited);
                }
                a72 a72Var = new a72(11, he3Var, homeActivity);
                ad3Var.c = y2;
                ad3Var.d = a72Var;
                return;
            default:
                ad3Var.i = false;
                ad3Var.f61a = pd0.y(R.string.KillSwitchIsActive);
                ad3Var.f62b = ((ce3) he3Var).f619a;
                ad3.a(ad3Var, pd0.y(R.string.Recover), new i81(homeActivity, 0), 2);
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
