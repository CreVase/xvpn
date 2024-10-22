package defpackage;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class rc1 {
    public static final rc1 e = new rc1(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f4129a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4130b;
    public final int c;
    public final int d;

    public rc1(int i, int i2, int i3, int i4) {
        this.f4129a = i;
        this.f4130b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static rc1 a(rc1 rc1Var, rc1 rc1Var2) {
        return b(Math.max(rc1Var.f4129a, rc1Var2.f4129a), Math.max(rc1Var.f4130b, rc1Var2.f4130b), Math.max(rc1Var.c, rc1Var2.c), Math.max(rc1Var.d, rc1Var2.d));
    }

    public static rc1 b(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return e;
        }
        return new rc1(i, i2, i3, i4);
    }

    public static rc1 c(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return b(i, i2, i3, i4);
    }

    public final Insets d() {
        return qc1.a(this.f4129a, this.f4130b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rc1.class != obj.getClass()) {
            return false;
        }
        rc1 rc1Var = (rc1) obj;
        if (this.d == rc1Var.d && this.f4129a == rc1Var.f4129a && this.c == rc1Var.c && this.f4130b == rc1Var.f4130b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f4129a * 31) + this.f4130b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f4129a + ", top=" + this.f4130b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
