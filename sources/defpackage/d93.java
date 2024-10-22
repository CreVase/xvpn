package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class d93 {
    public static final c93 Companion = new c93();
    public static final d93 NONE = new b93();
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    public d93 clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public d93 clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public final d93 deadline(long j, TimeUnit timeUnit) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return deadlineNanoTime(timeUnit.toNanos(j) + System.nanoTime());
        }
        throw new IllegalArgumentException(m20.d1(Long.valueOf(j), "duration <= 0: ").toString());
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final <T> T intersectWith(d93 d93Var, v31 v31Var) {
        long timeoutNanos = timeoutNanos();
        c93 c93Var = Companion;
        long timeoutNanos2 = d93Var.timeoutNanos();
        long timeoutNanos3 = timeoutNanos();
        c93Var.getClass();
        if (timeoutNanos2 == 0 || (timeoutNanos3 != 0 && timeoutNanos2 >= timeoutNanos3)) {
            timeoutNanos2 = timeoutNanos3;
        }
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(timeoutNanos2, timeUnit);
        if (hasDeadline()) {
            long deadlineNanoTime = deadlineNanoTime();
            if (d93Var.hasDeadline()) {
                deadlineNanoTime(Math.min(deadlineNanoTime(), d93Var.deadlineNanoTime()));
            }
            try {
                T t = (T) v31Var.invoke();
                timeout(timeoutNanos, timeUnit);
                if (d93Var.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime);
                }
                return t;
            } catch (Throwable th) {
                timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (d93Var.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime);
                }
                throw th;
            }
        }
        if (d93Var.hasDeadline()) {
            deadlineNanoTime(d93Var.deadlineNanoTime());
        }
        try {
            T t2 = (T) v31Var.invoke();
            timeout(timeoutNanos, timeUnit);
            if (d93Var.hasDeadline()) {
                clearDeadline();
            }
            return t2;
        } catch (Throwable th2) {
            timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            if (d93Var.hasDeadline()) {
                clearDeadline();
            }
            throw th2;
        }
    }

    public void throwIfReached() throws IOException {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public d93 timeout(long j, TimeUnit timeUnit) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.timeoutNanos = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(m20.d1(Long.valueOf(j), "timeout < 0: ").toString());
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(Object obj) throws InterruptedIOException {
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            long j = 0;
            if (!hasDeadline && timeoutNanos == 0) {
                obj.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - nanoTime;
            }
            if (timeoutNanos > 0) {
                long j2 = timeoutNanos / 1000000;
                Long.signum(j2);
                obj.wait(j2, (int) (timeoutNanos - (1000000 * j2)));
                j = System.nanoTime() - nanoTime;
            }
            if (j < timeoutNanos) {
            } else {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public d93 deadlineNanoTime(long j) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j;
        return this;
    }
}
