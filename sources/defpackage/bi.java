package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class bi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f467a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x50 f468b;
    public final /* synthetic */ se0 c;

    public /* synthetic */ bi(x50 x50Var, se0 se0Var, int i) {
        this.f467a = i;
        this.f468b = x50Var;
        this.c = se0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f467a) {
            case 0:
                x50 x50Var = this.f468b;
                se0 se0Var = this.c;
                x50Var.getClass();
                synchronized (se0Var) {
                }
                yt0 yt0Var = (yt0) x50Var.c;
                int i = wi3.f5017a;
                uf0 uf0Var = (uf0) yt0Var.f5387a.q;
                wa g = uf0Var.g(uf0Var.d.e);
                uf0Var.o(g, 1013, new rf0(3, g, se0Var));
                return;
            default:
                yt0 yt0Var2 = (yt0) this.f468b.c;
                int i2 = wi3.f5017a;
                bu0 bu0Var = yt0Var2.f5387a;
                bu0Var.getClass();
                uf0 uf0Var2 = (uf0) bu0Var.q;
                wa n = uf0Var2.n();
                uf0Var2.o(n, 1007, new rf0(2, n, this.c));
                return;
        }
    }
}
