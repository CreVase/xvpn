package defpackage;

import a.bx;
import a.du;

/* loaded from: classes2.dex */
public final class cu2 extends z33 implements l41 {
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu2(String str, String str2, c90 c90Var) {
        super(2, c90Var);
        this.e = str;
        this.f = str2;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new cu2(this.e, this.f, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((cu2) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        u3 u3Var = u3.f4616b;
        u3Var.getClass();
        bx bxVar = new bx();
        bxVar.z(this.e);
        bxVar.z(this.f);
        du.d(89, bxVar);
        fc2 fc2Var = new fc2();
        ew3.w0(bxVar, fc2Var);
        bxVar.h();
        u3Var.b();
        return fc2Var;
    }
}
