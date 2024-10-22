package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzenh implements zzena {
    private final zzfdl zza;
    private final zzchw zzb;
    private final Context zzc;
    private final zzemx zzd;
    private final zzfjh zze;
    private zzctl zzf;

    public zzenh(zzchw zzchwVar, Context context, zzemx zzemxVar, zzfdl zzfdlVar) {
        this.zzb = zzchwVar;
        this.zzc = context;
        this.zzd = zzemxVar;
        this.zza = zzfdlVar;
        this.zze = zzchwVar.zzz();
        zzfdlVar.zzu(zzemxVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzena
    public final boolean zza() {
        zzctl zzctlVar = this.zzf;
        if (zzctlVar != null && zzctlVar.zzf()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzena
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzemy zzemyVar, zzemz zzemzVar) throws RemoteException {
        zzfje zzfjeVar;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzG(this.zzc) && zzlVar.zzs == null) {
            zzcat.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzenc
                @Override // java.lang.Runnable
                public final void run() {
                    zzenh.this.zzf();
                }
            });
            return false;
        }
        if (str == null) {
            zzcat.zzg("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzend
                @Override // java.lang.Runnable
                public final void run() {
                    zzenh.this.zzg();
                }
            });
            return false;
        }
        zzfei.zza(this.zzc, zzlVar.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziF)).booleanValue() && zzlVar.zzf) {
            this.zzb.zzk().zzn(true);
        }
        int i = ((zzenb) zzemyVar).zza;
        zzfdl zzfdlVar = this.zza;
        zzfdlVar.zzE(zzlVar);
        zzfdlVar.zzz(i);
        Context context = this.zzc;
        zzfdn zzG = zzfdlVar.zzG();
        zzfit zzb = zzfis.zzb(context, zzfjd.zzf(zzG), 8, zzlVar);
        com.google.android.gms.ads.internal.client.zzcb zzcbVar = zzG.zzn;
        if (zzcbVar != null) {
            this.zzd.zzd().zzm(zzcbVar);
        }
        zzdhs zzh = this.zzb.zzh();
        zzcwt zzcwtVar = new zzcwt();
        zzcwtVar.zze(this.zzc);
        zzcwtVar.zzi(zzG);
        zzh.zzf(zzcwtVar.zzj());
        zzdda zzddaVar = new zzdda();
        zzddaVar.zzk(this.zzd.zzd(), this.zzb.zzB());
        zzh.zze(zzddaVar.zzn());
        zzh.zzd(this.zzd.zzc());
        zzh.zzc(new zzcqs(null));
        zzdht zzg = zzh.zzg();
        if (((Boolean) zzbdu.zzc.zze()).booleanValue()) {
            zzfje zzf = zzg.zzf();
            zzf.zzh(8);
            zzf.zzb(zzlVar.zzp);
            zzfjeVar = zzf;
        } else {
            zzfjeVar = null;
        }
        this.zzb.zzx().zzc(1);
        zzgad zzgadVar = zzcbg.zza;
        zzhbk.zzb(zzgadVar);
        ScheduledExecutorService zzC = this.zzb.zzC();
        zzcue zza = zzg.zza();
        zzctl zzctlVar = new zzctl(zzgadVar, zzC, zza.zzi(zza.zzj()));
        this.zzf = zzctlVar;
        zzctlVar.zze(new zzeng(this, zzemzVar, zzfjeVar, zzb, zzg));
        return true;
    }

    public final /* synthetic */ void zzf() {
        this.zzd.zza().zzbF(zzfeo.zzd(4, null, null));
    }

    public final /* synthetic */ void zzg() {
        this.zzd.zza().zzbF(zzfeo.zzd(6, null, null));
    }
}
