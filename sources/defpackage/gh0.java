package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public final class gh0 extends ls0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final gh0 i;
    public static final long j;

    static {
        Long l;
        gh0 gh0Var = new gh0();
        i = gh0Var;
        gh0Var.O(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        j = timeUnit.toNanos(l.longValue());
    }

    @Override // defpackage.ms0
    public final Thread N() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // defpackage.ms0
    public final void R(long j2, js0 js0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // defpackage.ls0
    public final void T(Runnable runnable) {
        boolean z;
        if (debugStatus == 4) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            super.T(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void X() {
        boolean z;
        int i2 = debugStatus;
        if (i2 != 2 && i2 != 3) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return;
        }
        debugStatus = 3;
        ls0.f.set(this, null);
        ls0.g.set(this, null);
        notifyAll();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        n83.f3412a.set(this);
        try {
            synchronized (this) {
                int i2 = debugStatus;
                if (i2 != 2 && i2 != 3) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    z2 = false;
                } else {
                    debugStatus = 1;
                    notifyAll();
                    z2 = true;
                }
            }
            if (!z2) {
                _thread = null;
                X();
                if (!V()) {
                    N();
                    return;
                }
                return;
            }
            long j2 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long P = P();
                if (P == Long.MAX_VALUE) {
                    long nanoTime = System.nanoTime();
                    if (j2 == Long.MAX_VALUE) {
                        j2 = j + nanoTime;
                    }
                    long j3 = j2 - nanoTime;
                    if (j3 <= 0) {
                        _thread = null;
                        X();
                        if (!V()) {
                            N();
                            return;
                        }
                        return;
                    }
                    if (P > j3) {
                        P = j3;
                    }
                } else {
                    j2 = Long.MAX_VALUE;
                }
                if (P > 0) {
                    int i3 = debugStatus;
                    if (i3 != 2 && i3 != 3) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        _thread = null;
                        X();
                        if (!V()) {
                            N();
                            return;
                        }
                        return;
                    }
                    LockSupport.parkNanos(this, P);
                }
            }
        } catch (Throwable th) {
            _thread = null;
            X();
            if (!V()) {
                N();
            }
            throw th;
        }
    }

    @Override // defpackage.ls0, defpackage.ms0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
