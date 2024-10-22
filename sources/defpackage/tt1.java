package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class tt1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4573a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vt1 f4574b;
    public final /* synthetic */ wt1 c;
    public final /* synthetic */ xl1 d;
    public final /* synthetic */ et1 e;

    public /* synthetic */ tt1(vt1 vt1Var, wt1 wt1Var, xl1 xl1Var, et1 et1Var, int i) {
        this.f4573a = i;
        this.f4574b = vt1Var;
        this.c = wt1Var;
        this.d = xl1Var;
        this.e = et1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4573a;
        et1 et1Var = this.e;
        xl1 xl1Var = this.d;
        wt1 wt1Var = this.c;
        vt1 vt1Var = this.f4574b;
        switch (i) {
            case 0:
                wt1Var.e(vt1Var.f4892a, vt1Var.f4893b, xl1Var, et1Var);
                return;
            case 1:
                wt1Var.h(vt1Var.f4892a, vt1Var.f4893b, xl1Var, et1Var);
                return;
            default:
                wt1Var.f(vt1Var.f4892a, vt1Var.f4893b, xl1Var, et1Var);
                return;
        }
    }
}
