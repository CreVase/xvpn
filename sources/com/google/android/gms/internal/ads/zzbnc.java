package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbnc implements zzcbn {
    final /* synthetic */ zzbnl zza;
    final /* synthetic */ zzfit zzb;
    final /* synthetic */ zzbnm zzc;

    public zzbnc(zzbnm zzbnmVar, zzbnl zzbnlVar, zzfit zzfitVar) {
        this.zzc = zzbnmVar;
        this.zza = zzbnlVar;
        this.zzb = zzfitVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbn
    public final void zza() {
        Object obj;
        zzfjh zzfjhVar;
        zzfjh zzfjhVar2;
        obj = this.zzc.zza;
        synchronized (obj) {
            this.zzc.zzi = 1;
            com.google.android.gms.ads.internal.util.zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzb();
            if (((Boolean) zzbdu.zzd.zze()).booleanValue()) {
                zzbnm zzbnmVar = this.zzc;
                zzfjhVar = zzbnmVar.zze;
                if (zzfjhVar != null) {
                    zzfjhVar2 = zzbnmVar.zze;
                    zzfit zzfitVar = this.zzb;
                    zzfitVar.zzc("Failed loading new engine");
                    zzfitVar.zzf(false);
                    zzfjhVar2.zzb(zzfitVar.zzl());
                }
            }
        }
    }
}
