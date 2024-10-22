package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzdtt {
    private final zzbkh zza;

    public zzdtt(zzbkh zzbkhVar) {
        this.zza = zzbkhVar;
    }

    private final void zzs(zzdts zzdtsVar) throws RemoteException {
        String zza = zzdts.zza(zzdtsVar);
        zzcat.zzi("Dispatching AFMA event on publisher webview: ".concat(zza));
        this.zza.zzb(zza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzdts("initialize", null));
    }

    public final void zzb(long j) throws RemoteException {
        zzdts zzdtsVar = new zzdts("interstitial", null);
        zzdtsVar.zza = Long.valueOf(j);
        zzdtsVar.zzc = "onAdClicked";
        this.zza.zzb(zzdts.zza(zzdtsVar));
    }

    public final void zzc(long j) throws RemoteException {
        zzdts zzdtsVar = new zzdts("interstitial", null);
        zzdtsVar.zza = Long.valueOf(j);
        zzdtsVar.zzc = "onAdClosed";
        zzs(zzdtsVar);
    }

    public final void zzd(long j, int i) throws RemoteException {
        zzdts zzdtsVar = new zzdts("interstitial", null);
        zzdtsVar.zza = Long.valueOf(j);
        zzdtsVar.zzc = "onAdFailedToLoad";
        zzdtsVar.zzd = Integer.valueOf(i);
        zzs(zzdtsVar);
    }

    public final void zze(long j) throws RemoteException {
        zzdts zzdtsVar = new zzdts("interstitial", null);
        zzdtsVar.zza = Long.valueOf(j);
        zzdtsVar.zzc = "onAdLoaded";
        zzs(zzdtsVar);
    }

    public final void zzf(long j) throws RemoteException {
        zzdts zzdtsVar = new zzdts("interstitial", null);
        zzdtsVar.zza = Long.valueOf(j);
        zzdtsVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdtsVar);
    }

    public final void zzg(long j) throws RemoteException {
        zzdts zzdtsVar = new zzdts("interstitial", null);
        zzdtsVar.zza = Long.valueOf(j);
        zzdtsVar.zzc = "onAdOpened";
        zzs(zzdtsVar);
    }

    public final void zzh(long j) throws RemoteException {
        zzdts zzdtsVar = new zzdts("creation", null);
        zzdtsVar.zza = Long.valueOf(j);
        zzdtsVar.zzc = "nativeObjectCreated";
        zzs(zzdtsVar);
    }

    public final void zzi(long j) throws RemoteException {
        zzdts zzdtsVar = new zzdts("creation", null);
        zzdtsVar.zza = Long.valueOf(j);
        zzdtsVar.zzc = "nativeObjectNotCreated";
        zzs(zzdtsVar);
    }

    public final void zzj(long j) throws RemoteException {
        zzdts zzdtsVar = new zzdts("rewarded", null);
        zzdtsVar.zza = Long.valueOf(j);
        zzdtsVar.zzc = "onAdClicked";
        zzs(zzdtsVar);
    }

    public final void zzk(long j) throws RemoteException {
        zzdts zzdtsVar = new zzdts("rewarded", null);
        zzdtsVar.zza = Long.valueOf(j);
        zzdtsVar.zzc = "onRewardedAdClosed";
        zzs(zzdtsVar);
    }

    public final void zzl(long j, zzbwm zzbwmVar) throws RemoteException {
        zzdts zzdtsVar = new zzdts("rewarded", null);
        zzdtsVar.zza = Long.valueOf(j);
        zzdtsVar.zzc = "onUserEarnedReward";
        zzdtsVar.zze = zzbwmVar.zzf();
        zzdtsVar.zzf = Integer.valueOf(zzbwmVar.zze());
        zzs(zzdtsVar);
    }

    public final void zzm(long j, int i) throws RemoteException {
        zzdts zzdtsVar = new zzdts("rewarded", null);
        zzdtsVar.zza = Long.valueOf(j);
        zzdtsVar.zzc = "onRewardedAdFailedToLoad";
        zzdtsVar.zzd = Integer.valueOf(i);
        zzs(zzdtsVar);
    }

    public final void zzn(long j, int i) throws RemoteException {
        zzdts zzdtsVar = new zzdts("rewarded", null);
        zzdtsVar.zza = Long.valueOf(j);
        zzdtsVar.zzc = "onRewardedAdFailedToShow";
        zzdtsVar.zzd = Integer.valueOf(i);
        zzs(zzdtsVar);
    }

    public final void zzo(long j) throws RemoteException {
        zzdts zzdtsVar = new zzdts("rewarded", null);
        zzdtsVar.zza = Long.valueOf(j);
        zzdtsVar.zzc = "onAdImpression";
        zzs(zzdtsVar);
    }

    public final void zzp(long j) throws RemoteException {
        zzdts zzdtsVar = new zzdts("rewarded", null);
        zzdtsVar.zza = Long.valueOf(j);
        zzdtsVar.zzc = "onRewardedAdLoaded";
        zzs(zzdtsVar);
    }

    public final void zzq(long j) throws RemoteException {
        zzdts zzdtsVar = new zzdts("rewarded", null);
        zzdtsVar.zza = Long.valueOf(j);
        zzdtsVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdtsVar);
    }

    public final void zzr(long j) throws RemoteException {
        zzdts zzdtsVar = new zzdts("rewarded", null);
        zzdtsVar.zza = Long.valueOf(j);
        zzdtsVar.zzc = "onRewardedAdOpened";
        zzs(zzdtsVar);
    }
}
