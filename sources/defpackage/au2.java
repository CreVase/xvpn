package defpackage;

import a.bx;
import a.du;

/* loaded from: classes2.dex */
public final class au2 extends z33 implements l41 {
    public au2(c90 c90Var) {
        super(2, c90Var);
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new au2(c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return new au2((c90) obj2).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        bx bxVar = new bx();
        du.d(111, bxVar);
        ub2 ub2Var = new ub2();
        ub2Var.f4646a = bxVar.u();
        ub2Var.f4647b = bxVar.u();
        ub2Var.c = bxVar.q();
        bxVar.t();
        bxVar.h();
        return ub2Var;
    }
}
