package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzcjw implements zzcqi {
    private final zzcjs zza;
    private zzfam zzb;
    private zzezp zzc;
    private zzddc zzd;
    private zzcwv zze;

    public /* synthetic */ zzcjw(zzcjs zzcjsVar, zzcjv zzcjvVar) {
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

    @Override // com.google.android.gms.internal.ads.zzcqi
    public final /* synthetic */ zzcqi zzc(zzddc zzddcVar) {
        this.zzd = zzddcVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcqi
    public final /* synthetic */ zzcqi zzd(zzcwv zzcwvVar) {
        this.zze = zzcwvVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcwr
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzcqj zzh() {
        zzhbk.zzc(this.zzd, zzddc.class);
        zzhbk.zzc(this.zze, zzcwv.class);
        return new zzcjy(this.zza, new zzcug(), new zzfes(), new zzcwb(), new zzdtc(), this.zzd, this.zze, zzeiy.zza(), null, this.zzb, this.zzc, null);
    }
}
