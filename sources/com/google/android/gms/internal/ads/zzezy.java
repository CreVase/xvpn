package com.google.android.gms.internal.ads;

import defpackage.ml1;

/* loaded from: classes.dex */
public final class zzezy implements zzfai {
    private final zzfai zza;
    private zzcws zzb;

    public zzezy(zzfai zzfaiVar) {
        this.zza = zzfaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfai
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcws zzd() {
        return this.zzb;
    }

    public final synchronized ml1 zzb(zzfaj zzfajVar, zzfah zzfahVar, zzcws zzcwsVar) {
        this.zzb = zzcwsVar;
        if (zzfajVar.zza != null) {
            zzcue zzb = zzcwsVar.zzb();
            return zzb.zzi(zzb.zzk(zzfzt.zzh(zzfajVar.zza)));
        }
        return ((zzezx) this.zza).zzb(zzfajVar, zzfahVar, zzcwsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfai
    public final /* bridge */ /* synthetic */ ml1 zzc(zzfaj zzfajVar, zzfah zzfahVar, Object obj) {
        return zzb(zzfajVar, zzfahVar, null);
    }
}
