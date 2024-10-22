package com.google.android.gms.internal.ads;

import defpackage.hx2;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class zzfgd implements ThreadFactory {
    private final AtomicInteger zza = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, hx2.m("AdWorker(NG) #", this.zza.getAndIncrement()));
    }
}
