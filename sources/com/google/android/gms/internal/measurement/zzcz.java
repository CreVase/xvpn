package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzcz extends zzbx implements zzda {
    public zzcz() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzbx
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int zza = zza();
            parcel2.writeNoException();
            parcel2.writeInt(zza);
        } else {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Bundle bundle = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
            long readLong = parcel.readLong();
            zzbw.zzb(parcel);
            zza(readString, readString2, bundle, readLong);
            parcel2.writeNoException();
        }
        return true;
    }
}
