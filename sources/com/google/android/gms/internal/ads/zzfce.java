package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import defpackage.ml1;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzfce implements zzena {
    private final Context zza;
    private final Executor zzb;
    private final zzchw zzc;
    private final zzfbu zzd;
    private final zzfai zze;
    private final zzfdf zzf;
    private final zzfjh zzg;
    private final zzfdl zzh;
    private ml1 zzi;

    public zzfce(Context context, Executor executor, zzchw zzchwVar, zzfai zzfaiVar, zzfbu zzfbuVar, zzfdl zzfdlVar, zzfdf zzfdfVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzchwVar;
        this.zze = zzfaiVar;
        this.zzd = zzfbuVar;
        this.zzh = zzfdlVar;
        this.zzf = zzfdfVar;
        this.zzg = zzchwVar.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzdpb zzk(zzfag zzfagVar) {
        zzdpb zzi = this.zzc.zzi();
        zzcwt zzcwtVar = new zzcwt();
        zzcwtVar.zze(this.zza);
        zzcwtVar.zzi(((zzfcd) zzfagVar).zza);
        zzcwtVar.zzh(this.zzf);
        zzi.zzd(zzcwtVar.zzj());
        zzi.zzc(new zzdda().zzn());
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzena
    public final boolean zza() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzena
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzemy zzemyVar, zzemz zzemzVar) throws RemoteException {
        zzfje zzfjeVar;
        zzbwd zzbwdVar = new zzbwd(zzlVar, str);
        if (zzbwdVar.zzb == null) {
            zzcat.zzg("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbx
                @Override // java.lang.Runnable
                public final void run() {
                    zzfce.this.zzi();
                }
            });
            return false;
        }
        ml1 ml1Var = this.zzi;
        if (ml1Var != null && !ml1Var.isDone()) {
            return false;
        }
        if (((Boolean) zzbdu.zzc.zze()).booleanValue()) {
            zzfai zzfaiVar = this.zze;
            if (zzfaiVar.zzd() != null) {
                zzfje zzh = ((zzdpc) zzfaiVar.zzd()).zzh();
                zzh.zzh(5);
                zzh.zzb(zzbwdVar.zza.zzp);
                zzfjeVar = zzh;
                zzfei.zza(this.zza, zzbwdVar.zza.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziF)).booleanValue() && zzbwdVar.zza.zzf) {
                    this.zzc.zzk().zzn(true);
                }
                zzfdl zzfdlVar = this.zzh;
                zzfdlVar.zzs(zzbwdVar.zzb);
                zzfdlVar.zzr(com.google.android.gms.ads.internal.client.zzq.zzd());
                zzfdlVar.zzE(zzbwdVar.zza);
                Context context = this.zza;
                zzfdn zzG = zzfdlVar.zzG();
                zzfit zzb = zzfis.zzb(context, zzfjd.zzf(zzG), 5, zzbwdVar.zza);
                zzfcd zzfcdVar = new zzfcd(null);
                zzfcdVar.zza = zzG;
                ml1 zzc = this.zze.zzc(new zzfaj(zzfcdVar, null), new zzfah() { // from class: com.google.android.gms.internal.ads.zzfby
                    @Override // com.google.android.gms.internal.ads.zzfah
                    public final zzcwr zza(zzfag zzfagVar) {
                        zzdpb zzk;
                        zzk = zzfce.this.zzk(zzfagVar);
                        return zzk;
                    }
                }, null);
                this.zzi = zzc;
                zzfzt.zzr(zzc, new zzfcb(this, zzemzVar, zzfjeVar, zzb, zzfcdVar), this.zzb);
                return true;
            }
        }
        zzfjeVar = null;
        zzfei.zza(this.zza, zzbwdVar.zza.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziF)).booleanValue()) {
            this.zzc.zzk().zzn(true);
        }
        zzfdl zzfdlVar2 = this.zzh;
        zzfdlVar2.zzs(zzbwdVar.zzb);
        zzfdlVar2.zzr(com.google.android.gms.ads.internal.client.zzq.zzd());
        zzfdlVar2.zzE(zzbwdVar.zza);
        Context context2 = this.zza;
        zzfdn zzG2 = zzfdlVar2.zzG();
        zzfit zzb2 = zzfis.zzb(context2, zzfjd.zzf(zzG2), 5, zzbwdVar.zza);
        zzfcd zzfcdVar2 = new zzfcd(null);
        zzfcdVar2.zza = zzG2;
        ml1 zzc2 = this.zze.zzc(new zzfaj(zzfcdVar2, null), new zzfah() { // from class: com.google.android.gms.internal.ads.zzfby
            @Override // com.google.android.gms.internal.ads.zzfah
            public final zzcwr zza(zzfag zzfagVar) {
                zzdpb zzk;
                zzk = zzfce.this.zzk(zzfagVar);
                return zzk;
            }
        }, null);
        this.zzi = zzc2;
        zzfzt.zzr(zzc2, new zzfcb(this, zzemzVar, zzfjeVar, zzb2, zzfcdVar2), this.zzb);
        return true;
    }

    public final /* synthetic */ void zzi() {
        this.zzd.zzbF(zzfeo.zzd(6, null, null));
    }

    public final void zzj(int i) {
        this.zzh.zzo().zza(i);
    }
}
