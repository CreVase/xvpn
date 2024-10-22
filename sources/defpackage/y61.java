package defpackage;

/* loaded from: classes.dex */
public final class y61 implements qp0 {
    public static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f5279a;

    /* renamed from: b, reason: collision with root package name */
    public xa3 f5280b;
    public final hi3 c;
    public final r42 d;
    public final jk1 e;
    public final boolean[] f = new boolean[4];
    public final x61 g = new x61();
    public long h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;

    public y61(hi3 hi3Var) {
        this.c = hi3Var;
        if (hi3Var != null) {
            this.e = new jk1(178);
            this.d = new r42();
        } else {
            this.e = null;
            this.d = null;
        }
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d2  */
    @Override // defpackage.qp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.r42 r21) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y61.a(r42):void");
    }

    @Override // defpackage.qp0
    public final void c() {
        py1.a(this.f);
        x61 x61Var = this.g;
        x61Var.f5121a = false;
        x61Var.f5122b = 0;
        x61Var.c = 0;
        jk1 jk1Var = this.e;
        if (jk1Var != null) {
            jk1Var.f();
        }
        this.h = 0L;
        this.i = false;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.qp0
    public final void d() {
    }

    @Override // defpackage.qp0
    public final void e(int i, long j) {
        this.l = j;
    }

    @Override // defpackage.qp0
    public final void f(fv0 fv0Var, qc3 qc3Var) {
        qc3Var.a();
        qc3Var.b();
        this.f5279a = qc3Var.e;
        qc3Var.b();
        this.f5280b = fv0Var.l(qc3Var.d, 2);
        hi3 hi3Var = this.c;
        if (hi3Var != null) {
            hi3Var.b(fv0Var, qc3Var);
        }
    }
}
