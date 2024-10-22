package defpackage;

/* loaded from: classes2.dex */
public final class kz0 extends z33 implements l41 {
    public int e;
    public final /* synthetic */ gz0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz0(gz0 gz0Var, c90 c90Var) {
        super(2, c90Var);
        this.f = gz0Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new kz0(this.f, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((kz0) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        int i = this.e;
        ch3 ch3Var = ch3.f636a;
        if (i != 0) {
            if (i == 1) {
                fl.a0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            fl.a0(obj);
            this.e = 1;
            Object a2 = this.f.a(i02.f2512a, this);
            if (a2 != ba0Var) {
                a2 = ch3Var;
            }
            if (a2 == ba0Var) {
                return ba0Var;
            }
        }
        return ch3Var;
    }
}
