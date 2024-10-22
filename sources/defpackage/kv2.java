package defpackage;

import com.security.xvpn.z35kb.Adv4.appopen.CustomOpenAdActivity;
import com.security.xvpn.z35kb.livechat.ChatActivity;

/* loaded from: classes.dex */
public final class kv2 implements iz0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3020a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3021b;

    public /* synthetic */ kv2(Object obj, int i) {
        this.f3020a = i;
        this.f3021b = obj;
    }

    public final ch3 a(int i) {
        String str;
        ch3 ch3Var = ch3.f636a;
        int i2 = this.f3020a;
        Object obj = this.f3021b;
        switch (i2) {
            case 1:
                ((CustomOpenAdActivity) obj).Z().d.setText(String.valueOf(i));
                return ch3Var;
            default:
                ChatActivity chatActivity = (ChatActivity) obj;
                rx rxVar = chatActivity.m;
                if (rxVar != null) {
                    rxVar.f();
                }
                if (i == 42) {
                    k13.c.g(new Integer(0));
                    tt3 tt3Var = cz.E;
                    if (tt3Var != null) {
                        int length = tt3Var.c.length();
                        if (length > 20) {
                            length = 20;
                        }
                        str = tt3Var.c.substring(0, length);
                    } else {
                        str = "";
                    }
                    zf3.T(chatActivity, null, new wy(chatActivity, "Network Diagnostic Test is done. " + ((Object) str), null), 3);
                }
                return ch3Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    @Override // defpackage.iz0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r8, defpackage.c90 r9) {
        /*
            r7 = this;
            ch3 r0 = defpackage.ch3.f636a
            int r1 = r7.f3020a
            java.lang.Object r2 = r7.f3021b
            r3 = 1
            switch(r1) {
                case 0: goto L20;
                case 1: goto L16;
                case 2: goto Lc;
                default: goto La;
            }
        La:
            goto L90
        Lc:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r7.a(r8)
            return r0
        L16:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r7.a(r8)
            return r0
        L20:
            boolean r1 = r9 instanceof defpackage.jv2
            if (r1 == 0) goto L33
            r1 = r9
            jv2 r1 = (defpackage.jv2) r1
            int r4 = r1.f
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L33
            int r4 = r4 - r5
            r1.f = r4
            goto L38
        L33:
            jv2 r1 = new jv2
            r1.<init>(r7, r9)
        L38:
            java.lang.Object r9 = r1.e
            ba0 r4 = defpackage.ba0.f430a
            int r5 = r1.f
            if (r5 == 0) goto L4e
            if (r5 != r3) goto L46
            defpackage.fl.a0(r9)
            goto L6e
        L46:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4e:
            defpackage.fl.a0(r9)
            iz0 r2 = (defpackage.iz0) r2
            y03 r8 = (defpackage.y03) r8
            boolean r9 = r8 instanceof defpackage.rg2
            if (r9 != 0) goto L8b
            boolean r9 = r8 instanceof defpackage.kx0
            if (r9 != 0) goto L86
            boolean r9 = r8 instanceof defpackage.kd0
            if (r9 == 0) goto L6f
            kd0 r8 = (defpackage.kd0) r8
            java.lang.Object r8 = r8.f2936a
            r1.f = r3
            java.lang.Object r8 = r2.b(r8, r1)
            if (r8 != r4) goto L6e
            r0 = r4
        L6e:
            return r0
        L6f:
            boolean r8 = r8 instanceof defpackage.xg3
            if (r8 == 0) goto L7f
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L7f:
            j11 r8 = new j11
            r9 = 0
            r8.<init>(r9)
            throw r8
        L86:
            kx0 r8 = (defpackage.kx0) r8
            java.lang.Throwable r8 = r8.f3028a
            throw r8
        L8b:
            rg2 r8 = (defpackage.rg2) r8
            java.lang.Throwable r8 = r8.f4152a
            throw r8
        L90:
            xc2 r8 = (defpackage.xc2) r8
            com.security.xvpn.z35kb.television.GuideActivity r2 = (com.security.xvpn.z35kb.television.GuideActivity) r2
            rn r9 = r2.f
            if (r9 == 0) goto L9b
            r9.dismissAllowingStateLoss()
        L9b:
            uc2 r9 = defpackage.uc2.f4649a
            boolean r9 = defpackage.m20.L(r8, r9)
            if (r9 != 0) goto Lab
            wc2 r9 = defpackage.wc2.f4982a
            boolean r9 = defpackage.m20.L(r8, r9)
            if (r9 == 0) goto Lce
        Lab:
            ui2 r9 = new ui2
            r9.<init>()
            r9.d = r3
            yy2 r1 = new yy2
            r3 = 17
            r1.<init>(r2, r3)
            r9.e = r1
            e61 r1 = new e61
            r3 = 0
            r1.<init>(r8, r3)
            r9.c = r1
            androidx.fragment.app.p r8 = r2.getSupportFragmentManager()
            java.lang.String r1 = "PurchaseState"
            r9.show(r8, r1)
            r2.f = r9
        Lce:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kv2.b(java.lang.Object, c90):java.lang.Object");
    }
}
