package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class zzduc extends zzbwv {
    final /* synthetic */ zzdue zza;

    public zzduc(zzdue zzdueVar) {
        this.zza = zzdueVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zze(int i) throws RemoteException {
        zzdtt zzdttVar;
        long j;
        zzdue zzdueVar = this.zza;
        zzdttVar = zzdueVar.zzb;
        j = zzdueVar.zza;
        zzdttVar.zzm(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdtt zzdttVar;
        long j;
        zzdue zzdueVar = this.zza;
        zzdttVar = zzdueVar.zzb;
        j = zzdueVar.zza;
        zzdttVar.zzm(j, zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzg() throws RemoteException {
        zzdtt zzdttVar;
        long j;
        zzdue zzdueVar = this.zza;
        zzdttVar = zzdueVar.zzb;
        j = zzdueVar.zza;
        zzdttVar.zzp(j);
    }
}
