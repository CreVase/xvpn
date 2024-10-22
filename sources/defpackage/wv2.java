package defpackage;

/* loaded from: classes.dex */
public final class wv2 extends z33 implements l41 {
    public int e;
    public final /* synthetic */ l41 f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv2(Object obj, c90 c90Var, l41 l41Var) {
        super(2, c90Var);
        this.f = l41Var;
        this.g = obj;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new wv2(this.g, c90Var, this.f);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((wv2) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
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
            this.e = 1;
            obj = this.f.invoke(this.g, this);
            if (obj == ba0Var) {
                return ba0Var;
            }
        }
        return obj;
    }
}
