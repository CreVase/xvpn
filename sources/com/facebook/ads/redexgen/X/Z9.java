package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class Z9 extends C4M {
    public Z9(AbstractC01124c abstractC01124c) {
        super(abstractC01124c, null);
    }

    @Override // com.facebook.ads.redexgen.X.C4M
    public final int A06() {
        return this.A02.A0X();
    }

    @Override // com.facebook.ads.redexgen.X.C4M
    public final int A07() {
        return this.A02.A0X() - this.A02.A0d();
    }

    @Override // com.facebook.ads.redexgen.X.C4M
    public final int A08() {
        return this.A02.A0d();
    }

    @Override // com.facebook.ads.redexgen.X.C4M
    public final int A09() {
        return this.A02.A0Y();
    }

    @Override // com.facebook.ads.redexgen.X.C4M
    public final int A0A() {
        return this.A02.A0g();
    }

    @Override // com.facebook.ads.redexgen.X.C4M
    public final int A0B() {
        return (this.A02.A0X() - this.A02.A0g()) - this.A02.A0d();
    }

    @Override // com.facebook.ads.redexgen.X.C4M
    public final int A0C(View view) {
        return this.A02.A0j(view) + ((C01134d) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.X.C4M
    public final int A0D(View view) {
        C01134d c01134d = (C01134d) view.getLayoutParams();
        return this.A02.A0l(view) + c01134d.topMargin + c01134d.bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.X.C4M
    public final int A0E(View view) {
        C01134d c01134d = (C01134d) view.getLayoutParams();
        return this.A02.A0m(view) + c01134d.leftMargin + c01134d.rightMargin;
    }

    @Override // com.facebook.ads.redexgen.X.C4M
    public final int A0F(View view) {
        return this.A02.A0o(view) - ((C01134d) view.getLayoutParams()).topMargin;
    }

    @Override // com.facebook.ads.redexgen.X.C4M
    public final int A0G(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.bottom;
    }

    @Override // com.facebook.ads.redexgen.X.C4M
    public final int A0H(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.top;
    }

    @Override // com.facebook.ads.redexgen.X.C4M
    public final void A0J(int i) {
        this.A02.A10(i);
    }
}
