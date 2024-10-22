package defpackage;

/* loaded from: classes.dex */
public final class uz0 implements dv0 {
    public fv0 f;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public ki o;
    public mk3 p;

    /* renamed from: a, reason: collision with root package name */
    public final r42 f4762a = new r42(4);

    /* renamed from: b, reason: collision with root package name */
    public final r42 f4763b = new r42(9);
    public final r42 c = new r42(11);
    public final r42 d = new r42();
    public final vn2 e = new vn2();
    public int g = 1;

    public final r42 a(ev0 ev0Var) {
        int i = this.l;
        r42 r42Var = this.d;
        byte[] bArr = r42Var.f4098a;
        if (i > bArr.length) {
            r42Var.E(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            r42Var.G(0);
        }
        r42Var.F(this.l);
        ev0Var.readFully(r42Var.f4098a, 0, this.l);
        return r42Var;
    }

    @Override // defpackage.dv0
    public final boolean d(ev0 ev0Var) {
        r42 r42Var = this.f4762a;
        ih0 ih0Var = (ih0) ev0Var;
        ih0Var.e(r42Var.f4098a, 0, 3, false);
        r42Var.G(0);
        if (r42Var.x() != 4607062) {
            return false;
        }
        ih0Var.e(r42Var.f4098a, 0, 2, false);
        r42Var.G(0);
        if ((r42Var.A() & 250) != 0) {
            return false;
        }
        ih0Var.e(r42Var.f4098a, 0, 4, false);
        r42Var.G(0);
        int f = r42Var.f();
        ih0Var.f = 0;
        ih0Var.n(f, false);
        ih0Var.e(r42Var.f4098a, 0, 4, false);
        r42Var.G(0);
        if (r42Var.f() != 0) {
            return false;
        }
        return true;
    }

    @Override // defpackage.dv0
    public final void e(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x005e, code lost:            if (r2.d(r14, r7) != false) goto L25;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0060, code lost:            r2 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0088, code lost:            if (r2.d(r14, r7) != false) goto L25;     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0009 A[SYNTHETIC] */
    @Override // defpackage.dv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(defpackage.ev0 r17, defpackage.lm2 r18) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uz0.f(ev0, lm2):int");
    }

    @Override // defpackage.dv0
    public final void i(fv0 fv0Var) {
        this.f = fv0Var;
    }

    @Override // defpackage.dv0
    public final void release() {
    }
}
