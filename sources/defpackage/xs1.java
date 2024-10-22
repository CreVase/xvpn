package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class xs1 implements bs {
    public static final xs1 f = new xs1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
    public static final String g = wi3.z(0);
    public static final String h = wi3.z(1);
    public static final String i = wi3.z(2);
    public static final String j = wi3.z(3);
    public static final String k = wi3.z(4);
    public static final qy2 l = new qy2(21);

    /* renamed from: a, reason: collision with root package name */
    public final long f5210a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5211b;
    public final long c;
    public final float d;
    public final float e;

    public xs1(long j2, long j3, long j4, float f2, float f3) {
        this.f5210a = j2;
        this.f5211b = j3;
        this.c = j4;
        this.d = f2;
        this.e = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs1)) {
            return false;
        }
        xs1 xs1Var = (xs1) obj;
        if (this.f5210a == xs1Var.f5210a && this.f5211b == xs1Var.f5211b && this.c == xs1Var.c && this.d == xs1Var.d && this.e == xs1Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        long j2 = this.f5210a;
        long j3 = this.f5211b;
        int i3 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.c;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        int i5 = 0;
        float f2 = this.d;
        if (f2 != 0.0f) {
            i2 = Float.floatToIntBits(f2);
        } else {
            i2 = 0;
        }
        int i6 = (i4 + i2) * 31;
        float f3 = this.e;
        if (f3 != 0.0f) {
            i5 = Float.floatToIntBits(f3);
        }
        return i6 + i5;
    }

    @Override // defpackage.bs
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        long j2 = this.f5210a;
        if (j2 != -9223372036854775807L) {
            bundle.putLong(g, j2);
        }
        long j3 = this.f5211b;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(h, j3);
        }
        long j4 = this.c;
        if (j4 != -9223372036854775807L) {
            bundle.putLong(i, j4);
        }
        float f2 = this.d;
        if (f2 != -3.4028235E38f) {
            bundle.putFloat(j, f2);
        }
        float f3 = this.e;
        if (f3 != -3.4028235E38f) {
            bundle.putFloat(k, f3);
        }
        return bundle;
    }
}
