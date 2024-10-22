package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbgq extends zzaum implements zzbgs {
    public zzbgq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zze(zzbgi zzbgiVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbgiVar);
        zza.writeString(str);
        zzbh(1, zza);
    }
}
