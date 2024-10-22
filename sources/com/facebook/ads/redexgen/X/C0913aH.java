package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.aH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0913aH implements InterfaceC00471n {
    public final /* synthetic */ C00391f A00;

    public C0913aH(C00391f c00391f) {
        this.A00 = c00391f;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00471n
    public final void ACM(AdError adError) {
        InterfaceC00381e interfaceC00381e;
        interfaceC00381e = this.A00.A04;
        interfaceC00381e.AAP(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00471n
    public final void ACN() {
        InterfaceC00381e interfaceC00381e;
        interfaceC00381e = this.A00.A04;
        interfaceC00381e.AAQ();
    }
}
