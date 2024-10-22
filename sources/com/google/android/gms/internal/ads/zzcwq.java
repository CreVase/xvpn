package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* loaded from: classes.dex */
public final class zzcwq implements zzhbc {
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

    public zzcwq(zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3, zzhbp zzhbpVar4, zzhbp zzhbpVar5, zzhbp zzhbpVar6, zzhbp zzhbpVar7, zzhbp zzhbpVar8, zzhbp zzhbpVar9, zzhbp zzhbpVar10, zzhbp zzhbpVar11, zzhbp zzhbpVar12) {
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
    public final zzcwp zzb() {
        zzfhr zzfhrVar = (zzfhr) this.zza.zzb();
        zzcaz zza = ((zzcio) this.zzb).zza();
        ApplicationInfo zzb = ((zzdwy) this.zzc).zzb();
        String zzb2 = ((zzdxd) this.zzd).zzb();
        zzbca zzbcaVar = zzbci.zza;
        return new zzcwp(zzfhrVar, zza, zzb, zzb2, com.google.android.gms.ads.internal.client.zzba.zza().zza(), (PackageInfo) this.zzf.zzb(), zzhbb.zza(this.zzg), ((zzcia) this.zzh).zzb(), (String) this.zzi.zzb(), ((zzeua) this.zzj).zzb(), ((zzcxc) this.zzk).zza(), (zzdcu) this.zzl.zzb());
    }
}
