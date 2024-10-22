package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.a7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0903a7 extends K8 {
    public final /* synthetic */ C0941aj A00;
    public final /* synthetic */ C00521s A01;
    public final /* synthetic */ C0359Ew A02;

    public C0903a7(C0359Ew c0359Ew, C00521s c00521s, C0941aj c0941aj) {
        this.A02 = c0359Ew;
        this.A01 = c00521s;
        this.A00 = c0941aj;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        this.A02.A0P(this.A01);
        this.A02.A0M(this.A00);
        this.A02.A00 = null;
        JG A00 = JG.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0E().A4p(A00.A03().getErrorCode(), A00.A04());
        this.A02.A06.A0G(A00);
    }
}
