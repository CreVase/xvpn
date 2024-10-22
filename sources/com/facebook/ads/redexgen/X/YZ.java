package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class YZ extends AbstractRunnableC0483Jv {
    public final /* synthetic */ YY A00;

    public YZ(YY yy) {
        this.A00 = yy;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0483Jv
    public final void A01() {
        C01355a c01355a;
        C01355a c01355a2;
        c01355a = this.A00.A01.A00;
        if (c01355a.A00() != null) {
            c01355a2 = this.A00.A01.A00;
            c01355a2.A00().onAdsLoaded();
        }
    }
}
