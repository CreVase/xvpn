package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzemv {
    private final zzena zza;
    private final String zzb;
    private com.google.android.gms.ads.internal.client.zzdn zzc;

    public zzemv(zzena zzenaVar, String str) {
        this.zza = zzenaVar;
        this.zzb = str;
    }

    public final synchronized String zza() {
        String str;
        str = null;
        try {
            com.google.android.gms.ads.internal.client.zzdn zzdnVar = this.zzc;
            if (zzdnVar != null) {
                str = zzdnVar.zzg();
            }
        } catch (RemoteException e) {
            zzcat.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return str;
    }

    public final synchronized String zzb() {
        String str;
        str = null;
        try {
            com.google.android.gms.ads.internal.client.zzdn zzdnVar = this.zzc;
            if (zzdnVar != null) {
                str = zzdnVar.zzg();
            }
        } catch (RemoteException e) {
            zzcat.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return str;
    }

    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zzl zzlVar, int i) throws RemoteException {
        this.zzc = null;
        zzenb zzenbVar = new zzenb(i);
        zzemu zzemuVar = new zzemu(this);
        this.zza.zzb(zzlVar, this.zzb, zzenbVar, zzemuVar);
    }

    public final synchronized boolean zze() throws RemoteException {
        return this.zza.zza();
    }
}
