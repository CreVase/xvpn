package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdvz extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ AdView zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzdwg zzd;

    public zzdvz(zzdwg zzdwgVar, String str, AdView adView, String str2) {
        this.zzd = zzdwgVar;
        this.zza = str;
        this.zzb = adView;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzl;
        zzdwg zzdwgVar = this.zzd;
        zzl = zzdwg.zzl(loadAdError);
        zzdwgVar.zzm(zzl, this.zzc);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.zzd.zzg(this.zza, this.zzb, this.zzc);
    }
}
