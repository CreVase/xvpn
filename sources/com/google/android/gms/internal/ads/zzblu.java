package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzblu extends zzaun implements zzblv {
    public zzblu() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final boolean zzbJ(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbly zzblwVar;
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        if (i != 7) {
                            return false;
                        }
                        zzbfl zzc = zzc();
                        parcel2.writeNoException();
                        zzauo.zzf(parcel2, zzc);
                        return true;
                    }
                    IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzauo.zzc(parcel);
                    zze(asInterface);
                    parcel2.writeNoException();
                    return true;
                }
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzblwVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                    if (queryLocalInterface instanceof zzbly) {
                        zzblwVar = (zzbly) queryLocalInterface;
                    } else {
                        zzblwVar = new zzblw(readStrongBinder);
                    }
                }
                zzauo.zzc(parcel);
                zzf(asInterface2, zzblwVar);
                parcel2.writeNoException();
                return true;
            }
            zzd();
            parcel2.writeNoException();
            return true;
        }
        com.google.android.gms.ads.internal.client.zzdq zzb = zzb();
        parcel2.writeNoException();
        zzauo.zzf(parcel2, zzb);
        return true;
    }
}
