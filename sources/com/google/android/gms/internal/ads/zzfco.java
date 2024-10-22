package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzfco extends zzbvy {
    private final zzfce zza;
    private final zzfbu zzb;
    private final zzfdf zzc;
    private zzdox zzd;
    private boolean zze = false;

    public zzfco(zzfce zzfceVar, zzfbu zzfbuVar, zzfdf zzfdfVar) {
        this.zza = zzfceVar;
        this.zzb = zzfbuVar;
        this.zzc = zzfdfVar;
    }

    private final synchronized boolean zzy() {
        zzdox zzdoxVar = this.zzd;
        if (zzdoxVar != null) {
            if (!zzdoxVar.zze()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final Bundle zzb() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzdox zzdoxVar = this.zzd;
        if (zzdoxVar != null) {
            return zzdoxVar.zza();
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized com.google.android.gms.ads.internal.client.zzdn zzc() throws RemoteException {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgJ)).booleanValue()) {
            return null;
        }
        zzdox zzdoxVar = this.zzd;
        if (zzdoxVar == null) {
            return null;
        }
        return zzdoxVar.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized String zzd() throws RemoteException {
        zzdox zzdoxVar = this.zzd;
        if (zzdoxVar != null && zzdoxVar.zzl() != null) {
            return zzdoxVar.zzl().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final void zze() throws RemoteException {
        zzf(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzg(null);
        if (this.zzd != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzm().zza(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized void zzg(zzbwd zzbwdVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        String str = zzbwdVar.zzb;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfm);
        if (str2 != null && str != null) {
            try {
                if (Pattern.matches(str2, str)) {
                    return;
                }
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "NonagonUtil.isPatternMatched");
            }
        }
        if (zzy()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfo)).booleanValue()) {
                return;
            }
        }
        zzfbw zzfbwVar = new zzfbw(null);
        this.zzd = null;
        this.zza.zzj(1);
        this.zza.zzb(zzbwdVar.zza, zzbwdVar.zzb, zzfbwVar, new zzfcm(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final void zzh() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        Context context;
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            if (iObjectWrapper == null) {
                context = null;
            } else {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzm().zzb(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final void zzj() {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Context context;
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            if (iObjectWrapper == null) {
                context = null;
            } else {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzm().zzc(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final void zzl(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzbyVar == null) {
            this.zzb.zzg(null);
        } else {
            this.zzb.zzg(new zzfcn(this, zzbyVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized void zzm(String str) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized void zzn(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zze = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final void zzo(zzbwc zzbwcVar) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzm(zzbwcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized void zzp(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized void zzq() throws RemoteException {
        zzr(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized void zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("showAd must be called on the main UI thread.");
        if (this.zzd != null) {
            Activity activity = null;
            if (iObjectWrapper != null) {
                Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
                if (unwrap instanceof Activity) {
                    activity = (Activity) unwrap;
                }
            }
            this.zzd.zzh(this.zze, activity);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final boolean zzs() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final boolean zzt() {
        zzdox zzdoxVar = this.zzd;
        if (zzdoxVar != null && zzdoxVar.zzg()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final void zzu(zzbvx zzbvxVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzn(zzbvxVar);
    }
}
