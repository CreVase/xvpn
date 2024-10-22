package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbha extends zzaum implements zzbhc {
    public zzbha(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zze(zzbhl zzbhlVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbhlVar);
        zzbh(1, zza);
    }
}
