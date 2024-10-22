package defpackage;

/* loaded from: classes2.dex */
public final class ap extends z33 implements l41 {
    public /* synthetic */ Object e;
    public final /* synthetic */ cp f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap(cp cpVar, c90 c90Var) {
        super(2, c90Var);
        this.f = cpVar;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        ap apVar = new ap(this.f, c90Var);
        apVar.e = obj;
        return apVar;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        ap apVar = (ap) create((dp) obj, (c90) obj2);
        ch3 ch3Var = ch3.f636a;
        apVar.invokeSuspend(ch3Var);
        return ch3Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        dp dpVar = (dp) this.e;
        pe3 pe3Var = (pe3) this.f;
        pe3Var.getClass();
        zd3 zd3Var = (zd3) dpVar;
        if (zd3Var instanceof yd3) {
            zf3.T(t9.N(pe3Var), null, new me3(pe3Var, null), 3);
        } else if (zd3Var instanceof xd3) {
            t9.a();
            rt3.e().m();
            zf3.T(t9.N(pe3Var), null, new oe3(null), 3);
        }
        return ch3.f636a;
    }
}
