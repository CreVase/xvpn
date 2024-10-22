package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaun;
import com.google.android.gms.internal.ads.zzauo;

/* loaded from: classes.dex */
public abstract class zzbm extends zzaun implements zzbn {
    public zzbm() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
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
                        zzl zzlVar = (zzl) zzauo.zza(parcel, zzl.CREATOR);
                        int readInt = parcel.readInt();
                        zzauo.zzc(parcel);
                        zzh(zzlVar, readInt);
                        parcel2.writeNoException();
                    } else {
                        String zzf = zzf();
                        parcel2.writeNoException();
                        parcel2.writeString(zzf);
                    }
                } else {
                    boolean zzi = zzi();
                    parcel2.writeNoException();
                    int i3 = zzauo.zza;
                    parcel2.writeInt(zzi ? 1 : 0);
                }
            } else {
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
            }
        } else {
            zzl zzlVar2 = (zzl) zzauo.zza(parcel, zzl.CREATOR);
            zzauo.zzc(parcel);
            zzg(zzlVar2);
            parcel2.writeNoException();
        }
        return true;
    }
}
