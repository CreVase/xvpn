package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.6y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C01786y extends MI {
    public final /* synthetic */ K2 A00;

    public C01786y(K2 k2) {
        this.A00 = k2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC02028a
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(MJ mj) {
        if (K2.A07(this.A00) && K2.A08(this.A00)) {
            K2.A0B(this.A00, false);
            if (K2.A0A(this.A00, Q5.A04) || K2.A09(this.A00)) {
                K2.A0C(this.A00, false);
                K2.A01(this.A00).postDelayed(new K4(this), K2.A00(this.A00));
            } else {
                if (!K2.A0A(this.A00, Q5.A03)) {
                    return;
                }
                K2.A04(this.A00);
                K2.A05(this.A00, true, true);
            }
        }
    }
}
