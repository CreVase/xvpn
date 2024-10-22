package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public abstract class ls0 extends ms0 implements vj0 {
    public static final AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(ls0.class, Object.class, "_queue");
    public static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(ls0.class, Object.class, "_delayed");
    public static final AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(ls0.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    public static final boolean S(ls0 ls0Var) {
        ls0Var.getClass();
        if (h.get(ls0Var) != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.v90
    public final void K(t90 t90Var, Runnable runnable) {
        T(runnable);
    }

    @Override // defpackage.ms0
    public final long P() {
        long j;
        js0 c;
        boolean z;
        boolean z2;
        js0 js0Var;
        boolean z3;
        boolean z4;
        js0 js0Var2;
        if (Q()) {
            return 0L;
        }
        ks0 ks0Var = (ks0) g.get(this);
        Runnable runnable = null;
        boolean z5 = true;
        if (ks0Var != null) {
            if (ks0Var.b() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                long nanoTime = System.nanoTime();
                do {
                    synchronized (ks0Var) {
                        js0[] js0VarArr = ks0Var.f3618a;
                        if (js0VarArr != null) {
                            js0Var = js0VarArr[0];
                        } else {
                            js0Var = null;
                        }
                        if (js0Var == null) {
                            js0Var2 = null;
                        } else {
                            if (nanoTime - js0Var.f2820a >= 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                z4 = U(js0Var);
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                js0Var2 = ks0Var.e(0);
                            } else {
                                js0Var2 = null;
                            }
                        }
                    }
                } while (js0Var2 != null);
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                break;
            }
            if (obj instanceof pn1) {
                pn1 pn1Var = (pn1) obj;
                Object d = pn1Var.d();
                if (d != pn1.g) {
                    runnable = (Runnable) d;
                    break;
                }
                pn1 c2 = pn1Var.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else {
                if (obj == ya0.c) {
                    break;
                }
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    runnable = (Runnable) obj;
                    break;
                }
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        gg ggVar = this.d;
        if (ggVar == null || ggVar.isEmpty()) {
            j = Long.MAX_VALUE;
        } else {
            j = 0;
        }
        if (j == 0) {
            return 0L;
        }
        Object obj2 = f.get(this);
        if (obj2 != null) {
            if (obj2 instanceof pn1) {
                long j2 = pn1.f.get((pn1) obj2);
                if (((int) ((1073741823 & j2) >> 0)) != ((int) ((j2 & 1152921503533105152L) >> 30))) {
                    z5 = false;
                }
                if (!z5) {
                    return 0L;
                }
            } else {
                if (obj2 != ya0.c) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
        }
        ks0 ks0Var2 = (ks0) g.get(this);
        if (ks0Var2 != null && (c = ks0Var2.c()) != null) {
            long nanoTime2 = c.f2820a - System.nanoTime();
            if (nanoTime2 < 0) {
                return 0L;
            }
            return nanoTime2;
        }
        return Long.MAX_VALUE;
    }

    public void T(Runnable runnable) {
        if (U(runnable)) {
            Thread N = N();
            if (Thread.currentThread() != N) {
                LockSupport.unpark(N);
                return;
            }
            return;
        }
        gh0.i.T(runnable);
    }

    public final boolean U(Runnable runnable) {
        boolean z;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z2 = false;
            if (h.get(this) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return false;
            }
            if (obj == null) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        z2 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                if (z2) {
                    return true;
                }
            } else if (obj instanceof pn1) {
                pn1 pn1Var = (pn1) obj;
                int a2 = pn1Var.a(runnable);
                if (a2 == 0) {
                    return true;
                }
                if (a2 != 1) {
                    if (a2 == 2) {
                        return false;
                    }
                } else {
                    pn1 c = pn1Var.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                }
            } else {
                if (obj == ya0.c) {
                    return false;
                }
                pn1 pn1Var2 = new pn1(8, true);
                pn1Var2.a((Runnable) obj);
                pn1Var2.a(runnable);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, pn1Var2)) {
                        z2 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (z2) {
                    return true;
                }
            }
        }
    }

    public final boolean V() {
        boolean z;
        boolean z2;
        gg ggVar = this.d;
        if (ggVar != null) {
            z = ggVar.isEmpty();
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        ks0 ks0Var = (ks0) g.get(this);
        if (ks0Var != null) {
            if (ks0Var.b() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
        }
        Object obj = f.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof pn1) {
            long j = pn1.f.get((pn1) obj);
            if (((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == ya0.c) {
            return true;
        }
        return false;
    }

    public final void W(long j, js0 js0Var) {
        boolean z;
        int c;
        Thread N;
        boolean z2 = false;
        if (h.get(this) != 0) {
            z = true;
        } else {
            z = false;
        }
        js0 js0Var2 = null;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
        if (z) {
            c = 1;
        } else {
            ks0 ks0Var = (ks0) atomicReferenceFieldUpdater.get(this);
            if (ks0Var == null) {
                ks0 ks0Var2 = new ks0(j);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, ks0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                ks0Var = (ks0) atomicReferenceFieldUpdater.get(this);
            }
            c = js0Var.c(j, ks0Var, this);
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            } else {
                R(j, js0Var);
                return;
            }
        }
        ks0 ks0Var3 = (ks0) atomicReferenceFieldUpdater.get(this);
        if (ks0Var3 != null) {
            js0Var2 = ks0Var3.c();
        }
        if (js0Var2 == js0Var) {
            z2 = true;
        }
        if (z2 && Thread.currentThread() != (N = N())) {
            LockSupport.unpark(N);
        }
    }

    @Override // defpackage.ms0
    public void shutdown() {
        boolean z;
        js0 js0Var;
        boolean z2;
        ThreadLocal threadLocal = n83.f3412a;
        n83.f3412a.set(null);
        h.set(this, 1);
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            pq0 pq0Var = ya0.c;
            if (obj == null) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, pq0Var)) {
                        z = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != null) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof pn1) {
                    ((pn1) obj).b();
                    break;
                }
                if (obj == pq0Var) {
                    break;
                }
                pn1 pn1Var = new pn1(8, true);
                pn1Var.a((Runnable) obj);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, pn1Var)) {
                        z2 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z2 = false;
                        break;
                    }
                }
                if (z2) {
                    break;
                }
            }
        }
        do {
        } while (P() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            ks0 ks0Var = (ks0) g.get(this);
            if (ks0Var != null) {
                synchronized (ks0Var) {
                    if (ks0Var.b() > 0) {
                        js0Var = ks0Var.e(0);
                    } else {
                        js0Var = null;
                    }
                }
                if (js0Var != null) {
                    R(nanoTime, js0Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.vj0
    public final void w(long j, vu vuVar) {
        long j2 = 0;
        if (j > 0) {
            if (j >= 9223372036854L) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = 1000000 * j;
            }
        }
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            is0 is0Var = new is0(this, j2 + nanoTime, vuVar);
            W(nanoTime, is0Var);
            vuVar.u(new nu(is0Var, 1));
        }
    }
}
