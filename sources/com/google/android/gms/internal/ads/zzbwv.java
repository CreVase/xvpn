package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzbwv extends zzaun implements zzbww {
    public zzbwv() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
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
                zzf(zzeVar);
            } else {
                int readInt = parcel.readInt();
                zzauo.zzc(parcel);
                zze(readInt);
            }
        } else {
            zzg();
        }
        parcel2.writeNoException();
        return true;
    }
}
