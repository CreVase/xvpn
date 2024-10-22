package defpackage;

import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class c9 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ f43 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c9(f43 f43Var, int i) {
        super(1);
        this.f = i;
        this.g = f43Var;
    }

    public final void a(p9 p9Var) {
        int i = this.f;
        f43 f43Var = this.g;
        switch (i) {
            case 0:
                p9Var.f3798a = pd0.y(R.string.DoubleVPNNoticeDialogTitle);
                p9Var.f3799b = pd0.y(R.string.DoubleVPNNoticeDialogContent);
                p9.b(p9Var, pd0.y(R.string.Okay), new b9(f43Var, 0), 2);
                return;
            case 1:
                p9Var.f3799b = pd0.y(R.string.KillSwitchDisconnectConfirm);
                p9.b(p9Var, pd0.y(R.string.Disconnect), new b9(f43Var, 1), 2);
                p9Var.h = pd0.y(R.string.Cancel);
                return;
            case 2:
                p9Var.f3799b = pd0.y(R.string.QueryAllInstallAppDialogText);
                p9.b(p9Var, pd0.y(R.string.Continue), new b9(f43Var, 3), 2);
                p9Var.h = pd0.y(R.string.Cancel);
                return;
            case 3:
                p9Var.f3799b = pd0.y(R.string.AppBypassDisconnectConfirm);
                p9.b(p9Var, pd0.y(R.string.Disconnect), new b9(f43Var, 4), 2);
                p9Var.h = pd0.y(R.string.Cancel);
                return;
            case 4:
                p9Var.f3799b = pd0.y(R.string.QueryAllInstallAppDialogText);
                p9.b(p9Var, pd0.y(R.string.Continue), new b9(f43Var, 5), 2);
                p9Var.h = pd0.y(R.string.Cancel);
                return;
            default:
                p9Var.f3799b = pd0.y(R.string.AppBypassDisconnectConfirm);
                p9.b(p9Var, pd0.y(R.string.Disconnect), new b9(f43Var, 6), 2);
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
            case 1:
                a((p9) obj);
                return ch3Var;
            case 2:
                a((p9) obj);
                return ch3Var;
            case 3:
                a((p9) obj);
                return ch3Var;
            case 4:
                a((p9) obj);
                return ch3Var;
            default:
                a((p9) obj);
                return ch3Var;
        }
    }
}
