package defpackage;

import a.bx;

/* loaded from: classes2.dex */
public final class dy extends z33 implements l41 {
    public dy(c90 c90Var) {
        super(2, c90Var);
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new dy(c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return new dy((c90) obj2).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        boolean T = ew3.T();
        bx i = hx2.i(43);
        String u = i.u();
        i.h();
        return tf3.h(u, T);
    }
}
