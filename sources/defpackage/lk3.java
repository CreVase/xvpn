package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class lk3 implements bs {
    public static final String e = wi3.z(0);
    public static final String f = wi3.z(1);
    public static final String g = wi3.z(2);
    public static final String h = wi3.z(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f3145a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3146b;
    public final int c;
    public final float d;

    public lk3(int i, int i2, int i3, float f2) {
        this.f3145a = i;
        this.f3146b = i2;
        this.c = i3;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk3)) {
            return false;
        }
        lk3 lk3Var = (lk3) obj;
        if (this.f3145a == lk3Var.f3145a && this.f3146b == lk3Var.f3146b && this.c == lk3Var.c && this.d == lk3Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.d) + ((((((217 + this.f3145a) * 31) + this.f3146b) * 31) + this.c) * 31);
    }

    @Override // defpackage.bs
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(e, this.f3145a);
        bundle.putInt(f, this.f3146b);
        bundle.putInt(g, this.c);
        bundle.putFloat(h, this.d);
        return bundle;
    }
}
