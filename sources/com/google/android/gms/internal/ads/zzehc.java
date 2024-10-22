package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzehc implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;

    public zzehc(zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3, zzhbp zzhbpVar4) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
        this.zzc = zzhbpVar3;
        this.zzd = zzhbpVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context context = (Context) this.zza.zzb();
        zzcaz zza = ((zzcio) this.zzb).zza();
        zzdgx zzdgxVar = (zzdgx) this.zzc.zzb();
        zzgad zzgadVar = zzcbg.zza;
        zzhbk.zzb(zzgadVar);
        return new zzehb(context, zza, zzdgxVar, zzgadVar);
    }
}
