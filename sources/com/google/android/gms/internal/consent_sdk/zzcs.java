package com.google.android.gms.internal.consent_sdk;

import defpackage.hx2;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcs implements Executor {
    private final ThreadPoolExecutor zzb;
    private final AtomicInteger zza = new AtomicInteger(1);
    private WeakReference zzc = new WeakReference(null);

    public zzcs(String str) {
        final String str2 = "Google consent worker";
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory(str2) { // from class: com.google.android.gms.internal.consent_sdk.zzcr
            public final /* synthetic */ String zzb = "Google consent worker";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return zzcs.this.zza(this.zzb, runnable);
            }
        });
        this.zzb = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.zzc.get()) {
            runnable.run();
        } else {
            this.zzb.execute(runnable);
        }
    }

    public final /* synthetic */ Thread zza(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, hx2.m("Google consent worker #", this.zza.getAndIncrement()));
        this.zzc = new WeakReference(thread);
        return thread;
    }
}
