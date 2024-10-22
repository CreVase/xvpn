package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class zzcqq extends zzawo {
    private final zzcqp zza;
    private final com.google.android.gms.ads.internal.client.zzbu zzb;
    private final zzeyp zzc;
    private boolean zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzaF)).booleanValue();
    private final zzdso zze;

    public zzcqq(zzcqp zzcqpVar, com.google.android.gms.ads.internal.client.zzbu zzbuVar, zzeyp zzeypVar, zzdso zzdsoVar) {
        this.zza = zzcqpVar;
        this.zzb = zzbuVar;
        this.zzc = zzeypVar;
        this.zze = zzdsoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzawp
    public final com.google.android.gms.ads.internal.client.zzbu zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzawp
    public final com.google.android.gms.ads.internal.client.zzdn zzf() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgJ)).booleanValue()) {
            return null;
        }
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzawp
    public final void zzg(boolean z) {
        this.zzd = z;
    }

    @Override // com.google.android.gms.internal.ads.zzawp
    public final void zzh(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!zzdgVar.zzf()) {
                    this.zze.zze();
                }
            } catch (RemoteException e) {
                zzcat.zzf("Error in making CSI ping for reporting paid event callback", e);
            }
            this.zzc.zzn(zzdgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawp
    public final void zzi(IObjectWrapper iObjectWrapper, zzaww zzawwVar) {
        try {
            this.zzc.zzq(zzawwVar);
            this.zza.zzd((Activity) ObjectWrapper.unwrap(iObjectWrapper), zzawwVar, this.zzd);
        } catch (RemoteException e) {
            zzcat.zzl("#007 Could not call remote method.", e);
        }
    }
}
