package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzcku implements zzdtp {
    private final zzcjs zza;
    private final zzcla zzb;
    private Long zzc;
    private String zzd;

    public /* synthetic */ zzcku(zzcjs zzcjsVar, zzcla zzclaVar, zzckt zzcktVar) {
        this.zza = zzcjsVar;
        this.zzb = zzclaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtp
    public final /* synthetic */ zzdtp zza(String str) {
        str.getClass();
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdtp
    public final /* bridge */ /* synthetic */ zzdtp zzb(long j) {
        this.zzc = Long.valueOf(j);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdtp
    public final zzdtq zzc() {
        zzhbk.zzc(this.zzc, Long.class);
        zzhbk.zzc(this.zzd, String.class);
        return new zzckw(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
