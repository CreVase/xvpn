package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfdw implements zzfzp {
    final /* synthetic */ zzfdx zza;
    final /* synthetic */ int zzb;

    public zzfdw(zzfdx zzfdxVar, int i) {
        this.zza = zzfdxVar;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        int i = this.zzb;
        this.zza.zzb((String) obj, i);
    }
}
