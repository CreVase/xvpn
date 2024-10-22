package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class Q0 extends AbstractC02028a<AnonymousClass71> {
    public final /* synthetic */ AnonymousClass76 A00;

    public Q0(AnonymousClass76 anonymousClass76) {
        this.A00 = anonymousClass76;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC02028a
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(AnonymousClass71 anonymousClass71) {
        RX rx;
        RX rx2;
        int A00 = anonymousClass71.A00();
        int currentPositionMS = this.A00.A00;
        if (currentPositionMS > 0) {
            rx = this.A00.A0B;
            int currentPositionMS2 = rx.getDuration();
            if (A00 == currentPositionMS2) {
                rx2 = this.A00.A0B;
                int duration = rx2.getDuration();
                int currentPositionMS3 = this.A00.A00;
                if (duration > currentPositionMS3) {
                    return;
                }
            }
        }
        this.A00.A0e(A00);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02028a
    public final Class<AnonymousClass71> A01() {
        return AnonymousClass71.class;
    }
}
