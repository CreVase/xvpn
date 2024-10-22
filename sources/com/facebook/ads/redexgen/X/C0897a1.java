package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.a1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0897a1 extends K8 {
    public final /* synthetic */ FA A00;
    public final /* synthetic */ C00521s A01;
    public final /* synthetic */ EV A02;

    public C0897a1(EV ev, C00521s c00521s, FA fa) {
        this.A02 = ev;
        this.A01 = c00521s;
        this.A00 = fa;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        this.A02.A0P(this.A01);
        this.A02.A0M(this.A00);
        this.A02.A00 = null;
        AdErrorType adErrorType = AdErrorType.RV_AD_TIMEOUT;
        this.A02.A0B.A0E().A4p(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
        this.A02.A06.A0G(new JG(adErrorType, ""));
    }
}
