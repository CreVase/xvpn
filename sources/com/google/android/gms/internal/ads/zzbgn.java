package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbgn extends zzaum implements zzbgp {
    public zzbgn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgp
    public final void zze(zzbgf zzbgfVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbgfVar);
        zzbh(1, zza);
    }
}
