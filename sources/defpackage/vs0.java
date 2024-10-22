package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class vs0 extends us0 implements vj0 {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f4887b;

    public vs0(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.f4887b = executor;
        Method method2 = r40.f4097a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null && (method = r40.f4097a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.v90
    public final void K(t90 t90Var, Runnable runnable) {
        try {
            this.f4887b.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            zf3.h(t90Var, cancellationException);
            vl0.c.K(t90Var, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.f4887b;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof vs0) && ((vs0) obj).f4887b == this.f4887b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f4887b);
    }

    @Override // defpackage.v90
    public final String toString() {
        return this.f4887b.toString();
    }

    @Override // defpackage.vj0
    public final void w(long j, vu vuVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f4887b;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(new y4(this, vuVar, 23), j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                zf3.h(vuVar.e, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            vuVar.u(new nu(scheduledFuture, 0));
        } else {
            gh0.i.w(j, vuVar);
        }
    }
}
