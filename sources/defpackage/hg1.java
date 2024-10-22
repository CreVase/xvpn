package defpackage;

/* loaded from: classes2.dex */
public final class hg1 implements uh1 {

    /* renamed from: a, reason: collision with root package name */
    public static final hg1 f2417a = new hg1();

    /* renamed from: b, reason: collision with root package name */
    public static final op2 f2418b = t9.q("kotlinx.serialization.json.JsonElement", h62.f2372b, new mp2[0], md3.B);

    @Override // defpackage.sk0
    public final Object deserialize(qe0 qe0Var) {
        return pd0.h(qe0Var).m();
    }

    @Override // defpackage.sk0
    public final mp2 getDescriptor() {
        return f2418b;
    }

    @Override // defpackage.uh1
    public final void serialize(ir0 ir0Var, Object obj) {
        eg1 eg1Var = (eg1) obj;
        pd0.i(ir0Var);
        if (eg1Var instanceof wg1) {
            ir0Var.g(zg1.f5476a, eg1Var);
        } else if (eg1Var instanceof tg1) {
            ir0Var.g(vg1.f4830a, eg1Var);
        } else if (eg1Var instanceof rf1) {
            ir0Var.g(tf1.f4493a, eg1Var);
        }
    }
}
