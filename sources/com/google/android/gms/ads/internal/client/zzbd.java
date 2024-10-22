package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaun;

/* loaded from: classes.dex */
public abstract class zzbd extends zzaun implements zzbe {
    public zzbd() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final boolean zzbJ(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzb();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
