package com.security.xvpn.z35kb;

import a.du;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.ao;
import defpackage.dn;
import defpackage.ew3;
import defpackage.f82;
import defpackage.iy2;
import defpackage.jy2;
import defpackage.x8;
import defpackage.ya0;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class SplashActivity extends dn {
    public static final /* synthetic */ int o = 0;
    public f82 k;
    public final AtomicBoolean l = new AtomicBoolean(false);
    public boolean m = true;
    public boolean n;

    @Override // defpackage.lt3
    public final String M() {
        return "SplashPage";
    }

    @Override // defpackage.lt3
    public final void R() {
        ya0.h = true;
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setContentDescription("Splash Activity, waiting start");
        setContentView(frameLayout);
    }

    public final void Z() {
        XApplication.g = ew3.o0();
        if (ew3.o0()) {
            du.d(65, null);
            if (!isFinishing() && !this.e) {
                f82 f82Var = this.k;
                if (f82Var == null || !f82Var.isShowing()) {
                    f82 f82Var2 = new f82(this.c);
                    this.k = f82Var2;
                    f82Var2.setOnCancelListener(new ao(this, 2));
                    f82 f82Var3 = this.k;
                    f82Var3.j = new jy2(this);
                    f82Var3.show();
                    return;
                }
                return;
            }
            return;
        }
        a0(false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:            if (r7.equals("PurchaseFromGlobalGuideAbtestGroupC") == false) goto L32;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:            defpackage.tf3.h0(r6, com.security.xvpn.z35kb.purchase.GuideToPurchaseNew2Activity.class, null, 0, 6);     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:            if (r7.equals("PurchaseFromGlobalGuideAbtestGroupB") == false) goto L32;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a0(boolean r7) {
        /*
            r6 = this;
            defpackage.l83.a(r6)
            r0 = 0
            if (r7 == 0) goto L1a
            r7 = 135(0x87, float:1.89E-43)
            a.bx r7 = defpackage.hx2.i(r7)
            boolean r1 = r7.q()
            r7.h()
            if (r1 != 0) goto L1a
            r7 = 136(0x88, float:1.9E-43)
            a.du.d(r7, r0)
        L1a:
            boolean r7 = defpackage.ew3.n0()
            r1 = 0
            if (r7 == 0) goto L7a
            boolean r7 = com.security.xvpn.z35kb.XApplication.c
            if (r7 == 0) goto L2d
            lt3 r7 = r6.c
            java.lang.Class<com.security.xvpn.z35kb.television.GuideActivity> r0 = com.security.xvpn.z35kb.television.GuideActivity.class
            defpackage.ya0.H(r7, r0)
            goto L89
        L2d:
            java.lang.String r7 = defpackage.ew3.y()
            java.lang.Class<com.security.xvpn.z35kb.purchase.GuideToPurchaseActivity> r2 = com.security.xvpn.z35kb.purchase.GuideToPurchaseActivity.class
            r3 = 6
            if (r7 == 0) goto L76
            int r4 = r7.hashCode()
            r5 = -1219974588(0xffffffffb748aa44, float:-1.1960572E-5)
            if (r4 == r5) goto L6a
            switch(r4) {
                case 1939081859: goto L5b;
                case 1939081860: goto L4c;
                case 1939081861: goto L43;
                default: goto L42;
            }
        L42:
            goto L76
        L43:
            java.lang.String r4 = "PurchaseFromGlobalGuideAbtestGroupC"
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L55
            goto L76
        L4c:
            java.lang.String r4 = "PurchaseFromGlobalGuideAbtestGroupB"
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L55
            goto L76
        L55:
            java.lang.Class<com.security.xvpn.z35kb.purchase.GuideToPurchaseNew2Activity> r7 = com.security.xvpn.z35kb.purchase.GuideToPurchaseNew2Activity.class
            defpackage.tf3.h0(r6, r7, r0, r1, r3)
            goto L89
        L5b:
            java.lang.String r4 = "PurchaseFromGlobalGuideAbtestGroupA"
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L64
            goto L76
        L64:
            java.lang.Class<com.security.xvpn.z35kb.purchase.GuideToPurchaseNew1Activity> r7 = com.security.xvpn.z35kb.purchase.GuideToPurchaseNew1Activity.class
            defpackage.tf3.h0(r6, r7, r0, r1, r3)
            goto L89
        L6a:
            java.lang.String r4 = "PurchaseFromGlobalGuideAbtestGroupOrigin"
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L76
            defpackage.tf3.h0(r6, r2, r0, r1, r3)
            goto L89
        L76:
            defpackage.tf3.h0(r6, r2, r0, r1, r3)
            goto L89
        L7a:
            boolean r7 = com.security.xvpn.z35kb.XApplication.c
            if (r7 == 0) goto L84
            java.lang.Class<com.security.xvpn.z35kb.television.SplashActivity> r7 = com.security.xvpn.z35kb.television.SplashActivity.class
            defpackage.ya0.H(r6, r7)
            goto L89
        L84:
            java.lang.Class<com.security.xvpn.z35kb.MainActivity> r7 = com.security.xvpn.z35kb.MainActivity.class
            defpackage.ya0.H(r6, r7)
        L89:
            r7 = 2130772028(0x7f01003c, float:1.7147163E38)
            r6.overridePendingTransition(r1, r7)
            boolean r7 = r6.isFinishing()
            if (r7 != 0) goto L9b
            r6.finish()
            r6.overridePendingTransition(r1, r1)
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.security.xvpn.z35kb.SplashActivity.a0(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02ce  */
    @Override // defpackage.dn, defpackage.lt3, androidx.fragment.app.l, androidx.activity.ComponentActivity, defpackage.r30, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.security.xvpn.z35kb.SplashActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.dn, defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.n) {
            return;
        }
        x8 x8Var = x8.f5127a;
        AtomicBoolean atomicBoolean = x8.g;
        atomicBoolean.set(false);
        if (!atomicBoolean.get()) {
            x8.h = null;
        }
    }

    @Override // defpackage.lt3, androidx.fragment.app.l, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.n) {
            return;
        }
        ew3.b0(new iy2(this, 0));
    }
}
