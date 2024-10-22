package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzbur extends zzaun implements zzbus {
    public zzbur() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final boolean zzbJ(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbvc zzbvcVar = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 7) {
                                return false;
                            }
                            String readString = parcel.readString();
                            IBinder readStrongBinder = parcel.readStrongBinder();
                            if (readStrongBinder != null) {
                                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                                if (queryLocalInterface instanceof zzbvc) {
                                    zzbvcVar = (zzbvc) queryLocalInterface;
                                } else {
                                    zzbvcVar = new zzbva(readStrongBinder);
                                }
                            }
                            zzauo.zzc(parcel);
                            zzh(readString, zzbvcVar);
                            parcel2.writeNoException();
                        } else {
                            zzbvg zzbvgVar = (zzbvg) zzauo.zza(parcel, zzbvg.CREATOR);
                            IBinder readStrongBinder2 = parcel.readStrongBinder();
                            if (readStrongBinder2 != null) {
                                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                                if (queryLocalInterface2 instanceof zzbvc) {
                                    zzbvcVar = (zzbvc) queryLocalInterface2;
                                } else {
                                    zzbvcVar = new zzbva(readStrongBinder2);
                                }
                            }
                            zzauo.zzc(parcel);
                            zze(zzbvgVar, zzbvcVar);
                            parcel2.writeNoException();
                        }
                    } else {
                        zzbvg zzbvgVar2 = (zzbvg) zzauo.zza(parcel, zzbvg.CREATOR);
                        IBinder readStrongBinder3 = parcel.readStrongBinder();
                        if (readStrongBinder3 != null) {
                            IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                            if (queryLocalInterface3 instanceof zzbvc) {
                                zzbvcVar = (zzbvc) queryLocalInterface3;
                            } else {
                                zzbvcVar = new zzbva(readStrongBinder3);
                            }
                        }
                        zzauo.zzc(parcel);
                        zzf(zzbvgVar2, zzbvcVar);
                        parcel2.writeNoException();
                    }
                } else {
                    zzbvg zzbvgVar3 = (zzbvg) zzauo.zza(parcel, zzbvg.CREATOR);
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                        if (queryLocalInterface4 instanceof zzbvc) {
                            zzbvcVar = (zzbvc) queryLocalInterface4;
                        } else {
                            zzbvcVar = new zzbva(readStrongBinder4);
                        }
                    }
                    zzauo.zzc(parcel);
                    zzg(zzbvgVar3, zzbvcVar);
                    parcel2.writeNoException();
                }
            } else {
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (queryLocalInterface5 instanceof zzbut) {
                    }
                }
                zzauo.zzc(parcel);
                parcel2.writeNoException();
            }
        } else {
            zzauo.zzc(parcel);
            parcel2.writeNoException();
            zzauo.zze(parcel2, null);
        }
        return true;
    }
}
