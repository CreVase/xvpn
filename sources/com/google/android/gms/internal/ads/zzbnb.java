package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbnb implements zzcbp {
    final /* synthetic */ zzbnl zza;
    final /* synthetic */ zzfit zzb;
    final /* synthetic */ zzbnm zzc;

    public zzbnb(zzbnm zzbnmVar, zzbnl zzbnlVar, zzfit zzfitVar) {
        this.zzc = zzbnmVar;
        this.zza = zzbnlVar;
        this.zzb = zzfitVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Object obj2;
        zzbnl zzbnlVar;
        zzfjh zzfjhVar;
        zzfjh zzfjhVar2;
        zzbnl zzbnlVar2;
        zzbnl zzbnlVar3;
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            this.zzc.zzi = 0;
            zzbnm zzbnmVar = this.zzc;
            zzbnlVar = zzbnmVar.zzh;
            if (zzbnlVar != null) {
                zzbnl zzbnlVar4 = this.zza;
                zzbnlVar2 = zzbnmVar.zzh;
                if (zzbnlVar4 != zzbnlVar2) {
                    com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                    zzbnlVar3 = this.zzc.zzh;
                    zzbnlVar3.zzb();
                }
            }
            this.zzc.zzh = this.zza;
            if (((Boolean) zzbdu.zzd.zze()).booleanValue()) {
                zzbnm zzbnmVar2 = this.zzc;
                zzfjhVar = zzbnmVar2.zze;
                if (zzfjhVar != null) {
                    zzfjhVar2 = zzbnmVar2.zze;
                    zzfit zzfitVar = this.zzb;
                    zzfitVar.zzf(true);
                    zzfjhVar2.zzb(zzfitVar.zzl());
                }
            }
        }
    }
}
