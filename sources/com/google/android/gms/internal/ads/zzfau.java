package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.ml1;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzfau implements zzena {
    private final Context zza;
    private final Executor zzb;
    private final zzchw zzc;
    private final zzemk zzd;
    private final zzfbu zze;
    private zzbdg zzf;
    private final zzfjh zzg;
    private final zzfdl zzh;
    private ml1 zzi;

    public zzfau(Context context, Executor executor, zzchw zzchwVar, zzemk zzemkVar, zzfbu zzfbuVar, zzfdl zzfdlVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzchwVar;
        this.zzd = zzemkVar;
        this.zzh = zzfdlVar;
        this.zze = zzfbuVar;
        this.zzg = zzchwVar.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzena
    public final boolean zza() {
        ml1 ml1Var = this.zzi;
        if (ml1Var != null && !ml1Var.isDone()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzena
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzemy zzemyVar, zzemz zzemzVar) {
        zzdgx zzh;
        zzfje zzfjeVar;
        if (str == null) {
            zzcat.zzg("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfao
                @Override // java.lang.Runnable
                public final void run() {
                    zzfau.this.zzh();
                }
            });
            return false;
        }
        if (zza()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziF)).booleanValue() && zzlVar.zzf) {
            this.zzc.zzk().zzn(true);
        }
        com.google.android.gms.ads.internal.client.zzq zzqVar = ((zzfan) zzemyVar).zza;
        zzfdl zzfdlVar = this.zzh;
        zzfdlVar.zzs(str);
        zzfdlVar.zzr(zzqVar);
        zzfdlVar.zzE(zzlVar);
        Context context = this.zza;
        zzfdn zzG = zzfdlVar.zzG();
        zzfit zzb = zzfis.zzb(context, zzfjd.zzf(zzG), 4, zzlVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhW)).booleanValue()) {
            zzdgw zzg = this.zzc.zzg();
            zzcwt zzcwtVar = new zzcwt();
            zzcwtVar.zze(this.zza);
            zzcwtVar.zzi(zzG);
            zzg.zze(zzcwtVar.zzj());
            zzdda zzddaVar = new zzdda();
            zzddaVar.zzj(this.zzd, this.zzb);
            zzddaVar.zzk(this.zzd, this.zzb);
            zzg.zzd(zzddaVar.zzn());
            zzg.zzc(new zzekt(this.zzf));
            zzh = zzg.zzh();
        } else {
            zzdda zzddaVar2 = new zzdda();
            zzfbu zzfbuVar = this.zze;
            if (zzfbuVar != null) {
                zzddaVar2.zze(zzfbuVar, this.zzb);
                zzddaVar2.zzf(this.zze, this.zzb);
                zzddaVar2.zzb(this.zze, this.zzb);
            }
            zzdgw zzg2 = this.zzc.zzg();
            zzcwt zzcwtVar2 = new zzcwt();
            zzcwtVar2.zze(this.zza);
            zzcwtVar2.zzi(zzG);
            zzg2.zze(zzcwtVar2.zzj());
            zzddaVar2.zzj(this.zzd, this.zzb);
            zzddaVar2.zze(this.zzd, this.zzb);
            zzddaVar2.zzf(this.zzd, this.zzb);
            zzddaVar2.zzb(this.zzd, this.zzb);
            zzddaVar2.zza(this.zzd, this.zzb);
            zzddaVar2.zzl(this.zzd, this.zzb);
            zzddaVar2.zzk(this.zzd, this.zzb);
            zzddaVar2.zzi(this.zzd, this.zzb);
            zzddaVar2.zzc(this.zzd, this.zzb);
            zzg2.zzd(zzddaVar2.zzn());
            zzg2.zzc(new zzekt(this.zzf));
            zzh = zzg2.zzh();
        }
        zzdgx zzdgxVar = zzh;
        if (((Boolean) zzbdu.zzc.zze()).booleanValue()) {
            zzfje zzf = zzdgxVar.zzf();
            zzf.zzh(4);
            zzf.zzb(zzlVar.zzp);
            zzfjeVar = zzf;
        } else {
            zzfjeVar = null;
        }
        zzcue zza = zzdgxVar.zza();
        ml1 zzi = zza.zzi(zza.zzj());
        this.zzi = zzi;
        zzfzt.zzr(zzi, new zzfat(this, zzemzVar, zzfjeVar, zzb, zzdgxVar), this.zzb);
        return true;
    }

    public final /* synthetic */ void zzh() {
        this.zzd.zzbF(zzfeo.zzd(6, null, null));
    }

    public final void zzi(zzbdg zzbdgVar) {
        this.zzf = zzbdgVar;
    }
}
