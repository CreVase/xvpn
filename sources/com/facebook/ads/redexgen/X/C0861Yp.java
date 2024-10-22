package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdListener;

/* renamed from: com.facebook.ads.redexgen.X.Yp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0861Yp extends AbstractRunnableC0483Jv {
    public final /* synthetic */ C0859Yn A00;

    public C0861Yp(C0859Yn c0859Yn) {
        this.A00 = c0859Yn;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0483Jv
    public final void A01() {
        C5D c5d;
        C5D c5d2;
        C5D c5d3;
        c5d = this.A00.A01;
        if (c5d.A06() != null) {
            c5d2 = this.A00.A01;
            AdListener A06 = c5d2.A06();
            c5d3 = this.A00.A01;
            A06.onAdClicked(c5d3.A07());
        }
    }
}
