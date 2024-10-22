package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbux extends zzaum implements zzbuz {
    public zzbux(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, zzbbVar);
        zzbh(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, parcelFileDescriptor);
        zzbh(1, zza);
    }
}
