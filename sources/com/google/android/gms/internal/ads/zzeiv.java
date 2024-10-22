package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzeiv implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;
    private final zzhbp zzf;
    private final zzhbp zzg;
    private final zzhbp zzh;
    private final zzhbp zzi;
    private final zzhbp zzj;
    private final zzhbp zzk;
    private final zzhbp zzl;

    public zzeiv(zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3, zzhbp zzhbpVar4, zzhbp zzhbpVar5, zzhbp zzhbpVar6, zzhbp zzhbpVar7, zzhbp zzhbpVar8, zzhbp zzhbpVar9, zzhbp zzhbpVar10, zzhbp zzhbpVar11, zzhbp zzhbpVar12) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
        this.zzc = zzhbpVar3;
        this.zzd = zzhbpVar4;
        this.zze = zzhbpVar5;
        this.zzf = zzhbpVar6;
        this.zzg = zzhbpVar7;
        this.zzh = zzhbpVar8;
        this.zzi = zzhbpVar9;
        this.zzj = zzhbpVar10;
        this.zzk = zzhbpVar11;
        this.zzl = zzhbpVar12;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeiu zzb() {
        Context zza = ((zzcic) this.zza).zza();
        zzfhr zzfhrVar = (zzfhr) this.zzb.zzb();
        zzeio zzeioVar = (zzeio) this.zzc.zzb();
        zzcxn zzcxnVar = (zzcxn) this.zzd.zzb();
        zzfjt zzfjtVar = (zzfjt) this.zze.zzb();
        zzfjx zzfjxVar = (zzfjx) this.zzf.zzb();
        zzcta zzctaVar = (zzcta) this.zzg.zzb();
        zzgad zzgadVar = zzcbg.zza;
        zzhbk.zzb(zzgadVar);
        return new zzeiu(zza, zzfhrVar, zzeioVar, zzcxnVar, zzfjtVar, zzfjxVar, zzctaVar, zzgadVar, (ScheduledExecutorService) this.zzi.zzb(), (zzeez) this.zzj.zzb(), (zzfje) this.zzk.zzb(), ((zzeia) this.zzl).zzb());
    }
}
