package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;

/* loaded from: classes.dex */
final class zzbhu implements Runnable {
    final /* synthetic */ AdManagerAdView zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzbu zzb;
    final /* synthetic */ zzbhv zzc;

    public zzbhu(zzbhv zzbhvVar, AdManagerAdView adManagerAdView, com.google.android.gms.ads.internal.client.zzbu zzbuVar) {
        this.zzc = zzbhvVar;
        this.zza = adManagerAdView;
        this.zzb = zzbuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener;
        if (this.zza.zzb(this.zzb)) {
            zzbhv zzbhvVar = this.zzc;
            AdManagerAdView adManagerAdView = this.zza;
            onAdManagerAdViewLoadedListener = zzbhvVar.zza;
            onAdManagerAdViewLoadedListener.onAdManagerAdViewLoaded(adManagerAdView);
            return;
        }
        zzcat.zzj("Could not bind.");
    }
}
