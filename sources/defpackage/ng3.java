package defpackage;

/* loaded from: classes2.dex */
public final class ng3 implements uh1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ng3 f3455a = new ng3();

    /* renamed from: b, reason: collision with root package name */
    public static final ic1 f3456b = new ic1("kotlin.ULong", new jc1(jo1.f2800a));

    @Override // defpackage.sk0
    public final Object deserialize(qe0 qe0Var) {
        return new jg3(qe0Var.s(f3456b).x());
    }

    @Override // defpackage.sk0
    public final mp2 getDescriptor() {
        return f3456b;
    }

    @Override // defpackage.uh1
    public final void serialize(ir0 ir0Var, Object obj) {
        ir0Var.m(f3456b).B(((jg3) obj).f2763a);
    }
}
