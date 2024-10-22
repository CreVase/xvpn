package com.facebook.ads.redexgen.X;

import com.facebook.ads.MediaViewVideoRenderer;

/* loaded from: assets/audience_network.dex */
public class E8 extends MI {
    public final /* synthetic */ C5V A00;

    public E8(C5V c5v) {
        this.A00 = c5v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC02028a
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(MJ mj) {
        MediaViewVideoRenderer mediaViewVideoRenderer;
        if (this.A00.A08 != null) {
            UJ.A0L(this.A00.A08.getInternalNativeAd()).A1c(true, true);
        }
        mediaViewVideoRenderer = this.A00.A00;
        mediaViewVideoRenderer.onPlayed();
    }
}
