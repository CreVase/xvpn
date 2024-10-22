package defpackage;

/* loaded from: classes.dex */
public final class qm implements dv0 {
    public int c;
    public rm e;
    public long h;
    public g00 i;
    public int m;
    public boolean n;

    /* renamed from: a, reason: collision with root package name */
    public final r42 f4018a = new r42(12);

    /* renamed from: b, reason: collision with root package name */
    public final pm f4019b = new pm();
    public fv0 d = new bo1(0);
    public g00[] g = new g00[0];
    public long k = -1;
    public long l = -1;
    public int j = -1;
    public long f = -9223372036854775807L;

    public final g00 a(int i) {
        boolean z;
        for (g00 g00Var : this.g) {
            if (g00Var.f2187b != i && g00Var.c != i) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return g00Var;
            }
        }
        return null;
    }

    @Override // defpackage.dv0
    public final boolean d(ev0 ev0Var) {
        r42 r42Var = this.f4018a;
        ev0Var.b(0, r42Var.f4098a, 12);
        r42Var.G(0);
        if (r42Var.i() != 1179011410) {
            return false;
        }
        r42Var.H(4);
        if (r42Var.i() != 541677121) {
            return false;
        }
        return true;
    }

    @Override // defpackage.dv0
    public final void e(long j, long j2) {
        this.h = -1L;
        this.i = null;
        for (g00 g00Var : this.g) {
            if (g00Var.j == 0) {
                g00Var.h = 0;
            } else {
                g00Var.h = g00Var.l[wi3.f(g00Var.k, j, true)];
            }
        }
        if (j == 0) {
            if (this.g.length == 0) {
                this.c = 0;
                return;
            } else {
                this.c = 3;
                return;
            }
        }
        this.c = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    @Override // defpackage.dv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(defpackage.ev0 r21, defpackage.lm2 r22) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qm.f(ev0, lm2):int");
    }

    @Override // defpackage.dv0
    public final void i(fv0 fv0Var) {
        this.c = 0;
        this.d = fv0Var;
        this.h = -1L;
    }

    @Override // defpackage.dv0
    public final void release() {
    }
}
