package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzbff extends zzaun implements zzbfg {
    public zzbff() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static zzbfg zzj(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        if (queryLocalInterface instanceof zzbfg) {
            return (zzbfg) queryLocalInterface;
        }
        return new zzbfe(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final boolean zzbJ(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            List zzh = zzh();
            parcel2.writeNoException();
            parcel2.writeList(zzh);
            return true;
        }
        String zzg = zzg();
        parcel2.writeNoException();
        parcel2.writeString(zzg);
        return true;
    }
}
