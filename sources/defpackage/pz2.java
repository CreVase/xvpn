package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class pz2 extends z33 implements l41 {
    public d5 e;
    public int f;
    public final /* synthetic */ tz2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz2(tz2 tz2Var, c90 c90Var) {
        super(2, c90Var);
        this.g = tz2Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new pz2(this.g, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((pz2) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
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
            oz2 oz2Var = new oz2(null);
            this.e = d5Var2;
            this.f = 1;
            Object p0 = zf3.p0(this, sh0Var, oz2Var);
            if (p0 == ba0Var) {
                return ba0Var;
            }
            d5Var = d5Var2;
            obj = p0;
        }
        d5Var.getClass();
        gf.f2244b = (List) obj;
        int i2 = tz2.m;
        this.g.z();
        return ch3.f636a;
    }
}
