package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class zzeht extends zzbqo {
    final /* synthetic */ zzehu zza;
    private final zzeex zzb;

    public /* synthetic */ zzeht(zzehu zzehuVar, zzeex zzeexVar, zzehs zzehsVar) {
        this.zza = zzehuVar;
        this.zzb = zzeexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqp
    public final void zze(String str) throws RemoteException {
        ((zzegq) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqp
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzegq) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbqp
    public final void zzg(zzbpm zzbpmVar) throws RemoteException {
        zzehu.zzc(this.zza, zzbpmVar);
        ((zzegq) this.zzb.zzc).zzo();
    }
}
