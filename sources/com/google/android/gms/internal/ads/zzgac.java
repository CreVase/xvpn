package com.google.android.gms.internal.ads;

import defpackage.hx2;
import defpackage.p71;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzgac extends AtomicReference implements Runnable {
    private static final Runnable zza = new zzgab(null);
    private static final Runnable zzb = new zzgab(null);

    private final void zzc(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzfzz zzfzzVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof zzfzz)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzfzzVar = (zzfzz) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    if (!Thread.interrupted() && !z) {
                        z = false;
                    } else {
                        z = true;
                    }
                    LockSupport.park(zzfzzVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (!compareAndSet(null, currentThread)) {
            return;
        }
        boolean z = !zzg();
        if (z) {
            try {
                obj = zza();
            } catch (Throwable th) {
                try {
                    zzgak.zza(th);
                    if (!compareAndSet(currentThread, zza)) {
                        zzc(currentThread);
                    }
                    zzd(th);
                    return;
                } catch (Throwable th2) {
                    if (!compareAndSet(currentThread, zza)) {
                        zzc(currentThread);
                    }
                    zze(null);
                    throw th2;
                }
            }
        }
        if (!compareAndSet(currentThread, zza)) {
            zzc(currentThread);
        }
        if (z) {
            zze(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == zza) {
            str = "running=[DONE]";
        } else if (runnable instanceof zzfzz) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = hx2.q("running=[RUNNING ON ", ((Thread) runnable).getName(), "]");
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return p71.m(str, ", ", zzb());
    }

    public abstract Object zza() throws Exception;

    public abstract String zzb();

    public abstract void zzd(Throwable th);

    public abstract void zze(Object obj);

    public abstract boolean zzg();

    public final void zzh() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzfzz zzfzzVar = new zzfzz(this, null);
            zzfzzVar.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, zzfzzVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }
}
