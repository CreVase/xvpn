package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class Z4 implements InterfaceC01324x {
    public final /* synthetic */ AbstractC01124c A00;

    public Z4(AbstractC01124c abstractC01124c) {
        this.A00 = abstractC01124c;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01324x
    public final View A6H(int i) {
        return this.A00.A0t(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01324x
    public final int A6J(View view) {
        return this.A00.A0n(view) + ((C01134d) view.getLayoutParams()).rightMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01324x
    public final int A6K(View view) {
        return this.A00.A0k(view) - ((C01134d) view.getLayoutParams()).leftMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01324x
    public final int A7S() {
        return this.A00.A0h() - this.A00.A0f();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01324x
    public final int A7T() {
        return this.A00.A0e();
    }
}
