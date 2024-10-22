package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class SR implements InterfaceC0500Km {
    public final /* synthetic */ SQ A00;

    public SR(SQ sq) {
        this.A00 = sq;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0500Km
    public final void AAv() {
        P0 p0;
        P0 p02;
        int i;
        p0 = this.A00.A05;
        p0.ACw(false);
        p02 = this.A00.A05;
        i = this.A00.A02;
        p02.AB2(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0500Km
    public final void ACZ(float f) {
        P0 p0;
        int i;
        p0 = this.A00.A05;
        i = this.A00.A02;
        p0.ABO(i - f);
    }
}
