package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class l0 extends ry1 implements jg1 {

    /* renamed from: b, reason: collision with root package name */
    public final qf1 f3041b;
    public final x31 c;
    public final wf1 d;

    public l0(qf1 qf1Var, x31 x31Var) {
        this.f3041b = qf1Var;
        this.c = x31Var;
        this.d = qf1Var.f3989a;
    }

    @Override // defpackage.jg1
    public final void C(eg1 eg1Var) {
        g(hg1.f2417a, eg1Var);
    }

    @Override // defpackage.g40
    public final boolean D() {
        return this.d.f4995a;
    }

    @Override // defpackage.ry1
    public final void H(Object obj, double d) {
        boolean z;
        String str = (String) obj;
        M(str, zf3.b(Double.valueOf(d)));
        if (!this.d.k) {
            if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new dg1(t9.H0(Double.valueOf(d), str, L().toString()), 1);
            }
        }
    }

    @Override // defpackage.ry1
    public final void I(Object obj, float f) {
        boolean z;
        String str = (String) obj;
        M(str, zf3.b(Float.valueOf(f)));
        if (!this.d.k) {
            if (!Float.isInfinite(f) && !Float.isNaN(f)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new dg1(t9.H0(Float.valueOf(f), str, L().toString()), 1);
            }
        }
    }

    public abstract eg1 L();

    public abstract void M(String str, eg1 eg1Var);

    @Override // defpackage.ir0
    public final d5 b() {
        return this.f3041b.f3990b;
    }

    @Override // defpackage.ir0
    public final g40 c(mp2 mp2Var) {
        Object obj;
        x31 l63Var;
        boolean z;
        ArrayList arrayList = this.f4237a;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(arrayList.size() - 1);
        }
        if (obj == null) {
            l63Var = this.c;
        } else {
            l63Var = new l63(this, 6);
        }
        tp2 kind = mp2Var.getKind();
        if (m20.L(kind, o23.f3590b)) {
            z = true;
        } else {
            z = kind instanceof i62;
        }
        qf1 qf1Var = this.f3041b;
        if (z) {
            return new yg1(qf1Var, l63Var, 2);
        }
        if (m20.L(kind, o23.c)) {
            mp2 i = zf3.i(mp2Var.h(0), qf1Var.f3990b);
            tp2 kind2 = i.getKind();
            if (!(kind2 instanceof t72) && !m20.L(kind2, sp2.f4395b)) {
                if (qf1Var.f3989a.d) {
                    return new yg1(qf1Var, l63Var, 2);
                }
                throw t9.c(i);
            }
            return new fh1(qf1Var, l63Var);
        }
        return new yg1(qf1Var, l63Var, 1);
    }

    @Override // defpackage.jg1
    public final qf1 d() {
        return this.f3041b;
    }

    @Override // defpackage.ir0
    public final void f() {
        Object obj;
        ArrayList arrayList = this.f4237a;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(arrayList.size() - 1);
        }
        String str = (String) obj;
        if (str == null) {
            this.c.invoke(rg1.f4151a);
        } else {
            M(str, rg1.f4151a);
        }
    }

    @Override // defpackage.ry1, defpackage.ir0
    public final void g(uh1 uh1Var, Object obj) {
        Object obj2;
        boolean z;
        ArrayList arrayList = this.f4237a;
        if (arrayList.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList.get(arrayList.size() - 1);
        }
        qf1 qf1Var = this.f3041b;
        if (obj2 == null) {
            mp2 i = zf3.i(uh1Var.getDescriptor(), qf1Var.f3990b);
            if (!(i.getKind() instanceof t72) && i.getKind() != sp2.f4395b) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                yg1 yg1Var = new yg1(qf1Var, this.c, 0);
                yg1Var.g(uh1Var, obj);
                uh1Var.getDescriptor();
                yg1Var.c.invoke(yg1Var.L());
                return;
            }
        }
        if ((uh1Var instanceof o1) && !qf1Var.f3989a.i) {
            pd0.q(uh1Var.getDescriptor(), qf1Var);
            zf3.r((o1) uh1Var, this, obj);
            throw null;
        }
        uh1Var.serialize(this, obj);
    }

    @Override // defpackage.ir0
    public final void u() {
    }
}
