package defpackage;

import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class kd3 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ xc2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kd3(xc2 xc2Var, int i) {
        super(1);
        this.f = i;
        this.g = xc2Var;
    }

    public final void a(ad3 ad3Var) {
        int i;
        int i2 = this.f;
        xc2 xc2Var = this.g;
        switch (i2) {
            case 1:
                ad3Var.f61a = pd0.y(R.string.RestoreFailed);
                ad3Var.f62b = ((vc2) xc2Var).f4815a;
                ad3Var.e = pd0.y(R.string.OK);
                return;
            case 2:
                ad3Var.f61a = pd0.y(R.string.BindFailedTitle);
                ad3Var.f62b = pd0.z(R.string.PremiumBindOtherAccount, ((jc2) xc2Var).f2747a);
                ad3Var.e = pd0.y(R.string.Okay);
                return;
            default:
                ad3Var.f61a = pd0.y(R.string.Error);
                if (((nc2) xc2Var).f3435a) {
                    i = R.string.RestoreFailedNoGooglePlay;
                } else {
                    i = R.string.SubscriptionFailedNoGooglePlay;
                }
                ad3Var.f62b = pd0.y(i);
                ad3Var.e = pd0.y(R.string.Okay);
                return;
        }
    }

    @Override // defpackage.x31
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
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
