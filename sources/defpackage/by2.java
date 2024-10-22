package defpackage;

import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.speedtest.SpeedTestActivity;

/* loaded from: classes2.dex */
public final class by2 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ SpeedTestActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ by2(SpeedTestActivity speedTestActivity, int i) {
        super(1);
        this.f = i;
        this.g = speedTestActivity;
    }

    public final void a(p9 p9Var) {
        int i = 2;
        int i2 = this.f;
        SpeedTestActivity speedTestActivity = this.g;
        switch (i2) {
            case 0:
                p9Var.f3799b = pd0.y(R.string.SpeedTestInternetDataTips);
                p9.b(p9Var, pd0.y(R.string.Okay), new ay2(speedTestActivity, 0), 2);
                p9Var.h = pd0.y(R.string.Cancel);
                return;
            case 1:
                p9Var.f3798a = pd0.y(R.string.SpeedTestStopTitle);
                p9Var.f3799b = pd0.y(R.string.SpeedTestStopContent);
                p9.b(p9Var, pd0.y(R.string.Stop), new ay2(speedTestActivity, 1), 2);
                p9Var.h = pd0.y(R.string.Cancel);
                return;
            default:
                p9Var.f3798a = pd0.y(R.string.ProcessFailed);
                p9Var.f3799b = pd0.y(R.string.CheckNetworkRetry);
                p9.b(p9Var, pd0.y(R.string.Retry), new ay2(speedTestActivity, i), 2);
                p9.a(p9Var, pd0.y(R.string.Cancel), new ay2(speedTestActivity, 3), 2);
                return;
        }
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                a((p9) obj);
                return ch3Var;
            case 1:
                a((p9) obj);
                return ch3Var;
            case 2:
                p71.x((String) obj, 464);
                SpeedTestActivity speedTestActivity = this.g;
                speedTestActivity.setResult(-1);
                speedTestActivity.finish();
                return ch3Var;
            default:
                a((p9) obj);
                return ch3Var;
        }
    }
}
