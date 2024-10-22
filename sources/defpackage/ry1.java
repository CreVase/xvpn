package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class ry1 implements ir0, g40 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4237a = new ArrayList();

    @Override // defpackage.g40
    public void A(mp2 mp2Var, int i, uh1 uh1Var, Object obj) {
        this.f4237a.add(J(mp2Var, i));
        if (uh1Var.getDescriptor().c()) {
            ((l0) this).g(uh1Var, obj);
        } else if (obj == null) {
            ((l0) this).f();
        } else {
            ((l0) this).g(uh1Var, obj);
        }
    }

    @Override // defpackage.ir0
    public final void B(long j) {
        ((l0) this).M((String) K(), zf3.b(Long.valueOf(j)));
    }

    @Override // defpackage.g40
    public final ir0 E(q72 q72Var, int i) {
        String J = J(q72Var, i);
        mp2 h = q72Var.h(i);
        l0 l0Var = (l0) this;
        if (w13.a(h)) {
            return new k0(l0Var, J);
        }
        l0Var.f4237a.add(J);
        return l0Var;
    }

    @Override // defpackage.ir0
    public final void F(String str) {
        ((l0) this).M((String) K(), zf3.c(str));
    }

    @Override // defpackage.g40
    public final void G(mp2 mp2Var, int i, float f) {
        I(J(mp2Var, i), f);
    }

    public abstract void H(Object obj, double d);

    public abstract void I(Object obj, float f);

    public final String J(mp2 mp2Var, int i) {
        String f;
        Object obj;
        switch (((yg1) this).e) {
            case 2:
                f = String.valueOf(i);
                break;
            default:
                f = mp2Var.f(i);
                break;
        }
        ArrayList arrayList = this.f4237a;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(arrayList.size() - 1);
        }
        return f;
    }

    public final Object K() {
        ArrayList arrayList = this.f4237a;
        if (!arrayList.isEmpty()) {
            return arrayList.remove(tf3.N(arrayList));
        }
        throw new wp2("No tag in stack for requested element");
    }

    @Override // defpackage.g40
    public final void a(mp2 mp2Var) {
        if (!this.f4237a.isEmpty()) {
            K();
        }
        l0 l0Var = (l0) this;
        l0Var.c.invoke(l0Var.L());
    }

    @Override // defpackage.g40
    public final void e(q72 q72Var, int i, double d) {
        H(J(q72Var, i), d);
    }

    @Override // defpackage.ir0
    public abstract void g(uh1 uh1Var, Object obj);

    @Override // defpackage.ir0
    public final void h(double d) {
        H(K(), d);
    }

    @Override // defpackage.ir0
    public final void i(short s) {
        ((l0) this).M((String) K(), zf3.b(Short.valueOf(s)));
    }

    @Override // defpackage.g40
    public final void j(mp2 mp2Var, int i, long j) {
        ((l0) this).M(J(mp2Var, i), zf3.b(Long.valueOf(j)));
    }

    @Override // defpackage.ir0
    public final void k(byte b2) {
        ((l0) this).M((String) K(), zf3.b(Byte.valueOf(b2)));
    }

    @Override // defpackage.ir0
    public final void l(boolean z) {
        eg1 lg1Var;
        l0 l0Var = (l0) this;
        String str = (String) K();
        Boolean valueOf = Boolean.valueOf(z);
        if (valueOf == null) {
            lg1Var = rg1.f4151a;
        } else {
            lg1Var = new lg1(valueOf, false);
        }
        l0Var.M(str, lg1Var);
    }

    @Override // defpackage.ir0
    public final ir0 m(mp2 mp2Var) {
        l0 l0Var = (l0) this;
        String str = (String) K();
        if (w13.a(mp2Var)) {
            return new k0(l0Var, str);
        }
        l0Var.f4237a.add(str);
        return l0Var;
    }

    @Override // defpackage.g40
    public final void n(mp2 mp2Var, int i, boolean z) {
        eg1 lg1Var;
        String J = J(mp2Var, i);
        l0 l0Var = (l0) this;
        Boolean valueOf = Boolean.valueOf(z);
        if (valueOf == null) {
            lg1Var = rg1.f4151a;
        } else {
            lg1Var = new lg1(valueOf, false);
        }
        l0Var.M(J, lg1Var);
    }

    @Override // defpackage.g40
    public final void o(int i, String str, mp2 mp2Var) {
        ((l0) this).M(J(mp2Var, i), zf3.c(str));
    }

    @Override // defpackage.g40
    public final void p(mp2 mp2Var, int i, uh1 uh1Var, Object obj) {
        this.f4237a.add(J(mp2Var, i));
        g(uh1Var, obj);
    }

    @Override // defpackage.ir0
    public final g40 q(mp2 mp2Var) {
        return ((l0) this).c(mp2Var);
    }

    @Override // defpackage.ir0
    public final void r(float f) {
        I(K(), f);
    }

    @Override // defpackage.g40
    public final void s(q72 q72Var, int i, byte b2) {
        ((l0) this).M(J(q72Var, i), zf3.b(Byte.valueOf(b2)));
    }

    @Override // defpackage.ir0
    public final void t(char c) {
        ((l0) this).M((String) K(), zf3.c(String.valueOf(c)));
    }

    @Override // defpackage.ir0
    public final void v(mp2 mp2Var, int i) {
        ((l0) this).M((String) K(), zf3.c(mp2Var.f(i)));
    }

    @Override // defpackage.g40
    public final void w(q72 q72Var, int i, short s) {
        ((l0) this).M(J(q72Var, i), zf3.b(Short.valueOf(s)));
    }

    @Override // defpackage.g40
    public final void x(int i, int i2, mp2 mp2Var) {
        ((l0) this).M(J(mp2Var, i), zf3.b(Integer.valueOf(i2)));
    }

    @Override // defpackage.g40
    public final void y(q72 q72Var, int i, char c) {
        ((l0) this).M(J(q72Var, i), zf3.c(String.valueOf(c)));
    }

    @Override // defpackage.ir0
    public final void z(int i) {
        ((l0) this).M((String) K(), zf3.b(Integer.valueOf(i)));
    }
}
