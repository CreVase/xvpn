package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzawr extends zzaun implements zzaws {
    public zzawr() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static zzaws zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        if (queryLocalInterface instanceof zzaws) {
            return (zzaws) queryLocalInterface;
        }
        return new zzawq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final boolean zzbJ(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzawp zzawnVar;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzauo.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzauo.zzc(parcel);
                zzc(zzeVar);
            } else {
                parcel.readInt();
                zzauo.zzc(parcel);
            }
        } else {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzawnVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                if (queryLocalInterface instanceof zzawp) {
                    zzawnVar = (zzawp) queryLocalInterface;
                } else {
                    zzawnVar = new zzawn(readStrongBinder);
                }
            }
            zzauo.zzc(parcel);
            zzd(zzawnVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
