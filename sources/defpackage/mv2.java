package defpackage;

/* loaded from: classes.dex */
public final class mv2 extends z33 implements l41 {
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ yv2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv2(yv2 yv2Var, c90 c90Var) {
        super(2, c90Var);
        this.g = yv2Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        mv2 mv2Var = new mv2(this.g, c90Var);
        mv2Var.f = obj;
        return mv2Var;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((mv2) create((iz0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
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
            iz0 iz0Var = (iz0) this.f;
            yv2 yv2Var = this.g;
            y03 y03Var = (y03) yv2Var.g.getValue();
            if (!(y03Var instanceof kd0)) {
                yv2Var.i.e(new bv2(y03Var));
            }
            lv2 lv2Var = new lv2(new oz0(yv2Var.g, new iv2(y03Var, null), 0));
            this.e = 1;
            if (!(iz0Var instanceof q83)) {
                Object a2 = lv2Var.a(iz0Var, this);
                if (a2 != ba0Var) {
                    a2 = ch3Var;
                }
                if (a2 == ba0Var) {
                    return ba0Var;
                }
            } else {
                throw ((q83) iz0Var).f3968a;
            }
        }
        return ch3Var;
    }
}
