package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class gk3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2268a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jk3 f2269b;
    public final /* synthetic */ se0 c;

    public /* synthetic */ gk3(jk3 jk3Var, se0 se0Var, int i) {
        this.f2268a = i;
        this.f2269b = jk3Var;
        this.c = se0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2268a) {
            case 0:
                jk3 jk3Var = this.f2269b;
                se0 se0Var = this.c;
                jk3Var.getClass();
                synchronized (se0Var) {
                }
                kk3 kk3Var = jk3Var.f2783b;
                int i = wi3.f5017a;
                bu0 bu0Var = ((yt0) kk3Var).f5387a;
                uf0 uf0Var = (uf0) bu0Var.q;
                wa g = uf0Var.g(uf0Var.d.e);
                uf0Var.o(g, 1020, new rf0(1, g, se0Var));
                bu0Var.K = null;
                return;
            default:
                jk3 jk3Var2 = this.f2269b;
                jk3Var2.getClass();
                int i2 = wi3.f5017a;
                bu0 bu0Var2 = ((yt0) jk3Var2.f2783b).f5387a;
                bu0Var2.getClass();
                uf0 uf0Var2 = (uf0) bu0Var2.q;
                wa n = uf0Var2.n();
                uf0Var2.o(n, 1015, new rf0(0, n, this.c));
                return;
        }
    }
}
