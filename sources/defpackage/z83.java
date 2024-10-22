package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class z83 implements bs {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final Object r = new Object();
    public static final Object s = new Object();
    public static final dt1 t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;

    /* renamed from: b, reason: collision with root package name */
    public Object f5445b;
    public Object d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public boolean j;
    public xs1 k;
    public boolean l;
    public long m;
    public long n;
    public int o;
    public int p;
    public long q;

    /* renamed from: a, reason: collision with root package name */
    public Object f5444a = r;
    public dt1 c = t;

    static {
        qs1 qs1Var = new qs1();
        qs1Var.f4047a = "com.google.android.exoplayer2.Timeline";
        qs1Var.f4048b = Uri.EMPTY;
        t = qs1Var.a();
        u = wi3.z(1);
        v = wi3.z(2);
        w = wi3.z(3);
        x = wi3.z(4);
        y = wi3.z(5);
        z = wi3.z(6);
        A = wi3.z(7);
        B = wi3.z(8);
        C = wi3.z(9);
        D = wi3.z(10);
        E = wi3.z(11);
        F = wi3.z(12);
        G = wi3.z(13);
        new qb0(4);
    }

    public final boolean a() {
        boolean z2;
        boolean z3;
        boolean z4 = this.j;
        if (this.k != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z4 == z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        cp3.m(z3);
        if (this.k != null) {
            return true;
        }
        return false;
    }

    public final void b(Object obj, dt1 dt1Var, Object obj2, long j, long j2, long j3, boolean z2, boolean z3, xs1 xs1Var, long j4, long j5, int i, int i2, long j6) {
        dt1 dt1Var2;
        Object obj3;
        boolean z4;
        zs1 zs1Var;
        this.f5444a = obj;
        if (dt1Var != null) {
            dt1Var2 = dt1Var;
        } else {
            dt1Var2 = t;
        }
        this.c = dt1Var2;
        if (dt1Var != null && (zs1Var = dt1Var.f1834b) != null) {
            obj3 = zs1Var.g;
        } else {
            obj3 = null;
        }
        this.f5445b = obj3;
        this.d = obj2;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = z2;
        this.i = z3;
        if (xs1Var != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.j = z4;
        this.k = xs1Var;
        this.m = j4;
        this.n = j5;
        this.o = i;
        this.p = i2;
        this.q = j6;
        this.l = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !z83.class.equals(obj.getClass())) {
            return false;
        }
        z83 z83Var = (z83) obj;
        if (wi3.a(this.f5444a, z83Var.f5444a) && wi3.a(this.c, z83Var.c) && wi3.a(this.d, z83Var.d) && wi3.a(this.k, z83Var.k) && this.e == z83Var.e && this.f == z83Var.f && this.g == z83Var.g && this.h == z83Var.h && this.i == z83Var.i && this.l == z83Var.l && this.m == z83Var.m && this.n == z83Var.n && this.o == z83Var.o && this.p == z83Var.p && this.q == z83Var.q) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.c.hashCode() + ((this.f5444a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        xs1 xs1Var = this.k;
        if (xs1Var != null) {
            i = xs1Var.hashCode();
        }
        int i3 = (i2 + i) * 31;
        long j = this.e;
        int i4 = (i3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f;
        int i5 = (i4 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.g;
        int i6 = (((((((i5 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.l ? 1 : 0)) * 31;
        long j4 = this.m;
        int i7 = (i6 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.n;
        int i8 = (((((i7 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.o) * 31) + this.p) * 31;
        long j6 = this.q;
        return i8 + ((int) (j6 ^ (j6 >>> 32)));
    }

    @Override // defpackage.bs
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (!dt1.g.equals(this.c)) {
            bundle.putBundle(u, this.c.toBundle());
        }
        long j = this.e;
        if (j != -9223372036854775807L) {
            bundle.putLong(v, j);
        }
        long j2 = this.f;
        if (j2 != -9223372036854775807L) {
            bundle.putLong(w, j2);
        }
        long j3 = this.g;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(x, j3);
        }
        boolean z2 = this.h;
        if (z2) {
            bundle.putBoolean(y, z2);
        }
        boolean z3 = this.i;
        if (z3) {
            bundle.putBoolean(z, z3);
        }
        xs1 xs1Var = this.k;
        if (xs1Var != null) {
            bundle.putBundle(A, xs1Var.toBundle());
        }
        boolean z4 = this.l;
        if (z4) {
            bundle.putBoolean(B, z4);
        }
        long j4 = this.m;
        if (j4 != 0) {
            bundle.putLong(C, j4);
        }
        long j5 = this.n;
        if (j5 != -9223372036854775807L) {
            bundle.putLong(D, j5);
        }
        int i = this.o;
        if (i != 0) {
            bundle.putInt(E, i);
        }
        int i2 = this.p;
        if (i2 != 0) {
            bundle.putInt(F, i2);
        }
        long j6 = this.q;
        if (j6 != 0) {
            bundle.putLong(G, j6);
        }
        return bundle;
    }
}
