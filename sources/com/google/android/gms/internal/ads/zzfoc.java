package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzfoc extends zzaum {
    public zzfoc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfoa zze(zzfny zzfnyVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, zzfnyVar);
        Parcel zzbg = zzbg(1, zza);
        zzfoa zzfoaVar = (zzfoa) zzauo.zza(zzbg, zzfoa.CREATOR);
        zzbg.recycle();
        return zzfoaVar;
    }

    public final zzfoj zzf(zzfoh zzfohVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, zzfohVar);
        Parcel zzbg = zzbg(3, zza);
        zzfoj zzfojVar = (zzfoj) zzauo.zza(zzbg, zzfoj.CREATOR);
        zzbg.recycle();
        return zzfojVar;
    }

    public final void zzg(zzfnv zzfnvVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, zzfnvVar);
        zzbh(2, zza);
    }
}
