package defpackage;

import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.accelerateApp.SplitTunnelingActivity;

/* loaded from: classes2.dex */
public final class jz2 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ SplitTunnelingActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jz2(SplitTunnelingActivity splitTunnelingActivity, int i) {
        super(1);
        this.f = i;
        this.g = splitTunnelingActivity;
    }

    public final void a(p9 p9Var) {
        int i = this.f;
        SplitTunnelingActivity splitTunnelingActivity = this.g;
        switch (i) {
            case 0:
                p9Var.f3799b = pd0.y(R.string.AppBypassListDisconnectConfirm);
                p9.b(p9Var, pd0.y(R.string.Disconnect), new iz2(splitTunnelingActivity, 0), 2);
                p9Var.h = pd0.y(R.string.Cancel);
                return;
            default:
                p9Var.f3799b = pd0.y(R.string.AppBypassListDisconnectConfirm);
                p9.b(p9Var, pd0.y(R.string.Disconnect), new iz2(splitTunnelingActivity, 1), 2);
                p9Var.h = pd0.y(R.string.Cancel);
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
