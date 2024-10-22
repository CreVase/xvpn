package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzbwo extends zzaun implements zzbwp {
    public zzbwo() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzbwp zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        if (queryLocalInterface instanceof zzbwp) {
            return (zzbwp) queryLocalInterface;
        }
        return new zzbwn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final boolean zzbJ(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbww zzbwwVar = null;
        zzbww zzbwwVar2 = null;
        zzbwx zzbwxVar = null;
        zzbws zzbwsVar = null;
        switch (i) {
            case 1:
                com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzauo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    if (queryLocalInterface instanceof zzbww) {
                        zzbwwVar = (zzbww) queryLocalInterface;
                    } else {
                        zzbwwVar = new zzbwu(readStrongBinder);
                    }
                }
                zzauo.zzc(parcel);
                zzf(zzlVar, zzbwwVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    if (queryLocalInterface2 instanceof zzbws) {
                        zzbwsVar = (zzbws) queryLocalInterface2;
                    } else {
                        zzbwsVar = new zzbwq(readStrongBinder2);
                    }
                }
                zzauo.zzc(parcel);
                zzk(zzbwsVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzo = zzo();
                parcel2.writeNoException();
                int i3 = zzauo.zza;
                parcel2.writeInt(zzo ? 1 : 0);
                return true;
            case 4:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 5:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                zzm(asInterface);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    if (queryLocalInterface3 instanceof zzbwx) {
                        zzbwxVar = (zzbwx) queryLocalInterface3;
                    } else {
                        zzbwxVar = new zzbwx(readStrongBinder3);
                    }
                }
                zzauo.zzc(parcel);
                zzp(zzbwxVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbxd zzbxdVar = (zzbxd) zzauo.zza(parcel, zzbxd.CREATOR);
                zzauo.zzc(parcel);
                zzl(zzbxdVar);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.ads.internal.client.zzdd zzb = com.google.android.gms.ads.internal.client.zzdc.zzb(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                zzi(zzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle zzb2 = zzb();
                parcel2.writeNoException();
                zzauo.zze(parcel2, zzb2);
                return true;
            case 10:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zzg = zzauo.zzg(parcel);
                zzauo.zzc(parcel);
                zzn(asInterface2, zzg);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbwm zzd = zzd();
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzd);
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzdn zzc = zzc();
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzc);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdg zzb3 = com.google.android.gms.ads.internal.client.zzdf.zzb(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                zzj(zzb3);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzauo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    if (queryLocalInterface4 instanceof zzbww) {
                        zzbwwVar2 = (zzbww) queryLocalInterface4;
                    } else {
                        zzbwwVar2 = new zzbwu(readStrongBinder4);
                    }
                }
                zzauo.zzc(parcel);
                zzg(zzlVar2, zzbwwVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zzg2 = zzauo.zzg(parcel);
                zzauo.zzc(parcel);
                zzh(zzg2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
