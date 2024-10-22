package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfat implements zzfzp {
    final /* synthetic */ zzemz zza;
    final /* synthetic */ zzfje zzb;
    final /* synthetic */ zzfit zzc;
    final /* synthetic */ zzdgx zzd;
    final /* synthetic */ zzfau zze;

    public zzfat(zzfau zzfauVar, zzemz zzemzVar, zzfje zzfjeVar, zzfit zzfitVar, zzdgx zzdgxVar) {
        this.zze = zzfauVar;
        this.zza = zzemzVar;
        this.zzb = zzfjeVar;
        this.zzc = zzfitVar;
        this.zzd = zzdgxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zza(Throwable th) {
        zzfjh zzfjhVar;
        zzfje zzfjeVar;
        Executor executor;
        Executor executor2;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zza().zza(th);
        synchronized (this.zze) {
            this.zze.zzi = null;
            this.zzd.zzb().zzbF(zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhW)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfap
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzemk zzemkVar;
                        zzemkVar = zzfat.this.zze.zzd;
                        zzemkVar.zzbF(zza);
                    }
                });
                executor2 = this.zze.zzb;
                executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfaq
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfbu zzfbuVar;
                        zzfbuVar = zzfat.this.zze.zze;
                        zzfbuVar.zzbF(zza);
                    }
                });
            }
            zzfei.zzb(zza.zza, th, "InterstitialAdLoader.onFailure");
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
        zzfjh zzfjhVar;
        zzfje zzfjeVar;
        Executor executor;
        Executor executor2;
        zzemk zzemkVar;
        zzfbu zzfbuVar;
        zzdfw zzdfwVar = (zzdfw) obj;
        synchronized (this.zze) {
            this.zze.zzi = null;
            zzbca zzbcaVar = zzbci.zzhW;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbcaVar)).booleanValue()) {
                zzdbq zzn = zzdfwVar.zzn();
                zzemkVar = this.zze.zzd;
                zzn.zza(zzemkVar);
                zzfbuVar = this.zze.zze;
                zzn.zzd(zzfbuVar);
            }
            this.zza.zzb(zzdfwVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbcaVar)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfar
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzemk zzemkVar2;
                        zzemkVar2 = zzfat.this.zze.zzd;
                        zzemkVar2.zzr();
                    }
                });
                executor2 = this.zze.zzb;
                executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfas
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfbu zzfbuVar2;
                        zzfbuVar2 = zzfat.this.zze.zze;
                        zzfbuVar2.zzr();
                    }
                });
            }
            if (((Boolean) zzbdu.zzc.zze()).booleanValue() && (zzfjeVar = this.zzb) != null) {
                zzfjeVar.zzf(zzdfwVar.zzp().zzb);
                zzfjeVar.zze(zzdfwVar.zzl().zzg());
                zzfit zzfitVar = this.zzc;
                zzfitVar.zzf(true);
                zzfjeVar.zza(zzfitVar);
                zzfjeVar.zzg();
            } else {
                zzfjhVar = this.zze.zzg;
                zzfit zzfitVar2 = this.zzc;
                zzfitVar2.zzb(zzdfwVar.zzp().zzb);
                zzfitVar2.zzd(zzdfwVar.zzl().zzg());
                zzfitVar2.zzf(true);
                zzfjhVar.zzb(zzfitVar2.zzl());
            }
        }
    }
}
