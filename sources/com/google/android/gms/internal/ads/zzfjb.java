package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfjb implements zzfzp {
    final /* synthetic */ zzfje zza;
    final /* synthetic */ zzfit zzb;
    final /* synthetic */ boolean zzc;

    public zzfjb(zzfje zzfjeVar, zzfit zzfitVar, boolean z) {
        this.zza = zzfjeVar;
        this.zzb = zzfitVar;
        this.zzc = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zza(Throwable th) {
        zzfit zzfitVar = this.zzb;
        if (zzfitVar.zzj()) {
            zzfje zzfjeVar = this.zza;
            zzfitVar.zzg(th);
            zzfitVar.zzf(false);
            zzfjeVar.zza(zzfitVar);
            if (this.zzc) {
                this.zza.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zzb(Object obj) {
        zzfit zzfitVar = this.zzb;
        zzfitVar.zzf(true);
        this.zza.zza(zzfitVar);
        if (this.zzc) {
            this.zza.zzg();
        }
    }
}
