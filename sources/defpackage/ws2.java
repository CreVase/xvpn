package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class ws2 extends z1 implements ts2, iz0, gz0 {
    public final int d;
    public final int e;
    public final int f;
    public Object[] g;
    public long h;
    public long i;
    public int j;
    public int k;

    public ws2(int i, int i2, int i3) {
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(7:(2:3|(10:5|6|7|(2:9|(1:(1:(7:13|14|15|16|17|(2:18|(9:26|(2:31|32)|34|(1:36)|15|16|17|18|(0)(1:20))(0))|23)(2:37|38))(5:39|40|17|(2:18|(0)(0))|23))(4:41|42|43|44))(1:54)|45|46|16|17|(2:18|(0)(0))|23))|45|46|16|17|(2:18|(0)(0))|23)|57|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x004d, code lost:            r8 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b0, code lost:            r2 = r5;        r7 = r9;        r9 = r8;        r8 = r7;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e A[Catch: all -> 0x004d, TryCatch #2 {all -> 0x004d, blocks: (B:14:0x0031, B:18:0x0076, B:20:0x007e, B:28:0x0091, B:31:0x0098, B:32:0x009e, B:34:0x009f, B:40:0x0049), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r5v2, types: [ws2] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [iz0] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v6, types: [xs2] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ad -> B:15:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.ba0 i(defpackage.ws2 r8, defpackage.iz0 r9, defpackage.c90 r10) {
        /*
            Method dump skipped, instructions count: 188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ws2.i(ws2, iz0, c90):ba0");
    }

    @Override // defpackage.gz0
    public final Object a(iz0 iz0Var, c90 c90Var) {
        return i(this, iz0Var, c90Var);
    }

    @Override // defpackage.iz0
    public final Object b(Object obj, c90 c90Var) {
        c90[] c90VarArr;
        us2 us2Var;
        if (o(obj)) {
            return ch3.f636a;
        }
        int i = 1;
        vu vuVar = new vu(1, t9.P(c90Var));
        vuVar.s();
        c90[] c90VarArr2 = pg1.f3839b;
        synchronized (this) {
            if (p(obj)) {
                vuVar.resumeWith(ch3.f636a);
                c90VarArr = l(c90VarArr2);
                us2Var = null;
            } else {
                us2 us2Var2 = new us2(this, this.j + this.k + m(), obj, vuVar);
                k(us2Var2);
                this.k++;
                if (this.e == 0) {
                    c90VarArr2 = l(c90VarArr2);
                }
                c90VarArr = c90VarArr2;
                us2Var = us2Var2;
            }
        }
        if (us2Var != null) {
            vuVar.u(new nu(us2Var, i));
        }
        for (c90 c90Var2 : c90VarArr) {
            if (c90Var2 != null) {
                c90Var2.resumeWith(ch3.f636a);
            }
        }
        Object r = vuVar.r();
        ba0 ba0Var = ba0.f430a;
        if (r != ba0Var) {
            r = ch3.f636a;
        }
        if (r != ba0Var) {
            return ch3.f636a;
        }
        return r;
    }

    @Override // defpackage.z1
    public final a2 d() {
        return new xs2();
    }

    @Override // defpackage.z1
    public final a2[] e() {
        return new xs2[2];
    }

    public final Object g(xs2 xs2Var, vs2 vs2Var) {
        vu vuVar = new vu(1, t9.P(vs2Var));
        vuVar.s();
        synchronized (this) {
            if (q(xs2Var) < 0) {
                xs2Var.f5213b = vuVar;
            } else {
                vuVar.resumeWith(ch3.f636a);
            }
        }
        Object r = vuVar.r();
        if (r == ba0.f430a) {
            return r;
        }
        return ch3.f636a;
    }

    public final void h() {
        if (this.e == 0 && this.k <= 1) {
            return;
        }
        Object[] objArr = this.g;
        while (this.k > 0) {
            long m = m();
            int i = this.j;
            int i2 = this.k;
            if (objArr[(objArr.length - 1) & ((int) ((m + (i + i2)) - 1))] == bx3.i) {
                this.k = i2 - 1;
                objArr[(objArr.length - 1) & ((int) (m() + this.j + this.k))] = null;
            } else {
                return;
            }
        }
    }

    public final void j() {
        a2[] a2VarArr;
        this.g[(r0.length - 1) & ((int) m())] = null;
        this.j--;
        long m = m() + 1;
        if (this.h < m) {
            this.h = m;
        }
        if (this.i < m) {
            if (this.f5413b != 0 && (a2VarArr = this.f5412a) != null) {
                for (a2 a2Var : a2VarArr) {
                    if (a2Var != null) {
                        xs2 xs2Var = (xs2) a2Var;
                        long j = xs2Var.f5212a;
                        if (j >= 0 && j < m) {
                            xs2Var.f5212a = m;
                        }
                    }
                }
            }
            this.i = m;
        }
    }

    public final void k(Object obj) {
        int i = this.j + this.k;
        Object[] objArr = this.g;
        if (objArr == null) {
            objArr = n(null, 0, 2);
        } else if (i >= objArr.length) {
            objArr = n(objArr, i, objArr.length * 2);
        }
        objArr[((int) (m() + i)) & (objArr.length - 1)] = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final c90[] l(c90[] c90VarArr) {
        a2[] a2VarArr;
        xs2 xs2Var;
        vu vuVar;
        int length = c90VarArr.length;
        if (this.f5413b != 0 && (a2VarArr = this.f5412a) != null) {
            int length2 = a2VarArr.length;
            int i = 0;
            c90VarArr = c90VarArr;
            while (i < length2) {
                a2 a2Var = a2VarArr[i];
                if (a2Var != null && (vuVar = (xs2Var = (xs2) a2Var).f5213b) != null && q(xs2Var) >= 0) {
                    int length3 = c90VarArr.length;
                    c90VarArr = c90VarArr;
                    if (length >= length3) {
                        c90VarArr = Arrays.copyOf(c90VarArr, Math.max(2, c90VarArr.length * 2));
                    }
                    c90VarArr[length] = vuVar;
                    xs2Var.f5213b = null;
                    length++;
                }
                i++;
                c90VarArr = c90VarArr;
            }
        }
        return c90VarArr;
    }

    public final long m() {
        return Math.min(this.i, this.h);
    }

    public final Object[] n(Object[] objArr, int i, int i2) {
        boolean z;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object[] objArr2 = new Object[i2];
            this.g = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long m = m();
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = (int) (i3 + m);
                objArr2[i4 & (i2 - 1)] = objArr[(objArr.length - 1) & i4];
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    public final boolean o(Object obj) {
        int i;
        boolean z;
        c90[] c90VarArr = pg1.f3839b;
        synchronized (this) {
            if (p(obj)) {
                c90VarArr = l(c90VarArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (c90 c90Var : c90VarArr) {
            if (c90Var != null) {
                c90Var.resumeWith(ch3.f636a);
            }
        }
        return z;
    }

    public final boolean p(Object obj) {
        int i = this.f5413b;
        int i2 = this.d;
        if (i == 0) {
            if (i2 != 0) {
                k(obj);
                int i3 = this.j + 1;
                this.j = i3;
                if (i3 > i2) {
                    j();
                }
                this.i = m() + this.j;
            }
            return true;
        }
        int i4 = this.j;
        int i5 = this.e;
        if (i4 >= i5 && this.i <= this.h) {
            int x = hx2.x(this.f);
            if (x != 0) {
                if (x == 2) {
                    return true;
                }
            } else {
                return false;
            }
        }
        k(obj);
        int i6 = this.j + 1;
        this.j = i6;
        if (i6 > i5) {
            j();
        }
        long m = m() + this.j;
        long j = this.h;
        if (((int) (m - j)) > i2) {
            s(j + 1, this.i, m() + this.j, m() + this.j + this.k);
        }
        return true;
    }

    public final long q(xs2 xs2Var) {
        long j = xs2Var.f5212a;
        if (j < m() + this.j) {
            return j;
        }
        if (this.e > 0 || j > m() || this.k == 0) {
            return -1L;
        }
        return j;
    }

    public final Object r(xs2 xs2Var) {
        Object obj;
        c90[] c90VarArr = pg1.f3839b;
        synchronized (this) {
            long q = q(xs2Var);
            if (q < 0) {
                obj = bx3.i;
            } else {
                long j = xs2Var.f5212a;
                Object obj2 = this.g[((int) q) & (r0.length - 1)];
                if (obj2 instanceof us2) {
                    obj2 = ((us2) obj2).c;
                }
                xs2Var.f5212a = q + 1;
                Object obj3 = obj2;
                c90VarArr = t(j);
                obj = obj3;
            }
        }
        for (c90 c90Var : c90VarArr) {
            if (c90Var != null) {
                c90Var.resumeWith(ch3.f636a);
            }
        }
        return obj;
    }

    public final void s(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long m = m(); m < min; m++) {
            this.g[((int) m) & (r4.length - 1)] = null;
        }
        this.h = j;
        this.i = j2;
        this.j = (int) (j3 - min);
        this.k = (int) (j4 - j3);
    }

    public final c90[] t(long j) {
        int i;
        long j2;
        long j3;
        long j4;
        boolean z;
        long j5;
        a2[] a2VarArr;
        long j6 = this.i;
        c90[] c90VarArr = pg1.f3839b;
        if (j > j6) {
            return c90VarArr;
        }
        long m = m();
        long j7 = this.j + m;
        int i2 = this.e;
        if (i2 == 0 && this.k > 0) {
            j7++;
        }
        if (this.f5413b != 0 && (a2VarArr = this.f5412a) != null) {
            for (a2 a2Var : a2VarArr) {
                if (a2Var != null) {
                    long j8 = ((xs2) a2Var).f5212a;
                    if (j8 >= 0 && j8 < j7) {
                        j7 = j8;
                    }
                }
            }
        }
        if (j7 <= this.i) {
            return c90VarArr;
        }
        long m2 = m() + this.j;
        if (this.f5413b > 0) {
            i = Math.min(this.k, i2 - ((int) (m2 - j7)));
        } else {
            i = this.k;
        }
        long j9 = this.k + m2;
        pq0 pq0Var = bx3.i;
        if (i > 0) {
            c90VarArr = new c90[i];
            Object[] objArr = this.g;
            long j10 = m2;
            int i3 = 0;
            while (true) {
                if (m2 < j9) {
                    j2 = j7;
                    int i4 = (int) m2;
                    Object obj = objArr[(objArr.length - 1) & i4];
                    if (obj != pq0Var) {
                        us2 us2Var = (us2) obj;
                        j3 = j9;
                        int i5 = i3 + 1;
                        c90VarArr[i3] = us2Var.d;
                        objArr[i4 & (objArr.length - 1)] = pq0Var;
                        objArr[((int) j10) & (objArr.length - 1)] = us2Var.c;
                        j5 = 1;
                        j10++;
                        if (i5 >= i) {
                            break;
                        }
                        i3 = i5;
                    } else {
                        j3 = j9;
                        j5 = 1;
                    }
                    m2 += j5;
                    j7 = j2;
                    j9 = j3;
                } else {
                    j2 = j7;
                    j3 = j9;
                    break;
                }
            }
            m2 = j10;
        } else {
            j2 = j7;
            j3 = j9;
        }
        c90[] c90VarArr2 = c90VarArr;
        int i6 = (int) (m2 - m);
        if (this.f5413b == 0) {
            j4 = m2;
        } else {
            j4 = j2;
        }
        long max = Math.max(this.h, m2 - Math.min(this.d, i6));
        if (i2 == 0 && max < j3) {
            if (m20.L(this.g[((int) max) & (r2.length - 1)], pq0Var)) {
                m2++;
                max++;
            }
        }
        s(max, j4, m2, j3);
        h();
        if (c90VarArr2.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return l(c90VarArr2);
        }
        return c90VarArr2;
    }
}
