package defpackage;

/* loaded from: classes2.dex */
public final class xx extends z33 implements l41 {
    public final /* synthetic */ tt3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx(tt3 tt3Var, c90 c90Var) {
        super(2, c90Var);
        this.e = tt3Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new xx(this.e, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        xx xxVar = (xx) create((aa0) obj, (c90) obj2);
        ch3 ch3Var = ch3.f636a;
        xxVar.invokeSuspend(ch3Var);
        return ch3Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        tf3.k(this.e, true);
        return ch3.f636a;
    }
}
