package defpackage;

/* loaded from: classes2.dex */
public final class ct2 implements uh1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ct2 f1673a = new ct2();

    /* renamed from: b, reason: collision with root package name */
    public static final w72 f1674b = new w72("kotlin.Short", s72.h);

    @Override // defpackage.sk0
    public final Object deserialize(qe0 qe0Var) {
        return Short.valueOf(qe0Var.F());
    }

    @Override // defpackage.sk0
    public final mp2 getDescriptor() {
        return f1674b;
    }

    @Override // defpackage.uh1
    public final void serialize(ir0 ir0Var, Object obj) {
        ir0Var.i(((Number) obj).shortValue());
    }
}
