package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class zzjk implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zziq zzb;

    public zzjk(zziq zziqVar, long j) {
        this.zzb = zziqVar;
        this.zza = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza(this.zza, true);
        this.zzb.zzo().zza(new AtomicReference<>());
    }
}
