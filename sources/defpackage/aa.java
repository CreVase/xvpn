package defpackage;

import com.security.xvpn.z35kb.accelerateApp.AllAppActivity;
import java.util.List;

/* loaded from: classes2.dex */
public final class aa extends z33 implements l41 {
    public d5 e;
    public int f;
    public final /* synthetic */ AllAppActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(AllAppActivity allAppActivity, c90 c90Var) {
        super(2, c90Var);
        this.g = allAppActivity;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new aa(this.g, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((aa) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        d5 d5Var;
        ba0 ba0Var = ba0.f430a;
        int i = this.f;
        if (i != 0) {
            if (i == 1) {
                d5Var = this.e;
                fl.a0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            fl.a0(obj);
            d5 d5Var2 = gf.f2243a;
            sh0 sh0Var = vl0.c;
            z9 z9Var = new z9(null);
            this.e = d5Var2;
            this.f = 1;
            Object p0 = zf3.p0(this, sh0Var, z9Var);
            if (p0 == ba0Var) {
                return ba0Var;
            }
            d5Var = d5Var2;
            obj = p0;
        }
        d5Var.getClass();
        gf.f2244b = (List) obj;
        AllAppActivity allAppActivity = this.g;
        allAppActivity.N();
        AllAppActivity.b0(allAppActivity);
        return ch3.f636a;
    }
}
