package defpackage;

import android.os.Bundle;
import android.util.Pair;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a93 implements bs {

    /* renamed from: a, reason: collision with root package name */
    public static final x83 f42a = new x83();

    /* renamed from: b, reason: collision with root package name */
    public static final String f43b = wi3.z(0);
    public static final String c = wi3.z(1);
    public static final String d = wi3.z(2);

    public int a(boolean z) {
        if (q()) {
            return -1;
        }
        return 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i, y83 y83Var, z83 z83Var, int i2, boolean z) {
        int i3 = g(i, y83Var, false).c;
        if (n(i3, z83Var).p == i) {
            int e = e(i3, i2, z);
            if (e == -1) {
                return -1;
            }
            return n(e, z83Var).o;
        }
        return i + 1;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == c(z)) {
                        return a(z);
                    }
                    return i + 1;
                }
                throw new IllegalStateException();
            }
            return i;
        }
        if (i == c(z)) {
            return -1;
        }
        return i + 1;
    }

    public final boolean equals(Object obj) {
        int c2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a93)) {
            return false;
        }
        a93 a93Var = (a93) obj;
        if (a93Var.p() != p() || a93Var.i() != i()) {
            return false;
        }
        z83 z83Var = new z83();
        y83 y83Var = new y83();
        z83 z83Var2 = new z83();
        y83 y83Var2 = new y83();
        for (int i = 0; i < p(); i++) {
            if (!n(i, z83Var).equals(a93Var.n(i, z83Var2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < i(); i2++) {
            if (!g(i2, y83Var, true).equals(a93Var.g(i2, y83Var2, true))) {
                return false;
            }
        }
        int a2 = a(true);
        if (a2 != a93Var.a(true) || (c2 = c(true)) != a93Var.c(true)) {
            return false;
        }
        while (a2 != c2) {
            int e = e(a2, 0, true);
            if (e != a93Var.e(a2, 0, true)) {
                return false;
            }
            a2 = e;
        }
        return true;
    }

    public final y83 f(int i, y83 y83Var) {
        return g(i, y83Var, false);
    }

    public abstract y83 g(int i, y83 y83Var, boolean z);

    public y83 h(Object obj, y83 y83Var) {
        return g(b(obj), y83Var, true);
    }

    public final int hashCode() {
        z83 z83Var = new z83();
        y83 y83Var = new y83();
        int p = p() + 217;
        for (int i = 0; i < p(); i++) {
            p = (p * 31) + n(i, z83Var).hashCode();
        }
        int i2 = i() + (p * 31);
        for (int i3 = 0; i3 < i(); i3++) {
            i2 = (i2 * 31) + g(i3, y83Var, true).hashCode();
        }
        int a2 = a(true);
        while (a2 != -1) {
            i2 = (i2 * 31) + a2;
            a2 = e(a2, 0, true);
        }
        return i2;
    }

    public abstract int i();

    public final Pair j(z83 z83Var, y83 y83Var, int i, long j) {
        Pair k = k(z83Var, y83Var, i, j, 0L);
        k.getClass();
        return k;
    }

    public final Pair k(z83 z83Var, y83 y83Var, int i, long j, long j2) {
        cp3.i(i, p());
        o(i, z83Var, j2);
        if (j == -9223372036854775807L) {
            j = z83Var.m;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = z83Var.o;
        f(i2, y83Var);
        while (i2 < z83Var.p && y83Var.e != j) {
            int i3 = i2 + 1;
            if (g(i3, y83Var, false).e > j) {
                break;
            }
            i2 = i3;
        }
        g(i2, y83Var, true);
        long j3 = j - y83Var.e;
        long j4 = y83Var.d;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0L, j3);
        Object obj = y83Var.f5294b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int l(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == a(z)) {
                        return c(z);
                    }
                    return i - 1;
                }
                throw new IllegalStateException();
            }
            return i;
        }
        if (i == a(z)) {
            return -1;
        }
        return i - 1;
    }

    public abstract Object m(int i);

    public final z83 n(int i, z83 z83Var) {
        return o(i, z83Var, 0L);
    }

    public abstract z83 o(int i, z83 z83Var, long j);

    public abstract int p();

    public final boolean q() {
        if (p() == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.bs
    public final Bundle toBundle() {
        ArrayList arrayList = new ArrayList();
        int p = p();
        z83 z83Var = new z83();
        for (int i = 0; i < p; i++) {
            arrayList.add(o(i, z83Var, 0L).toBundle());
        }
        ArrayList arrayList2 = new ArrayList();
        int i2 = i();
        y83 y83Var = new y83();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList2.add(g(i3, y83Var, false).toBundle());
        }
        int[] iArr = new int[p];
        if (p > 0) {
            iArr[0] = a(true);
        }
        for (int i4 = 1; i4 < p; i4++) {
            iArr[i4] = e(iArr[i4 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        m20.K0(bundle, f43b, new zr(arrayList));
        m20.K0(bundle, c, new zr(arrayList2));
        bundle.putIntArray(d, iArr);
        return bundle;
    }
}
