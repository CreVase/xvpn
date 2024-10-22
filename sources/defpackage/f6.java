package defpackage;

import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class f6 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ x31 g;
    public final /* synthetic */ zp2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f6(x31 x31Var, zp2 zp2Var, int i) {
        super(1);
        this.f = i;
        this.g = x31Var;
        this.h = zp2Var;
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        int i = this.f;
        zp2 zp2Var = this.h;
        x31 x31Var = this.g;
        switch (i) {
            case 0:
                p9 p9Var = (p9) obj;
                p9Var.f3798a = pd0.y(R.string.StreamingLineTipsTitle);
                p9Var.f3799b = pd0.y(R.string.StreamingLineTips);
                p9.b(p9Var, pd0.y(R.string.Okay), new e6(x31Var, zp2Var, 0), 2);
                p9.a(p9Var, pd0.y(R.string.DontRemindMeAgain), new e6(x31Var, zp2Var, 1), 2);
                return ch3Var;
            default:
                ad3 ad3Var = (ad3) obj;
                ad3Var.f61a = pd0.y(R.string.StreamingLineTipsTitle);
                ad3Var.f62b = pd0.y(R.string.StreamingLineTips);
                ad3.a(ad3Var, pd0.y(R.string.Okay), new e6(x31Var, zp2Var, 2), 2);
                String y = pd0.y(R.string.DontRemindMeAgain);
                e6 e6Var = new e6(x31Var, zp2Var, 3);
                ad3Var.c = y;
                ad3Var.d = e6Var;
                return ch3Var;
        }
    }
}
