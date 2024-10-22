package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaum;
import com.google.android.gms.internal.ads.zzauo;
import com.google.android.gms.internal.ads.zzbox;

/* loaded from: classes.dex */
public final class zzdk extends zzaum {
    public zzdk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    public final zzdj zze(IObjectWrapper iObjectWrapper, zzbox zzboxVar, int i) throws RemoteException {
        zzdj zzdhVar;
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzboxVar);
        zza.writeInt(233702000);
        Parcel zzbg = zzbg(1, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzdhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            if (queryLocalInterface instanceof zzdj) {
                zzdhVar = (zzdj) queryLocalInterface;
            } else {
                zzdhVar = new zzdh(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzdhVar;
    }
}
