package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class g0 implements ml1 {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(g0.class.getName());
    public static final pd0 f;
    public static final Object g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f2184a;

    /* renamed from: b, reason: collision with root package name */
    public volatile b0 f2185b;
    public volatile f0 c;

    static {
        pd0 e0Var;
        try {
            e0Var = new c0(AtomicReferenceFieldUpdater.newUpdater(f0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f0.class, f0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g0.class, f0.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g0.class, b0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g0.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            e0Var = new e0();
        }
        f = e0Var;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        g = new Object();
    }

    public static void b(g0 g0Var) {
        b0 b0Var;
        b0 b0Var2;
        b0 b0Var3 = null;
        while (true) {
            f0 f0Var = g0Var.c;
            if (f.o(g0Var, f0Var, f0.c)) {
                while (f0Var != null) {
                    Thread thread = f0Var.f2023a;
                    if (thread != null) {
                        f0Var.f2023a = null;
                        LockSupport.unpark(thread);
                    }
                    f0Var = f0Var.f2024b;
                }
                do {
                    b0Var = g0Var.f2185b;
                } while (!f.m(g0Var, b0Var, b0.d));
                while (true) {
                    b0Var2 = b0Var3;
                    b0Var3 = b0Var;
                    if (b0Var3 == null) {
                        break;
                    }
                    b0Var = b0Var3.c;
                    b0Var3.c = b0Var2;
                }
                while (b0Var2 != null) {
                    b0Var3 = b0Var2.c;
                    Runnable runnable = b0Var2.f374a;
                    if (runnable instanceof d0) {
                        d0 d0Var = (d0) runnable;
                        g0Var = d0Var.f1712a;
                        if (g0Var.f2184a == d0Var) {
                            if (f.n(g0Var, d0Var, e(d0Var.f1713b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        c(runnable, b0Var2.f375b);
                    }
                    b0Var2 = b0Var3;
                }
                return;
            }
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object e(ml1 ml1Var) {
        Object obj;
        if (ml1Var instanceof g0) {
            Object obj2 = ((g0) ml1Var).f2184a;
            if (obj2 instanceof z) {
                z zVar = (z) obj2;
                if (zVar.f5406a) {
                    if (zVar.f5407b != null) {
                        return new z(false, zVar.f5407b);
                    }
                    return z.d;
                }
                return obj2;
            }
            return obj2;
        }
        boolean isCancelled = ml1Var.isCancelled();
        if ((!d) & isCancelled) {
            return z.d;
        }
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = ml1Var.get();
                    break;
                } catch (CancellationException e2) {
                    if (!isCancelled) {
                        return new a0(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + ml1Var, e2));
                    }
                    return new z(false, e2);
                } catch (ExecutionException e3) {
                    return new a0(e3.getCause());
                } catch (Throwable th) {
                    return new a0(th);
                }
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th2) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        if (obj == null) {
            return g;
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        Object obj;
        String valueOf;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (CancellationException unused) {
                    sb.append("CANCELLED");
                    return;
                } catch (RuntimeException e2) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e2.getClass());
                    sb.append(" thrown from get()]");
                    return;
                } catch (ExecutionException e3) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e3.getCause());
                    sb.append("]");
                    return;
                }
            } catch (InterruptedException unused2) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (obj == this) {
            valueOf = "this future";
        } else {
            valueOf = String.valueOf(obj);
        }
        sb.append(valueOf);
        sb.append("]");
    }

    @Override // defpackage.ml1
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        b0 b0Var = this.f2185b;
        b0 b0Var2 = b0.d;
        if (b0Var != b0Var2) {
            b0 b0Var3 = new b0(runnable, executor);
            do {
                b0Var3.c = b0Var;
                if (f.m(this, b0Var, b0Var3)) {
                    return;
                } else {
                    b0Var = this.f2185b;
                }
            } while (b0Var != b0Var2);
        }
        c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        z zVar;
        boolean z3;
        Object obj = this.f2184a;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 | (obj instanceof d0)) {
            if (d) {
                zVar = new z(z, new CancellationException("Future.cancel() was called."));
            } else if (z) {
                zVar = z.c;
            } else {
                zVar = z.d;
            }
            boolean z4 = false;
            g0 g0Var = this;
            while (true) {
                if (f.n(g0Var, obj, zVar)) {
                    b(g0Var);
                    if (!(obj instanceof d0)) {
                        return true;
                    }
                    ml1 ml1Var = ((d0) obj).f1713b;
                    if (ml1Var instanceof g0) {
                        g0Var = (g0) ml1Var;
                        obj = g0Var.f2184a;
                        if (obj == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!(z3 | (obj instanceof d0))) {
                            return true;
                        }
                        z4 = true;
                    } else {
                        ml1Var.cancel(z);
                        return true;
                    }
                } else {
                    obj = g0Var.f2184a;
                    if (!(obj instanceof d0)) {
                        return z4;
                    }
                }
            }
        } else {
            return false;
        }
    }

    public final Object d(Object obj) {
        if (!(obj instanceof z)) {
            if (!(obj instanceof a0)) {
                if (obj == g) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((a0) obj).f7a);
        }
        Throwable th = ((z) obj).f5407b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String f() {
        String valueOf;
        Object obj = this.f2184a;
        if (obj instanceof d0) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            ml1 ml1Var = ((d0) obj).f1713b;
            if (ml1Var == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(ml1Var);
            }
            return hx2.s(sb, valueOf, "]");
        }
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    public final void g(f0 f0Var) {
        f0Var.f2023a = null;
        while (true) {
            f0 f0Var2 = this.c;
            if (f0Var2 == f0.c) {
                return;
            }
            f0 f0Var3 = null;
            while (f0Var2 != null) {
                f0 f0Var4 = f0Var2.f2024b;
                if (f0Var2.f2023a != null) {
                    f0Var3 = f0Var2;
                } else if (f0Var3 != null) {
                    f0Var3.f2024b = f0Var4;
                    if (f0Var3.f2023a == null) {
                        break;
                    }
                } else if (!f.o(this, f0Var2, f0Var4)) {
                    break;
                }
                f0Var2 = f0Var4;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ad -> B:33:0x00b3). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(long r18, java.util.concurrent.TimeUnit r20) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g0.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2184a instanceof z;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z;
        if (this.f2184a != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(r0 instanceof d0)) & z;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f2184a instanceof z) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = f();
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f2184a;
            if ((obj2 != null) & (!(obj2 instanceof d0))) {
                return d(obj2);
            }
            f0 f0Var = this.c;
            f0 f0Var2 = f0.c;
            if (f0Var != f0Var2) {
                f0 f0Var3 = new f0();
                do {
                    pd0 pd0Var = f;
                    pd0Var.I(f0Var3, f0Var);
                    if (pd0Var.o(this, f0Var, f0Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f2184a;
                            } else {
                                g(f0Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof d0))));
                        return d(obj);
                    }
                    f0Var = this.c;
                } while (f0Var != f0Var2);
            }
            return d(this.f2184a);
        }
        throw new InterruptedException();
    }
}
