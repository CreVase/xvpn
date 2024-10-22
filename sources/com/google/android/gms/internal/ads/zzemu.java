package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzemu implements zzemz {
    final /* synthetic */ zzemv zza;

    public zzemu(zzemv zzemvVar) {
        this.zza = zzemvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemz
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemz
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.zza) {
            this.zza.zzc = ((zzcsx) obj).zzl();
            ((zzcsx) obj).zzj();
        }
    }
}
