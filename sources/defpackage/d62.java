package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d62 extends a93 {
    public static final /* synthetic */ int n = 0;
    public final int e;
    public final ht2 f;
    public final int g;
    public final int h;
    public final int[] i;
    public final int[] j;
    public final a93[] k;
    public final Object[] l;
    public final HashMap m;

    public d62(ArrayList arrayList, ht2 ht2Var) {
        this.f = ht2Var;
        this.e = ht2Var.f2484b.length;
        int size = arrayList.size();
        this.i = new int[size];
        this.j = new int[size];
        this.k = new a93[size];
        this.l = new Object[size];
        this.m = new HashMap();
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            xt1 xt1Var = (xt1) it.next();
            this.k[i3] = xt1Var.b();
            this.j[i3] = i;
            this.i[i3] = i2;
            i += this.k[i3].p();
            i2 += this.k[i3].i();
            this.l[i3] = xt1Var.a();
            this.m.put(this.l[i3], Integer.valueOf(i3));
            i3++;
        }
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.a93
    public final int a(boolean z) {
        if (this.e == 0) {
            return -1;
        }
        int i = 0;
        if (z) {
            int[] iArr = this.f.f2484b;
            if (iArr.length > 0) {
                i = iArr[0];
            } else {
                i = -1;
            }
        }
        do {
            a93[] a93VarArr = this.k;
            if (a93VarArr[i].q()) {
                i = r(i, z);
            } else {
                return this.j[i] + a93VarArr[i].a(z);
            }
        } while (i != -1);
        return -1;
    }

    @Override // defpackage.a93
    public final int b(Object obj) {
        int intValue;
        int b2;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.m.get(obj2);
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        if (intValue == -1 || (b2 = this.k[intValue].b(obj3)) == -1) {
            return -1;
        }
        return this.i[intValue] + b2;
    }

    @Override // defpackage.a93
    public final int c(boolean z) {
        int i;
        int i2 = this.e;
        if (i2 == 0) {
            return -1;
        }
        if (z) {
            int[] iArr = this.f.f2484b;
            if (iArr.length > 0) {
                i = iArr[iArr.length - 1];
            } else {
                i = -1;
            }
        } else {
            i = i2 - 1;
        }
        do {
            a93[] a93VarArr = this.k;
            if (a93VarArr[i].q()) {
                i = s(i, z);
            } else {
                return this.j[i] + a93VarArr[i].c(z);
            }
        } while (i != -1);
        return -1;
    }

    @Override // defpackage.a93
    public final int e(int i, int i2, boolean z) {
        int[] iArr = this.j;
        int i3 = 0;
        int e = wi3.e(iArr, i + 1, false, false);
        int i4 = iArr[e];
        a93[] a93VarArr = this.k;
        a93 a93Var = a93VarArr[e];
        int i5 = i - i4;
        if (i2 != 2) {
            i3 = i2;
        }
        int e2 = a93Var.e(i5, i3, z);
        if (e2 != -1) {
            return i4 + e2;
        }
        int r = r(e, z);
        while (r != -1 && a93VarArr[r].q()) {
            r = r(r, z);
        }
        if (r != -1) {
            return a93VarArr[r].a(z) + iArr[r];
        }
        if (i2 != 2) {
            return -1;
        }
        return a(z);
    }

    @Override // defpackage.a93
    public final y83 g(int i, y83 y83Var, boolean z) {
        int[] iArr = this.i;
        int e = wi3.e(iArr, i + 1, false, false);
        int i2 = this.j[e];
        this.k[e].g(i - iArr[e], y83Var, z);
        y83Var.c += i2;
        if (z) {
            Object obj = this.l[e];
            Object obj2 = y83Var.f5294b;
            obj2.getClass();
            y83Var.f5294b = Pair.create(obj, obj2);
        }
        return y83Var;
    }

    @Override // defpackage.a93
    public final y83 h(Object obj, y83 y83Var) {
        int intValue;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.m.get(obj2);
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        int i = this.j[intValue];
        this.k[intValue].h(obj3, y83Var);
        y83Var.c += i;
        y83Var.f5294b = obj;
        return y83Var;
    }

    @Override // defpackage.a93
    public final int i() {
        return this.h;
    }

    @Override // defpackage.a93
    public final int l(int i, int i2, boolean z) {
        int[] iArr = this.j;
        int i3 = 0;
        int e = wi3.e(iArr, i + 1, false, false);
        int i4 = iArr[e];
        a93[] a93VarArr = this.k;
        a93 a93Var = a93VarArr[e];
        int i5 = i - i4;
        if (i2 != 2) {
            i3 = i2;
        }
        int l = a93Var.l(i5, i3, z);
        if (l != -1) {
            return i4 + l;
        }
        int s = s(e, z);
        while (s != -1 && a93VarArr[s].q()) {
            s = s(s, z);
        }
        if (s != -1) {
            return a93VarArr[s].c(z) + iArr[s];
        }
        if (i2 != 2) {
            return -1;
        }
        return c(z);
    }

    @Override // defpackage.a93
    public final Object m(int i) {
        int[] iArr = this.i;
        int e = wi3.e(iArr, i + 1, false, false);
        return Pair.create(this.l[e], this.k[e].m(i - iArr[e]));
    }

    @Override // defpackage.a93
    public final z83 o(int i, z83 z83Var, long j) {
        int[] iArr = this.j;
        int e = wi3.e(iArr, i + 1, false, false);
        int i2 = iArr[e];
        int i3 = this.i[e];
        this.k[e].o(i - i2, z83Var, j);
        Object obj = this.l[e];
        if (!z83.r.equals(z83Var.f5444a)) {
            obj = Pair.create(obj, z83Var.f5444a);
        }
        z83Var.f5444a = obj;
        z83Var.o += i3;
        z83Var.p += i3;
        return z83Var;
    }

    @Override // defpackage.a93
    public final int p() {
        return this.g;
    }

    public final int r(int i, boolean z) {
        if (z) {
            ht2 ht2Var = this.f;
            int i2 = ht2Var.c[i] + 1;
            int[] iArr = ht2Var.f2484b;
            if (i2 >= iArr.length) {
                return -1;
            }
            return iArr[i2];
        }
        if (i >= this.e - 1) {
            return -1;
        }
        return i + 1;
    }

    public final int s(int i, boolean z) {
        if (z) {
            ht2 ht2Var = this.f;
            int i2 = ht2Var.c[i] - 1;
            if (i2 < 0) {
                return -1;
            }
            return ht2Var.f2484b[i2];
        }
        if (i <= 0) {
            return -1;
        }
        return (-1) + i;
    }
}
