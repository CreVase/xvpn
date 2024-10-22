package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class zzfci extends zzbwo {
    private final zzfce zza;
    private final zzfbu zzb;
    private final String zzc;
    private final zzfdf zzd;
    private final Context zze;
    private final zzcaz zzf;
    private final zzaro zzg;
    private final zzdso zzh;
    private zzdox zzi;
    private boolean zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzaC)).booleanValue();

    public zzfci(String str, zzfce zzfceVar, Context context, zzfbu zzfbuVar, zzfdf zzfdfVar, zzcaz zzcazVar, zzaro zzaroVar, zzdso zzdsoVar) {
        this.zzc = str;
        this.zza = zzfceVar;
        this.zzb = zzfbuVar;
        this.zzd = zzfdfVar;
        this.zze = context;
        this.zzf = zzcazVar;
        this.zzg = zzaroVar;
        this.zzh = zzdsoVar;
    }

    private final synchronized void zzu(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbww zzbwwVar, int i) throws RemoteException {
        boolean z = false;
        if (((Boolean) zzbdz.zzl.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzkm)).booleanValue()) {
                z = true;
            }
        }
        if (this.zzf.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzkn)).intValue() || !z) {
            Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        }
        this.zzb.zzk(zzbwwVar);
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzG(this.zze) && zzlVar.zzs == null) {
            zzcat.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzbF(zzfeo.zzd(4, null, null));
            return;
        }
        if (this.zzi != null) {
            return;
        }
        zzfbw zzfbwVar = new zzfbw(null);
        this.zza.zzj(i);
        this.zza.zzb(zzlVar, this.zzc, zzfbwVar, new zzfch(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final Bundle zzb() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdox zzdoxVar = this.zzi;
        if (zzdoxVar != null) {
            return zzdoxVar.zza();
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final com.google.android.gms.ads.internal.client.zzdn zzc() {
        zzdox zzdoxVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgJ)).booleanValue() || (zzdoxVar = this.zzi) == null) {
            return null;
        }
        return zzdoxVar.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final zzbwm zzd() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdox zzdoxVar = this.zzi;
        if (zzdoxVar != null) {
            return zzdoxVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final synchronized String zze() throws RemoteException {
        zzdox zzdoxVar = this.zzi;
        if (zzdoxVar != null && zzdoxVar.zzl() != null) {
            return zzdoxVar.zzl().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final synchronized void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbww zzbwwVar) throws RemoteException {
        zzu(zzlVar, zzbwwVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbww zzbwwVar) throws RemoteException {
        zzu(zzlVar, zzbwwVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final synchronized void zzh(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzi(com.google.android.gms.ads.internal.client.zzdd zzddVar) {
        if (zzddVar == null) {
            this.zzb.zzg(null);
        } else {
            this.zzb.zzg(new zzfcg(this, zzddVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzj(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdgVar.zzf()) {
                this.zzh.zze();
            }
        } catch (RemoteException e) {
            zzcat.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzb.zzi(zzdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzk(zzbws zzbwsVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzj(zzbwsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final synchronized void zzl(zzbxd zzbxdVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzfdf zzfdfVar = this.zzd;
        zzfdfVar.zza = zzbxdVar.zza;
        zzfdfVar.zzb = zzbxdVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final synchronized void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzn(iObjectWrapper, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final synchronized void zzn(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzi == null) {
            zzcat.zzj("Rewarded can not be shown before loaded");
            this.zzb.zzp(zzfeo.zzd(9, null, null));
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzcw)).booleanValue()) {
            this.zzg.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzi.zzh(z, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final boolean zzo() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdox zzdoxVar = this.zzi;
        if (zzdoxVar != null && !zzdoxVar.zzf()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzp(zzbwx zzbwxVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzo(zzbwxVar);
    }
}
