package defpackage;

import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.server.ServerChooseActivity;

/* loaded from: classes2.dex */
public final class cq2 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ServerChooseActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cq2(ServerChooseActivity serverChooseActivity, int i) {
        super(1);
        this.f = i;
        this.g = serverChooseActivity;
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        int i = this.f;
        ServerChooseActivity serverChooseActivity = this.g;
        switch (i) {
            case 0:
                ew3.T0((String) obj);
                serverChooseActivity.setResult(-1);
                serverChooseActivity.finish();
                return ch3Var;
            case 1:
                tf3.x(serverChooseActivity, ((zp2) obj).a(), new cq2(serverChooseActivity, 0));
                return ch3Var;
            default:
                p9 p9Var = (p9) obj;
                p9Var.f3798a = "Your current subscription(For Streaming) does not include the selected location.";
                p9Var.f3799b = "You may upgrade your subscription after the current one ends or with a different account.";
                p9.b(p9Var, pd0.y(R.string.ContactUs), new yy2(serverChooseActivity, 16), 2);
                p9Var.h = pd0.y(R.string.Cancel);
                return ch3Var;
        }
    }
}
