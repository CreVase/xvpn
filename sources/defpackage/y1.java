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
public abstract class y1 implements ml1 {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(y1.class.getName());
    public static final pe0 f;
    public static final Object g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f5254a;

    /* renamed from: b, reason: collision with root package name */
    public volatile u1 f5255b;
    public volatile x1 c;

    static {
        pe0 w1Var;
        try {
            w1Var = new v1(AtomicReferenceFieldUpdater.newUpdater(x1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(x1.class, x1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(y1.class, x1.class, "c"), AtomicReferenceFieldUpdater.newUpdater(y1.class, u1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(y1.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            w1Var = new w1();
        }
        f = w1Var;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        g = new Object();
    }

    public static void c(y1 y1Var) {
        x1 x1Var;
        u1 u1Var;
        u1 u1Var2;
        u1 u1Var3;
        do {
            x1Var = y1Var.c;
        } while (!f.j(y1Var, x1Var, x1.c));
        while (true) {
            u1Var = null;
            if (x1Var == null) {
                break;
            }
            Thread thread = x1Var.f5102a;
            if (thread != null) {
                x1Var.f5102a = null;
                LockSupport.unpark(thread);
            }
            x1Var = x1Var.f5103b;
        }
        y1Var.b();
        do {
            u1Var2 = y1Var.f5255b;
        } while (!f.h(y1Var, u1Var2, u1.d));
        while (true) {
            u1Var3 = u1Var;
            u1Var = u1Var2;
            if (u1Var == null) {
                break;
            }
            u1Var2 = u1Var.c;
            u1Var.c = u1Var3;
        }
        while (u1Var3 != null) {
            u1 u1Var4 = u1Var3.c;
            d(u1Var3.f4611a, u1Var3.f4612b);
            u1Var3 = u1Var4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
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
        u1 u1Var = this.f5255b;
        u1 u1Var2 = u1.d;
        if (u1Var != u1Var2) {
            u1 u1Var3 = new u1(runnable, executor);
            do {
                u1Var3.c = u1Var;
                if (f.h(this, u1Var, u1Var3)) {
                    return;
                } else {
                    u1Var = this.f5255b;
                }
            } while (u1Var != u1Var2);
        }
        d(runnable, executor);
    }

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        r1 r1Var;
        Object obj = this.f5254a;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 | false) {
            if (d) {
                r1Var = new r1(z, new CancellationException("Future.cancel() was called."));
            } else if (z) {
                r1Var = r1.c;
            } else {
                r1Var = r1.d;
            }
            if (f.i(this, obj, r1Var)) {
                c(this);
                return true;
            }
        }
        return false;
    }

    public final Object e(Object obj) {
        if (!(obj instanceof r1)) {
            if (!(obj instanceof t1)) {
                if (obj == g) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((t1) obj).f4437a);
        }
        Throwable th = ((r1) obj).f4086b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String f() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    public final void g(x1 x1Var) {
        x1Var.f5102a = null;
        while (true) {
            x1 x1Var2 = this.c;
            if (x1Var2 == x1.c) {
                return;
            }
            x1 x1Var3 = null;
            while (x1Var2 != null) {
                x1 x1Var4 = x1Var2.f5103b;
                if (x1Var2.f5102a != null) {
                    x1Var3 = x1Var2;
                } else if (x1Var3 != null) {
                    x1Var3.f5103b = x1Var4;
                    if (x1Var3.f5102a == null) {
                        break;
                    }
                } else if (!f.j(this, x1Var2, x1Var4)) {
                    break;
                }
                x1Var2 = x1Var4;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00a4 -> B:33:0x00aa). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(long r18, java.util.concurrent.TimeUnit r20) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y1.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public boolean h(Object obj) {
        if (obj == null) {
            obj = g;
        }
        if (f.i(this, null, obj)) {
            c(this);
            return true;
        }
        return false;
    }

    public boolean i(Throwable th) {
        th.getClass();
        if (f.i(this, null, new t1(th))) {
            c(this);
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5254a instanceof r1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z;
        if (this.f5254a != null) {
            z = true;
        } else {
            z = false;
        }
        return z & true;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f5254a instanceof r1) {
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
            Object obj2 = this.f5254a;
            if ((obj2 != null) & true) {
                return e(obj2);
            }
            x1 x1Var = this.c;
            x1 x1Var2 = x1.c;
            if (x1Var != x1Var2) {
                x1 x1Var3 = new x1();
                do {
                    pe0 pe0Var = f;
                    pe0Var.M(x1Var3, x1Var);
                    if (pe0Var.j(this, x1Var, x1Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f5254a;
                            } else {
                                g(x1Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & true));
                        return e(obj);
                    }
                    x1Var = this.c;
                } while (x1Var != x1Var2);
            }
            return e(this.f5254a);
        }
        throw new InterruptedException();
    }
}
