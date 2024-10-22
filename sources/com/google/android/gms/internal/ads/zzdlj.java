package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdlj implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;

    public zzdlj(zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3, zzhbp zzhbpVar4) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
        this.zzc = zzhbpVar3;
        this.zzd = zzhbpVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdjj zza = ((zzdkc) this.zza).zza();
        zzdjo zzb = ((zzdil) this.zzb).zzb();
        Executor executor = (Executor) this.zzc.zzb();
        zzgad zzgadVar = zzcbg.zza;
        zzhbk.zzb(zzgadVar);
        return new zzdli(zza, zzb, executor, zzgadVar);
    }
}
