package defpackage;

/* loaded from: classes.dex */
public final class ud0 extends z33 implements x31 {
    public int e;

    public ud0(c90 c90Var) {
        super(1, c90Var);
    }

    @Override // defpackage.mn
    public final c90 create(c90 c90Var) {
        return new ud0(c90Var);
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        ud0 ud0Var = (ud0) create((c90) obj);
        ch3 ch3Var = ch3.f636a;
        ud0Var.invokeSuspend(ch3Var);
        return ch3Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        int i = this.e;
        if (i != 0) {
            if (i == 1) {
                fl.a0(obj);
                return ch3.f636a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fl.a0(obj);
        this.e = 1;
        throw null;
    }
}
