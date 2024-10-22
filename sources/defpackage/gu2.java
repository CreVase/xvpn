package defpackage;

import a.bx;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class gu2 extends z33 implements l41 {
    public int e;
    public final /* synthetic */ hu2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu2(hu2 hu2Var, c90 c90Var) {
        super(2, c90Var);
        this.f = hu2Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new gu2(this.f, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((gu2) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        boolean z;
        ba0 ba0Var = ba0.f430a;
        int i = this.e;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fl.a0(obj);
        do {
            bx i2 = hx2.i(114);
            String u = i2.u();
            i2.h();
            hu2 hu2Var = this.f;
            hu2Var.s.i(u + "s");
            if (u.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                hu2Var.o(pd0.y(R.string.PasscodeExpired));
                return ch3.f636a;
            }
            this.e = 1;
        } while (t9.C(1000L, this) != ba0Var);
        return ba0Var;
    }
}
