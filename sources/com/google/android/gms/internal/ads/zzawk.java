package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;

/* loaded from: classes.dex */
public final class zzawk extends zzawr {
    private final AppOpenAd.AppOpenAdLoadCallback zza;
    private final String zzb;

    public zzawk(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.zza = appOpenAdLoadCallback;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzaws
    public final void zzb(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzaws
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaws
    public final void zzd(zzawp zzawpVar) {
        if (this.zza != null) {
            this.zza.onAdLoaded(new zzawl(zzawpVar, this.zzb));
        }
    }
}
