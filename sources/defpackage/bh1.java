package defpackage;

/* loaded from: classes2.dex */
public abstract class bh1 implements uh1 {
    private final uh1 tSerializer;

    public bh1(m71 m71Var) {
        this.tSerializer = m71Var;
    }

    @Override // defpackage.sk0
    public final Object deserialize(qe0 qe0Var) {
        boolean L;
        bg1 xg1Var;
        bg1 h = pd0.h(qe0Var);
        eg1 m = h.m();
        qf1 d = h.d();
        uh1 uh1Var = this.tSerializer;
        eg1 transformDeserialize = transformDeserialize(m);
        d.getClass();
        if (transformDeserialize instanceof tg1) {
            xg1Var = new ch1(d, (tg1) transformDeserialize, null, null);
        } else if (transformDeserialize instanceof rf1) {
            xg1Var = new dh1(d, (rf1) transformDeserialize);
        } else {
            if (transformDeserialize instanceof lg1) {
                L = true;
            } else {
                L = m20.L(transformDeserialize, rg1.f4151a);
            }
            if (L) {
                xg1Var = new xg1(d, (wg1) transformDeserialize);
            } else {
                throw new j11(null);
            }
        }
        return pd0.t(xg1Var, uh1Var);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return this.tSerializer.getDescriptor();
    }

    @Override // defpackage.uh1
    public final void serialize(ir0 ir0Var, Object obj) {
        eg1 eg1Var;
        jg1 i = pd0.i(ir0Var);
        qf1 d = i.d();
        uh1 uh1Var = this.tSerializer;
        ei2 ei2Var = new ei2();
        new yg1(d, new l63(ei2Var, 7), 1).g(uh1Var, obj);
        Object obj2 = ei2Var.f1938a;
        if (obj2 == null) {
            eg1Var = null;
        } else {
            eg1Var = (eg1) obj2;
        }
        i.C(transformSerialize(eg1Var));
    }

    public abstract eg1 transformDeserialize(eg1 eg1Var);

    public eg1 transformSerialize(eg1 eg1Var) {
        return eg1Var;
    }
}
