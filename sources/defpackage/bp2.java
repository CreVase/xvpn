package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class bp2 {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(bp2.class, Object.class, "head");
    public static final AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(bp2.class, "deqIdx");
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(bp2.class, Object.class, "tail");
    public static final AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(bp2.class, "enqIdx");
    public static final AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(bp2.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a, reason: collision with root package name */
    public final int f505a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final fv2 f506b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public bp2(int i) {
        boolean z;
        if (i >= 0 && i <= 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            dp2 dp2Var = new dp2(0L, null, 2);
            this.head = dp2Var;
            this.tail = dp2Var;
            this._availablePermits = 1 - i;
            this.f506b = new fv2(this, 29);
            return;
        }
        throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0004 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.jy1 r23) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bp2.a(jy1):void");
    }

    public final void b() {
        int i;
        Object F;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.f505a;
            if (andIncrement < i2) {
                if (andIncrement >= 0) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
                dp2 dp2Var = (dp2) atomicReferenceFieldUpdater.get(this);
                long andIncrement2 = d.getAndIncrement(this);
                long j = andIncrement2 / cp2.f;
                ap2 ap2Var = ap2.f313b;
                do {
                    F = t9.F(dp2Var, j, ap2Var);
                    if (zf3.O(F)) {
                        break;
                    }
                    to2 F2 = zf3.F(F);
                    while (true) {
                        to2 to2Var = (to2) atomicReferenceFieldUpdater.get(this);
                        if (to2Var.c >= F2.c) {
                            break;
                        }
                        if (!F2.i()) {
                            z4 = false;
                            break;
                        }
                        while (true) {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, to2Var, F2)) {
                                z5 = true;
                                break;
                            } else if (atomicReferenceFieldUpdater.get(this) != to2Var) {
                                z5 = false;
                                break;
                            }
                        }
                        if (z5) {
                            if (to2Var.e()) {
                                to2Var.d();
                            }
                        } else if (F2.e()) {
                            F2.d();
                        }
                    }
                    z4 = true;
                } while (!z4);
                dp2 dp2Var2 = (dp2) zf3.F(F);
                dp2Var2.a();
                if (dp2Var2.c <= j) {
                    int i3 = (int) (andIncrement2 % cp2.f);
                    pq0 pq0Var = cp2.f1648b;
                    AtomicReferenceArray atomicReferenceArray = dp2Var2.e;
                    Object andSet = atomicReferenceArray.getAndSet(i3, pq0Var);
                    if (andSet == null) {
                        int i4 = cp2.f1647a;
                        for (int i5 = 0; i5 < i4; i5++) {
                            if (atomicReferenceArray.get(i3) != cp2.c) {
                            }
                        }
                        pq0 pq0Var2 = cp2.f1648b;
                        pq0 pq0Var3 = cp2.d;
                        while (true) {
                            if (atomicReferenceArray.compareAndSet(i3, pq0Var2, pq0Var3)) {
                                z2 = true;
                                z3 = true;
                                break;
                            } else if (atomicReferenceArray.get(i3) != pq0Var2) {
                                z2 = true;
                                z3 = false;
                                break;
                            }
                        }
                        z = z3 ^ z2;
                    } else if (andSet != cp2.e) {
                        if (andSet instanceof uu) {
                            uu uuVar = (uu) andSet;
                            pq0 f2 = uuVar.f(ch3.f636a, this.f506b);
                            if (f2 != null) {
                                uuVar.l(f2);
                            }
                        } else {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                    }
                    z = true;
                    break;
                }
                z = false;
            } else {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
        } while (!z);
    }
}
