package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfjc implements zzfzp {
    final /* synthetic */ zzfje zza;
    final /* synthetic */ zzfit zzb;

    public zzfjc(zzfje zzfjeVar, zzfit zzfitVar) {
        this.zza = zzfjeVar;
        this.zzb = zzfitVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zza(Throwable th) {
        zzfit zzfitVar = this.zzb;
        zzfitVar.zzg(th);
        zzfitVar.zzf(false);
        this.zza.zza(zzfitVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zzb(Object obj) {
    }
}
