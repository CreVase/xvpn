package defpackage;

import a.du;

/* loaded from: classes2.dex */
public final class hq2 implements jq2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2469a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sn f2470b;

    public /* synthetic */ hq2(sn snVar, int i) {
        this.f2469a = i;
        this.f2470b = snVar;
    }

    public final void a(zp2 zp2Var) {
        int i = this.f2469a;
        ey1 ey1Var = null;
        sn snVar = this.f2470b;
        switch (i) {
            case 0:
                iq2 iq2Var = (iq2) snVar;
                iq2Var.j.j(zp2Var);
                int i2 = iq2Var.d;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 4) {
                            du.d(312, null);
                            String str = zp2Var.g;
                            if (str != null) {
                                if (str.contains("Game")) {
                                    du.d(314, null);
                                    return;
                                } else if (str.contains("Streaming")) {
                                    du.d(315, null);
                                    return;
                                } else {
                                    if (str.toLowerCase().contains("video")) {
                                        du.d(316, null);
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    du.d(310, null);
                    return;
                }
                zp2Var.getClass();
                return;
            default:
                ey1 ey1Var2 = ((sq2) snVar).e;
                if (ey1Var2 != null) {
                    ey1Var = ey1Var2;
                }
                ey1Var.j(zp2Var);
                return;
        }
    }
}
