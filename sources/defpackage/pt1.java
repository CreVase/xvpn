package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public final class pt1 {

    /* renamed from: a, reason: collision with root package name */
    public final y83 f3912a = new y83();

    /* renamed from: b, reason: collision with root package name */
    public final z83 f3913b = new z83();
    public final pa c;
    public final j71 d;
    public long e;
    public int f;
    public boolean g;
    public mt1 h;
    public mt1 i;
    public mt1 j;
    public int k;
    public Object l;
    public long m;

    public pt1(pa paVar, z43 z43Var) {
        this.c = paVar;
        this.d = z43Var;
    }

    public static rt1 l(a93 a93Var, Object obj, long j, long j2, z83 z83Var, y83 y83Var) {
        a93Var.h(obj, y83Var);
        a93Var.n(y83Var.c, z83Var);
        int b2 = a93Var.b(obj);
        Object obj2 = obj;
        while (y83Var.d == 0) {
            r7 r7Var = y83Var.g;
            if (r7Var.f4111b <= 0 || !y83Var.g(r7Var.e) || y83Var.c(0L) != -1) {
                break;
            }
            int i = b2 + 1;
            if (b2 >= z83Var.p) {
                break;
            }
            a93Var.g(i, y83Var, true);
            obj2 = y83Var.f5294b;
            obj2.getClass();
            b2 = i;
        }
        a93Var.h(obj2, y83Var);
        int c = y83Var.c(j);
        if (c == -1) {
            return new rt1(obj2, j2, y83Var.b(j));
        }
        return new rt1(obj2, c, y83Var.e(c), j2);
    }

    public final mt1 a() {
        mt1 mt1Var = this.h;
        if (mt1Var == null) {
            return null;
        }
        if (mt1Var == this.i) {
            this.i = mt1Var.l;
        }
        mt1Var.f();
        int i = this.k - 1;
        this.k = i;
        if (i == 0) {
            this.j = null;
            mt1 mt1Var2 = this.h;
            this.l = mt1Var2.f3351b;
            this.m = mt1Var2.f.f3725a.d;
        }
        this.h = this.h.l;
        j();
        return this.h;
    }

    public final void b() {
        if (this.k == 0) {
            return;
        }
        mt1 mt1Var = this.h;
        cp3.o(mt1Var);
        this.l = mt1Var.f3351b;
        this.m = mt1Var.f.f3725a.d;
        while (mt1Var != null) {
            mt1Var.f();
            mt1Var = mt1Var.l;
        }
        this.h = null;
        this.j = null;
        this.i = null;
        this.k = 0;
        j();
    }

    public final ot1 c(a93 a93Var, mt1 mt1Var, long j) {
        boolean z;
        long j2;
        Object obj;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        ot1 ot1Var = mt1Var.f;
        long j9 = (mt1Var.o + ot1Var.e) - j;
        boolean z2 = ot1Var.g;
        y83 y83Var = this.f3912a;
        long j10 = ot1Var.c;
        rt1 rt1Var = ot1Var.f3725a;
        if (z2) {
            boolean z3 = true;
            int d = a93Var.d(a93Var.b(rt1Var.f3536a), this.f3912a, this.f3913b, this.f, this.g);
            if (d == -1) {
                return null;
            }
            int i = a93Var.g(d, y83Var, true).c;
            Object obj2 = y83Var.f5294b;
            obj2.getClass();
            if (a93Var.n(i, this.f3913b).o == d) {
                Pair k = a93Var.k(this.f3913b, this.f3912a, i, -9223372036854775807L, Math.max(0L, j9));
                if (k == null) {
                    return null;
                }
                obj2 = k.first;
                long longValue = ((Long) k.second).longValue();
                mt1 mt1Var2 = mt1Var.l;
                if (mt1Var2 != null && mt1Var2.f3351b.equals(obj2)) {
                    j4 = mt1Var2.f.f3725a.d;
                } else {
                    j4 = this.e;
                    this.e = 1 + j4;
                }
                j5 = longValue;
                j6 = -9223372036854775807L;
            } else {
                j4 = rt1Var.d;
                j5 = 0;
                j6 = 0;
            }
            rt1 l = l(a93Var, obj2, j5, j4, this.f3913b, this.f3912a);
            if (j6 != -9223372036854775807L && j10 != -9223372036854775807L) {
                if (a93Var.h(rt1Var.f3536a, y83Var).g.f4111b <= 0 || !y83Var.g(y83Var.g.e)) {
                    z3 = false;
                }
                if (l.a() && z3) {
                    j8 = j10;
                    j7 = j5;
                    return d(a93Var, l, j8, j7);
                }
                if (z3) {
                    j7 = j10;
                    j8 = j6;
                    return d(a93Var, l, j8, j7);
                }
            }
            j7 = j5;
            j8 = j6;
            return d(a93Var, l, j8, j7);
        }
        a93Var.h(rt1Var.f3536a, y83Var);
        boolean a2 = rt1Var.a();
        Object obj3 = rt1Var.f3536a;
        if (a2) {
            int i2 = rt1Var.f3537b;
            int i3 = y83Var.g.a(i2).f3964b;
            if (i3 == -1) {
                return null;
            }
            int a3 = y83Var.g.a(i2).a(rt1Var.c);
            if (a3 < i3) {
                return e(a93Var, rt1Var.f3536a, i2, a3, ot1Var.c, rt1Var.d);
            }
            if (j10 == -9223372036854775807L) {
                obj = obj3;
                Pair k2 = a93Var.k(this.f3913b, y83Var, y83Var.c, -9223372036854775807L, Math.max(0L, j9));
                if (k2 == null) {
                    return null;
                }
                j10 = ((Long) k2.second).longValue();
            } else {
                obj = obj3;
            }
            a93Var.h(obj, y83Var);
            r7 r7Var = y83Var.g;
            int i4 = rt1Var.f3537b;
            long j11 = r7Var.a(i4).f3963a;
            if (j11 == Long.MIN_VALUE) {
                j3 = y83Var.d;
            } else {
                j3 = y83Var.g.a(i4).g + j11;
            }
            return f(a93Var, rt1Var.f3536a, Math.max(j3, j10), ot1Var.c, rt1Var.d);
        }
        int i5 = rt1Var.e;
        int e = y83Var.e(i5);
        if (y83Var.g(i5) && y83Var.d(i5, e) == 3) {
            z = true;
        } else {
            z = false;
        }
        if (e != y83Var.g.a(i5).f3964b && !z) {
            return e(a93Var, rt1Var.f3536a, rt1Var.e, e, ot1Var.e, rt1Var.d);
        }
        a93Var.h(obj3, y83Var);
        long j12 = y83Var.g.a(i5).f3963a;
        if (j12 == Long.MIN_VALUE) {
            j2 = y83Var.d;
        } else {
            j2 = j12 + y83Var.g.a(i5).g;
        }
        return f(a93Var, rt1Var.f3536a, j2, ot1Var.e, rt1Var.d);
    }

    public final ot1 d(a93 a93Var, rt1 rt1Var, long j, long j2) {
        a93Var.h(rt1Var.f3536a, this.f3912a);
        if (rt1Var.a()) {
            return e(a93Var, rt1Var.f3536a, rt1Var.f3537b, rt1Var.c, j, rt1Var.d);
        }
        return f(a93Var, rt1Var.f3536a, j2, j, rt1Var.d);
    }

    public final ot1 e(a93 a93Var, Object obj, int i, int i2, long j, long j2) {
        long j3;
        long j4;
        rt1 rt1Var = new rt1(obj, i, i2, j2);
        y83 y83Var = this.f3912a;
        long a2 = a93Var.h(obj, y83Var).a(i, i2);
        if (i2 == y83Var.e(i)) {
            j3 = y83Var.g.c;
        } else {
            j3 = 0;
        }
        boolean g = y83Var.g(i);
        if (a2 != -9223372036854775807L && j3 >= a2) {
            j4 = Math.max(0L, a2 - 1);
        } else {
            j4 = j3;
        }
        return new ot1(rt1Var, j4, j, -9223372036854775807L, a2, g, false, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:            if (r5.g(r10.e) != false) goto L27;     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ot1 f(defpackage.a93 r26, java.lang.Object r27, long r28, long r30, long r32) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pt1.f(a93, java.lang.Object, long, long, long):ot1");
    }

    public final ot1 g(a93 a93Var, ot1 ot1Var) {
        boolean z;
        long j;
        long j2;
        boolean z2;
        rt1 rt1Var = ot1Var.f3725a;
        if (!rt1Var.a() && rt1Var.e == -1) {
            z = true;
        } else {
            z = false;
        }
        boolean i = i(a93Var, rt1Var);
        boolean h = h(a93Var, rt1Var, z);
        Object obj = ot1Var.f3725a.f3536a;
        y83 y83Var = this.f3912a;
        a93Var.h(obj, y83Var);
        boolean a2 = rt1Var.a();
        int i2 = rt1Var.e;
        if (!a2 && i2 != -1) {
            j = y83Var.g.a(i2).f3963a;
        } else {
            j = -9223372036854775807L;
        }
        boolean a3 = rt1Var.a();
        int i3 = rt1Var.f3537b;
        if (a3) {
            j2 = y83Var.a(i3, rt1Var.c);
        } else if (j != -9223372036854775807L && j != Long.MIN_VALUE) {
            j2 = j;
        } else {
            j2 = y83Var.d;
        }
        if (rt1Var.a()) {
            z2 = y83Var.g(i3);
        } else if (i2 != -1 && y83Var.g(i2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new ot1(rt1Var, ot1Var.f3726b, ot1Var.c, j, j2, z2, z, i, h);
    }

    public final boolean h(a93 a93Var, rt1 rt1Var, boolean z) {
        boolean z2;
        int b2 = a93Var.b(rt1Var.f3536a);
        if (a93Var.n(a93Var.g(b2, this.f3912a, false).c, this.f3913b).i) {
            return false;
        }
        if (a93Var.d(b2, this.f3912a, this.f3913b, this.f, this.g) == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || !z) {
            return false;
        }
        return true;
    }

    public final boolean i(a93 a93Var, rt1 rt1Var) {
        boolean z;
        if (!rt1Var.a() && rt1Var.e == -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        Object obj = rt1Var.f3536a;
        int i = a93Var.h(obj, this.f3912a).c;
        if (a93Var.n(i, this.f3913b).p == a93Var.b(obj)) {
            return true;
        }
        return false;
    }

    public final void j() {
        rt1 rt1Var;
        db1 db1Var = hb1.f2394b;
        cb1 cb1Var = new cb1();
        for (mt1 mt1Var = this.h; mt1Var != null; mt1Var = mt1Var.l) {
            cb1Var.Z(mt1Var.f.f3725a);
        }
        mt1 mt1Var2 = this.i;
        if (mt1Var2 == null) {
            rt1Var = null;
        } else {
            rt1Var = mt1Var2.f.f3725a;
        }
        ((z43) this.d).c(new cq0(6, this, cb1Var, rt1Var));
    }

    public final boolean k(mt1 mt1Var) {
        boolean z;
        boolean z2 = false;
        if (mt1Var != null) {
            z = true;
        } else {
            z = false;
        }
        cp3.m(z);
        if (mt1Var.equals(this.j)) {
            return false;
        }
        this.j = mt1Var;
        while (true) {
            mt1Var = mt1Var.l;
            if (mt1Var == null) {
                break;
            }
            if (mt1Var == this.i) {
                this.i = this.h;
                z2 = true;
            }
            mt1Var.f();
            this.k--;
        }
        mt1 mt1Var2 = this.j;
        if (mt1Var2.l != null) {
            mt1Var2.b();
            mt1Var2.l = null;
            mt1Var2.c();
        }
        j();
        return z2;
    }

    public final rt1 m(a93 a93Var, Object obj, long j) {
        long j2;
        int b2;
        Object obj2 = obj;
        y83 y83Var = this.f3912a;
        int i = a93Var.h(obj2, y83Var).c;
        Object obj3 = this.l;
        if (obj3 != null && (b2 = a93Var.b(obj3)) != -1 && a93Var.g(b2, y83Var, false).c == i) {
            j2 = this.m;
        } else {
            mt1 mt1Var = this.h;
            while (true) {
                if (mt1Var != null) {
                    if (mt1Var.f3351b.equals(obj2)) {
                        j2 = mt1Var.f.f3725a.d;
                        break;
                    }
                    mt1Var = mt1Var.l;
                } else {
                    mt1 mt1Var2 = this.h;
                    while (true) {
                        if (mt1Var2 != null) {
                            int b3 = a93Var.b(mt1Var2.f3351b);
                            if (b3 != -1 && a93Var.g(b3, y83Var, false).c == i) {
                                j2 = mt1Var2.f.f3725a.d;
                                break;
                            }
                            mt1Var2 = mt1Var2.l;
                        } else {
                            j2 = this.e;
                            this.e = 1 + j2;
                            if (this.h == null) {
                                this.l = obj2;
                                this.m = j2;
                            }
                        }
                    }
                }
            }
        }
        long j3 = j2;
        a93Var.h(obj2, y83Var);
        int i2 = y83Var.c;
        z83 z83Var = this.f3913b;
        a93Var.n(i2, z83Var);
        boolean z = false;
        for (int b4 = a93Var.b(obj); b4 >= z83Var.o; b4--) {
            boolean z2 = true;
            a93Var.g(b4, y83Var, true);
            if (y83Var.g.f4111b <= 0) {
                z2 = false;
            }
            z |= z2;
            if (y83Var.c(y83Var.d) != -1) {
                obj2 = y83Var.f5294b;
                obj2.getClass();
            }
            if (z && (!z2 || y83Var.d != 0)) {
                break;
            }
        }
        return l(a93Var, obj2, j, j3, this.f3913b, this.f3912a);
    }

    public final boolean n(a93 a93Var) {
        mt1 mt1Var;
        mt1 mt1Var2 = this.h;
        if (mt1Var2 == null) {
            return true;
        }
        int b2 = a93Var.b(mt1Var2.f3351b);
        while (true) {
            b2 = a93Var.d(b2, this.f3912a, this.f3913b, this.f, this.g);
            while (true) {
                mt1Var = mt1Var2.l;
                if (mt1Var == null || mt1Var2.f.g) {
                    break;
                }
                mt1Var2 = mt1Var;
            }
            if (b2 == -1 || mt1Var == null || a93Var.b(mt1Var.f3351b) != b2) {
                break;
            }
            mt1Var2 = mt1Var;
        }
        boolean k = k(mt1Var2);
        mt1Var2.f = g(a93Var, mt1Var2.f);
        return !k;
    }

    public final boolean o(a93 a93Var, long j, long j2) {
        boolean k;
        boolean z;
        ot1 ot1Var;
        boolean z2;
        long j3;
        boolean z3;
        mt1 mt1Var = null;
        for (mt1 mt1Var2 = this.h; mt1Var2 != null; mt1Var2 = mt1Var2.l) {
            ot1 ot1Var2 = mt1Var2.f;
            if (mt1Var == null) {
                ot1Var = g(a93Var, ot1Var2);
            } else {
                ot1 c = c(a93Var, mt1Var, j);
                if (c == null) {
                    k = k(mt1Var);
                } else {
                    if (ot1Var2.f3726b == c.f3726b && ot1Var2.f3725a.equals(c.f3725a)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        k = k(mt1Var);
                    } else {
                        ot1Var = c;
                    }
                }
                return !k;
            }
            mt1Var2.f = ot1Var.a(ot1Var2.c);
            long j4 = ot1Var.e;
            long j5 = ot1Var2.e;
            if (j5 != -9223372036854775807L && j5 != j4) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                mt1Var2.h();
                if (j4 == -9223372036854775807L) {
                    j3 = Long.MAX_VALUE;
                } else {
                    j3 = mt1Var2.o + j4;
                }
                if (mt1Var2 == this.i && !mt1Var2.f.f && (j2 == Long.MIN_VALUE || j2 >= j3)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!k(mt1Var2) && !z3) {
                    return true;
                }
                return false;
            }
            mt1Var = mt1Var2;
        }
        return true;
    }
}
