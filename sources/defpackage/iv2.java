package defpackage;

/* loaded from: classes.dex */
public final class iv2 extends z33 implements l41 {
    public /* synthetic */ Object e;
    public final /* synthetic */ y03 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv2(y03 y03Var, c90 c90Var) {
        super(2, c90Var);
        this.f = y03Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        iv2 iv2Var = new iv2(this.f, c90Var);
        iv2Var.e = obj;
        return iv2Var;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((iv2) create((y03) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        y03 y03Var = (y03) this.e;
        y03 y03Var2 = this.f;
        boolean z = false;
        if (!(y03Var2 instanceof kd0) && !(y03Var2 instanceof kx0) && y03Var == y03Var2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
