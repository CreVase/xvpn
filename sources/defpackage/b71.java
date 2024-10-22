package defpackage;

/* loaded from: classes.dex */
public final class b71 implements qp0 {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final hi3 f418a;
    public a71 f;
    public long g;
    public String h;
    public xa3 i;
    public boolean j;
    public final boolean[] c = new boolean[4];
    public final z61 d = new z61();
    public long k = -9223372036854775807L;
    public final jk1 e = new jk1(178);

    /* renamed from: b, reason: collision with root package name */
    public final r42 f419b = new r42();

    public b71(hi3 hi3Var) {
        this.f418a = hi3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0220 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x025c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0268  */
    @Override // defpackage.qp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.r42 r26) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b71.a(r42):void");
    }

    @Override // defpackage.qp0
    public final void c() {
        py1.a(this.c);
        z61 z61Var = this.d;
        z61Var.f5434a = false;
        z61Var.c = 0;
        z61Var.f5435b = 0;
        a71 a71Var = this.f;
        if (a71Var != null) {
            a71Var.f35b = false;
            a71Var.c = false;
            a71Var.d = false;
            a71Var.e = -1;
        }
        jk1 jk1Var = this.e;
        if (jk1Var != null) {
            jk1Var.f();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // defpackage.qp0
    public final void d() {
    }

    @Override // defpackage.qp0
    public final void e(int i, long j) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    @Override // defpackage.qp0
    public final void f(fv0 fv0Var, qc3 qc3Var) {
        qc3Var.a();
        qc3Var.b();
        this.h = qc3Var.e;
        qc3Var.b();
        xa3 l2 = fv0Var.l(qc3Var.d, 2);
        this.i = l2;
        this.f = new a71(l2);
        hi3 hi3Var = this.f418a;
        if (hi3Var != null) {
            hi3Var.b(fv0Var, qc3Var);
        }
    }
}
