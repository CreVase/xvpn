package com.google.android.gms.internal.ads;

import defpackage.ml1;

/* loaded from: classes.dex */
public final class zzezx implements zzfai {
    private zzcws zza;

    @Override // com.google.android.gms.internal.ads.zzfai
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcws zzd() {
        return this.zza;
    }

    public final synchronized ml1 zzb(zzfaj zzfajVar, zzfah zzfahVar, zzcws zzcwsVar) {
        zzcue zzb;
        if (zzcwsVar != null) {
            this.zza = zzcwsVar;
        } else {
            this.zza = (zzcws) zzfahVar.zza(zzfajVar.zzb).zzh();
        }
        zzb = this.zza.zzb();
        return zzb.zzi(zzb.zzj());
    }

    @Override // com.google.android.gms.internal.ads.zzfai
    public final /* bridge */ /* synthetic */ ml1 zzc(zzfaj zzfajVar, zzfah zzfahVar, Object obj) {
        return zzb(zzfajVar, zzfahVar, null);
    }
}
