package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzbqu extends zzaun implements zzbqv {
    public zzbqu() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbqv zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        if (queryLocalInterface instanceof zzbqv) {
            return (zzbqv) queryLocalInterface;
        }
        return new zzbqt(iBinder);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0021. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzaun
    public final boolean zzbJ(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbqy zzbqyVar = null;
        zzbqg zzbqeVar = null;
        zzbqp zzbqnVar = null;
        zzbqj zzbqhVar = null;
        zzbqs zzbqqVar = null;
        zzbqp zzbqnVar2 = null;
        zzbqs zzbqqVar2 = null;
        zzbqm zzbqkVar = null;
        zzbqj zzbqhVar2 = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 10) {
                            if (i != 11) {
                                switch (i) {
                                    case 13:
                                        String readString = parcel.readString();
                                        String readString2 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzauo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder = parcel.readStrongBinder();
                                        if (readStrongBinder != null) {
                                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                            if (queryLocalInterface instanceof zzbqj) {
                                                zzbqhVar2 = (zzbqj) queryLocalInterface;
                                            } else {
                                                zzbqhVar2 = new zzbqh(readStrongBinder);
                                            }
                                        }
                                        zzbqj zzbqjVar = zzbqhVar2;
                                        zzbpd zzb = zzbpc.zzb(parcel.readStrongBinder());
                                        com.google.android.gms.ads.internal.client.zzq zzqVar = (com.google.android.gms.ads.internal.client.zzq) zzauo.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                                        zzauo.zzc(parcel);
                                        zzj(readString, readString2, zzlVar, asInterface, zzbqjVar, zzb, zzqVar);
                                        parcel2.writeNoException();
                                        break;
                                    case 14:
                                        String readString3 = parcel.readString();
                                        String readString4 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzauo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                        IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                                        if (readStrongBinder2 != null) {
                                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                                            if (queryLocalInterface2 instanceof zzbqm) {
                                                zzbqkVar = (zzbqm) queryLocalInterface2;
                                            } else {
                                                zzbqkVar = new zzbqk(readStrongBinder2);
                                            }
                                        }
                                        zzbqm zzbqmVar = zzbqkVar;
                                        zzbpd zzb2 = zzbpc.zzb(parcel.readStrongBinder());
                                        zzauo.zzc(parcel);
                                        zzl(readString3, readString4, zzlVar2, asInterface2, zzbqmVar, zzb2);
                                        parcel2.writeNoException();
                                        break;
                                    case 15:
                                        IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        zzauo.zzc(parcel);
                                        boolean zzs = zzs(asInterface3);
                                        parcel2.writeNoException();
                                        parcel2.writeInt(zzs ? 1 : 0);
                                        break;
                                    case 16:
                                        String readString5 = parcel.readString();
                                        String readString6 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzl zzlVar3 = (com.google.android.gms.ads.internal.client.zzl) zzauo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                        IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder3 = parcel.readStrongBinder();
                                        if (readStrongBinder3 != null) {
                                            IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                            if (queryLocalInterface3 instanceof zzbqs) {
                                                zzbqqVar2 = (zzbqs) queryLocalInterface3;
                                            } else {
                                                zzbqqVar2 = new zzbqq(readStrongBinder3);
                                            }
                                        }
                                        zzbqs zzbqsVar = zzbqqVar2;
                                        zzbpd zzb3 = zzbpc.zzb(parcel.readStrongBinder());
                                        zzauo.zzc(parcel);
                                        zzp(readString5, readString6, zzlVar3, asInterface4, zzbqsVar, zzb3);
                                        parcel2.writeNoException();
                                        break;
                                    case 17:
                                        IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        zzauo.zzc(parcel);
                                        boolean zzt = zzt(asInterface5);
                                        parcel2.writeNoException();
                                        parcel2.writeInt(zzt ? 1 : 0);
                                        break;
                                    case 18:
                                        String readString7 = parcel.readString();
                                        String readString8 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzl zzlVar4 = (com.google.android.gms.ads.internal.client.zzl) zzauo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                        IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder4 = parcel.readStrongBinder();
                                        if (readStrongBinder4 != null) {
                                            IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                            if (queryLocalInterface4 instanceof zzbqp) {
                                                zzbqnVar2 = (zzbqp) queryLocalInterface4;
                                            } else {
                                                zzbqnVar2 = new zzbqn(readStrongBinder4);
                                            }
                                        }
                                        zzbqp zzbqpVar = zzbqnVar2;
                                        zzbpd zzb4 = zzbpc.zzb(parcel.readStrongBinder());
                                        zzauo.zzc(parcel);
                                        zzm(readString7, readString8, zzlVar4, asInterface6, zzbqpVar, zzb4);
                                        parcel2.writeNoException();
                                        break;
                                    case 19:
                                        String readString9 = parcel.readString();
                                        zzauo.zzc(parcel);
                                        zzq(readString9);
                                        parcel2.writeNoException();
                                        break;
                                    case 20:
                                        String readString10 = parcel.readString();
                                        String readString11 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzl zzlVar5 = (com.google.android.gms.ads.internal.client.zzl) zzauo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                        IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder5 = parcel.readStrongBinder();
                                        if (readStrongBinder5 != null) {
                                            IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                            if (queryLocalInterface5 instanceof zzbqs) {
                                                zzbqqVar = (zzbqs) queryLocalInterface5;
                                            } else {
                                                zzbqqVar = new zzbqq(readStrongBinder5);
                                            }
                                        }
                                        zzbqs zzbqsVar2 = zzbqqVar;
                                        zzbpd zzb5 = zzbpc.zzb(parcel.readStrongBinder());
                                        zzauo.zzc(parcel);
                                        zzo(readString10, readString11, zzlVar5, asInterface7, zzbqsVar2, zzb5);
                                        parcel2.writeNoException();
                                        break;
                                    case 21:
                                        String readString12 = parcel.readString();
                                        String readString13 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzl zzlVar6 = (com.google.android.gms.ads.internal.client.zzl) zzauo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                        IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder6 = parcel.readStrongBinder();
                                        if (readStrongBinder6 != null) {
                                            IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                            if (queryLocalInterface6 instanceof zzbqj) {
                                                zzbqhVar = (zzbqj) queryLocalInterface6;
                                            } else {
                                                zzbqhVar = new zzbqh(readStrongBinder6);
                                            }
                                        }
                                        zzbqj zzbqjVar2 = zzbqhVar;
                                        zzbpd zzb6 = zzbpc.zzb(parcel.readStrongBinder());
                                        com.google.android.gms.ads.internal.client.zzq zzqVar2 = (com.google.android.gms.ads.internal.client.zzq) zzauo.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                                        zzauo.zzc(parcel);
                                        zzk(readString12, readString13, zzlVar6, asInterface8, zzbqjVar2, zzb6, zzqVar2);
                                        parcel2.writeNoException();
                                        break;
                                    case 22:
                                        String readString14 = parcel.readString();
                                        String readString15 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzl zzlVar7 = (com.google.android.gms.ads.internal.client.zzl) zzauo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                        IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder7 = parcel.readStrongBinder();
                                        if (readStrongBinder7 != null) {
                                            IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                            if (queryLocalInterface7 instanceof zzbqp) {
                                                zzbqnVar = (zzbqp) queryLocalInterface7;
                                            } else {
                                                zzbqnVar = new zzbqn(readStrongBinder7);
                                            }
                                        }
                                        zzbqp zzbqpVar2 = zzbqnVar;
                                        zzbpd zzb7 = zzbpc.zzb(parcel.readStrongBinder());
                                        zzbfc zzbfcVar = (zzbfc) zzauo.zza(parcel, zzbfc.CREATOR);
                                        zzauo.zzc(parcel);
                                        zzn(readString14, readString15, zzlVar7, asInterface9, zzbqpVar2, zzb7, zzbfcVar);
                                        parcel2.writeNoException();
                                        break;
                                    case 23:
                                        String readString16 = parcel.readString();
                                        String readString17 = parcel.readString();
                                        com.google.android.gms.ads.internal.client.zzl zzlVar8 = (com.google.android.gms.ads.internal.client.zzl) zzauo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                        IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder8 = parcel.readStrongBinder();
                                        if (readStrongBinder8 != null) {
                                            IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                                            if (queryLocalInterface8 instanceof zzbqg) {
                                                zzbqeVar = (zzbqg) queryLocalInterface8;
                                            } else {
                                                zzbqeVar = new zzbqe(readStrongBinder8);
                                            }
                                        }
                                        zzbqg zzbqgVar = zzbqeVar;
                                        zzbpd zzb8 = zzbpc.zzb(parcel.readStrongBinder());
                                        zzauo.zzc(parcel);
                                        zzi(readString16, readString17, zzlVar8, asInterface10, zzbqgVar, zzb8);
                                        parcel2.writeNoException();
                                        break;
                                    case 24:
                                        IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        zzauo.zzc(parcel);
                                        boolean zzr = zzr(asInterface11);
                                        parcel2.writeNoException();
                                        parcel2.writeInt(zzr ? 1 : 0);
                                        break;
                                    default:
                                        return false;
                                }
                            } else {
                                parcel.createStringArray();
                                zzauo.zzc(parcel);
                                parcel2.writeNoException();
                            }
                        } else {
                            IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                            zzauo.zzc(parcel);
                            parcel2.writeNoException();
                        }
                    } else {
                        com.google.android.gms.ads.internal.client.zzdq zze = zze();
                        parcel2.writeNoException();
                        zzauo.zzf(parcel2, zze);
                    }
                } else {
                    zzbrj zzg = zzg();
                    parcel2.writeNoException();
                    zzauo.zze(parcel2, zzg);
                }
            } else {
                zzbrj zzf = zzf();
                parcel2.writeNoException();
                zzauo.zze(parcel2, zzf);
            }
        } else {
            IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString18 = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) zzauo.zza(parcel, creator);
            Bundle bundle2 = (Bundle) zzauo.zza(parcel, creator);
            com.google.android.gms.ads.internal.client.zzq zzqVar3 = (com.google.android.gms.ads.internal.client.zzq) zzauo.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
            IBinder readStrongBinder9 = parcel.readStrongBinder();
            if (readStrongBinder9 != null) {
                IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                if (queryLocalInterface9 instanceof zzbqy) {
                    zzbqyVar = (zzbqy) queryLocalInterface9;
                } else {
                    zzbqyVar = new zzbqw(readStrongBinder9);
                }
            }
            zzbqy zzbqyVar2 = zzbqyVar;
            zzauo.zzc(parcel);
            zzh(asInterface12, readString18, bundle, bundle2, zzqVar3, zzbqyVar2);
            parcel2.writeNoException();
        }
        return true;
    }
}
