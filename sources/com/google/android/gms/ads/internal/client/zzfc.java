package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbwm;
import com.google.android.gms.internal.ads.zzbwo;
import com.google.android.gms.internal.ads.zzbws;
import com.google.android.gms.internal.ads.zzbww;
import com.google.android.gms.internal.ads.zzbwx;
import com.google.android.gms.internal.ads.zzbxd;
import com.google.android.gms.internal.ads.zzcam;
import com.google.android.gms.internal.ads.zzcat;

/* loaded from: classes.dex */
public final class zzfc extends zzbwo {
    private static void zzr(final zzbww zzbwwVar) {
        zzcat.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzcam.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfb
            @Override // java.lang.Runnable
            public final void run() {
                zzbww zzbwwVar2 = zzbww.this;
                if (zzbwwVar2 != null) {
                    try {
                        zzbwwVar2.zze(1);
                    } catch (RemoteException e) {
                        zzcat.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final Bundle zzb() throws RemoteException {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final zzdn zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final zzbwm zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final String zze() throws RemoteException {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzf(zzl zzlVar, zzbww zzbwwVar) throws RemoteException {
        zzr(zzbwwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzg(zzl zzlVar, zzbww zzbwwVar) throws RemoteException {
        zzr(zzbwwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzh(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzi(zzdd zzddVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzj(zzdg zzdgVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzk(zzbws zzbwsVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzl(zzbxd zzbxdVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final boolean zzo() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzp(zzbwx zzbwxVar) throws RemoteException {
    }
}
