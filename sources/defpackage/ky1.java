package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class ky1 extends bp2 implements hy1 {
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(ky1.class, Object.class, "owner");
    private volatile Object owner;

    public ky1(boolean z) {
        super(z ? 1 : 0);
        pq0 pq0Var;
        if (z) {
            pq0Var = null;
        } else {
            pq0Var = m20.f;
        }
        this.owner = pq0Var;
    }

    public final boolean c() {
        if (Math.max(bp2.g.get(this), 0) != 0) {
            return false;
        }
        return true;
    }

    public final Object d(c90 c90Var) {
        int i;
        boolean z;
        boolean z2;
        char c;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = bp2.g;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.f505a;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i3) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                z = false;
                if (i2 <= 0) {
                    z2 = false;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    z2 = true;
                    break;
                }
            }
        }
        if (z2) {
            h.set(this, null);
            c = 0;
        } else {
            c = 1;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    throw new IllegalStateException("unexpected".toString());
                }
                throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
            }
        } else {
            z = true;
        }
        ch3 ch3Var = ch3.f636a;
        if (!z) {
            vu E = zf3.E(t9.P(c90Var));
            try {
                a(new jy1(this, E));
                Object r = E.r();
                ba0 ba0Var = ba0.f430a;
                if (r != ba0Var) {
                    r = ch3Var;
                }
                if (r == ba0Var) {
                    return r;
                }
                return ch3Var;
            } catch (Throwable th) {
                E.z();
                throw th;
            }
        }
        return ch3Var;
    }

    public final void e(Object obj) {
        boolean z;
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            pq0 pq0Var = m20.f;
            if (obj2 != pq0Var) {
                boolean z2 = true;
                if (obj2 != obj && obj != null) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, pq0Var)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        z2 = false;
                        break;
                    }
                }
                if (z2) {
                    b();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    public final String toString() {
        return "Mutex@" + pe0.u(this) + "[isLocked=" + c() + ",owner=" + h.get(this) + ']';
    }
}
