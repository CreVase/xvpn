package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class SA extends K8 {
    public final /* synthetic */ C8B A00;

    public SA(C8B c8b) {
        this.A00 = c8b;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        AbstractC0585Nv abstractC0585Nv;
        int closeButtonStyle;
        AtomicBoolean atomicBoolean;
        AbstractC0585Nv abstractC0585Nv2;
        abstractC0585Nv = this.A00.A00;
        if (abstractC0585Nv != null) {
            abstractC0585Nv2 = this.A00.A00;
            abstractC0585Nv2.A0x();
        }
        AbstractC0530Ls abstractC0530Ls = this.A00.A07;
        closeButtonStyle = this.A00.getCloseButtonStyle();
        abstractC0530Ls.setToolbarActionMode(closeButtonStyle);
        this.A00.A07.A04();
        atomicBoolean = this.A00.A05;
        atomicBoolean.set(true);
    }
}
