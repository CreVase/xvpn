package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzbqo extends zzaun implements zzbqp {
    public zzbqo() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
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
                String readString = parcel.readString();
                zzauo.zzc(parcel);
                zze(readString);
            }
        } else {
            zzbpm zzb = zzbpl.zzb(parcel.readStrongBinder());
            zzauo.zzc(parcel);
            zzg(zzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
