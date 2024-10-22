package defpackage;

import com.security.xvpn.z35kb.television.SplashActivity;

/* loaded from: classes2.dex */
public final class ny2 extends z33 implements l41 {
    public /* synthetic */ Object e;
    public final /* synthetic */ SplashActivity f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny2(SplashActivity splashActivity, c90 c90Var) {
        super(2, c90Var);
        this.f = splashActivity;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        ny2 ny2Var = new ny2(this.f, c90Var);
        ny2Var.e = obj;
        return ny2Var;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        ny2 ny2Var = (ny2) create((aa0) obj, (c90) obj2);
        ch3 ch3Var = ch3.f636a;
        ny2Var.invokeSuspend(ch3Var);
        return ch3Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        aa0 aa0Var = (aa0) this.e;
        SplashActivity splashActivity = this.f;
        zf3.T(aa0Var, null, new ly2(splashActivity, null), 3);
        zf3.T(aa0Var, null, new my2(splashActivity, null), 3);
        return ch3.f636a;
    }
}
