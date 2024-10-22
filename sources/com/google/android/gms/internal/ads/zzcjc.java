package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzcjc implements zzdhs {
    private final zzcjs zza;
    private zzfam zzb;
    private zzezp zzc;
    private zzddc zzd;
    private zzcwv zze;
    private zzdho zzf;
    private zzcqs zzg;

    public /* synthetic */ zzcjc(zzcjs zzcjsVar, zzcjb zzcjbVar) {
        this.zza = zzcjsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwr
    public final /* synthetic */ zzcwr zza(zzezp zzezpVar) {
        this.zzc = zzezpVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcwr
    public final /* synthetic */ zzcwr zzb(zzfam zzfamVar) {
        this.zzb = zzfamVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdhs
    public final /* synthetic */ zzdhs zzc(zzcqs zzcqsVar) {
        this.zzg = zzcqsVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdhs
    public final /* synthetic */ zzdhs zzd(zzdho zzdhoVar) {
        this.zzf = zzdhoVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdhs
    public final /* synthetic */ zzdhs zze(zzddc zzddcVar) {
        this.zzd = zzddcVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdhs
    public final /* synthetic */ zzdhs zzf(zzcwv zzcwvVar) {
        this.zze = zzcwvVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcwr
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzdht zzh() {
        zzhbk.zzc(this.zzd, zzddc.class);
        zzhbk.zzc(this.zze, zzcwv.class);
        zzhbk.zzc(this.zzf, zzdho.class);
        zzhbk.zzc(this.zzg, zzcqs.class);
        return new zzcje(this.zza, this.zzg, this.zzf, new zzcug(), new zzfes(), new zzcwb(), new zzdtc(), this.zzd, this.zze, zzeiy.zza(), null, this.zzb, this.zzc, null);
    }
}
