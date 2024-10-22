package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzawq extends zzaum implements zzaws {
    public zzawq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaws
    public final void zzb(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbh(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaws
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, zzeVar);
        zzbh(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaws
    public final void zzd(zzawp zzawpVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, zzawpVar);
        zzbh(1, zza);
    }
}
