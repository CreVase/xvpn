package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class hu0 implements Handler.Callback, kt1, cb3, eu1, ei0, a62 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public long K;
    public int L;
    public boolean M;
    public jt0 N;

    /* renamed from: a, reason: collision with root package name */
    public final ko[] f2487a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f2488b;
    public final ko[] c;
    public final hq1 d;
    public final db3 e;
    public final wl1 f;
    public final xm g;
    public final z43 h;
    public final HandlerThread i;
    public final Looper j;
    public final z83 k;
    public final y83 l;
    public final long m;
    public final boolean n;
    public final fi0 o;
    public final ArrayList p;
    public final f10 q;
    public final qt0 r;
    public final pt1 s;
    public final fu1 t;
    public final ci0 u;
    public final long v;
    public mo2 w;
    public p52 x;
    public eu0 y;
    public boolean z;
    public boolean F = false;
    public long O = -9223372036854775807L;

    public hu0(ko[] koVarArr, hq1 hq1Var, db3 db3Var, wl1 wl1Var, xm xmVar, int i, pa paVar, mo2 mo2Var, ci0 ci0Var, long j, boolean z, Looper looper, f10 f10Var, qt0 qt0Var, z52 z52Var) {
        this.r = qt0Var;
        this.f2487a = koVarArr;
        this.d = hq1Var;
        this.e = db3Var;
        this.f = wl1Var;
        this.g = xmVar;
        this.E = i;
        this.w = mo2Var;
        this.u = ci0Var;
        this.v = j;
        this.A = z;
        this.q = f10Var;
        di0 di0Var = (di0) wl1Var;
        this.m = di0Var.h;
        this.n = di0Var.i;
        p52 g = p52.g(db3Var);
        this.x = g;
        this.y = new eu0(g);
        this.c = new ko[koVarArr.length];
        for (int i2 = 0; i2 < koVarArr.length; i2++) {
            ko koVar = koVarArr[i2];
            koVar.d = i2;
            koVar.e = z52Var;
            this.c[i2] = koVar;
        }
        this.o = new fi0(this, f10Var);
        this.p = new ArrayList();
        this.f2488b = Collections.newSetFromMap(new IdentityHashMap());
        this.k = new z83();
        this.l = new y83();
        hq1Var.f2467a = this;
        hq1Var.f2468b = xmVar;
        this.M = true;
        t43 t43Var = (t43) f10Var;
        z43 a2 = t43Var.a(looper, null);
        this.s = new pt1(paVar, a2);
        this.t = new fu1(this, paVar, a2, z52Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.i = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.j = looper2;
        this.h = t43Var.a(looper2, this);
    }

    public static Pair G(a93 a93Var, gu0 gu0Var, boolean z, int i, boolean z2, z83 z83Var, y83 y83Var) {
        gu0Var.getClass();
        if (a93Var.q()) {
            return null;
        }
        throw null;
    }

    public static Object H(z83 z83Var, y83 y83Var, int i, boolean z, Object obj, a93 a93Var, a93 a93Var2) {
        int b2 = a93Var.b(obj);
        int i2 = a93Var.i();
        int i3 = b2;
        int i4 = -1;
        for (int i5 = 0; i5 < i2 && i4 == -1; i5++) {
            i3 = a93Var.d(i3, y83Var, z83Var, i, z);
            if (i3 == -1) {
                break;
            }
            i4 = a93Var2.b(a93Var.m(i3));
        }
        if (i4 == -1) {
            return null;
        }
        return a93Var2.m(i4);
    }

    public static void M(ko koVar, long j) {
        koVar.k = true;
        if (koVar instanceof i73) {
            i73 i73Var = (i73) koVar;
            cp3.m(i73Var.k);
            i73Var.A = j;
        }
    }

    public static void d(c62 c62Var) {
        synchronized (c62Var) {
        }
        try {
            c62Var.f587a.c(c62Var.d, c62Var.e);
        } finally {
            c62Var.b(true);
        }
    }

    public static boolean r(ko koVar) {
        if (koVar.f != 0) {
            return true;
        }
        return false;
    }

    public final void A(int i, int i2, ht2 ht2Var) {
        boolean z = true;
        this.y.a(1);
        fu1 fu1Var = this.t;
        fu1Var.getClass();
        if (i < 0 || i > i2 || i2 > fu1Var.f2158b.size()) {
            z = false;
        }
        cp3.e(z);
        fu1Var.j = ht2Var;
        fu1Var.g(i, i2);
        m(fu1Var.b(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B() {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hu0.B():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:            if (r4.equals(r34.x.f3786b) == false) goto L44;     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(boolean r35, boolean r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hu0.C(boolean, boolean, boolean, boolean):void");
    }

    public final void D() {
        boolean z;
        mt1 mt1Var = this.s.h;
        if (mt1Var != null && mt1Var.f.h && this.A) {
            z = true;
        } else {
            z = false;
        }
        this.B = z;
    }

    public final void E(long j) {
        long j2;
        mt1 mt1Var = this.s.h;
        if (mt1Var == null) {
            j2 = 1000000000000L;
        } else {
            j2 = mt1Var.o;
        }
        long j3 = j + j2;
        this.K = j3;
        this.o.f2094a.c(j3);
        for (ko koVar : this.f2487a) {
            if (r(koVar)) {
                long j4 = this.K;
                koVar.k = false;
                koVar.j = j4;
                koVar.n(j4, false);
            }
        }
        for (mt1 mt1Var2 = r0.h; mt1Var2 != null; mt1Var2 = mt1Var2.l) {
            for (mu0 mu0Var : mt1Var2.n.c) {
                if (mu0Var != null) {
                    mu0Var.j();
                }
            }
        }
    }

    public final void F(a93 a93Var, a93 a93Var2) {
        if (a93Var.q() && a93Var2.q()) {
            return;
        }
        ArrayList arrayList = this.p;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            p71.C(arrayList.get(size));
            throw null;
        }
    }

    public final void I(boolean z) {
        rt1 rt1Var = this.s.h.f.f3725a;
        long K = K(rt1Var, this.x.r, true, false);
        if (K != this.x.r) {
            p52 p52Var = this.x;
            this.x = p(rt1Var, K, p52Var.c, p52Var.d, z, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(defpackage.gu0 r20) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hu0.J(gu0):void");
    }

    public final long K(rt1 rt1Var, long j, boolean z, boolean z2) {
        b0();
        this.C = false;
        if (z2 || this.x.e == 3) {
            W(2);
        }
        pt1 pt1Var = this.s;
        mt1 mt1Var = pt1Var.h;
        mt1 mt1Var2 = mt1Var;
        while (mt1Var2 != null && !rt1Var.equals(mt1Var2.f.f3725a)) {
            mt1Var2 = mt1Var2.l;
        }
        if (z || mt1Var != mt1Var2 || (mt1Var2 != null && mt1Var2.o + j < 0)) {
            ko[] koVarArr = this.f2487a;
            for (ko koVar : koVarArr) {
                e(koVar);
            }
            if (mt1Var2 != null) {
                while (pt1Var.h != mt1Var2) {
                    pt1Var.a();
                }
                pt1Var.k(mt1Var2);
                mt1Var2.o = 1000000000000L;
                g(new boolean[koVarArr.length]);
            }
        }
        if (mt1Var2 != null) {
            pt1Var.k(mt1Var2);
            if (!mt1Var2.d) {
                mt1Var2.f = mt1Var2.f.b(j);
            } else if (mt1Var2.e) {
                lt1 lt1Var = mt1Var2.f3350a;
                j = lt1Var.g(j);
                lt1Var.v(j - this.m, this.n);
            }
            E(j);
            t();
        } else {
            pt1Var.b();
            E(j);
        }
        l(false);
        this.h.d(2);
        return j;
    }

    public final void L(c62 c62Var) {
        Looper looper = c62Var.f;
        if (!looper.getThread().isAlive()) {
            sn1.f();
            c62Var.b(false);
        } else {
            ((t43) this.q).a(looper, null).c(new lf(10, this, c62Var));
        }
    }

    public final void N(boolean z, AtomicBoolean atomicBoolean) {
        if (this.G != z) {
            this.G = z;
            if (!z) {
                for (ko koVar : this.f2487a) {
                    if (!r(koVar) && this.f2488b.remove(koVar)) {
                        koVar.v();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void O(du0 du0Var) {
        this.y.a(1);
        du0Var.getClass();
        fu1 fu1Var = this.t;
        ArrayList arrayList = fu1Var.f2158b;
        fu1Var.g(0, arrayList.size());
        m(fu1Var.a(arrayList.size(), du0Var.f1837a, du0Var.f1838b), false);
    }

    public final void P(boolean z) {
        if (z == this.I) {
            return;
        }
        this.I = z;
        if (!z && this.x.o) {
            this.h.d(2);
        }
    }

    public final void Q(boolean z) {
        this.A = z;
        D();
        if (this.B) {
            pt1 pt1Var = this.s;
            if (pt1Var.i != pt1Var.h) {
                I(true);
                l(false);
            }
        }
    }

    public final void R(int i, int i2, boolean z, boolean z2) {
        this.y.a(z2 ? 1 : 0);
        eu0 eu0Var = this.y;
        eu0Var.f1996a = true;
        eu0Var.f = true;
        eu0Var.g = i2;
        this.x = this.x.c(i, z);
        this.C = false;
        for (mt1 mt1Var = this.s.h; mt1Var != null; mt1Var = mt1Var.l) {
            for (mu0 mu0Var : mt1Var.n.c) {
                if (mu0Var != null) {
                    mu0Var.c(z);
                }
            }
        }
        if (!X()) {
            b0();
            e0();
            return;
        }
        int i3 = this.x.e;
        z43 z43Var = this.h;
        if (i3 == 3) {
            Z();
            z43Var.d(2);
        } else if (i3 == 2) {
            z43Var.d(2);
        }
    }

    public final void S(q52 q52Var) {
        this.h.f5426a.removeMessages(16);
        fi0 fi0Var = this.o;
        fi0Var.a(q52Var);
        q52 d = fi0Var.d();
        o(d, d.f3957a, true, true);
    }

    public final void T(int i) {
        this.E = i;
        a93 a93Var = this.x.f3785a;
        pt1 pt1Var = this.s;
        pt1Var.f = i;
        if (!pt1Var.n(a93Var)) {
            I(true);
        }
        l(false);
    }

    public final void U(boolean z) {
        this.F = z;
        a93 a93Var = this.x.f3785a;
        pt1 pt1Var = this.s;
        pt1Var.g = z;
        if (!pt1Var.n(a93Var)) {
            I(true);
        }
        l(false);
    }

    public final void V(ht2 ht2Var) {
        this.y.a(1);
        fu1 fu1Var = this.t;
        int size = fu1Var.f2158b.size();
        if (ht2Var.f2484b.length != size) {
            ht2Var = new ht2(new Random(ht2Var.f2483a.nextLong())).a(0, size);
        }
        fu1Var.j = ht2Var;
        m(fu1Var.b(), false);
    }

    public final void W(int i) {
        p52 p52Var = this.x;
        if (p52Var.e != i) {
            if (i != 2) {
                this.O = -9223372036854775807L;
            }
            this.x = p52Var.e(i);
        }
    }

    public final boolean X() {
        p52 p52Var = this.x;
        if (p52Var.l && p52Var.m == 0) {
            return true;
        }
        return false;
    }

    public final boolean Y(a93 a93Var, rt1 rt1Var) {
        if (rt1Var.a() || a93Var.q()) {
            return false;
        }
        int i = a93Var.h(rt1Var.f3536a, this.l).c;
        z83 z83Var = this.k;
        a93Var.n(i, z83Var);
        if (!z83Var.a() || !z83Var.i || z83Var.f == -9223372036854775807L) {
            return false;
        }
        return true;
    }

    public final void Z() {
        boolean z;
        this.C = false;
        fi0 fi0Var = this.o;
        fi0Var.f = true;
        fi0Var.f2094a.e();
        for (ko koVar : this.f2487a) {
            if (r(koVar)) {
                if (koVar.f == 1) {
                    z = true;
                } else {
                    z = false;
                }
                cp3.m(z);
                koVar.f = 2;
                koVar.p();
            }
        }
    }

    @Override // defpackage.kt1
    public final void a(lt1 lt1Var) {
        this.h.a(8, lt1Var).a();
    }

    public final void a0(boolean z, boolean z2) {
        boolean z3;
        if (!z && this.G) {
            z3 = false;
        } else {
            z3 = true;
        }
        C(z3, false, true, false);
        this.y.a(z2 ? 1 : 0);
        ((di0) this.f).b(true);
        W(1);
    }

    public final void b(du0 du0Var, int i) {
        this.y.a(1);
        fu1 fu1Var = this.t;
        if (i == -1) {
            i = fu1Var.f2158b.size();
        }
        m(fu1Var.a(i, du0Var.f1837a, du0Var.f1838b), false);
    }

    public final void b0() {
        int i;
        boolean z;
        fi0 fi0Var = this.o;
        fi0Var.f = false;
        p03 p03Var = fi0Var.f2094a;
        if (p03Var.f3763b) {
            p03Var.c(p03Var.b());
            p03Var.f3763b = false;
        }
        for (ko koVar : this.f2487a) {
            if (r(koVar) && (i = koVar.f) == 2) {
                if (i == 2) {
                    z = true;
                } else {
                    z = false;
                }
                cp3.m(z);
                koVar.f = 1;
                koVar.q();
            }
        }
    }

    @Override // defpackage.kt1
    public final void c(hp2 hp2Var) {
        this.h.a(9, (lt1) hp2Var).a();
    }

    public final void c0() {
        boolean z;
        mt1 mt1Var = this.s.j;
        if (!this.D && (mt1Var == null || !mt1Var.f3350a.i())) {
            z = false;
        } else {
            z = true;
        }
        p52 p52Var = this.x;
        if (z != p52Var.g) {
            this.x = new p52(p52Var.f3785a, p52Var.f3786b, p52Var.c, p52Var.d, p52Var.e, p52Var.f, z, p52Var.h, p52Var.i, p52Var.j, p52Var.k, p52Var.l, p52Var.m, p52Var.n, p52Var.p, p52Var.q, p52Var.r, p52Var.o);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x001d. Please report as an issue. */
    public final void d0(db3 db3Var) {
        mu0[] mu0VarArr = db3Var.c;
        di0 di0Var = (di0) this.f;
        int i = di0Var.f;
        if (i == -1) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                ko[] koVarArr = this.f2487a;
                int i4 = 13107200;
                if (i2 < koVarArr.length) {
                    if (mu0VarArr[i2] != null) {
                        switch (koVarArr[i2].f2983a) {
                            case -2:
                                i4 = 0;
                                i3 += i4;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i4 = 144310272;
                                i3 += i4;
                                break;
                            case 1:
                                i3 += i4;
                                break;
                            case 2:
                                i4 = 131072000;
                                i3 += i4;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i4 = 131072;
                                i3 += i4;
                                break;
                        }
                    }
                    i2++;
                } else {
                    i = Math.max(13107200, i3);
                }
            }
        }
        di0Var.j = i;
        di0Var.f1786a.a(i);
    }

    public final void e(ko koVar) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = koVar.f;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        fi0 fi0Var = this.o;
        if (koVar == fi0Var.c) {
            fi0Var.d = null;
            fi0Var.c = null;
            fi0Var.e = true;
        }
        if (i == 2) {
            if (i == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            cp3.m(z3);
            koVar.f = 1;
            koVar.q();
        }
        if (koVar.f == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        cp3.m(z2);
        koVar.f2984b.j();
        koVar.f = 0;
        koVar.g = null;
        koVar.h = null;
        koVar.k = false;
        koVar.l();
        this.J--;
    }

    public final void e0() {
        long j;
        boolean z;
        boolean z2;
        long max;
        long max2;
        float f;
        mt1 mt1Var = this.s.h;
        if (mt1Var == null) {
            return;
        }
        if (mt1Var.d) {
            j = mt1Var.f3350a.k();
        } else {
            j = -9223372036854775807L;
        }
        if (j != -9223372036854775807L) {
            E(j);
            if (j != this.x.r) {
                p52 p52Var = this.x;
                this.x = p(p52Var.f3786b, j, p52Var.c, j, true, 5);
            }
        } else {
            fi0 fi0Var = this.o;
            if (mt1Var != this.s.i) {
                z = true;
            } else {
                z = false;
            }
            ko koVar = fi0Var.c;
            if (koVar != null && !koVar.j() && (fi0Var.c.k() || (!z && !fi0Var.c.i()))) {
                z2 = false;
            } else {
                z2 = true;
            }
            p03 p03Var = fi0Var.f2094a;
            if (z2) {
                fi0Var.e = true;
                if (fi0Var.f) {
                    p03Var.e();
                }
            } else {
                rr1 rr1Var = fi0Var.d;
                rr1Var.getClass();
                long b2 = rr1Var.b();
                if (fi0Var.e) {
                    if (b2 < p03Var.b()) {
                        if (p03Var.f3763b) {
                            p03Var.c(p03Var.b());
                            p03Var.f3763b = false;
                        }
                    } else {
                        fi0Var.e = false;
                        if (fi0Var.f) {
                            p03Var.e();
                        }
                    }
                }
                p03Var.c(b2);
                q52 d = rr1Var.d();
                if (!d.equals(p03Var.e)) {
                    p03Var.a(d);
                    ((hu0) fi0Var.f2095b).h.a(16, d).a();
                }
            }
            long b3 = fi0Var.b();
            this.K = b3;
            long j2 = b3 - mt1Var.o;
            long j3 = this.x.r;
            if (!this.p.isEmpty() && !this.x.f3786b.a()) {
                if (this.M) {
                    this.M = false;
                }
                p52 p52Var2 = this.x;
                p52Var2.f3785a.b(p52Var2.f3786b.f3536a);
                int min = Math.min(this.L, this.p.size());
                if (min > 0) {
                    p71.C(this.p.get(min - 1));
                }
                if (min < this.p.size()) {
                    p71.C(this.p.get(min));
                }
                this.L = min;
            }
            this.x.r = j2;
        }
        this.x.p = this.s.j.d();
        p52 p52Var3 = this.x;
        long j4 = p52Var3.p;
        mt1 mt1Var2 = this.s.j;
        if (mt1Var2 == null) {
            max = 0;
        } else {
            max = Math.max(0L, j4 - (this.K - mt1Var2.o));
        }
        p52Var3.q = max;
        p52 p52Var4 = this.x;
        if (p52Var4.l && p52Var4.e == 3 && Y(p52Var4.f3785a, p52Var4.f3786b)) {
            p52 p52Var5 = this.x;
            if (p52Var5.n.f3957a == 1.0f) {
                ci0 ci0Var = this.u;
                long h = h(p52Var5.f3785a, p52Var5.f3786b.f3536a, p52Var5.r);
                long j5 = this.x.p;
                mt1 mt1Var3 = this.s.j;
                if (mt1Var3 == null) {
                    max2 = 0;
                } else {
                    max2 = Math.max(0L, j5 - (this.K - mt1Var3.o));
                }
                if (ci0Var.d == -9223372036854775807L) {
                    f = 1.0f;
                } else {
                    long j6 = h - max2;
                    long j7 = ci0Var.n;
                    if (j7 == -9223372036854775807L) {
                        ci0Var.n = j6;
                        ci0Var.o = 0L;
                    } else {
                        float f2 = ci0Var.c;
                        float f3 = ((float) j7) * f2;
                        float f4 = 1.0f - f2;
                        ci0Var.n = Math.max(j6, (((float) j6) * f4) + f3);
                        ci0Var.o = (f4 * ((float) Math.abs(j6 - r4))) + (((float) ci0Var.o) * f2);
                    }
                    if (ci0Var.m != -9223372036854775807L && SystemClock.elapsedRealtime() - ci0Var.m < 1000) {
                        f = ci0Var.l;
                    } else {
                        ci0Var.m = SystemClock.elapsedRealtime();
                        long j8 = (ci0Var.o * 3) + ci0Var.n;
                        if (ci0Var.i > j8) {
                            float C = (float) wi3.C(1000L);
                            long[] jArr = {j8, ci0Var.f, ci0Var.i - (((ci0Var.l - 1.0f) * C) + ((ci0Var.j - 1.0f) * C))};
                            long j9 = j8;
                            for (int i = 1; i < 3; i++) {
                                long j10 = jArr[i];
                                if (j10 > j9) {
                                    j9 = j10;
                                }
                            }
                            ci0Var.i = j9;
                        } else {
                            long j11 = wi3.j(h - (Math.max(0.0f, ci0Var.l - 1.0f) / 1.0E-7f), ci0Var.i, j8);
                            ci0Var.i = j11;
                            long j12 = ci0Var.h;
                            if (j12 != -9223372036854775807L && j11 > j12) {
                                ci0Var.i = j12;
                            }
                        }
                        long j13 = h - ci0Var.i;
                        if (Math.abs(j13) < ci0Var.f639a) {
                            ci0Var.l = 1.0f;
                        } else {
                            ci0Var.l = wi3.h((1.0E-7f * ((float) j13)) + 1.0f, ci0Var.k, ci0Var.j);
                        }
                        f = ci0Var.l;
                    }
                }
                if (this.o.d().f3957a != f) {
                    q52 q52Var = new q52(f, this.x.n.f3958b);
                    this.h.f5426a.removeMessages(16);
                    this.o.a(q52Var);
                    o(this.x.n, this.o.d().f3957a, false, false);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:            if (r0.k < 100) goto L35;     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0547, code lost:            if (r2 >= r6.j) goto L368;     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0550, code lost:            if (r8 == false) goto L371;     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0307 A[EDGE_INSN: B:155:0x0307->B:156:0x0307 BREAK  A[LOOP:2: B:123:0x02a7->B:134:0x0304], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x039b A[EDGE_INSN: B:189:0x039b->B:190:0x039b BREAK  A[LOOP:4: B:160:0x0312->B:186:0x0374], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 1764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hu0.f():void");
    }

    public final void f0(a93 a93Var, rt1 rt1Var, a93 a93Var2, rt1 rt1Var2, long j, boolean z) {
        Object obj;
        q52 q52Var;
        if (!Y(a93Var, rt1Var)) {
            if (rt1Var.a()) {
                q52Var = q52.d;
            } else {
                q52Var = this.x.n;
            }
            fi0 fi0Var = this.o;
            if (!fi0Var.d().equals(q52Var)) {
                this.h.f5426a.removeMessages(16);
                fi0Var.a(q52Var);
                o(this.x.n, q52Var.f3957a, false, false);
                return;
            }
            return;
        }
        Object obj2 = rt1Var.f3536a;
        y83 y83Var = this.l;
        int i = a93Var.h(obj2, y83Var).c;
        z83 z83Var = this.k;
        a93Var.n(i, z83Var);
        xs1 xs1Var = z83Var.k;
        ci0 ci0Var = this.u;
        ci0Var.getClass();
        ci0Var.d = wi3.C(xs1Var.f5210a);
        ci0Var.g = wi3.C(xs1Var.f5211b);
        ci0Var.h = wi3.C(xs1Var.c);
        float f = xs1Var.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        ci0Var.k = f;
        float f2 = xs1Var.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        ci0Var.j = f2;
        if (f == 1.0f && f2 == 1.0f) {
            ci0Var.d = -9223372036854775807L;
        }
        ci0Var.a();
        if (j != -9223372036854775807L) {
            ci0Var.e = h(a93Var, obj2, j);
            ci0Var.a();
            return;
        }
        Object obj3 = z83Var.f5444a;
        if (!a93Var2.q()) {
            obj = a93Var2.n(a93Var2.h(rt1Var2.f3536a, y83Var).c, z83Var).f5444a;
        } else {
            obj = null;
        }
        if (!wi3.a(obj, obj3) || z) {
            ci0Var.e = -9223372036854775807L;
            ci0Var.a();
        }
    }

    public final void g(boolean[] zArr) {
        ko[] koVarArr;
        Set set;
        pt1 pt1Var;
        mt1 mt1Var;
        int i;
        ko[] koVarArr2;
        boolean z;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        rr1 rr1Var;
        pt1 pt1Var2 = this.s;
        mt1 mt1Var2 = pt1Var2.i;
        db3 db3Var = mt1Var2.n;
        int i3 = 0;
        while (true) {
            koVarArr = this.f2487a;
            int length = koVarArr.length;
            set = this.f2488b;
            if (i3 >= length) {
                break;
            }
            if (!db3Var.b(i3) && set.remove(koVarArr[i3])) {
                koVarArr[i3].v();
            }
            i3++;
        }
        int i4 = 0;
        while (i4 < koVarArr.length) {
            if (db3Var.b(i4)) {
                boolean z6 = zArr[i4];
                ko koVar = koVarArr[i4];
                if (!r(koVar)) {
                    mt1 mt1Var3 = pt1Var2.i;
                    if (mt1Var3 == pt1Var2.h) {
                        z = true;
                    } else {
                        z = false;
                    }
                    db3 db3Var2 = mt1Var3.n;
                    cj2 cj2Var = db3Var2.f1754b[i4];
                    mu0 mu0Var = db3Var2.c[i4];
                    if (mu0Var != null) {
                        i2 = mu0Var.length();
                    } else {
                        i2 = 0;
                    }
                    y01[] y01VarArr = new y01[i2];
                    for (int i5 = 0; i5 < i2; i5++) {
                        y01VarArr[i5] = mu0Var.d(i5);
                    }
                    if (X() && this.x.e == 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z6 && z2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.J++;
                    set.add(koVar);
                    rm2 rm2Var = mt1Var3.c[i4];
                    pt1Var = pt1Var2;
                    mt1Var = mt1Var2;
                    long j = this.K;
                    long e = mt1Var3.e();
                    i = i4;
                    koVarArr2 = koVarArr;
                    long j2 = mt1Var3.o;
                    if (koVar.f == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    cp3.m(z4);
                    koVar.c = cj2Var;
                    koVar.f = 1;
                    koVar.m(z3, z);
                    koVar.u(y01VarArr, rm2Var, e, j2);
                    koVar.k = false;
                    koVar.j = j;
                    koVar.n(j, z3);
                    koVar.c(11, new cu0(this));
                    fi0 fi0Var = this.o;
                    fi0Var.getClass();
                    rr1 g = koVar.g();
                    if (g != null && g != (rr1Var = fi0Var.d)) {
                        if (rr1Var == null) {
                            fi0Var.d = g;
                            fi0Var.c = koVar;
                            g.a(fi0Var.f2094a.e);
                        } else {
                            throw new jt0(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                    }
                    if (z2) {
                        if (koVar.f == 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        cp3.m(z5);
                        koVar.f = 2;
                        koVar.p();
                    }
                    i4 = i + 1;
                    pt1Var2 = pt1Var;
                    mt1Var2 = mt1Var;
                    koVarArr = koVarArr2;
                }
            }
            pt1Var = pt1Var2;
            mt1Var = mt1Var2;
            i = i4;
            koVarArr2 = koVarArr;
            i4 = i + 1;
            pt1Var2 = pt1Var;
            mt1Var2 = mt1Var;
            koVarArr = koVarArr2;
        }
        mt1Var2.g = true;
    }

    public final synchronized void g0(kt0 kt0Var, long j) {
        ((t43) this.q).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!((Boolean) kt0Var.get()).booleanValue() && j > 0) {
            try {
                this.q.getClass();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            ((t43) this.q).getClass();
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final long h(a93 a93Var, Object obj, long j) {
        long elapsedRealtime;
        y83 y83Var = this.l;
        int i = a93Var.h(obj, y83Var).c;
        z83 z83Var = this.k;
        a93Var.n(i, z83Var);
        if (z83Var.f == -9223372036854775807L || !z83Var.a() || !z83Var.i) {
            return -9223372036854775807L;
        }
        long j2 = z83Var.g;
        if (j2 == -9223372036854775807L) {
            elapsedRealtime = System.currentTimeMillis();
        } else {
            elapsedRealtime = j2 + SystemClock.elapsedRealtime();
        }
        return wi3.C(elapsedRealtime - z83Var.f) - (j + y83Var.e);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        mt1 mt1Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i = 1000;
        try {
            switch (message.what) {
                case 0:
                    x();
                    break;
                case 1:
                    if (message.arg1 != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    R(message.arg2, 1, z, true);
                    break;
                case 2:
                    f();
                    break;
                case 3:
                    J((gu0) message.obj);
                    break;
                case 4:
                    S((q52) message.obj);
                    break;
                case 5:
                    this.w = (mo2) message.obj;
                    break;
                case 6:
                    a0(false, true);
                    break;
                case 7:
                    z();
                    return true;
                case 8:
                    n((lt1) message.obj);
                    break;
                case 9:
                    j((lt1) message.obj);
                    break;
                case 10:
                    B();
                    break;
                case 11:
                    T(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    U(z2);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    N(z3, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    c62 c62Var = (c62) message.obj;
                    c62Var.getClass();
                    Looper looper = c62Var.f;
                    Looper looper2 = this.j;
                    z43 z43Var = this.h;
                    if (looper == looper2) {
                        d(c62Var);
                        int i2 = this.x.e;
                        if (i2 == 3 || i2 == 2) {
                            z43Var.d(2);
                            break;
                        }
                    } else {
                        z43Var.a(15, c62Var).a();
                        break;
                    }
                case 15:
                    L((c62) message.obj);
                    break;
                case 16:
                    q52 q52Var = (q52) message.obj;
                    o(q52Var, q52Var.f3957a, true, false);
                    break;
                case 17:
                    O((du0) message.obj);
                    break;
                case 18:
                    b((du0) message.obj, message.arg1);
                    break;
                case 19:
                    p71.C(message.obj);
                    w();
                    throw null;
                case 20:
                    A(message.arg1, message.arg2, (ht2) message.obj);
                    break;
                case 21:
                    V((ht2) message.obj);
                    break;
                case 22:
                    v();
                    break;
                case 23:
                    if (message.arg1 != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    Q(z4);
                    break;
                case 24:
                    if (message.arg1 == 1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    P(z5);
                    break;
                case 25:
                    I(true);
                    break;
                default:
                    return false;
            }
        } catch (ae0 e) {
            k(e, e.f67a);
        } catch (RuntimeException e2) {
            if ((e2 instanceof IllegalStateException) || (e2 instanceof IllegalArgumentException)) {
                i = 1004;
            }
            jt0 jt0Var = new jt0(2, e2, i);
            sn1.d("ExoPlayerImplInternal", "Playback error", jt0Var);
            a0(true, false);
            this.x = this.x.d(jt0Var);
        } catch (qn0 e3) {
            k(e3, e3.f4024a);
        } catch (u42 e4) {
            boolean z6 = e4.f4624a;
            int i3 = e4.f4625b;
            if (i3 == 1) {
                if (z6) {
                    i = 3001;
                } else {
                    i = AuthApiStatusCodes.AUTH_API_SERVER_ERROR;
                }
            } else if (i3 == 4) {
                if (z6) {
                    i = AuthApiStatusCodes.AUTH_API_CLIENT_ERROR;
                } else {
                    i = AuthApiStatusCodes.AUTH_TOKEN_ERROR;
                }
            }
            k(e4, i);
        } catch (IOException e5) {
            k(e5, 2000);
        } catch (jt0 e6) {
            e = e6;
            if (e.h == 1 && (mt1Var = this.s.i) != null) {
                e = e.a(mt1Var.f.f3725a);
            }
            if (e.n && this.N == null) {
                sn1.g("Recoverable renderer error", e);
                this.N = e;
                z43 z43Var2 = this.h;
                y43 a2 = z43Var2.a(25, e);
                z43Var2.getClass();
                Message message2 = a2.f5269a;
                message2.getClass();
                z43Var2.f5426a.sendMessageAtFrontOfQueue(message2);
                a2.f5269a = null;
                ArrayList arrayList = z43.f5425b;
                synchronized (arrayList) {
                    if (arrayList.size() < 50) {
                        arrayList.add(a2);
                    }
                }
            } else {
                jt0 jt0Var2 = this.N;
                if (jt0Var2 != null) {
                    jt0Var2.addSuppressed(e);
                    e = this.N;
                }
                sn1.d("ExoPlayerImplInternal", "Playback error", e);
                a0(true, false);
                this.x = this.x.d(e);
            }
        }
        u();
        return true;
    }

    public final Pair i(a93 a93Var) {
        long j = 0;
        if (a93Var.q()) {
            return Pair.create(p52.s, 0L);
        }
        Pair j2 = a93Var.j(this.k, this.l, a93Var.a(this.F), -9223372036854775807L);
        rt1 m = this.s.m(a93Var, j2.first, 0L);
        long longValue = ((Long) j2.second).longValue();
        if (m.a()) {
            Object obj = m.f3536a;
            y83 y83Var = this.l;
            a93Var.h(obj, y83Var);
            if (m.c == y83Var.e(m.f3537b)) {
                j = y83Var.g.c;
            }
            longValue = j;
        }
        return Pair.create(m, Long.valueOf(longValue));
    }

    public final void j(lt1 lt1Var) {
        boolean z;
        mt1 mt1Var = this.s.j;
        boolean z2 = true;
        if (mt1Var != null && mt1Var.f3350a == lt1Var) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        long j = this.K;
        if (mt1Var != null) {
            if (mt1Var.l != null) {
                z2 = false;
            }
            cp3.m(z2);
            if (mt1Var.d) {
                mt1Var.f3350a.x(j - mt1Var.o);
            }
        }
        t();
    }

    public final void k(IOException iOException, int i) {
        jt0 jt0Var = new jt0(0, iOException, i);
        mt1 mt1Var = this.s.h;
        if (mt1Var != null) {
            jt0Var = jt0Var.a(mt1Var.f.f3725a);
        }
        sn1.d("ExoPlayerImplInternal", "Playback error", jt0Var);
        a0(false, false);
        this.x = this.x.d(jt0Var);
    }

    public final void l(boolean z) {
        rt1 rt1Var;
        long d;
        mt1 mt1Var = this.s.j;
        if (mt1Var == null) {
            rt1Var = this.x.f3786b;
        } else {
            rt1Var = mt1Var.f.f3725a;
        }
        boolean z2 = !this.x.k.equals(rt1Var);
        if (z2) {
            this.x = this.x.a(rt1Var);
        }
        p52 p52Var = this.x;
        if (mt1Var == null) {
            d = p52Var.r;
        } else {
            d = mt1Var.d();
        }
        p52Var.p = d;
        p52 p52Var2 = this.x;
        long j = p52Var2.p;
        mt1 mt1Var2 = this.s.j;
        long j2 = 0;
        if (mt1Var2 != null) {
            j2 = Math.max(0L, j - (this.K - mt1Var2.o));
        }
        p52Var2.q = j2;
        if ((z2 || z) && mt1Var != null && mt1Var.d) {
            d0(mt1Var.n);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x0199, code lost:            if (r5 != 2) goto L83;     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x01aa, code lost:            r5 = true;        r8 = r8;     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x01a8, code lost:            if (r5.g(r3.f3537b) != false) goto L83;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x035b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(defpackage.a93 r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hu0.m(a93, boolean):void");
    }

    public final void n(lt1 lt1Var) {
        boolean z;
        pt1 pt1Var = this.s;
        mt1 mt1Var = pt1Var.j;
        if (mt1Var != null && mt1Var.f3350a == lt1Var) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        float f = this.o.d().f3957a;
        a93 a93Var = this.x.f3785a;
        mt1Var.d = true;
        mt1Var.m = mt1Var.f3350a.p();
        db3 g = mt1Var.g(f, a93Var);
        ot1 ot1Var = mt1Var.f;
        long j = ot1Var.f3726b;
        long j2 = ot1Var.e;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long a2 = mt1Var.a(g, j, false, new boolean[mt1Var.i.length]);
        long j3 = mt1Var.o;
        ot1 ot1Var2 = mt1Var.f;
        mt1Var.o = (ot1Var2.f3726b - a2) + j3;
        mt1Var.f = ot1Var2.b(a2);
        d0(mt1Var.n);
        if (mt1Var == pt1Var.h) {
            E(mt1Var.f.f3726b);
            g(new boolean[this.f2487a.length]);
            p52 p52Var = this.x;
            rt1 rt1Var = p52Var.f3786b;
            long j4 = mt1Var.f.f3726b;
            this.x = p(rt1Var, j4, p52Var.c, j4, false, 5);
        }
        t();
    }

    public final void o(q52 q52Var, float f, boolean z, boolean z2) {
        int i;
        hu0 hu0Var = this;
        if (z) {
            if (z2) {
                hu0Var.y.a(1);
            }
            p52 p52Var = hu0Var.x;
            hu0Var = this;
            hu0Var.x = new p52(p52Var.f3785a, p52Var.f3786b, p52Var.c, p52Var.d, p52Var.e, p52Var.f, p52Var.g, p52Var.h, p52Var.i, p52Var.j, p52Var.k, p52Var.l, p52Var.m, q52Var, p52Var.p, p52Var.q, p52Var.r, p52Var.o);
        }
        float f2 = q52Var.f3957a;
        mt1 mt1Var = hu0Var.s.h;
        while (true) {
            i = 0;
            if (mt1Var == null) {
                break;
            }
            mu0[] mu0VarArr = mt1Var.n.c;
            int length = mu0VarArr.length;
            while (i < length) {
                mu0 mu0Var = mu0VarArr[i];
                if (mu0Var != null) {
                    mu0Var.i(f2);
                }
                i++;
            }
            mt1Var = mt1Var.l;
        }
        ko[] koVarArr = hu0Var.f2487a;
        int length2 = koVarArr.length;
        while (i < length2) {
            ko koVar = koVarArr[i];
            if (koVar != null) {
                koVar.w(f, q52Var.f3957a);
            }
            i++;
        }
    }

    public final p52 p(rt1 rt1Var, long j, long j2, long j3, boolean z, int i) {
        boolean z2;
        va3 va3Var;
        db3 db3Var;
        List list;
        long max;
        boolean z3;
        va3 va3Var2;
        db3 db3Var2;
        ji2 ji2Var;
        if (!this.M && j == this.x.r && rt1Var.equals(this.x.f3786b)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.M = z2;
        D();
        p52 p52Var = this.x;
        va3 va3Var3 = p52Var.h;
        db3 db3Var3 = p52Var.i;
        List list2 = p52Var.j;
        if (this.t.k) {
            mt1 mt1Var = this.s.h;
            if (mt1Var == null) {
                va3Var2 = va3.d;
            } else {
                va3Var2 = mt1Var.m;
            }
            if (mt1Var == null) {
                db3Var2 = this.e;
            } else {
                db3Var2 = mt1Var.n;
            }
            mu0[] mu0VarArr = db3Var2.c;
            cb1 cb1Var = new cb1();
            boolean z4 = false;
            for (mu0 mu0Var : mu0VarArr) {
                if (mu0Var != null) {
                    Metadata metadata = mu0Var.d(0).j;
                    if (metadata == null) {
                        cb1Var.Z(new Metadata(new Metadata.Entry[0]));
                    } else {
                        cb1Var.Z(metadata);
                        z4 = true;
                    }
                }
            }
            if (z4) {
                ji2Var = cb1Var.b0();
            } else {
                db1 db1Var = hb1.f2394b;
                ji2Var = ji2.e;
            }
            if (mt1Var != null) {
                ot1 ot1Var = mt1Var.f;
                if (ot1Var.c != j2) {
                    mt1Var.f = ot1Var.a(j2);
                }
            }
            list = ji2Var;
            va3Var = va3Var2;
            db3Var = db3Var2;
        } else if (!rt1Var.equals(p52Var.f3786b)) {
            va3Var = va3.d;
            db3Var = this.e;
            list = ji2.e;
        } else {
            va3Var = va3Var3;
            db3Var = db3Var3;
            list = list2;
        }
        if (z) {
            eu0 eu0Var = this.y;
            if (eu0Var.d && eu0Var.e != 5) {
                if (i == 5) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                cp3.e(z3);
            } else {
                eu0Var.f1996a = true;
                eu0Var.d = true;
                eu0Var.e = i;
            }
        }
        p52 p52Var2 = this.x;
        long j4 = p52Var2.p;
        mt1 mt1Var2 = this.s.j;
        if (mt1Var2 == null) {
            max = 0;
        } else {
            max = Math.max(0L, j4 - (this.K - mt1Var2.o));
        }
        return p52Var2.b(rt1Var, j, j2, j3, max, va3Var, db3Var, list);
    }

    public final boolean q() {
        long d;
        mt1 mt1Var = this.s.j;
        if (mt1Var == null) {
            return false;
        }
        if (!mt1Var.d) {
            d = 0;
        } else {
            d = mt1Var.f3350a.d();
        }
        if (d == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public final boolean s() {
        mt1 mt1Var = this.s.h;
        long j = mt1Var.f.e;
        if (mt1Var.d && (j == -9223372036854775807L || this.x.r < j || !X())) {
            return true;
        }
        return false;
    }

    public final void t() {
        long d;
        long max;
        boolean c;
        boolean z = false;
        if (!q()) {
            c = false;
        } else {
            mt1 mt1Var = this.s.j;
            if (!mt1Var.d) {
                d = 0;
            } else {
                d = mt1Var.f3350a.d();
            }
            mt1 mt1Var2 = this.s.j;
            if (mt1Var2 == null) {
                max = 0;
            } else {
                max = Math.max(0L, d - (this.K - mt1Var2.o));
            }
            if (mt1Var != this.s.h) {
                long j = mt1Var.f.f3726b;
            }
            c = ((di0) this.f).c(max, this.o.d().f3957a);
            if (!c && max < 500000 && (this.m > 0 || this.n)) {
                this.s.h.f3350a.v(this.x.r, false);
                c = ((di0) this.f).c(max, this.o.d().f3957a);
            }
        }
        this.D = c;
        if (c) {
            mt1 mt1Var3 = this.s.j;
            long j2 = this.K;
            if (mt1Var3.l == null) {
                z = true;
            }
            cp3.m(z);
            mt1Var3.f3350a.h(j2 - mt1Var3.o);
        }
        c0();
    }

    public final void u() {
        boolean z;
        eu0 eu0Var = this.y;
        p52 p52Var = this.x;
        boolean z2 = eu0Var.f1996a;
        if (eu0Var.f1997b != p52Var) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = z2 | z;
        eu0Var.f1996a = z3;
        eu0Var.f1997b = p52Var;
        if (z3) {
            bu0 bu0Var = this.r.f4055a;
            bu0Var.i.c(new lf(9, bu0Var, eu0Var));
            this.y = new eu0(this.x);
        }
    }

    public final void v() {
        m(this.t.b(), true);
    }

    public final void w() {
        this.y.a(1);
        throw null;
    }

    public final void x() {
        int i;
        this.y.a(1);
        int i2 = 0;
        C(false, false, false, true);
        ((di0) this.f).b(false);
        if (this.x.f3785a.q()) {
            i = 4;
        } else {
            i = 2;
        }
        W(i);
        mg0 mg0Var = (mg0) this.g;
        mg0Var.getClass();
        fu1 fu1Var = this.t;
        cp3.m(!fu1Var.k);
        fu1Var.l = mg0Var;
        while (true) {
            ArrayList arrayList = fu1Var.f2158b;
            if (i2 < arrayList.size()) {
                du1 du1Var = (du1) arrayList.get(i2);
                fu1Var.e(du1Var);
                fu1Var.g.add(du1Var);
                i2++;
            } else {
                fu1Var.k = true;
                this.h.d(2);
                return;
            }
        }
    }

    public final synchronized boolean y() {
        if (!this.z && this.j.getThread().isAlive()) {
            this.h.d(7);
            g0(new kt0(this, 2), this.v);
            return this.z;
        }
        return true;
    }

    public final void z() {
        C(true, false, true, false);
        ((di0) this.f).b(true);
        W(1);
        HandlerThread handlerThread = this.i;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.z = true;
            notifyAll();
        }
    }
}
