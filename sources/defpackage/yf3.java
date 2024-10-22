package defpackage;

/* loaded from: classes2.dex */
public final class yf3 implements uh1 {

    /* renamed from: a, reason: collision with root package name */
    public static final yf3 f5327a = new yf3();

    /* renamed from: b, reason: collision with root package name */
    public static final ic1 f5328b = new ic1("kotlin.UByte", new jc1(gs.f2312a));

    @Override // defpackage.sk0
    public final Object deserialize(qe0 qe0Var) {
        return new uf3(qe0Var.s(f5328b).D());
    }

    @Override // defpackage.sk0
    public final mp2 getDescriptor() {
        return f5328b;
    }

    @Override // defpackage.uh1
    public final void serialize(ir0 ir0Var, Object obj) {
        ir0Var.m(f5328b).k(((uf3) obj).f4663a);
    }
}
