package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbli extends zzaum implements zzblk {
    public zzbli(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzblk
    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblk
    public final void zzf() throws RemoteException {
        zzbh(2, zza());
    }
}
