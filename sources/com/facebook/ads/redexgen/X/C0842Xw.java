package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* renamed from: com.facebook.ads.redexgen.X.Xw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0842Xw extends K8 {
    public final /* synthetic */ Y9 A00;

    public C0842Xw(Y9 y9) {
        this.A00 = y9;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
        if (dynamicLoader != null) {
            dynamicLoader.createBidderTokenProviderApi().getBidderToken(this.A00);
        }
    }
}
