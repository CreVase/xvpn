package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzji implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ boolean zzb;
    private final /* synthetic */ zziq zzc;

    public zzji(zziq zziqVar, AtomicReference atomicReference, boolean z) {
        this.zzc = zziqVar;
        this.zza = atomicReference;
        this.zzb = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzo().zza(this.zza, this.zzb);
    }
}
