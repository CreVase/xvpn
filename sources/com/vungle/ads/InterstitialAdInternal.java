package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.model.Placement;

/* loaded from: classes2.dex */
public final class InterstitialAdInternal extends FullscreenAdInternal {
    public InterstitialAdInternal(Context context) {
        super(context);
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdTypeForPlacement(Placement placement) {
        return placement.isInterstitial();
    }
}
