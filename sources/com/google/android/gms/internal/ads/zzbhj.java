package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.p71;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbhj extends zzaum implements zzbhl {
    public zzbhj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final void zzA() throws RemoteException {
        zzbh(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final void zzB(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, bundle);
        zzbh(17, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final void zzC() throws RemoteException {
        zzbh(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final void zzD(com.google.android.gms.ads.internal.client.zzcs zzcsVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, zzcsVar);
        zzbh(26, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final void zzE(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, zzdgVar);
        zzbh(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final void zzF(zzbhi zzbhiVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbhiVar);
        zzbh(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final boolean zzG() throws RemoteException {
        Parcel zzbg = zzbg(30, zza());
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final boolean zzH() throws RemoteException {
        Parcel zzbg = zzbg(24, zza());
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final boolean zzI(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, bundle);
        Parcel zzbg = zzbg(16, zza);
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final double zze() throws RemoteException {
        Parcel zzbg = zzbg(8, zza());
        double readDouble = zzbg.readDouble();
        zzbg.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final Bundle zzf() throws RemoteException {
        Parcel zzbg = zzbg(20, zza());
        Bundle bundle = (Bundle) zzauo.zza(zzbg, Bundle.CREATOR);
        zzbg.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final com.google.android.gms.ads.internal.client.zzdn zzg() throws RemoteException {
        Parcel zzbg = zzbg(31, zza());
        com.google.android.gms.ads.internal.client.zzdn zzb = com.google.android.gms.ads.internal.client.zzdm.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        Parcel zzbg = zzbg(11, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final zzbfg zzi() throws RemoteException {
        zzbfg zzbfeVar;
        Parcel zzbg = zzbg(14, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbfeVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            if (queryLocalInterface instanceof zzbfg) {
                zzbfeVar = (zzbfg) queryLocalInterface;
            } else {
                zzbfeVar = new zzbfe(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbfeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final zzbfl zzj() throws RemoteException {
        zzbfl zzbfjVar;
        Parcel zzbg = zzbg(29, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbfjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            if (queryLocalInterface instanceof zzbfl) {
                zzbfjVar = (zzbfl) queryLocalInterface;
            } else {
                zzbfjVar = new zzbfj(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final zzbfo zzk() throws RemoteException {
        zzbfo zzbfmVar;
        Parcel zzbg = zzbg(5, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbfmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            if (queryLocalInterface instanceof zzbfo) {
                zzbfmVar = (zzbfo) queryLocalInterface;
            } else {
                zzbfmVar = new zzbfm(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbfmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final IObjectWrapper zzl() throws RemoteException {
        return p71.j(zzbg(19, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final IObjectWrapper zzm() throws RemoteException {
        return p71.j(zzbg(18, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final String zzn() throws RemoteException {
        Parcel zzbg = zzbg(7, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final String zzo() throws RemoteException {
        Parcel zzbg = zzbg(4, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final String zzp() throws RemoteException {
        Parcel zzbg = zzbg(6, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final String zzq() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final String zzr() throws RemoteException {
        Parcel zzbg = zzbg(12, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final String zzs() throws RemoteException {
        Parcel zzbg = zzbg(10, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final String zzt() throws RemoteException {
        Parcel zzbg = zzbg(9, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final List zzu() throws RemoteException {
        Parcel zzbg = zzbg(3, zza());
        ArrayList zzb = zzauo.zzb(zzbg);
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final List zzv() throws RemoteException {
        Parcel zzbg = zzbg(23, zza());
        ArrayList zzb = zzauo.zzb(zzbg);
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final void zzw() throws RemoteException {
        zzbh(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final void zzx() throws RemoteException {
        zzbh(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final void zzy(com.google.android.gms.ads.internal.client.zzcw zzcwVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, zzcwVar);
        zzbh(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhl
    public final void zzz(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, bundle);
        zzbh(15, zza);
    }
}
