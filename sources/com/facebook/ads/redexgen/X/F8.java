package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class F8 extends AbstractC0925aT {
    public final YA A00;

    public F8(C00310x c00310x, List<UJ> list, YA ya) {
        super(c00310x, list, ya);
        this.A00 = ya;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4Q
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C0728Tj A0C(ViewGroup viewGroup, int i) {
        return new C0728Tj(new M0(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0925aT, com.facebook.ads.redexgen.X.C4Q
    /* renamed from: A0H */
    public final void A0E(C0728Tj c0728Tj, int i) {
        super.A0E(c0728Tj, i);
        M0 m0 = (M0) c0728Tj.A0l();
        MC imageView = (MC) m0.getImageCardView();
        imageView.setImageDrawable(null);
        A0F(imageView, i);
        UJ childAd = ((AbstractC0925aT) this).A01.get(i);
        childAd.A11().A0G(this.A00);
        childAd.A1N(m0, m0);
    }
}
