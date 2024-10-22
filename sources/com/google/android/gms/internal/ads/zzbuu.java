package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbuu extends zzaum implements zzbuw {
    public zzbuu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zze(zzbuo zzbuoVar, zzbuz zzbuzVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, zzbuoVar);
        zzauo.zzf(zza, zzbuzVar);
        zzbh(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzf(zzbuk zzbukVar, zzbuz zzbuzVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, zzbukVar);
        zzauo.zzf(zza, zzbuzVar);
        zzbh(1, zza);
    }
}
