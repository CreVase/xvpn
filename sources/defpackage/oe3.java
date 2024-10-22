package defpackage;

/* loaded from: classes2.dex */
public final class oe3 extends z33 implements l41 {
    public int e;
    public /* synthetic */ Object f;

    public oe3(c90 c90Var) {
        super(2, c90Var);
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        oe3 oe3Var = new oe3(c90Var);
        oe3Var.f = obj;
        return oe3Var;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((oe3) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
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
            tj0 d = zf3.d((aa0) this.f, null, new ne3(null), 3);
            this.e = 1;
            if (d.q(this) == ba0Var) {
                return ba0Var;
            }
        }
        return ch3.f636a;
    }
}
