package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ya, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0846Ya extends AbstractRunnableC0483Jv {
    public final /* synthetic */ YX A00;
    public final /* synthetic */ JG A01;

    public C0846Ya(YX yx, JG jg) {
        this.A00 = yx;
        this.A01 = jg;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0483Jv
    public final void A01() {
        C01355a c01355a;
        C01355a c01355a2;
        c01355a = this.A00.A00;
        if (c01355a.A00() != null) {
            c01355a2 = this.A00.A00;
            c01355a2.A00().onAdError(C0493Kf.A00(this.A01));
        }
    }
}
