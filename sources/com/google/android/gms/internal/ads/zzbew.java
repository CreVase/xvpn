package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbew extends zzaum {
    public zzbew(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbuf zzbufVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbufVar);
        zzbh(1, zza);
    }
}
