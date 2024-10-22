package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class zzi implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzcv zza;
    private final /* synthetic */ AppMeasurementDynamiteService zzb;

    public zzi(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcv zzcvVar) {
        this.zzb = appMeasurementDynamiteService;
        this.zza = zzcvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzr().zza(this.zza);
    }
}
