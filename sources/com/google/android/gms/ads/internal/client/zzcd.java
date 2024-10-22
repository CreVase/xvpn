package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaun;
import com.google.android.gms.internal.ads.zzauo;
import com.google.android.gms.internal.ads.zzbfs;
import com.google.android.gms.internal.ads.zzbfy;
import com.google.android.gms.internal.ads.zzbkg;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzbkk;
import com.google.android.gms.internal.ads.zzbow;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbso;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzbvz;
import com.google.android.gms.internal.ads.zzbwp;
import com.google.android.gms.internal.ads.zzbzk;

/* loaded from: classes.dex */
public abstract class zzcd extends zzaun implements zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final boolean zzbJ(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar = (zzq) zzauo.zza(parcel, zzq.CREATOR);
                String readString = parcel.readString();
                zzbox zzf = zzbow.zzf(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzauo.zzc(parcel);
                zzbu zzd = zzd(asInterface, zzqVar, readString, zzf, readInt);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzd);
                return true;
            case 2:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) zzauo.zza(parcel, zzq.CREATOR);
                String readString2 = parcel.readString();
                zzbox zzf2 = zzbow.zzf(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzauo.zzc(parcel);
                zzbu zze = zze(asInterface2, zzqVar2, readString2, zzf2, readInt2);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zze);
                return true;
            case 3:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                zzbox zzf3 = zzbow.zzf(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzauo.zzc(parcel);
                zzbq zzb = zzb(asInterface3, readString3, zzf3, readInt3);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzb);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, null);
                return true;
            case 5:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                zzbfs zzi = zzi(asInterface4, asInterface5);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzi);
                return true;
            case 6:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbox zzf4 = zzbow.zzf(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzauo.zzc(parcel);
                zzbvz zzn = zzn(asInterface6, zzf4, readInt4);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzn);
                return true;
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, null);
                return true;
            case 8:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                zzbsv zzm = zzm(asInterface7);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzm);
                return true;
            case 9:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zzauo.zzc(parcel);
                zzco zzg = zzg(asInterface8, readInt5);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzg);
                return true;
            case 10:
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) zzauo.zza(parcel, zzq.CREATOR);
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zzauo.zzc(parcel);
                zzbu zzf5 = zzf(asInterface9, zzqVar3, readString4, readInt6);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzf5);
                return true;
            case 11:
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                zzbfy zzj = zzj(asInterface10, asInterface11, asInterface12);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzj);
                return true;
            case 12:
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                zzbox zzf6 = zzbow.zzf(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zzauo.zzc(parcel);
                zzbwp zzo = zzo(asInterface13, readString5, zzf6, readInt7);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzo);
                return true;
            case 13:
                IObjectWrapper asInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar4 = (zzq) zzauo.zza(parcel, zzq.CREATOR);
                String readString6 = parcel.readString();
                zzbox zzf7 = zzbow.zzf(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zzauo.zzc(parcel);
                zzbu zzc = zzc(asInterface14, zzqVar4, readString6, zzf7, readInt8);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzc);
                return true;
            case 14:
                IObjectWrapper asInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbox zzf8 = zzbow.zzf(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zzauo.zzc(parcel);
                zzbzk zzp = zzp(asInterface15, zzf8, readInt9);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzp);
                return true;
            case 15:
                IObjectWrapper asInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbox zzf9 = zzbow.zzf(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zzauo.zzc(parcel);
                zzbso zzl = zzl(asInterface16, zzf9, readInt10);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzl);
                return true;
            case 16:
                IObjectWrapper asInterface17 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbox zzf10 = zzbow.zzf(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zzbkh zzc2 = zzbkg.zzc(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                zzbkk zzk = zzk(asInterface17, zzf10, readInt11, zzc2);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzk);
                return true;
            case 17:
                IObjectWrapper asInterface18 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbox zzf11 = zzbow.zzf(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                zzauo.zzc(parcel);
                zzdj zzh = zzh(asInterface18, zzf11, readInt12);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzh);
                return true;
            default:
                return false;
        }
    }
}
