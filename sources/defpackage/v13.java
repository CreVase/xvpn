package defpackage;

/* loaded from: classes2.dex */
public final class v13 extends ya0 implements jg1 {
    public final c40 j;
    public final qf1 k;
    public final int l;
    public final jg1[] m;
    public final d5 n;
    public final wf1 o;
    public boolean p;

    public v13(c40 c40Var, qf1 qf1Var, int i, jg1[] jg1VarArr) {
        this.j = c40Var;
        this.k = qf1Var;
        this.l = i;
        this.m = jg1VarArr;
        this.n = qf1Var.f3990b;
        this.o = qf1Var.f3989a;
        if (i != 0) {
            int i2 = i - 1;
            if (jg1VarArr != null) {
                jg1 jg1Var = jg1VarArr[i2];
                if (jg1Var != null || jg1Var != this) {
                    jg1VarArr[i2] = this;
                    return;
                }
                return;
            }
            return;
        }
        throw null;
    }

    @Override // defpackage.ya0, defpackage.g40
    public final void A(mp2 mp2Var, int i, uh1 uh1Var, Object obj) {
        if (obj != null || this.o.f) {
            super.A(mp2Var, i, uh1Var, obj);
        }
    }

    @Override // defpackage.ya0, defpackage.ir0
    public final void B(long j) {
        if (this.p) {
            F(String.valueOf(j));
        } else {
            this.j.f(j);
        }
    }

    @Override // defpackage.jg1
    public final void C(eg1 eg1Var) {
        g(hg1.f2417a, eg1Var);
    }

    @Override // defpackage.ya0, defpackage.g40
    public final boolean D() {
        return this.o.f4995a;
    }

    @Override // defpackage.ya0, defpackage.ir0
    public final void F(String str) {
        this.j.i(str);
    }

    @Override // defpackage.ya0
    public final void Q(mp2 mp2Var, int i) {
        int x = hx2.x(this.l);
        boolean z = true;
        c40 c40Var = this.j;
        if (x != 1) {
            if (x != 2) {
                if (x != 3) {
                    if (!c40Var.f579b) {
                        c40Var.d(',');
                    }
                    c40Var.b();
                    F(mp2Var.f(i));
                    c40Var.d(':');
                    c40Var.j();
                    return;
                }
                if (i == 0) {
                    this.p = true;
                }
                if (i == 1) {
                    c40Var.d(',');
                    c40Var.j();
                    this.p = false;
                    return;
                }
                return;
            }
            if (!c40Var.f579b) {
                if (i % 2 == 0) {
                    c40Var.d(',');
                    c40Var.b();
                } else {
                    c40Var.d(':');
                    c40Var.j();
                    z = false;
                }
                this.p = z;
                return;
            }
            this.p = true;
            c40Var.b();
            return;
        }
        if (!c40Var.f579b) {
            c40Var.d(',');
        }
        c40Var.b();
    }

    @Override // defpackage.ya0, defpackage.g40
    public final void a(mp2 mp2Var) {
        int i = this.l;
        if (p71.d(i) != 0) {
            c40 c40Var = this.j;
            c40Var.k();
            c40Var.b();
            c40Var.d(p71.d(i));
        }
    }

    @Override // defpackage.ir0
    public final d5 b() {
        return this.n;
    }

    @Override // defpackage.ya0, defpackage.ir0
    public final g40 c(mp2 mp2Var) {
        jg1 jg1Var;
        qf1 qf1Var = this.k;
        int i0 = zf3.i0(mp2Var, qf1Var);
        char b2 = p71.b(i0);
        c40 c40Var = this.j;
        if (b2 != 0) {
            c40Var.d(b2);
            c40Var.a();
        }
        if (this.l == i0) {
            return this;
        }
        jg1[] jg1VarArr = this.m;
        if (jg1VarArr == null || (jg1Var = jg1VarArr[hx2.x(i0)]) == null) {
            return new v13(c40Var, qf1Var, i0, jg1VarArr);
        }
        return jg1Var;
    }

    @Override // defpackage.jg1
    public final qf1 d() {
        return this.k;
    }

    @Override // defpackage.ya0, defpackage.ir0
    public final void f() {
        this.j.g("null");
    }

    @Override // defpackage.ya0, defpackage.ir0
    public final void g(uh1 uh1Var, Object obj) {
        if (uh1Var instanceof o1) {
            qf1 qf1Var = this.k;
            if (!qf1Var.f3989a.i) {
                pd0.q(uh1Var.getDescriptor(), qf1Var);
                zf3.r((o1) uh1Var, this, obj);
                throw null;
            }
        }
        uh1Var.serialize(this, obj);
    }

    @Override // defpackage.ya0, defpackage.ir0
    public final void h(double d) {
        boolean z;
        boolean z2 = this.p;
        c40 c40Var = this.j;
        if (z2) {
            F(String.valueOf(d));
        } else {
            c40Var.f578a.c(String.valueOf(d));
        }
        if (!this.o.k) {
            if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw t9.b(Double.valueOf(d), c40Var.f578a.toString());
            }
        }
    }

    @Override // defpackage.ya0, defpackage.ir0
    public final void i(short s) {
        if (this.p) {
            F(String.valueOf((int) s));
        } else {
            this.j.h(s);
        }
    }

    @Override // defpackage.ya0, defpackage.ir0
    public final void k(byte b2) {
        if (this.p) {
            F(String.valueOf((int) b2));
        } else {
            this.j.c(b2);
        }
    }

    @Override // defpackage.ya0, defpackage.ir0
    public final void l(boolean z) {
        if (this.p) {
            F(String.valueOf(z));
        } else {
            this.j.f578a.c(String.valueOf(z));
        }
    }

    @Override // defpackage.ya0, defpackage.ir0
    public final ir0 m(mp2 mp2Var) {
        if (w13.a(mp2Var)) {
            c40 c40Var = this.j;
            if (!(c40Var instanceof d40)) {
                c40Var = new d40(c40Var.f578a, this.p);
            }
            return new v13(c40Var, this.k, this.l, null);
        }
        return this;
    }

    @Override // defpackage.ya0, defpackage.ir0
    public final void r(float f) {
        boolean z;
        boolean z2 = this.p;
        c40 c40Var = this.j;
        if (z2) {
            F(String.valueOf(f));
        } else {
            c40Var.f578a.c(String.valueOf(f));
        }
        if (!this.o.k) {
            if (!Float.isInfinite(f) && !Float.isNaN(f)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw t9.b(Float.valueOf(f), c40Var.f578a.toString());
            }
        }
    }

    @Override // defpackage.ya0, defpackage.ir0
    public final void t(char c) {
        F(String.valueOf(c));
    }

    @Override // defpackage.ya0, defpackage.ir0
    public final void v(mp2 mp2Var, int i) {
        F(mp2Var.f(i));
    }

    @Override // defpackage.ya0, defpackage.ir0
    public final void z(int i) {
        if (this.p) {
            F(String.valueOf(i));
        } else {
            this.j.e(i);
        }
    }
}
