package defpackage;

import com.security.xvpn.z35kb.television.SplashActivity;

/* loaded from: classes2.dex */
public final class ly2 extends z33 implements l41 {
    public int e;
    public final /* synthetic */ SplashActivity f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly2(SplashActivity splashActivity, c90 c90Var) {
        super(2, c90Var);
        this.f = splashActivity;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new ly2(this.f, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        ((ly2) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
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
            yb.f5305b.getClass();
            vg2 vg2Var = yb.f;
            ky2 ky2Var = new ky2(this.f, 0);
            this.e = 1;
            if (vg2Var.a(ky2Var, this) == ba0Var) {
                return ba0Var;
            }
        }
        throw new j11(null);
    }
}
