package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzckm implements zzezg {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzq zzb;
    private final String zzc;
    private final zzcjs zzd;
    private final zzckm zze = this;
    private final zzhbp zzf;
    private final zzhbp zzg;
    private final zzhbp zzh;
    private final zzhbp zzi;
    private final zzhbp zzj;
    private final zzhbp zzk;

    public /* synthetic */ zzckm(zzcjs zzcjsVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzckl zzcklVar) {
        zzhbp zzhbpVar;
        zzhbp zzhbpVar2;
        zzhbp zzhbpVar3;
        this.zzd = zzcjsVar;
        this.zza = context;
        this.zzb = zzqVar;
        this.zzc = str;
        zzhbc zza = zzhbd.zza(context);
        this.zzf = zza;
        zzhbc zza2 = zzhbd.zza(zzqVar);
        this.zzg = zza2;
        zzhbpVar = zzcjsVar.zzn;
        zzhbp zzc = zzhbb.zzc(new zzeml(zzhbpVar));
        this.zzh = zzc;
        zzhbp zzc2 = zzhbb.zzc(zzemq.zza());
        this.zzi = zzc2;
        zzhbp zzc3 = zzhbb.zzc(zzdcj.zza());
        this.zzj = zzc3;
        zzhbpVar2 = zzcjsVar.zzo;
        zzhbpVar3 = zzcjsVar.zzU;
        this.zzk = zzhbb.zzc(new zzeze(zza, zzhbpVar2, zza2, zzhbpVar3, zzc, zzc2, zzfdp.zza(), zzc3));
    }

    @Override // com.google.android.gms.internal.ads.zzezg
    public final zzelq zza() {
        zzchz zzchzVar;
        zzhbp zzhbpVar;
        zzezd zzezdVar = (zzezd) this.zzk.zzb();
        zzemk zzemkVar = (zzemk) this.zzh.zzb();
        zzchzVar = this.zzd.zza;
        zzcaz zzd = zzchzVar.zzd();
        zzhbk.zzb(zzd);
        zzhbpVar = this.zzd.zzZ;
        return new zzelq(this.zza, this.zzb, this.zzc, zzezdVar, zzemkVar, zzd, (zzdso) zzhbpVar.zzb());
    }
}
