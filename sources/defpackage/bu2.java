package defpackage;

import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes2.dex */
public final class bu2 extends z33 implements l41 {
    public int e;
    public final /* synthetic */ hu2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu2(hu2 hu2Var, c90 c90Var) {
        super(2, c90Var);
        this.f = hu2Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new bu2(this.f, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((bu2) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        int i = this.e;
        ch3 ch3Var = ch3.f636a;
        hu2 hu2Var = this.f;
        if (i != 0) {
            if (i == 1) {
                fl.a0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            fl.a0(obj);
            if (ew3.o()) {
                return ch3Var;
            }
            hu2Var.f.i(Boolean.TRUE);
            sh0 sh0Var = vl0.c;
            au2 au2Var = new au2(null);
            this.e = 1;
            obj = zf3.p0(this, sh0Var, au2Var);
            if (obj == ba0Var) {
                return ba0Var;
            }
        }
        ub2 ub2Var = (ub2) obj;
        hu2Var.getClass();
        Log.e(hu2Var.e, "onTokenResponse: " + ub2Var.f4647b + " " + ub2Var.f4646a);
        hu2Var.f.i(Boolean.FALSE);
        if (ub2Var.c) {
            hu2Var.o(ub2Var.f4647b);
        } else if (TextUtils.isEmpty(ub2Var.f4647b)) {
            hu2Var.q.i(ub2Var.f4646a);
            hu2Var.r.i("");
            o03 o03Var = hu2Var.v;
            if (o03Var != null) {
                o03Var.c(null);
            }
            hu2Var.v = zf3.T(t9.N(hu2Var), null, new zt2(hu2Var, null), 3);
            o03 o03Var2 = hu2Var.w;
            if (o03Var2 != null) {
                o03Var2.c(null);
            }
            hu2Var.w = zf3.T(t9.N(hu2Var), null, new gu2(hu2Var, null), 3);
        } else {
            hu2Var.o(ub2Var.f4647b);
        }
        return ch3Var;
    }
}
