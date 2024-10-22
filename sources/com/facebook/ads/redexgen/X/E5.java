package com.facebook.ads.redexgen.X;

import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.VideoStartReason;

/* loaded from: assets/audience_network.dex */
public class E5 extends AbstractC0591Ob {
    public final /* synthetic */ C5V A00;

    public E5(C5V c5v) {
        this.A00 = c5v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC02028a
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(AnonymousClass75 anonymousClass75) {
        MediaViewVideoRenderer mediaViewVideoRenderer;
        MediaViewVideoRenderer mediaViewVideoRenderer2;
        MediaViewVideoRenderer mediaViewVideoRenderer3;
        mediaViewVideoRenderer = this.A00.A00;
        mediaViewVideoRenderer.onCompleted();
        mediaViewVideoRenderer2 = this.A00.A00;
        if (IP.A1J(mediaViewVideoRenderer2.getContext())) {
            mediaViewVideoRenderer3 = this.A00.A00;
            mediaViewVideoRenderer3.play(VideoStartReason.AUTO_STARTED);
        }
    }
}
