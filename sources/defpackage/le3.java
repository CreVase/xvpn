package defpackage;

/* loaded from: classes2.dex */
public final class le3 extends z33 implements l41 {
    public le3(c90 c90Var) {
        super(2, c90Var);
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new le3(c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return new le3((c90) obj2).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        return ew3.p();
    }
}
