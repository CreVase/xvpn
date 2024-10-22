package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class hk3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2440a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jk3 f2441b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;

    public /* synthetic */ hk3(jk3 jk3Var, int i, long j) {
        this.f2441b = jk3Var;
        this.c = i;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2440a;
        int i2 = this.c;
        long j = this.d;
        jk3 jk3Var = this.f2441b;
        switch (i) {
            case 0:
                jk3Var.getClass();
                int i3 = wi3.f5017a;
                uf0 uf0Var = (uf0) ((yt0) jk3Var.f2783b).f5387a.q;
                wa g = uf0Var.g(uf0Var.d.e);
                uf0Var.o(g, 1021, new mf0(g, j, i2));
                return;
            default:
                jk3Var.getClass();
                int i4 = wi3.f5017a;
                uf0 uf0Var2 = (uf0) ((yt0) jk3Var.f2783b).f5387a.q;
                wa g2 = uf0Var2.g(uf0Var2.d.e);
                uf0Var2.o(g2, 1018, new mf0(g2, i2, j));
                return;
        }
    }

    public /* synthetic */ hk3(jk3 jk3Var, long j, int i) {
        this.f2441b = jk3Var;
        this.d = j;
        this.c = i;
    }
}
