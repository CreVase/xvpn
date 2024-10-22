package defpackage;

import a.bx;
import a.du;

/* loaded from: classes2.dex */
public final class yt2 extends z33 implements l41 {
    public yt2(c90 c90Var) {
        super(2, c90Var);
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new yt2(c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return new yt2((c90) obj2).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        u3 u3Var = u3.f4616b;
        u3Var.getClass();
        bx bxVar = new bx();
        du.d(112, bxVar);
        nb2 nb2Var = new nb2();
        nb2Var.f3429a = bxVar.u();
        nb2Var.f3430b = bxVar.u();
        bxVar.q();
        bxVar.h();
        if (m20.L(nb2Var.f3429a, "success")) {
            u3Var.b();
        }
        return nb2Var;
    }
}
