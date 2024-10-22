package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Wi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0802Wi implements C3 {
    public final int A00;
    public final int A01;
    public final C0420Hh A02;

    public C0802Wi(C0803Wj c0803Wj) {
        C0420Hh c0420Hh = c0803Wj.A00;
        this.A02 = c0420Hh;
        c0420Hh.A0Y(12);
        this.A00 = c0420Hh.A0H();
        this.A01 = c0420Hh.A0H();
    }

    @Override // com.facebook.ads.redexgen.X.C3
    public final int A7g() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.C3
    public final boolean A8s() {
        return this.A00 != 0;
    }

    @Override // com.facebook.ads.redexgen.X.C3
    public final int AEF() {
        int i = this.A00;
        return i == 0 ? this.A02.A0H() : i;
    }
}
