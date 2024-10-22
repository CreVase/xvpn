package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class Z8 implements AnonymousClass51 {
    public final /* synthetic */ ED A00;

    public Z8(ED ed) {
        this.A00 = ed;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass51
    public final void ADz(AbstractC01294u abstractC01294u, C4X c4x, C4X c4x2) {
        this.A00.A1o(abstractC01294u, c4x, c4x2);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass51
    public final void AE1(AbstractC01294u abstractC01294u, C4X c4x, C4X c4x2) {
        this.A00.A0r.A0c(abstractC01294u);
        this.A00.A1p(abstractC01294u, c4x, c4x2);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass51
    public final void AE3(AbstractC01294u abstractC01294u, C4X c4x, C4X c4x2) {
        abstractC01294u.A0Z(false);
        if (this.A00.A0C) {
            if (this.A00.A05.A0H(abstractC01294u, abstractC01294u, c4x, c4x2)) {
                this.A00.A1N();
            }
        } else {
            if (!this.A00.A05.A0G(abstractC01294u, c4x, c4x2)) {
                return;
            }
            this.A00.A1N();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass51
    public final void AG3(AbstractC01294u abstractC01294u) {
        this.A00.A06.A1D(abstractC01294u.A0H, this.A00.A0r);
    }
}
