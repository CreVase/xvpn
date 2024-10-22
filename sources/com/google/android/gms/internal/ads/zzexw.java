package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzexw implements zzfzp {
    final /* synthetic */ zzemz zza;
    final /* synthetic */ zzfje zzb;
    final /* synthetic */ zzfit zzc;
    final /* synthetic */ zzexy zzd;
    final /* synthetic */ zzexz zze;

    public zzexw(zzexz zzexzVar, zzemz zzemzVar, zzfje zzfjeVar, zzfit zzfitVar, zzexy zzexyVar) {
        this.zze = zzexzVar;
        this.zza = zzemzVar;
        this.zzb = zzfjeVar;
        this.zzc = zzfitVar;
        this.zzd = zzexyVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.android.gms.internal.ads.zzcws, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zza(Throwable th) {
        zzfai zzfaiVar;
        final com.google.android.gms.ads.internal.client.zze zza;
        zzeyp zzeypVar;
        zzcwr zzm;
        zzfjh zzfjhVar;
        zzfje zzfjeVar;
        Executor executor;
        zzfaiVar = this.zze.zze;
        zzcqf zzcqfVar = (zzcqf) zzfaiVar.zzd();
        if (zzcqfVar == null) {
            zza = zzfeo.zzb(th, null);
        } else {
            zza = zzcqfVar.zzb().zza(th);
        }
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (zzcqfVar != null) {
                zzcqfVar.zzc().zzbF(zza);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhV)).booleanValue()) {
                    executor = this.zze.zzc;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexv
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzeyp zzeypVar2;
                            zzeypVar2 = zzexw.this.zze.zzd;
                            zzeypVar2.zzbF(zza);
                        }
                    });
                }
            } else {
                zzeypVar = this.zze.zzd;
                zzeypVar.zzbF(zza);
                zzm = this.zze.zzm(this.zzd);
                zzm.zzh().zzb().zzc().zzh();
            }
            zzfei.zzb(zza.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (((Boolean) zzbdu.zzc.zze()).booleanValue() && (zzfjeVar = this.zzb) != null) {
                zzfjeVar.zzc(zza);
                zzfit zzfitVar = this.zzc;
                zzfitVar.zzg(th);
                zzfitVar.zzf(false);
                zzfjeVar.zza(zzfitVar);
                zzfjeVar.zzg();
            } else {
                zzfjhVar = this.zze.zzh;
                zzfit zzfitVar2 = this.zzc;
                zzfitVar2.zza(zza);
                zzfitVar2.zzg(th);
                zzfitVar2.zzf(false);
                zzfjhVar.zzb(zzfitVar2.zzl());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfjh zzfjhVar;
        zzfje zzfjeVar;
        zzeyp zzeypVar;
        zzcsx zzcsxVar = (zzcsx) obj;
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhV)).booleanValue()) {
                zzdbq zzn = zzcsxVar.zzn();
                zzeypVar = this.zze.zzd;
                zzn.zzb(zzeypVar);
            }
            this.zza.zzb(zzcsxVar);
            if (((Boolean) zzbdu.zzc.zze()).booleanValue() && (zzfjeVar = this.zzb) != null) {
                zzfjeVar.zzf(zzcsxVar.zzp().zzb);
                zzfjeVar.zze(zzcsxVar.zzl().zzg());
                zzfit zzfitVar = this.zzc;
                zzfitVar.zzf(true);
                zzfjeVar.zza(zzfitVar);
                zzfjeVar.zzg();
            } else {
                zzfjhVar = this.zze.zzh;
                zzfit zzfitVar2 = this.zzc;
                zzfitVar2.zzb(zzcsxVar.zzp().zzb);
                zzfitVar2.zzd(zzcsxVar.zzl().zzg());
                zzfitVar2.zzf(true);
                zzfjhVar.zzb(zzfitVar2.zzl());
            }
        }
    }
}
