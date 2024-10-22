package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbgt extends zzaum implements zzbgv {
    public zzbgt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgv
    public final void zze(zzbgi zzbgiVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbgiVar);
        zzbh(1, zza);
    }
}
