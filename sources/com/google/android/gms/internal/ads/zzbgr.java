package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzbgr extends zzaun implements zzbgs {
    public zzbgr() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static zzbgs zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        if (queryLocalInterface instanceof zzbgs) {
            return (zzbgs) queryLocalInterface;
        }
        return new zzbgq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final boolean zzbJ(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbgi zzbggVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbggVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                if (queryLocalInterface instanceof zzbgi) {
                    zzbggVar = (zzbgi) queryLocalInterface;
                } else {
                    zzbggVar = new zzbgg(readStrongBinder);
                }
            }
            String readString = parcel.readString();
            zzauo.zzc(parcel);
            zze(zzbggVar, readString);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
