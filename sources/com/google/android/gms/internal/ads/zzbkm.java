package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class zzbkm extends zzaun implements zzbkn {
    public static zzbkn zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
        if (queryLocalInterface instanceof zzbkn) {
            return (zzbkn) queryLocalInterface;
        }
        return new zzbkl(iBinder);
    }
}
