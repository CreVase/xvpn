package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zj3 extends pp3 {
    public final qk0 k;
    public ep l;

    public zj3(r70 r70Var) {
        super(r70Var);
        qk0 qk0Var = new qk0(this);
        this.k = qk0Var;
        this.l = null;
        this.h.e = 6;
        this.i.e = 7;
        qk0Var.e = 8;
        this.f = 1;
    }

    @Override // defpackage.lk0
    public final void a(lk0 lk0Var) {
        float f;
        float f2;
        float f3;
        int i;
        if (hx2.x(this.j) != 3) {
            ml0 ml0Var = this.e;
            if (ml0Var.c && !ml0Var.j && this.d == 3) {
                r70 r70Var = this.f3895b;
                int i2 = r70Var.s;
                if (i2 != 2) {
                    if (i2 == 3) {
                        ml0 ml0Var2 = r70Var.d.e;
                        if (ml0Var2.j) {
                            int i3 = r70Var.X;
                            if (i3 != -1) {
                                if (i3 != 0) {
                                    if (i3 != 1) {
                                        i = 0;
                                        ml0Var.d(i);
                                    } else {
                                        f = ml0Var2.g;
                                        f2 = r70Var.W;
                                    }
                                } else {
                                    f3 = ml0Var2.g * r70Var.W;
                                    i = (int) (f3 + 0.5f);
                                    ml0Var.d(i);
                                }
                            } else {
                                f = ml0Var2.g;
                                f2 = r70Var.W;
                            }
                            f3 = f / f2;
                            i = (int) (f3 + 0.5f);
                            ml0Var.d(i);
                        }
                    }
                } else {
                    r70 r70Var2 = r70Var.T;
                    if (r70Var2 != null) {
                        if (r70Var2.e.e.j) {
                            ml0Var.d((int) ((r5.g * r70Var.z) + 0.5f));
                        }
                    }
                }
            }
            qk0 qk0Var = this.h;
            if (qk0Var.c) {
                qk0 qk0Var2 = this.i;
                if (qk0Var2.c) {
                    if (qk0Var.j && qk0Var2.j && ml0Var.j) {
                        return;
                    }
                    boolean z = ml0Var.j;
                    ArrayList arrayList = qk0Var.l;
                    ArrayList arrayList2 = qk0Var2.l;
                    if (!z && this.d == 3) {
                        r70 r70Var3 = this.f3895b;
                        if (r70Var3.r == 0 && !r70Var3.z()) {
                            qk0 qk0Var3 = (qk0) arrayList.get(0);
                            qk0 qk0Var4 = (qk0) arrayList2.get(0);
                            int i4 = qk0Var3.g + qk0Var.f;
                            int i5 = qk0Var4.g + qk0Var2.f;
                            qk0Var.d(i4);
                            qk0Var2.d(i5);
                            ml0Var.d(i5 - i4);
                            return;
                        }
                    }
                    if (!ml0Var.j && this.d == 3 && this.f3894a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                        qk0 qk0Var5 = (qk0) arrayList.get(0);
                        int i6 = (((qk0) arrayList2.get(0)).g + qk0Var2.f) - (qk0Var5.g + qk0Var.f);
                        int i7 = ml0Var.m;
                        if (i6 < i7) {
                            ml0Var.d(i6);
                        } else {
                            ml0Var.d(i7);
                        }
                    }
                    if (ml0Var.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                        qk0 qk0Var6 = (qk0) arrayList.get(0);
                        qk0 qk0Var7 = (qk0) arrayList2.get(0);
                        int i8 = qk0Var6.g;
                        int i9 = qk0Var.f + i8;
                        int i10 = qk0Var7.g;
                        int i11 = qk0Var2.f + i10;
                        float f4 = this.f3895b.e0;
                        if (qk0Var6 == qk0Var7) {
                            f4 = 0.5f;
                        } else {
                            i8 = i9;
                            i10 = i11;
                        }
                        qk0Var.d((int) ((((i10 - i8) - ml0Var.g) * f4) + i8 + 0.5f));
                        qk0Var2.d(qk0Var.g + ml0Var.g);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        r70 r70Var4 = this.f3895b;
        l(r70Var4.J, r70Var4.L, 1);
    }

    @Override // defpackage.pp3
    public final void d() {
        r70 r70Var;
        r70 r70Var2;
        r70 r70Var3;
        r70 r70Var4;
        r70 r70Var5 = this.f3895b;
        boolean z = r70Var5.f4112a;
        ml0 ml0Var = this.e;
        if (z) {
            ml0Var.d(r70Var5.l());
        }
        boolean z2 = ml0Var.j;
        qk0 qk0Var = this.i;
        qk0 qk0Var2 = this.h;
        if (!z2) {
            r70 r70Var6 = this.f3895b;
            this.d = r70Var6.p0[1];
            if (r70Var6.E) {
                this.l = new ep(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (r70Var4 = this.f3895b.T) != null && r70Var4.p0[1] == 1) {
                    int l = (r70Var4.l() - this.f3895b.J.e()) - this.f3895b.L.e();
                    pp3.b(qk0Var2, r70Var4.e.h, this.f3895b.J.e());
                    pp3.b(qk0Var, r70Var4.e.i, -this.f3895b.L.e());
                    ml0Var.d(l);
                    return;
                }
                if (i == 1) {
                    ml0Var.d(this.f3895b.l());
                }
            }
        } else if (this.d == 4 && (r70Var2 = (r70Var = this.f3895b).T) != null && r70Var2.p0[1] == 1) {
            pp3.b(qk0Var2, r70Var2.e.h, r70Var.J.e());
            pp3.b(qk0Var, r70Var2.e.i, -this.f3895b.L.e());
            return;
        }
        boolean z3 = ml0Var.j;
        qk0 qk0Var3 = this.k;
        if (z3) {
            r70 r70Var7 = this.f3895b;
            if (r70Var7.f4112a) {
                z60[] z60VarArr = r70Var7.Q;
                z60 z60Var = z60VarArr[2];
                z60 z60Var2 = z60Var.f;
                if (z60Var2 != null && z60VarArr[3].f != null) {
                    if (r70Var7.z()) {
                        qk0Var2.f = this.f3895b.Q[2].e();
                        qk0Var.f = -this.f3895b.Q[3].e();
                    } else {
                        qk0 h = pp3.h(this.f3895b.Q[2]);
                        if (h != null) {
                            pp3.b(qk0Var2, h, this.f3895b.Q[2].e());
                        }
                        qk0 h2 = pp3.h(this.f3895b.Q[3]);
                        if (h2 != null) {
                            pp3.b(qk0Var, h2, -this.f3895b.Q[3].e());
                        }
                        qk0Var2.f4011b = true;
                        qk0Var.f4011b = true;
                    }
                    r70 r70Var8 = this.f3895b;
                    if (r70Var8.E) {
                        pp3.b(qk0Var3, qk0Var2, r70Var8.a0);
                        return;
                    }
                    return;
                }
                if (z60Var2 != null) {
                    qk0 h3 = pp3.h(z60Var);
                    if (h3 != null) {
                        pp3.b(qk0Var2, h3, this.f3895b.Q[2].e());
                        pp3.b(qk0Var, qk0Var2, ml0Var.g);
                        r70 r70Var9 = this.f3895b;
                        if (r70Var9.E) {
                            pp3.b(qk0Var3, qk0Var2, r70Var9.a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                z60 z60Var3 = z60VarArr[3];
                if (z60Var3.f != null) {
                    qk0 h4 = pp3.h(z60Var3);
                    if (h4 != null) {
                        pp3.b(qk0Var, h4, -this.f3895b.Q[3].e());
                        pp3.b(qk0Var2, qk0Var, -ml0Var.g);
                    }
                    r70 r70Var10 = this.f3895b;
                    if (r70Var10.E) {
                        pp3.b(qk0Var3, qk0Var2, r70Var10.a0);
                        return;
                    }
                    return;
                }
                z60 z60Var4 = z60VarArr[4];
                if (z60Var4.f != null) {
                    qk0 h5 = pp3.h(z60Var4);
                    if (h5 != null) {
                        pp3.b(qk0Var3, h5, 0);
                        pp3.b(qk0Var2, qk0Var3, -this.f3895b.a0);
                        pp3.b(qk0Var, qk0Var2, ml0Var.g);
                        return;
                    }
                    return;
                }
                if (!(r70Var7 instanceof x71) && r70Var7.T != null && r70Var7.j(y60.CENTER).f == null) {
                    r70 r70Var11 = this.f3895b;
                    pp3.b(qk0Var2, r70Var11.T.e.h, r70Var11.t());
                    pp3.b(qk0Var, qk0Var2, ml0Var.g);
                    r70 r70Var12 = this.f3895b;
                    if (r70Var12.E) {
                        pp3.b(qk0Var3, qk0Var2, r70Var12.a0);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        ArrayList arrayList = ml0Var.l;
        if (!z3 && this.d == 3) {
            r70 r70Var13 = this.f3895b;
            int i2 = r70Var13.s;
            ArrayList arrayList2 = ml0Var.k;
            if (i2 != 2) {
                if (i2 == 3 && !r70Var13.z()) {
                    r70 r70Var14 = this.f3895b;
                    if (r70Var14.r != 3) {
                        ml0 ml0Var2 = r70Var14.d.e;
                        arrayList.add(ml0Var2);
                        ml0Var2.k.add(ml0Var);
                        ml0Var.f4011b = true;
                        arrayList2.add(qk0Var2);
                        arrayList2.add(qk0Var);
                    }
                }
            } else {
                r70 r70Var15 = r70Var13.T;
                if (r70Var15 != null) {
                    ml0 ml0Var3 = r70Var15.e.e;
                    arrayList.add(ml0Var3);
                    ml0Var3.k.add(ml0Var);
                    ml0Var.f4011b = true;
                    arrayList2.add(qk0Var2);
                    arrayList2.add(qk0Var);
                }
            }
        } else {
            ml0Var.b(this);
        }
        r70 r70Var16 = this.f3895b;
        z60[] z60VarArr2 = r70Var16.Q;
        z60 z60Var5 = z60VarArr2[2];
        z60 z60Var6 = z60Var5.f;
        if (z60Var6 != null && z60VarArr2[3].f != null) {
            if (r70Var16.z()) {
                qk0Var2.f = this.f3895b.Q[2].e();
                qk0Var.f = -this.f3895b.Q[3].e();
            } else {
                qk0 h6 = pp3.h(this.f3895b.Q[2]);
                qk0 h7 = pp3.h(this.f3895b.Q[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.j = 4;
            }
            if (this.f3895b.E) {
                c(qk0Var3, qk0Var2, 1, this.l);
            }
        } else if (z60Var6 != null) {
            qk0 h8 = pp3.h(z60Var5);
            if (h8 != null) {
                pp3.b(qk0Var2, h8, this.f3895b.Q[2].e());
                c(qk0Var, qk0Var2, 1, ml0Var);
                if (this.f3895b.E) {
                    c(qk0Var3, qk0Var2, 1, this.l);
                }
                if (this.d == 3) {
                    r70 r70Var17 = this.f3895b;
                    if (r70Var17.W > 0.0f) {
                        c91 c91Var = r70Var17.d;
                        if (c91Var.d == 3) {
                            c91Var.e.k.add(ml0Var);
                            arrayList.add(this.f3895b.d.e);
                            ml0Var.f4010a = this;
                        }
                    }
                }
            }
        } else {
            z60 z60Var7 = z60VarArr2[3];
            if (z60Var7.f != null) {
                qk0 h9 = pp3.h(z60Var7);
                if (h9 != null) {
                    pp3.b(qk0Var, h9, -this.f3895b.Q[3].e());
                    c(qk0Var2, qk0Var, -1, ml0Var);
                    if (this.f3895b.E) {
                        c(qk0Var3, qk0Var2, 1, this.l);
                    }
                }
            } else {
                z60 z60Var8 = z60VarArr2[4];
                if (z60Var8.f != null) {
                    qk0 h10 = pp3.h(z60Var8);
                    if (h10 != null) {
                        pp3.b(qk0Var3, h10, 0);
                        c(qk0Var2, qk0Var3, -1, this.l);
                        c(qk0Var, qk0Var2, 1, ml0Var);
                    }
                } else if (!(r70Var16 instanceof x71) && (r70Var3 = r70Var16.T) != null) {
                    pp3.b(qk0Var2, r70Var3.e.h, r70Var16.t());
                    c(qk0Var, qk0Var2, 1, ml0Var);
                    if (this.f3895b.E) {
                        c(qk0Var3, qk0Var2, 1, this.l);
                    }
                    if (this.d == 3) {
                        r70 r70Var18 = this.f3895b;
                        if (r70Var18.W > 0.0f) {
                            c91 c91Var2 = r70Var18.d;
                            if (c91Var2.d == 3) {
                                c91Var2.e.k.add(ml0Var);
                                arrayList.add(this.f3895b.d.e);
                                ml0Var.f4010a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            ml0Var.c = true;
        }
    }

    @Override // defpackage.pp3
    public final void e() {
        qk0 qk0Var = this.h;
        if (qk0Var.j) {
            this.f3895b.Z = qk0Var.g;
        }
    }

    @Override // defpackage.pp3
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.pp3
    public final boolean k() {
        if (this.d != 3 || this.f3895b.s == 0) {
            return true;
        }
        return false;
    }

    public final void m() {
        this.g = false;
        qk0 qk0Var = this.h;
        qk0Var.c();
        qk0Var.j = false;
        qk0 qk0Var2 = this.i;
        qk0Var2.c();
        qk0Var2.j = false;
        qk0 qk0Var3 = this.k;
        qk0Var3.c();
        qk0Var3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f3895b.h0;
    }
}
