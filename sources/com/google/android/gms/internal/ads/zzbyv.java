package com.google.android.gms.internal.ads;

import defpackage.hx2;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbyv implements ThreadFactory {
    private final AtomicInteger zza = new AtomicInteger(1);

    public zzbyv(zzbyy zzbyyVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, hx2.m("AdWorker(SCION_TASK_EXECUTOR) #", this.zza.getAndIncrement()));
    }
}
