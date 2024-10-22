package com.facebook.ads.redexgen.X;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.facebook.ads.redexgen.X.at, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0951at extends K8 {
    public final /* synthetic */ C00290v A00;

    public C0951at(C00290v c00290v) {
        this.A00 = c00290v;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        C00280u c00280u;
        CountDownLatch countDownLatch;
        this.A00.A07();
        c00280u = this.A00.A02;
        c00280u.A06();
        countDownLatch = this.A00.A05;
        countDownLatch.countDown();
    }
}
