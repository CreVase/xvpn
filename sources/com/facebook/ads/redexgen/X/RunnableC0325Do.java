package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;

/* renamed from: com.facebook.ads.redexgen.X.Do, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0325Do implements Runnable {
    public final /* synthetic */ RunnableC0326Dp A00;
    public final /* synthetic */ DownloadAction[] A01;

    public RunnableC0325Do(RunnableC0326Dp runnableC0326Dp, DownloadAction[] downloadActionArr) {
        this.A00 = runnableC0326Dp;
        this.A01 = downloadActionArr;
    }

    /* JADX WARN: Incorrect condition in loop: B:24:0x0091 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r7 = this;
            boolean r0 = com.facebook.ads.redexgen.X.K0.A02(r7)
            if (r0 == 0) goto L7
            return
        L7:
            r3 = r7
            com.facebook.ads.redexgen.X.Dp r0 = r3.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dy r0 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            boolean r0 = com.facebook.ads.redexgen.X.C0335Dy.A0L(r0)     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto L13
            return
        L13:
            com.facebook.ads.redexgen.X.Dp r0 = r3.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dy r0 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            java.util.ArrayList r0 = com.facebook.ads.redexgen.X.C0335Dy.A06(r0)     // Catch: java.lang.Throwable -> Lb2
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb2
            r4.<init>(r0)     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dp r0 = r3.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dy r0 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            java.util.ArrayList r0 = com.facebook.ads.redexgen.X.C0335Dy.A06(r0)     // Catch: java.lang.Throwable -> Lb2
            r0.clear()     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction[] r6 = r3.A01     // Catch: java.lang.Throwable -> Lb2
            int r5 = r6.length     // Catch: java.lang.Throwable -> Lb2
            r2 = 0
        L2f:
            if (r2 >= r5) goto L3d
            r1 = r6[r2]     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dp r0 = r3.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dy r0 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.C0335Dy.A03(r0, r1)     // Catch: java.lang.Throwable -> Lb2
            int r2 = r2 + 1
            goto L2f
        L3d:
            com.facebook.ads.redexgen.X.Dp r0 = r3.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dy r1 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            r0 = 1
            com.facebook.ads.redexgen.X.C0335Dy.A0M(r1, r0)     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dp r0 = r3.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dy r0 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            java.util.concurrent.CopyOnWriteArraySet r0 = com.facebook.ads.redexgen.X.C0335Dy.A07(r0)     // Catch: java.lang.Throwable -> Lb2
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> Lb2
        L51:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto L65
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dr r1 = (com.facebook.ads.redexgen.X.InterfaceC0328Dr) r1     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dp r0 = r3.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dy r0 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            r1.ABa(r0)     // Catch: java.lang.Throwable -> Lb2
            goto L51
        L65:
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> Lb2
            if (r0 != 0) goto L7d
            com.facebook.ads.redexgen.X.Dp r0 = r3.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dy r0 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            java.util.ArrayList r0 = com.facebook.ads.redexgen.X.C0335Dy.A06(r0)     // Catch: java.lang.Throwable -> Lb2
            r0.addAll(r4)     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dp r0 = r3.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dy r0 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.C0335Dy.A0F(r0)     // Catch: java.lang.Throwable -> Lb2
        L7d:
            com.facebook.ads.redexgen.X.Dp r0 = r3.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dy r0 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.C0335Dy.A0G(r0)     // Catch: java.lang.Throwable -> Lb2
            r2 = 0
        L85:
            com.facebook.ads.redexgen.X.Dp r0 = r3.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dy r0 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            java.util.ArrayList r0 = com.facebook.ads.redexgen.X.C0335Dy.A06(r0)     // Catch: java.lang.Throwable -> Lb2
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lb2
            if (r2 >= r0) goto Lb1
            com.facebook.ads.redexgen.X.Dp r0 = r3.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dy r0 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            java.util.ArrayList r0 = com.facebook.ads.redexgen.X.C0335Dy.A06(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r1 = r0.get(r2)     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dv r1 = (com.facebook.ads.redexgen.X.RunnableC0332Dv) r1     // Catch: java.lang.Throwable -> Lb2
            int r0 = com.facebook.ads.redexgen.X.RunnableC0332Dv.A03(r1)     // Catch: java.lang.Throwable -> Lb2
            if (r0 != 0) goto Lae
            com.facebook.ads.redexgen.X.Dp r0 = r3.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dy r0 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.C0335Dy.A0H(r0, r1)     // Catch: java.lang.Throwable -> Lb2
        Lae:
            int r2 = r2 + 1
            goto L85
        Lb1:
            return
        Lb2:
            r0 = move-exception
            com.facebook.ads.redexgen.X.K0.A00(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.RunnableC0325Do.run():void");
    }
}
