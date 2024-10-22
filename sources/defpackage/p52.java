package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class p52 {
    public static final rt1 s = new rt1(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final a93 f3785a;

    /* renamed from: b, reason: collision with root package name */
    public final rt1 f3786b;
    public final long c;
    public final long d;
    public final int e;
    public final jt0 f;
    public final boolean g;
    public final va3 h;
    public final db3 i;
    public final List j;
    public final rt1 k;
    public final boolean l;
    public final int m;
    public final q52 n;
    public final boolean o;
    public volatile long p;
    public volatile long q;
    public volatile long r;

    public p52(a93 a93Var, rt1 rt1Var, long j, long j2, int i, jt0 jt0Var, boolean z, va3 va3Var, db3 db3Var, List list, rt1 rt1Var2, boolean z2, int i2, q52 q52Var, long j3, long j4, long j5, boolean z3) {
        this.f3785a = a93Var;
        this.f3786b = rt1Var;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = jt0Var;
        this.g = z;
        this.h = va3Var;
        this.i = db3Var;
        this.j = list;
        this.k = rt1Var2;
        this.l = z2;
        this.m = i2;
        this.n = q52Var;
        this.p = j3;
        this.q = j4;
        this.r = j5;
        this.o = z3;
    }

    public static p52 g(db3 db3Var) {
        x83 x83Var = a93.f42a;
        rt1 rt1Var = s;
        return new p52(x83Var, rt1Var, -9223372036854775807L, 0L, 1, null, false, va3.d, db3Var, ji2.e, rt1Var, false, 0, q52.d, 0L, 0L, 0L, false);
    }

    public final p52 a(rt1 rt1Var) {
        return new p52(this.f3785a, this.f3786b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, rt1Var, this.l, this.m, this.n, this.p, this.q, this.r, this.o);
    }

    public final p52 b(rt1 rt1Var, long j, long j2, long j3, long j4, va3 va3Var, db3 db3Var, List list) {
        return new p52(this.f3785a, rt1Var, j2, j3, this.e, this.f, this.g, va3Var, db3Var, list, this.k, this.l, this.m, this.n, this.p, j4, j, this.o);
    }

    public final p52 c(int i, boolean z) {
        return new p52(this.f3785a, this.f3786b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, this.n, this.p, this.q, this.r, this.o);
    }

    public final p52 d(jt0 jt0Var) {
        return new p52(this.f3785a, this.f3786b, this.c, this.d, this.e, jt0Var, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.o);
    }

    public final p52 e(int i) {
        return new p52(this.f3785a, this.f3786b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.o);
    }

    public final p52 f(a93 a93Var) {
        return new p52(a93Var, this.f3786b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.o);
    }
}
