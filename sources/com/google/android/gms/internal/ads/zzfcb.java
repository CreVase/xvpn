package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfcb implements zzfzp {
    final /* synthetic */ zzemz zza;
    final /* synthetic */ zzfje zzb;
    final /* synthetic */ zzfit zzc;
    final /* synthetic */ zzfcd zzd;
    final /* synthetic */ zzfce zze;

    public zzfcb(zzfce zzfceVar, zzemz zzemzVar, zzfje zzfjeVar, zzfit zzfitVar, zzfcd zzfcdVar) {
        this.zze = zzfceVar;
        this.zza = zzemzVar;
        this.zzb = zzfjeVar;
        this.zzc = zzfitVar;
        this.zzd = zzfcdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zza(Throwable th) {
        zzfai zzfaiVar;
        final com.google.android.gms.ads.internal.client.zze zza;
        zzfbu zzfbuVar;
        zzdpb zzk;
        zzfjh zzfjhVar;
        zzfje zzfjeVar;
        Executor executor;
        zzfaiVar = this.zze.zze;
        zzdpc zzdpcVar = (zzdpc) zzfaiVar.zzd();
        if (zzdpcVar == null) {
            zza = zzfeo.zzb(th, null);
        } else {
            zza = zzdpcVar.zzb().zza(th);
        }
        synchronized (this.zze) {
            if (zzdpcVar != null) {
                zzdpcVar.zza().zzbF(zza);
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbz
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfbu zzfbuVar2;
                        zzfbuVar2 = zzfcb.this.zze.zzd;
                        zzfbuVar2.zzbF(zza);
                    }
                });
            } else {
                zzfbuVar = this.zze.zzd;
                zzfbuVar.zzbF(zza);
                zzk = this.zze.zzk(this.zzd);
                zzk.zzh().zzb().zzc().zzh();
            }
            zzfei.zzb(zza.zza, th, "RewardedAdLoader.onFailure");
            this.zza.zza();
            if (((Boolean) zzbdu.zzc.zze()).booleanValue() && (zzfjeVar = this.zzb) != null) {
                zzfjeVar.zzc(zza);
                zzfit zzfitVar = this.zzc;
                zzfitVar.zzg(th);
                zzfitVar.zzf(false);
                zzfjeVar.zza(zzfitVar);
                zzfjeVar.zzg();
            } else {
                zzfjhVar = this.zze.zzg;
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
        zzfbu zzfbuVar;
        Executor executor;
        final zzfbu zzfbuVar2;
        zzfbu zzfbuVar3;
        zzfjh zzfjhVar;
        zzfje zzfjeVar;
        zzdox zzdoxVar = (zzdox) obj;
        synchronized (this.zze) {
            zzdbq zzn = zzdoxVar.zzn();
            zzfbuVar = this.zze.zzd;
            zzn.zzd(zzfbuVar);
            this.zza.zzb(zzdoxVar);
            zzfce zzfceVar = this.zze;
            executor = zzfceVar.zzb;
            zzfbuVar2 = zzfceVar.zzd;
            zzfbuVar2.getClass();
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfca
                @Override // java.lang.Runnable
                public final void run() {
                    zzfbu.this.zzr();
                }
            });
            zzfbuVar3 = this.zze.zzd;
            zzfbuVar3.onAdMetadataChanged();
            if (((Boolean) zzbdu.zzc.zze()).booleanValue() && (zzfjeVar = this.zzb) != null) {
                zzfjeVar.zzf(zzdoxVar.zzp().zzb);
                zzfjeVar.zze(zzdoxVar.zzl().zzg());
                zzfit zzfitVar = this.zzc;
                zzfitVar.zzf(true);
                zzfjeVar.zza(zzfitVar);
                zzfjeVar.zzg();
            } else {
                zzfjhVar = this.zze.zzg;
                zzfit zzfitVar2 = this.zzc;
                zzfitVar2.zzb(zzdoxVar.zzp().zzb);
                zzfitVar2.zzd(zzdoxVar.zzl().zzg());
                zzfitVar2.zzf(true);
                zzfjhVar.zzb(zzfitVar2.zzl());
            }
        }
    }
}
