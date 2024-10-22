package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbgk extends zzaum implements zzbgm {
    public zzbgk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgm
    public final void zze(zzbgd zzbgdVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbgdVar);
        zzbh(1, zza);
    }
}
