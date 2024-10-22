package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzckw implements zzdtq {
    private final Long zza;
    private final String zzb;
    private final zzcjs zzc;
    private final zzcla zzd;
    private final zzckw zze = this;

    public /* synthetic */ zzckw(zzcjs zzcjsVar, zzcla zzclaVar, Long l, String str, zzckv zzckvVar) {
        this.zzc = zzcjsVar;
        this.zzd = zzclaVar;
        this.zza = l;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdtq
    public final zzdua zza() {
        Context context;
        zzdtt zzc;
        zzcla zzclaVar = this.zzd;
        long longValue = this.zza.longValue();
        context = zzclaVar.zza;
        zzc = zzdtu.zzc(zzclaVar.zzb);
        return zzdub.zza(longValue, context, zzc, this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdtq
    public final zzdue zzb() {
        Context context;
        zzdtt zzc;
        zzcla zzclaVar = this.zzd;
        long longValue = this.zza.longValue();
        context = zzclaVar.zza;
        zzc = zzdtu.zzc(zzclaVar.zzb);
        return zzduf.zza(longValue, context, zzc, this.zzc, this.zzb);
    }
}
