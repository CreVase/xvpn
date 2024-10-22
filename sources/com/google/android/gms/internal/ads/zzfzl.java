package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final class zzfzl extends zzfzk {
    private final ml1 zza;

    public zzfzl(ml1 ml1Var) {
        ml1Var.getClass();
        this.zza = ml1Var;
    }

    @Override // com.google.android.gms.internal.ads.zzfyh, defpackage.ml1
    public final void addListener(Runnable runnable, Executor executor) {
        this.zza.addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfyh, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.zza.cancel(z);
    }

    @Override // com.google.android.gms.internal.ads.zzfyh, java.util.concurrent.Future
    public final Object get() throws InterruptedException, ExecutionException {
        return this.zza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzfyh, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzfyh, java.util.concurrent.Future
    public final boolean isDone() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzfyh
    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfyh, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.zza.get(j, timeUnit);
    }
}
