package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdou implements zzbjz {
    private final zzcys zza;
    private final zzbwi zzb;
    private final String zzc;
    private final String zzd;

    public zzdou(zzcys zzcysVar, zzfcr zzfcrVar) {
        this.zza = zzcysVar;
        this.zzb = zzfcrVar.zzn;
        this.zzc = zzfcrVar.zzl;
        this.zzd = zzfcrVar.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzbjz
    public final void zza(zzbwi zzbwiVar) {
        int i;
        String str;
        zzbwi zzbwiVar2 = this.zzb;
        if (zzbwiVar2 != null) {
            zzbwiVar = zzbwiVar2;
        }
        if (zzbwiVar != null) {
            str = zzbwiVar.zza;
            i = zzbwiVar.zzb;
        } else {
            i = 1;
            str = "";
        }
        this.zza.zzd(new zzbvt(str, i), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbjz
    public final void zzb() {
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbjz
    public final void zzc() {
        this.zza.zzf();
    }
}
