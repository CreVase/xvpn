package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaun;
import com.google.android.gms.internal.ads.zzauo;

/* loaded from: classes.dex */
public abstract class zzds extends zzaun implements zzdt {
    public zzds() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
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
                        boolean zzg = zzauo.zzg(parcel);
                        zzauo.zzc(parcel);
                        zzf(zzg);
                    } else {
                        zze();
                    }
                } else {
                    zzg();
                }
            } else {
                zzh();
            }
        } else {
            zzi();
        }
        parcel2.writeNoException();
        return true;
    }
}
