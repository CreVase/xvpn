package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ok1 {
    public static boolean p = false;
    public static int q = 1000;
    public final a82 c;
    public mg[] f;
    public final wq2 l;
    public mg o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3683a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3684b = 0;
    public int d = 32;
    public int e = 32;
    public boolean g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;
    public int j = 0;
    public int k = 32;
    public ix2[] m = new ix2[q];
    public int n = 0;

    public ok1() {
        this.f = null;
        this.f = new mg[32];
        s();
        wq2 wq2Var = new wq2(2);
        this.l = wq2Var;
        this.c = new a82(wq2Var);
        this.o = new mg(wq2Var);
    }

    public static int n(z60 z60Var) {
        ix2 ix2Var = z60Var.i;
        if (ix2Var != null) {
            return (int) (ix2Var.e + 0.5f);
        }
        return 0;
    }

    public final ix2 a(int i) {
        ix2 ix2Var = (ix2) ((m62) this.l.c).a();
        if (ix2Var == null) {
            ix2Var = new ix2(i);
            ix2Var.l = i;
        } else {
            ix2Var.c();
            ix2Var.l = i;
        }
        int i2 = this.n;
        int i3 = q;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            q = i4;
            this.m = (ix2[]) Arrays.copyOf(this.m, i4);
        }
        ix2[] ix2VarArr = this.m;
        int i5 = this.n;
        this.n = i5 + 1;
        ix2VarArr[i5] = ix2Var;
        return ix2Var;
    }

    public final void b(ix2 ix2Var, ix2 ix2Var2, int i, float f, ix2 ix2Var3, ix2 ix2Var4, int i2, int i3) {
        mg l = l();
        if (ix2Var2 == ix2Var3) {
            l.d.k(ix2Var, 1.0f);
            l.d.k(ix2Var4, 1.0f);
            l.d.k(ix2Var2, -2.0f);
        } else if (f == 0.5f) {
            l.d.k(ix2Var, 1.0f);
            l.d.k(ix2Var2, -1.0f);
            l.d.k(ix2Var3, -1.0f);
            l.d.k(ix2Var4, 1.0f);
            if (i > 0 || i2 > 0) {
                l.f3287b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            l.d.k(ix2Var, -1.0f);
            l.d.k(ix2Var2, 1.0f);
            l.f3287b = i;
        } else if (f >= 1.0f) {
            l.d.k(ix2Var4, -1.0f);
            l.d.k(ix2Var3, 1.0f);
            l.f3287b = -i2;
        } else {
            float f2 = 1.0f - f;
            l.d.k(ix2Var, f2 * 1.0f);
            l.d.k(ix2Var2, f2 * (-1.0f));
            l.d.k(ix2Var3, (-1.0f) * f);
            l.d.k(ix2Var4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                l.f3287b = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            l.a(this, i3);
        }
        c(l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ba, code lost:            if (r4.k <= 1) goto L58;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c7, code lost:            r12 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c5, code lost:            r12 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c3, code lost:            if (r4.k <= 1) goto L58;     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00e4, code lost:            if (r4.k <= 1) goto L79;     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f1, code lost:            r14 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00ef, code lost:            r14 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00ed, code lost:            if (r4.k <= 1) goto L79;     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.mg r17) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ok1.c(mg):void");
    }

    public final void d(ix2 ix2Var, int i) {
        int i2 = ix2Var.c;
        if (i2 == -1) {
            ix2Var.d(this, i);
            for (int i3 = 0; i3 < this.f3684b + 1; i3++) {
                ix2 ix2Var2 = ((ix2[]) this.l.d)[i3];
            }
            return;
        }
        if (i2 != -1) {
            mg mgVar = this.f[i2];
            if (mgVar.e) {
                mgVar.f3287b = i;
                return;
            }
            if (mgVar.d.c() == 0) {
                mgVar.e = true;
                mgVar.f3287b = i;
                return;
            }
            mg l = l();
            if (i < 0) {
                l.f3287b = i * (-1);
                l.d.k(ix2Var, 1.0f);
            } else {
                l.f3287b = i;
                l.d.k(ix2Var, -1.0f);
            }
            c(l);
            return;
        }
        mg l2 = l();
        l2.f3286a = ix2Var;
        float f = i;
        ix2Var.e = f;
        l2.f3287b = f;
        l2.e = true;
        c(l2);
    }

    public final void e(ix2 ix2Var, ix2 ix2Var2, int i, int i2) {
        if (i2 == 8 && ix2Var2.f && ix2Var.c == -1) {
            ix2Var.d(this, ix2Var2.e + i);
            return;
        }
        mg l = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            l.f3287b = i;
        }
        if (!z) {
            l.d.k(ix2Var, -1.0f);
            l.d.k(ix2Var2, 1.0f);
        } else {
            l.d.k(ix2Var, 1.0f);
            l.d.k(ix2Var2, -1.0f);
        }
        if (i2 != 8) {
            l.a(this, i2);
        }
        c(l);
    }

    public final void f(ix2 ix2Var, ix2 ix2Var2, int i, int i2) {
        mg l = l();
        ix2 m = m();
        m.d = 0;
        l.b(ix2Var, ix2Var2, m, i);
        if (i2 != 8) {
            l.d.k(j(i2), (int) (l.d.a(m) * (-1.0f)));
        }
        c(l);
    }

    public final void g(ix2 ix2Var, ix2 ix2Var2, int i, int i2) {
        mg l = l();
        ix2 m = m();
        m.d = 0;
        l.c(ix2Var, ix2Var2, m, i);
        if (i2 != 8) {
            l.d.k(j(i2), (int) (l.d.a(m) * (-1.0f)));
        }
        c(l);
    }

    public final void h(mg mgVar) {
        int i;
        if (mgVar.e) {
            mgVar.f3286a.d(this, mgVar.f3287b);
        } else {
            mg[] mgVarArr = this.f;
            int i2 = this.j;
            mgVarArr[i2] = mgVar;
            ix2 ix2Var = mgVar.f3286a;
            ix2Var.c = i2;
            this.j = i2 + 1;
            ix2Var.e(this, mgVar);
        }
        if (this.f3683a) {
            int i3 = 0;
            while (i3 < this.j) {
                if (this.f[i3] == null) {
                    System.out.getClass();
                }
                mg mgVar2 = this.f[i3];
                if (mgVar2 != null && mgVar2.e) {
                    mgVar2.f3286a.d(this, mgVar2.f3287b);
                    ((m62) this.l.f5057b).b(mgVar2);
                    this.f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.j;
                        if (i4 >= i) {
                            break;
                        }
                        mg[] mgVarArr2 = this.f;
                        int i6 = i4 - 1;
                        mg mgVar3 = mgVarArr2[i4];
                        mgVarArr2[i6] = mgVar3;
                        ix2 ix2Var2 = mgVar3.f3286a;
                        if (ix2Var2.c == i4) {
                            ix2Var2.c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f[i5] = null;
                    }
                    this.j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f3683a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.j; i++) {
            mg mgVar = this.f[i];
            mgVar.f3286a.e = mgVar.f3287b;
        }
    }

    public final ix2 j(int i) {
        if (this.i + 1 >= this.e) {
            o();
        }
        ix2 a2 = a(4);
        int i2 = this.f3684b + 1;
        this.f3684b = i2;
        this.i++;
        a2.f2671b = i2;
        a2.d = i;
        ((ix2[]) this.l.d)[i2] = a2;
        a82 a82Var = this.c;
        a82Var.i.f5263b = a2;
        float[] fArr = a2.h;
        Arrays.fill(fArr, 0.0f);
        fArr[a2.d] = 1.0f;
        a82Var.j(a2);
        return a2;
    }

    public final ix2 k(Object obj) {
        ix2 ix2Var = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.e) {
            o();
        }
        if (obj instanceof z60) {
            z60 z60Var = (z60) obj;
            ix2Var = z60Var.i;
            if (ix2Var == null) {
                z60Var.k();
                ix2Var = z60Var.i;
            }
            int i = ix2Var.f2671b;
            wq2 wq2Var = this.l;
            if (i == -1 || i > this.f3684b || ((ix2[]) wq2Var.d)[i] == null) {
                if (i != -1) {
                    ix2Var.c();
                }
                int i2 = this.f3684b + 1;
                this.f3684b = i2;
                this.i++;
                ix2Var.f2671b = i2;
                ix2Var.l = 1;
                ((ix2[]) wq2Var.d)[i2] = ix2Var;
            }
        }
        return ix2Var;
    }

    public final mg l() {
        wq2 wq2Var = this.l;
        mg mgVar = (mg) ((m62) wq2Var.f5057b).a();
        if (mgVar == null) {
            return new mg(wq2Var);
        }
        mgVar.f3286a = null;
        mgVar.d.clear();
        mgVar.f3287b = 0.0f;
        mgVar.e = false;
        return mgVar;
    }

    public final ix2 m() {
        if (this.i + 1 >= this.e) {
            o();
        }
        ix2 a2 = a(3);
        int i = this.f3684b + 1;
        this.f3684b = i;
        this.i++;
        a2.f2671b = i;
        ((ix2[]) this.l.d)[i] = a2;
        return a2;
    }

    public final void o() {
        int i = this.d * 2;
        this.d = i;
        this.f = (mg[]) Arrays.copyOf(this.f, i);
        wq2 wq2Var = this.l;
        wq2Var.d = (ix2[]) Arrays.copyOf((ix2[]) wq2Var.d, this.d);
        int i2 = this.d;
        this.h = new boolean[i2];
        this.e = i2;
        this.k = i2;
    }

    public final void p() {
        a82 a82Var = this.c;
        if (a82Var.e()) {
            i();
            return;
        }
        if (this.g) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i < this.j) {
                    if (!this.f[i].e) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (!z) {
                q(a82Var);
                return;
            } else {
                i();
                return;
            }
        }
        q(a82Var);
    }

    public final void q(a82 a82Var) {
        float f;
        int i;
        boolean z;
        int i2 = 0;
        while (true) {
            f = 0.0f;
            i = 1;
            if (i2 < this.j) {
                mg mgVar = this.f[i2];
                if (mgVar.f3286a.l != 1 && mgVar.f3287b < 0.0f) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            boolean z2 = false;
            int i3 = 0;
            while (!z2) {
                i3 += i;
                float f2 = Float.MAX_VALUE;
                int i4 = 0;
                int i5 = -1;
                int i6 = -1;
                int i7 = 0;
                while (i4 < this.j) {
                    mg mgVar2 = this.f[i4];
                    if (mgVar2.f3286a.l != i && !mgVar2.e && mgVar2.f3287b < f) {
                        int c = mgVar2.d.c();
                        int i8 = 0;
                        while (i8 < c) {
                            ix2 d = mgVar2.d.d(i8);
                            float a2 = mgVar2.d.a(d);
                            if (a2 > f) {
                                for (int i9 = 0; i9 < 9; i9++) {
                                    float f3 = d.g[i9] / a2;
                                    if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                        i6 = d.f2671b;
                                        i7 = i9;
                                        f2 = f3;
                                        i5 = i4;
                                    }
                                }
                            }
                            i8++;
                            f = 0.0f;
                        }
                    }
                    i4++;
                    f = 0.0f;
                    i = 1;
                }
                if (i5 != -1) {
                    mg mgVar3 = this.f[i5];
                    mgVar3.f3286a.c = -1;
                    mgVar3.g(((ix2[]) this.l.d)[i6]);
                    ix2 ix2Var = mgVar3.f3286a;
                    ix2Var.c = i5;
                    ix2Var.e(this, mgVar3);
                } else {
                    z2 = true;
                }
                if (i3 > this.i / 2) {
                    z2 = true;
                }
                f = 0.0f;
                i = 1;
            }
        }
        r(a82Var);
        i();
    }

    public final void r(mg mgVar) {
        for (int i = 0; i < this.i; i++) {
            this.h[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.i * 2) {
                return;
            }
            ix2 ix2Var = mgVar.f3286a;
            if (ix2Var != null) {
                this.h[ix2Var.f2671b] = true;
            }
            ix2 d = mgVar.d(this.h);
            if (d != null) {
                boolean[] zArr = this.h;
                int i3 = d.f2671b;
                if (zArr[i3]) {
                    return;
                } else {
                    zArr[i3] = true;
                }
            }
            if (d != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.j; i5++) {
                    mg mgVar2 = this.f[i5];
                    if (mgVar2.f3286a.l != 1 && !mgVar2.e && mgVar2.d.b(d)) {
                        float a2 = mgVar2.d.a(d);
                        if (a2 < 0.0f) {
                            float f2 = (-mgVar2.f3287b) / a2;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    mg mgVar3 = this.f[i4];
                    mgVar3.f3286a.c = -1;
                    mgVar3.g(d);
                    ix2 ix2Var2 = mgVar3.f3286a;
                    ix2Var2.c = i4;
                    ix2Var2.e(this, mgVar3);
                }
            } else {
                z = true;
            }
        }
    }

    public final void s() {
        for (int i = 0; i < this.j; i++) {
            mg mgVar = this.f[i];
            if (mgVar != null) {
                ((m62) this.l.f5057b).b(mgVar);
            }
            this.f[i] = null;
        }
    }

    public final void t() {
        wq2 wq2Var;
        int i = 0;
        while (true) {
            wq2Var = this.l;
            ix2[] ix2VarArr = (ix2[]) wq2Var.d;
            if (i >= ix2VarArr.length) {
                break;
            }
            ix2 ix2Var = ix2VarArr[i];
            if (ix2Var != null) {
                ix2Var.c();
            }
            i++;
        }
        m62 m62Var = (m62) wq2Var.c;
        ix2[] ix2VarArr2 = this.m;
        int i2 = this.n;
        m62Var.getClass();
        if (i2 > ix2VarArr2.length) {
            i2 = ix2VarArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            ix2 ix2Var2 = ix2VarArr2[i3];
            int i4 = m62Var.c;
            Object[] objArr = m62Var.f3245b;
            if (i4 < objArr.length) {
                objArr[i4] = ix2Var2;
                m62Var.c = i4 + 1;
            }
        }
        this.n = 0;
        Arrays.fill((ix2[]) wq2Var.d, (Object) null);
        this.f3684b = 0;
        a82 a82Var = this.c;
        a82Var.h = 0;
        a82Var.f3287b = 0.0f;
        this.i = 1;
        for (int i5 = 0; i5 < this.j; i5++) {
            mg mgVar = this.f[i5];
        }
        s();
        this.j = 0;
        this.o = new mg(wq2Var);
    }
}
