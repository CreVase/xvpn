package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbkz extends zzaum {
    public zzbkz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbkt zzbktVar, zzbky zzbkyVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, zzbktVar);
        zzauo.zzf(zza, zzbkyVar);
        zzbi(2, zza);
    }
}
