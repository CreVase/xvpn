package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Sv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0715Sv implements InterfaceC0500Km {
    public final /* synthetic */ C9D A00;

    public C0715Sv(C9D c9d) {
        this.A00 = c9d;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0500Km
    public final void AAv() {
        AbstractC0530Ls abstractC0530Ls;
        AbstractC0530Ls abstractC0530Ls2;
        this.A00.A07 = false;
        abstractC0530Ls = this.A00.A04;
        if (abstractC0530Ls != null) {
            abstractC0530Ls2 = this.A00.A04;
            abstractC0530Ls2.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0500Km
    public final void ACZ(float f) {
        AbstractC0530Ls abstractC0530Ls;
        AbstractC0530Ls abstractC0530Ls2;
        abstractC0530Ls = this.A00.A04;
        if (abstractC0530Ls != null) {
            float A00 = 1.0f - (f / ((float) this.A00.getAdInfo().A0G().A00()));
            abstractC0530Ls2 = this.A00.A04;
            abstractC0530Ls2.setProgressImmediate(100.0f * A00);
        }
    }
}
