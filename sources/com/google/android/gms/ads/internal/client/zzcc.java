package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaum;
import com.google.android.gms.internal.ads.zzauo;
import com.google.android.gms.internal.ads.zzbfr;
import com.google.android.gms.internal.ads.zzbfs;
import com.google.android.gms.internal.ads.zzbfx;
import com.google.android.gms.internal.ads.zzbfy;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzbkj;
import com.google.android.gms.internal.ads.zzbkk;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbsn;
import com.google.android.gms.internal.ads.zzbso;
import com.google.android.gms.internal.ads.zzbsu;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzbvz;
import com.google.android.gms.internal.ads.zzbwo;
import com.google.android.gms.internal.ads.zzbwp;
import com.google.android.gms.internal.ads.zzbzj;
import com.google.android.gms.internal.ads.zzbzk;

/* loaded from: classes.dex */
public final class zzcc extends zzaum implements zzce {
    public zzcc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbq zzb(IObjectWrapper iObjectWrapper, String str, zzbox zzboxVar, int i) throws RemoteException {
        zzbq zzboVar;
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzauo.zzf(zza, zzboxVar);
        zza.writeInt(233702000);
        Parcel zzbg = zzbg(3, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzboVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof zzbq) {
                zzboVar = (zzbq) queryLocalInterface;
            } else {
                zzboVar = new zzbo(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzboVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbox zzboxVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzd(zza, zzqVar);
        zza.writeString(str);
        zzauo.zzf(zza, zzboxVar);
        zza.writeInt(233702000);
        Parcel zzbg = zzbg(13, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzbu) {
                zzbsVar = (zzbu) queryLocalInterface;
            } else {
                zzbsVar = new zzbs(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbox zzboxVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzd(zza, zzqVar);
        zza.writeString(str);
        zzauo.zzf(zza, zzboxVar);
        zza.writeInt(233702000);
        Parcel zzbg = zzbg(1, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzbu) {
                zzbsVar = (zzbu) queryLocalInterface;
            } else {
                zzbsVar = new zzbs(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbox zzboxVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzd(zza, zzqVar);
        zza.writeString(str);
        zzauo.zzf(zza, zzboxVar);
        zza.writeInt(233702000);
        Parcel zzbg = zzbg(2, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzbu) {
                zzbsVar = (zzbu) queryLocalInterface;
            } else {
                zzbsVar = new zzbs(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzd(zza, zzqVar);
        zza.writeString(str);
        zza.writeInt(233702000);
        Parcel zzbg = zzbg(10, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzbu) {
                zzbsVar = (zzbu) queryLocalInterface;
            } else {
                zzbsVar = new zzbs(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzco zzcmVar;
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zza.writeInt(233702000);
        Parcel zzbg = zzbg(9, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzcmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof zzco) {
                zzcmVar = (zzco) queryLocalInterface;
            } else {
                zzcmVar = new zzcm(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzcmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(IObjectWrapper iObjectWrapper, zzbox zzboxVar, int i) throws RemoteException {
        zzdj zzdhVar;
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzboxVar);
        zza.writeInt(233702000);
        Parcel zzbg = zzbg(17, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzdhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            if (queryLocalInterface instanceof zzdj) {
                zzdhVar = (zzdj) queryLocalInterface;
            } else {
                zzdhVar = new zzdh(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzdhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbfs zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, iObjectWrapper2);
        Parcel zzbg = zzbg(5, zza);
        zzbfs zzbE = zzbfr.zzbE(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzbE;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbfy zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, iObjectWrapper2);
        zzauo.zzf(zza, iObjectWrapper3);
        Parcel zzbg = zzbg(11, zza);
        zzbfy zze = zzbfx.zze(zzbg.readStrongBinder());
        zzbg.recycle();
        return zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbkk zzk(IObjectWrapper iObjectWrapper, zzbox zzboxVar, int i, zzbkh zzbkhVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzboxVar);
        zza.writeInt(233702000);
        zzauo.zzf(zza, zzbkhVar);
        Parcel zzbg = zzbg(16, zza);
        zzbkk zzb = zzbkj.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbso zzl(IObjectWrapper iObjectWrapper, zzbox zzboxVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzboxVar);
        zza.writeInt(233702000);
        Parcel zzbg = zzbg(15, zza);
        zzbso zzb = zzbsn.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbsv zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        Parcel zzbg = zzbg(8, zza);
        zzbsv zzI = zzbsu.zzI(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzI;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbvz zzn(IObjectWrapper iObjectWrapper, zzbox zzboxVar, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbwp zzo(IObjectWrapper iObjectWrapper, String str, zzbox zzboxVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzauo.zzf(zza, zzboxVar);
        zza.writeInt(233702000);
        Parcel zzbg = zzbg(12, zza);
        zzbwp zzq = zzbwo.zzq(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbzk zzp(IObjectWrapper iObjectWrapper, zzbox zzboxVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzboxVar);
        zza.writeInt(233702000);
        Parcel zzbg = zzbg(14, zza);
        zzbzk zzb = zzbzj.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }
}
