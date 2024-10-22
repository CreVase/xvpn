package defpackage;

/* loaded from: classes2.dex */
public final class yr2 extends z33 implements l41 {
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ c72 g;
    public final /* synthetic */ zr2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr2(c72 c72Var, zr2 zr2Var, Object obj, c90 c90Var) {
        super(2, c90Var);
        this.f = obj;
        this.g = c72Var;
        this.h = zr2Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        yr2 yr2Var = new yr2(this.g, this.h, this.f, c90Var);
        yr2Var.e = obj;
        return yr2Var;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        yr2 yr2Var = (yr2) create((fy1) obj, (c90) obj2);
        ch3 ch3Var = ch3.f636a;
        yr2Var.invokeSuspend(ch3Var);
        return ch3Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        fy1 fy1Var = (fy1) this.e;
        c72 c72Var = this.g;
        Object obj2 = this.f;
        if (obj2 != null) {
            fy1Var.b(c72Var, obj2);
        } else {
            fy1Var.a();
            fy1Var.f2175a.remove(c72Var);
        }
        zr2.a(this.h, fy1Var);
        return ch3.f636a;
    }
}
