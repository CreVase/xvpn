package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzcle implements zzdgw {
    private final zzcjs zza;
    private zzfam zzb;
    private zzezp zzc;
    private zzddc zzd;
    private zzcwv zze;
    private zzekt zzf;

    public /* synthetic */ zzcle(zzcjs zzcjsVar, zzcld zzcldVar) {
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

    @Override // com.google.android.gms.internal.ads.zzdgw
    public final /* synthetic */ zzdgw zzc(zzekt zzektVar) {
        this.zzf = zzektVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdgw
    public final /* synthetic */ zzdgw zzd(zzddc zzddcVar) {
        this.zzd = zzddcVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdgw
    public final /* synthetic */ zzdgw zze(zzcwv zzcwvVar) {
        this.zze = zzcwvVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcwr
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzdgx zzh() {
        zzhbk.zzc(this.zzd, zzddc.class);
        zzhbk.zzc(this.zze, zzcwv.class);
        zzhbk.zzc(this.zzf, zzekt.class);
        return new zzclg(this.zza, new zzcug(), new zzfes(), new zzcwb(), new zzdtc(), this.zzd, this.zze, zzeiy.zza(), this.zzf, null, this.zzb, this.zzc, null);
    }
}
