package com.google.android.gms.measurement.internal;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zziz implements Executor {
    private final /* synthetic */ zziq zza;

    public zziz(zziq zziqVar) {
        this.zza = zziqVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.zzl().zzb(runnable);
    }
}
