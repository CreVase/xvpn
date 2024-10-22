package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.ads.zzcat;

/* loaded from: classes.dex */
final class zzb implements CustomEventInterstitialListener {
    final /* synthetic */ CustomEventAdapter zza;
    private final CustomEventAdapter zzb;
    private final MediationInterstitialListener zzc;

    public zzb(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, MediationInterstitialListener mediationInterstitialListener) {
        this.zza = customEventAdapter;
        this.zzb = customEventAdapter2;
        this.zzc = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClicked() {
        zzcat.zze("Custom event adapter called onAdClicked.");
        this.zzc.onAdClicked(this.zzb);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClosed() {
        zzcat.zze("Custom event adapter called onAdClosed.");
        this.zzc.onAdClosed(this.zzb);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(int i) {
        zzcat.zze("Custom event adapter called onFailedToReceiveAd.");
        this.zzc.onAdFailedToLoad(this.zzb, i);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdLeftApplication() {
        zzcat.zze("Custom event adapter called onAdLeftApplication.");
        this.zzc.onAdLeftApplication(this.zzb);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener
    public final void onAdLoaded() {
        zzcat.zze("Custom event adapter called onReceivedAd.");
        this.zzc.onAdLoaded(this.zza);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdOpened() {
        zzcat.zze("Custom event adapter called onAdOpened.");
        this.zzc.onAdOpened(this.zzb);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(AdError adError) {
        zzcat.zze("Custom event adapter called onFailedToReceiveAd.");
        this.zzc.onAdFailedToLoad(this.zzb, adError);
    }
}
