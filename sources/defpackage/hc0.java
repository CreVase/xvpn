package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class hc0 implements bs {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f2398a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f2399b;
    public final Layout.Alignment c;
    public final Bitmap d;
    public final float e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final int m;
    public final int n;
    public final float o;
    public final int p;
    public final float q;
    public static final hc0 r = new hc0("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    public static final String s = wi3.z(0);
    public static final String t = wi3.z(1);
    public static final String u = wi3.z(2);
    public static final String v = wi3.z(3);
    public static final String w = wi3.z(4);
    public static final String x = wi3.z(5);
    public static final String y = wi3.z(6);
    public static final String z = wi3.z(7);
    public static final String A = wi3.z(8);
    public static final String B = wi3.z(9);
    public static final String C = wi3.z(10);
    public static final String D = wi3.z(11);
    public static final String E = wi3.z(12);
    public static final String F = wi3.z(13);
    public static final String G = wi3.z(14);
    public static final String H = wi3.z(15);
    public static final String I = wi3.z(16);
    public static final ef0 J = new ef0(9);

    public hc0(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z2, int i5, int i6, float f6) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            cp3.e(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f2398a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f2398a = charSequence.toString();
        } else {
            this.f2398a = null;
        }
        this.f2399b = alignment;
        this.c = alignment2;
        this.d = bitmap;
        this.e = f;
        this.f = i;
        this.g = i2;
        this.h = f2;
        this.i = i3;
        this.j = f4;
        this.k = f5;
        this.l = z2;
        this.m = i5;
        this.n = i4;
        this.o = f3;
        this.p = i6;
        this.q = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hc0.class != obj.getClass()) {
            return false;
        }
        hc0 hc0Var = (hc0) obj;
        if (TextUtils.equals(this.f2398a, hc0Var.f2398a) && this.f2399b == hc0Var.f2399b && this.c == hc0Var.c) {
            Bitmap bitmap = hc0Var.d;
            Bitmap bitmap2 = this.d;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.e == hc0Var.e && this.f == hc0Var.f && this.g == hc0Var.g && this.h == hc0Var.h && this.i == hc0Var.i && this.j == hc0Var.j && this.k == hc0Var.k && this.l == hc0Var.l && this.m == hc0Var.m && this.n == hc0Var.n && this.o == hc0Var.o && this.p == hc0Var.p && this.q == hc0Var.q) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2398a, this.f2399b, this.c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Float.valueOf(this.h), Integer.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.k), Boolean.valueOf(this.l), Integer.valueOf(this.m), Integer.valueOf(this.n), Float.valueOf(this.o), Integer.valueOf(this.p), Float.valueOf(this.q)});
    }

    @Override // defpackage.bs
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(s, this.f2398a);
        bundle.putSerializable(t, this.f2399b);
        bundle.putSerializable(u, this.c);
        bundle.putParcelable(v, this.d);
        bundle.putFloat(w, this.e);
        bundle.putInt(x, this.f);
        bundle.putInt(y, this.g);
        bundle.putFloat(z, this.h);
        bundle.putInt(A, this.i);
        bundle.putInt(B, this.n);
        bundle.putFloat(C, this.o);
        bundle.putFloat(D, this.j);
        bundle.putFloat(E, this.k);
        bundle.putBoolean(G, this.l);
        bundle.putInt(F, this.m);
        bundle.putInt(H, this.p);
        bundle.putFloat(I, this.q);
        return bundle;
    }
}
