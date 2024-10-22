package defpackage;

/* loaded from: classes.dex */
public final class fa3 extends z33 implements l41 {
    public int e;
    public final /* synthetic */ ga3 f;
    public final /* synthetic */ s51 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa3(ga3 ga3Var, s51 s51Var, c90 c90Var) {
        super(2, c90Var);
        this.f = ga3Var;
        this.g = s51Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new fa3(this.f, this.g, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((fa3) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
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
            t9 t9Var = this.f.f2221a;
            this.e = 1;
            obj = t9Var.M(this.g, this);
            if (obj == ba0Var) {
                return ba0Var;
            }
        }
        return obj;
    }
}
