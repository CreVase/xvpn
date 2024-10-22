package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbva extends zzaum implements zzbvc {
    public zzbva(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, zzbbVar);
        zzbh(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, parcelFileDescriptor);
        zzbh(1, zza);
    }
}
