package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class zzjd implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zziq zzb;

    public zzjd(zziq zziqVar, long j) {
        this.zzb = zziqVar;
        this.zza = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzk().zzf.zza(this.zza);
        this.zzb.zzj().zzc().zza("Session timeout duration set", Long.valueOf(this.zza));
    }
}
