package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes.dex */
public abstract class zzfym extends AbstractExecutorService implements zzgad {
    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return zzgas.zze(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (ml1) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzgad
    public final ml1 zza(Runnable runnable) {
        return (ml1) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzgad
    public final ml1 zzb(Callable callable) {
        return (ml1) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new zzgas(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (ml1) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (ml1) super.submit(callable);
    }
}
