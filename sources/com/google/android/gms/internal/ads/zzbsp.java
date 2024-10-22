package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public final class zzbsp extends zzaum implements zzbsr {
    public zzbsp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final zzbso zze(IObjectWrapper iObjectWrapper, zzbox zzboxVar, int i) throws RemoteException {
        zzbso zzbsmVar;
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzboxVar);
        zza.writeInt(233702000);
        Parcel zzbg = zzbg(1, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            if (queryLocalInterface instanceof zzbso) {
                zzbsmVar = (zzbso) queryLocalInterface;
            } else {
                zzbsmVar = new zzbsm(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbsmVar;
    }
}
