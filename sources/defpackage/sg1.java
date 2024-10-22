package defpackage;

/* loaded from: classes2.dex */
public final class sg1 implements uh1 {

    /* renamed from: a, reason: collision with root package name */
    public static final sg1 f4337a = new sg1();

    /* renamed from: b, reason: collision with root package name */
    public static final op2 f4338b = t9.q("kotlinx.serialization.json.JsonNull", sp2.f4395b, new mp2[0], md3.A);

    @Override // defpackage.sk0
    public final Object deserialize(qe0 qe0Var) {
        pd0.h(qe0Var);
        if (!qe0Var.z()) {
            qe0Var.r();
            return rg1.f4151a;
        }
        throw new dg1("Expected 'null' literal", 0);
    }

    @Override // defpackage.sk0
    public final mp2 getDescriptor() {
        return f4338b;
    }

    @Override // defpackage.uh1
    public final void serialize(ir0 ir0Var, Object obj) {
        pd0.i(ir0Var);
        ir0Var.f();
    }
}
