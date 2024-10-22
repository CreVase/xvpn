package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Tv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0740Tv implements LB {
    public final LA A00;
    public final LB A01;

    public C0740Tv(LB lb, int i, int i2) {
        this.A01 = lb;
        this.A00 = new LA(i, i2);
    }

    @Override // com.facebook.ads.redexgen.X.LB
    public final void ADy(String str) {
        boolean A08;
        this.A00.A04(str);
        if (this.A00.A02() != null) {
            A08 = LD.A08(this.A00);
            if (A08) {
                this.A01.ADy(this.A00.A02());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.LB
    public final void flush() {
        boolean A08;
        this.A00.A03();
        while (this.A00.A02() != null) {
            A08 = LD.A08(this.A00);
            if (A08) {
                this.A01.ADy(this.A00.A02());
            }
            this.A00.A03();
        }
    }
}
