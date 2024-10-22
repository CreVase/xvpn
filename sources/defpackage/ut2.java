package defpackage;

import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.menu.OtherDevicesForPlayStationActivity;

/* loaded from: classes2.dex */
public final /* synthetic */ class ut2 implements x31 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4737a;

    public /* synthetic */ ut2(int i) {
        this.f4737a = i;
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        switch (this.f4737a) {
            case 0:
                p9 p9Var = (p9) obj;
                p9Var.f3798a = pd0.y(R.string.SignInFailed);
                p9Var.f3799b = pd0.y(R.string.ProcessFailedCheckNetwork);
                p9Var.d = pd0.y(R.string.Okay);
                return ch3Var;
            case 1:
                p9 p9Var2 = (p9) obj;
                p9Var2.f3798a = pd0.y(R.string.CreateAccountFailed);
                p9Var2.f3799b = pd0.y(R.string.ProcessFailedCheckNetwork);
                p9Var2.d = pd0.y(R.string.Okay);
                return ch3Var;
            case 2:
                int i = OtherDevicesForPlayStationActivity.u;
                return Boolean.FALSE;
            case 3:
                p9 p9Var3 = (p9) obj;
                int i2 = OtherDevicesForPlayStationActivity.u;
                p9Var3.f3798a = pd0.y(R.string.NoticeNeat);
                p9Var3.f3799b = pd0.y(R.string.GameConsoleLanTips);
                p9.b(p9Var3, pd0.y(R.string.Okay), null, 6);
                String y = pd0.y(R.string.DontRemindMeAgain);
                x32 x32Var = new x32();
                p9Var3.h = y;
                p9Var3.i = 1000021;
                p9Var3.j = x32Var;
                return ch3Var;
            default:
                p9 p9Var4 = (p9) obj;
                int i3 = OtherDevicesForPlayStationActivity.u;
                p9Var4.f3798a = pd0.y(R.string.Sorry);
                p9Var4.f3799b = pd0.y(R.string.SystemUnsupportFunctionTips);
                p9Var4.d = pd0.y(R.string.Okay);
                return ch3Var;
        }
    }
}
