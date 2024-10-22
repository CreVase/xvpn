package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public final class mt1 {

    /* renamed from: a, reason: collision with root package name */
    public final lt1 f3350a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3351b;
    public final rm2[] c;
    public boolean d;
    public boolean e;
    public ot1 f;
    public boolean g;
    public final boolean[] h;
    public final ko[] i;
    public final hq1 j;
    public final fu1 k;
    public mt1 l;
    public va3 m;
    public db3 n;
    public long o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [b10] */
    public mt1(ko[] koVarArr, long j, hq1 hq1Var, cf0 cf0Var, fu1 fu1Var, ot1 ot1Var, db3 db3Var) {
        this.i = koVarArr;
        this.o = j;
        this.j = hq1Var;
        this.k = fu1Var;
        rt1 rt1Var = ot1Var.f3725a;
        this.f3351b = rt1Var.f3536a;
        this.f = ot1Var;
        this.m = va3.d;
        this.n = db3Var;
        this.c = new rm2[koVarArr.length];
        this.h = new boolean[koVarArr.length];
        long j2 = ot1Var.d;
        fu1Var.getClass();
        int i = d62.n;
        Pair pair = (Pair) rt1Var.f3536a;
        Object obj = pair.first;
        rt1 b2 = rt1Var.b(pair.second);
        du1 du1Var = (du1) fu1Var.d.get(obj);
        du1Var.getClass();
        fu1Var.g.add(du1Var);
        cu1 cu1Var = (cu1) fu1Var.f.get(du1Var);
        if (cu1Var != null) {
            cu1Var.f1677a.d(cu1Var.f1678b);
        }
        du1Var.c.add(b2);
        lq1 a2 = du1Var.f1839a.a(b2, cf0Var, ot1Var.f3726b);
        fu1Var.c.put(a2, du1Var);
        fu1Var.c();
        this.f3350a = j2 != -9223372036854775807L ? new b10(a2, true, 0L, j2) : a2;
    }

    public final long a(db3 db3Var, long j, boolean z, boolean[] zArr) {
        ko[] koVarArr;
        rm2[] rm2VarArr;
        boolean z2;
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= db3Var.f1753a) {
                break;
            }
            if (z || !db3Var.a(this.n, i)) {
                z3 = false;
            }
            this.h[i] = z3;
            i++;
        }
        int i2 = 0;
        while (true) {
            koVarArr = this.i;
            int length = koVarArr.length;
            rm2VarArr = this.c;
            if (i2 >= length) {
                break;
            }
            if (koVarArr[i2].f2983a == -2) {
                rm2VarArr[i2] = null;
            }
            i2++;
        }
        b();
        this.n = db3Var;
        c();
        long b2 = this.f3350a.b(db3Var.c, this.h, this.c, zArr, j);
        for (int i3 = 0; i3 < koVarArr.length; i3++) {
            if (koVarArr[i3].f2983a == -2 && this.n.b(i3)) {
                rm2VarArr[i3] = new d5();
            }
        }
        this.e = false;
        for (int i4 = 0; i4 < rm2VarArr.length; i4++) {
            if (rm2VarArr[i4] != null) {
                cp3.m(db3Var.b(i4));
                if (koVarArr[i4].f2983a != -2) {
                    this.e = true;
                }
            } else {
                if (db3Var.c[i4] == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                cp3.m(z2);
            }
        }
        return b2;
    }

    public final void b() {
        boolean z;
        int i = 0;
        if (this.l == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        while (true) {
            db3 db3Var = this.n;
            if (i < db3Var.f1753a) {
                boolean b2 = db3Var.b(i);
                mu0 mu0Var = this.n.c[i];
                if (b2 && mu0Var != null) {
                    mu0Var.g();
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void c() {
        boolean z;
        int i = 0;
        if (this.l == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        while (true) {
            db3 db3Var = this.n;
            if (i < db3Var.f1753a) {
                boolean b2 = db3Var.b(i);
                mu0 mu0Var = this.n.c[i];
                if (b2 && mu0Var != null) {
                    mu0Var.e();
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final long d() {
        long j;
        if (!this.d) {
            return this.f.f3726b;
        }
        if (this.e) {
            j = this.f3350a.t();
        } else {
            j = Long.MIN_VALUE;
        }
        if (j == Long.MIN_VALUE) {
            return this.f.e;
        }
        return j;
    }

    public final long e() {
        return this.f.f3726b + this.o;
    }

    public final void f() {
        b();
        lt1 lt1Var = this.f3350a;
        try {
            boolean z = lt1Var instanceof b10;
            fu1 fu1Var = this.k;
            if (z) {
                fu1Var.f(((b10) lt1Var).f384a);
            } else {
                fu1Var.f(lt1Var);
            }
        } catch (RuntimeException e) {
            sn1.d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:217:0x03a6, code lost:            if (r6 != 2) goto L192;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.db3 g(float r25, defpackage.a93 r26) {
        /*
            Method dump skipped, instructions count: 1383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mt1.g(float, a93):db3");
    }

    public final void h() {
        lt1 lt1Var = this.f3350a;
        if (lt1Var instanceof b10) {
            long j = this.f.d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            b10 b10Var = (b10) lt1Var;
            b10Var.e = 0L;
            b10Var.f = j;
        }
    }
}
