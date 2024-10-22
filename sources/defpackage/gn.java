package defpackage;

/* loaded from: classes2.dex */
public final class gn extends z33 implements l41 {
    public /* synthetic */ Object e;
    public final /* synthetic */ kn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn(kn knVar, c90 c90Var) {
        super(2, c90Var);
        this.f = knVar;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        gn gnVar = new gn(this.f, c90Var);
        gnVar.e = obj;
        return gnVar;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((gn) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        aa0 aa0Var = (aa0) this.e;
        qi0 qi0Var = vl0.f4854a;
        return zf3.T(aa0Var, zo1.f5522a, new fn(this.f, null), 2);
    }
}
