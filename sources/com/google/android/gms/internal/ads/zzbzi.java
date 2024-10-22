package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbzi extends zzaum implements zzbzk {
    public zzbzi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final void zze(IObjectWrapper iObjectWrapper, zzbzo zzbzoVar, zzbzh zzbzhVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzd(zza, zzbzoVar);
        zzauo.zzf(zza, zzbzhVar);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final void zzf(zzbtt zzbttVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, zzbttVar);
        zzbh(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbtk zzbtkVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzbtkVar);
        zzbh(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbtk zzbtkVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzbtkVar);
        zzbh(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbtk zzbtkVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzbtkVar);
        zzbh(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbtk zzbtkVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzbtkVar);
        zzbh(5, zza);
    }
}
