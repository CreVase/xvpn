package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class ss1 implements bs {
    public static final ts1 f = new ts1(new rs1());
    public static final String g = wi3.z(0);
    public static final String h = wi3.z(1);
    public static final String i = wi3.z(2);
    public static final String j = wi3.z(3);
    public static final String k = wi3.z(4);
    public static final qy2 l = new qy2(20);

    /* renamed from: a, reason: collision with root package name */
    public final long f4406a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4407b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ss1(rs1 rs1Var) {
        this.f4406a = rs1Var.f4204a;
        this.f4407b = rs1Var.f4205b;
        this.c = rs1Var.c;
        this.d = rs1Var.d;
        this.e = rs1Var.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss1)) {
            return false;
        }
        ss1 ss1Var = (ss1) obj;
        if (this.f4406a == ss1Var.f4406a && this.f4407b == ss1Var.f4407b && this.c == ss1Var.c && this.d == ss1Var.d && this.e == ss1Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f4406a;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        long j3 = this.f4407b;
        return ((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0);
    }

    @Override // defpackage.bs
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        ts1 ts1Var = f;
        long j2 = ts1Var.f4406a;
        long j3 = this.f4406a;
        if (j3 != j2) {
            bundle.putLong(g, j3);
        }
        long j4 = ts1Var.f4407b;
        long j5 = this.f4407b;
        if (j5 != j4) {
            bundle.putLong(h, j5);
        }
        boolean z = ts1Var.c;
        boolean z2 = this.c;
        if (z2 != z) {
            bundle.putBoolean(i, z2);
        }
        boolean z3 = ts1Var.d;
        boolean z4 = this.d;
        if (z4 != z3) {
            bundle.putBoolean(j, z4);
        }
        boolean z5 = ts1Var.e;
        boolean z6 = this.e;
        if (z6 != z5) {
            bundle.putBoolean(k, z6);
        }
        return bundle;
    }
}
