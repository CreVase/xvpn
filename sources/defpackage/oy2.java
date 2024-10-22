package defpackage;

import com.security.xvpn.z35kb.television.SplashActivity;

/* loaded from: classes2.dex */
public final class oy2 extends z33 implements l41 {
    public int e;
    public final /* synthetic */ SplashActivity f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy2(SplashActivity splashActivity, c90 c90Var) {
        super(2, c90Var);
        this.f = splashActivity;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new oy2(this.f, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((oy2) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        int i = this.e;
        if (i != 0) {
            if (i == 1) {
                fl.a0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            fl.a0(obj);
            SplashActivity splashActivity = this.f;
            ny2 ny2Var = new ny2(splashActivity, null);
            this.e = 1;
            if (tf3.q0(splashActivity, ny2Var, this) == ba0Var) {
                return ba0Var;
            }
        }
        return ch3.f636a;
    }
}
