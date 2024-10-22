package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdoe {
    private final zzcxj zza;
    private final zzcys zzb;
    private final zzczf zzc;
    private final zzczr zzd;
    private final zzdcf zze;
    private final zzfcr zzf;
    private final zzfcv zzg;

    public zzdoe(zzcxj zzcxjVar, zzcys zzcysVar, zzczf zzczfVar, zzczr zzczrVar, zzdcf zzdcfVar, zzfcr zzfcrVar, zzfcv zzfcvVar) {
        this.zza = zzcxjVar;
        this.zzb = zzcysVar;
        this.zzc = zzczfVar;
        this.zzd = zzczrVar;
        this.zze = zzdcfVar;
        this.zzf = zzfcrVar;
        this.zzg = zzfcvVar;
    }

    public final void zza(zzdoi zzdoiVar) {
        zzdnv zzdnvVar;
        final zzcys zzcysVar = this.zzb;
        zzdnvVar = zzdoiVar.zza;
        zzcysVar.getClass();
        zzdnvVar.zzh(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzz() { // from class: com.google.android.gms.internal.ads.zzdod
            @Override // com.google.android.gms.ads.internal.overlay.zzz
            public final void zzg() {
                zzcys.this.zzb();
            }
        });
        zzdoiVar.zze(this.zzf, this.zzg);
    }
}
