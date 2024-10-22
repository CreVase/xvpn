package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdon {
    private final zzcxj zza;
    private final zzcys zzb;
    private final zzczf zzc;
    private final zzczr zzd;
    private final zzdcf zze;
    private final zzdfb zzf;

    public zzdon(zzcxj zzcxjVar, zzcys zzcysVar, zzczf zzczfVar, zzczr zzczrVar, zzdcf zzdcfVar, zzdfb zzdfbVar) {
        this.zza = zzcxjVar;
        this.zzb = zzcysVar;
        this.zzc = zzczfVar;
        this.zzd = zzczrVar;
        this.zze = zzdcfVar;
        this.zzf = zzdfbVar;
    }

    public final void zza(zzdoo zzdooVar) {
        zzdol zzdolVar;
        final zzcys zzcysVar = this.zzb;
        zzdolVar = zzdooVar.zza;
        zzcysVar.getClass();
        zzdolVar.zzi(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzz() { // from class: com.google.android.gms.internal.ads.zzdom
            @Override // com.google.android.gms.ads.internal.overlay.zzz
            public final void zzg() {
                zzcys.this.zzb();
            }
        }, this.zzf);
    }
}
