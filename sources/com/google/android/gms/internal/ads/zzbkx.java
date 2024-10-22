package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzbkx extends zzaun implements zzbky {
    public zzbkx() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final boolean zzbJ(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzauo.zza(parcel, ParcelFileDescriptor.CREATOR);
            zzauo.zzc(parcel);
            zzb(parcelFileDescriptor);
            return true;
        }
        return false;
    }
}
