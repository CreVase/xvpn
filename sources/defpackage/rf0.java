package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class rf0 implements rl1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ se0 f4144b;

    public /* synthetic */ rf0(int i, wa waVar, se0 se0Var) {
        this.f4143a = i;
        this.f4144b = se0Var;
    }

    @Override // defpackage.rl1
    public final void invoke(Object obj) {
        switch (this.f4143a) {
            case 0:
                ((xa) obj).getClass();
                return;
            case 1:
                jt1 jt1Var = (jt1) ((xa) obj);
                int i = jt1Var.x;
                se0 se0Var = this.f4144b;
                jt1Var.x = i + se0Var.g;
                jt1Var.y += se0Var.e;
                return;
            case 2:
                ((xa) obj).getClass();
                return;
            default:
                ((xa) obj).getClass();
                return;
        }
    }
}
