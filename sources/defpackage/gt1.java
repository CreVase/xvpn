package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class gt1 implements bs {
    public final CharSequence A;
    public final Integer B;
    public final Integer C;
    public final CharSequence D;
    public final CharSequence E;
    public final CharSequence F;
    public final Integer G;
    public final Bundle H;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f2321a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f2322b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final ig2 h;
    public final ig2 i;
    public final byte[] j;
    public final Integer k;
    public final Uri l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Boolean p;
    public final Boolean q;
    public final Integer r;
    public final Integer s;
    public final Integer t;
    public final Integer u;
    public final Integer v;
    public final Integer w;
    public final Integer x;
    public final CharSequence y;
    public final CharSequence z;
    public static final gt1 I = new gt1(new ft1());
    public static final String J = wi3.z(0);
    public static final String K = wi3.z(1);
    public static final String L = wi3.z(2);
    public static final String M = wi3.z(3);
    public static final String N = wi3.z(4);
    public static final String O = wi3.z(5);
    public static final String P = wi3.z(6);
    public static final String Q = wi3.z(8);
    public static final String R = wi3.z(9);
    public static final String X = wi3.z(10);
    public static final String Y = wi3.z(11);
    public static final String Z = wi3.z(12);
    public static final String h0 = wi3.z(13);
    public static final String i0 = wi3.z(14);
    public static final String j0 = wi3.z(15);
    public static final String k0 = wi3.z(16);
    public static final String l0 = wi3.z(17);
    public static final String m0 = wi3.z(18);
    public static final String n0 = wi3.z(19);
    public static final String o0 = wi3.z(20);
    public static final String p0 = wi3.z(21);
    public static final String q0 = wi3.z(22);
    public static final String r0 = wi3.z(23);
    public static final String s0 = wi3.z(24);
    public static final String t0 = wi3.z(25);
    public static final String u0 = wi3.z(26);
    public static final String v0 = wi3.z(27);
    public static final String w0 = wi3.z(28);
    public static final String x0 = wi3.z(29);
    public static final String y0 = wi3.z(30);
    public static final String z0 = wi3.z(31);
    public static final String A0 = wi3.z(32);
    public static final String B0 = wi3.z(1000);
    public static final qy2 C0 = new qy2(23);

    public gt1(ft1 ft1Var) {
        Boolean bool = ft1Var.p;
        Integer num = ft1Var.o;
        Integer num2 = ft1Var.F;
        int i = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            i = 1;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                }
                num = Integer.valueOf(i);
            }
        } else if (num != null) {
            bool = Boolean.valueOf(num.intValue() != -1);
            if (bool.booleanValue() && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i = 21;
                        break;
                    case 3:
                        i = 22;
                        break;
                    case 4:
                        i = 23;
                        break;
                    case 5:
                        i = 24;
                        break;
                    case 6:
                        i = 25;
                        break;
                    default:
                        i = 20;
                        break;
                }
                num2 = Integer.valueOf(i);
            }
        }
        this.f2321a = ft1Var.f2149a;
        this.f2322b = ft1Var.f2150b;
        this.c = ft1Var.c;
        this.d = ft1Var.d;
        this.e = ft1Var.e;
        this.f = ft1Var.f;
        this.g = ft1Var.g;
        this.h = ft1Var.h;
        this.i = ft1Var.i;
        this.j = ft1Var.j;
        this.k = ft1Var.k;
        this.l = ft1Var.l;
        this.m = ft1Var.m;
        this.n = ft1Var.n;
        this.o = num;
        this.p = bool;
        this.q = ft1Var.q;
        Integer num3 = ft1Var.r;
        this.r = num3;
        this.s = num3;
        this.t = ft1Var.s;
        this.u = ft1Var.t;
        this.v = ft1Var.u;
        this.w = ft1Var.v;
        this.x = ft1Var.w;
        this.y = ft1Var.x;
        this.z = ft1Var.y;
        this.A = ft1Var.z;
        this.B = ft1Var.A;
        this.C = ft1Var.B;
        this.D = ft1Var.C;
        this.E = ft1Var.D;
        this.F = ft1Var.E;
        this.G = num2;
        this.H = ft1Var.G;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gt1.class != obj.getClass()) {
            return false;
        }
        gt1 gt1Var = (gt1) obj;
        if (wi3.a(this.f2321a, gt1Var.f2321a) && wi3.a(this.f2322b, gt1Var.f2322b) && wi3.a(this.c, gt1Var.c) && wi3.a(this.d, gt1Var.d) && wi3.a(this.e, gt1Var.e) && wi3.a(this.f, gt1Var.f) && wi3.a(this.g, gt1Var.g) && wi3.a(this.h, gt1Var.h) && wi3.a(this.i, gt1Var.i) && Arrays.equals(this.j, gt1Var.j) && wi3.a(this.k, gt1Var.k) && wi3.a(this.l, gt1Var.l) && wi3.a(this.m, gt1Var.m) && wi3.a(this.n, gt1Var.n) && wi3.a(this.o, gt1Var.o) && wi3.a(this.p, gt1Var.p) && wi3.a(this.q, gt1Var.q) && wi3.a(this.s, gt1Var.s) && wi3.a(this.t, gt1Var.t) && wi3.a(this.u, gt1Var.u) && wi3.a(this.v, gt1Var.v) && wi3.a(this.w, gt1Var.w) && wi3.a(this.x, gt1Var.x) && wi3.a(this.y, gt1Var.y) && wi3.a(this.z, gt1Var.z) && wi3.a(this.A, gt1Var.A) && wi3.a(this.B, gt1Var.B) && wi3.a(this.C, gt1Var.C) && wi3.a(this.D, gt1Var.D) && wi3.a(this.E, gt1Var.E) && wi3.a(this.F, gt1Var.F) && wi3.a(this.G, gt1Var.G)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2321a, this.f2322b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, Integer.valueOf(Arrays.hashCode(this.j)), this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G});
    }

    @Override // defpackage.bs
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f2321a;
        if (charSequence != null) {
            bundle.putCharSequence(J, charSequence);
        }
        CharSequence charSequence2 = this.f2322b;
        if (charSequence2 != null) {
            bundle.putCharSequence(K, charSequence2);
        }
        CharSequence charSequence3 = this.c;
        if (charSequence3 != null) {
            bundle.putCharSequence(L, charSequence3);
        }
        CharSequence charSequence4 = this.d;
        if (charSequence4 != null) {
            bundle.putCharSequence(M, charSequence4);
        }
        CharSequence charSequence5 = this.e;
        if (charSequence5 != null) {
            bundle.putCharSequence(N, charSequence5);
        }
        CharSequence charSequence6 = this.f;
        if (charSequence6 != null) {
            bundle.putCharSequence(O, charSequence6);
        }
        CharSequence charSequence7 = this.g;
        if (charSequence7 != null) {
            bundle.putCharSequence(P, charSequence7);
        }
        byte[] bArr = this.j;
        if (bArr != null) {
            bundle.putByteArray(X, bArr);
        }
        Uri uri = this.l;
        if (uri != null) {
            bundle.putParcelable(Y, uri);
        }
        CharSequence charSequence8 = this.y;
        if (charSequence8 != null) {
            bundle.putCharSequence(q0, charSequence8);
        }
        CharSequence charSequence9 = this.z;
        if (charSequence9 != null) {
            bundle.putCharSequence(r0, charSequence9);
        }
        CharSequence charSequence10 = this.A;
        if (charSequence10 != null) {
            bundle.putCharSequence(s0, charSequence10);
        }
        CharSequence charSequence11 = this.D;
        if (charSequence11 != null) {
            bundle.putCharSequence(v0, charSequence11);
        }
        CharSequence charSequence12 = this.E;
        if (charSequence12 != null) {
            bundle.putCharSequence(w0, charSequence12);
        }
        CharSequence charSequence13 = this.F;
        if (charSequence13 != null) {
            bundle.putCharSequence(y0, charSequence13);
        }
        ig2 ig2Var = this.h;
        if (ig2Var != null) {
            bundle.putBundle(Q, ig2Var.toBundle());
        }
        ig2 ig2Var2 = this.i;
        if (ig2Var2 != null) {
            bundle.putBundle(R, ig2Var2.toBundle());
        }
        Integer num = this.m;
        if (num != null) {
            bundle.putInt(Z, num.intValue());
        }
        Integer num2 = this.n;
        if (num2 != null) {
            bundle.putInt(h0, num2.intValue());
        }
        Integer num3 = this.o;
        if (num3 != null) {
            bundle.putInt(i0, num3.intValue());
        }
        Boolean bool = this.p;
        if (bool != null) {
            bundle.putBoolean(A0, bool.booleanValue());
        }
        Boolean bool2 = this.q;
        if (bool2 != null) {
            bundle.putBoolean(j0, bool2.booleanValue());
        }
        Integer num4 = this.s;
        if (num4 != null) {
            bundle.putInt(k0, num4.intValue());
        }
        Integer num5 = this.t;
        if (num5 != null) {
            bundle.putInt(l0, num5.intValue());
        }
        Integer num6 = this.u;
        if (num6 != null) {
            bundle.putInt(m0, num6.intValue());
        }
        Integer num7 = this.v;
        if (num7 != null) {
            bundle.putInt(n0, num7.intValue());
        }
        Integer num8 = this.w;
        if (num8 != null) {
            bundle.putInt(o0, num8.intValue());
        }
        Integer num9 = this.x;
        if (num9 != null) {
            bundle.putInt(p0, num9.intValue());
        }
        Integer num10 = this.B;
        if (num10 != null) {
            bundle.putInt(t0, num10.intValue());
        }
        Integer num11 = this.C;
        if (num11 != null) {
            bundle.putInt(u0, num11.intValue());
        }
        Integer num12 = this.k;
        if (num12 != null) {
            bundle.putInt(x0, num12.intValue());
        }
        Integer num13 = this.G;
        if (num13 != null) {
            bundle.putInt(z0, num13.intValue());
        }
        Bundle bundle2 = this.H;
        if (bundle2 != null) {
            bundle.putBundle(B0, bundle2);
        }
        return bundle;
    }
}
