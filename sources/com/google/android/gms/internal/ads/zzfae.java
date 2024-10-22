package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzfae {
    private final zzffa zza;
    private final zzcws zzb;
    private final Executor zzc;
    private zzfad zzd;

    public zzfae(zzffa zzffaVar, zzcws zzcwsVar, Executor executor) {
        this.zza = zzffaVar;
        this.zzb = zzcwsVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final zzffk zze() {
        zzfdn zzg = this.zzb.zzg();
        return this.zza.zzc(zzg.zzd, zzg.zzf, zzg.zzj);
    }

    public final ml1 zzc() {
        ml1 zze;
        zzfad zzfadVar = this.zzd;
        if (zzfadVar == null) {
            if (!((Boolean) zzbei.zza.zze()).booleanValue()) {
                zzfad zzfadVar2 = new zzfad(null, zze(), null);
                this.zzd = zzfadVar2;
                zze = zzfzt.zzh(zzfadVar2);
            } else {
                zze = zzfzt.zze(zzfzt.zzm(zzfzk.zzu(this.zzb.zzb().zze(this.zza.zza())), new zzfab(this), this.zzc), zzdyo.class, new zzfaa(this), this.zzc);
            }
            return zzfzt.zzm(zze, new zzfsk() { // from class: com.google.android.gms.internal.ads.zzezz
                @Override // com.google.android.gms.internal.ads.zzfsk
                public final Object apply(Object obj) {
                    return (zzfad) obj;
                }
            }, this.zzc);
        }
        return zzfzt.zzh(zzfadVar);
    }
}
