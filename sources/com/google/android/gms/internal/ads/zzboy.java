package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.p71;
import java.util.List;

/* loaded from: classes.dex */
public final class zzboy extends zzaum implements zzbpa {
    public zzboy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzA(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbpd zzbpdVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzd(zza, zzlVar);
        zza.writeString(str);
        zzauo.zzf(zza, zzbpdVar);
        zzbh(28, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzB(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzC(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbpd zzbpdVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzd(zza, zzlVar);
        zza.writeString(str);
        zzauo.zzf(zza, zzbpdVar);
        zzbh(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzE() throws RemoteException {
        zzbh(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzF() throws RemoteException {
        zzbh(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzG(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzauo.zza;
        zza.writeInt(z ? 1 : 0);
        zzbh(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(39, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzI() throws RemoteException {
        zzbh(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzJ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(37, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(30, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzL() throws RemoteException {
        zzbh(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final boolean zzM() throws RemoteException {
        Parcel zzbg = zzbg(22, zza());
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final boolean zzN() throws RemoteException {
        Parcel zzbg = zzbg(13, zza());
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbpi zzO() throws RemoteException {
        zzbpi zzbpiVar;
        Parcel zzbg = zzbg(15, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbpiVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            if (queryLocalInterface instanceof zzbpi) {
                zzbpiVar = (zzbpi) queryLocalInterface;
            } else {
                zzbpiVar = new zzbpi(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbpiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbpj zzP() throws RemoteException {
        zzbpj zzbpjVar;
        Parcel zzbg = zzbg(16, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbpjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            if (queryLocalInterface instanceof zzbpj) {
                zzbpjVar = (zzbpj) queryLocalInterface;
            } else {
                zzbpjVar = new zzbpj(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbpjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final Bundle zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final Bundle zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final Bundle zzg() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        Parcel zzbg = zzbg(26, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbgi zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbpg zzj() throws RemoteException {
        zzbpg zzbpeVar;
        Parcel zzbg = zzbg(36, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbpeVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            if (queryLocalInterface instanceof zzbpg) {
                zzbpeVar = (zzbpg) queryLocalInterface;
            } else {
                zzbpeVar = new zzbpe(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbpeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbpm zzk() throws RemoteException {
        zzbpm zzbpkVar;
        Parcel zzbg = zzbg(27, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbpkVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            if (queryLocalInterface instanceof zzbpm) {
                zzbpkVar = (zzbpm) queryLocalInterface;
            } else {
                zzbpkVar = new zzbpk(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbpkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbrj zzl() throws RemoteException {
        Parcel zzbg = zzbg(33, zza());
        zzbrj zzbrjVar = (zzbrj) zzauo.zza(zzbg, zzbrj.CREATOR);
        zzbg.recycle();
        return zzbrjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbrj zzm() throws RemoteException {
        Parcel zzbg = zzbg(34, zza());
        zzbrj zzbrjVar = (zzbrj) zzauo.zza(zzbg, zzbrj.CREATOR);
        zzbg.recycle();
        return zzbrjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final IObjectWrapper zzn() throws RemoteException {
        return p71.j(zzbg(2, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzo() throws RemoteException {
        zzbh(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbwh zzbwhVar, String str2) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzd(zza, zzlVar);
        zza.writeString(null);
        zzauo.zzf(zza, zzbwhVar);
        zza.writeString(str2);
        zzbh(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzq(IObjectWrapper iObjectWrapper, zzblk zzblkVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzblkVar);
        zza.writeTypedList(list);
        zzbh(31, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzr(IObjectWrapper iObjectWrapper, zzbwh zzbwhVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzbwhVar);
        zza.writeStringList(list);
        zzbh(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzs(com.google.android.gms.ads.internal.client.zzl zzlVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, zzlVar);
        zza.writeString(str);
        zzbh(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbpd zzbpdVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzd(zza, zzlVar);
        zza.writeString(str);
        zzauo.zzf(zza, zzbpdVar);
        zzbh(38, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbpd zzbpdVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbpd zzbpdVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzd(zza, zzqVar);
        zzauo.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzauo.zzf(zza, zzbpdVar);
        zzbh(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbpd zzbpdVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzd(zza, zzqVar);
        zzauo.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzauo.zzf(zza, zzbpdVar);
        zzbh(35, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbpd zzbpdVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbpd zzbpdVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzauo.zzf(zza, zzbpdVar);
        zzbh(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbpd zzbpdVar, zzbfc zzbfcVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzauo.zzf(zza, zzbpdVar);
        zzauo.zzd(zza, zzbfcVar);
        zza.writeStringList(list);
        zzbh(14, zza);
    }
}
