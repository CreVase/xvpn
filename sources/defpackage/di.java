package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class di implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1784a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1785b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ di(Object obj, String str, long j, long j2, int i) {
        this.f1784a = i;
        this.e = obj;
        this.f1785b = str;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1784a;
        Object obj = this.e;
        switch (i) {
            case 0:
                final String str = this.f1785b;
                final long j = this.c;
                final long j2 = this.d;
                yt0 yt0Var = (yt0) ((x50) obj).c;
                int i2 = wi3.f5017a;
                uf0 uf0Var = (uf0) yt0Var.f5387a.q;
                final wa n = uf0Var.n();
                final int i3 = 1;
                uf0Var.o(n, 1008, new rl1(n, str, j2, j, i3) { // from class: nf0

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f3450a;

                    {
                        this.f3450a = i3;
                    }

                    @Override // defpackage.rl1
                    public final void invoke(Object obj2) {
                        switch (this.f3450a) {
                            case 0:
                                ((xa) obj2).getClass();
                                return;
                            default:
                                ((xa) obj2).getClass();
                                return;
                        }
                    }
                });
                return;
            default:
                jk3 jk3Var = (jk3) obj;
                final String str2 = this.f1785b;
                final long j3 = this.c;
                final long j4 = this.d;
                jk3Var.getClass();
                int i4 = wi3.f5017a;
                uf0 uf0Var2 = (uf0) ((yt0) jk3Var.f2783b).f5387a.q;
                final wa n2 = uf0Var2.n();
                final int i5 = 0;
                uf0Var2.o(n2, 1016, new rl1(n2, str2, j4, j3, i5) { // from class: nf0

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f3450a;

                    {
                        this.f3450a = i5;
                    }

                    @Override // defpackage.rl1
                    public final void invoke(Object obj2) {
                        switch (this.f3450a) {
                            case 0:
                                ((xa) obj2).getClass();
                                return;
                            default:
                                ((xa) obj2).getClass();
                                return;
                        }
                    }
                });
                return;
        }
    }
}
