package com.vungle.ads;

import android.content.Context;
import defpackage.ng0;

/* loaded from: classes2.dex */
public final class InterstitialAd extends BaseFullscreenAd {
    public /* synthetic */ InterstitialAd(Context context, String str, AdConfig adConfig, int i, ng0 ng0Var) {
        this(context, str, (i & 4) != 0 ? new AdConfig() : adConfig);
    }

    public InterstitialAd(Context context, String str, AdConfig adConfig) {
        super(context, str, adConfig);
    }

    @Override // com.vungle.ads.BaseAd
    public InterstitialAdInternal constructAdInternal$vungle_ads_release(Context context) {
        return new InterstitialAdInternal(context);
    }
}
