package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzbuy extends zzaun implements zzbuz {
    public zzbuy() {
        super("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final boolean zzbJ(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            com.google.android.gms.ads.internal.util.zzbb zzbbVar = (com.google.android.gms.ads.internal.util.zzbb) zzauo.zza(parcel, com.google.android.gms.ads.internal.util.zzbb.CREATOR);
            zzauo.zzc(parcel);
            zze(zzbbVar);
        } else {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzauo.zza(parcel, ParcelFileDescriptor.CREATOR);
            zzauo.zzc(parcel);
            zzf(parcelFileDescriptor);
        }
        parcel2.writeNoException();
        return true;
    }
}
