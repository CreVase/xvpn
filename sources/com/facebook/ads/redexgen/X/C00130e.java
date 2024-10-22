package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.0e, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C00130e extends C2O implements J2 {
    public C02369j A00;
    public List<PC> A01;

    public C00130e(YA ya) {
        super(ya);
        this.A00 = new C02369j(this, 1, null, null, null);
    }

    public final void A23(C0643Qb c0643Qb) {
        C02369j c02369j = this.A00;
        if (c02369j != null) {
            c02369j.A0d(c0643Qb);
        }
    }

    public C02369j getCarouselCardBehaviorHelper() {
        return this.A00;
    }

    public void setCardsInfo(ArrayList arrayList) {
        this.A01 = arrayList;
        this.A00.A0e(arrayList);
    }
}
