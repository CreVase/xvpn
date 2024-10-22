package defpackage;

/* loaded from: classes2.dex */
public final class ke3 extends z33 implements l41 {
    public ke3(c90 c90Var) {
        super(2, c90Var);
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new ke3(c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        ke3 ke3Var = new ke3((c90) obj2);
        ch3 ch3Var = ch3.f636a;
        ke3Var.invokeSuspend(ch3Var);
        return ch3Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        ew3.q();
        return ch3.f636a;
    }
}
