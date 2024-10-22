package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public abstract class ai1 implements uh1 {

    /* renamed from: a, reason: collision with root package name */
    public final uh1 f93a;

    /* renamed from: b, reason: collision with root package name */
    public final uh1 f94b;

    public ai1(uh1 uh1Var, uh1 uh1Var2) {
        this.f93a = uh1Var;
        this.f94b = uh1Var2;
    }

    @Override // defpackage.sk0
    public final Object deserialize(qe0 qe0Var) {
        vp1 vp1Var = (vp1) this;
        op2 op2Var = vp1Var.d;
        f40 c = qe0Var.c(op2Var);
        c.A();
        Object obj = yc3.f5316a;
        Object obj2 = obj;
        while (true) {
            int j = c.j(op2Var);
            if (j != -1) {
                if (j != 0) {
                    if (j == 1) {
                        obj2 = c.t(op2Var, 1, this.f94b, null);
                    } else {
                        throw new wp2(hx2.m("Invalid index: ", j));
                    }
                } else {
                    obj = c.t(op2Var, 0, this.f93a, null);
                }
            } else {
                c.a(op2Var);
                Object obj3 = yc3.f5316a;
                if (obj != obj3) {
                    if (obj2 != obj3) {
                        switch (vp1Var.c) {
                            case 0:
                                return new tp1(obj, obj2);
                            default:
                                return new n42(obj, obj2);
                        }
                    }
                    throw new wp2("Element 'value' is missing");
                }
                throw new wp2("Element 'key' is missing");
            }
        }
    }

    @Override // defpackage.uh1
    public final void serialize(ir0 ir0Var, Object obj) {
        Object obj2;
        Object obj3;
        vp1 vp1Var = (vp1) this;
        op2 op2Var = vp1Var.d;
        g40 c = ir0Var.c(op2Var);
        int i = vp1Var.c;
        switch (i) {
            case 0:
                obj2 = ((Map.Entry) obj).getKey();
                break;
            default:
                obj2 = ((n42) obj).f3395a;
                break;
        }
        c.p(op2Var, 0, this.f93a, obj2);
        switch (i) {
            case 0:
                obj3 = ((Map.Entry) obj).getValue();
                break;
            default:
                obj3 = ((n42) obj).f3396b;
                break;
        }
        c.p(op2Var, 1, this.f94b, obj3);
        c.a(op2Var);
    }
}
