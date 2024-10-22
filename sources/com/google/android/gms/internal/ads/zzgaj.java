package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzgaj {
    public static zzgad zza(ExecutorService executorService) {
        zzgad zzgafVar;
        if (executorService instanceof zzgad) {
            return (zzgad) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            zzgafVar = new zzgai((ScheduledExecutorService) executorService);
        } else {
            zzgafVar = new zzgaf(executorService);
        }
        return zzgafVar;
    }

    public static Executor zzb() {
        return zzfzh.INSTANCE;
    }

    public static Executor zzc(Executor executor, zzfyh zzfyhVar) {
        executor.getClass();
        if (executor == zzfzh.INSTANCE) {
            return executor;
        }
        return new zzgae(executor, zzfyhVar);
    }
}
