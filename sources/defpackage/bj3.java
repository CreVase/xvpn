package defpackage;

/* loaded from: classes2.dex */
public final class bj3 extends z33 implements l41 {
    public /* synthetic */ Object e;
    public final /* synthetic */ cj3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj3(cj3 cj3Var, c90 c90Var) {
        super(2, c90Var);
        this.f = cj3Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        bj3 bj3Var = new bj3(this.f, c90Var);
        bj3Var.e = obj;
        return bj3Var;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        bj3 bj3Var = (bj3) create((aa0) obj, (c90) obj2);
        ch3 ch3Var = ch3.f636a;
        bj3Var.invokeSuspend(ch3Var);
        return ch3Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        aa0 aa0Var = (aa0) this.e;
        cj3 cj3Var = this.f;
        synchronized (aa0Var) {
            k50 k50Var = k50.f2888a;
            cj3Var.f652b = k50.a(cj3Var.f651a);
            cj3Var.a();
        }
        return ch3.f636a;
    }
}
