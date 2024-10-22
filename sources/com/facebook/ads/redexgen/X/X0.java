package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class X0 implements InterfaceC0285Bj {
    public final long A00;
    public final C0284Bi A01;

    public X0(long j) {
        this(j, 0L);
    }

    public X0(long j, long j2) {
        this.A00 = j;
        this.A01 = new C0284Bi(j2 == 0 ? C0286Bk.A03 : new C0286Bk(0L, j2));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0285Bj
    public final long A6k() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0285Bj
    public final C0284Bi A7l(long j) {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0285Bj
    public final boolean A95() {
        return false;
    }
}
