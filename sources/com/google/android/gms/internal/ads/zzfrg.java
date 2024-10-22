package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzfrg extends zzaum implements zzfri {
    public zzfrg(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzfri
    public final void zze(Bundle bundle, zzfrk zzfrkVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, bundle);
        zzauo.zzf(zza, zzfrkVar);
        zzbi(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfri
    public final void zzf(String str, Bundle bundle, zzfrk zzfrkVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzauo.zzd(zza, bundle);
        zzauo.zzf(zza, zzfrkVar);
        zzbi(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfri
    public final void zzg(Bundle bundle, zzfrk zzfrkVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, bundle);
        zzauo.zzf(zza, zzfrkVar);
        zzbi(3, zza);
    }
}
