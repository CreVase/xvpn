package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public final class z90 implements Executor, Closeable {
    public static final AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(z90.class, "parkedWorkersStack");
    public static final AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(z90.class, "controlState");
    public static final AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(z90.class, "_isTerminated");
    public static final pq0 k = new pq0("NOT_IN_STACK", 6, 0);
    private volatile int _isTerminated;

    /* renamed from: a, reason: collision with root package name */
    public final int f5446a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5447b;
    public final long c;
    private volatile long controlState;
    public final String d;
    public final x51 e;
    public final x51 f;
    public final wj2 g;
    private volatile long parkedWorkersStack;

    public z90(int i2, int i3, String str, long j2) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f5446a = i2;
        this.f5447b = i3;
        this.c = j2;
        this.d = str;
        if (i2 >= 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i3 >= i2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i3 <= 2097150) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (j2 > 0) {
                        this.e = new x51();
                        this.f = new x51();
                        this.g = new wj2((i2 + 1) * 2);
                        this.controlState = i2 << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
                }
                throw new IllegalArgumentException(p71.k("Max pool size ", i3, " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(hx2.n("Max pool size ", i3, " should be greater than or equals to core pool size ", i2).toString());
        }
        throw new IllegalArgumentException(p71.k("Core pool size ", i2, " should be at least 1").toString());
    }

    public final boolean K() {
        pq0 pq0Var;
        int i2;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = h;
            long j2 = atomicLongFieldUpdater.get(this);
            y90 y90Var = (y90) this.g.b((int) (2097151 & j2));
            if (y90Var == null) {
                y90Var = null;
            } else {
                long j3 = (2097152 + j2) & (-2097152);
                Object c = y90Var.c();
                while (true) {
                    pq0Var = k;
                    if (c == pq0Var) {
                        i2 = -1;
                        break;
                    }
                    if (c == null) {
                        i2 = 0;
                        break;
                    }
                    y90 y90Var2 = (y90) c;
                    i2 = y90Var2.b();
                    if (i2 != 0) {
                        break;
                    }
                    c = y90Var2.c();
                }
                if (i2 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j2, j3 | i2)) {
                    y90Var.g(pq0Var);
                }
            }
            if (y90Var == null) {
                return false;
            }
            if (y90.i.compareAndSet(y90Var, -1, 0)) {
                LockSupport.unpark(y90Var);
                return true;
            }
        }
    }

    public final int a() {
        boolean z;
        boolean z2;
        synchronized (this.g) {
            boolean z3 = false;
            if (j.get(this) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = i;
            long j2 = atomicLongFieldUpdater.get(this);
            int i2 = (int) (j2 & 2097151);
            int i3 = i2 - ((int) ((j2 & 4398044413952L) >> 21));
            if (i3 < 0) {
                i3 = 0;
            }
            if (i3 >= this.f5446a) {
                return 0;
            }
            if (i2 >= this.f5447b) {
                return 0;
            }
            int i4 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
            if (i4 > 0 && this.g.b(i4) == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                y90 y90Var = new y90(this, i4);
                this.g.c(i4, y90Var);
                if (i4 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    z3 = true;
                }
                if (z3) {
                    int i5 = i3 + 1;
                    y90Var.start();
                    return i5;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final void c(Runnable runnable, os osVar, boolean z) {
        f63 h63Var;
        boolean z2;
        long j2;
        y90 y90Var;
        boolean z3;
        boolean a2;
        int i2;
        m63.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof f63) {
            h63Var = (f63) runnable;
            h63Var.f2050a = nanoTime;
            h63Var.f2051b = osVar;
        } else {
            h63Var = new h63(runnable, nanoTime, osVar);
        }
        boolean z4 = false;
        if (h63Var.f2051b.f3720a == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        if (z2) {
            j2 = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j2 = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof y90) {
            y90Var = (y90) currentThread;
        } else {
            y90Var = null;
        }
        if (y90Var == null || !m20.L(y90Var.h, this)) {
            y90Var = null;
        }
        if (y90Var != null && (i2 = y90Var.c) != 5 && (h63Var.f2051b.f3720a != 0 || i2 != 2)) {
            y90Var.g = true;
            ms3 ms3Var = y90Var.f5295a;
            if (z) {
                h63Var = ms3Var.a(h63Var);
            } else {
                ms3Var.getClass();
                f63 f63Var = (f63) ms3.f3345b.getAndSet(ms3Var, h63Var);
                if (f63Var == null) {
                    h63Var = null;
                } else {
                    h63Var = ms3Var.a(f63Var);
                }
            }
        }
        if (h63Var != null) {
            if (h63Var.f2051b.f3720a == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                a2 = this.f.a(h63Var);
            } else {
                a2 = this.e.a(h63Var);
            }
            if (!a2) {
                throw new RejectedExecutionException(hx2.s(new StringBuilder(), this.d, " was terminated"));
            }
        }
        if (z && y90Var != null) {
            z4 = true;
        }
        if (z2) {
            if (!z4 && !K() && !w(j2)) {
                K();
                return;
            }
            return;
        }
        if (!z4 && !K() && !w(atomicLongFieldUpdater.get(this))) {
            K();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0087, code lost:            if (r1 == null) goto L40;     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.z90.j
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r9, r1, r2)
            if (r0 != 0) goto Lc
            goto Laf
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r3 = r0 instanceof defpackage.y90
            r4 = 0
            if (r3 == 0) goto L18
            y90 r0 = (defpackage.y90) r0
            goto L19
        L18:
            r0 = r4
        L19:
            if (r0 == 0) goto L24
            z90 r3 = r0.h
            boolean r3 = defpackage.m20.L(r3, r9)
            if (r3 == 0) goto L24
            goto L25
        L24:
            r0 = r4
        L25:
            wj2 r3 = r9.g
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = defpackage.z90.i     // Catch: java.lang.Throwable -> Lc1
            long r5 = r5.get(r9)     // Catch: java.lang.Throwable -> Lc1
            r7 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r5 & r7
            int r6 = (int) r5
            monitor-exit(r3)
            if (r2 > r6) goto L77
            r3 = 1
        L37:
            wj2 r5 = r9.g
            java.lang.Object r5 = r5.b(r3)
            y90 r5 = (defpackage.y90) r5
            if (r5 == r0) goto L72
        L41:
            boolean r7 = r5.isAlive()
            if (r7 == 0) goto L50
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r7 = 10000(0x2710, double:4.9407E-320)
            r5.join(r7)
            goto L41
        L50:
            ms3 r5 = r5.f5295a
            x51 r7 = r9.f
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = defpackage.ms3.f3345b
            java.lang.Object r8 = r8.getAndSet(r5, r4)
            f63 r8 = (defpackage.f63) r8
            if (r8 == 0) goto L64
            r7.a(r8)
        L64:
            f63 r8 = r5.b()
            if (r8 != 0) goto L6c
            r8 = 0
            goto L70
        L6c:
            r7.a(r8)
            r8 = 1
        L70:
            if (r8 != 0) goto L64
        L72:
            if (r3 == r6) goto L77
            int r3 = r3 + 1
            goto L37
        L77:
            x51 r1 = r9.f
            r1.b()
            x51 r1 = r9.e
            r1.b()
        L81:
            if (r0 == 0) goto L89
            f63 r1 = r0.a(r2)
            if (r1 != 0) goto Lb0
        L89:
            x51 r1 = r9.e
            java.lang.Object r1 = r1.d()
            f63 r1 = (defpackage.f63) r1
            if (r1 != 0) goto Lb0
            x51 r1 = r9.f
            java.lang.Object r1 = r1.d()
            f63 r1 = (defpackage.f63) r1
            if (r1 != 0) goto Lb0
            if (r0 == 0) goto La3
            r1 = 5
            r0.h(r1)
        La3:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.z90.h
            r1 = 0
            r0.set(r9, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.z90.i
            r0.set(r9, r1)
        Laf:
            return
        Lb0:
            r1.run()     // Catch: java.lang.Throwable -> Lb4
            goto L81
        Lb4:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L81
        Lc1:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z90.close():void");
    }

    public final void d(y90 y90Var, int i2, int i3) {
        while (true) {
            long j2 = h.get(this);
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i4 == i2) {
                if (i3 == 0) {
                    Object c = y90Var.c();
                    while (true) {
                        if (c == k) {
                            i4 = -1;
                            break;
                        }
                        if (c == null) {
                            i4 = 0;
                            break;
                        }
                        y90 y90Var2 = (y90) c;
                        i4 = y90Var2.b();
                        if (i4 != 0) {
                            break;
                        } else {
                            c = y90Var2.c();
                        }
                    }
                } else {
                    i4 = i3;
                }
            }
            if (i4 >= 0 && h.compareAndSet(this, j2, j3 | i4)) {
                return;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(runnable, m63.g, false);
    }

    public final String toString() {
        int i2;
        ArrayList arrayList = new ArrayList();
        wj2 wj2Var = this.g;
        int a2 = wj2Var.a();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 1; i8 < a2; i8++) {
            y90 y90Var = (y90) wj2Var.b(i8);
            if (y90Var != null) {
                ms3 ms3Var = y90Var.f5295a;
                ms3Var.getClass();
                if (ms3.f3345b.get(ms3Var) != null) {
                    i2 = (ms3.c.get(ms3Var) - ms3.d.get(ms3Var)) + 1;
                } else {
                    i2 = ms3.c.get(ms3Var) - ms3.d.get(ms3Var);
                }
                int x = hx2.x(y90Var.c);
                if (x != 0) {
                    if (x != 1) {
                        if (x != 2) {
                            if (x != 3) {
                                if (x == 4) {
                                    i7++;
                                }
                            } else {
                                i6++;
                                if (i2 > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(i2);
                                    sb.append('d');
                                    arrayList.add(sb.toString());
                                }
                            }
                        } else {
                            i5++;
                        }
                    } else {
                        i4++;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i2);
                        sb2.append('b');
                        arrayList.add(sb2.toString());
                    }
                } else {
                    i3++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i2);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                }
            }
        }
        long j2 = i.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.d);
        sb4.append('@');
        sb4.append(pe0.u(this));
        sb4.append("[Pool Size {core = ");
        int i9 = this.f5446a;
        sb4.append(i9);
        sb4.append(", max = ");
        sb4.append(this.f5447b);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i3);
        sb4.append(", blocking = ");
        sb4.append(i4);
        sb4.append(", parked = ");
        sb4.append(i5);
        sb4.append(", dormant = ");
        sb4.append(i6);
        sb4.append(", terminated = ");
        sb4.append(i7);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j2));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j2) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i9 - ((int) ((j2 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final boolean w(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.f5446a;
        if (i2 < i3) {
            int a2 = a();
            if (a2 == 1 && i3 > 1) {
                a();
            }
            if (a2 > 0) {
                return true;
            }
        }
        return false;
    }
}
