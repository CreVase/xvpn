package com.security.xvpn.z35kb.purchase;

import a.bx;
import a.du;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzu;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;
import defpackage.Cdo;
import defpackage.a20;
import defpackage.ac2;
import defpackage.ax3;
import defpackage.bk1;
import defpackage.e;
import defpackage.ew3;
import defpackage.fc2;
import defpackage.hx2;
import defpackage.i4;
import defpackage.ic;
import defpackage.jy3;
import defpackage.lm2;
import defpackage.lt3;
import defpackage.m20;
import defpackage.nc2;
import defpackage.od2;
import defpackage.og;
import defpackage.pd0;
import defpackage.pp;
import defpackage.qb0;
import defpackage.qp;
import defpackage.r9;
import defpackage.sb2;
import defpackage.sd2;
import defpackage.t60;
import defpackage.t9;
import defpackage.td2;
import defpackage.tj1;
import defpackage.ut0;
import defpackage.v31;
import defpackage.v51;
import defpackage.wp;
import defpackage.x50;
import defpackage.xy;
import defpackage.y4;
import defpackage.yc2;
import defpackage.yy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class GoogleIABHelper extends BaseIAPHelper implements od2, qp {
    public static pp h;
    public static boolean j;
    public static v31 k;
    public static r9 n;
    public static final GoogleIABHelper g = new GoogleIABHelper();
    public static boolean i = true;
    public static final HashMap l = new HashMap();
    public static final lm2 m = new lm2();

    private GoogleIABHelper() {
    }

    public static final void u(GoogleIABHelper googleIABHelper, String str) {
        boolean z;
        String format;
        if (googleIABHelper.f1607a != null) {
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                format = "https://play.google.com/store/account/subscriptions";
            } else {
                format = String.format("https://play.google.com/store/account/subscriptions?sku=%s&package=%s", Arrays.copyOf(new Object[]{str, googleIABHelper.f1607a.getPackageName()}, 2));
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(format));
            googleIABHelper.f1607a.startActivity(intent);
        }
    }

    public static boolean v(List list) {
        boolean z;
        sb2 sb2Var;
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        String n2 = ew3.n();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = ((Purchase) it.next()).c;
            String optString = jSONObject.optString("obfuscatedAccountId");
            String optString2 = jSONObject.optString("obfuscatedProfileId");
            String str = null;
            if (optString == null && optString2 == null) {
                sb2Var = null;
            } else {
                sb2Var = new sb2(optString, optString2);
            }
            if (sb2Var != null) {
                str = sb2Var.f4308b;
            }
            if (m20.L(str, n2)) {
                return true;
            }
        }
        return false;
    }

    public static void x(v31 v31Var) {
        pp ppVar;
        if (!l.isEmpty()) {
            if (v31Var != null) {
                v31Var.invoke();
                return;
            }
            return;
        }
        bx i2 = hx2.i(237);
        int t = (int) i2.t();
        String[] strArr = new String[t];
        int i3 = 0;
        for (int i4 = 0; i4 < t; i4++) {
            strArr[i4] = i2.u();
        }
        i2.h();
        List<String> m1 = og.m1(strArr);
        ArrayList arrayList = new ArrayList(a20.C0(m1, 10));
        for (String str : m1) {
            sb2 sb2Var = new sb2(0);
            sb2Var.f4307a = str;
            sb2Var.f4308b = "subs";
            if (str != null) {
                arrayList.add(new sd2(sb2Var));
            } else {
                throw new IllegalArgumentException("Product id must be provided.");
            }
        }
        if (!arrayList.isEmpty() && (ppVar = h) != null) {
            v51 v51Var = new v51((hx2) null);
            if (!arrayList.isEmpty()) {
                HashSet hashSet = new HashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sd2 sd2Var = (sd2) it.next();
                    if (!"play_pass_subs".equals(sd2Var.f4322b)) {
                        hashSet.add(sd2Var.f4322b);
                    }
                }
                if (hashSet.size() <= 1) {
                    v51Var.f4780b = zzu.zzj(arrayList);
                    td2 td2Var = new td2(v51Var);
                    ut0 ut0Var = new ut0(v31Var, 9);
                    if (!ppVar.a()) {
                        x50 x50Var = ppVar.f;
                        wp wpVar = ax3.j;
                        x50Var.C(pd0.T(2, 7, wpVar));
                        ut0Var.f(wpVar, new ArrayList());
                        return;
                    }
                    if (!ppVar.p) {
                        zzb.zzj("BillingClient", "Querying product details is not supported.");
                        x50 x50Var2 = ppVar.f;
                        wp wpVar2 = ax3.o;
                        x50Var2.C(pd0.T(20, 7, wpVar2));
                        ut0Var.f(wpVar2, new ArrayList());
                        return;
                    }
                    if (ppVar.h(new jy3(ppVar, td2Var, ut0Var, i3), 30000L, new y4(ppVar, ut0Var, 11), ppVar.d()) == null) {
                        wp f = ppVar.f();
                        ppVar.f.C(pd0.T(25, 7, f));
                        ut0Var.f(f, new ArrayList());
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
    }

    @Override // com.security.xvpn.z35kb.purchase.BaseIAPHelper
    public final String d(int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 33) {
                            if (i2 != 34) {
                                bx i3 = hx2.i(479);
                                boolean q = i3.q();
                                i3.h();
                                if (q) {
                                    return ew3.z().f5459a;
                                }
                                if (XApplication.d) {
                                    bx i4 = hx2.i(223);
                                    String u = i4.u();
                                    i4.h();
                                    return u;
                                }
                                return ew3.z().f5459a;
                            }
                            return ew3.F()[1].f5459a;
                        }
                        return ew3.z().f5459a;
                    }
                    return ew3.F()[4].f5459a;
                }
                return ew3.F()[3].f5459a;
            }
            return ew3.F()[1].f5459a;
        }
        return ew3.F()[0].f5459a;
    }

    @Override // com.security.xvpn.z35kb.purchase.BaseIAPHelper, defpackage.zj1
    public final void e(bk1 bk1Var, tj1 tj1Var) {
        super.e(bk1Var, tj1Var);
        if ((bk1Var instanceof MainActivity) && tj1Var == tj1.ON_RESUME) {
            w(false, e.n);
        }
    }

    @Override // com.security.xvpn.z35kb.purchase.BaseIAPHelper
    public final void i(String str) {
        w(true, new xy(str, 2));
    }

    @Override // com.security.xvpn.z35kb.purchase.BaseIAPHelper
    public final void j() {
        w(true, e.o);
    }

    @Override // com.security.xvpn.z35kb.purchase.BaseIAPHelper
    public final void k() {
        w(false, e.p);
    }

    @Override // com.security.xvpn.z35kb.purchase.BaseIAPHelper
    public final void l() {
        w(true, e.q);
    }

    @Override // com.security.xvpn.z35kb.purchase.BaseIAPHelper
    public final fc2 t(ac2[] ac2VarArr) {
        ac2 ac2Var;
        pp ppVar;
        if (ac2VarArr != null) {
            int length = ac2VarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                ac2Var = ac2VarArr[i2];
                if (ac2Var.f55a) {
                    break;
                }
            }
        }
        ac2Var = null;
        if (ac2Var != null && (ppVar = h) != null) {
            String str = ac2Var.f56b;
            if (str != null) {
                i4 i4Var = new i4();
                i4Var.f2534a = str;
                qb0 qb0Var = new qb0(11);
                if (!ppVar.a()) {
                    ppVar.f.C(pd0.T(2, 3, ax3.j));
                } else if (TextUtils.isEmpty(i4Var.f2534a)) {
                    zzb.zzj("BillingClient", "Please provide a valid purchase token.");
                    ppVar.f.C(pd0.T(26, 3, ax3.g));
                } else if (!ppVar.l) {
                    ppVar.f.C(pd0.T(27, 3, ax3.f362b));
                } else if (ppVar.h(new jy3(ppVar, i4Var, qb0Var, 1), 30000L, new y4(ppVar, qb0Var, 12), ppVar.d()) == null) {
                    ppVar.f.C(pd0.T(25, 3, ppVar.f()));
                }
            } else {
                throw new IllegalArgumentException("Purchase token must be set");
            }
        }
        bx bxVar = new bx();
        if (ac2VarArr != null) {
            bxVar.y(ac2VarArr.length);
            for (ac2 ac2Var2 : ac2VarArr) {
                if (ac2Var2 == null) {
                    ac2Var2 = new ac2();
                }
                bxVar.z(ac2Var2.f56b);
                bxVar.z(ac2Var2.c);
                bxVar.v(ac2Var2.f55a);
            }
        } else {
            bxVar.y(0L);
        }
        du.d(361, bxVar);
        fc2 fc2Var = new fc2();
        ew3.w0(bxVar, fc2Var);
        bxVar.h();
        return fc2Var;
    }

    public final void w(boolean z, v31 v31Var) {
        boolean z2;
        if (z) {
            if (i) {
                z2 = false;
            } else {
                String y = pd0.y(R.string.SubscriptionFailedNoGooglePlay);
                yc2.f5315b.g(new nc2());
                ic icVar = this.f1607a;
                int i2 = 1;
                if (icVar instanceof lt3) {
                    t9.w0(((lt3) icVar).getSupportFragmentManager(), new yy(y, i2));
                }
                f();
                z2 = true;
            }
            if (z2) {
                return;
            }
        }
        if (j) {
            v31Var.invoke();
            return;
        }
        pp ppVar = h;
        if (ppVar != null) {
            if (!ppVar.a()) {
                k = v31Var;
                ppVar.c(this);
            } else {
                v31Var.invoke();
            }
        }
    }

    public final void y(wp wpVar) {
        int i2 = wpVar.f5050a;
        if (i2 != -2) {
            if (i2 != 0) {
                if (i2 != 3) {
                    return;
                }
            } else {
                v31 v31Var = k;
                if (v31Var != null) {
                    v31Var.invoke();
                }
                k = null;
                j = true;
                x(null);
                return;
            }
        }
        ew3.L0("kyy2tgu8fr", "setup google inappbilling, " + wpVar);
        i = false;
    }

    public final void z(wp wpVar, List list) {
        int i2 = wpVar.f5050a;
        if (i2 != 0) {
            if (i2 == 7 && v(list)) {
                j();
                return;
            }
            return;
        }
        if (v(list)) {
            if (list != null && list.size() > 0) {
                String str = (String) ((Purchase) list.get(0)).a().get(0);
                String b2 = ((Purchase) list.get(0)).b();
                WeakReference weakReference = this.c;
                if (weakReference != null && weakReference.get() != null) {
                    ((Cdo) this.c.get()).D(str, b2);
                }
                du.d(265, null);
                switch (this.e) {
                    case 5:
                        ew3.i0(b2, t60.w, str);
                        break;
                    case 6:
                        ew3.i0(b2, t60.d, str);
                        break;
                    case 7:
                        ew3.i0(b2, t60.g, str);
                        break;
                    case 8:
                        String str2 = t60.e;
                        bx i3 = hx2.i(86);
                        String u = i3.u();
                        i3.h();
                        ew3.j0(b2, str2, str, u);
                        break;
                    case 9:
                        ew3.i0(b2, t60.f, str);
                        break;
                    case 10:
                        ew3.i0(b2, t60.m, str);
                        break;
                    case 11:
                        ew3.i0(b2, t60.o, str);
                        break;
                    case 12:
                        ew3.i0(b2, t60.p, str);
                        break;
                    case 13:
                        ew3.i0(b2, t60.c, str);
                        break;
                    case 14:
                        ew3.i0(b2, t60.q, str);
                        break;
                    case 15:
                        ew3.i0(b2, t60.r, str);
                        break;
                    case 16:
                        ew3.i0(b2, t60.s, str);
                        break;
                    case 17:
                        ew3.i0(b2, t60.t, str);
                        break;
                    case 18:
                        ew3.i0(b2, t60.u, str);
                        break;
                    case 19:
                        ew3.i0(b2, t60.x, str);
                        break;
                    case 22:
                        ew3.i0(b2, t60.n, str);
                        break;
                    case 23:
                        String str3 = t60.e;
                        bx i4 = hx2.i(85);
                        String u2 = i4.u();
                        i4.h();
                        ew3.j0(b2, str3, str, u2);
                        break;
                    case 24:
                        ew3.i0(b2, t60.y, str);
                        break;
                    case 25:
                        ew3.i0(b2, t60.z, str);
                        break;
                    case 26:
                        ew3.i0(b2, t60.A, str);
                        break;
                    case 27:
                        ew3.i0(b2, t60.C, str);
                        break;
                    case 28:
                        ew3.i0(b2, t60.D, str);
                        break;
                    case 29:
                        ew3.i0(b2, t60.E, str);
                        break;
                    case 30:
                        ew3.i0(b2, t60.F, str);
                        break;
                    case 31:
                        ew3.i0(b2, t60.v, str);
                        break;
                    case 32:
                        ew3.i0(b2, t60.G, str);
                        break;
                    case 33:
                    case 34:
                        ew3.i0(b2, t60.f4457b, str);
                        if (ew3.n0()) {
                            du.d(647, null);
                            break;
                        }
                        break;
                }
            }
            this.d = 3841;
            j();
        }
    }
}
