package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public final class zzawn extends zzaum implements zzawp {
    public zzawn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzawp
    public final com.google.android.gms.ads.internal.client.zzbu zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzawp
    public final com.google.android.gms.ads.internal.client.zzdn zzf() throws RemoteException {
        Parcel zzbg = zzbg(5, zza());
        com.google.android.gms.ads.internal.client.zzdn zzb = com.google.android.gms.ads.internal.client.zzdm.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzawp
    public final void zzg(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzauo.zza;
        zza.writeInt(z ? 1 : 0);
        zzbh(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzawp
    public final void zzh(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, zzdgVar);
        zzbh(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzawp
    public final void zzi(IObjectWrapper iObjectWrapper, zzaww zzawwVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzawwVar);
        zzbh(4, zza);
    }
}
