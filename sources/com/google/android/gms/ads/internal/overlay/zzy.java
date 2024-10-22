package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbsu;
import com.google.android.gms.internal.ads.zzdfd;

/* loaded from: classes.dex */
public final class zzy extends zzbsu {
    private final AdOverlayInfoParcel zza;
    private final Activity zzb;
    private boolean zzc = false;
    private boolean zzd = false;
    private boolean zze = false;

    public zzy(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zza = adOverlayInfoParcel;
        this.zzb = activity;
    }

    private final synchronized void zzb() {
        if (!this.zzd) {
            zzo zzoVar = this.zza.zzc;
            if (zzoVar != null) {
                zzoVar.zzby(4);
            }
            this.zzd = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final boolean zzH() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzh(int i, int i2, Intent intent) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzi() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzl(Bundle bundle) {
        zzo zzoVar;
        if (((Boolean) zzba.zzc().zzb(zzbci.zziD)).booleanValue() && !this.zze) {
            this.zzb.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zza;
        if (adOverlayInfoParcel == null) {
            this.zzb.finish();
            return;
        }
        if (z) {
            this.zzb.finish();
            return;
        }
        if (bundle == null) {
            com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
            if (zzaVar != null) {
                zzaVar.onAdClicked();
            }
            zzdfd zzdfdVar = this.zza.zzu;
            if (zzdfdVar != null) {
                zzdfdVar.zzbK();
            }
            if (this.zzb.getIntent() != null && this.zzb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzoVar = this.zza.zzc) != null) {
                zzoVar.zzbv();
            }
        }
        Activity activity = this.zzb;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zza;
        com.google.android.gms.ads.internal.zzt.zzh();
        zzc zzcVar = adOverlayInfoParcel2.zza;
        if (!zza.zzb(activity, zzcVar, adOverlayInfoParcel2.zzi, zzcVar.zzi)) {
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzm() throws RemoteException {
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzo() throws RemoteException {
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zzbo();
        }
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzp(int i, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzq() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzr() throws RemoteException {
        if (this.zzc) {
            this.zzb.finish();
            return;
        }
        this.zzc = true;
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zzbL();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzs(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzt() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzu() throws RemoteException {
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzv() throws RemoteException {
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zzbx();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzx() throws RemoteException {
        this.zze = true;
    }
}
