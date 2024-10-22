package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public abstract class s40 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4269a = AtomicReferenceFieldUpdater.newUpdater(s40.class, Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4270b = AtomicReferenceFieldUpdater.newUpdater(s40.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public s40(s40 s40Var) {
        this._prev = s40Var;
    }

    public final void a() {
        f4270b.lazySet(this, null);
    }

    public final s40 b() {
        Object obj = f4269a.get(this);
        if (obj == t9.f) {
            return null;
        }
        return (s40) obj;
    }

    public abstract boolean c();

    public final void d() {
        boolean z;
        s40 s40Var;
        boolean z2;
        boolean z3;
        s40 b2;
        if (b() == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4270b;
            s40 s40Var2 = (s40) atomicReferenceFieldUpdater.get(this);
            while (s40Var2 != null && s40Var2.c()) {
                s40Var2 = (s40) atomicReferenceFieldUpdater.get(s40Var2);
            }
            s40 b3 = b();
            while (b3.c() && (b2 = b3.b()) != null) {
                b3 = b2;
            }
            do {
                Object obj = atomicReferenceFieldUpdater.get(b3);
                if (((s40) obj) == null) {
                    s40Var = null;
                } else {
                    s40Var = s40Var2;
                }
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(b3, obj, s40Var)) {
                        z2 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(b3) != obj) {
                        z2 = false;
                        break;
                    }
                }
            } while (!z2);
            if (s40Var2 != null) {
                f4269a.set(s40Var2, b3);
            }
            if (b3.c()) {
                if (b3.b() == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    continue;
                }
            }
            if (s40Var2 == null || !s40Var2.c()) {
                return;
            }
        }
    }
}
