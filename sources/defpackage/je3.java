package defpackage;

/* loaded from: classes2.dex */
public final class je3 extends z33 implements l41 {
    public je3(c90 c90Var) {
        super(2, c90Var);
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new je3(c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        je3 je3Var = new je3((c90) obj2);
        ch3 ch3Var = ch3.f636a;
        je3Var.invokeSuspend(ch3Var);
        return ch3Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        ew3.q();
        rt3.e().i(false, ew3.X());
        return ch3.f636a;
    }
}
