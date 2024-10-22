package defpackage;

/* loaded from: classes2.dex */
public final class zg1 implements uh1 {

    /* renamed from: a, reason: collision with root package name */
    public static final zg1 f5476a = new zg1();

    /* renamed from: b, reason: collision with root package name */
    public static final op2 f5477b = t9.q("kotlinx.serialization.json.JsonPrimitive", s72.i, new mp2[0], md3.A);

    @Override // defpackage.sk0
    public final Object deserialize(qe0 qe0Var) {
        eg1 m = pd0.h(qe0Var).m();
        if (m instanceof wg1) {
            return (wg1) m;
        }
        throw t9.f(-1, "Unexpected JSON element, expected JsonPrimitive, had " + gi2.a(m.getClass()), m.toString());
    }

    @Override // defpackage.sk0
    public final mp2 getDescriptor() {
        return f5477b;
    }

    @Override // defpackage.uh1
    public final void serialize(ir0 ir0Var, Object obj) {
        wg1 wg1Var = (wg1) obj;
        pd0.i(ir0Var);
        if (wg1Var instanceof rg1) {
            ir0Var.g(sg1.f4337a, rg1.f4151a);
        } else {
            ir0Var.g(mg1.f3290a, (lg1) wg1Var);
        }
    }
}
