package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class nf1 implements df1, qz, q42 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3451a = AtomicReferenceFieldUpdater.newUpdater(nf1.class, Object.class, "_state");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3452b = AtomicReferenceFieldUpdater.newUpdater(nf1.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public nf1(boolean z) {
        xq0 xq0Var;
        if (z) {
            xq0Var = fl.m;
        } else {
            xq0Var = fl.l;
        }
        this._state = xq0Var;
    }

    public static oz N(mn1 mn1Var) {
        while (mn1Var.j()) {
            mn1Var = mn1Var.i();
        }
        while (true) {
            mn1Var = mn1Var.h();
            if (!mn1Var.j()) {
                if (mn1Var instanceof oz) {
                    return (oz) mn1Var;
                }
                if (mn1Var instanceof g02) {
                    return null;
                }
            }
        }
    }

    public static String T(Object obj) {
        if (obj instanceof lf1) {
            lf1 lf1Var = (lf1) obj;
            if (lf1Var.e()) {
                return "Cancelling";
            }
            if (lf1Var.f()) {
                return "Completing";
            }
        } else if (obj instanceof vb1) {
            if (!((vb1) obj).a()) {
                return "New";
            }
        } else {
            if (obj instanceof d30) {
                return "Cancelled";
            }
            return "Completed";
        }
        return "Active";
    }

    public final CancellationException A() {
        Object F = F();
        CancellationException cancellationException = null;
        if (F instanceof lf1) {
            Throwable d = ((lf1) F).d();
            if (d != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (d instanceof CancellationException) {
                    cancellationException = (CancellationException) d;
                }
                if (cancellationException == null) {
                    if (concat == null) {
                        concat = u();
                    }
                    return new ef1(concat, d, this);
                }
                return cancellationException;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (!(F instanceof vb1)) {
            if (F instanceof d30) {
                Throwable th = ((d30) F).f1723a;
                if (th instanceof CancellationException) {
                    cancellationException = (CancellationException) th;
                }
                if (cancellationException == null) {
                    return new ef1(u(), th, this);
                }
                return cancellationException;
            }
            return new ef1(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public final Object B() {
        Object F = F();
        if (!(F instanceof vb1)) {
            if (!(F instanceof d30)) {
                return fl.f0(F);
            }
            throw ((d30) F).f1723a;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    public boolean C() {
        return true;
    }

    public boolean D() {
        return this instanceof a30;
    }

    public final g02 E(vb1 vb1Var) {
        g02 c = vb1Var.c();
        if (c == null) {
            if (vb1Var instanceof xq0) {
                return new g02();
            }
            if (vb1Var instanceof if1) {
                R((if1) vb1Var);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + vb1Var).toString());
        }
        return c;
    }

    public final Object F() {
        while (true) {
            Object obj = f3451a.get(this);
            if (!(obj instanceof h32)) {
                return obj;
            }
            ((h32) obj).a(this);
        }
    }

    public boolean G(Throwable th) {
        return false;
    }

    public final void I(df1 df1Var) {
        int S;
        h02 h02Var = h02.f2351a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3452b;
        if (df1Var == null) {
            atomicReferenceFieldUpdater.set(this, h02Var);
            return;
        }
        nf1 nf1Var = (nf1) df1Var;
        do {
            S = nf1Var.S(nf1Var.F());
            if (S == 0) {
                break;
            }
        } while (S != 1);
        nz nzVar = (nz) t9.Q(nf1Var, true, new oz(this), 2);
        atomicReferenceFieldUpdater.set(this, nzVar);
        if (!(F() instanceof vb1)) {
            nzVar.d();
            atomicReferenceFieldUpdater.set(this, h02Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [ub1] */
    public final yl0 J(boolean z, boolean z2, x31 x31Var) {
        if1 if1Var;
        boolean z3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        d30 d30Var;
        Throwable th;
        int i = 0;
        Throwable th2 = null;
        if (z) {
            if (x31Var instanceof ff1) {
                if1Var = (ff1) x31Var;
            } else {
                if1Var = null;
            }
            if (if1Var == null) {
                if1Var = new oe1(x31Var);
            }
        } else {
            if (x31Var instanceof if1) {
                if1Var = (if1) x31Var;
            } else {
                if1Var = null;
            }
            if (if1Var == null) {
                if1Var = new pe1(x31Var, i);
            }
        }
        if1Var.d = this;
        while (true) {
            Object F = F();
            if (F instanceof xq0) {
                xq0 xq0Var = (xq0) F;
                if (xq0Var.f5204a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3451a;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, F, if1Var)) {
                            z3 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater2.get(this) != F) {
                            z3 = false;
                            break;
                        }
                    }
                    if (z3) {
                        return if1Var;
                    }
                } else {
                    g02 g02Var = new g02();
                    if (!xq0Var.f5204a) {
                        g02Var = new ub1(g02Var);
                    }
                    do {
                        atomicReferenceFieldUpdater = f3451a;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, xq0Var, g02Var)) {
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == xq0Var);
                }
            } else if (F instanceof vb1) {
                g02 c = ((vb1) F).c();
                if (c == null) {
                    R((if1) F);
                } else {
                    yl0 yl0Var = h02.f2351a;
                    if (z && (F instanceof lf1)) {
                        synchronized (F) {
                            th = ((lf1) F).d();
                            if (th == null || ((x31Var instanceof oz) && !((lf1) F).f())) {
                                if (n(F, c, if1Var)) {
                                    if (th == null) {
                                        return if1Var;
                                    }
                                    yl0Var = if1Var;
                                }
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z2) {
                            x31Var.invoke(th);
                        }
                        return yl0Var;
                    }
                    if (n(F, c, if1Var)) {
                        return if1Var;
                    }
                }
            } else {
                if (z2) {
                    if (F instanceof d30) {
                        d30Var = (d30) F;
                    } else {
                        d30Var = null;
                    }
                    if (d30Var != null) {
                        th2 = d30Var.f1723a;
                    }
                    x31Var.invoke(th2);
                }
                return h02.f2351a;
            }
        }
    }

    public boolean K() {
        return this instanceof jq;
    }

    public final Object L(Object obj) {
        Object U;
        d30 d30Var;
        do {
            U = U(F(), obj);
            if (U == fl.g) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof d30) {
                    d30Var = (d30) obj;
                } else {
                    d30Var = null;
                }
                if (d30Var != null) {
                    th = d30Var.f1723a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (U == fl.i);
        return U;
    }

    public String M() {
        return getClass().getSimpleName();
    }

    public final void O(g02 g02Var, Throwable th) {
        j11 j11Var = null;
        for (mn1 mn1Var = (mn1) g02Var.g(); !m20.L(mn1Var, g02Var); mn1Var = mn1Var.h()) {
            if (mn1Var instanceof ff1) {
                if1 if1Var = (if1) mn1Var;
                try {
                    if1Var.l(th);
                } catch (Throwable th2) {
                    if (j11Var != null) {
                        bx3.h(j11Var, th2);
                    } else {
                        j11Var = new j11("Exception in completion handler " + if1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (j11Var != null) {
            H(j11Var);
        }
        t(th);
    }

    public void P(Object obj) {
    }

    public void Q() {
    }

    public final void R(if1 if1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z;
        g02 g02Var = new g02();
        if1Var.getClass();
        mn1.f3320b.lazySet(g02Var, if1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = mn1.f3319a;
        atomicReferenceFieldUpdater2.lazySet(g02Var, if1Var);
        while (true) {
            if (if1Var.g() != if1Var) {
                break;
            }
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(if1Var, if1Var, g02Var)) {
                    z = true;
                    break;
                } else if (atomicReferenceFieldUpdater2.get(if1Var) != if1Var) {
                    z = false;
                    break;
                }
            }
            if (z) {
                g02Var.f(if1Var);
                break;
            }
        }
        mn1 h = if1Var.h();
        do {
            atomicReferenceFieldUpdater = f3451a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, if1Var, h)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == if1Var);
    }

    public final int S(Object obj) {
        boolean z = obj instanceof xq0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3451a;
        boolean z2 = false;
        if (z) {
            if (((xq0) obj).f5204a) {
                return 0;
            }
            xq0 xq0Var = fl.m;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, xq0Var)) {
                    z2 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (!z2) {
                return -1;
            }
            Q();
            return 1;
        }
        if (!(obj instanceof ub1)) {
            return 0;
        }
        g02 g02Var = ((ub1) obj).f4645a;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, g02Var)) {
                z2 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                break;
            }
        }
        if (!z2) {
            return -1;
        }
        Q();
        return 1;
    }

    public final Object U(Object obj, Object obj2) {
        Object obj3;
        boolean z;
        lf1 lf1Var;
        d30 d30Var;
        oz ozVar;
        if (!(obj instanceof vb1)) {
            return fl.g;
        }
        boolean z2 = false;
        if (((obj instanceof xq0) || (obj instanceof if1)) && !(obj instanceof oz) && !(obj2 instanceof d30)) {
            vb1 vb1Var = (vb1) obj;
            if (obj2 instanceof vb1) {
                obj3 = new wb1((vb1) obj2);
            } else {
                obj3 = obj2;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3451a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, vb1Var, obj3)) {
                    z = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != vb1Var) {
                    z = false;
                    break;
                }
            }
            if (z) {
                P(obj2);
                x(vb1Var, obj2);
                z2 = true;
            }
            if (z2) {
                return obj2;
            }
            return fl.i;
        }
        vb1 vb1Var2 = (vb1) obj;
        g02 E = E(vb1Var2);
        if (E == null) {
            return fl.i;
        }
        oz ozVar2 = null;
        if (vb1Var2 instanceof lf1) {
            lf1Var = (lf1) vb1Var2;
        } else {
            lf1Var = null;
        }
        if (lf1Var == null) {
            lf1Var = new lf1(E, null);
        }
        synchronized (lf1Var) {
            if (lf1Var.f()) {
                return fl.g;
            }
            lf1.f3116b.set(lf1Var, 1);
            if (lf1Var != vb1Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3451a;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, vb1Var2, lf1Var)) {
                        z2 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater2.get(this) != vb1Var2) {
                        break;
                    }
                }
                if (!z2) {
                    return fl.i;
                }
            }
            boolean e = lf1Var.e();
            if (obj2 instanceof d30) {
                d30Var = (d30) obj2;
            } else {
                d30Var = null;
            }
            if (d30Var != null) {
                lf1Var.b(d30Var.f1723a);
            }
            Throwable d = lf1Var.d();
            if (!Boolean.valueOf(!e).booleanValue()) {
                d = null;
            }
            if (d != null) {
                O(E, d);
            }
            if (vb1Var2 instanceof oz) {
                ozVar = (oz) vb1Var2;
            } else {
                ozVar = null;
            }
            if (ozVar == null) {
                g02 c = vb1Var2.c();
                if (c != null) {
                    ozVar2 = N(c);
                }
            } else {
                ozVar2 = ozVar;
            }
            if (ozVar2 != null && V(lf1Var, ozVar2, obj2)) {
                return fl.h;
            }
            return z(lf1Var, obj2);
        }
    }

    public final boolean V(lf1 lf1Var, oz ozVar, Object obj) {
        while (t9.Q(ozVar.e, false, new kf1(this, lf1Var, ozVar, obj), 1) == h02.f2351a) {
            ozVar = N(ozVar);
            if (ozVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.df1
    public boolean a() {
        Object F = F();
        if ((F instanceof vb1) && ((vb1) F).a()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.df1
    public void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new ef1(u(), null, this);
        }
        s(cancellationException);
    }

    public Object d() {
        return B();
    }

    @Override // defpackage.t90
    public final Object fold(Object obj, l41 l41Var) {
        return l41Var.invoke(obj, this);
    }

    @Override // defpackage.t90
    public final r90 get(s90 s90Var) {
        if (m20.L(d5.g, s90Var)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.r90
    public final s90 getKey() {
        return d5.g;
    }

    @Override // defpackage.t90
    public final t90 minusKey(s90 s90Var) {
        if (m20.L(d5.g, s90Var)) {
            return zq0.f5530a;
        }
        return this;
    }

    public final boolean n(Object obj, g02 g02Var, if1 if1Var) {
        boolean z;
        char c;
        mf1 mf1Var = new mf1(if1Var, this, obj);
        do {
            mn1 i = g02Var.i();
            mn1.f3320b.lazySet(if1Var, i);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = mn1.f3319a;
            atomicReferenceFieldUpdater.lazySet(if1Var, g02Var);
            mf1Var.c = g02Var;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(i, g02Var, mf1Var)) {
                    z = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(i) != g02Var) {
                    z = false;
                    break;
                }
            }
            if (!z) {
                c = 0;
            } else if (mf1Var.a(i) == null) {
                c = 1;
            } else {
                c = 2;
            }
            if (c == 1) {
                return true;
            }
        } while (c != 2);
        return false;
    }

    public void o(Object obj) {
    }

    public void p(Object obj) {
        o(obj);
    }

    @Override // defpackage.t90
    public final t90 plus(t90 t90Var) {
        return fl.V(this, t90Var);
    }

    public final Object q(c90 c90Var) {
        Object F;
        do {
            F = F();
            if (!(F instanceof vb1)) {
                if (!(F instanceof d30)) {
                    return fl.f0(F);
                }
                throw ((d30) F).f1723a;
            }
        } while (S(F) < 0);
        jf1 jf1Var = new jf1(t9.P(c90Var), this);
        jf1Var.s();
        int i = 1;
        jf1Var.u(new nu(J(false, true, new pe1(jf1Var, i)), i));
        Object r = jf1Var.r();
        ba0 ba0Var = ba0.f430a;
        return r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0110, code lost:            return true;     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:            r0 = defpackage.fl.g;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:            if (r0 != defpackage.fl.h) goto L18;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:            return true;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:            r0 = U(r0, new defpackage.d30(false, y(r10)));     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:            if (r0 == defpackage.fl.i) goto L95;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:            if (r0 != defpackage.fl.g) goto L79;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:            r0 = null;        r1 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:            r4 = F();     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:            if ((r4 instanceof defpackage.lf1) == false) goto L49;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:            if ((r4 instanceof defpackage.vb1) == false) goto L99;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:            if (r1 != null) goto L53;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:            r1 = y(r10);     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:            r5 = (defpackage.vb1) r4;     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0008, code lost:            if (D() != false) goto L4;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:            if (r5.a() == false) goto L96;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:            r5 = U(r4, new defpackage.d30(false, r1));     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00db, code lost:            if (r5 == defpackage.fl.g) goto L101;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00df, code lost:            if (r5 == defpackage.fl.i) goto L104;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e1, code lost:            r0 = r5;     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:            r0 = F();     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fa, code lost:            throw new java.lang.IllegalStateException(("Cannot happen in " + r4).toString());     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a6, code lost:            r6 = E(r5);     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00aa, code lost:            if (r6 != null) goto L58;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ad, code lost:            r7 = new defpackage.lf1(r6, r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b2, code lost:            r4 = defpackage.nf1.f3451a;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b8, code lost:            if (r4.compareAndSet(r9, r5, r7) == false) goto L62;     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:            if ((r0 instanceof defpackage.vb1) == false) goto L92;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c0, code lost:            if (r4.get(r9) == r5) goto L108;     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c2, code lost:            r4 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c3, code lost:            if (r4 != false) goto L67;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c7, code lost:            O(r6, r1);        r4 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cb, code lost:            if (r4 == false) goto L105;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cd, code lost:            r10 = defpackage.fl.g;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fd, code lost:            r0 = r10;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ba, code lost:            r4 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c5, code lost:            r4 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fb, code lost:            r10 = defpackage.fl.j;     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0047, code lost:            monitor-enter(r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:            if ((r0 instanceof defpackage.lf1) == false) goto L11;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0053, code lost:            if (defpackage.lf1.d.get((defpackage.lf1) r4) != defpackage.fl.k) goto L27;     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0055, code lost:            r5 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0058, code lost:            if (r5 == false) goto L32;     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x005a, code lost:            r10 = defpackage.fl.j;     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x005c, code lost:            monitor-exit(r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x005f, code lost:            r5 = ((defpackage.lf1) r4).e();     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0066, code lost:            if (r10 != null) goto L35;     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0068, code lost:            if (r5 != false) goto L38;     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0076, code lost:            r10 = ((defpackage.lf1) r4).d();     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x007f, code lost:            if ((!r5) == false) goto L42;     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0081, code lost:            r0 = r10;     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0082, code lost:            monitor-exit(r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0083, code lost:            if (r0 == null) goto L45;     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0085, code lost:            O(((defpackage.lf1) r4).f3117a, r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x008c, code lost:            r10 = defpackage.fl.g;     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x006a, code lost:            if (r1 != null) goto L37;     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x006c, code lost:            r1 = y(r10);     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0070, code lost:            ((defpackage.lf1) r4).b(r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0057, code lost:            r5 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:            if (((defpackage.lf1) r0).f() == false) goto L11;     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0100, code lost:            if (r0 != defpackage.fl.g) goto L82;     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0105, code lost:            if (r0 != defpackage.fl.h) goto L85;     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x010a, code lost:            if (r0 != defpackage.fl.j) goto L88;     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x010d, code lost:            o(r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:99:?, code lost:            return false;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nf1.r(java.lang.Object):boolean");
    }

    public void s(CancellationException cancellationException) {
        r(cancellationException);
    }

    public final boolean t(Throwable th) {
        if (K()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        nz nzVar = (nz) f3452b.get(this);
        if (nzVar != null && nzVar != h02.f2351a) {
            if (nzVar.b(th) || z) {
                return true;
            }
            return false;
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(M() + '{' + T(F()) + '}');
        sb.append('@');
        sb.append(pe0.u(this));
        return sb.toString();
    }

    public String u() {
        return "Job was cancelled";
    }

    public boolean v(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (r(th) && C()) {
            return true;
        }
        return false;
    }

    public final void x(vb1 vb1Var, Object obj) {
        d30 d30Var;
        Throwable th;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3452b;
        nz nzVar = (nz) atomicReferenceFieldUpdater.get(this);
        if (nzVar != null) {
            nzVar.d();
            atomicReferenceFieldUpdater.set(this, h02.f2351a);
        }
        j11 j11Var = null;
        if (obj instanceof d30) {
            d30Var = (d30) obj;
        } else {
            d30Var = null;
        }
        if (d30Var != null) {
            th = d30Var.f1723a;
        } else {
            th = null;
        }
        if (vb1Var instanceof if1) {
            try {
                ((if1) vb1Var).l(th);
                return;
            } catch (Throwable th2) {
                H(new j11("Exception in completion handler " + vb1Var + " for " + this, th2));
                return;
            }
        }
        g02 c = vb1Var.c();
        if (c != null) {
            for (mn1 mn1Var = (mn1) c.g(); !m20.L(mn1Var, c); mn1Var = mn1Var.h()) {
                if (mn1Var instanceof if1) {
                    if1 if1Var = (if1) mn1Var;
                    try {
                        if1Var.l(th);
                    } catch (Throwable th3) {
                        if (j11Var != null) {
                            bx3.h(j11Var, th3);
                        } else {
                            j11Var = new j11("Exception in completion handler " + if1Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (j11Var != null) {
                H(j11Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Throwable] */
    public final Throwable y(Object obj) {
        boolean z;
        CancellationException cancellationException;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof Throwable;
        }
        CancellationException cancellationException2 = null;
        if (z) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new ef1(u(), null, this);
            }
            return th;
        }
        nf1 nf1Var = (nf1) ((q42) obj);
        Object F = nf1Var.F();
        if (F instanceof lf1) {
            cancellationException = ((lf1) F).d();
        } else if (F instanceof d30) {
            cancellationException = ((d30) F).f1723a;
        } else if (!(F instanceof vb1)) {
            cancellationException = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + F).toString());
        }
        if (cancellationException instanceof CancellationException) {
            cancellationException2 = cancellationException;
        }
        if (cancellationException2 == null) {
            cancellationException2 = new ef1("Parent job is ".concat(T(F)), cancellationException, nf1Var);
        }
        return cancellationException2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object z(lf1 lf1Var, Object obj) {
        d30 d30Var;
        Throwable th;
        Object obj2;
        boolean z;
        Throwable th2 = null;
        if (obj instanceof d30) {
            d30Var = (d30) obj;
        } else {
            d30Var = null;
        }
        if (d30Var != null) {
            th = d30Var.f1723a;
        } else {
            th = null;
        }
        synchronized (lf1Var) {
            lf1Var.e();
            ArrayList<Throwable> g = lf1Var.g(th);
            if (g.isEmpty()) {
                if (lf1Var.e()) {
                    th2 = new ef1(u(), null, this);
                }
            } else {
                Iterator it = g.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        th2 = next;
                        break;
                    }
                }
                th2 = th2;
                if (th2 == null) {
                    th2 = (Throwable) g.get(0);
                }
            }
            if (th2 != null && g.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g.size()));
                for (Throwable th3 : g) {
                    if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        bx3.h(th2, th3);
                    }
                }
            }
        }
        if (th2 != null && th2 != th) {
            obj = new d30(false, th2);
        }
        if (th2 != null) {
            if (!t(th2) && !G(th2)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                d30 d30Var2 = (d30) obj;
                d30Var2.getClass();
                d30.f1722b.compareAndSet(d30Var2, 0, 1);
            }
        }
        P(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3451a;
        if (obj instanceof vb1) {
            obj2 = new wb1((vb1) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, lf1Var, obj2) && atomicReferenceFieldUpdater.get(this) == lf1Var) {
        }
        x(lf1Var, obj);
        return obj;
    }

    public void H(j11 j11Var) {
        throw j11Var;
    }
}
