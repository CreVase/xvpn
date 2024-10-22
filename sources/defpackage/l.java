package defpackage;

import com.security.xvpn.z35kb.XApplication;

/* loaded from: classes2.dex */
public final class l extends z33 implements l41 {
    public l(c90 c90Var) {
        super(2, c90Var);
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new l(c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        l lVar = new l((c90) obj2);
        ch3 ch3Var = ch3.f636a;
        lVar.invokeSuspend(ch3Var);
        return ch3Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        XApplication.d();
        return ch3.f636a;
    }
}
