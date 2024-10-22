package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class zzboz extends zzaun implements zzbpa {
    public zzboz() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final boolean zzbJ(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbpd zzbpdVar = null;
        switch (i) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzq zzqVar = (com.google.android.gms.ads.internal.client.zzq) zzauo.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzauo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface instanceof zzbpd) {
                        zzbpdVar = (zzbpd) queryLocalInterface;
                    } else {
                        zzbpdVar = new zzbpb(readStrongBinder);
                    }
                }
                zzbpd zzbpdVar2 = zzbpdVar;
                zzauo.zzc(parcel);
                zzu(asInterface, zzqVar, zzlVar, readString, zzbpdVar2);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper zzn = zzn();
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzn);
                return true;
            case 3:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzauo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface2 instanceof zzbpd) {
                        zzbpdVar = (zzbpd) queryLocalInterface2;
                    } else {
                        zzbpdVar = new zzbpb(readStrongBinder2);
                    }
                }
                zzauo.zzc(parcel);
                zzx(asInterface2, zzlVar2, readString2, zzbpdVar);
                parcel2.writeNoException();
                return true;
            case 4:
                zzI();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzq zzqVar2 = (com.google.android.gms.ads.internal.client.zzq) zzauo.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                com.google.android.gms.ads.internal.client.zzl zzlVar3 = (com.google.android.gms.ads.internal.client.zzl) zzauo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface3 instanceof zzbpd) {
                        zzbpdVar = (zzbpd) queryLocalInterface3;
                    } else {
                        zzbpdVar = new zzbpb(readStrongBinder3);
                    }
                }
                zzbpd zzbpdVar3 = zzbpdVar;
                zzauo.zzc(parcel);
                zzv(asInterface3, zzqVar2, zzlVar3, readString3, readString4, zzbpdVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar4 = (com.google.android.gms.ads.internal.client.zzl) zzauo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface4 instanceof zzbpd) {
                        zzbpdVar = (zzbpd) queryLocalInterface4;
                    } else {
                        zzbpdVar = new zzbpb(readStrongBinder4);
                    }
                }
                zzbpd zzbpdVar4 = zzbpdVar;
                zzauo.zzc(parcel);
                zzy(asInterface4, zzlVar4, readString5, readString6, zzbpdVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                zzE();
                parcel2.writeNoException();
                return true;
            case 9:
                zzF();
                parcel2.writeNoException();
                return true;
            case 10:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar5 = (com.google.android.gms.ads.internal.client.zzl) zzauo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString7 = parcel.readString();
                zzbwh zzb = zzbwg.zzb(parcel.readStrongBinder());
                String readString8 = parcel.readString();
                zzauo.zzc(parcel);
                zzp(asInterface5, zzlVar5, readString7, zzb, readString8);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzl zzlVar6 = (com.google.android.gms.ads.internal.client.zzl) zzauo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString9 = parcel.readString();
                zzauo.zzc(parcel);
                zzs(zzlVar6, readString9);
                parcel2.writeNoException();
                return true;
            case 12:
                zzL();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zzN = zzN();
                parcel2.writeNoException();
                int i3 = zzauo.zza;
                parcel2.writeInt(zzN ? 1 : 0);
                return true;
            case 14:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar7 = (com.google.android.gms.ads.internal.client.zzl) zzauo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface5 instanceof zzbpd) {
                        zzbpdVar = (zzbpd) queryLocalInterface5;
                    } else {
                        zzbpdVar = new zzbpb(readStrongBinder5);
                    }
                }
                zzbpd zzbpdVar5 = zzbpdVar;
                zzbfc zzbfcVar = (zzbfc) zzauo.zza(parcel, zzbfc.CREATOR);
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                zzauo.zzc(parcel);
                zzz(asInterface6, zzlVar7, readString10, readString11, zzbpdVar5, zzbfcVar, createStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                zzauo.zzf(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                zzauo.zzf(parcel2, null);
                return true;
            case 17:
                Bundle zze = zze();
                parcel2.writeNoException();
                zzauo.zze(parcel2, zze);
                return true;
            case 18:
                Bundle zzf = zzf();
                parcel2.writeNoException();
                zzauo.zze(parcel2, zzf);
                return true;
            case 19:
                Bundle zzg = zzg();
                parcel2.writeNoException();
                zzauo.zze(parcel2, zzg);
                return true;
            case 20:
                com.google.android.gms.ads.internal.client.zzl zzlVar8 = (com.google.android.gms.ads.internal.client.zzl) zzauo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                zzauo.zzc(parcel);
                zzB(zzlVar8, readString12, readString13);
                parcel2.writeNoException();
                return true;
            case 21:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                zzD(asInterface7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i4 = zzauo.zza;
                parcel2.writeInt(0);
                return true;
            case 23:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbwh zzb2 = zzbwg.zzb(parcel.readStrongBinder());
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                zzauo.zzc(parcel);
                zzr(asInterface8, zzb2, createStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                zzbgi zzi = zzi();
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzi);
                return true;
            case 25:
                boolean zzg2 = zzauo.zzg(parcel);
                zzauo.zzc(parcel);
                zzG(zzg2);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzdq zzh = zzh();
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzh);
                return true;
            case 27:
                zzbpm zzk = zzk();
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzk);
                return true;
            case 28:
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar9 = (com.google.android.gms.ads.internal.client.zzl) zzauo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString14 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface6 instanceof zzbpd) {
                        zzbpdVar = (zzbpd) queryLocalInterface6;
                    } else {
                        zzbpdVar = new zzbpb(readStrongBinder6);
                    }
                }
                zzauo.zzc(parcel);
                zzA(asInterface9, zzlVar9, readString14, zzbpdVar);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                zzK(asInterface10);
                parcel2.writeNoException();
                return true;
            case 31:
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzblk zzb3 = zzblj.zzb(parcel.readStrongBinder());
                ArrayList createTypedArrayList = parcel.createTypedArrayList(zzblq.CREATOR);
                zzauo.zzc(parcel);
                zzq(asInterface11, zzb3, createTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar10 = (com.google.android.gms.ads.internal.client.zzl) zzauo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString15 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface7 instanceof zzbpd) {
                        zzbpdVar = (zzbpd) queryLocalInterface7;
                    } else {
                        zzbpdVar = new zzbpb(readStrongBinder7);
                    }
                }
                zzauo.zzc(parcel);
                zzC(asInterface12, zzlVar10, readString15, zzbpdVar);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbrj zzl = zzl();
                parcel2.writeNoException();
                zzauo.zze(parcel2, zzl);
                return true;
            case 34:
                zzbrj zzm = zzm();
                parcel2.writeNoException();
                zzauo.zze(parcel2, zzm);
                return true;
            case 35:
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzq zzqVar3 = (com.google.android.gms.ads.internal.client.zzq) zzauo.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                com.google.android.gms.ads.internal.client.zzl zzlVar11 = (com.google.android.gms.ads.internal.client.zzl) zzauo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface8 instanceof zzbpd) {
                        zzbpdVar = (zzbpd) queryLocalInterface8;
                    } else {
                        zzbpdVar = new zzbpb(readStrongBinder8);
                    }
                }
                zzbpd zzbpdVar6 = zzbpdVar;
                zzauo.zzc(parcel);
                zzw(asInterface13, zzqVar3, zzlVar11, readString16, readString17, zzbpdVar6);
                parcel2.writeNoException();
                return true;
            case 36:
                zzbpg zzj = zzj();
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzj);
                return true;
            case 37:
                IObjectWrapper asInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                zzJ(asInterface14);
                parcel2.writeNoException();
                return true;
            case 38:
                IObjectWrapper asInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar12 = (com.google.android.gms.ads.internal.client.zzl) zzauo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString18 = parcel.readString();
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface9 instanceof zzbpd) {
                        zzbpdVar = (zzbpd) queryLocalInterface9;
                    } else {
                        zzbpdVar = new zzbpb(readStrongBinder9);
                    }
                }
                zzauo.zzc(parcel);
                zzt(asInterface15, zzlVar12, readString18, zzbpdVar);
                parcel2.writeNoException();
                return true;
            case 39:
                IObjectWrapper asInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                zzH(asInterface16);
                parcel2.writeNoException();
                return true;
        }
    }
}
