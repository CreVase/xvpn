package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdkk implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;
    private final zzhbp zzf;
    private final zzhbp zzg;
    private final zzhbp zzh;
    private final zzhbp zzi;

    public zzdkk(zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3, zzhbp zzhbpVar4, zzhbp zzhbpVar5, zzhbp zzhbpVar6, zzhbp zzhbpVar7, zzhbp zzhbpVar8, zzhbp zzhbpVar9) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
        this.zzc = zzhbpVar3;
        this.zzd = zzhbpVar4;
        this.zze = zzhbpVar5;
        this.zzf = zzhbpVar6;
        this.zzg = zzhbpVar7;
        this.zzh = zzhbpVar8;
        this.zzi = zzhbpVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdkj zzb() {
        com.google.android.gms.ads.internal.util.zzg zzb = ((zzcia) this.zza).zzb();
        zzfdn zza = ((zzcxc) this.zzb).zza();
        zzdjo zzdjoVar = (zzdjo) this.zzc.zzb();
        zzdjj zza2 = ((zzdkc) this.zzd).zza();
        zzdkv zzdkvVar = (zzdkv) this.zze.zzb();
        zzdld zzdldVar = (zzdld) this.zzf.zzb();
        Executor executor = (Executor) this.zzg.zzb();
        zzgad zzgadVar = zzcbg.zza;
        zzhbk.zzb(zzgadVar);
        return new zzdkj(zzb, zza, zzdjoVar, zza2, zzdkvVar, zzdldVar, executor, zzgadVar, (zzdjg) this.zzi.zzb());
    }
}
