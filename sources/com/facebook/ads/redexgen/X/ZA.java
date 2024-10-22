package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class ZA extends C4M {
    public ZA(AbstractC01124c abstractC01124c) {
        super(abstractC01124c, null);
    }

    @Override // com.facebook.ads.redexgen.X.C4M
    public final int A06() {
        return this.A02.A0h();
    }

    @Override // com.facebook.ads.redexgen.X.C4M
    public final int A07() {
        return this.A02.A0h() - this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.X.C4M
    public final int A08() {
        return this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.X.C4M
    public final int A09() {
        return this.A02.A0i();
    }

    @Override // com.facebook.ads.redexgen.X.C4M
    public final int A0A() {
        return this.A02.A0e();
    }

    @Override // com.facebook.ads.redexgen.X.C4M
    public final int A0B() {
        return (this.A02.A0h() - this.A02.A0e()) - this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.X.C4M
    public final int A0C(View view) {
        return this.A02.A0n(view) + ((C01134d) view.getLayoutParams()).rightMargin;
    }

    @Override // com.facebook.ads.redexgen.X.C4M
    public final int A0D(View view) {
        C01134d c01134d = (C01134d) view.getLayoutParams();
        return this.A02.A0m(view) + c01134d.leftMargin + c01134d.rightMargin;
    }

    @Override // com.facebook.ads.redexgen.X.C4M
    public final int A0E(View view) {
        C01134d c01134d = (C01134d) view.getLayoutParams();
        return this.A02.A0l(view) + c01134d.topMargin + c01134d.bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.X.C4M
    public final int A0F(View view) {
        return this.A02.A0k(view) - ((C01134d) view.getLayoutParams()).leftMargin;
    }

    @Override // com.facebook.ads.redexgen.X.C4M
    public final int A0G(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.right;
    }

    @Override // com.facebook.ads.redexgen.X.C4M
    public final int A0H(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.left;
    }

    @Override // com.facebook.ads.redexgen.X.C4M
    public final void A0J(int i) {
        this.A02.A0z(i);
    }
}
