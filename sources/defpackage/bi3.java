package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class bi3 implements i43, rl1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f470a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f471b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bi3(wa waVar, Object obj, int i) {
        this.c = waVar;
        this.d = obj;
        this.f471b = i;
    }

    @Override // defpackage.i43
    public final Object execute() {
        fi3 fi3Var = (fi3) this.c;
        ((hf1) fi3Var.d).a((lm) this.d, this.f471b + 1, false);
        return null;
    }

    @Override // defpackage.rl1
    public final void invoke(Object obj) {
        switch (this.f470a) {
            case 1:
                w52 w52Var = (w52) this.c;
                w52 w52Var2 = (w52) this.d;
                v52 v52Var = (v52) obj;
                int i = bu0.d0;
                int i2 = this.f471b;
                v52Var.onPositionDiscontinuity(i2);
                v52Var.onPositionDiscontinuity(w52Var, w52Var2, i2);
                return;
            default:
                ((xa) obj).getClass();
                return;
        }
    }

    public /* synthetic */ bi3(w52 w52Var, w52 w52Var2, int i) {
        this.f471b = i;
        this.c = w52Var;
        this.d = w52Var2;
    }
}
