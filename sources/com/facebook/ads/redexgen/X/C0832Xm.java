package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.bridge.gms.AdvertisingId;

/* renamed from: com.facebook.ads.redexgen.X.Xm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0832Xm implements C7W {
    public final /* synthetic */ AdvertisingId A00;
    public final /* synthetic */ C0831Xl A01;

    public C0832Xm(C0831Xl c0831Xl, AdvertisingId advertisingId) {
        this.A01 = c0831Xl;
        this.A00 = advertisingId;
    }

    @Override // com.facebook.ads.redexgen.X.C7W
    public final boolean A8w() {
        return this.A00.isLimitAdTracking();
    }

    @Override // com.facebook.ads.redexgen.X.C7W
    public final String getId() {
        return this.A00.getId();
    }
}
