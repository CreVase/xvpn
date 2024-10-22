package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public final class zzbqt extends zzaum implements zzbqv {
    public zzbqt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final com.google.android.gms.ads.internal.client.zzdq zze() throws RemoteException {
        Parcel zzbg = zzbg(5, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final zzbrj zzf() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        zzbrj zzbrjVar = (zzbrj) zzauo.zza(zzbg, zzbrj.CREATOR);
        zzbg.recycle();
        return zzbrjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final zzbrj zzg() throws RemoteException {
        Parcel zzbg = zzbg(3, zza());
        zzbrj zzbrjVar = (zzbrj) zzauo.zza(zzbg, zzbrj.CREATOR);
        zzbg.recycle();
        return zzbrjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzq zzqVar, zzbqy zzbqyVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzauo.zzd(zza, bundle);
        zzauo.zzd(zza, bundle2);
        zzauo.zzd(zza, zzqVar);
        zzauo.zzf(zza, zzbqyVar);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbqg zzbqgVar, zzbpd zzbpdVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzauo.zzd(zza, zzlVar);
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzbqgVar);
        zzauo.zzf(zza, zzbpdVar);
        zzbh(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbqj zzbqjVar, zzbpd zzbpdVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzauo.zzd(zza, zzlVar);
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzbqjVar);
        zzauo.zzf(zza, zzbpdVar);
        zzauo.zzd(zza, zzqVar);
        zzbh(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbqj zzbqjVar, zzbpd zzbpdVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzauo.zzd(zza, zzlVar);
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzbqjVar);
        zzauo.zzf(zza, zzbpdVar);
        zzauo.zzd(zza, zzqVar);
        zzbh(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbqm zzbqmVar, zzbpd zzbpdVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzauo.zzd(zza, zzlVar);
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzbqmVar);
        zzauo.zzf(zza, zzbpdVar);
        zzbh(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbqp zzbqpVar, zzbpd zzbpdVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzauo.zzd(zza, zzlVar);
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzbqpVar);
        zzauo.zzf(zza, zzbpdVar);
        zzbh(18, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbqp zzbqpVar, zzbpd zzbpdVar, zzbfc zzbfcVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzauo.zzd(zza, zzlVar);
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzbqpVar);
        zzauo.zzf(zza, zzbpdVar);
        zzauo.zzd(zza, zzbfcVar);
        zzbh(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbqs zzbqsVar, zzbpd zzbpdVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzauo.zzd(zza, zzlVar);
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzbqsVar);
        zzauo.zzf(zza, zzbpdVar);
        zzbh(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbqs zzbqsVar, zzbpd zzbpdVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzauo.zzd(zza, zzlVar);
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzbqsVar);
        zzauo.zzf(zza, zzbpdVar);
        zzbh(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzq(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(19, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        Parcel zzbg = zzbg(24, zza);
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        Parcel zzbg = zzbg(15, zza);
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        Parcel zzbg = zzbg(17, zza);
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }
}
