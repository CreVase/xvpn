package defpackage;

import com.security.xvpn.z35kb.television.GuideActivity;
import com.security.xvpn.z35kb.television.HomeActivity;

/* loaded from: classes2.dex */
public final class e4 extends z33 implements l41 {
    public int e;
    public final /* synthetic */ f4 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(f4 f4Var, c90 c90Var) {
        super(2, c90Var);
        this.f = f4Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new e4(this.f, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((e4) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
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
            sh0 sh0Var = vl0.c;
            d4 d4Var = new d4(null);
            this.e = 1;
            if (zf3.p0(this, sh0Var, d4Var) == ba0Var) {
                return ba0Var;
            }
        }
        f4 f4Var = this.f;
        ((HomeActivity) f4Var.requireActivity()).N();
        if (m20.L(pe0.b(), "Connected")) {
            pe0.e();
        }
        ew3.T0("");
        f4Var.requireActivity().finish();
        tf3.h0(f4Var.requireActivity(), GuideActivity.class, null, 0, 6);
        return ch3.f636a;
    }
}
