package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzbgy extends zzaun implements zzbgz {
    public zzbgy() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public static zzbgz zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        if (queryLocalInterface instanceof zzbgz) {
            return (zzbgz) queryLocalInterface;
        }
        return new zzbgx(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final boolean zzbJ(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            com.google.android.gms.ads.internal.client.zzbu zzac = com.google.android.gms.ads.internal.client.zzbt.zzac(parcel.readStrongBinder());
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzauo.zzc(parcel);
            zze(zzac, asInterface);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
