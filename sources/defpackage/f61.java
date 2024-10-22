package defpackage;

import com.security.xvpn.z35kb.television.GuideActivity;

/* loaded from: classes2.dex */
public final class f61 extends z33 implements l41 {
    public int e;
    public final /* synthetic */ GuideActivity f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f61(GuideActivity guideActivity, c90 c90Var) {
        super(2, c90Var);
        this.f = guideActivity;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new f61(this.f, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        ((f61) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
        return ba0.f430a;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.a0(obj);
        } else {
            fl.a0(obj);
            b13 b13Var = yc2.f5315b;
            kv2 kv2Var = new kv2(this.f, 3);
            this.e = 1;
            if (b13Var.a(kv2Var, this) == ba0Var) {
                return ba0Var;
            }
        }
        throw new j11(null);
    }
}
