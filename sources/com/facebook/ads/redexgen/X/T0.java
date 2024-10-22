package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class T0 implements NK {
    public final WeakReference<C9G> A00;

    public T0(C9G c9g) {
        this.A00 = new WeakReference<>(c9g);
    }

    @Override // com.facebook.ads.redexgen.X.NK
    public final void ABX(boolean z) {
        C9G cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A04 = z;
            cardLayout.A04();
        }
    }
}
