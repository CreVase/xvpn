package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;

/* loaded from: classes.dex */
public class zzekh extends zzbpc {
    private final zzcxj zza;
    private final zzdfb zzb;
    private final zzcyd zzc;
    private final zzcys zzd;
    private final zzcyx zze;
    private final zzdcf zzf;
    private final zzczr zzg;
    private final zzdft zzh;
    private final zzdcb zzi;
    private final zzcxy zzj;

    public zzekh(zzcxj zzcxjVar, zzdfb zzdfbVar, zzcyd zzcydVar, zzcys zzcysVar, zzcyx zzcyxVar, zzdcf zzdcfVar, zzczr zzczrVar, zzdft zzdftVar, zzdcb zzdcbVar, zzcxy zzcxyVar) {
        this.zza = zzcxjVar;
        this.zzb = zzdfbVar;
        this.zzc = zzcydVar;
        this.zzd = zzcysVar;
        this.zze = zzcyxVar;
        this.zzf = zzdcfVar;
        this.zzg = zzczrVar;
        this.zzh = zzdftVar;
        this.zzi = zzdcbVar;
        this.zzj = zzcxyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzbK();
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzf() {
        this.zzg.zzby(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzg(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzi(int i, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    @Deprecated
    public final void zzj(int i) throws RemoteException {
        zzk(new com.google.android.gms.ads.internal.client.zze(i, "", AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzj.zza(zzfeo.zzc(8, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzl(String str) {
        zzk(new com.google.android.gms.ads.internal.client.zze(0, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    public void zzm() {
        this.zzc.zza();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzn() {
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzo() {
        this.zze.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzp() {
        this.zzg.zzbv();
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzq(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzr(zzbgi zzbgiVar, String str) {
    }

    public void zzs(zzbwi zzbwiVar) {
    }

    public void zzt(zzbwm zzbwmVar) throws RemoteException {
    }

    public void zzu() throws RemoteException {
    }

    public void zzv() {
        this.zzh.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzw() {
        this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzx() throws RemoteException {
        this.zzh.zzc();
    }

    public void zzy() {
        this.zzh.zzd();
    }
}
