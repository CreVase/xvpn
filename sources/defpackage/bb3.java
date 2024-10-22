package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public class bb3 implements bs {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;

    /* renamed from: a, reason: collision with root package name */
    public final int f438a;

    /* renamed from: b, reason: collision with root package name */
    public final int f439b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final hb1 l;
    public final int m;
    public final hb1 n;
    public final int o;
    public final int p;
    public final int q;
    public final hb1 r;
    public final hb1 s;
    public final int t;
    public final int u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final kb1 y;
    public final ob1 z;

    static {
        new bb3(new ab3());
        A = wi3.z(1);
        B = wi3.z(2);
        C = wi3.z(3);
        D = wi3.z(4);
        E = wi3.z(5);
        F = wi3.z(6);
        G = wi3.z(7);
        H = wi3.z(8);
        I = wi3.z(9);
        J = wi3.z(10);
        K = wi3.z(11);
        L = wi3.z(12);
        M = wi3.z(13);
        N = wi3.z(14);
        O = wi3.z(15);
        P = wi3.z(16);
        Q = wi3.z(17);
        R = wi3.z(18);
        X = wi3.z(19);
        Y = wi3.z(20);
        Z = wi3.z(21);
        h0 = wi3.z(22);
        i0 = wi3.z(23);
        j0 = wi3.z(24);
        k0 = wi3.z(25);
        l0 = wi3.z(26);
    }

    public bb3(ab3 ab3Var) {
        this.f438a = ab3Var.f51a;
        this.f439b = ab3Var.f52b;
        this.c = ab3Var.c;
        this.d = ab3Var.d;
        ab3Var.getClass();
        this.e = 0;
        ab3Var.getClass();
        this.f = 0;
        ab3Var.getClass();
        this.g = 0;
        ab3Var.getClass();
        this.h = 0;
        this.i = ab3Var.e;
        this.j = ab3Var.f;
        this.k = ab3Var.g;
        this.l = ab3Var.h;
        this.m = ab3Var.i;
        this.n = ab3Var.j;
        this.o = ab3Var.k;
        this.p = ab3Var.l;
        this.q = ab3Var.m;
        this.r = ab3Var.n;
        this.s = ab3Var.o;
        this.t = ab3Var.p;
        this.u = ab3Var.q;
        this.v = ab3Var.r;
        this.w = ab3Var.s;
        this.x = ab3Var.t;
        this.y = kb1.c(ab3Var.u);
        this.z = ob1.l(ab3Var.v);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bb3 bb3Var = (bb3) obj;
        if (this.f438a == bb3Var.f438a && this.f439b == bb3Var.f439b && this.c == bb3Var.c && this.d == bb3Var.d && this.e == bb3Var.e && this.f == bb3Var.f && this.g == bb3Var.g && this.h == bb3Var.h && this.k == bb3Var.k && this.i == bb3Var.i && this.j == bb3Var.j && this.l.equals(bb3Var.l) && this.m == bb3Var.m && this.n.equals(bb3Var.n) && this.o == bb3Var.o && this.p == bb3Var.p && this.q == bb3Var.q && this.r.equals(bb3Var.r) && this.s.equals(bb3Var.s) && this.t == bb3Var.t && this.u == bb3Var.u && this.v == bb3Var.v && this.w == bb3Var.w && this.x == bb3Var.x) {
            kb1 kb1Var = this.y;
            kb1Var.getClass();
            if (m20.f0(kb1Var, bb3Var.y) && this.z.equals(bb3Var.z)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.z.hashCode() + ((this.y.hashCode() + ((((((((((((this.s.hashCode() + ((this.r.hashCode() + ((((((((this.n.hashCode() + ((((this.l.hashCode() + ((((((((((((((((((((((this.f438a + 31) * 31) + this.f439b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + (this.k ? 1 : 0)) * 31) + this.i) * 31) + this.j) * 31)) * 31) + this.m) * 31)) * 31) + this.o) * 31) + this.p) * 31) + this.q) * 31)) * 31)) * 31) + this.t) * 31) + this.u) * 31) + (this.v ? 1 : 0)) * 31) + (this.w ? 1 : 0)) * 31) + (this.x ? 1 : 0)) * 31)) * 31);
    }

    @Override // defpackage.bs
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(F, this.f438a);
        bundle.putInt(G, this.f439b);
        bundle.putInt(H, this.c);
        bundle.putInt(I, this.d);
        bundle.putInt(J, this.e);
        bundle.putInt(K, this.f);
        bundle.putInt(L, this.g);
        bundle.putInt(M, this.h);
        bundle.putInt(N, this.i);
        bundle.putInt(O, this.j);
        bundle.putBoolean(P, this.k);
        bundle.putStringArray(Q, (String[]) this.l.toArray(new String[0]));
        bundle.putInt(k0, this.m);
        bundle.putStringArray(A, (String[]) this.n.toArray(new String[0]));
        bundle.putInt(B, this.o);
        bundle.putInt(R, this.p);
        bundle.putInt(X, this.q);
        bundle.putStringArray(Y, (String[]) this.r.toArray(new String[0]));
        bundle.putStringArray(C, (String[]) this.s.toArray(new String[0]));
        bundle.putInt(D, this.t);
        bundle.putInt(l0, this.u);
        bundle.putBoolean(E, this.v);
        bundle.putBoolean(Z, this.w);
        bundle.putBoolean(h0, this.x);
        bundle.putParcelableArrayList(i0, cp3.R(this.y.values()));
        bundle.putIntArray(j0, cp3.Q(this.z));
        return bundle;
    }
}
