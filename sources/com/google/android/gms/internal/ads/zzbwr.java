package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzbwr extends zzaun implements zzbws {
    public zzbwr() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final boolean zzbJ(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbwm zzbwkVar;
        switch (i) {
            case 1:
                zzj();
                break;
            case 2:
                zzg();
                break;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbwkVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    if (queryLocalInterface instanceof zzbwm) {
                        zzbwkVar = (zzbwm) queryLocalInterface;
                    } else {
                        zzbwkVar = new zzbwk(readStrongBinder);
                    }
                }
                zzauo.zzc(parcel);
                zzk(zzbwkVar);
                break;
            case 4:
                int readInt = parcel.readInt();
                zzauo.zzc(parcel);
                zzh(readInt);
                break;
            case 5:
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzauo.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzauo.zzc(parcel);
                zzi(zzeVar);
                break;
            case 6:
                zzf();
                break;
            case 7:
                zze();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
