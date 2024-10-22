package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class RZ extends K8 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ RX A02;

    public RZ(RX rx, int i, int i2) {
        this.A02 = rx;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        C8Z c8z;
        c8z = this.A02.A0B;
        c8z.A02(new M8(this.A00, this.A01));
    }
}
