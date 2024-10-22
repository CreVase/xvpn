package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class zzebe implements zzfzp {
    final /* synthetic */ zzbuz zza;

    public zzebe(zzebf zzebfVar, zzbuz zzbuzVar) {
        this.zza = zzbuzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zza(Throwable th) {
        try {
            this.zza.zze(com.google.android.gms.ads.internal.util.zzbb.zzb(th));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Ad service can't call client", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zzf((ParcelFileDescriptor) obj);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Ad service can't call client", e);
        }
    }
}
