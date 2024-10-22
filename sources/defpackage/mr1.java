package defpackage;

/* loaded from: classes.dex */
public final class mr1 extends z33 implements l41 {
    public int e;
    public final /* synthetic */ pr1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr1(pr1 pr1Var, c90 c90Var) {
        super(2, c90Var);
        this.f = pr1Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new mr1(this.f, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((mr1) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
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
            zf3 zf3Var = this.f.f3905a;
            this.e = 1;
            obj = zf3Var.D(this);
            if (obj == ba0Var) {
                return ba0Var;
            }
        }
        return obj;
    }
}
