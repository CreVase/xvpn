package defpackage;

import android.content.Intent;
import com.security.xvpn.z35kb.television.GuideActivity;
import com.security.xvpn.z35kb.television.HomeActivity;
import com.security.xvpn.z35kb.television.account.SignInActivity;

/* loaded from: classes2.dex */
public final class i81 extends ji1 implements v31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ HomeActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i81(HomeActivity homeActivity, int i) {
        super(0);
        this.f = i;
        this.g = homeActivity;
    }

    @Override // defpackage.v31
    public final /* bridge */ /* synthetic */ Object invoke() {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                m103invoke();
                return ch3Var;
            case 1:
                m103invoke();
                return ch3Var;
            case 2:
                m103invoke();
                return ch3Var;
            default:
                m103invoke();
                return ch3Var;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m103invoke() {
        xd3 xd3Var = xd3.f5149a;
        int i = this.f;
        HomeActivity homeActivity = this.g;
        switch (i) {
            case 0:
                int i2 = HomeActivity.l;
                homeActivity.R().d.o(xd3Var);
                return;
            case 1:
                int i3 = HomeActivity.l;
                homeActivity.R().d.o(xd3Var);
                return;
            case 2:
                tf3.h0(homeActivity, GuideActivity.class, null, 32768, 2);
                return;
            default:
                Intent intent = new Intent(homeActivity, (Class<?>) GuideActivity.class);
                intent.setFlags(268468224);
                homeActivity.startActivities(new Intent[]{intent, new Intent(homeActivity, (Class<?>) SignInActivity.class)});
                return;
        }
    }
}
