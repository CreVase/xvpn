package defpackage;

import com.security.xvpn.z35kb.television.GuideActivity;
import com.security.xvpn.z35kb.television.HomeActivity;
import com.security.xvpn.z35kb.television.purchase.PurchaseActivity;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class dd3 implements iz0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1764a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nd3 f1765b;

    public /* synthetic */ dd3(nd3 nd3Var, int i) {
        this.f1764a = i;
        this.f1765b = nd3Var;
    }

    @Override // defpackage.iz0
    public final Object b(Object obj, c90 c90Var) {
        boolean z;
        boolean z2;
        rn rnVar;
        boolean z3;
        ch3 ch3Var = ch3.f636a;
        int i = this.f1764a;
        nd3 nd3Var = this.f1765b;
        boolean z4 = false;
        switch (i) {
            case 0:
                String str = (String) obj;
                if (str.length() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    nd3Var.O(str, e.y);
                    nd3Var.c = true;
                } else if (nd3Var.c) {
                    nd3Var.N();
                }
                if (str.length() > 0) {
                    z4 = true;
                }
                nd3Var.c = z4;
                return ch3Var;
            default:
                xc2 xc2Var = (xc2) obj;
                int i2 = nd3.e;
                nd3Var.getClass();
                if ((nd3Var instanceof HomeActivity) || (nd3Var instanceof GuideActivity) || (nd3Var instanceof PurchaseActivity)) {
                    rn rnVar2 = nd3Var.d;
                    if (rnVar2 != null) {
                        rnVar2.dismissAllowingStateLoss();
                    }
                    sc2 sc2Var = sc2.f4315a;
                    if (!m20.L(xc2Var, sc2Var) && ((!((z = xc2Var instanceof wc2)) && !(xc2Var instanceof uc2)) || !(nd3Var instanceof GuideActivity))) {
                        bd3 bd3Var = null;
                        if (xc2Var instanceof vc2) {
                            rnVar = m20.a1(nd3Var, new kd3(xc2Var, 1));
                        } else if (xc2Var instanceof rc2) {
                            rnVar = m20.a1(nd3Var, d42.G);
                        } else if (xc2Var instanceof tc2) {
                            rnVar = m20.a1(nd3Var, new q90(14, xc2Var, nd3Var));
                        } else if (xc2Var instanceof ic2) {
                            rnVar = m20.a1(nd3Var, d42.I);
                        } else if (xc2Var instanceof jc2) {
                            rnVar = m20.a1(nd3Var, new kd3(xc2Var, 2));
                        } else if (xc2Var instanceof kc2) {
                            rnVar = m20.a1(nd3Var, new fv2(nd3Var, 11));
                        } else if (xc2Var instanceof nc2) {
                            rnVar = m20.a1(nd3Var, new kd3(xc2Var, 3));
                        } else if (xc2Var instanceof qc2) {
                            rnVar = m20.a1(nd3Var, md3.h);
                        } else if (xc2Var instanceof pc2) {
                            rnVar = m20.a1(nd3Var, md3.i);
                        } else if (xc2Var instanceof mc2) {
                            rnVar = m20.a1(nd3Var, d42.D);
                        } else if (xc2Var instanceof oc2) {
                            rnVar = m20.a1(nd3Var, d42.E);
                        } else if (z) {
                            rnVar = m20.a1(nd3Var, d42.F);
                        } else if (xc2Var instanceof lc2) {
                            yz yzVar = new yz();
                            lc2 lc2Var = (lc2) xc2Var;
                            List O0 = d20.O0(lc2Var.f3101a, new m90(3));
                            yzVar.e = O0;
                            Iterator it = O0.iterator();
                            int i3 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    if (((pb2) it.next()).c.length() == 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (!z2) {
                                        i3++;
                                    }
                                } else {
                                    i3 = -1;
                                }
                            }
                            yzVar.d = i3;
                            yzVar.f = lc2Var.f3102b;
                            yzVar.show(nd3Var.getSupportFragmentManager(), "PurchaseState");
                            rnVar = yzVar;
                        } else if (m20.L(xc2Var, uc2.f4649a)) {
                            rn ui2Var = new ui2();
                            ui2Var.show(nd3Var.getSupportFragmentManager(), "PurchaseState");
                            rnVar = ui2Var;
                        } else if (m20.L(xc2Var, sc2.f4316b)) {
                            rn fqVar = new fq();
                            fqVar.show(nd3Var.getSupportFragmentManager(), "PurchaseState");
                            rnVar = fqVar;
                        } else {
                            if (m20.L(xc2Var, sc2Var)) {
                                throw new IllegalArgumentException("state = " + xc2Var);
                            }
                            throw new j11(null);
                        }
                        nd3Var.d = rnVar;
                        rnVar.c = new e61(xc2Var, 1);
                        if (rnVar instanceof bd3) {
                            bd3Var = (bd3) rnVar;
                        }
                        if (bd3Var != null) {
                            bd3Var.f = new cd3(xc2Var, 1);
                        }
                    }
                }
                return ch3Var;
        }
    }
}
