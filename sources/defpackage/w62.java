package defpackage;

/* loaded from: classes.dex */
public final class w62 extends z33 implements l41 {
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ l41 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w62(l41 l41Var, c90 c90Var) {
        super(2, c90Var);
        this.g = l41Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        w62 w62Var = new w62(this.g, c90Var);
        w62Var.f = obj;
        return w62Var;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((w62) create((e72) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
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
            e72 e72Var = (e72) this.f;
            this.e = 1;
            obj = this.g.invoke(e72Var, this);
            if (obj == ba0Var) {
                return ba0Var;
            }
        }
        e72 e72Var2 = (e72) obj;
        ((fy1) e72Var2).f2176b.set(true);
        return e72Var2;
    }
}
