package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdwd extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdwg zzb;

    public zzdwd(zzdwg zzdwgVar, String str) {
        this.zzb = zzdwgVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzl;
        zzdwg zzdwgVar = this.zzb;
        zzl = zzdwg.zzl(loadAdError);
        zzdwgVar.zzm(zzl, this.zza);
    }
}
