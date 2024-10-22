package com.google.android.gms.measurement.internal;

import defpackage.z41;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjc implements z41 {
    private final /* synthetic */ zzmh zza;
    private final /* synthetic */ zziq zzb;

    public zzjc(zziq zziqVar, zzmh zzmhVar) {
        this.zzb = zziqVar;
        this.zza = zzmhVar;
    }

    @Override // defpackage.z41
    public final void onFailure(Throwable th) {
        this.zzb.zzt();
        this.zzb.zzh = false;
        this.zzb.zzan();
        this.zzb.zzj().zzg().zza("registerTriggerAsync failed with throwable", th);
    }

    @Override // defpackage.z41
    public final void onSuccess(Object obj) {
        this.zzb.zzt();
        this.zzb.zzh = false;
        this.zzb.zzan();
        this.zzb.zzj().zzc().zza("registerTriggerAsync ran. uri", this.zza.zza);
    }
}
