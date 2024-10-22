package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public final class zzbsm extends zzaum implements zzbso {
    public zzbsm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zze(Intent intent) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, intent);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzf(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeStringArray(strArr);
        zza.writeIntArray(iArr);
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzh() throws RemoteException {
        zzbh(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzi(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeString(str2);
        zzbh(2, zza);
    }
}
