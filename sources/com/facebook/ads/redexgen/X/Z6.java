package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class Z6 implements InterfaceC01063w {
    public final /* synthetic */ ED A00;

    public Z6(ED ed) {
        this.A00 = ed;
    }

    private final void A00(C01073x c01073x) {
        switch (c01073x.A00) {
            case 1:
                this.A00.A06.A1Q(this.A00, c01073x.A02, c01073x.A01);
                return;
            case 2:
                this.A00.A06.A1R(this.A00, c01073x.A02, c01073x.A01);
                return;
            case 3:
            case 5:
            case 6:
            case 7:
            default:
                return;
            case 4:
                this.A00.A06.A1T(this.A00, c01073x.A02, c01073x.A01, c01073x.A03);
                return;
            case 8:
                this.A00.A06.A1S(this.A00, c01073x.A02, c01073x.A01, 1);
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01063w
    public final AbstractC01294u A5e(int i) {
        AbstractC01294u A1G = this.A00.A1G(i, true);
        if (A1G == null || this.A00.A01.A0K(A1G.A0H)) {
            return null;
        }
        return A1G;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01063w
    public final void A9z(int i, int i2, Object obj) {
        this.A00.A1g(i, i2, obj);
        this.A00.A0H = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01063w
    public final void AAJ(int i, int i2) {
        this.A00.A1d(i, i2);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01063w
    public final void AAK(int i, int i2) {
        this.A00.A1e(i, i2);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01063w
    public final void AAL(int i, int i2) {
        this.A00.A1h(i, i2, true);
        this.A00.A0G = true;
        this.A00.A0s.A00 += i2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01063w
    public final void AAM(int i, int i2) {
        this.A00.A1h(i, i2, false);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01063w
    public final void AB4(C01073x c01073x) {
        A00(c01073x);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01063w
    public final void AB6(C01073x c01073x) {
        A00(c01073x);
    }
}
