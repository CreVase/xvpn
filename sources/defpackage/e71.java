package defpackage;

/* loaded from: classes.dex */
public final class e71 implements qp0 {

    /* renamed from: a, reason: collision with root package name */
    public final uy0 f1893a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1894b;
    public final boolean c;
    public long g;
    public String i;
    public xa3 j;
    public d71 k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final jk1 d = new jk1(7);
    public final jk1 e = new jk1(8);
    public final jk1 f = new jk1(6);
    public long m = -9223372036854775807L;
    public final r42 o = new r42();

    public e71(uy0 uy0Var, boolean z, boolean z2) {
        this.f1893a = uy0Var;
        this.f1894b = z;
        this.c = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x01f2, code lost:            if (r6.n != r7.n) goto L83;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0203, code lost:            if (r6.p != r7.p) goto L83;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0211, code lost:            if (r6.l != r7.l) goto L83;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0217, code lost:            if (r6 == false) goto L93;     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02aa, code lost:            if (r5 != 1) goto L126;     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0271 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b2  */
    @Override // defpackage.qp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.r42 r29) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e71.a(r42):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r18, byte[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e71.b(int, byte[], int):void");
    }

    @Override // defpackage.qp0
    public final void c() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        py1.a(this.h);
        this.d.f();
        this.e.f();
        this.f.f();
        d71 d71Var = this.k;
        if (d71Var != null) {
            d71Var.k = false;
            d71Var.o = false;
            c71 c71Var = d71Var.n;
            c71Var.f596b = false;
            c71Var.f595a = false;
        }
    }

    @Override // defpackage.qp0
    public final void d() {
    }

    @Override // defpackage.qp0
    public final void e(int i, long j) {
        boolean z;
        if (j != -9223372036854775807L) {
            this.m = j;
        }
        boolean z2 = this.n;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.n = z | z2;
    }

    @Override // defpackage.qp0
    public final void f(fv0 fv0Var, qc3 qc3Var) {
        qc3Var.a();
        qc3Var.b();
        this.i = qc3Var.e;
        qc3Var.b();
        xa3 l = fv0Var.l(qc3Var.d, 2);
        this.j = l;
        this.k = new d71(l, this.f1894b, this.c);
        this.f1893a.i(fv0Var, qc3Var);
    }
}
