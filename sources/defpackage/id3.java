package defpackage;

/* loaded from: classes2.dex */
public final class id3 extends z33 implements l41 {
    public int e;
    public final /* synthetic */ cp f;
    public final /* synthetic */ l41 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id3(cp cpVar, l41 l41Var, c90 c90Var) {
        super(2, c90Var);
        this.f = cpVar;
        this.g = l41Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new id3(this.f, this.g, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        ((id3) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
        return ba0.f430a;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.a0(obj);
        } else {
            fl.a0(obj);
            ug2 ug2Var = this.f.f;
            od3 od3Var = new od3(this.g);
            this.e = 1;
            if (ug2Var.a(od3Var, this) == ba0Var) {
                return ba0Var;
            }
        }
        throw new j11(null);
    }
}
