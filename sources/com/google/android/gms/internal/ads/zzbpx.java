package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;

/* loaded from: classes.dex */
final class zzbpx implements MediationAdLoadCallback {
    final /* synthetic */ zzbpd zza;
    final /* synthetic */ zzbpy zzb;

    public zzbpx(zzbpy zzbpyVar, zzbpd zzbpdVar) {
        this.zzb = zzbpyVar;
        this.zza = zzbpdVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        Object obj;
        try {
            obj = this.zzb.zza;
            zzcat.zze(obj.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + adError.getCode() + ". ErrorMessage = " + adError.getMessage() + ". ErrorDomain = " + adError.getDomain());
            this.zza.zzh(adError.zza());
            this.zza.zzi(adError.getCode(), adError.getMessage());
            this.zza.zzg(adError.getCode());
        } catch (RemoteException e) {
            zzcat.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.zzb.zzj = (MediationAppOpenAd) obj;
            this.zza.zzo();
        } catch (RemoteException e) {
            zzcat.zzh("", e);
        }
        return new zzbpo(this.zza);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        Object obj;
        try {
            obj = this.zzb.zza;
            zzcat.zze(obj.getClass().getCanonicalName() + "failed to loaded mediation ad: " + str);
            this.zza.zzi(0, str);
            this.zza.zzg(0);
        } catch (RemoteException e) {
            zzcat.zzh("", e);
        }
    }
}
