package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzbzg extends zzaun implements zzbzh {
    public zzbzg() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final boolean zzbJ(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) zzauo.zza(parcel, Bundle.CREATOR);
                zzauo.zzc(parcel);
                zzc(readString, readString2, bundle);
            } else {
                String readString3 = parcel.readString();
                zzauo.zzc(parcel);
                zzb(readString3);
            }
        } else {
            parcel.readString();
            parcel.readString();
            zzauo.zzc(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
