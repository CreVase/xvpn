package defpackage;

import android.os.Bundle;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class y01 implements bs {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public int H;

    /* renamed from: a, reason: collision with root package name */
    public final String f5252a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5253b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final String i;
    public final Metadata j;
    public final String k;
    public final String l;
    public final int m;
    public final List n;
    public final DrmInitData o;
    public final long p;
    public final int q;
    public final int r;
    public final float s;
    public final int t;
    public final float u;
    public final byte[] v;
    public final int w;
    public final e20 x;
    public final int y;
    public final int z;
    public static final y01 I = new y01(new x01());
    public static final String J = wi3.z(0);
    public static final String K = wi3.z(1);
    public static final String L = wi3.z(2);
    public static final String M = wi3.z(3);
    public static final String N = wi3.z(4);
    public static final String O = wi3.z(5);
    public static final String P = wi3.z(6);
    public static final String Q = wi3.z(7);
    public static final String R = wi3.z(8);
    public static final String X = wi3.z(9);
    public static final String Y = wi3.z(10);
    public static final String Z = wi3.z(11);
    public static final String h0 = wi3.z(12);
    public static final String i0 = wi3.z(13);
    public static final String j0 = wi3.z(14);
    public static final String k0 = wi3.z(15);
    public static final String l0 = wi3.z(16);
    public static final String m0 = wi3.z(17);
    public static final String n0 = wi3.z(18);
    public static final String o0 = wi3.z(19);
    public static final String p0 = wi3.z(20);
    public static final String q0 = wi3.z(21);
    public static final String r0 = wi3.z(22);
    public static final String s0 = wi3.z(23);
    public static final String t0 = wi3.z(24);
    public static final String u0 = wi3.z(25);
    public static final String v0 = wi3.z(26);
    public static final String w0 = wi3.z(27);
    public static final String x0 = wi3.z(28);
    public static final String y0 = wi3.z(29);
    public static final String z0 = wi3.z(30);
    public static final String A0 = wi3.z(31);
    public static final qy2 B0 = new qy2(17);

    public y01(x01 x01Var) {
        this.f5252a = x01Var.f5098a;
        this.f5253b = x01Var.f5099b;
        this.c = wi3.D(x01Var.c);
        this.d = x01Var.d;
        this.e = x01Var.e;
        int i = x01Var.f;
        this.f = i;
        int i2 = x01Var.g;
        this.g = i2;
        this.h = i2 != -1 ? i2 : i;
        this.i = x01Var.h;
        this.j = x01Var.i;
        this.k = x01Var.j;
        this.l = x01Var.k;
        this.m = x01Var.l;
        List list = x01Var.m;
        this.n = list == null ? Collections.emptyList() : list;
        DrmInitData drmInitData = x01Var.n;
        this.o = drmInitData;
        this.p = x01Var.o;
        this.q = x01Var.p;
        this.r = x01Var.q;
        this.s = x01Var.r;
        int i3 = x01Var.s;
        this.t = i3 == -1 ? 0 : i3;
        float f = x01Var.t;
        this.u = f == -1.0f ? 1.0f : f;
        this.v = x01Var.u;
        this.w = x01Var.v;
        this.x = x01Var.w;
        this.y = x01Var.x;
        this.z = x01Var.y;
        this.A = x01Var.z;
        int i4 = x01Var.A;
        this.B = i4 == -1 ? 0 : i4;
        int i5 = x01Var.B;
        this.C = i5 != -1 ? i5 : 0;
        this.D = x01Var.C;
        this.E = x01Var.D;
        this.F = x01Var.E;
        int i6 = x01Var.F;
        if (i6 == 0 && drmInitData != null) {
            this.G = 1;
        } else {
            this.G = i6;
        }
    }

    public static String d(int i) {
        return h0 + "_" + Integer.toString(i, 36);
    }

    public final x01 a() {
        return new x01(this);
    }

    public final int b() {
        int i;
        int i2 = this.q;
        if (i2 == -1 || (i = this.r) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final boolean c(y01 y01Var) {
        List list = this.n;
        if (list.size() != y01Var.n.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) y01Var.n.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final Bundle e(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString(J, this.f5252a);
        bundle.putString(K, this.f5253b);
        bundle.putString(L, this.c);
        bundle.putInt(M, this.d);
        bundle.putInt(N, this.e);
        bundle.putInt(O, this.f);
        bundle.putInt(P, this.g);
        bundle.putString(Q, this.i);
        if (!z) {
            bundle.putParcelable(R, this.j);
        }
        bundle.putString(X, this.k);
        bundle.putString(Y, this.l);
        bundle.putInt(Z, this.m);
        int i = 0;
        while (true) {
            List list = this.n;
            if (i >= list.size()) {
                break;
            }
            bundle.putByteArray(d(i), (byte[]) list.get(i));
            i++;
        }
        bundle.putParcelable(i0, this.o);
        bundle.putLong(j0, this.p);
        bundle.putInt(k0, this.q);
        bundle.putInt(l0, this.r);
        bundle.putFloat(m0, this.s);
        bundle.putInt(n0, this.t);
        bundle.putFloat(o0, this.u);
        bundle.putByteArray(p0, this.v);
        bundle.putInt(q0, this.w);
        e20 e20Var = this.x;
        if (e20Var != null) {
            bundle.putBundle(r0, e20Var.toBundle());
        }
        bundle.putInt(s0, this.y);
        bundle.putInt(t0, this.z);
        bundle.putInt(u0, this.A);
        bundle.putInt(v0, this.B);
        bundle.putInt(w0, this.C);
        bundle.putInt(x0, this.D);
        bundle.putInt(z0, this.E);
        bundle.putInt(A0, this.F);
        bundle.putInt(y0, this.G);
        return bundle;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || y01.class != obj.getClass()) {
            return false;
        }
        y01 y01Var = (y01) obj;
        int i2 = this.H;
        if ((i2 == 0 || (i = y01Var.H) == 0 || i2 == i) && this.d == y01Var.d && this.e == y01Var.e && this.f == y01Var.f && this.g == y01Var.g && this.m == y01Var.m && this.p == y01Var.p && this.q == y01Var.q && this.r == y01Var.r && this.t == y01Var.t && this.w == y01Var.w && this.y == y01Var.y && this.z == y01Var.z && this.A == y01Var.A && this.B == y01Var.B && this.C == y01Var.C && this.D == y01Var.D && this.E == y01Var.E && this.F == y01Var.F && this.G == y01Var.G && Float.compare(this.s, y01Var.s) == 0 && Float.compare(this.u, y01Var.u) == 0 && wi3.a(this.f5252a, y01Var.f5252a) && wi3.a(this.f5253b, y01Var.f5253b) && wi3.a(this.i, y01Var.i) && wi3.a(this.k, y01Var.k) && wi3.a(this.l, y01Var.l) && wi3.a(this.c, y01Var.c) && Arrays.equals(this.v, y01Var.v) && wi3.a(this.j, y01Var.j) && wi3.a(this.x, y01Var.x) && wi3.a(this.o, y01Var.o) && c(y01Var)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        if (this.H == 0) {
            int i2 = 0;
            String str = this.f5252a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i3 = (527 + hashCode) * 31;
            String str2 = this.f5253b;
            if (str2 != null) {
                i = str2.hashCode();
            } else {
                i = 0;
            }
            int i4 = (i3 + i) * 31;
            String str3 = this.c;
            if (str3 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str3.hashCode();
            }
            int i5 = (((((((((i4 + hashCode2) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31;
            String str4 = this.i;
            if (str4 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str4.hashCode();
            }
            int i6 = (i5 + hashCode3) * 31;
            Metadata metadata = this.j;
            if (metadata == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = metadata.hashCode();
            }
            int i7 = (i6 + hashCode4) * 31;
            String str5 = this.k;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i8 = (i7 + hashCode5) * 31;
            String str6 = this.l;
            if (str6 != null) {
                i2 = str6.hashCode();
            }
            this.H = ((((((((((((((((((((Float.floatToIntBits(this.u) + ((((Float.floatToIntBits(this.s) + ((((((((((i8 + i2) * 31) + this.m) * 31) + ((int) this.p)) * 31) + this.q) * 31) + this.r) * 31)) * 31) + this.t) * 31)) * 31) + this.w) * 31) + this.y) * 31) + this.z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G;
        }
        return this.H;
    }

    @Override // defpackage.bs
    public final Bundle toBundle() {
        return e(false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f5252a);
        sb.append(", ");
        sb.append(this.f5253b);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.l);
        sb.append(", ");
        sb.append(this.i);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", [");
        sb.append(this.q);
        sb.append(", ");
        sb.append(this.r);
        sb.append(", ");
        sb.append(this.s);
        sb.append("], [");
        sb.append(this.y);
        sb.append(", ");
        return hx2.r(sb, this.z, "])");
    }
}
