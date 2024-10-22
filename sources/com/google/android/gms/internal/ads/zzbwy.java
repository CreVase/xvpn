package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class zzbwy extends RewardedAd {
    private final String zza;
    private final zzbwp zzb;
    private final Context zzc;
    private final zzbxh zzd = new zzbxh();
    private OnAdMetadataChangedListener zze;
    private OnPaidEventListener zzf;
    private FullScreenContentCallback zzg;

    public zzbwy(Context context, String str) {
        this.zzc = context.getApplicationContext();
        this.zza = str;
        this.zzb = com.google.android.gms.ads.internal.client.zzay.zza().zzq(context, str, new zzbou());
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final Bundle getAdMetadata() {
        try {
            zzbwp zzbwpVar = this.zzb;
            if (zzbwpVar != null) {
                return zzbwpVar.zzb();
            }
        } catch (RemoteException e) {
            zzcat.zzl("#007 Could not call remote method.", e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final String getAdUnitId() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdn zzdnVar = null;
        try {
            zzbwp zzbwpVar = this.zzb;
            if (zzbwpVar != null) {
                zzdnVar = zzbwpVar.zzc();
            }
        } catch (RemoteException e) {
            zzcat.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zzb(zzdnVar);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final RewardItem getRewardItem() {
        zzbwm zzbwmVar;
        try {
            zzbwp zzbwpVar = this.zzb;
            if (zzbwpVar != null) {
                zzbwmVar = zzbwpVar.zzd();
            } else {
                zzbwmVar = null;
            }
            if (zzbwmVar == null) {
                return RewardItem.DEFAULT_REWARD;
            }
            return new zzbwz(zzbwmVar);
        } catch (RemoteException e) {
            zzcat.zzl("#007 Could not call remote method.", e);
            return RewardItem.DEFAULT_REWARD;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.zzg = fullScreenContentCallback;
        this.zzd.zzb(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setImmersiveMode(boolean z) {
        try {
            zzbwp zzbwpVar = this.zzb;
            if (zzbwpVar != null) {
                zzbwpVar.zzh(z);
            }
        } catch (RemoteException e) {
            zzcat.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.zze = onAdMetadataChangedListener;
            zzbwp zzbwpVar = this.zzb;
            if (zzbwpVar != null) {
                zzbwpVar.zzi(new com.google.android.gms.ads.internal.client.zzfd(onAdMetadataChangedListener));
            }
        } catch (RemoteException e) {
            zzcat.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzf = onPaidEventListener;
            zzbwp zzbwpVar = this.zzb;
            if (zzbwpVar != null) {
                zzbwpVar.zzj(new com.google.android.gms.ads.internal.client.zzfe(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzcat.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        if (serverSideVerificationOptions != null) {
            try {
                zzbwp zzbwpVar = this.zzb;
                if (zzbwpVar != null) {
                    zzbwpVar.zzl(new zzbxd(serverSideVerificationOptions));
                }
            } catch (RemoteException e) {
                zzcat.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.zzd.zzc(onUserEarnedRewardListener);
        if (activity == null) {
            zzcat.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzbwp zzbwpVar = this.zzb;
            if (zzbwpVar != null) {
                zzbwpVar.zzk(this.zzd);
                this.zzb.zzm(ObjectWrapper.wrap(activity));
            }
        } catch (RemoteException e) {
            zzcat.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzdx zzdxVar, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            zzbwp zzbwpVar = this.zzb;
            if (zzbwpVar != null) {
                zzbwpVar.zzf(com.google.android.gms.ads.internal.client.zzp.zza.zza(this.zzc, zzdxVar), new zzbxc(rewardedAdLoadCallback, this));
            }
        } catch (RemoteException e) {
            zzcat.zzl("#007 Could not call remote method.", e);
        }
    }
}
