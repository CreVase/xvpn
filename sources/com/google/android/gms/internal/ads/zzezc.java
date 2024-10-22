package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzezc implements zzfzp {
    final /* synthetic */ zzemz zza;
    final /* synthetic */ zzfje zzb;
    final /* synthetic */ zzfit zzc;
    final /* synthetic */ zzcrs zzd;
    final /* synthetic */ zzezd zze;

    public zzezc(zzezd zzezdVar, zzemz zzemzVar, zzfje zzfjeVar, zzfit zzfitVar, zzcrs zzcrsVar) {
        this.zze = zzezdVar;
        this.zza = zzemzVar;
        this.zzb = zzfjeVar;
        this.zzc = zzfitVar;
        this.zzd = zzcrsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zza(Throwable th) {
        zzdaa zzdaaVar;
        zzdch zzdchVar;
        zzfjh zzfjhVar;
        zzfje zzfjeVar;
        Executor executor;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zzd().zza(th);
        synchronized (this.zze) {
            this.zze.zzl = null;
            this.zzd.zzf().zzbF(zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhU)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeza
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzemk zzemkVar;
                        zzemkVar = zzezc.this.zze.zzd;
                        zzemkVar.zzbF(zza);
                    }
                });
            }
            zzezd zzezdVar = this.zze;
            zzdaaVar = zzezdVar.zzh;
            zzdchVar = zzezdVar.zzj;
            zzdaaVar.zzd(zzdchVar.zzc());
            zzfei.zzb(zza.zza, th, "BannerAdLoader.onFailure");
            this.zza.zza();
            if (((Boolean) zzbdu.zzc.zze()).booleanValue() && (zzfjeVar = this.zzb) != null) {
                zzfjeVar.zzc(zza);
                zzfit zzfitVar = this.zzc;
                zzfitVar.zzg(th);
                zzfitVar.zzf(false);
                zzfjeVar.zza(zzfitVar);
                zzfjeVar.zzg();
            } else {
                zzfjhVar = this.zze.zzi;
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
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        zzdaa zzdaaVar;
        zzfjh zzfjhVar;
        zzfje zzfjeVar;
        Executor executor;
        final zzemk zzemkVar;
        zzemk zzemkVar2;
        zzemo zzemoVar;
        zzcqv zzcqvVar = (zzcqv) obj;
        synchronized (this.zze) {
            this.zze.zzl = null;
            viewGroup = this.zze.zzf;
            viewGroup.removeAllViews();
            if (zzcqvVar.zzc() != null) {
                ViewParent parent = zzcqvVar.zzc().getParent();
                if (parent instanceof ViewGroup) {
                    String str = "";
                    if (zzcqvVar.zzl() != null) {
                        str = zzcqvVar.zzl().zzg();
                    }
                    zzcat.zzj("Banner view provided from " + str + " already has a parent view. Removing its old parent.");
                    ((ViewGroup) parent).removeView(zzcqvVar.zzc());
                }
            }
            zzbca zzbcaVar = zzbci.zzhU;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbcaVar)).booleanValue()) {
                zzdbq zzn = zzcqvVar.zzn();
                zzemkVar2 = this.zze.zzd;
                zzn.zza(zzemkVar2);
                zzemoVar = this.zze.zze;
                zzn.zzc(zzemoVar);
            }
            viewGroup2 = this.zze.zzf;
            viewGroup2.addView(zzcqvVar.zzc());
            this.zza.zzb(zzcqvVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbcaVar)).booleanValue()) {
                zzezd zzezdVar = this.zze;
                executor = zzezdVar.zzb;
                zzemkVar = zzezdVar.zzd;
                zzemkVar.getClass();
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezb
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzemk.this.zzr();
                    }
                });
            }
            zzdaaVar = this.zze.zzh;
            zzdaaVar.zzd(zzcqvVar.zza());
            if (((Boolean) zzbdu.zzc.zze()).booleanValue() && (zzfjeVar = this.zzb) != null) {
                zzfjeVar.zzf(zzcqvVar.zzp().zzb);
                zzfjeVar.zze(zzcqvVar.zzl().zzg());
                zzfit zzfitVar = this.zzc;
                zzfitVar.zzf(true);
                zzfjeVar.zza(zzfitVar);
                zzfjeVar.zzg();
            } else {
                zzfjhVar = this.zze.zzi;
                zzfit zzfitVar2 = this.zzc;
                zzfitVar2.zzb(zzcqvVar.zzp().zzb);
                zzfitVar2.zzd(zzcqvVar.zzl().zzg());
                zzfitVar2.zzf(true);
                zzfjhVar.zzb(zzfitVar2.zzl());
            }
        }
    }
}
