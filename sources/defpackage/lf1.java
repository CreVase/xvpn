package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class lf1 implements vb1 {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3116b = AtomicIntegerFieldUpdater.newUpdater(lf1.class, "_isCompleting");
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(lf1.class, Object.class, "_rootCause");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(lf1.class, Object.class, "_exceptionsHolder");
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile Object _rootCause;

    /* renamed from: a, reason: collision with root package name */
    public final g02 f3117a;

    public lf1(g02 g02Var, Throwable th) {
        this.f3117a = g02Var;
        this._rootCause = th;
    }

    @Override // defpackage.vb1
    public final boolean a() {
        if (d() == null) {
            return true;
        }
        return false;
    }

    public final void b(Throwable th) {
        Throwable d2 = d();
        if (d2 == null) {
            c.set(this, th);
            return;
        }
        if (th == d2) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (obj instanceof Throwable) {
            if (th == obj) {
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(th);
            atomicReferenceFieldUpdater.set(this, arrayList);
            return;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(th);
        } else {
            throw new IllegalStateException(("State is " + obj).toString());
        }
    }

    @Override // defpackage.vb1
    public final g02 c() {
        return this.f3117a;
    }

    public final Throwable d() {
        return (Throwable) c.get(this);
    }

    public final boolean e() {
        if (d() != null) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (f3116b.get(this) != 0) {
            return true;
        }
        return false;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            throw new IllegalStateException(("State is " + obj).toString());
        }
        Throwable d2 = d();
        if (d2 != null) {
            arrayList.add(0, d2);
        }
        if (th != null && !m20.L(th, d2)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, fl.k);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + e() + ", completing=" + f() + ", rootCause=" + d() + ", exceptions=" + d.get(this) + ", list=" + this.f3117a + ']';
    }
}
