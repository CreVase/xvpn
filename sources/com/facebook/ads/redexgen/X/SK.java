package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class SK implements InterfaceC0500Km {
    public final /* synthetic */ int A00;
    public final /* synthetic */ K8 A01;
    public final /* synthetic */ SH A02;

    public SK(SH sh, int i, K8 k8) {
        this.A02 = sh;
        this.A00 = i;
        this.A01 = k8;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0500Km
    public final void AAv() {
        this.A01.run();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0500Km
    public final void ACZ(float f) {
        this.A02.A07.setProgress(100.0f * (1.0f - (f / this.A00)));
    }
}
