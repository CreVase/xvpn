package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzbdc extends zzaun implements zzbdd {
    public zzbdc() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final boolean zzbJ(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return false;
                        }
                        zzf();
                        parcel2.writeNoException();
                    } else {
                        zze();
                        parcel2.writeNoException();
                    }
                } else {
                    IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzauo.zzc(parcel);
                    zzd(asInterface);
                    parcel2.writeNoException();
                }
            } else {
                String zzc = zzc();
                parcel2.writeNoException();
                parcel2.writeString(zzc);
            }
        } else {
            String zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeString(zzb);
        }
        return true;
    }
}
