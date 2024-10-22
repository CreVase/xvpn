package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.p71;

/* loaded from: classes.dex */
public final class zzbfq extends zzaum implements zzbfs {
    public zzbfq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final IObjectWrapper zzb(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        return p71.j(zzbg(2, zza));
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final void zzbA(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final void zzbB(zzbfl zzbflVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbflVar);
        zzbh(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final void zzbC(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final void zzbD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final void zzbz(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final void zzc() throws RemoteException {
        zzbh(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final void zzd(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final void zze(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zza.writeInt(i);
        zzbh(5, zza);
    }
}
