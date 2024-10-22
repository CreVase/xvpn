package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* loaded from: classes.dex */
final class zzbrl implements com.google.android.gms.ads.internal.overlay.zzo {
    final /* synthetic */ zzbrn zza;

    public zzbrl(zzbrn zzbrnVar) {
        this.zza = zzbrnVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
        zzcat.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
        zzcat.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
        zzcat.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        MediationInterstitialListener mediationInterstitialListener;
        zzcat.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbrn zzbrnVar = this.zza;
        mediationInterstitialListener = zzbrnVar.zzb;
        mediationInterstitialListener.onAdOpened(zzbrnVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(int i) {
        MediationInterstitialListener mediationInterstitialListener;
        zzcat.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbrn zzbrnVar = this.zza;
        mediationInterstitialListener = zzbrnVar.zzb;
        mediationInterstitialListener.onAdClosed(zzbrnVar);
    }
}
