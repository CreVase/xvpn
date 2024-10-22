package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class SN implements InterfaceC0500Km {
    public final /* synthetic */ SM A00;

    public SN(SM sm) {
        this.A00 = sm;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0500Km
    public final void AAv() {
        P0 p0;
        int i;
        P0 p02;
        p0 = this.A00.A0F;
        i = this.A00.A0A;
        p0.AB2(i);
        p02 = this.A00.A0F;
        p02.AAf();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0500Km
    public final void ACZ(float f) {
        int i;
        boolean z;
        RX rx;
        int duration;
        boolean z2;
        int i2;
        P0 p0;
        i = this.A00.A0A;
        float f2 = i - f;
        z = this.A00.A0V;
        if (z) {
            duration = 0;
        } else {
            rx = this.A00.A0I;
            duration = rx.getDuration();
        }
        float totalForce = f2 + duration;
        z2 = this.A00.A0V;
        if (z2) {
            i2 = this.A00.A0A;
        } else {
            i2 = this.A00.A09;
        }
        float seenTime = i2;
        float totalForce2 = totalForce / seenTime;
        p0 = this.A00.A0F;
        p0.AG6(totalForce2);
    }
}
