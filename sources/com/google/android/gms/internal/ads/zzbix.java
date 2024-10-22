package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzbix implements zzfzp {
    final /* synthetic */ zzcgb zza;

    public zzbix(zzcgb zzcgbVar) {
        this.zza = zzcgbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcgb zzcgbVar = this.zza;
        new com.google.android.gms.ads.internal.util.zzca(zzcgbVar.getContext(), zzcgbVar.zzn().zza, (String) obj).zzb();
    }
}
