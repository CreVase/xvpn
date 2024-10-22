package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfch implements zzemz {
    final /* synthetic */ zzfci zza;

    public zzfch(zzfci zzfciVar) {
        this.zza = zzfciVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemz
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemz
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdox zzdoxVar;
        zzfdf zzfdfVar;
        synchronized (this.zza) {
            this.zza.zzi = (zzdox) obj;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdn)).booleanValue()) {
                zzfdg zzd = ((zzdox) obj).zzd();
                zzfdfVar = this.zza.zzd;
                zzd.zza = zzfdfVar;
            }
            zzdoxVar = this.zza.zzi;
            zzdoxVar.zzj();
        }
    }
}
