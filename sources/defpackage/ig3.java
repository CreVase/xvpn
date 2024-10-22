package defpackage;

/* loaded from: classes2.dex */
public final class ig3 implements uh1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ig3 f2590a = new ig3();

    /* renamed from: b, reason: collision with root package name */
    public static final ic1 f2591b = new ic1("kotlin.UInt", new jc1(ld1.f3105a));

    @Override // defpackage.sk0
    public final Object deserialize(qe0 qe0Var) {
        return new eg3(qe0Var.s(f2591b).p());
    }

    @Override // defpackage.sk0
    public final mp2 getDescriptor() {
        return f2591b;
    }

    @Override // defpackage.uh1
    public final void serialize(ir0 ir0Var, Object obj) {
        ir0Var.m(f2591b).z(((eg3) obj).f1931a);
    }
}
