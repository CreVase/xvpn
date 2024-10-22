package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.aA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0906aA extends K8 {
    public final /* synthetic */ AbstractC0905a9 A00;
    public final /* synthetic */ JG A01;

    public C0906aA(AbstractC0905a9 abstractC0905a9, JG jg) {
        this.A00 = abstractC0905a9;
        this.A01 = jg;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        this.A00.A0B.A0E().A4p(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A06 != null) {
            this.A00.A06.A0G(this.A01);
        }
    }
}
