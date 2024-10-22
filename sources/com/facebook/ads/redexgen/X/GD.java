package com.facebook.ads.redexgen.X;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class GD implements RO {
    public final RG A00;
    public final C4E A01;

    public GD(C4E c4e, RG rg) {
        this.A01 = c4e;
        this.A00 = rg;
    }

    @Override // com.facebook.ads.redexgen.X.RO
    public void A3V(Map<R6, RT> map, Map<InterfaceC0394Gf, RG> map2) {
        map2.put(this.A01, this.A00);
    }
}
