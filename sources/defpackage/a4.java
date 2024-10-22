package defpackage;

import a.bx;
import a.du;

/* loaded from: classes2.dex */
public final class a4 extends z33 implements l41 {
    public a4(c90 c90Var) {
        super(2, c90Var);
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new a4(c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return new a4((c90) obj2).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        u3 u3Var = u3.f4616b;
        u3Var.getClass();
        bx bxVar = new bx();
        du.d(105, bxVar);
        String u = bxVar.u();
        bxVar.h();
        u3Var.b();
        return u;
    }
}
