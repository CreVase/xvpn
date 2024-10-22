package defpackage;

/* loaded from: classes.dex */
public final class dj2 extends z33 implements l41 {
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ l41 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj2(l41 l41Var, c90 c90Var) {
        super(2, c90Var);
        this.g = l41Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        dj2 dj2Var = new dj2(this.g, c90Var);
        dj2Var.f = obj;
        return dj2Var;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((dj2) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
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
            aa0 aa0Var = (aa0) this.f;
            this.e = 1;
            if (this.g.invoke(aa0Var, this) == ba0Var) {
                return ba0Var;
            }
        }
        return ch3.f636a;
    }
}
