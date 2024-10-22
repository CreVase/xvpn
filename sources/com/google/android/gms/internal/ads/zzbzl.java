package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public final class zzbzl extends zzaum implements zzbzn {
    public zzbzl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbzn
    public final zzbzk zze(IObjectWrapper iObjectWrapper, zzbox zzboxVar, int i) throws RemoteException {
        zzbzk zzbziVar;
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzboxVar);
        zza.writeInt(233702000);
        Parcel zzbg = zzbg(2, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbziVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            if (queryLocalInterface instanceof zzbzk) {
                zzbziVar = (zzbzk) queryLocalInterface;
            } else {
                zzbziVar = new zzbzi(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbziVar;
    }
}
