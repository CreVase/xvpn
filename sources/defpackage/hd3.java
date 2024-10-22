package defpackage;

/* loaded from: classes2.dex */
public final class hd3 extends z33 implements l41 {
    public int e;
    public final /* synthetic */ nd3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd3(nd3 nd3Var, c90 c90Var) {
        super(2, c90Var);
        this.f = nd3Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new hd3(this.f, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((hd3) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
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
            nd3 nd3Var = this.f;
            gd3 gd3Var = new gd3(nd3Var, null);
            this.e = 1;
            if (tf3.q0(nd3Var, gd3Var, this) == ba0Var) {
                return ba0Var;
            }
        }
        return ch3.f636a;
    }
}
