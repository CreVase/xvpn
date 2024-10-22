package defpackage;

import a.bx;
import a.du;

/* loaded from: classes2.dex */
public final class qy extends z33 implements l41 {
    public final /* synthetic */ ut3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy(ut3 ut3Var, c90 c90Var) {
        super(2, c90Var);
        this.e = ut3Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new qy(this.e, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        qy qyVar = (qy) create((aa0) obj, (c90) obj2);
        ch3 ch3Var = ch3.f636a;
        qyVar.invokeSuspend(ch3Var);
        return ch3Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        bx bxVar = new bx();
        ut3 ut3Var = this.e;
        if (ut3Var == null) {
            ut3Var = new ut3();
        }
        tf3.n(bxVar, ut3Var);
        du.d(29, bxVar);
        bxVar.h();
        return ch3.f636a;
    }
}
