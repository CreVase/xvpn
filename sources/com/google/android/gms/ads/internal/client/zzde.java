package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaum;
import com.google.android.gms.internal.ads.zzauo;

/* loaded from: classes.dex */
public final class zzde extends zzaum implements zzdg {
    public zzde(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final void zze(zzs zzsVar) throws RemoteException {
        Parcel zza = zza();
        zzauo.zzd(zza, zzsVar);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final boolean zzf() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }
}
