package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzbqx extends zzaun implements zzbqy {
    public zzbqx() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final boolean zzbJ(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzauo.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzauo.zzc(parcel);
                zzg(zzeVar);
            } else {
                String readString = parcel.readString();
                zzauo.zzc(parcel);
                zzf(readString);
            }
        } else {
            String readString2 = parcel.readString();
            zzauo.zzc(parcel);
            zze(readString2);
        }
        parcel2.writeNoException();
        return true;
    }
}
