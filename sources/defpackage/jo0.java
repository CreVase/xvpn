package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class jo0 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2799b;

    public /* synthetic */ jo0(Object obj, int i) {
        this.f2798a = i;
        this.f2799b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:            if (r7 != 3) goto L21;     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            int r0 = r6.f2798a
            r1 = 1
            java.lang.Object r2 = r6.f2799b
            r3 = 0
            switch(r0) {
                case 0: goto L52;
                case 1: goto L3b;
                case 2: goto L22;
                case 3: goto Lb;
                default: goto L9;
            }
        L9:
            goto L84
        Lb:
            jz r2 = (defpackage.jz) r2
            int r8 = defpackage.jz.l
            android.view.ViewParent r7 = r7.getParent()
            android.widget.EditText r8 = r2.c
            int r8 = r8.getLineCount()
            r0 = 4
            if (r8 <= r0) goto L1d
            goto L1e
        L1d:
            r1 = 0
        L1e:
            r7.requestDisallowInterceptTouchEvent(r1)
            return r3
        L22:
            com.security.xvpn.z35kb.livechat.ChatActivity r2 = (com.security.xvpn.z35kb.livechat.ChatActivity) r2
            int r7 = com.security.xvpn.z35kb.livechat.ChatActivity.L
            int r7 = r8.getAction()
            if (r7 == 0) goto L38
            if (r7 == r1) goto L35
            r8 = 2
            if (r7 == r8) goto L38
            r8 = 3
            if (r7 == r8) goto L35
            goto L3a
        L35:
            r2.y = r3
            goto L3a
        L38:
            r2.y = r1
        L3a:
            return r3
        L3b:
            g43 r2 = (defpackage.g43) r2
            int r7 = r8.getAction()
            if (r7 != 0) goto L50
            r2.d = r3
            boolean r7 = r2.c(r3)
            if (r7 != 0) goto L4e
            r2.d = r1
            goto L51
        L4e:
            r2.d = r3
        L50:
            r1 = 0
        L51:
            return r1
        L52:
            lo0 r2 = (defpackage.lo0) r2
            r2.getClass()
            int r7 = r8.getAction()
            if (r7 != r1) goto L83
            long r7 = java.lang.System.currentTimeMillis()
            long r4 = r2.o
            long r7 = r7 - r4
            r4 = 0
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 < 0) goto L73
            r4 = 300(0x12c, double:1.48E-321)
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 <= 0) goto L71
            goto L73
        L71:
            r7 = 0
            goto L74
        L73:
            r7 = 1
        L74:
            if (r7 == 0) goto L78
            r2.m = r3
        L78:
            r2.u()
            r2.m = r1
            long r7 = java.lang.System.currentTimeMillis()
            r2.o = r7
        L83:
            return r3
        L84:
            com.vungle.ads.internal.ui.view.MRAIDAdWidget$OnViewTouchListener r2 = (com.vungle.ads.internal.ui.view.MRAIDAdWidget.OnViewTouchListener) r2
            boolean r7 = com.vungle.ads.internal.ui.view.MRAIDAdWidget.a(r2, r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
