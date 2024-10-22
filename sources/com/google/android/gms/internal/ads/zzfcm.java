package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzfcm implements zzemz {
    final /* synthetic */ zzfco zza;

    public zzfcm(zzfco zzfcoVar) {
        this.zza = zzfcoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemz
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzd = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemz
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdox zzdoxVar;
        zzfdf zzfdfVar;
        synchronized (this.zza) {
            this.zza.zzd = (zzdox) obj;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdn)).booleanValue()) {
                zzfdg zzd = ((zzdox) obj).zzd();
                zzfdfVar = this.zza.zzc;
                zzd.zza = zzfdfVar;
            }
            zzdoxVar = this.zza.zzd;
            zzdoxVar.zzj();
        }
    }
}
