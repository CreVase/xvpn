package defpackage;

/* loaded from: classes2.dex */
public final class kc3 implements uh1 {

    /* renamed from: a, reason: collision with root package name */
    public final uh1 f2933a;

    /* renamed from: b, reason: collision with root package name */
    public final uh1 f2934b;
    public final uh1 c;
    public final op2 d = t9.p("kotlin.Triple", new mp2[0], new l63(this, 5));

    public kc3(uh1 uh1Var, uh1 uh1Var2, uh1 uh1Var3) {
        this.f2933a = uh1Var;
        this.f2934b = uh1Var2;
        this.c = uh1Var3;
    }

    @Override // defpackage.sk0
    public final Object deserialize(qe0 qe0Var) {
        op2 op2Var = this.d;
        f40 c = qe0Var.c(op2Var);
        c.A();
        Object obj = yc3.f5316a;
        Object obj2 = obj;
        Object obj3 = obj2;
        while (true) {
            int j = c.j(op2Var);
            if (j != -1) {
                if (j != 0) {
                    if (j != 1) {
                        if (j == 2) {
                            obj3 = c.t(op2Var, 2, this.c, null);
                        } else {
                            throw new wp2(hx2.m("Unexpected index ", j));
                        }
                    } else {
                        obj2 = c.t(op2Var, 1, this.f2934b, null);
                    }
                } else {
                    obj = c.t(op2Var, 0, this.f2933a, null);
                }
            } else {
                c.a(op2Var);
                Object obj4 = yc3.f5316a;
                if (obj != obj4) {
                    if (obj2 != obj4) {
                        if (obj3 != obj4) {
                            return new jc3(obj, obj2, obj3);
                        }
                        throw new wp2("Element 'third' is missing");
                    }
                    throw new wp2("Element 'second' is missing");
                }
                throw new wp2("Element 'first' is missing");
            }
        }
    }

    @Override // defpackage.sk0
    public final mp2 getDescriptor() {
        return this.d;
    }

    @Override // defpackage.uh1
    public final void serialize(ir0 ir0Var, Object obj) {
        jc3 jc3Var = (jc3) obj;
        op2 op2Var = this.d;
        g40 c = ir0Var.c(op2Var);
        c.p(op2Var, 0, this.f2933a, jc3Var.f2748a);
        c.p(op2Var, 1, this.f2934b, jc3Var.f2749b);
        c.p(op2Var, 2, this.c, jc3Var.c);
        c.a(op2Var);
    }
}
