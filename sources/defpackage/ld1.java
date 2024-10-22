package defpackage;

/* loaded from: classes2.dex */
public final class ld1 implements uh1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ld1 f3105a = new ld1();

    /* renamed from: b, reason: collision with root package name */
    public static final w72 f3106b = new w72("kotlin.Int", s72.f);

    @Override // defpackage.sk0
    public final Object deserialize(qe0 qe0Var) {
        return Integer.valueOf(qe0Var.p());
    }

    @Override // defpackage.sk0
    public final mp2 getDescriptor() {
        return f3106b;
    }

    @Override // defpackage.uh1
    public final void serialize(ir0 ir0Var, Object obj) {
        ir0Var.z(((Number) obj).intValue());
    }
}
