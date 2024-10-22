package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class lp2 implements Executor {
    public static final Logger f = Logger.getLogger(lp2.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Executor f3169a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f3170b = new ArrayDeque();
    public int c = 1;
    public long d = 0;
    public final kp2 e = new kp2(this, 0);

    public lp2(Executor executor) {
        this.f3169a = (Executor) Preconditions.checkNotNull(executor);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        synchronized (this.f3170b) {
            int i = this.c;
            if (i != 4 && i != 3) {
                long j = this.d;
                kp2 kp2Var = new kp2(this, runnable);
                this.f3170b.add(kp2Var);
                this.c = 2;
                boolean z = false;
                try {
                    this.f3169a.execute(this.e);
                    if (this.c != 2) {
                        z = true;
                    }
                    if (z) {
                        return;
                    }
                    synchronized (this.f3170b) {
                        if (this.d == j && this.c == 2) {
                            this.c = 3;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f3170b) {
                        int i2 = this.c;
                        if ((i2 == 1 || i2 == 2) && this.f3170b.removeLastOccurrence(kp2Var)) {
                            z = true;
                        }
                        if (!(e instanceof RejectedExecutionException) || z) {
                            throw e;
                        }
                    }
                    return;
                }
            }
            this.f3170b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f3169a + "}";
    }
}
