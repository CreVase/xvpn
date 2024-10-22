package defpackage;

import a.bx;
import a.du;

/* loaded from: classes2.dex */
public final class oy extends z33 implements l41 {
    public final /* synthetic */ tt3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy(tt3 tt3Var, c90 c90Var) {
        super(2, c90Var);
        this.e = tt3Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new oy(this.e, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((oy) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        bx bxVar = new bx();
        tt3 tt3Var = this.e;
        if (tt3Var == null) {
            tt3Var = new tt3();
        }
        tf3.m(bxVar, tt3Var);
        du.d(20, bxVar);
        String u = bxVar.u();
        bxVar.h();
        return u;
    }
}
