package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbde extends zzaum implements zzbdg {
    public zzbde(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbdg
    public final void zze(zzbdd zzbddVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbddVar);
        zzbh(1, zza);
    }
}
