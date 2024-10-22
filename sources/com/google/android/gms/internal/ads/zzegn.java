package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzegn implements zzfzp {
    final /* synthetic */ zzego zza;

    public zzegn(zzego zzegoVar) {
        this.zza = zzegoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zza(Throwable th) {
        zzcrs zzcrsVar;
        zzcxn zzcxnVar;
        zzcrsVar = this.zza.zza;
        com.google.android.gms.ads.internal.client.zze zza = zzcrsVar.zzd().zza(th);
        zzcxnVar = this.zza.zzd;
        zzcxnVar.zzbF(zza);
        zzfei.zzb(zza.zza, th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final /* synthetic */ void zzb(Object obj) {
        ((zzcqv) obj).zzj();
    }
}
