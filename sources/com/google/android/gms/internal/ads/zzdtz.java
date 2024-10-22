package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdtz extends com.google.android.gms.ads.internal.client.zzbg {
    final /* synthetic */ zzdtt zza;
    final /* synthetic */ zzdua zzb;

    public zzdtz(zzdua zzduaVar, zzdtt zzdttVar) {
        this.zzb = zzduaVar;
        this.zza = zzdttVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc() throws RemoteException {
        long j;
        zzdua zzduaVar = this.zzb;
        zzdtt zzdttVar = this.zza;
        j = zzduaVar.zza;
        zzdttVar.zzb(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd() throws RemoteException {
        long j;
        zzdua zzduaVar = this.zzb;
        zzdtt zzdttVar = this.zza;
        j = zzduaVar.zza;
        zzdttVar.zzc(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze(int i) throws RemoteException {
        long j;
        zzdua zzduaVar = this.zzb;
        zzdtt zzdttVar = this.zza;
        j = zzduaVar.zza;
        zzdttVar.zzd(j, i);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        long j;
        zzdua zzduaVar = this.zzb;
        zzdtt zzdttVar = this.zza;
        j = zzduaVar.zza;
        zzdttVar.zzd(j, zzeVar.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() throws RemoteException {
        long j;
        zzdua zzduaVar = this.zzb;
        zzdtt zzdttVar = this.zza;
        j = zzduaVar.zza;
        zzdttVar.zze(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() throws RemoteException {
        long j;
        zzdua zzduaVar = this.zzb;
        zzdtt zzdttVar = this.zza;
        j = zzduaVar.zza;
        zzdttVar.zzg(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzk() {
    }
}
