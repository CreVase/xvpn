package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzckc implements zzexs {
    private final zzcjs zza;
    private final zzckc zzb = this;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;
    private final zzhbp zzf;
    private final zzhbp zzg;
    private final zzhbp zzh;

    public /* synthetic */ zzckc(zzcjs zzcjsVar, Context context, String str, zzckb zzckbVar) {
        zzhbp zzhbpVar;
        zzhbp zzhbpVar2;
        zzhbp zzhbpVar3;
        zzhbp zzhbpVar4;
        zzhbp zzhbpVar5;
        zzhbp zzhbpVar6;
        zzhbp zzhbpVar7;
        zzhbp zzhbpVar8;
        zzhbp zzhbpVar9;
        this.zza = zzcjsVar;
        zzhbc zza = zzhbd.zza(context);
        this.zzc = zza;
        zzhbc zza2 = zzhbd.zza(str);
        this.zzd = zza2;
        zzhbpVar = zzcjsVar.zzaG;
        zzhbpVar2 = zzcjsVar.zzaH;
        zzfak zzfakVar = new zzfak(zza, zzhbpVar, zzhbpVar2);
        this.zze = zzfakVar;
        zzhbpVar3 = zzcjsVar.zzaG;
        zzhbp zzc = zzhbb.zzc(new zzeyq(zzhbpVar3));
        this.zzf = zzc;
        zzhbpVar4 = zzcjsVar.zzo;
        zzhbpVar5 = zzcjsVar.zzU;
        zzfdp zza3 = zzfdp.zza();
        zzhbpVar6 = zzcjsVar.zzh;
        zzhbp zzc2 = zzhbb.zzc(new zzeys(zza, zzhbpVar4, zzhbpVar5, zzfakVar, zzc, zza3, zzhbpVar6));
        this.zzg = zzc2;
        zzhbpVar7 = zzcjsVar.zzU;
        zzhbpVar8 = zzcjsVar.zzh;
        zzhbpVar9 = zzcjsVar.zzZ;
        this.zzh = zzhbb.zzc(new zzeyy(zzhbpVar7, zza, zza2, zzc2, zzc, zzhbpVar8, zzhbpVar9));
    }

    @Override // com.google.android.gms.internal.ads.zzexs
    public final zzeyx zza() {
        return (zzeyx) this.zzh.zzb();
    }
}
