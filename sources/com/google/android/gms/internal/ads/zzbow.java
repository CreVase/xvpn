package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzbow extends zzaun implements zzbox {
    public zzbow() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbox zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        if (queryLocalInterface instanceof zzbox) {
            return (zzbox) queryLocalInterface;
        }
        return new zzbov(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final boolean zzbJ(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                    String readString = parcel.readString();
                    zzauo.zzc(parcel);
                    boolean zzd = zzd(readString);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzd ? 1 : 0);
                } else {
                    String readString2 = parcel.readString();
                    zzauo.zzc(parcel);
                    zzbqv zzc = zzc(readString2);
                    parcel2.writeNoException();
                    zzauo.zzf(parcel2, zzc);
                }
            } else {
                String readString3 = parcel.readString();
                zzauo.zzc(parcel);
                boolean zze = zze(readString3);
                parcel2.writeNoException();
                parcel2.writeInt(zze ? 1 : 0);
            }
        } else {
            String readString4 = parcel.readString();
            zzauo.zzc(parcel);
            zzbpa zzb = zzb(readString4);
            parcel2.writeNoException();
            zzauo.zzf(parcel2, zzb);
        }
        return true;
    }
}
