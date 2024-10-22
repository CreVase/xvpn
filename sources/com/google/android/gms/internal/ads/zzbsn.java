package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzbsn extends zzaun implements zzbso {
    public zzbsn() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbso zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        if (queryLocalInterface instanceof zzbso) {
            return (zzbso) queryLocalInterface;
        }
        return new zzbsm(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final boolean zzbJ(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return false;
                        }
                        String[] createStringArray = parcel.createStringArray();
                        int[] createIntArray = parcel.createIntArray();
                        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzauo.zzc(parcel);
                        zzf(createStringArray, createIntArray, asInterface);
                    } else {
                        IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzauo.zzc(parcel);
                        zzg(asInterface2);
                    }
                } else {
                    zzh();
                }
            } else {
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzauo.zzc(parcel);
                zzi(asInterface3, readString, readString2);
            }
        } else {
            Intent intent = (Intent) zzauo.zza(parcel, Intent.CREATOR);
            zzauo.zzc(parcel);
            zze(intent);
        }
        parcel2.writeNoException();
        return true;
    }
}
