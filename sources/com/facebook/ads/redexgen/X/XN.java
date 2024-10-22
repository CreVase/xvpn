package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class XN implements InterfaceC0257Af {
    public final XH A00;
    public final XG A01;
    public final AJ[] A02;

    public XN(AJ... ajArr) {
        AJ[] ajArr2 = (AJ[]) Arrays.copyOf(ajArr, ajArr.length + 2);
        this.A02 = ajArr2;
        XH xh = new XH();
        this.A00 = xh;
        XG xg = new XG();
        this.A01 = xg;
        ajArr2[ajArr.length] = xh;
        ajArr2[ajArr.length + 1] = xg;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0257Af
    public final C02329f A3X(C02329f c02329f) {
        this.A00.A0B(c02329f.A02);
        return new C02329f(this.A01.A01(c02329f.A01), this.A01.A00(c02329f.A00), c02329f.A02);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0257Af
    public final AJ[] A5z() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0257Af
    public final long A7H(long j) {
        return this.A01.A02(j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0257Af
    public final long A7s() {
        return this.A00.A0A();
    }
}
