package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class vu extends ul0 implements uu, ca0, do3 {
    public static final AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(vu.class, "_decisionAndIndex");
    public static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(vu.class, Object.class, "_state");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(vu.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;
    public final c90 d;
    public final t90 e;

    public vu(int i, c90 c90Var) {
        super(i);
        this.d = c90Var;
        this.e = c90Var.getContext();
        this._decisionAndIndex = 536870911;
        this._state = i5.f2538a;
    }

    public static Object C(l02 l02Var, Object obj, int i, x31 x31Var) {
        ou ouVar;
        if (!(obj instanceof d30)) {
            boolean z = true;
            if (i != 1 && i != 2) {
                z = false;
            }
            if (z) {
                if (x31Var != null || (l02Var instanceof ou)) {
                    if (l02Var instanceof ou) {
                        ouVar = (ou) l02Var;
                    } else {
                        ouVar = null;
                    }
                    return new b30(obj, ouVar, x31Var, (CancellationException) null, 16);
                }
                return obj;
            }
            return obj;
        }
        return obj;
    }

    public static void x(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public final void A(x31 x31Var, Object obj) {
        B(obj, this.c, x31Var);
    }

    public final void B(Object obj, int i, x31 x31Var) {
        boolean z;
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            z = true;
            if (obj2 instanceof l02) {
                Object C = C((l02) obj2, obj, i, x31Var);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, C)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        z = false;
                        break;
                    }
                }
            } else {
                if (obj2 instanceof yu) {
                    yu yuVar = (yu) obj2;
                    yuVar.getClass();
                    if (yu.c.compareAndSet(yuVar, 0, 1)) {
                        if (x31Var != null) {
                            m(x31Var, yuVar.f1723a);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
        } while (!z);
        if (!w()) {
            o();
        }
        p(i);
    }

    @Override // defpackage.do3
    public final void a(to2 to2Var, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        boolean z;
        do {
            atomicIntegerFieldUpdater = f;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) == 536870911) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        v(to2Var);
    }

    @Override // defpackage.ul0
    public final void b(Object obj, CancellationException cancellationException) {
        boolean z;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof l02)) {
                if (obj2 instanceof d30) {
                    return;
                }
                boolean z2 = false;
                if (obj2 instanceof b30) {
                    b30 b30Var = (b30) obj2;
                    if (b30Var.e != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        b30 a2 = b30.a(b30Var, null, cancellationException, 15);
                        while (true) {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, a2)) {
                                z2 = true;
                                break;
                            } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                break;
                            }
                        }
                        if (z2) {
                            ou ouVar = b30Var.f393b;
                            if (ouVar != null) {
                                k(ouVar, cancellationException);
                            }
                            x31 x31Var = b30Var.c;
                            if (x31Var != null) {
                                m(x31Var, cancellationException);
                                return;
                            }
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else {
                    b30 b30Var2 = new b30(obj2, (ou) null, (x31) null, cancellationException, 14);
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, b30Var2)) {
                            z2 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    if (z2) {
                        return;
                    }
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // defpackage.ul0
    public final c90 c() {
        return this.d;
    }

    @Override // defpackage.ul0
    public final Throwable d(Object obj) {
        Throwable d = super.d(obj);
        if (d == null) {
            return null;
        }
        return d;
    }

    @Override // defpackage.uu
    public final void e(v90 v90Var) {
        sl0 sl0Var;
        v90 v90Var2;
        int i;
        ch3 ch3Var = ch3.f636a;
        c90 c90Var = this.d;
        if (c90Var instanceof sl0) {
            sl0Var = (sl0) c90Var;
        } else {
            sl0Var = null;
        }
        if (sl0Var != null) {
            v90Var2 = sl0Var.d;
        } else {
            v90Var2 = null;
        }
        if (v90Var2 == v90Var) {
            i = 4;
        } else {
            i = this.c;
        }
        B(ch3Var, i, null);
    }

    @Override // defpackage.uu
    public final pq0 f(Object obj, x31 x31Var) {
        pq0 pq0Var;
        boolean z;
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z2 = obj2 instanceof l02;
            pq0Var = tf3.o;
            if (z2) {
                Object C = C((l02) obj2, obj, this.c, x31Var);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, C)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        z = false;
                        break;
                    }
                }
            } else {
                boolean z3 = obj2 instanceof b30;
                return null;
            }
        } while (!z);
        if (!w()) {
            o();
            return pq0Var;
        }
        return pq0Var;
    }

    @Override // defpackage.ul0
    public final Object g(Object obj) {
        if (obj instanceof b30) {
            return ((b30) obj).f392a;
        }
        return obj;
    }

    @Override // defpackage.ca0
    public final ca0 getCallerFrame() {
        c90 c90Var = this.d;
        if (c90Var instanceof ca0) {
            return (ca0) c90Var;
        }
        return null;
    }

    @Override // defpackage.c90
    public final t90 getContext() {
        return this.e;
    }

    @Override // defpackage.uu
    public final boolean i(Throwable th) {
        Object obj;
        boolean z;
        boolean z2;
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            obj = atomicReferenceFieldUpdater.get(this);
            z = false;
            if (!(obj instanceof l02)) {
                return false;
            }
            if (!(obj instanceof ou) && !(obj instanceof to2)) {
                z2 = false;
            } else {
                z2 = true;
            }
            yu yuVar = new yu(this, th, z2);
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, yuVar)) {
                    z = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
        } while (!z);
        l02 l02Var = (l02) obj;
        if (l02Var instanceof ou) {
            k((ou) obj, th);
        } else if (l02Var instanceof to2) {
            n((to2) obj, th);
        }
        if (!w()) {
            o();
        }
        p(this.c);
        return true;
    }

    @Override // defpackage.ul0
    public final Object j() {
        return g.get(this);
    }

    public final void k(ou ouVar, Throwable th) {
        try {
            ouVar.a(th);
        } catch (Throwable th2) {
            zf3.H(this.e, new j11("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.uu
    public final void l(Object obj) {
        p(this.c);
    }

    public final void m(x31 x31Var, Throwable th) {
        try {
            x31Var.invoke(th);
        } catch (Throwable th2) {
            zf3.H(this.e, new j11("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void n(to2 to2Var, Throwable th) {
        boolean z;
        t90 t90Var = this.e;
        int i = f.get(this) & 536870911;
        if (i != 536870911) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                to2Var.g(i, t90Var);
                return;
            } catch (Throwable th2) {
                zf3.H(t90Var, new j11("Exception in invokeOnCancellation handler for " + this, th2));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        yl0 yl0Var = (yl0) atomicReferenceFieldUpdater.get(this);
        if (yl0Var == null) {
            return;
        }
        yl0Var.d();
        atomicReferenceFieldUpdater.set(this, h02.f2351a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:            if (r10 != 4) goto L16;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:            r0 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:            r1 = r9.d;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:            if (r0 != false) goto L57;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:            if ((r1 instanceof defpackage.sl0) == false) goto L57;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:            if (r10 == 1) goto L26;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:            if (r10 != 2) goto L25;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:            r10 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:            r5 = r9.c;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:            if (r5 == 1) goto L32;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:            if (r5 != 2) goto L31;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:            r2 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:            if (r10 != r2) goto L57;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:            r10 = ((defpackage.sl0) r1).d;        r0 = r1.getContext();     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:            if (r10.L() == false) goto L37;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:            r10.K(r0, r9);     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:            r10 = defpackage.n83.a();     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:            if (r10.f3343b < 4294967296L) goto L40;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:            r3 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:            if (r3 == false) goto L45;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:            r0 = r10.d;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:            if (r0 != null) goto L44;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0079, code lost:            r0 = new defpackage.gg();        r10.d = r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:            r0.c(r9);     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:            r10.O(true);     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0087, code lost:            defpackage.t9.g0(r9, r1, true);     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:            if (r10.Q() != false) goto L67;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0091, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0093, code lost:            h(r0, null);     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009a, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009b, code lost:            r10.M(true);     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009e, code lost:            throw r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x004d, code lost:            r2 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0043, code lost:            r10 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009f, code lost:            defpackage.t9.g0(r9, r1, r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a2, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0032, code lost:            r0 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:            if (r0 == false) goto L13;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:            return;     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(int r10) {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.vu.f
            int r1 = r0.get(r9)
            int r2 = r1 >> 29
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1c
            if (r2 != r4) goto L10
            r0 = 0
            goto L2a
        L10:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L1c:
            r2 = 536870911(0x1fffffff, float:1.0842021E-19)
            r2 = r2 & r1
            r5 = 1073741824(0x40000000, float:2.0)
            int r2 = r2 + r5
            boolean r0 = r0.compareAndSet(r9, r1, r2)
            if (r0 == 0) goto L0
            r0 = 1
        L2a:
            if (r0 == 0) goto L2d
            return
        L2d:
            r0 = 4
            if (r10 != r0) goto L32
            r0 = 1
            goto L33
        L32:
            r0 = 0
        L33:
            c90 r1 = r9.d
            if (r0 != 0) goto L9f
            boolean r2 = r1 instanceof defpackage.sl0
            if (r2 == 0) goto L9f
            r2 = 2
            if (r10 == r4) goto L43
            if (r10 != r2) goto L41
            goto L43
        L41:
            r10 = 0
            goto L44
        L43:
            r10 = 1
        L44:
            int r5 = r9.c
            if (r5 == r4) goto L4d
            if (r5 != r2) goto L4b
            goto L4d
        L4b:
            r2 = 0
            goto L4e
        L4d:
            r2 = 1
        L4e:
            if (r10 != r2) goto L9f
            r10 = r1
            sl0 r10 = (defpackage.sl0) r10
            v90 r10 = r10.d
            t90 r0 = r1.getContext()
            boolean r2 = r10.L()
            if (r2 == 0) goto L63
            r10.K(r0, r9)
            goto La2
        L63:
            ms0 r10 = defpackage.n83.a()
            long r5 = r10.f3343b
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto L73
            r3 = 1
        L73:
            if (r3 == 0) goto L84
            gg r0 = r10.d
            if (r0 != 0) goto L80
            gg r0 = new gg
            r0.<init>()
            r10.d = r0
        L80:
            r0.c(r9)
            goto La2
        L84:
            r10.O(r4)
            defpackage.t9.g0(r9, r1, r4)     // Catch: java.lang.Throwable -> L91
        L8a:
            boolean r0 = r10.Q()     // Catch: java.lang.Throwable -> L91
            if (r0 != 0) goto L8a
            goto L96
        L91:
            r0 = move-exception
            r1 = 0
            r9.h(r0, r1)     // Catch: java.lang.Throwable -> L9a
        L96:
            r10.M(r4)
            goto La2
        L9a:
            r0 = move-exception
            r10.M(r4)
            throw r0
        L9f:
            defpackage.t9.g0(r9, r1, r0)
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vu.p(int):void");
    }

    public Throwable q(nf1 nf1Var) {
        return nf1Var.A();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:            if (((defpackage.yl0) defpackage.vu.h.get(r8)) != null) goto L16;     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:            t();     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:            if (r0 == false) goto L18;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:            z();     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:            return defpackage.ba0.f430a;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:            if (r0 == false) goto L22;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:            z();     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:            r0 = defpackage.vu.g.get(r8);     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:            if ((r0 instanceof defpackage.d30) != false) goto L38;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:            r1 = r8.c;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:            if (r1 == 1) goto L27;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:            if (r1 != 2) goto L28;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:            if (r4 == false) goto L36;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:            r1 = (defpackage.df1) r8.e.get(defpackage.d5.g);     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:            if (r1 == null) goto L36;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:            if (r1.a() == false) goto L34;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:            r1 = ((defpackage.nf1) r1).A();        b(r0, r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:            throw r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:            return g(r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005b, code lost:            r4 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:            throw ((defpackage.d30) r0).f1723a;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:            if (r1 == false) goto L20;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r() {
        /*
            r8 = this;
            boolean r0 = r8.w()
        L4:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.vu.f
            int r2 = r1.get(r8)
            int r3 = r2 >> 29
            r4 = 0
            r5 = 1
            r6 = 2
            if (r3 == 0) goto L21
            if (r3 != r6) goto L15
            r1 = 0
            goto L2f
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L21:
            r3 = 536870911(0x1fffffff, float:1.0842021E-19)
            r3 = r3 & r2
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            int r3 = r3 + r7
            boolean r1 = r1.compareAndSet(r8, r2, r3)
            if (r1 == 0) goto L4
            r1 = 1
        L2f:
            if (r1 == 0) goto L46
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.vu.h
            java.lang.Object r1 = r1.get(r8)
            yl0 r1 = (defpackage.yl0) r1
            if (r1 != 0) goto L3e
            r8.t()
        L3e:
            if (r0 == 0) goto L43
            r8.z()
        L43:
            ba0 r0 = defpackage.ba0.f430a
            return r0
        L46:
            if (r0 == 0) goto L4b
            r8.z()
        L4b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.vu.g
            java.lang.Object r0 = r0.get(r8)
            boolean r1 = r0 instanceof defpackage.d30
            if (r1 != 0) goto L80
            int r1 = r8.c
            if (r1 == r5) goto L5b
            if (r1 != r6) goto L5c
        L5b:
            r4 = 1
        L5c:
            if (r4 == 0) goto L7b
            d5 r1 = defpackage.d5.g
            t90 r2 = r8.e
            r90 r1 = r2.get(r1)
            df1 r1 = (defpackage.df1) r1
            if (r1 == 0) goto L7b
            boolean r2 = r1.a()
            if (r2 == 0) goto L71
            goto L7b
        L71:
            nf1 r1 = (defpackage.nf1) r1
            java.util.concurrent.CancellationException r1 = r1.A()
            r8.b(r0, r1)
            throw r1
        L7b:
            java.lang.Object r0 = r8.g(r0)
            return r0
        L80:
            d30 r0 = (defpackage.d30) r0
            java.lang.Throwable r0 = r0.f1723a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vu.r():java.lang.Object");
    }

    @Override // defpackage.c90
    public final void resumeWith(Object obj) {
        Throwable a2 = qk2.a(obj);
        if (a2 != null) {
            obj = new d30(false, a2);
        }
        B(obj, this.c, null);
    }

    public final void s() {
        yl0 t = t();
        if (t != null && (!(g.get(this) instanceof l02))) {
            t.d();
            h.set(this, h02.f2351a);
        }
    }

    public final yl0 t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        df1 df1Var = (df1) this.e.get(d5.g);
        if (df1Var == null) {
            return null;
        }
        yl0 Q = t9.Q(df1Var, true, new mz(this), 2);
        do {
            atomicReferenceFieldUpdater = h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, Q)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return Q;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(y());
        sb.append('(');
        sb.append(pe0.T(this.d));
        sb.append("){");
        Object obj = g.get(this);
        if (obj instanceof l02) {
            str = "Active";
        } else if (obj instanceof yu) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(pe0.u(this));
        return sb.toString();
    }

    public final void u(x31 x31Var) {
        ou nuVar;
        if (x31Var instanceof ou) {
            nuVar = (ou) x31Var;
        } else {
            nuVar = new nu(x31Var, 2);
        }
        v(nuVar);
    }

    public final void v(Object obj) {
        boolean z;
        boolean z2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z3 = false;
            if (obj2 instanceof i5) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, obj)) {
                        z3 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (z3) {
                    return;
                }
            } else {
                if (obj2 instanceof ou) {
                    z = true;
                } else {
                    z = obj2 instanceof to2;
                }
                Throwable th = null;
                if (!z) {
                    boolean z4 = obj2 instanceof d30;
                    if (z4) {
                        d30 d30Var = (d30) obj2;
                        d30Var.getClass();
                        if (d30.f1722b.compareAndSet(d30Var, 0, 1)) {
                            if (obj2 instanceof yu) {
                                if (!z4) {
                                    d30Var = null;
                                }
                                if (d30Var != null) {
                                    th = d30Var.f1723a;
                                }
                                if (obj instanceof ou) {
                                    k((ou) obj, th);
                                    return;
                                } else {
                                    n((to2) obj, th);
                                    return;
                                }
                            }
                            return;
                        }
                        x(obj, obj2);
                        throw null;
                    }
                    if (obj2 instanceof b30) {
                        b30 b30Var = (b30) obj2;
                        if (b30Var.f393b == null) {
                            if (obj instanceof to2) {
                                return;
                            }
                            ou ouVar = (ou) obj;
                            Throwable th2 = b30Var.e;
                            if (th2 != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                k(ouVar, th2);
                                return;
                            }
                            b30 a2 = b30.a(b30Var, ouVar, null, 29);
                            while (true) {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, a2)) {
                                    z3 = true;
                                    break;
                                } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    break;
                                }
                            }
                            if (z3) {
                                return;
                            }
                        } else {
                            x(obj, obj2);
                            throw null;
                        }
                    } else {
                        if (obj instanceof to2) {
                            return;
                        }
                        b30 b30Var2 = new b30(obj2, (ou) obj, (x31) null, (CancellationException) null, 28);
                        while (true) {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, b30Var2)) {
                                z3 = true;
                                break;
                            } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                break;
                            }
                        }
                        if (z3) {
                            return;
                        }
                    }
                } else {
                    x(obj, obj2);
                    throw null;
                }
            }
        }
    }

    public final boolean w() {
        boolean z;
        boolean z2;
        if (this.c == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sl0 sl0Var = (sl0) this.d;
            sl0Var.getClass();
            if (sl0.h.get(sl0Var) != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public String y() {
        return "CancellableContinuation";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:            if (r2 != null) goto L29;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:            o();        i(r2);     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:            return;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z() {
        /*
            r7 = this;
            c90 r0 = r7.d
            boolean r1 = r0 instanceof defpackage.sl0
            r2 = 0
            if (r1 == 0) goto La
            sl0 r0 = (defpackage.sl0) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 == 0) goto L6f
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.sl0.h
            java.lang.Object r3 = r1.get(r0)
            pq0 r4 = defpackage.tf3.q
            r5 = 1
            r6 = 0
            if (r3 != r4) goto L2a
        L19:
            boolean r3 = r1.compareAndSet(r0, r4, r7)
            if (r3 == 0) goto L20
            goto L27
        L20:
            java.lang.Object r3 = r1.get(r0)
            if (r3 == r4) goto L19
            r5 = 0
        L27:
            if (r5 == 0) goto Ld
            goto L41
        L2a:
            boolean r4 = r3 instanceof java.lang.Throwable
            if (r4 == 0) goto L57
        L2e:
            boolean r4 = r1.compareAndSet(r0, r3, r2)
            if (r4 == 0) goto L35
            goto L3c
        L35:
            java.lang.Object r4 = r1.get(r0)
            if (r4 == r3) goto L2e
            r5 = 0
        L3c:
            if (r5 == 0) goto L4b
            r2 = r3
            java.lang.Throwable r2 = (java.lang.Throwable) r2
        L41:
            if (r2 != 0) goto L44
            goto L6f
        L44:
            r7.o()
            r7.i(r2)
            return
        L4b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L57:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Inconsistent state "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vu.z():void");
    }
}
