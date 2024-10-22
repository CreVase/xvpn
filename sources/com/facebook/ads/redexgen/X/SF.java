package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.view.FullScreenAdToolbar;

/* loaded from: assets/audience_network.dex */
public class SF implements P0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SD A01;

    public SF(SD sd, int i) {
        this.A01 = sd;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.P0
    public final void AAf() {
        this.A01.A0Q(false, this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.P0
    public final void AB2(int i) {
        SD.A01(this.A01, i);
    }

    @Override // com.facebook.ads.redexgen.X.P0
    public final void ABO(float f) {
        boolean z;
        z = this.A01.A08;
        if (!z) {
            this.A01.A0F(f);
        }
    }

    @Override // com.facebook.ads.redexgen.X.P0
    public final void ACw(boolean z) {
        this.A01.A0P(z);
    }

    @Override // com.facebook.ads.redexgen.X.P0
    public final void ADN(String str) {
        YA ya;
        InterfaceC0531Lt interfaceC0531Lt;
        MM mm;
        ya = this.A01.A0D;
        ya.A0E().A2v(str);
        interfaceC0531Lt = this.A01.A0H;
        mm = this.A01.A0J;
        interfaceC0531Lt.A3z(mm.A6r());
        this.A01.A0G(3);
    }

    @Override // com.facebook.ads.redexgen.X.P0
    public final void AG5() {
        FullScreenAdToolbar fullScreenAdToolbar;
        FullScreenAdToolbar fullScreenAdToolbar2;
        this.A01.A09 = false;
        fullScreenAdToolbar = this.A01.A0I;
        fullScreenAdToolbar.setProgressImmediate(0.0f);
        fullScreenAdToolbar2 = this.A01.A0I;
        fullScreenAdToolbar2.setToolbarActionMode(2);
    }

    @Override // com.facebook.ads.redexgen.X.P0
    public final void AG6(float f) {
        FullScreenAdToolbar fullScreenAdToolbar;
        fullScreenAdToolbar = this.A01.A0I;
        fullScreenAdToolbar.setProgress(100.0f * f);
    }
}
