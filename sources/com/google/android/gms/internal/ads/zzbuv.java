package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzbuv extends zzaun implements zzbuw {
    public zzbuv() {
        super("com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final boolean zzbJ(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbuz zzbuzVar = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                zzbuo zzbuoVar = (zzbuo) zzauo.zza(parcel, zzbuo.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                    if (queryLocalInterface instanceof zzbuz) {
                        zzbuzVar = (zzbuz) queryLocalInterface;
                    } else {
                        zzbuzVar = new zzbux(readStrongBinder);
                    }
                }
                zzauo.zzc(parcel);
                zze(zzbuoVar, zzbuzVar);
            } else {
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                    if (queryLocalInterface2 instanceof zzbuz) {
                    }
                }
                zzauo.zzc(parcel);
            }
        } else {
            zzbuk zzbukVar = (zzbuk) zzauo.zza(parcel, zzbuk.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                if (queryLocalInterface3 instanceof zzbuz) {
                    zzbuzVar = (zzbuz) queryLocalInterface3;
                } else {
                    zzbuzVar = new zzbux(readStrongBinder3);
                }
            }
            zzauo.zzc(parcel);
            zzf(zzbukVar, zzbuzVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
