package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ci implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f637a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x50 f638b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ ci(x50 x50Var, Exception exc, int i) {
        this.f637a = i;
        this.f638b = x50Var;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f637a;
        Exception exc = this.c;
        x50 x50Var = this.f638b;
        switch (i) {
            case 0:
                yt0 yt0Var = (yt0) x50Var.c;
                int i2 = wi3.f5017a;
                uf0 uf0Var = (uf0) yt0Var.f5387a.q;
                wa n = uf0Var.n();
                uf0Var.o(n, 1014, new lf0(n, exc, 1));
                return;
            default:
                yt0 yt0Var2 = (yt0) x50Var.c;
                int i3 = wi3.f5017a;
                uf0 uf0Var2 = (uf0) yt0Var2.f5387a.q;
                wa n2 = uf0Var2.n();
                uf0Var2.o(n2, 1029, new lf0(n2, exc, 2));
                return;
        }
    }
}
