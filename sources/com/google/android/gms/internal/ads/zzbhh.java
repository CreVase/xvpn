package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzbhh extends zzaun implements zzbhi {
    public zzbhh() {
        super("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
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
