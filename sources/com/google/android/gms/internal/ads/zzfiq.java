package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzfiq implements zzdem, zzcyb, zzdeq {
    private final zzfje zza;
    private final zzfit zzb;

    public zzfiq(Context context, zzfje zzfjeVar) {
        this.zza = zzfjeVar;
        this.zzb = zzfis.zza(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzdeq
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdeq
    public final void zzb() {
        if (((Boolean) zzbdu.zzd.zze()).booleanValue()) {
            zzfje zzfjeVar = this.zza;
            zzfit zzfitVar = this.zzb;
            zzfitVar.zzf(true);
            zzfjeVar.zza(zzfitVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final void zzk() {
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final void zzl() {
        if (((Boolean) zzbdu.zzd.zze()).booleanValue()) {
            this.zzb.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyb
    public final void zzp(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbdu.zzd.zze()).booleanValue()) {
            zzfje zzfjeVar = this.zza;
            zzfit zzfitVar = this.zzb;
            zzfitVar.zzc(zzeVar.zza().toString());
            zzfitVar.zzf(false);
            zzfjeVar.zza(zzfitVar);
        }
    }
}
