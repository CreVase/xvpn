package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class mn1 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3319a = AtomicReferenceFieldUpdater.newUpdater(mn1.class, Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3320b = AtomicReferenceFieldUpdater.newUpdater(mn1.class, Object.class, "_prev");
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(mn1.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:            r6 = ((defpackage.bj2) r6).f475a;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:            if (r5.compareAndSet(r4, r2, r6) == false) goto L32;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:            if (r5.get(r4) == r2) goto L58;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:            r7 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:            if (r7 != false) goto L37;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.mn1 e() {
        /*
            r11 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.mn1.f3320b
            java.lang.Object r1 = r0.get(r11)
            mn1 r1 = (defpackage.mn1) r1
            r2 = r1
        L9:
            r3 = 0
            r4 = r3
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.mn1.f3319a
            java.lang.Object r6 = r5.get(r2)
            r7 = 1
            r8 = 0
            if (r6 != r11) goto L2a
            if (r1 != r2) goto L18
            return r2
        L18:
            boolean r3 = r0.compareAndSet(r11, r1, r2)
            if (r3 == 0) goto L1f
            goto L26
        L1f:
            java.lang.Object r3 = r0.get(r11)
            if (r3 == r1) goto L18
            r7 = 0
        L26:
            if (r7 != 0) goto L29
            goto L0
        L29:
            return r2
        L2a:
            boolean r9 = r11.j()
            if (r9 == 0) goto L31
            return r3
        L31:
            if (r6 != 0) goto L34
            return r2
        L34:
            boolean r9 = r6 instanceof defpackage.h32
            if (r9 == 0) goto L3e
            h32 r6 = (defpackage.h32) r6
            r6.a(r2)
            goto L0
        L3e:
            boolean r9 = r6 instanceof defpackage.bj2
            if (r9 == 0) goto L62
            if (r4 == 0) goto L5b
            bj2 r6 = (defpackage.bj2) r6
            mn1 r6 = r6.f475a
        L48:
            boolean r3 = r5.compareAndSet(r4, r2, r6)
            if (r3 == 0) goto L4f
            goto L56
        L4f:
            java.lang.Object r3 = r5.get(r4)
            if (r3 == r2) goto L48
            r7 = 0
        L56:
            if (r7 != 0) goto L59
            goto L0
        L59:
            r2 = r4
            goto L9
        L5b:
            java.lang.Object r2 = r0.get(r2)
            mn1 r2 = (defpackage.mn1) r2
            goto Lb
        L62:
            r4 = r6
            mn1 r4 = (defpackage.mn1) r4
            r10 = r4
            r4 = r2
            r2 = r10
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn1.e():mn1");
    }

    public final void f(mn1 mn1Var) {
        boolean z;
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3320b;
            mn1 mn1Var2 = (mn1) atomicReferenceFieldUpdater.get(mn1Var);
            if (g() != mn1Var) {
                return;
            }
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(mn1Var, mn1Var2, this)) {
                    z = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(mn1Var) != mn1Var2) {
                    z = false;
                    break;
                }
            }
        } while (!z);
        if (j()) {
            mn1Var.e();
        }
    }

    public final Object g() {
        while (true) {
            Object obj = f3319a.get(this);
            if (!(obj instanceof h32)) {
                return obj;
            }
            ((h32) obj).a(this);
        }
    }

    public final mn1 h() {
        bj2 bj2Var;
        mn1 mn1Var;
        Object g = g();
        if (g instanceof bj2) {
            bj2Var = (bj2) g;
        } else {
            bj2Var = null;
        }
        if (bj2Var == null || (mn1Var = bj2Var.f475a) == null) {
            return (mn1) g;
        }
        return mn1Var;
    }

    public final mn1 i() {
        mn1 e = e();
        if (e == null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3320b;
            Object obj = atomicReferenceFieldUpdater.get(this);
            while (true) {
                e = (mn1) obj;
                if (!e.j()) {
                    break;
                }
                obj = atomicReferenceFieldUpdater.get(e);
            }
        }
        return e;
    }

    public boolean j() {
        return g() instanceof bj2;
    }

    public String toString() {
        return new ln1(this) + '@' + pe0.u(this);
    }
}
