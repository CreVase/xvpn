package defpackage;

import android.view.KeyEvent;
import androidx.fragment.app.Fragment;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.television.HomeActivity;

/* loaded from: classes2.dex */
public final class j81 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ HomeActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j81(HomeActivity homeActivity, int i) {
        super(1);
        this.f = i;
        this.g = homeActivity;
    }

    public final void a(ad3 ad3Var) {
        int i = this.f;
        HomeActivity homeActivity = this.g;
        switch (i) {
            case 0:
                ad3Var.f61a = pd0.y(R.string.Disconnected);
                ad3Var.f62b = pd0.y(R.string.DisconnectByLimitTips);
                ad3.a(ad3Var, pd0.y(R.string.Cancel), null, 6);
                String y = pd0.y(R.string.UpgradeToUnlimited);
                i81 i81Var = new i81(homeActivity, 1);
                ad3Var.c = y;
                ad3Var.d = i81Var;
                return;
            default:
                ad3Var.i = false;
                ad3Var.f61a = pd0.y(R.string.AccountError);
                ad3Var.f62b = pd0.y(R.string.AccountExpiredError);
                ad3.a(ad3Var, pd0.y(R.string.Cancel), new i81(homeActivity, 2), 2);
                String y2 = pd0.y(R.string.SignIn);
                i81 i81Var2 = new i81(homeActivity, 3);
                ad3Var.c = y2;
                ad3Var.d = i81Var2;
                return;
        }
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        zh1 zh1Var;
        j50 j50Var;
        ch3 ch3Var = ch3.f636a;
        int i = this.f;
        HomeActivity homeActivity = this.g;
        switch (i) {
            case 0:
                a((ad3) obj);
                return ch3Var;
            case 1:
                a((ad3) obj);
                return ch3Var;
            case 2:
                KeyEvent keyEvent = (KeyEvent) obj;
                if (keyEvent == null) {
                    return Boolean.FALSE;
                }
                if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 4 && (zh1Var = homeActivity.i) != null && zh1Var.indexOfChild(zh1Var.getFocusedChild()) != 1) {
                    Fragment C = homeActivity.getSupportFragmentManager().C("1");
                    if (C instanceof j50) {
                        j50Var = (j50) C;
                    } else {
                        j50Var = null;
                    }
                    if (j50Var != null) {
                        j50Var.j = true;
                    }
                    ew3.M0(zh1Var, 1).requestFocus();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                g81 g81Var = (g81) obj;
                int i2 = HomeActivity.l;
                homeActivity.S(g81Var);
                homeActivity.h = g81Var.c;
                return ch3Var;
        }
    }
}
