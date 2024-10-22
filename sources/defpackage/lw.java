package defpackage;

/* loaded from: classes2.dex */
public final class lw extends z33 implements l41 {
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ mw g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw(mw mwVar, c90 c90Var) {
        super(2, c90Var);
        this.g = mwVar;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        lw lwVar = new lw(this.g, c90Var);
        lwVar.f = obj;
        return lwVar;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((lw) create((y82) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
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
            y82 y82Var = (y82) this.f;
            this.e = 1;
            if (this.g.b(y82Var, this) == ba0Var) {
                return ba0Var;
            }
        }
        return ch3.f636a;
    }
}
