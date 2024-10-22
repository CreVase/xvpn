package com.facebook.ads.redexgen.X;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class G3 implements RO {
    public final C0398Gl A00;
    public final RT A01;

    public G3(C0398Gl c0398Gl, RT rt) {
        this.A00 = c0398Gl;
        this.A01 = rt;
    }

    @Override // com.facebook.ads.redexgen.X.RO
    public void A3V(Map<R6, RT> map, Map<InterfaceC0394Gf, RG> map2) {
        map.put(this.A00, this.A01);
    }
}
