package defpackage;

/* loaded from: classes2.dex */
public final class gs implements uh1 {

    /* renamed from: a, reason: collision with root package name */
    public static final gs f2312a = new gs();

    /* renamed from: b, reason: collision with root package name */
    public static final w72 f2313b = new w72("kotlin.Byte", s72.f4287b);

    @Override // defpackage.sk0
    public final Object deserialize(qe0 qe0Var) {
        return Byte.valueOf(qe0Var.D());
    }

    @Override // defpackage.sk0
    public final mp2 getDescriptor() {
        return f2313b;
    }

    @Override // defpackage.uh1
    public final void serialize(ir0 ir0Var, Object obj) {
        ir0Var.k(((Number) obj).byteValue());
    }
}
