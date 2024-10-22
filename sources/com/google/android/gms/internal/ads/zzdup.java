package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdup implements zzfzp {
    final /* synthetic */ zzdur zza;

    public zzdup(zzdur zzdurVar) {
        this.zza = zzdurVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zza(Throwable th) {
        long j;
        zzcbl zzcblVar;
        synchronized (this) {
            this.zza.zzc = true;
            zzdur zzdurVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
            j = this.zza.zzd;
            zzdurVar.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (elapsedRealtime - j));
            zzcblVar = this.zza.zze;
            zzcblVar.zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        long j;
        Executor executor;
        final String str = (String) obj;
        synchronized (this) {
            this.zza.zzc = true;
            zzdur zzdurVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
            j = this.zza.zzd;
            zzdurVar.zzv("com.google.android.gms.ads.MobileAds", true, "", (int) (elapsedRealtime - j));
            executor = this.zza.zzi;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduo
                @Override // java.lang.Runnable
                public final void run() {
                    zzdur.zzj(zzdup.this.zza, str);
                }
            });
        }
    }
}
