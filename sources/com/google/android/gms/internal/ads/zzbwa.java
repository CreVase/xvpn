package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbwa extends zzaum implements zzbwc {
    public zzbwa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbwc
    public final void zze(zzbvw zzbvwVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbvwVar);
        zzbh(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwc
    public final void zzf() throws RemoteException {
        zzbh(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwc
    public final void zzg(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbh(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwc
    public final void zzh() throws RemoteException {
        zzbh(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwc
    public final void zzi() throws RemoteException {
        zzbh(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwc
    public final void zzj() throws RemoteException {
        zzbh(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwc
    public final void zzk() throws RemoteException {
        zzbh(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwc
    public final void zzl() throws RemoteException {
        zzbh(3, zza());
    }
}
