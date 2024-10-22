package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class fb3 implements bs {
    public static final String f = wi3.z(0);
    public static final String g = wi3.z(1);
    public static final String h = wi3.z(3);
    public static final String i = wi3.z(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f2069a;

    /* renamed from: b, reason: collision with root package name */
    public final ua3 f2070b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        new qb0(6);
    }

    public fb3(ua3 ua3Var, boolean z, int[] iArr, boolean[] zArr) {
        boolean z2;
        int i2 = ua3Var.f4643a;
        this.f2069a = i2;
        boolean z3 = false;
        if (i2 == iArr.length && i2 == zArr.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        cp3.e(z2);
        this.f2070b = ua3Var;
        if (z && i2 > 1) {
            z3 = true;
        }
        this.c = z3;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final int a() {
        return this.f2070b.c;
    }

    public final boolean b() {
        for (boolean z : this.e) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fb3.class != obj.getClass()) {
            return false;
        }
        fb3 fb3Var = (fb3) obj;
        if (this.c == fb3Var.c && this.f2070b.equals(fb3Var.f2070b) && Arrays.equals(this.d, fb3Var.d) && Arrays.equals(this.e, fb3Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.f2070b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }

    @Override // defpackage.bs
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f, this.f2070b.toBundle());
        bundle.putIntArray(g, this.d);
        bundle.putBooleanArray(h, this.e);
        bundle.putBoolean(i, this.c);
        return bundle;
    }
}
