package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class hj0 implements bs {
    public static final String d = wi3.z(0);
    public static final String e = wi3.z(1);
    public static final String f = wi3.z(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f2433a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f2434b;
    public final int c;

    static {
        new ef0(12);
    }

    public hj0(int i, int i2, int[] iArr) {
        this.f2433a = i;
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.f2434b = copyOf;
        this.c = i2;
        Arrays.sort(copyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hj0.class != obj.getClass()) {
            return false;
        }
        hj0 hj0Var = (hj0) obj;
        if (this.f2433a == hj0Var.f2433a && Arrays.equals(this.f2434b, hj0Var.f2434b) && this.c == hj0Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f2434b) + (this.f2433a * 31)) * 31) + this.c;
    }

    @Override // defpackage.bs
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f2433a);
        bundle.putIntArray(e, this.f2434b);
        bundle.putInt(f, this.c);
        return bundle;
    }
}
