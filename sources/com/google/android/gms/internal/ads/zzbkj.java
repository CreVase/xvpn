package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzbkj extends zzaun implements zzbkk {
    public zzbkj() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    public static zzbkk zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
        if (queryLocalInterface instanceof zzbkk) {
            return (zzbkk) queryLocalInterface;
        }
        return new zzbki(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final boolean zzbJ(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            zze();
        } else {
            String readString = parcel.readString();
            zzauo.zzc(parcel);
            zzf(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
