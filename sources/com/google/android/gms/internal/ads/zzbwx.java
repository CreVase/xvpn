package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbwx extends zzaum {
    public zzbwx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbwm zzbwmVar, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbwmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbh(2, zza);
    }
}
