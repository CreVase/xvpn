package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class zzbjq implements zzfzp {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zza zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbju zzd;

    public zzbjq(zzbju zzbjuVar, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, String str) {
        this.zzd = zzbjuVar;
        this.zza = zzaVar;
        this.zzb = map;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "OpenGmsgHandler.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zza;
        Map map = this.zzb;
        String str = this.zzc;
        this.zzd.zzh((String) obj, zzaVar, map, str);
    }
}
