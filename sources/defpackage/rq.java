package defpackage;

/* loaded from: classes2.dex */
public final class rq implements uh1 {

    /* renamed from: a, reason: collision with root package name */
    public static final rq f4201a = new rq();

    /* renamed from: b, reason: collision with root package name */
    public static final w72 f4202b = new w72("kotlin.Boolean", s72.f4286a);

    @Override // defpackage.sk0
    public final Object deserialize(qe0 qe0Var) {
        return Boolean.valueOf(qe0Var.f());
    }

    @Override // defpackage.sk0
    public final mp2 getDescriptor() {
        return f4202b;
    }

    @Override // defpackage.uh1
    public final void serialize(ir0 ir0Var, Object obj) {
        ir0Var.l(((Boolean) obj).booleanValue());
    }
}
