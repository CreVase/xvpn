package com.facebook.ads.redexgen.X;

import com.facebook.ads.MediaViewVideoRenderer;

/* loaded from: assets/audience_network.dex */
public class E6 extends M7 {
    public final /* synthetic */ C5V A00;

    public E6(C5V c5v) {
        this.A00 = c5v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC02028a
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(M8 m8) {
        MediaViewVideoRenderer mediaViewVideoRenderer;
        mediaViewVideoRenderer = this.A00.A00;
        mediaViewVideoRenderer.onSeek();
    }
}
