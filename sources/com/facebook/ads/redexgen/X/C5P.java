package com.facebook.ads.redexgen.X;

import android.content.Context;
import com.facebook.ads.internal.api.BidderTokenProviderApi;

/* renamed from: com.facebook.ads.redexgen.X.5P, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5P implements BidderTokenProviderApi {
    public final C6H A00 = new C6H();

    public final C6H A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.BidderTokenProviderApi
    public final String getBidderToken(Context context) {
        return this.A00.A06(C5Q.A07(context));
    }
}
