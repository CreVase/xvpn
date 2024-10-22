package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.aU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0926aU implements NK {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC0925aT A01;
    public final /* synthetic */ UJ A02;

    public C0926aU(AbstractC0925aT abstractC0925aT, int i, UJ uj) {
        this.A01 = abstractC0925aT;
        this.A00 = i;
        this.A02 = uj;
    }

    @Override // com.facebook.ads.redexgen.X.NK
    public final void ABX(boolean z) {
        AbstractC0642Qa abstractC0642Qa;
        if (this.A00 == 0) {
            UJ uj = this.A02;
            abstractC0642Qa = this.A01.A04;
            uj.A1Z(abstractC0642Qa);
        }
        this.A02.A1c(z, true);
    }
}
