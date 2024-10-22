package defpackage;

import com.security.xvpn.z35kb.speedtest.SpeedTestActivity;

/* loaded from: classes2.dex */
public final /* synthetic */ class dy2 extends y41 implements v31 {
    public dy2(Object obj) {
        super(0, obj, SpeedTestActivity.class, "onItemCheckChange", "onItemCheckChange()V", 0);
    }

    @Override // defpackage.v31
    public final Object invoke() {
        SpeedTestActivity speedTestActivity = (SpeedTestActivity) this.receiver;
        int i = SpeedTestActivity.u;
        speedTestActivity.Z().c.setEnabled(!speedTestActivity.b0().isEmpty());
        return ch3.f636a;
    }
}
