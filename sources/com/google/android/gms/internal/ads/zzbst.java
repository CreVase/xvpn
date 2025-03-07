package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public final class zzbst extends zzaum implements zzbsv {
    public zzbst(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final boolean zzH() throws RemoteException {
        Parcel zzbg = zzbg(11, zza());
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzh(int i, int i2, Intent intent) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeInt(i2);
        zzauo.zzd(zza, intent);
        zzbh(12, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzi() throws RemoteException {
        zzbh(10, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzl(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, bundle);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzm() throws RemoteException {
        zzbh(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzo() throws RemoteException {
        zzbh(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzp(int i, String[] strArr, int[] iArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeStringArray(strArr);
        zza.writeIntArray(iArr);
        zzbh(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzq() throws RemoteException {
        zzbh(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzr() throws RemoteException {
        zzbh(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzs(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, bundle);
        Parcel zzbg = zzbg(6, zza);
        if (zzbg.readInt() != 0) {
            bundle.readFromParcel(zzbg);
        }
        zzbg.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzt() throws RemoteException {
        zzbh(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzu() throws RemoteException {
        zzbh(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzv() throws RemoteException {
        zzbh(14, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zzx() throws RemoteException {
        zzbh(9, zza());
    }
}
