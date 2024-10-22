package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class or implements jw {
    public static final AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(or.class, "sendersAndCloseStatus");
    public static final AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(or.class, "receivers");
    public static final AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(or.class, "bufferEnd");
    public static final AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(or.class, "completedExpandBuffersAndPauseFlag");
    public static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(or.class, Object.class, "sendSegment");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(or.class, Object.class, "receiveSegment");
    public static final AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(or.class, Object.class, "bufferEndSegment");
    public static final AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(or.class, Object.class, "_closeCause");
    public static final AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(or.class, Object.class, "closeHandler");
    private volatile Object _closeCause;

    /* renamed from: a, reason: collision with root package name */
    public final int f3715a;

    /* renamed from: b, reason: collision with root package name */
    public final x31 f3716b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public or(int i2, x31 x31Var) {
        boolean z;
        long j2;
        this.f3715a = i2;
        this.f3716b = x31Var;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            qw qwVar = qr.f4042a;
            if (i2 != 0) {
                if (i2 != Integer.MAX_VALUE) {
                    j2 = i2;
                } else {
                    j2 = Long.MAX_VALUE;
                }
            } else {
                j2 = 0;
            }
            this.bufferEnd = j2;
            this.completedExpandBuffersAndPauseFlag = p();
            qw qwVar2 = new qw(0L, null, this, 3);
            this.sendSegment = qwVar2;
            this.receiveSegment = qwVar2;
            this.bufferEndSegment = z() ? qr.f4042a : qwVar2;
            this._closeCause = qr.s;
            return;
        }
        throw new IllegalArgumentException(p71.k("Invalid channel capacity: ", i2, ", should be >=0").toString());
    }

    public static boolean D(Object obj) {
        if (obj instanceof uu) {
            return qr.a((uu) obj, ch3.f636a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public static final qw a(or orVar, long j2, qw qwVar) {
        Object F;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        long j4;
        int i2;
        boolean z;
        orVar.getClass();
        qw qwVar2 = qr.f4042a;
        pr prVar = pr.f3902b;
        do {
            F = t9.F(qwVar, j2, prVar);
            if (zf3.O(F)) {
                break;
            }
            to2 F2 = zf3.F(F);
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
                to2 to2Var = (to2) atomicReferenceFieldUpdater.get(orVar);
                z = true;
                if (to2Var.c >= F2.c) {
                    break;
                }
                boolean z2 = false;
                if (!F2.i()) {
                    z = false;
                    break;
                }
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(orVar, to2Var, F2)) {
                        z2 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(orVar) != to2Var) {
                        break;
                    }
                }
                if (z2) {
                    if (to2Var.e()) {
                        to2Var.d();
                    }
                } else if (F2.e()) {
                    F2.d();
                }
            }
        } while (!z);
        if (zf3.O(F)) {
            orVar.k();
            if (qwVar.c * qr.f4043b < orVar.s()) {
                qwVar.a();
            }
        } else {
            qw qwVar3 = (qw) zf3.F(F);
            long j5 = qwVar3.c;
            if (j5 > j2) {
                long j6 = j5 * qr.f4043b;
                do {
                    atomicLongFieldUpdater = c;
                    j3 = atomicLongFieldUpdater.get(orVar);
                    j4 = 1152921504606846975L & j3;
                    if (j4 >= j6) {
                        break;
                    }
                    i2 = (int) (j3 >> 60);
                    qw qwVar4 = qr.f4042a;
                } while (!atomicLongFieldUpdater.compareAndSet(orVar, j3, (i2 << 60) + j4));
                if (qwVar3.c * qr.f4043b < orVar.s()) {
                    qwVar3.a();
                }
            } else {
                return qwVar3;
            }
        }
        return null;
    }

    public static final int d(or orVar, qw qwVar, int i2, Object obj, long j2, pq0 pq0Var, boolean z) {
        orVar.getClass();
        qwVar.m(i2, obj);
        if (z) {
            return orVar.F(qwVar, i2, obj, j2, pq0Var, z);
        }
        Object k2 = qwVar.k(i2);
        if (k2 == null) {
            if (orVar.e(j2)) {
                if (qwVar.j(i2, null, qr.d)) {
                    return 1;
                }
            } else {
                if (pq0Var == null) {
                    return 3;
                }
                if (qwVar.j(i2, null, pq0Var)) {
                    return 2;
                }
            }
        } else if (k2 instanceof do3) {
            qwVar.m(i2, null);
            if (orVar.C(k2, obj)) {
                qwVar.n(i2, qr.i);
                return 0;
            }
            pq0 pq0Var2 = qr.k;
            if (qwVar.f.getAndSet((i2 * 2) + 1, pq0Var2) != pq0Var2) {
                qwVar.l(i2, true);
            }
            return 5;
        }
        return orVar.F(qwVar, i2, obj, j2, pq0Var, z);
    }

    public final void A(long j2, qw qwVar) {
        boolean z;
        qw qwVar2;
        qw qwVar3;
        while (qwVar.c < j2 && (qwVar3 = (qw) qwVar.b()) != null) {
            qwVar = qwVar3;
        }
        while (true) {
            if (qwVar.c() && (qwVar2 = (qw) qwVar.b()) != null) {
                qwVar = qwVar2;
            } else {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
                    to2 to2Var = (to2) atomicReferenceFieldUpdater.get(this);
                    z = true;
                    if (to2Var.c >= qwVar.c) {
                        break;
                    }
                    boolean z2 = false;
                    if (!qwVar.i()) {
                        z = false;
                        break;
                    }
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, to2Var, qwVar)) {
                            z2 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater.get(this) != to2Var) {
                            break;
                        }
                    }
                    if (z2) {
                        if (to2Var.e()) {
                            to2Var.d();
                        }
                    } else if (qwVar.e()) {
                        qwVar.d();
                    }
                }
                if (z) {
                    return;
                }
            }
        }
    }

    public final void B(do3 do3Var, boolean z) {
        Throwable t;
        if (do3Var instanceof uu) {
            c90 c90Var = (c90) do3Var;
            if (z) {
                t = r();
            } else {
                t = t();
            }
            c90Var.resumeWith(new pk2(t));
            return;
        }
        if (do3Var instanceof nr) {
            nr nrVar = (nr) do3Var;
            vu vuVar = nrVar.f3522b;
            nrVar.f3522b = null;
            nrVar.f3521a = qr.l;
            Throwable q = nrVar.c.q();
            if (q == null) {
                vuVar.resumeWith(Boolean.FALSE);
                return;
            } else {
                vuVar.resumeWith(new pk2(q));
                return;
            }
        }
        throw new IllegalStateException(("Unexpected waiter: " + do3Var).toString());
    }

    public final boolean C(Object obj, Object obj2) {
        su2 su2Var = null;
        if (obj instanceof nr) {
            nr nrVar = (nr) obj;
            vu vuVar = nrVar.f3522b;
            nrVar.f3522b = null;
            nrVar.f3521a = obj2;
            Boolean bool = Boolean.TRUE;
            x31 x31Var = nrVar.c.f3716b;
            if (x31Var != null) {
                su2Var = t9.o(x31Var, obj2, vuVar.e);
            }
            return qr.a(vuVar, bool, su2Var);
        }
        if (obj instanceof uu) {
            uu uuVar = (uu) obj;
            x31 x31Var2 = this.f3716b;
            if (x31Var2 != null) {
                su2Var = t9.o(x31Var2, obj2, uuVar.getContext());
            }
            return qr.a(uuVar, obj2, su2Var);
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    public final Object E(qw qwVar, int i2, long j2, Object obj) {
        Object k2 = qwVar.k(i2);
        AtomicReferenceArray atomicReferenceArray = qwVar.f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c;
        if (k2 == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return qr.n;
                }
                if (qwVar.j(i2, k2, obj)) {
                    n();
                    return qr.m;
                }
            }
        } else if (k2 == qr.d && qwVar.j(i2, k2, qr.i)) {
            n();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            qwVar.m(i2, null);
            return obj2;
        }
        while (true) {
            Object k3 = qwVar.k(i2);
            if (k3 != null && k3 != qr.e) {
                if (k3 == qr.d) {
                    if (qwVar.j(i2, k3, qr.i)) {
                        n();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        qwVar.m(i2, null);
                        return obj3;
                    }
                } else {
                    pq0 pq0Var = qr.j;
                    if (k3 == pq0Var) {
                        return qr.o;
                    }
                    if (k3 == qr.h) {
                        return qr.o;
                    }
                    if (k3 == qr.l) {
                        n();
                        return qr.o;
                    }
                    if (k3 != qr.g && qwVar.j(i2, k3, qr.f)) {
                        boolean z = k3 instanceof eo3;
                        if (z) {
                            k3 = ((eo3) k3).f1968a;
                        }
                        if (D(k3)) {
                            qwVar.n(i2, qr.i);
                            n();
                            Object obj4 = atomicReferenceArray.get(i2 * 2);
                            qwVar.m(i2, null);
                            return obj4;
                        }
                        qwVar.n(i2, pq0Var);
                        qwVar.l(i2, false);
                        if (z) {
                            n();
                        }
                        return qr.o;
                    }
                }
            } else if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (qwVar.j(i2, k3, qr.h)) {
                    n();
                    return qr.o;
                }
            } else {
                if (obj == null) {
                    return qr.n;
                }
                if (qwVar.j(i2, k3, obj)) {
                    n();
                    return qr.m;
                }
            }
        }
    }

    public final int F(qw qwVar, int i2, Object obj, long j2, pq0 pq0Var, boolean z) {
        while (true) {
            Object k2 = qwVar.k(i2);
            if (k2 == null) {
                if (e(j2) && !z) {
                    if (qwVar.j(i2, null, qr.d)) {
                        return 1;
                    }
                } else if (z) {
                    if (qwVar.j(i2, null, qr.j)) {
                        qwVar.l(i2, false);
                        return 4;
                    }
                } else {
                    if (pq0Var == null) {
                        return 3;
                    }
                    if (qwVar.j(i2, null, pq0Var)) {
                        return 2;
                    }
                }
            } else if (k2 == qr.e) {
                if (qwVar.j(i2, k2, qr.d)) {
                    return 1;
                }
            } else {
                pq0 pq0Var2 = qr.k;
                if (k2 == pq0Var2) {
                    qwVar.m(i2, null);
                    return 5;
                }
                if (k2 == qr.h) {
                    qwVar.m(i2, null);
                    return 5;
                }
                if (k2 == qr.l) {
                    qwVar.m(i2, null);
                    k();
                    return 4;
                }
                qwVar.m(i2, null);
                if (k2 instanceof eo3) {
                    k2 = ((eo3) k2).f1968a;
                }
                if (C(k2, obj)) {
                    qwVar.n(i2, qr.i);
                    return 0;
                }
                if (qwVar.f.getAndSet((i2 * 2) + 1, pq0Var2) != pq0Var2) {
                    qwVar.l(i2, true);
                }
                return 5;
            }
        }
    }

    public final void G(long j2) {
        long j3;
        boolean z;
        long j4;
        if (z()) {
            return;
        }
        do {
        } while (p() <= j2);
        int i2 = qr.c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            if (i3 < i2) {
                long p = p();
                if (p == (atomicLongFieldUpdater.get(this) & 4611686018427387903L) && p == p()) {
                    return;
                } else {
                    i3++;
                }
            } else {
                do {
                    j3 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(this, j3, 4611686018427387904L + (j3 & 4611686018427387903L)));
                while (true) {
                    long p2 = p();
                    long j5 = atomicLongFieldUpdater.get(this);
                    long j6 = j5 & 4611686018427387903L;
                    if ((j5 & 4611686018427387904L) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (p2 == j6 && p2 == p()) {
                        break;
                    } else if (!z) {
                        atomicLongFieldUpdater.compareAndSet(this, j5, j6 + 4611686018427387904L);
                    }
                }
                do {
                    j4 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(this, j4, 0 + (j4 & 4611686018427387903L)));
                return;
            }
        }
    }

    @Override // defpackage.yg2
    public final Object b() {
        do3 do3Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = d;
        long j2 = atomicLongFieldUpdater.get(this);
        long j3 = c.get(this);
        if (w(j3, true)) {
            return new ow(q());
        }
        long j4 = j3 & 1152921504606846975L;
        Object obj = zf3.e;
        if (j2 >= j4) {
            return obj;
        }
        Object obj2 = qr.k;
        qw qwVar = (qw) h.get(this);
        while (!x()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j5 = qr.f4043b;
            long j6 = andIncrement / j5;
            int i2 = (int) (andIncrement % j5);
            if (qwVar.c != j6) {
                qw o = o(j6, qwVar);
                if (o == null) {
                    continue;
                } else {
                    qwVar = o;
                }
            }
            Object E = E(qwVar, i2, andIncrement, obj2);
            if (E == qr.m) {
                if (obj2 instanceof do3) {
                    do3Var = (do3) obj2;
                } else {
                    do3Var = null;
                }
                if (do3Var != null) {
                    do3Var.a(qwVar, i2);
                }
                G(andIncrement);
                qwVar.h();
            } else if (E == qr.o) {
                if (andIncrement < u()) {
                    qwVar.a();
                }
            } else if (E != qr.n) {
                qwVar.a();
                obj = E;
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
            return obj;
        }
        return new ow(q());
    }

    @Override // defpackage.yg2
    public final void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        f(true, cancellationException);
    }

    public final boolean e(long j2) {
        if (j2 >= p() && j2 >= s() + this.f3715a) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:            r0 = defpackage.qr.s;     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:            r1 = defpackage.or.j;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:            if (r1.compareAndSet(r15, r0, r17) == false) goto L12;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:            if (r1.get(r15) == r0) goto L50;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:            r13 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:            if (r16 == false) goto L20;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:            r2 = r10.get(r15);        r4 = defpackage.qr.f4042a;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:            if (r10.compareAndSet(r15, r2, (3 << 60) + (r2 & 1152921504606846975L)) == false) goto L52;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:            k();     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:            if (r13 == false) goto L44;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:            r0 = defpackage.or.k;        r1 = r0.get(r15);     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:            if (r1 != null) goto L33;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:            r2 = defpackage.qr.q;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:            if (r0.compareAndSet(r15, r1, r2) == false) goto L37;     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000b, code lost:            if (r16 != false) goto L4;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:            if (r0.get(r15) == r1) goto L60;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:            r0 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0095, code lost:            if (r0 == false) goto L56;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:            if (r1 != null) goto L43;     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:            defpackage.fl.d(1, r1);        ((defpackage.x31) r1).invoke(q());     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000d, code lost:            r2 = r10.get(r15);     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:            r0 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0084, code lost:            r2 = defpackage.qr.r;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a6, code lost:            return r13;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0052, code lost:            r2 = r10.get(r15);        r1 = (int) (r2 >> 60);     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0059, code lost:            if (r1 == 0) goto L25;     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:            if (((int) (r2 >> 60)) != 0) goto L46;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x005b, code lost:            if (r1 == 1) goto L24;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x005e, code lost:            r0 = r2 & 1152921504606846975L;        r4 = defpackage.qr.f4042a;        r4 = 3;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0072, code lost:            if (r10.compareAndSet(r15, r2, (r4 << 60) + r0) == false) goto L63;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0064, code lost:            r0 = r2 & 1152921504606846975L;        r4 = defpackage.qr.f4042a;        r4 = 2;     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:            r4 = defpackage.qr.f4042a;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0032, code lost:            r13 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:            if (r10.compareAndSet(r15, r2, (1 << 60) + (r2 & 1152921504606846975L)) == false) goto L47;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(boolean r16, java.lang.Throwable r17) {
        /*
            r15 = this;
            r6 = r15
            r7 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            r9 = 60
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = defpackage.or.c
            r11 = 1
            if (r16 == 0) goto L25
        Ld:
            long r2 = r10.get(r15)
            long r0 = r2 >> r9
            int r1 = (int) r0
            if (r1 != 0) goto L25
            long r0 = r2 & r7
            qw r4 = defpackage.qr.f4042a
            long r4 = (long) r11
            long r4 = r4 << r9
            long r4 = r4 + r0
            r0 = r10
            r1 = r15
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto Ld
        L25:
            pq0 r0 = defpackage.qr.s
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.or.j
            r2 = r17
            boolean r3 = r1.compareAndSet(r15, r0, r2)
            r12 = 0
            if (r3 == 0) goto L34
            r13 = 1
            goto L3b
        L34:
            java.lang.Object r1 = r1.get(r15)
            if (r1 == r0) goto L27
            r13 = 0
        L3b:
            r14 = 3
            if (r16 == 0) goto L52
        L3e:
            long r2 = r10.get(r15)
            long r0 = r2 & r7
            qw r4 = defpackage.qr.f4042a
            long r4 = (long) r14
            long r4 = r4 << r9
            long r4 = r4 + r0
            r0 = r10
            r1 = r15
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L3e
            goto L74
        L52:
            long r2 = r10.get(r15)
            long r0 = r2 >> r9
            int r1 = (int) r0
            if (r1 == 0) goto L64
            if (r1 == r11) goto L5e
            goto L74
        L5e:
            long r0 = r2 & r7
            qw r4 = defpackage.qr.f4042a
            r4 = 3
            goto L69
        L64:
            long r0 = r2 & r7
            qw r4 = defpackage.qr.f4042a
            r4 = 2
        L69:
            long r4 = (long) r4
            long r4 = r4 << r9
            long r4 = r4 + r0
            r0 = r10
            r1 = r15
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L52
        L74:
            r15.k()
            if (r13 == 0) goto La6
        L79:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.or.k
            java.lang.Object r1 = r0.get(r15)
            if (r1 != 0) goto L84
            pq0 r2 = defpackage.qr.q
            goto L86
        L84:
            pq0 r2 = defpackage.qr.r
        L86:
            boolean r3 = r0.compareAndSet(r15, r1, r2)
            if (r3 == 0) goto L8e
            r0 = 1
            goto L95
        L8e:
            java.lang.Object r3 = r0.get(r15)
            if (r3 == r1) goto L86
            r0 = 0
        L95:
            if (r0 == 0) goto L79
            if (r1 != 0) goto L9a
            goto La6
        L9a:
            defpackage.fl.d(r11, r1)
            x31 r1 = (defpackage.x31) r1
            java.lang.Throwable r0 = r15.q()
            r1.invoke(r0)
        La6:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.or.f(boolean, java.lang.Throwable):boolean");
    }

    @Override // defpackage.ep2
    public final boolean g(Throwable th) {
        return f(false, th);
    }

    @Override // defpackage.ep2
    public final void h(fv2 fv2Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z;
        boolean z2;
        while (true) {
            atomicReferenceFieldUpdater = k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, fv2Var)) {
                z = true;
                break;
            } else if (atomicReferenceFieldUpdater.get(this) != null) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            pq0 pq0Var = qr.q;
            if (obj == pq0Var) {
                pq0 pq0Var2 = qr.r;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, pq0Var, pq0Var2)) {
                        z2 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != pq0Var) {
                        z2 = false;
                        break;
                    }
                }
            } else {
                if (obj == qr.r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!z2);
        fv2Var.invoke(q());
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0098, code lost:            r1 = (defpackage.qw) ((defpackage.s40) defpackage.s40.f4270b.get(r1));     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.qw i(long r14) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.or.i(long):qw");
    }

    @Override // defpackage.yg2
    public final nr iterator() {
        return new nr(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d6, code lost:            return r1;     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ep2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object j(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.or.j(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ep2
    public final boolean k() {
        return w(c.get(this), false);
    }

    public final void l(long j2) {
        j11 s;
        qw qwVar = (qw) h.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = d;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.f3715a + j3, p())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, j3 + 1)) {
                long j4 = qr.f4043b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (qwVar.c != j5) {
                    qw o = o(j5, qwVar);
                    if (o == null) {
                        continue;
                    } else {
                        qwVar = o;
                    }
                }
                Object E = E(qwVar, i2, j3, null);
                if (E == qr.o) {
                    if (j3 < u()) {
                        qwVar.a();
                    }
                } else {
                    qwVar.a();
                    x31 x31Var = this.f3716b;
                    if (x31Var != null && (s = t9.s(x31Var, E, null)) != null) {
                        throw s;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fb, code lost:            r16 = defpackage.t9.o(r0, r1, r12);     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ff, code lost:            r14.A(r16, r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f9, code lost:            if (r0 != null) goto L61;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [pq0] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [vu] */
    /* JADX WARN: Type inference failed for: r17v0, types: [or, java.lang.Object] */
    @Override // defpackage.yg2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(defpackage.tu2 r18) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.or.m(tu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.or.n():void");
    }

    public final qw o(long j2, qw qwVar) {
        Object F;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        boolean z;
        boolean z2;
        boolean z3;
        qw qwVar2 = qr.f4042a;
        pr prVar = pr.f3902b;
        do {
            F = t9.F(qwVar, j2, prVar);
            if (zf3.O(F)) {
                break;
            }
            to2 F2 = zf3.F(F);
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
                to2 to2Var = (to2) atomicReferenceFieldUpdater.get(this);
                if (to2Var.c >= F2.c) {
                    break;
                }
                if (!F2.i()) {
                    z2 = false;
                    break;
                }
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, to2Var, F2)) {
                        z3 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != to2Var) {
                        z3 = false;
                        break;
                    }
                }
                if (z3) {
                    if (to2Var.e()) {
                        to2Var.d();
                    }
                } else if (F2.e()) {
                    F2.d();
                }
            }
            z2 = true;
        } while (!z2);
        if (zf3.O(F)) {
            k();
            if (qwVar.c * qr.f4043b < u()) {
                qwVar.a();
            }
        } else {
            qw qwVar3 = (qw) zf3.F(F);
            boolean z4 = z();
            long j4 = qwVar3.c;
            if (!z4 && j2 <= p() / qr.f4043b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = i;
                    to2 to2Var2 = (to2) atomicReferenceFieldUpdater2.get(this);
                    if (to2Var2.c >= j4) {
                        break;
                    }
                    if (!qwVar3.i()) {
                        break;
                    }
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, to2Var2, qwVar3)) {
                            z = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater2.get(this) != to2Var2) {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        if (to2Var2.e()) {
                            to2Var2.d();
                        }
                    } else if (qwVar3.e()) {
                        qwVar3.d();
                    }
                }
            }
            if (j4 > j2) {
                long j5 = j4 * qr.f4043b;
                do {
                    atomicLongFieldUpdater = d;
                    j3 = atomicLongFieldUpdater.get(this);
                    if (j3 >= j5) {
                        break;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(this, j3, j5));
                if (qwVar3.c * qr.f4043b < u()) {
                    qwVar3.a();
                }
            } else {
                return qwVar3;
            }
        }
        return null;
    }

    public final long p() {
        return e.get(this);
    }

    public final Throwable q() {
        return (Throwable) j.get(this);
    }

    public final Throwable r() {
        Throwable q = q();
        if (q == null) {
            return new j10();
        }
        return q;
    }

    public final long s() {
        return d.get(this);
    }

    public final Throwable t() {
        Throwable q = q();
        if (q == null) {
            return new k10("Channel was closed");
        }
        return q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x01a0, code lost:            r3 = (defpackage.qw) r3.b();     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.or.toString():java.lang.String");
    }

    public final long u() {
        return c.get(this) & 1152921504606846975L;
    }

    public final void v(long j2) {
        boolean z;
        boolean z2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f;
        if ((atomicLongFieldUpdater.addAndGet(this, j2) & 4611686018427387904L) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        do {
            if ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        } while (z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x00bf, code lost:            r13 = (defpackage.qw) ((defpackage.s40) defpackage.s40.f4270b.get(r13));     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w(long r13, boolean r15) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.or.w(long, boolean):boolean");
    }

    public final boolean x() {
        return w(c.get(this), true);
    }

    public boolean y() {
        return false;
    }

    public final boolean z() {
        long p = p();
        if (p != 0 && p != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }
}
