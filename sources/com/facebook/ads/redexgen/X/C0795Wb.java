package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Wb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0795Wb implements InterfaceC0285Bj {
    public final /* synthetic */ C0794Wa A00;

    public C0795Wb(C0794Wa c0794Wa) {
        this.A00 = c0794Wa;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0285Bj
    public final long A6k() {
        CW cw;
        long j;
        cw = this.A00.A0B;
        j = this.A00.A07;
        return cw.A03(j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0285Bj
    public final C0284Bi A7l(long granule) {
        CW cw;
        long j;
        long A00;
        long j2;
        if (granule == 0) {
            j2 = this.A00.A09;
            return new C0284Bi(new C0286Bk(0L, j2));
        }
        cw = this.A00.A0B;
        long A04 = cw.A04(granule);
        C0794Wa c0794Wa = this.A00;
        j = c0794Wa.A09;
        A00 = c0794Wa.A00(j, A04, 30000L);
        return new C0284Bi(new C0286Bk(granule, A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0285Bj
    public final boolean A95() {
        return true;
    }
}
