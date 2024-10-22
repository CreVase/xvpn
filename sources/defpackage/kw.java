package defpackage;

/* loaded from: classes2.dex */
public final class kw extends z33 implements l41 {
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ iz0 g;
    public final /* synthetic */ mw h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw(c90 c90Var, mw mwVar, iz0 iz0Var) {
        super(2, c90Var);
        this.g = iz0Var;
        this.h = mwVar;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        kw kwVar = new kw(c90Var, this.h, this.g);
        kwVar.f = obj;
        return kwVar;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((kw) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
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
            aa0 aa0Var = (aa0) this.f;
            mw mwVar = this.h;
            int i2 = mwVar.f3363b;
            if (i2 == -3) {
                i2 = -2;
            }
            l41 lwVar = new lw(mwVar, null);
            x82 x82Var = new x82(t9.V(aa0Var, mwVar.f3362a), zf3.a(i2, mwVar.c, 4));
            x82Var.Y(3, x82Var, lwVar);
            this.e = 1;
            Object D = t9.D(this.g, x82Var, true, this);
            if (D != ba0Var) {
                D = ch3Var;
            }
            if (D == ba0Var) {
                return ba0Var;
            }
        }
        return ch3Var;
    }
}
