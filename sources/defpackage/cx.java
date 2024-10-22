package defpackage;

/* loaded from: classes2.dex */
public final class cx implements uh1 {

    /* renamed from: a, reason: collision with root package name */
    public static final cx f1694a = new cx();

    /* renamed from: b, reason: collision with root package name */
    public static final w72 f1695b = new w72("kotlin.Char", s72.c);

    @Override // defpackage.sk0
    public final Object deserialize(qe0 qe0Var) {
        return Character.valueOf(qe0Var.g());
    }

    @Override // defpackage.sk0
    public final mp2 getDescriptor() {
        return f1695b;
    }

    @Override // defpackage.uh1
    public final void serialize(ir0 ir0Var, Object obj) {
        ir0Var.t(((Character) obj).charValue());
    }
}
