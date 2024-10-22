package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzcy extends zzbx implements zzcv {
    public zzcy() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.zzbx
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            Bundle bundle = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
            zzbw.zzb(parcel);
            zza(bundle);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
