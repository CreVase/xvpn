package defpackage;

/* loaded from: classes.dex */
public final class ej2 extends z33 implements l41 {
    public hy1 e;
    public l41 f;
    public int g;
    public final /* synthetic */ hy1 h;
    public final /* synthetic */ l41 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej2(hy1 hy1Var, l41 l41Var, c90 c90Var) {
        super(2, c90Var);
        this.h = hy1Var;
        this.i = l41Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new ej2(this.h, this.i, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((ej2) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [hy1] */
    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        l41 l41Var;
        ky1 ky1Var;
        hy1 hy1Var;
        Throwable th;
        ba0 ba0Var = ba0.f430a;
        int i = this.g;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        hy1Var = this.e;
                        try {
                            fl.a0(obj);
                            ((ky1) hy1Var).e(null);
                            return ch3.f636a;
                        } catch (Throwable th2) {
                            th = th2;
                            ((ky1) hy1Var).e(null);
                            throw th;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l41Var = this.f;
                ?? r3 = this.e;
                fl.a0(obj);
                ky1Var = r3;
            } else {
                fl.a0(obj);
                hy1 hy1Var2 = this.h;
                this.e = hy1Var2;
                l41Var = this.i;
                this.f = l41Var;
                this.g = 1;
                ky1Var = (ky1) hy1Var2;
                if (ky1Var.d(this) == ba0Var) {
                    return ba0Var;
                }
            }
            dj2 dj2Var = new dj2(l41Var, null);
            this.e = ky1Var;
            this.f = null;
            this.g = 2;
            tn2 tn2Var = new tn2(this, getContext());
            if (pd0.N(tn2Var, tn2Var, dj2Var) == ba0Var) {
                return ba0Var;
            }
            hy1Var = ky1Var;
            ((ky1) hy1Var).e(null);
            return ch3.f636a;
        } catch (Throwable th3) {
            hy1Var = ky1Var;
            th = th3;
            ((ky1) hy1Var).e(null);
            throw th;
        }
    }
}
