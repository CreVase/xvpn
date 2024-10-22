package defpackage;

import com.security.xvpn.z35kb.speedtest.SpeedTestActivity;

/* loaded from: classes2.dex */
public final class ay2 extends ji1 implements v31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ SpeedTestActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ay2(SpeedTestActivity speedTestActivity, int i) {
        super(0);
        this.f = i;
        this.g = speedTestActivity;
    }

    @Override // defpackage.v31
    public final /* bridge */ /* synthetic */ Object invoke() {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                m2invoke();
                return ch3Var;
            case 1:
                m2invoke();
                return ch3Var;
            case 2:
                m2invoke();
                return ch3Var;
            default:
                m2invoke();
                return ch3Var;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m2invoke() {
        int i = this.f;
        SpeedTestActivity speedTestActivity = this.g;
        switch (i) {
            case 0:
                int i2 = SpeedTestActivity.u;
                speedTestActivity.getClass();
                zf3.T(speedTestActivity, null, new fy2(speedTestActivity, null), 3);
                return;
            case 1:
                int i3 = SpeedTestActivity.u;
                speedTestActivity.g0(false);
                return;
            case 2:
                int i4 = SpeedTestActivity.u;
                speedTestActivity.getClass();
                zf3.T(speedTestActivity, null, new fy2(speedTestActivity, null), 3);
                return;
            default:
                int i5 = SpeedTestActivity.u;
                speedTestActivity.f0();
                return;
        }
    }
}
