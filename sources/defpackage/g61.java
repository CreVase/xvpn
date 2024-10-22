package defpackage;

import com.security.xvpn.z35kb.television.GuideActivity;

/* loaded from: classes2.dex */
public final class g61 extends z33 implements l41 {
    public /* synthetic */ Object e;
    public final /* synthetic */ GuideActivity f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g61(GuideActivity guideActivity, c90 c90Var) {
        super(2, c90Var);
        this.f = guideActivity;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        g61 g61Var = new g61(this.f, c90Var);
        g61Var.e = obj;
        return g61Var;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        g61 g61Var = (g61) create((aa0) obj, (c90) obj2);
        ch3 ch3Var = ch3.f636a;
        g61Var.invokeSuspend(ch3Var);
        return ch3Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        zf3.T((aa0) this.e, null, new f61(this.f, null), 3);
        return ch3.f636a;
    }
}
