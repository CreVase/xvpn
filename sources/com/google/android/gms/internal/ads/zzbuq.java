package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbuq extends zzaum implements zzbus {
    public zzbuq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zze(zzbvg zzbvgVar, zzbvc zzbvcVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, zzbvgVar);
        zzauo.zzf(zza, zzbvcVar);
        zzbh(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzf(zzbvg zzbvgVar, zzbvc zzbvcVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, zzbvgVar);
        zzauo.zzf(zza, zzbvcVar);
        zzbh(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzg(zzbvg zzbvgVar, zzbvc zzbvcVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, zzbvgVar);
        zzauo.zzf(zza, zzbvcVar);
        zzbh(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzh(String str, zzbvc zzbvcVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzauo.zzf(zza, zzbvcVar);
        zzbh(7, zza);
    }
}
