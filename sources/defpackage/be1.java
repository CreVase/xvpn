package defpackage;

/* loaded from: classes2.dex */
public final class be1 extends d90 {
    public int e;
    public final /* synthetic */ l41 f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be1(c90 c90Var, t90 t90Var, l41 l41Var, Object obj) {
        super(c90Var, t90Var);
        this.f = l41Var;
        this.g = obj;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i != 0) {
            if (i == 1) {
                this.e = 2;
                fl.a0(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
        this.e = 1;
        fl.a0(obj);
        l41 l41Var = this.f;
        fl.d(2, l41Var);
        return l41Var.invoke(this.g, this);
    }
}
