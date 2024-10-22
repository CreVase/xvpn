package defpackage;

/* loaded from: classes2.dex */
public final class gd3 extends z33 implements l41 {
    public /* synthetic */ Object e;
    public final /* synthetic */ nd3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd3(nd3 nd3Var, c90 c90Var) {
        super(2, c90Var);
        this.f = nd3Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        gd3 gd3Var = new gd3(this.f, c90Var);
        gd3Var.e = obj;
        return gd3Var;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        gd3 gd3Var = (gd3) create((aa0) obj, (c90) obj2);
        ch3 ch3Var = ch3.f636a;
        gd3Var.invokeSuspend(ch3Var);
        return ch3Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        aa0 aa0Var = (aa0) this.e;
        nd3 nd3Var = this.f;
        zf3.T(aa0Var, null, new ed3(nd3Var, null), 3);
        zf3.T(aa0Var, null, new fd3(nd3Var, null), 3);
        return ch3.f636a;
    }
}
