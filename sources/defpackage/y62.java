package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.Window;
import com.security.xvpn.z35kb.R;
import java.util.Map;

/* loaded from: classes.dex */
public final class y62 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public static final y62 g = new y62(0);
    public static final y62 h = new y62(1);
    public static final y62 i = new y62(2);
    public static final y62 j = new y62(3);
    public static final y62 k = new y62(4);
    public static final y62 l = new y62(5);
    public static final y62 m = new y62(6);
    public static final y62 n = new y62(7);
    public static final y62 o = new y62(8);
    public static final y62 p = new y62(9);
    public static final y62 q = new y62(10);
    public static final y62 r = new y62(11);
    public static final y62 s = new y62(12);
    public static final y62 t = new y62(13);
    public static final y62 u = new y62(14);
    public static final y62 v = new y62(15);
    public static final y62 w = new y62(16);
    public static final y62 x = new y62(17);
    public static final y62 y = new y62(18);
    public static final y62 z = new y62(19);
    public static final y62 A = new y62(20);
    public static final y62 B = new y62(21);
    public static final y62 C = new y62(22);
    public static final y62 D = new y62(23);
    public static final y62 E = new y62(24);
    public static final y62 F = new y62(25);
    public static final y62 G = new y62(26);
    public static final y62 H = new y62(27);
    public static final y62 I = new y62(28);
    public static final y62 J = new y62(29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y62(int i2) {
        super(1);
        this.f = i2;
    }

    public final Boolean a(boolean z2) {
        boolean z3 = false;
        switch (this.f) {
            case 6:
                return Boolean.FALSE;
            case 7:
                if (!z2 && !ew3.X()) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 8:
                return Boolean.valueOf(!z2);
            case 9:
                if (!z2 && !ew3.X()) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 10:
                return Boolean.valueOf(m20.B0());
            case 11:
                return Boolean.valueOf(!z2);
            case 12:
                return Boolean.valueOf(!ew3.X());
            case 13:
                return Boolean.valueOf(!ew3.R());
            case 14:
                return Boolean.valueOf(m20.B0());
            case 15:
                return Boolean.valueOf(!ew3.X());
            case 16:
                return Boolean.valueOf(!ew3.R());
            case 17:
                return Boolean.valueOf(m20.B0());
            case 18:
            case 19:
            case 20:
            default:
                return Boolean.TRUE;
            case 21:
                return Boolean.TRUE;
        }
    }

    public final void b(p9 p9Var) {
        int i2 = -16777216;
        switch (this.f) {
            case 3:
                p9Var.f3799b = pd0.y(R.string.NetworkAnalysisConfirm);
                p9Var.h = pd0.y(R.string.Cancel);
                p9.b(p9Var, pd0.y(R.string.Continue), e.g, 2);
                return;
            case 4:
                p9Var.f3798a = pd0.y(R.string.ProcessFailed);
                p9Var.f3799b = pd0.y(R.string.AdSettingsShowFailed);
                p9Var.d = pd0.y(R.string.Okay);
                return;
            case 5:
                p9Var.f3798a = pd0.y(R.string.KillSwitchHelpTitle);
                p9Var.f3799b = pd0.y(R.string.KillSwitchHelpContent);
                p9.b(p9Var, pd0.y(R.string.Okay), null, 6);
                return;
            case 18:
                p9Var.f3798a = pd0.y(R.string.DeleteMyAccountTitle);
                p9Var.f3799b = pd0.y(R.string.DeleteMyAccountPremiumAlive);
                p9Var.d = pd0.y(R.string.Okay);
                return;
            case 20:
                p9Var.f3798a = pd0.y(R.string.NoticeForStaticIP);
                p9Var.f3799b = pd0.y(R.string.NoticeForStaticIPContent);
                p9.b(p9Var, pd0.y(R.string.Okay), null, 6);
                return;
            case 22:
                p9Var.f3798a = pd0.y(R.string.NoticeForStaticIP);
                p9Var.f3799b = pd0.y(R.string.NoticeForStaticIPContent);
                p9.b(p9Var, pd0.y(R.string.Okay), null, 6);
                return;
            case 25:
                p9Var.f3798a = pd0.y(R.string.Notice);
                p9Var.f3799b = pd0.y(R.string.ClearAllMessageLogsConfirm);
                String y2 = pd0.y(R.string.Delete);
                Context z2 = zf3.z();
                if (z2 != null) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        Resources resources = z2.getResources();
                        if (resources != null) {
                            i2 = resources.getColor(R.color.DeleteConfirmText, z2.getTheme());
                        }
                    } else {
                        Resources resources2 = z2.getResources();
                        if (resources2 != null) {
                            i2 = resources2.getColor(R.color.DeleteConfirmText);
                        }
                    }
                }
                p9.b(p9Var, bx3.f(y2, i2, 0, 5), e.k, 2);
                p9Var.h = pd0.y(R.string.Cancel);
                return;
            case 26:
                p9Var.f3798a = pd0.y(R.string.Notice);
                p9Var.f3799b = pd0.y(R.string.ClearAllUserMessageConfirm);
                String y3 = pd0.y(R.string.Delete);
                Context z3 = zf3.z();
                if (z3 != null) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        Resources resources3 = z3.getResources();
                        if (resources3 != null) {
                            i2 = resources3.getColor(R.color.DeleteConfirmText, z3.getTheme());
                        }
                    } else {
                        Resources resources4 = z3.getResources();
                        if (resources4 != null) {
                            i2 = resources4.getColor(R.color.DeleteConfirmText);
                        }
                    }
                }
                p9.b(p9Var, bx3.f(y3, i2, 0, 5), e.l, 2);
                p9Var.h = pd0.y(R.string.Cancel);
                return;
            case 27:
                p9Var.f3799b = pd0.y(R.string.LoginFirstFailed);
                p9Var.d = pd0.y(R.string.Okay);
                return;
            default:
                p9Var.f3799b = pd0.y(R.string.ScanQRLoginLoginLimitReached);
                p9Var.d = pd0.y(R.string.Okay);
                return;
        }
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                return cr0.f1659a;
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                return "  " + ((c72) entry.getKey()).f597a + " = " + entry.getValue();
            case 2:
                return new vm2();
            case 3:
                b((p9) obj);
                return ch3Var;
            case 4:
                b((p9) obj);
                return ch3Var;
            case 5:
                b((p9) obj);
                return ch3Var;
            case 6:
                return a(((Boolean) obj).booleanValue());
            case 7:
                return a(((Boolean) obj).booleanValue());
            case 8:
                return a(((Boolean) obj).booleanValue());
            case 9:
                return a(((Boolean) obj).booleanValue());
            case 10:
                return a(((Boolean) obj).booleanValue());
            case 11:
                return a(((Boolean) obj).booleanValue());
            case 12:
                return a(((Boolean) obj).booleanValue());
            case 13:
                return a(((Boolean) obj).booleanValue());
            case 14:
                return a(((Boolean) obj).booleanValue());
            case 15:
                return a(((Boolean) obj).booleanValue());
            case 16:
                return a(((Boolean) obj).booleanValue());
            case 17:
                return a(((Boolean) obj).booleanValue());
            case 18:
                b((p9) obj);
                return ch3Var;
            case 19:
                return ch3Var;
            case 20:
                b((p9) obj);
                return ch3Var;
            case 21:
                return a(((Boolean) obj).booleanValue());
            case 22:
                b((p9) obj);
                return ch3Var;
            case 23:
                return a(((Boolean) obj).booleanValue());
            case 24:
                return ch3Var;
            case 25:
                b((p9) obj);
                return ch3Var;
            case 26:
                b((p9) obj);
                return ch3Var;
            case 27:
                b((p9) obj);
                return ch3Var;
            case 28:
                b((p9) obj);
                return ch3Var;
            default:
                Window window = ((Dialog) obj).getWindow();
                if (window != null) {
                    window.setSoftInputMode(4);
                }
                return ch3Var;
        }
    }
}
