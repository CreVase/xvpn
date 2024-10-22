package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class zzbtj extends zzaun implements zzbtk {
    public zzbtj() {
        super("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    public static zzbtk zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        if (queryLocalInterface instanceof zzbtk) {
            return (zzbtk) queryLocalInterface;
        }
        return new zzbti(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final boolean zzbJ(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            String readString = parcel.readString();
            zzauo.zzc(parcel);
            zze(readString);
        } else {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
            zzauo.zzc(parcel);
            zzf(createTypedArrayList);
        }
        parcel2.writeNoException();
        return true;
    }
}
