package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class TC extends K8 {
    public final WeakReference<C0643Qb> A00;

    public TC(C0643Qb c0643Qb) {
        this.A00 = new WeakReference<>(c0643Qb);
    }

    public TC(WeakReference<C0643Qb> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        C0643Qb viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
