package com.security.xvpn.z35kb.purchase;

import a.du;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.TextView;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.television.HomeActivity;
import defpackage.Cdo;
import defpackage.ac2;
import defpackage.bk1;
import defpackage.co;
import defpackage.ed2;
import defpackage.ew3;
import defpackage.fc2;
import defpackage.i23;
import defpackage.ic;
import defpackage.ic2;
import defpackage.kc2;
import defpackage.lt3;
import defpackage.nd3;
import defpackage.pd0;
import defpackage.qm1;
import defpackage.rc2;
import defpackage.rt3;
import defpackage.t9;
import defpackage.tj1;
import defpackage.to1;
import defpackage.un;
import defpackage.vc2;
import defpackage.wn;
import defpackage.xn;
import defpackage.ya0;
import defpackage.yb;
import defpackage.yc2;
import defpackage.zf3;
import defpackage.zj1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class BaseIAPHelper implements zj1 {
    public static final ArrayList f = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public ic f1607a;

    /* renamed from: b, reason: collision with root package name */
    public qm1 f1608b;
    public WeakReference c;
    public int d = 0;
    public int e = -1;

    public BaseIAPHelper() {
        f.add(this);
    }

    public final void c() {
        this.d = 3843;
        if ((ew3.Y() || (!XApplication.c && ew3.X())) && ew3.o()) {
            yc2.f5315b.g(ic2.f2567a);
            ic icVar = this.f1607a;
            if (icVar instanceof lt3) {
                ed2 ed2Var = new ed2(icVar, R.layout.dialog_purchase_bind_already_bind);
                ed2Var.m = 2;
                ed2Var.show();
                return;
            }
            return;
        }
        m();
        j();
    }

    public abstract String d(int i);

    @Override // defpackage.zj1
    public void e(bk1 bk1Var, tj1 tj1Var) {
        int i = co.f672a[tj1Var.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            if (i == 4) {
                bk1Var.getLifecycle().b(this);
                if (bk1Var == this.f1607a) {
                    this.f1607a = null;
                    return;
                }
                return;
            }
            return;
        }
        if ((bk1Var instanceof lt3) || (bk1Var instanceof nd3)) {
            this.f1607a = (ic) bk1Var;
        }
        if (bk1Var instanceof Cdo) {
            this.c = new WeakReference((Cdo) bk1Var);
        } else {
            this.c = null;
        }
    }

    public final void f() {
        if (XApplication.c) {
            yc2.c.g("");
            return;
        }
        qm1 qm1Var = this.f1608b;
        if (qm1Var != null && qm1Var.isShowing() && this.f1608b.getOwnerActivity() != null && this.f1608b.getOwnerActivity() == this.f1607a && !this.f1608b.getOwnerActivity().isFinishing()) {
            try {
                this.f1608b.dismiss();
            } catch (Exception unused) {
            }
            this.f1608b = null;
        }
    }

    public final boolean g() {
        if (XApplication.c) {
            return false;
        }
        ic icVar = this.f1607a;
        if (icVar == null) {
            return true;
        }
        if ((!(icVar instanceof lt3) || !((lt3) icVar).d) && !icVar.isDestroyed()) {
            return false;
        }
        return true;
    }

    public final void h(int i) {
        this.e = i;
        i(d(i));
    }

    public abstract void i(String str);

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public final void m() {
        o(pd0.y(R.string.LoadingNormalText));
    }

    public final void o(String str) {
        if (XApplication.c) {
            yc2.c.g(str);
            return;
        }
        ic icVar = this.f1607a;
        if (icVar != null && icVar.isFinishing()) {
            return;
        }
        qm1 qm1Var = this.f1608b;
        if (qm1Var != null && qm1Var.isShowing()) {
            TextView textView = this.f1608b.j;
            if (textView != null) {
                textView.setText(str);
            }
            this.f1608b.setOwnerActivity(this.f1607a);
            return;
        }
        try {
            qm1 qm1Var2 = new qm1(this.f1607a);
            this.f1608b = qm1Var2;
            TextView textView2 = qm1Var2.j;
            if (textView2 != null) {
                textView2.setText(str);
            }
            qm1 qm1Var3 = this.f1608b;
            qm1Var3.k = new un(0, this);
            qm1Var3.setOwnerActivity(this.f1607a);
            this.f1608b.show();
        } catch (Exception unused) {
        }
    }

    public final void p() {
        yb ybVar = yb.f5305b;
        ew3.T0("");
        t9.a();
        int i = 0;
        this.d = 0;
        yc2.f5315b.g(rc2.f4131a);
        if (g()) {
            return;
        }
        ic icVar = this.f1607a;
        if (icVar instanceof lt3) {
            t9.w0(((lt3) icVar).getSupportFragmentManager(), new xn(i, this));
        }
    }

    public final void q(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        yb ybVar = yb.f5305b;
        ew3.T0("");
        t9.a();
        f();
        int i2 = 0;
        boolean z4 = true;
        if (!i23.R0(str, "xvec2fucj4", false) && !i23.R0(str, "d84vhwaccv", false) && !i23.R0(str, "5zd4h5qkeu", false) && !i23.R0(str, "order expires", false) && !i23.R0(str, "no order", false) && !i23.R0(str, "xvec2fucj4", false) && !i23.R0(str, "no subscription", false)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            p();
            return;
        }
        ew3.L0("x3dmt82kjt", "restore failed:".concat(str));
        int i3 = this.d;
        if (i3 == 3843) {
            z2 = true;
        } else {
            z2 = false;
        }
        ic2 ic2Var = ic2.f2567a;
        if (z2) {
            if (str.contains("kuqs3mv5gr")) {
                yc2.f5315b.g(ic2Var);
            } else {
                yc2.f5315b.g(kc2.f2932a);
            }
            if (g()) {
                return;
            }
            ic icVar = this.f1607a;
            if (icVar instanceof lt3) {
                un unVar = new un(2, this);
                ed2 ed2Var = new ed2(icVar, R.layout.dialog_purchase_bind_fail);
                ed2Var.m = 1;
                ed2Var.o = unVar;
                ed2Var.show();
            }
            this.d = 0;
            return;
        }
        if (i3 == 3842) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && str.contains("kuqs3mv5gr")) {
            yc2.f5315b.g(ic2Var);
            this.d = 0;
            return;
        }
        du.d(334, null);
        if (g()) {
            return;
        }
        boolean e = ew3.e(ew3.S0());
        int i4 = rt3.e().f4214b;
        if (!e || i4 == 65286 || i4 == 65285) {
            z4 = false;
        }
        if (z4) {
            i = R.string.RestoreFaildDetailsReconnect;
        } else {
            i = R.string.RestoreFaildDetails;
        }
        String y = pd0.y(i);
        if (XApplication.c) {
            y = pd0.y(R.string.TVPremiumAddFailedtips);
        }
        yc2.f5315b.g(new vc2(y));
        ic icVar2 = this.f1607a;
        if (icVar2 instanceof lt3) {
            t9.w0(((lt3) icVar2).getSupportFragmentManager(), new wn(this, y, i2));
        }
        this.d = 0;
    }

    public final void r(ac2[] ac2VarArr, String str) {
        String str2 = t(ac2VarArr).f2075a;
        yb ybVar = yb.f5305b;
        ew3.T0("");
        t9.a();
        if (g()) {
            this.d = 0;
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            ew3.L0("x3dmt82kjt", "verifyPurchase failed:" + str2);
        }
        to1 to1Var = new to1(13, this, str2);
        Handler handler = zf3.c;
        if (handler != null) {
            handler.post(to1Var);
        }
    }

    public final void s() {
        if (XApplication.c) {
            ya0.I(this.f1607a, HomeActivity.class);
        } else {
            ya0.I(this.f1607a, MainActivity.class);
        }
    }

    public abstract fc2 t(ac2[] ac2VarArr);
}
