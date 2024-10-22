package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzclo implements zzfcl {
    private final zzcjs zza;
    private final zzclo zzb = this;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;
    private final zzhbp zzf;
    private final zzhbp zzg;
    private final zzhbp zzh;
    private final zzhbp zzi;
    private final zzhbp zzj;

    public /* synthetic */ zzclo(zzcjs zzcjsVar, Context context, String str, zzcln zzclnVar) {
        zzhbp zzhbpVar;
        zzhbp zzhbpVar2;
        zzhbp zzhbpVar3;
        zzhbp zzhbpVar4;
        zzhbp zzhbpVar5;
        zzhbp zzhbpVar6;
        zzhbp zzhbpVar7;
        zzhbp zzhbpVar8;
        this.zza = zzcjsVar;
        zzhbc zza = zzhbd.zza(context);
        this.zzc = zza;
        zzhbpVar = zzcjsVar.zzaG;
        zzhbpVar2 = zzcjsVar.zzaH;
        zzfal zzfalVar = new zzfal(zza, zzhbpVar, zzhbpVar2);
        this.zzd = zzfalVar;
        zzhbpVar3 = zzcjsVar.zzaG;
        zzhbp zzc = zzhbb.zzc(new zzfbv(zzhbpVar3));
        this.zze = zzc;
        zzhbp zzc2 = zzhbb.zzc(zzfdk.zza());
        this.zzf = zzc2;
        zzhbpVar4 = zzcjsVar.zzo;
        zzhbpVar5 = zzcjsVar.zzU;
        zzhbp zzc3 = zzhbb.zzc(new zzfcf(zza, zzhbpVar4, zzhbpVar5, zzfalVar, zzc, zzfdp.zza(), zzc2));
        this.zzg = zzc3;
        this.zzh = zzhbb.zzc(new zzfcp(zzc3, zzc, zzc2));
        zzhbc zzc4 = zzhbd.zzc(str);
        this.zzi = zzc4;
        zzhbpVar6 = zzcjsVar.zzh;
        zzhbpVar7 = zzcjsVar.zzV;
        zzhbpVar8 = zzcjsVar.zzZ;
        this.zzj = zzhbb.zzc(new zzfcj(zzc4, zzc3, zza, zzc, zzc2, zzhbpVar6, zzhbpVar7, zzhbpVar8));
    }

    @Override // com.google.android.gms.internal.ads.zzfcl
    public final zzfci zza() {
        return (zzfci) this.zzj.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfcl
    public final zzfco zzb() {
        return (zzfco) this.zzh.zzb();
    }
}
