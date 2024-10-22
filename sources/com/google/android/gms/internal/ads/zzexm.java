package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzexm implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;
    private final zzhbp zzf;
    private final zzhbp zzg;

    public zzexm(zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3, zzhbp zzhbpVar4, zzhbp zzhbpVar5, zzhbp zzhbpVar6, zzhbp zzhbpVar7) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
        this.zzc = zzhbpVar3;
        this.zzd = zzhbpVar4;
        this.zze = zzhbpVar5;
        this.zzf = zzhbpVar6;
        this.zzg = zzhbpVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcac zzcacVar = (zzcac) this.zza.zzb();
        boolean booleanValue = ((zzexa) this.zzb).zzb().booleanValue();
        boolean booleanValue2 = ((zzexb) this.zzc).zzb().booleanValue();
        zzbzr zzbzrVar = new zzbzr();
        zzgad zzgadVar = zzcbg.zza;
        zzhbk.zzb(zzgadVar);
        return new zzexk(zzcacVar, booleanValue, booleanValue2, zzbzrVar, zzgadVar, ((zzewx) this.zzf).zza(), (ScheduledExecutorService) this.zzg.zzb());
    }
}
