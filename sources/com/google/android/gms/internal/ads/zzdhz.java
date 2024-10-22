package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdhz implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;
    private final zzhbp zzf;

    public zzdhz(zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3, zzhbp zzhbpVar4, zzhbp zzhbpVar5, zzhbp zzhbpVar6) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
        this.zzc = zzhbpVar3;
        this.zzd = zzhbpVar4;
        this.zze = zzhbpVar5;
        this.zzf = zzhbpVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzchw zzchwVar = (zzchw) this.zza.zzb();
        zzcwt zza = ((zzcxd) this.zzb).zza();
        zzddc zza2 = ((zzddv) this.zzc).zza();
        zzdho zza3 = ((zzdhq) this.zzd).zza();
        zzdaa zzb = ((zzcqu) this.zze).zzb();
        zzeio zzeioVar = (zzeio) this.zzf.zzb();
        zzcrr zze = zzchwVar.zze();
        zze.zzi(zza.zzj());
        zze.zzf(zza2);
        zze.zzd(zza3);
        zze.zze(new zzekt(null));
        zze.zzg(new zzcsp(zzb, null));
        zze.zzc(new zzcqs(null));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzds)).booleanValue()) {
            zze.zzj(zzeiw.zzb(zzeioVar));
        }
        zzcta zzc = zze.zzh().zzc();
        zzhbk.zzb(zzc);
        return zzc;
    }
}
