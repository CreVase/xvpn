package defpackage;

import com.security.xvpn.z35kb.accelerateApp.AllAppActivity;
import com.security.xvpn.z35kb.accelerateApp.SplitTunnelingActivity;

/* loaded from: classes2.dex */
public final class iz2 extends ji1 implements v31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ SplitTunnelingActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iz2(SplitTunnelingActivity splitTunnelingActivity, int i) {
        super(0);
        this.f = i;
        this.g = splitTunnelingActivity;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m105invoke() {
        int i = this.f;
        SplitTunnelingActivity splitTunnelingActivity = this.g;
        switch (i) {
            case 0:
                t9.a();
                tf3.h0(splitTunnelingActivity, AllAppActivity.class, null, 0, 6);
                return;
            default:
                t9.a();
                tf3.h0(splitTunnelingActivity, AllAppActivity.class, tf3.r(new n42("useVpn", Boolean.TRUE)), 0, 4);
                return;
        }
    }

    @Override // defpackage.v31
    public final /* bridge */ /* synthetic */ Object invoke() {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                m105invoke();
                return ch3Var;
            default:
                m105invoke();
                return ch3Var;
        }
    }
}
