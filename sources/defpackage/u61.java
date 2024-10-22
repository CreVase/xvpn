package defpackage;

/* loaded from: classes.dex */
public final class u61 extends pp3 {
    public u61(r70 r70Var) {
        super(r70Var);
        r70Var.d.f();
        r70Var.e.f();
        this.f = ((t61) r70Var).u0;
    }

    @Override // defpackage.lk0
    public final void a(lk0 lk0Var) {
        qk0 qk0Var = this.h;
        if (!qk0Var.c || qk0Var.j) {
            return;
        }
        qk0Var.d((int) ((((qk0) qk0Var.l.get(0)).g * ((t61) this.f3895b).q0) + 0.5f));
    }

    @Override // defpackage.pp3
    public final void d() {
        r70 r70Var = this.f3895b;
        t61 t61Var = (t61) r70Var;
        int i = t61Var.r0;
        int i2 = t61Var.s0;
        int i3 = t61Var.u0;
        qk0 qk0Var = this.h;
        if (i3 == 1) {
            if (i != -1) {
                qk0Var.l.add(r70Var.T.d.h);
                this.f3895b.T.d.h.k.add(qk0Var);
                qk0Var.f = i;
            } else if (i2 != -1) {
                qk0Var.l.add(r70Var.T.d.i);
                this.f3895b.T.d.i.k.add(qk0Var);
                qk0Var.f = -i2;
            } else {
                qk0Var.f4011b = true;
                qk0Var.l.add(r70Var.T.d.i);
                this.f3895b.T.d.i.k.add(qk0Var);
            }
            m(this.f3895b.d.h);
            m(this.f3895b.d.i);
            return;
        }
        if (i != -1) {
            qk0Var.l.add(r70Var.T.e.h);
            this.f3895b.T.e.h.k.add(qk0Var);
            qk0Var.f = i;
        } else if (i2 != -1) {
            qk0Var.l.add(r70Var.T.e.i);
            this.f3895b.T.e.i.k.add(qk0Var);
            qk0Var.f = -i2;
        } else {
            qk0Var.f4011b = true;
            qk0Var.l.add(r70Var.T.e.i);
            this.f3895b.T.e.i.k.add(qk0Var);
        }
        m(this.f3895b.e.h);
        m(this.f3895b.e.i);
    }

    @Override // defpackage.pp3
    public final void e() {
        r70 r70Var = this.f3895b;
        int i = ((t61) r70Var).u0;
        qk0 qk0Var = this.h;
        if (i == 1) {
            r70Var.Y = qk0Var.g;
        } else {
            r70Var.Z = qk0Var.g;
        }
    }

    @Override // defpackage.pp3
    public final void f() {
        this.h.c();
    }

    @Override // defpackage.pp3
    public final boolean k() {
        return false;
    }

    public final void m(qk0 qk0Var) {
        qk0 qk0Var2 = this.h;
        qk0Var2.k.add(qk0Var);
        qk0Var.l.add(qk0Var2);
    }
}
