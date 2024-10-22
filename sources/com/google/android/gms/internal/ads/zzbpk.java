package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.p71;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbpk extends zzaum implements zzbpm {
    public zzbpk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final boolean zzA() throws RemoteException {
        Parcel zzbg = zzbg(18, zza());
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final boolean zzB() throws RemoteException {
        Parcel zzbg = zzbg(17, zza());
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final double zze() throws RemoteException {
        Parcel zzbg = zzbg(8, zza());
        double readDouble = zzbg.readDouble();
        zzbg.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final float zzf() throws RemoteException {
        Parcel zzbg = zzbg(23, zza());
        float readFloat = zzbg.readFloat();
        zzbg.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final float zzg() throws RemoteException {
        Parcel zzbg = zzbg(25, zza());
        float readFloat = zzbg.readFloat();
        zzbg.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final float zzh() throws RemoteException {
        Parcel zzbg = zzbg(24, zza());
        float readFloat = zzbg.readFloat();
        zzbg.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final Bundle zzi() throws RemoteException {
        Parcel zzbg = zzbg(16, zza());
        Bundle bundle = (Bundle) zzauo.zza(zzbg, Bundle.CREATOR);
        zzbg.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final com.google.android.gms.ads.internal.client.zzdq zzj() throws RemoteException {
        Parcel zzbg = zzbg(11, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final zzbfg zzk() throws RemoteException {
        Parcel zzbg = zzbg(12, zza());
        zzbfg zzj = zzbff.zzj(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final zzbfo zzl() throws RemoteException {
        Parcel zzbg = zzbg(5, zza());
        zzbfo zzg = zzbfn.zzg(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final IObjectWrapper zzm() throws RemoteException {
        return p71.j(zzbg(13, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final IObjectWrapper zzn() throws RemoteException {
        return p71.j(zzbg(14, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final IObjectWrapper zzo() throws RemoteException {
        return p71.j(zzbg(15, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zzp() throws RemoteException {
        Parcel zzbg = zzbg(7, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zzq() throws RemoteException {
        Parcel zzbg = zzbg(4, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zzr() throws RemoteException {
        Parcel zzbg = zzbg(6, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zzs() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zzt() throws RemoteException {
        Parcel zzbg = zzbg(10, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zzu() throws RemoteException {
        Parcel zzbg = zzbg(9, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final List zzv() throws RemoteException {
        Parcel zzbg = zzbg(3, zza());
        ArrayList zzb = zzauo.zzb(zzbg);
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzx() throws RemoteException {
        zzbh(19, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzy(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, iObjectWrapper2);
        zzauo.zzf(zza, iObjectWrapper3);
        zzbh(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzz(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(22, zza);
    }
}
