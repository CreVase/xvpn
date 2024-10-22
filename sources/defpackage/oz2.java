package defpackage;

/* loaded from: classes2.dex */
public final class oz2 extends z33 implements l41 {
    public int e;

    public oz2(c90 c90Var) {
        super(2, c90Var);
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new oz2(c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return new oz2((c90) obj2).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        int i = this.e;
        if (i != 0) {
            if (i == 1) {
                fl.a0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            fl.a0(obj);
            d5 d5Var = gf.f2243a;
            this.e = 1;
            obj = d5.C();
            if (obj == ba0Var) {
                return ba0Var;
            }
        }
        return obj;
    }
}
