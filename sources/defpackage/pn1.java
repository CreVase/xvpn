package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class pn1 {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(pn1.class, Object.class, "_next");
    public static final AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(pn1.class, "_state");
    public static final pq0 g = new pq0("REMOVE_FROZEN", 6, 0);
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a, reason: collision with root package name */
    public final int f3878a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3879b;
    public final int c;
    public final AtomicReferenceArray d;

    public pn1(int i, boolean z) {
        boolean z2;
        this.f3878a = i;
        this.f3879b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 <= 1073741823) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if ((i & i2) == 0) {
                return;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0056, code lost:            return 1;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
        L4:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = defpackage.pn1.f
            long r2 = r8.get(r6)
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r9 = 0
            r4 = 1
            int r5 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r5 == 0) goto L1d
            r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r0 = r0 & r2
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 == 0) goto L1c
            r4 = 2
        L1c:
            return r4
        L1d:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            r11 = 0
            long r0 = r0 >> r11
            int r1 = (int) r0
            r12 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r12 = r12 & r2
            r0 = 30
            long r12 = r12 >> r0
            int r13 = (int) r12
            int r5 = r13 + 2
            int r12 = r6.c
            r5 = r5 & r12
            r14 = r1 & r12
            if (r5 != r14) goto L38
            return r4
        L38:
            boolean r5 = r6.f3879b
            java.util.concurrent.atomic.AtomicReferenceArray r14 = r6.d
            r15 = 1073741823(0x3fffffff, float:1.9999999)
            if (r5 != 0) goto L57
            r5 = r13 & r12
            java.lang.Object r5 = r14.get(r5)
            if (r5 == 0) goto L57
            r0 = 1024(0x400, float:1.435E-42)
            int r2 = r6.f3878a
            if (r2 < r0) goto L56
            int r13 = r13 - r1
            r0 = r13 & r15
            int r1 = r2 >> 1
            if (r0 <= r1) goto L4
        L56:
            return r4
        L57:
            int r1 = r13 + 1
            r1 = r1 & r15
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = defpackage.pn1.f
            r15 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r15 = r15 & r2
            long r9 = (long) r1
            long r0 = r9 << r0
            long r9 = r15 | r0
            r0 = r4
            r1 = r17
            r4 = r9
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L4
            r0 = r13 & r12
            r14.set(r0, r7)
            r0 = r6
        L77:
            long r1 = r8.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto La2
            pn1 r0 = r0.c()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.d
            int r2 = r0.c
            r2 = r2 & r13
            java.lang.Object r5 = r1.get(r2)
            boolean r9 = r5 instanceof defpackage.on1
            if (r9 == 0) goto L9f
            on1 r5 = (defpackage.on1) r5
            int r5 = r5.f3700a
            if (r5 != r13) goto L9f
            r1.set(r2, r7)
            goto La0
        L9f:
            r0 = 0
        La0:
            if (r0 != 0) goto L77
        La2:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pn1.a(java.lang.Object):int");
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    public final pn1 c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        while (true) {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = j | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            pn1 pn1Var = (pn1) atomicReferenceFieldUpdater.get(this);
            if (pn1Var != null) {
                return pn1Var;
            }
            pn1 pn1Var2 = new pn1(this.f3878a * 2, this.f3879b);
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = this.d.get(i4);
                if (obj == null) {
                    obj = new on1(i);
                }
                pn1Var2.d.set(pn1Var2.c & i, obj);
                i++;
            }
            atomicLongFieldUpdater.set(pn1Var2, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, pn1Var2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) ((1152921503533105152L & j) >> 30);
            int i2 = this.c;
            int i3 = ((int) ((j & 1073741823) >> 0)) & i2;
            if ((i & i2) == i3) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.d;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = this.f3879b;
            if (obj == null) {
                if (z) {
                    return null;
                }
            } else {
                if (obj instanceof on1) {
                    return null;
                }
                long j2 = ((r1 + 1) & 1073741823) << 0;
                if (atomicLongFieldUpdater.compareAndSet(this, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                if (z) {
                    pn1 pn1Var = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f;
                        long j3 = atomicLongFieldUpdater2.get(pn1Var);
                        int i4 = (int) ((j3 & 1073741823) >> 0);
                        if ((j3 & 1152921504606846976L) != 0) {
                            pn1Var = pn1Var.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(pn1Var, j3, (j3 & (-1073741824)) | j2)) {
                                pn1Var.d.set(pn1Var.c & i4, null);
                                pn1Var = null;
                            } else {
                                continue;
                            }
                        }
                        if (pn1Var == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
