package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.aD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0909aD implements C6I {
    public final boolean A00;

    public abstract void A00();

    public abstract void A01(boolean z);

    public AbstractC0909aD(boolean z) {
        this.A00 = z;
    }

    @Override // com.facebook.ads.redexgen.X.C6I
    public final void AAn() {
        if (this.A00) {
            A00();
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C6I
    public final void AAw() {
        A01(true);
    }
}
