package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzblw extends zzaum implements zzbly {
    public zzblw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final void zze(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbh(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final void zzf() throws RemoteException {
        zzbh(1, zza());
    }
}
