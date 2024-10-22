package defpackage;

/* loaded from: classes2.dex */
public final class gh1 extends ok2 implements n41 {
    public int f;
    public /* synthetic */ bf0 g;
    public final /* synthetic */ ih1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh1(ih1 ih1Var, c90 c90Var) {
        super(3, c90Var);
        this.h = ih1Var;
    }

    @Override // defpackage.n41
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        gh1 gh1Var = new gh1(this.h, (c90) obj3);
        gh1Var.g = (bf0) obj;
        return gh1Var.invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        int i = this.f;
        if (i != 0) {
            if (i == 1) {
                fl.a0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            fl.a0(obj);
            bf0 bf0Var = this.g;
            ih1 ih1Var = this.h;
            byte q = ih1Var.f2596a.q();
            if (q == 1) {
                return ih1Var.d(true);
            }
            if (q == 0) {
                return ih1Var.d(false);
            }
            if (q == 6) {
                this.f = 1;
                obj = ih1.a(ih1Var, bf0Var, this);
                if (obj == ba0Var) {
                    return ba0Var;
                }
            } else {
                if (q == 8) {
                    return ih1Var.c();
                }
                z13.n(ih1Var.f2596a, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
        }
        return (eg1) obj;
    }
}
