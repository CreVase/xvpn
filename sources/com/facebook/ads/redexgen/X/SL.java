package com.facebook.ads.redexgen.X;

import android.text.TextUtils;

/* loaded from: assets/audience_network.dex */
public class SL extends AbstractC0642Qa {
    public final /* synthetic */ SH A00;

    public SL(SH sh) {
        this.A00 = sh;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0642Qa
    public final void A03() {
        if (!this.A00.A06.A07()) {
            this.A00.A06.A05();
            if (!TextUtils.isEmpty(this.A00.A01.A11())) {
                this.A00.A04.A9S(this.A00.A01.A11(), new NL().A03(this.A00.A0A).A02(this.A00.A06).A04(this.A00.A01.A0N()).A05());
                C1R.A07(this.A00.A01.A0x(), this.A00.A03);
                this.A00.A03.A0E().A2g();
                C2C.A00(this.A00.A01.A0M());
                this.A00.A08.A3z(this.A00.A09.A74());
            }
        }
    }
}
