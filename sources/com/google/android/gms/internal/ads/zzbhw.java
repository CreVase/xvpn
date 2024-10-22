package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* loaded from: classes.dex */
public final class zzbhw extends zzbhb {
    private final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener zza;

    public zzbhw(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.zza = onUnifiedNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zze(zzbhl zzbhlVar) {
        this.zza.onUnifiedNativeAdLoaded(new zzbhm(zzbhlVar));
    }
}
