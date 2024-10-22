package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzeng implements zzfzp {
    final /* synthetic */ zzemz zza;
    final /* synthetic */ zzfje zzb;
    final /* synthetic */ zzfit zzc;
    final /* synthetic */ zzdht zzd;
    final /* synthetic */ zzenh zze;

    public zzeng(zzenh zzenhVar, zzemz zzemzVar, zzfje zzfjeVar, zzfit zzfitVar, zzdht zzdhtVar) {
        this.zze = zzenhVar;
        this.zza = zzemzVar;
        this.zzb = zzfjeVar;
        this.zzc = zzfitVar;
        this.zzd = zzdhtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zza(Throwable th) {
        zzchw zzchwVar;
        zzfjh zzfjhVar;
        zzfje zzfjeVar;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zza().zza(th);
        this.zzd.zzb().zzbF(zza);
        zzchwVar = this.zze.zzb;
        zzchwVar.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzenf
            @Override // java.lang.Runnable
            public final void run() {
                zzemx zzemxVar;
                zzemxVar = zzeng.this.zze.zzd;
                zzemxVar.zza().zzbF(zza);
            }
        });
        zzfei.zzb(zza.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (((Boolean) zzbdu.zzc.zze()).booleanValue() && (zzfjeVar = this.zzb) != null) {
            zzfjeVar.zzc(zza);
            zzfit zzfitVar = this.zzc;
            zzfitVar.zzg(th);
            zzfitVar.zzf(false);
            zzfjeVar.zza(zzfitVar);
            zzfjeVar.zzg();
            return;
        }
        zzenh zzenhVar = this.zze;
        zzfit zzfitVar2 = this.zzc;
        zzfjhVar = zzenhVar.zze;
        zzfitVar2.zza(zza);
        zzfitVar2.zzg(th);
        zzfitVar2.zzf(false);
        zzfjhVar.zzb(zzfitVar2.zzl());
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzemx zzemxVar;
        zzchw zzchwVar;
        zzfjh zzfjhVar;
        zzfje zzfjeVar;
        zzcsx zzcsxVar = (zzcsx) obj;
        synchronized (this.zze) {
            zzdbq zzn = zzcsxVar.zzn();
            zzemxVar = this.zze.zzd;
            zzn.zza(zzemxVar.zzd());
            this.zza.zzb(zzcsxVar);
            zzchwVar = this.zze.zzb;
            zzchwVar.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzene
                @Override // java.lang.Runnable
                public final void run() {
                    zzemx zzemxVar2;
                    zzemxVar2 = zzeng.this.zze.zzd;
                    zzemxVar2.zzb().zzr();
                }
            });
            if (((Boolean) zzbdu.zzc.zze()).booleanValue() && (zzfjeVar = this.zzb) != null) {
                zzfjeVar.zzf(zzcsxVar.zzp().zzb);
                zzfjeVar.zze(zzcsxVar.zzl().zzg());
                zzfit zzfitVar = this.zzc;
                zzfitVar.zzf(true);
                zzfjeVar.zza(zzfitVar);
                zzfjeVar.zzg();
            } else {
                zzfjhVar = this.zze.zze;
                zzfit zzfitVar2 = this.zzc;
                zzfitVar2.zzb(zzcsxVar.zzp().zzb);
                zzfitVar2.zzd(zzcsxVar.zzl().zzg());
                zzfitVar2.zzf(true);
                zzfjhVar.zzb(zzfitVar2.zzl());
            }
        }
    }
}
