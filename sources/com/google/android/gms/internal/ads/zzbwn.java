package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public final class zzbwn extends zzaum implements zzbwp {
    public zzbwn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final Bundle zzb() throws RemoteException {
        Parcel zzbg = zzbg(9, zza());
        Bundle bundle = (Bundle) zzauo.zza(zzbg, Bundle.CREATOR);
        zzbg.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final com.google.android.gms.ads.internal.client.zzdn zzc() throws RemoteException {
        Parcel zzbg = zzbg(12, zza());
        com.google.android.gms.ads.internal.client.zzdn zzb = com.google.android.gms.ads.internal.client.zzdm.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final zzbwm zzd() throws RemoteException {
        zzbwm zzbwkVar;
        Parcel zzbg = zzbg(11, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbwkVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            if (queryLocalInterface instanceof zzbwm) {
                zzbwkVar = (zzbwm) queryLocalInterface;
            } else {
                zzbwkVar = new zzbwk(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbwkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final String zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbww zzbwwVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, zzlVar);
        zzauo.zzf(zza, zzbwwVar);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbww zzbwwVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, zzlVar);
        zzauo.zzf(zza, zzbwwVar);
        zzbh(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzh(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzauo.zza;
        zza.writeInt(z ? 1 : 0);
        zzbh(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzi(com.google.android.gms.ads.internal.client.zzdd zzddVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, zzddVar);
        zzbh(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzj(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, zzdgVar);
        zzbh(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzk(zzbws zzbwsVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbwsVar);
        zzbh(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzl(zzbxd zzbxdVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, zzbxdVar);
        zzbh(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final boolean zzo() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzp(zzbwx zzbwxVar) throws RemoteException {
        throw null;
    }
}
