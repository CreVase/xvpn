package defpackage;

/* loaded from: classes2.dex */
public final class jo1 implements uh1 {

    /* renamed from: a, reason: collision with root package name */
    public static final jo1 f2800a = new jo1();

    /* renamed from: b, reason: collision with root package name */
    public static final w72 f2801b = new w72("kotlin.Long", s72.g);

    @Override // defpackage.sk0
    public final Object deserialize(qe0 qe0Var) {
        return Long.valueOf(qe0Var.x());
    }

    @Override // defpackage.sk0
    public final mp2 getDescriptor() {
        return f2801b;
    }

    @Override // defpackage.uh1
    public final void serialize(ir0 ir0Var, Object obj) {
        ir0Var.B(((Number) obj).longValue());
    }
}
