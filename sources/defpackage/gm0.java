package defpackage;

/* loaded from: classes2.dex */
public final class gm0 implements uh1 {

    /* renamed from: a, reason: collision with root package name */
    public static final gm0 f2279a = new gm0();

    /* renamed from: b, reason: collision with root package name */
    public static final w72 f2280b = new w72("kotlin.Double", s72.d);

    @Override // defpackage.sk0
    public final Object deserialize(qe0 qe0Var) {
        return Double.valueOf(qe0Var.I());
    }

    @Override // defpackage.sk0
    public final mp2 getDescriptor() {
        return f2280b;
    }

    @Override // defpackage.uh1
    public final void serialize(ir0 ir0Var, Object obj) {
        ir0Var.h(((Number) obj).doubleValue());
    }
}
