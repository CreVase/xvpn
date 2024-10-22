package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzfzt extends zzfzv {
    /* JADX WARN: Multi-variable type inference failed */
    public static zzfzs zza(Iterable iterable) {
        return new zzfzs(false, zzfvs.zzj(iterable), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzfzs zzb(Iterable iterable) {
        int i = zzfvs.zzd;
        iterable.getClass();
        return new zzfzs(true, zzfvs.zzj(iterable), null);
    }

    @SafeVarargs
    public static zzfzs zzc(ml1... ml1VarArr) {
        return new zzfzs(true, zzfvs.zzk(ml1VarArr), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ml1 zzd(Iterable iterable) {
        return new zzfzb(zzfvs.zzj(iterable), true);
    }

    public static ml1 zze(ml1 ml1Var, Class cls, zzfsk zzfskVar, Executor executor) {
        zzfye zzfyeVar = new zzfye(ml1Var, cls, zzfskVar);
        ml1Var.addListener(zzfyeVar, zzgaj.zzc(executor, zzfyeVar));
        return zzfyeVar;
    }

    public static ml1 zzf(ml1 ml1Var, Class cls, zzfza zzfzaVar, Executor executor) {
        zzfyd zzfydVar = new zzfyd(ml1Var, cls, zzfzaVar);
        ml1Var.addListener(zzfydVar, zzgaj.zzc(executor, zzfydVar));
        return zzfydVar;
    }

    public static ml1 zzg(Throwable th) {
        th.getClass();
        return new zzfzw(th);
    }

    public static ml1 zzh(Object obj) {
        if (obj == null) {
            return zzfzx.zza;
        }
        return new zzfzx(obj);
    }

    public static ml1 zzi() {
        return zzfzx.zza;
    }

    public static ml1 zzj(Callable callable, Executor executor) {
        zzgas zzgasVar = new zzgas(callable);
        executor.execute(zzgasVar);
        return zzgasVar;
    }

    public static ml1 zzk(zzfyz zzfyzVar, Executor executor) {
        zzgas zzgasVar = new zzgas(zzfyzVar);
        executor.execute(zzgasVar);
        return zzgasVar;
    }

    @SafeVarargs
    public static ml1 zzl(ml1... ml1VarArr) {
        return new zzfzb(zzfvs.zzk(ml1VarArr), false);
    }

    public static ml1 zzm(ml1 ml1Var, zzfsk zzfskVar, Executor executor) {
        zzfyo zzfyoVar = new zzfyo(ml1Var, zzfskVar);
        ml1Var.addListener(zzfyoVar, zzgaj.zzc(executor, zzfyoVar));
        return zzfyoVar;
    }

    public static ml1 zzn(ml1 ml1Var, zzfza zzfzaVar, Executor executor) {
        int i = zzfyp.zzc;
        executor.getClass();
        zzfyn zzfynVar = new zzfyn(ml1Var, zzfzaVar);
        ml1Var.addListener(zzfynVar, zzgaj.zzc(executor, zzfynVar));
        return zzfynVar;
    }

    public static ml1 zzo(ml1 ml1Var, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (ml1Var.isDone()) {
            return ml1Var;
        }
        return zzgap.zzf(ml1Var, j, timeUnit, scheduledExecutorService);
    }

    public static Object zzp(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzgau.zza(future);
        }
        throw new IllegalStateException(zzftl.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzq(Future future) {
        try {
            return zzgau.zza(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new zzfzi((Error) cause);
            }
            throw new zzgat(cause);
        }
    }

    public static void zzr(ml1 ml1Var, zzfzp zzfzpVar, Executor executor) {
        zzfzpVar.getClass();
        ml1Var.addListener(new zzfzq(ml1Var, zzfzpVar), executor);
    }
}
