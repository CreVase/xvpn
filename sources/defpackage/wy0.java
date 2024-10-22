package defpackage;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class wy0 {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f5085a;

    public wy0(SparseBooleanArray sparseBooleanArray) {
        this.f5085a = sparseBooleanArray;
    }

    public final int a(int i) {
        cp3.i(i, b());
        return this.f5085a.keyAt(i);
    }

    public final int b() {
        return this.f5085a.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy0)) {
            return false;
        }
        wy0 wy0Var = (wy0) obj;
        if (wi3.f5017a < 24) {
            if (b() != wy0Var.b()) {
                return false;
            }
            for (int i = 0; i < b(); i++) {
                if (a(i) != wy0Var.a(i)) {
                    return false;
                }
            }
            return true;
        }
        return this.f5085a.equals(wy0Var.f5085a);
    }

    public final int hashCode() {
        if (wi3.f5017a < 24) {
            int b2 = b();
            for (int i = 0; i < b(); i++) {
                b2 = (b2 * 31) + a(i);
            }
            return b2;
        }
        return this.f5085a.hashCode();
    }
}
