package defpackage;

import a.bx;
import a.du;

/* loaded from: classes2.dex */
public final class e42 extends z33 implements l41 {
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e42(String str, c90 c90Var) {
        super(2, c90Var);
        this.e = str;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new e42(this.e, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((e42) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        bx bxVar = new bx();
        bxVar.z(this.e);
        du.d(113, bxVar);
        fc2 fc2Var = new fc2();
        ew3.w0(bxVar, fc2Var);
        bxVar.h();
        return fc2Var;
    }
}
