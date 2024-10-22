package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzare implements zzfnt {
    final /* synthetic */ zzfmq zza;

    public zzare(zzfmq zzfmqVar) {
        this.zza = zzfmqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfnt
    public final void zza(int i, long j) {
        this.zza.zzd(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfnt
    public final void zzb(int i, long j, String str) {
        this.zza.zze(i, System.currentTimeMillis() - j, str);
    }
}
