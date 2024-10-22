package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c91 extends pp3 {
    public static final int[] k = new int[2];

    public c91(r70 r70Var) {
        super(r70Var);
        this.h.e = 4;
        this.i.e = 5;
        this.f = 0;
    }

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    iArr[0] = i6;
                    iArr[1] = (int) ((i6 * f) + 0.5f);
                    return;
                }
                return;
            }
            iArr[0] = (int) ((i7 * f) + 0.5f);
            iArr[1] = i7;
            return;
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0246, code lost:            if (r3 != 1) goto L128;     */
    @Override // defpackage.lk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.lk0 r24) {
        /*
            Method dump skipped, instructions count: 902
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c91.a(lk0):void");
    }

    @Override // defpackage.pp3
    public final void d() {
        r70 r70Var;
        r70 r70Var2;
        int i;
        r70 r70Var3;
        r70 r70Var4;
        int i2;
        r70 r70Var5 = this.f3895b;
        boolean z = r70Var5.f4112a;
        ml0 ml0Var = this.e;
        if (z) {
            ml0Var.d(r70Var5.r());
        }
        boolean z2 = ml0Var.j;
        qk0 qk0Var = this.i;
        qk0 qk0Var2 = this.h;
        if (!z2) {
            r70 r70Var6 = this.f3895b;
            int i3 = r70Var6.p0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (r70Var4 = r70Var6.T) != null && ((i2 = r70Var4.p0[0]) == 1 || i2 == 4)) {
                    int r = (r70Var4.r() - this.f3895b.I.e()) - this.f3895b.K.e();
                    pp3.b(qk0Var2, r70Var4.d.h, this.f3895b.I.e());
                    pp3.b(qk0Var, r70Var4.d.i, -this.f3895b.K.e());
                    ml0Var.d(r);
                    return;
                }
                if (i3 == 1) {
                    ml0Var.d(r70Var6.r());
                }
            }
        } else if (this.d == 4 && (r70Var2 = (r70Var = this.f3895b).T) != null && ((i = r70Var2.p0[0]) == 1 || i == 4)) {
            pp3.b(qk0Var2, r70Var2.d.h, r70Var.I.e());
            pp3.b(qk0Var, r70Var2.d.i, -this.f3895b.K.e());
            return;
        }
        if (ml0Var.j) {
            r70 r70Var7 = this.f3895b;
            if (r70Var7.f4112a) {
                z60[] z60VarArr = r70Var7.Q;
                z60 z60Var = z60VarArr[0];
                z60 z60Var2 = z60Var.f;
                if (z60Var2 != null && z60VarArr[1].f != null) {
                    if (r70Var7.y()) {
                        qk0Var2.f = this.f3895b.Q[0].e();
                        qk0Var.f = -this.f3895b.Q[1].e();
                        return;
                    }
                    qk0 h = pp3.h(this.f3895b.Q[0]);
                    if (h != null) {
                        pp3.b(qk0Var2, h, this.f3895b.Q[0].e());
                    }
                    qk0 h2 = pp3.h(this.f3895b.Q[1]);
                    if (h2 != null) {
                        pp3.b(qk0Var, h2, -this.f3895b.Q[1].e());
                    }
                    qk0Var2.f4011b = true;
                    qk0Var.f4011b = true;
                    return;
                }
                if (z60Var2 != null) {
                    qk0 h3 = pp3.h(z60Var);
                    if (h3 != null) {
                        pp3.b(qk0Var2, h3, this.f3895b.Q[0].e());
                        pp3.b(qk0Var, qk0Var2, ml0Var.g);
                        return;
                    }
                    return;
                }
                z60 z60Var3 = z60VarArr[1];
                if (z60Var3.f != null) {
                    qk0 h4 = pp3.h(z60Var3);
                    if (h4 != null) {
                        pp3.b(qk0Var, h4, -this.f3895b.Q[1].e());
                        pp3.b(qk0Var2, qk0Var, -ml0Var.g);
                        return;
                    }
                    return;
                }
                if (!(r70Var7 instanceof x71) && r70Var7.T != null && r70Var7.j(y60.CENTER).f == null) {
                    r70 r70Var8 = this.f3895b;
                    pp3.b(qk0Var2, r70Var8.T.d.h, r70Var8.s());
                    pp3.b(qk0Var, qk0Var2, ml0Var.g);
                    return;
                }
                return;
            }
        }
        if (this.d == 3) {
            r70 r70Var9 = this.f3895b;
            int i4 = r70Var9.r;
            ArrayList arrayList = ml0Var.k;
            ArrayList arrayList2 = ml0Var.l;
            if (i4 != 2) {
                if (i4 == 3) {
                    if (r70Var9.s == 3) {
                        qk0Var2.f4010a = this;
                        qk0Var.f4010a = this;
                        zj3 zj3Var = r70Var9.e;
                        zj3Var.h.f4010a = this;
                        zj3Var.i.f4010a = this;
                        ml0Var.f4010a = this;
                        if (r70Var9.z()) {
                            arrayList2.add(this.f3895b.e.e);
                            this.f3895b.e.e.k.add(ml0Var);
                            zj3 zj3Var2 = this.f3895b.e;
                            zj3Var2.e.f4010a = this;
                            arrayList2.add(zj3Var2.h);
                            arrayList2.add(this.f3895b.e.i);
                            this.f3895b.e.h.k.add(ml0Var);
                            this.f3895b.e.i.k.add(ml0Var);
                        } else if (this.f3895b.y()) {
                            this.f3895b.e.e.l.add(ml0Var);
                            arrayList.add(this.f3895b.e.e);
                        } else {
                            this.f3895b.e.e.l.add(ml0Var);
                        }
                    } else {
                        ml0 ml0Var2 = r70Var9.e.e;
                        arrayList2.add(ml0Var2);
                        ml0Var2.k.add(ml0Var);
                        this.f3895b.e.h.k.add(ml0Var);
                        this.f3895b.e.i.k.add(ml0Var);
                        ml0Var.f4011b = true;
                        arrayList.add(qk0Var2);
                        arrayList.add(qk0Var);
                        qk0Var2.l.add(ml0Var);
                        qk0Var.l.add(ml0Var);
                    }
                }
            } else {
                r70 r70Var10 = r70Var9.T;
                if (r70Var10 != null) {
                    ml0 ml0Var3 = r70Var10.e.e;
                    arrayList2.add(ml0Var3);
                    ml0Var3.k.add(ml0Var);
                    ml0Var.f4011b = true;
                    arrayList.add(qk0Var2);
                    arrayList.add(qk0Var);
                }
            }
        }
        r70 r70Var11 = this.f3895b;
        z60[] z60VarArr2 = r70Var11.Q;
        z60 z60Var4 = z60VarArr2[0];
        z60 z60Var5 = z60Var4.f;
        if (z60Var5 != null && z60VarArr2[1].f != null) {
            if (r70Var11.y()) {
                qk0Var2.f = this.f3895b.Q[0].e();
                qk0Var.f = -this.f3895b.Q[1].e();
                return;
            }
            qk0 h5 = pp3.h(this.f3895b.Q[0]);
            qk0 h6 = pp3.h(this.f3895b.Q[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.j = 4;
            return;
        }
        if (z60Var5 != null) {
            qk0 h7 = pp3.h(z60Var4);
            if (h7 != null) {
                pp3.b(qk0Var2, h7, this.f3895b.Q[0].e());
                c(qk0Var, qk0Var2, 1, ml0Var);
                return;
            }
            return;
        }
        z60 z60Var6 = z60VarArr2[1];
        if (z60Var6.f != null) {
            qk0 h8 = pp3.h(z60Var6);
            if (h8 != null) {
                pp3.b(qk0Var, h8, -this.f3895b.Q[1].e());
                c(qk0Var2, qk0Var, -1, ml0Var);
                return;
            }
            return;
        }
        if (!(r70Var11 instanceof x71) && (r70Var3 = r70Var11.T) != null) {
            pp3.b(qk0Var2, r70Var3.d.h, r70Var11.s());
            c(qk0Var, qk0Var2, 1, ml0Var);
        }
    }

    @Override // defpackage.pp3
    public final void e() {
        qk0 qk0Var = this.h;
        if (qk0Var.j) {
            this.f3895b.Y = qk0Var.g;
        }
    }

    @Override // defpackage.pp3
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.pp3
    public final boolean k() {
        if (this.d != 3 || this.f3895b.r == 0) {
            return true;
        }
        return false;
    }

    public final void n() {
        this.g = false;
        qk0 qk0Var = this.h;
        qk0Var.c();
        qk0Var.j = false;
        qk0 qk0Var2 = this.i;
        qk0Var2.c();
        qk0Var2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f3895b.h0;
    }
}
