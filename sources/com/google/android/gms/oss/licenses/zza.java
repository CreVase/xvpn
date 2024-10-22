package com.google.android.gms.oss.licenses;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zza extends com.google.android.gms.internal.oss_licenses.zza {
    public zza(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.oss.licenses.IOSSLicenseService");
    }

    public final String zzc(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzb = zzb(4, zza);
        String readString = zzb.readString();
        zzb.recycle();
        return readString;
    }

    public final String zzd(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzb = zzb(3, zza);
        String readString = zzb.readString();
        zzb.recycle();
        return readString;
    }

    public final String zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzb = zzb(2, zza);
        String readString = zzb.readString();
        zzb.recycle();
        return readString;
    }

    public final List zzf(List list) throws RemoteException {
        Parcel zza = zza();
        zza.writeList(list);
        Parcel zzb = zzb(5, zza);
        ArrayList zza2 = com.google.android.gms.internal.oss_licenses.zzb.zza(zzb);
        zzb.recycle();
        return zza2;
    }
}
