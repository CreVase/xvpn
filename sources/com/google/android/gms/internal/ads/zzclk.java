package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzclk implements zzfax {
    private final zzcjs zza;
    private final zzclk zzb = this;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;
    private final zzhbp zzf;
    private final zzhbp zzg;
    private final zzhbp zzh;
    private final zzhbp zzi;

    public /* synthetic */ zzclk(zzcjs zzcjsVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzclj zzcljVar) {
        zzhbp zzhbpVar;
        zzhbp zzhbpVar2;
        zzhbp zzhbpVar3;
        zzhbp zzhbpVar4;
        zzhbp zzhbpVar5;
        zzhbp zzhbpVar6;
        zzhbp zzhbpVar7;
        this.zza = zzcjsVar;
        zzhbc zza = zzhbd.zza(context);
        this.zzc = zza;
        zzhbc zza2 = zzhbd.zza(zzqVar);
        this.zzd = zza2;
        zzhbc zza3 = zzhbd.zza(str);
        this.zze = zza3;
        zzhbpVar = zzcjsVar.zzn;
        zzhbp zzc = zzhbb.zzc(new zzeml(zzhbpVar));
        this.zzf = zzc;
        zzhbpVar2 = zzcjsVar.zzaG;
        zzhbp zzc2 = zzhbb.zzc(new zzfbv(zzhbpVar2));
        this.zzg = zzc2;
        zzhbpVar3 = zzcjsVar.zzo;
        zzhbpVar4 = zzcjsVar.zzU;
        zzhbp zzc3 = zzhbb.zzc(new zzfav(zza, zzhbpVar3, zzhbpVar4, zzc, zzc2, zzfdp.zza()));
        this.zzh = zzc3;
        zzhbpVar5 = zzcjsVar.zzh;
        zzhbpVar6 = zzcjsVar.zzV;
        zzhbpVar7 = zzcjsVar.zzZ;
        this.zzi = zzhbb.zzc(new zzemt(zza, zza2, zza3, zzc3, zzc, zzc2, zzhbpVar5, zzhbpVar6, zzhbpVar7));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final zzems zza() {
        return (zzems) this.zzi.zzb();
    }
}
