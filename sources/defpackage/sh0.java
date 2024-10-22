package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class sh0 extends us0 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final sh0 f4342b = new sh0();
    public static final v90 c;

    static {
        v90 v90Var = jh3.f2766b;
        int i = d53.f1736a;
        if (64 >= i) {
            i = 64;
        }
        int Q = pd0.Q("kotlinx.coroutines.io.parallelism", i, 0, 0, 12);
        t9.v(Q);
        if (Q < m63.d) {
            t9.v(Q);
            v90Var = new gk1(Q);
        }
        c = v90Var;
    }

    @Override // defpackage.v90
    public final void K(t90 t90Var, Runnable runnable) {
        c.K(t90Var, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        K(zq0.f5530a, runnable);
    }

    @Override // defpackage.v90
    public final String toString() {
        return "Dispatchers.IO";
    }
}
