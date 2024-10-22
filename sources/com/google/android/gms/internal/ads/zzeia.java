package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzeia implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;

    public zzeia(zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3, zzhbp zzhbpVar4, zzhbp zzhbpVar5) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
        this.zzc = zzhbpVar3;
        this.zzd = zzhbpVar4;
        this.zze = zzhbpVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzehy zzb() {
        zzgad zzgadVar = zzcbg.zza;
        zzhbk.zzb(zzgadVar);
        return new zzehy(zzgadVar, (ScheduledExecutorService) this.zzb.zzb(), (zzcta) this.zzc.zzb(), (zzeio) this.zzd.zzb(), (zzfjt) this.zze.zzb());
    }
}
