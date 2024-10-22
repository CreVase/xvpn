package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzaun;
import com.google.android.gms.internal.ads.zzauo;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzbgl;
import com.google.android.gms.internal.ads.zzbgm;
import com.google.android.gms.internal.ads.zzbgo;
import com.google.android.gms.internal.ads.zzbgp;
import com.google.android.gms.internal.ads.zzbgr;
import com.google.android.gms.internal.ads.zzbgs;
import com.google.android.gms.internal.ads.zzbgu;
import com.google.android.gms.internal.ads.zzbgv;
import com.google.android.gms.internal.ads.zzbgy;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbhb;
import com.google.android.gms.internal.ads.zzbhc;
import com.google.android.gms.internal.ads.zzbls;
import com.google.android.gms.internal.ads.zzbma;
import com.google.android.gms.internal.ads.zzbmb;

/* loaded from: classes.dex */
public abstract class zzbp extends zzaun implements zzbq {
    public zzbp() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final boolean zzbJ(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbh zzbhVar = null;
        zzcf zzcfVar = null;
        switch (i) {
            case 1:
                zzbn zze = zze();
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zze);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if (queryLocalInterface instanceof zzbh) {
                        zzbhVar = (zzbh) queryLocalInterface;
                    } else {
                        zzbhVar = new zzbf(readStrongBinder);
                    }
                }
                zzauo.zzc(parcel);
                zzl(zzbhVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbgm zzb = zzbgl.zzb(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                zzf(zzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbgp zzb2 = zzbgo.zzb(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                zzg(zzb2);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                zzbgv zzb3 = zzbgu.zzb(parcel.readStrongBinder());
                zzbgs zzb4 = zzbgr.zzb(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                zzh(readString, zzb3, zzb4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbfc zzbfcVar = (zzbfc) zzauo.zza(parcel, zzbfc.CREATOR);
                zzauo.zzc(parcel);
                zzo(zzbfcVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface2 instanceof zzcf) {
                        zzcfVar = (zzcf) queryLocalInterface2;
                    } else {
                        zzcfVar = new zzcf(readStrongBinder2);
                    }
                }
                zzauo.zzc(parcel);
                zzq(zzcfVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbgz zzb5 = zzbgy.zzb(parcel.readStrongBinder());
                zzq zzqVar = (zzq) zzauo.zza(parcel, zzq.CREATOR);
                zzauo.zzc(parcel);
                zzj(zzb5, zzqVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) zzauo.zza(parcel, PublisherAdViewOptions.CREATOR);
                zzauo.zzc(parcel);
                zzp(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbhc zzb6 = zzbhb.zzb(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                zzk(zzb6);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzbls zzblsVar = (zzbls) zzauo.zza(parcel, zzbls.CREATOR);
                zzauo.zzc(parcel);
                zzn(zzblsVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbmb zzb7 = zzbma.zzb(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                zzi(zzb7);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) zzauo.zza(parcel, AdManagerAdViewOptions.CREATOR);
                zzauo.zzc(parcel);
                zzm(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
