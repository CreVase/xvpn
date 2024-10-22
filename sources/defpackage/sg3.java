package defpackage;

/* loaded from: classes2.dex */
public final class sg3 implements uh1 {

    /* renamed from: a, reason: collision with root package name */
    public static final sg3 f4339a = new sg3();

    /* renamed from: b, reason: collision with root package name */
    public static final ic1 f4340b = new ic1("kotlin.UShort", new jc1(ct2.f1673a));

    @Override // defpackage.sk0
    public final Object deserialize(qe0 qe0Var) {
        return new og3(qe0Var.s(f4340b).F());
    }

    @Override // defpackage.sk0
    public final mp2 getDescriptor() {
        return f4340b;
    }

    @Override // defpackage.uh1
    public final void serialize(ir0 ir0Var, Object obj) {
        ir0Var.m(f4340b).i(((og3) obj).f3660a);
    }
}
