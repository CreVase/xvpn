package defpackage;

/* loaded from: classes2.dex */
public final class wa2 extends z33 implements l41 {
    public final /* synthetic */ xa2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa2(xa2 xa2Var, c90 c90Var) {
        super(2, c90Var);
        this.e = xa2Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new wa2(this.e, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        wa2 wa2Var = (wa2) create((aa0) obj, (c90) obj2);
        ch3 ch3Var = ch3.f636a;
        wa2Var.invokeSuspend(ch3Var);
        return ch3Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        xa2 xa2Var = this.e;
        c20.E0(xa2Var.e, ew3.N());
        xa2Var.f.f();
        return ch3.f636a;
    }
}
