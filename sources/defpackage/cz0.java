package defpackage;

/* loaded from: classes2.dex */
public final class cz0 implements uh1 {

    /* renamed from: a, reason: collision with root package name */
    public static final cz0 f1704a = new cz0();

    /* renamed from: b, reason: collision with root package name */
    public static final w72 f1705b = new w72("kotlin.Float", s72.e);

    @Override // defpackage.sk0
    public final Object deserialize(qe0 qe0Var) {
        return Float.valueOf(qe0Var.G());
    }

    @Override // defpackage.sk0
    public final mp2 getDescriptor() {
        return f1705b;
    }

    @Override // defpackage.uh1
    public final void serialize(ir0 ir0Var, Object obj) {
        ir0Var.r(((Number) obj).floatValue());
    }
}
