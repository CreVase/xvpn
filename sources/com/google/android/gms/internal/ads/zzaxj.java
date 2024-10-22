package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzaxj extends zzaum {
    public zzaxj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzaxh zzaxhVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, zzaxhVar);
        Parcel zzbg = zzbg(3, zza);
        long readLong = zzbg.readLong();
        zzbg.recycle();
        return readLong;
    }

    public final zzaxe zzf(zzaxh zzaxhVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, zzaxhVar);
        Parcel zzbg = zzbg(1, zza);
        zzaxe zzaxeVar = (zzaxe) zzauo.zza(zzbg, zzaxe.CREATOR);
        zzbg.recycle();
        return zzaxeVar;
    }

    public final zzaxe zzg(zzaxh zzaxhVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, zzaxhVar);
        Parcel zzbg = zzbg(2, zza);
        zzaxe zzaxeVar = (zzaxe) zzauo.zza(zzbg, zzaxe.CREATOR);
        zzbg.recycle();
        return zzaxeVar;
    }
}
