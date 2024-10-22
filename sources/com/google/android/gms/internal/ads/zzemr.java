package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzemr implements zzemz {
    final /* synthetic */ zzems zza;

    public zzemr(zzems zzemsVar) {
        this.zza = zzemsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemz
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzj = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemz
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdfw zzdfwVar;
        zzdfw zzdfwVar2 = (zzdfw) obj;
        synchronized (this.zza) {
            this.zza.zzj = zzdfwVar2;
            zzdfwVar = this.zza.zzj;
            zzdfwVar.zzj();
        }
    }
}
