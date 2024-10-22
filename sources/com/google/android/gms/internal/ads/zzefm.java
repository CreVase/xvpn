package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class zzefm extends zzbqf {
    private final zzeex zza;

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final void zze(String str) throws RemoteException {
        ((zzegq) this.zza.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzegq) this.zza.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final void zzg() throws RemoteException {
        ((zzegq) this.zza.zzc).zzo();
    }
}
