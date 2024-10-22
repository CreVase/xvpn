package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaun;
import com.google.android.gms.internal.ads.zzauo;
import com.google.android.gms.internal.ads.zzbox;

/* loaded from: classes.dex */
public abstract class zzck extends zzaun implements zzcl {
    public zzck() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static zzcl asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        if (queryLocalInterface instanceof zzcl) {
            return (zzcl) queryLocalInterface;
        }
        return new zzcj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final boolean zzbJ(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            zzbox adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            zzauo.zzf(parcel2, adapterCreator);
        } else {
            zzen liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            zzauo.zze(parcel2, liteSdkVersion);
        }
        return true;
    }
}
