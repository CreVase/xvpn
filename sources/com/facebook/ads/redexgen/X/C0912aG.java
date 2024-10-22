package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.aG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0912aG implements InterfaceC01505p {
    public final /* synthetic */ C00391f A00;

    public C0912aG(C00391f c00391f) {
        this.A00 = c00391f;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01505p
    public final void AAW() {
        InterfaceC00381e interfaceC00381e;
        interfaceC00381e = this.A00.A04;
        interfaceC00381e.AAQ();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01505p
    public final void AAX() {
        InterfaceC00381e interfaceC00381e;
        interfaceC00381e = this.A00.A04;
        interfaceC00381e.AAP(AdError.CACHE_ERROR);
    }
}
