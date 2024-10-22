package defpackage;

/* loaded from: classes2.dex */
public final class ra1 extends z33 implements l41 {
    public final /* synthetic */ ei2 e;
    public final /* synthetic */ z91 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra1(ei2 ei2Var, z91 z91Var, int i, int i2, c90 c90Var) {
        super(2, c90Var);
        this.e = ei2Var;
        this.f = z91Var;
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new ra1(this.e, this.f, this.g, this.h, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        ra1 ra1Var = (ra1) create((aa0) obj, (c90) obj2);
        ch3 ch3Var = ch3.f636a;
        ra1Var.invokeSuspend(ch3Var);
        return ch3Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        this.e.f1938a = ((j53) this.f).k(this.g, false);
        return ch3.f636a;
    }
}
