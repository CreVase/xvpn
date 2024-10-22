package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Sj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0703Sj implements NK {
    public final WeakReference<AnonymousClass97> A00;

    public C0703Sj(AnonymousClass97 anonymousClass97) {
        this.A00 = new WeakReference<>(anonymousClass97);
    }

    @Override // com.facebook.ads.redexgen.X.NK
    public final void ABX(boolean z) {
        AnonymousClass97 cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A06 = z;
            cardLayout.A03();
        }
    }
}
