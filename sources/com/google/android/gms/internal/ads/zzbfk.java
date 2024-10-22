package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzbfk extends zzaun implements zzbfl {
    public zzbfk() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final boolean zzbJ(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbgw zzbgwVar;
        switch (i) {
            case 2:
                float zze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 3:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                zzj(asInterface);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper zzi = zzi();
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzi);
                return true;
            case 5:
                float zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(zzg);
                return true;
            case 6:
                float zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(zzf);
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdq zzh = zzh();
                parcel2.writeNoException();
                zzauo.zzf(parcel2, zzh);
                return true;
            case 8:
                boolean zzl = zzl();
                parcel2.writeNoException();
                int i3 = zzauo.zza;
                parcel2.writeInt(zzl ? 1 : 0);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbgwVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    if (queryLocalInterface instanceof zzbgw) {
                        zzbgwVar = (zzbgw) queryLocalInterface;
                    } else {
                        zzbgwVar = new zzbgw(readStrongBinder);
                    }
                }
                zzauo.zzc(parcel);
                zzm(zzbgwVar);
                parcel2.writeNoException();
                return true;
            case 10:
                boolean zzk = zzk();
                parcel2.writeNoException();
                int i4 = zzauo.zza;
                parcel2.writeInt(zzk ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
