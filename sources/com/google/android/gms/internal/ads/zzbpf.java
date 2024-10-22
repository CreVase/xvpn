package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzbpf extends zzaun implements zzbpg {
    public zzbpf() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    public static zzbpg zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        if (queryLocalInterface instanceof zzbpg) {
            return (zzbpg) queryLocalInterface;
        }
        return new zzbpe(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final boolean zzbJ(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            boolean zzf = zzf();
            parcel2.writeNoException();
            int i3 = zzauo.zza;
            parcel2.writeInt(zzf ? 1 : 0);
        } else {
            IObjectWrapper zze = zze();
            parcel2.writeNoException();
            zzauo.zzf(parcel2, zze);
        }
        return true;
    }
}
