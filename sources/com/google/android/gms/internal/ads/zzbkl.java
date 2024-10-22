package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public final class zzbkl extends zzaum implements zzbkn {
    public zzbkl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbkn
    public final zzbkk zze(IObjectWrapper iObjectWrapper, zzbox zzboxVar, int i, zzbkh zzbkhVar) throws RemoteException {
        zzbkk zzbkiVar;
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzboxVar);
        zza.writeInt(233702000);
        zzauo.zzf(zza, zzbkhVar);
        Parcel zzbg = zzbg(1, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbkiVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            if (queryLocalInterface instanceof zzbkk) {
                zzbkiVar = (zzbkk) queryLocalInterface;
            } else {
                zzbkiVar = new zzbki(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbkiVar;
    }
}
