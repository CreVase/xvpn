package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class zzn implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzcv zza;
    private final /* synthetic */ AppMeasurementDynamiteService zzb;

    public zzn(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcv zzcvVar) {
        this.zzb = appMeasurementDynamiteService;
        this.zza = zzcvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzt().zza(this.zza, this.zzb.zza.zzab());
    }
}
