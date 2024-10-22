package defpackage;

/* loaded from: classes.dex */
public final class g71 implements qp0 {

    /* renamed from: a, reason: collision with root package name */
    public final uy0 f2213a;

    /* renamed from: b, reason: collision with root package name */
    public String f2214b;
    public xa3 c;
    public f71 d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final jk1 g = new jk1(32);
    public final jk1 h = new jk1(33);
    public final jk1 i = new jk1(34);
    public final jk1 j = new jk1(39);
    public final jk1 k = new jk1(40);
    public long m = -9223372036854775807L;
    public final r42 n = new r42();

    public g71(uy0 uy0Var) {
        this.f2213a = uy0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x024c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021e  */
    @Override // defpackage.qp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.r42 r36) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g71.a(r42):void");
    }

    public final void b(int i, byte[] bArr, int i2) {
        boolean z;
        f71 f71Var = this.d;
        if (f71Var.f) {
            int i3 = f71Var.d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                if ((bArr[i4] & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                f71Var.g = z;
                f71Var.f = false;
            } else {
                f71Var.d = (i2 - i) + i3;
            }
        }
        if (!this.e) {
            this.g.a(i, bArr, i2);
            this.h.a(i, bArr, i2);
            this.i.a(i, bArr, i2);
        }
        this.j.a(i, bArr, i2);
        this.k.a(i, bArr, i2);
    }

    @Override // defpackage.qp0
    public final void c() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        py1.a(this.f);
        this.g.f();
        this.h.f();
        this.i.f();
        this.j.f();
        this.k.f();
        f71 f71Var = this.d;
        if (f71Var != null) {
            f71Var.f = false;
            f71Var.g = false;
            f71Var.h = false;
            f71Var.i = false;
            f71Var.j = false;
        }
    }

    @Override // defpackage.qp0
    public final void d() {
    }

    @Override // defpackage.qp0
    public final void e(int i, long j) {
        if (j != -9223372036854775807L) {
            this.m = j;
        }
    }

    @Override // defpackage.qp0
    public final void f(fv0 fv0Var, qc3 qc3Var) {
        qc3Var.a();
        qc3Var.b();
        this.f2214b = qc3Var.e;
        qc3Var.b();
        xa3 l = fv0Var.l(qc3Var.d, 2);
        this.c = l;
        this.d = new f71(l);
        this.f2213a.i(fv0Var, qc3Var);
    }
}
