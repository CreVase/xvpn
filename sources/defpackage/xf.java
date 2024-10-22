package defpackage;

import android.widget.CompoundButton;
import com.security.xvpn.z35kb.quickconn.ApplyQuickConnActivity;

/* loaded from: classes2.dex */
public final class xf extends ji1 implements l41 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ApplyQuickConnActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xf(ApplyQuickConnActivity applyQuickConnActivity, int i) {
        super(2);
        this.f = i;
        this.g = applyQuickConnActivity;
    }

    public final void a(f43 f43Var, CompoundButton compoundButton) {
        int i = this.f;
        ApplyQuickConnActivity applyQuickConnActivity = this.g;
        switch (i) {
            case 1:
                int i2 = ApplyQuickConnActivity.m;
                applyQuickConnActivity.getClass();
                m20.C0(applyQuickConnActivity, 32);
                return;
            default:
                t9.u0(applyQuickConnActivity, new yf(applyQuickConnActivity, 5));
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:            if (android.net.VpnService.prepare(r1.c) != null) goto L19;     */
    @Override // defpackage.l41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5) {
        /*
            r3 = this;
            ch3 r0 = defpackage.ch3.f636a
            int r1 = r3.f
            switch(r1) {
                case 0: goto L10;
                case 1: goto L8;
                default: goto L7;
            }
        L7:
            goto L6f
        L8:
            f43 r4 = (defpackage.f43) r4
            android.widget.CompoundButton r5 = (android.widget.CompoundButton) r5
            r3.a(r4, r5)
            return r0
        L10:
            android.widget.CompoundButton r4 = (android.widget.CompoundButton) r4
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            com.security.xvpn.z35kb.quickconn.ApplyQuickConnActivity r1 = r3.g
            if (r5 == 0) goto L31
            boolean r2 = defpackage.ew3.X()
            if (r2 != 0) goto L31
            int r5 = com.security.xvpn.z35kb.quickconn.ApplyQuickConnActivity.m
            r1.getClass()
            r5 = 32
            defpackage.m20.C0(r1, r5)
            r5 = 0
            r4.setChecked(r5)
            goto L6e
        L31:
            java.lang.String r4 = "maecav3ncf"
            defpackage.ew3.g(r4)
            a.bx r4 = new a.bx
            r4.<init>()
            r4.v(r5)
            r2 = 533(0x215, float:7.47E-43)
            a.du.d(r2, r4)
            r4.h()
            java.lang.Class<com.security.xvpn.z35kb.quickconn.QuickConnectService> r4 = com.security.xvpn.z35kb.quickconn.QuickConnectService.class
            if (r5 == 0) goto L62
            int r5 = com.security.xvpn.z35kb.quickconn.ApplyQuickConnActivity.m     // Catch: java.lang.Throwable -> L55
            lt3 r5 = r1.c     // Catch: java.lang.Throwable -> L55
            android.content.Intent r5 = android.net.VpnService.prepare(r5)     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L55
            goto L6e
        L55:
            android.content.Intent r5 = new android.content.Intent
            int r2 = com.security.xvpn.z35kb.quickconn.ApplyQuickConnActivity.m
            lt3 r2 = r1.c
            r5.<init>(r2, r4)
            r1.startService(r5)
            goto L6e
        L62:
            android.content.Intent r5 = new android.content.Intent
            int r2 = com.security.xvpn.z35kb.quickconn.ApplyQuickConnActivity.m
            lt3 r2 = r1.c
            r5.<init>(r2, r4)
            r1.stopService(r5)
        L6e:
            return r0
        L6f:
            f43 r4 = (defpackage.f43) r4
            android.widget.CompoundButton r5 = (android.widget.CompoundButton) r5
            r3.a(r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xf.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
