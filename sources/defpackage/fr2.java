package defpackage;

/* loaded from: classes2.dex */
public final class fr2 extends z33 implements l41 {
    public int e;
    public final /* synthetic */ gr2 f;
    public final /* synthetic */ ar2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr2(gr2 gr2Var, ar2 ar2Var, c90 c90Var) {
        super(2, c90Var);
        this.f = gr2Var;
        this.g = ar2Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new fr2(this.f, this.g, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((fr2) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        int i = this.e;
        ch3 ch3Var = ch3.f636a;
        if (i != 0) {
            if (i == 1) {
                fl.a0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            fl.a0(obj);
            fy0 fy0Var = this.f.c;
            this.e = 1;
            Object a2 = gy0.a(fy0Var.f2174a, this.g, this);
            if (a2 != ba0Var) {
                a2 = ch3Var;
            }
            if (a2 == ba0Var) {
                return ba0Var;
            }
        }
        return ch3Var;
    }
}
