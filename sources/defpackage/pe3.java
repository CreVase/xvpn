package defpackage;

import a.bx;
import a.wcyybbcujkCs;
import android.app.Application;
import com.security.xvpn.z35kb.R;
import java.util.List;

/* loaded from: classes2.dex */
public final class pe3 extends cp implements pt3 {
    public pe3(Application application) {
        ew3.f2013b = new ie3(this);
        rt3.e().a(this);
    }

    @Override // defpackage.pt3
    public final void C(String str) {
        boolean z;
        boolean z2;
        String str2;
        int i = 1;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return;
        }
        if (!i23.R0(str, "NoVpnConnectPermission", false) && !i23.R0(str, "permission denied", false)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 || m20.L(str, "3np35e9gyq cancelled")) {
            return;
        }
        String y = pd0.y(R.string.ConnectFailed);
        if (!fl.I()) {
            str2 = pd0.y(R.string.ConnFailedCheckNetwork);
        } else if (bx3.F(str)) {
            str2 = pd0.y(R.string.ConnFailedCheckNetworkTV);
        } else {
            if (i23.R0(str, "You Have No Data Transfer", false)) {
                if (m20.A0()) {
                    i(new ce3(pd0.y(R.string.KillSwitchDataLimit2)));
                    return;
                } else {
                    y = pd0.y(R.string.Disconnected);
                    str2 = pd0.y(R.string.DisconnectByLimitTips);
                }
            } else if (i23.R0(str, "For policy reasons", false)) {
                str2 = pd0.y(R.string.PolicyReasonRegion);
            } else if (bx3.D(str)) {
                str2 = pd0.y(R.string.ConnectFailedReboot);
            } else {
                if (i23.R0(str, "AccountV5AuthFailed", false)) {
                    if (ew3.o()) {
                        zf3.T(t9.N(this), vl0.c, new je3(null), 2);
                    }
                    rt3.e().i(false, ew3.X());
                    i(ee3.f1925a);
                    if (m20.A0()) {
                        rt3.e().i(false, ew3.X());
                        i(new ce3(pd0.y(R.string.KillSwitchPasswordChange2)));
                        return;
                    }
                    return;
                }
                if (m20.L(str, "ssec5h739r")) {
                    i(de3.f1766a);
                    return;
                }
                if (i23.R0(str, "65k5rzn59u", false)) {
                    str2 = pd0.y(R.string.TvConnectFailedAllPingLost);
                    i = 3;
                } else {
                    wcyybbcujkCs wcyybbcujkcs = wcyybbcujkCs.f4a;
                    if ("kshpqn53ps".equals(str)) {
                        str2 = p71.m(pd0.y(R.string.ConnectFailedByOtherVPNL1), "\n", pd0.y(R.string.ConnectFailedByOtherVPNL2));
                    } else if (i23.R0(str, "d69dc6nup5", false)) {
                        List o1 = i23.o1(i23.j1("\"]", i23.i1("d69dc6nup5_[\"", str)), new String[]{"\",\""});
                        y = (String) o1.get(0);
                        str2 = (String) o1.get(1);
                    } else {
                        if (!i23.R0(str, "jsghx6r6kj", false) && !i23.R0(str, "ptu4xnmgsf", false)) {
                            i = 0;
                        }
                        if (i != 0) {
                            str2 = pd0.y(R.string.UpdateAlertP2);
                        } else {
                            String y2 = pd0.y(R.string.ConnFailedCheckNetworkTV);
                            bx j = hx2.j(str, 564);
                            boolean q = j.q();
                            j.h();
                            if (q) {
                                str2 = pd0.y(R.string.TvConnectFailedAllPingLost);
                                i = 3;
                            } else {
                                str2 = y2;
                                i = 0;
                            }
                            m20.A0();
                        }
                    }
                }
            }
            i(new ae3(i, y, str2));
        }
        i = 0;
        i(new ae3(i, y, str2));
    }

    @Override // defpackage.pt3
    public final /* synthetic */ void c(int i) {
    }

    @Override // defpackage.em3
    public final void f() {
        ew3.f2013b = null;
        rt3.e().j(this);
    }
}
