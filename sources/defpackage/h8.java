package defpackage;

/* loaded from: classes.dex */
public final class h8 implements dv0 {
    public final r42 d;
    public final nn3 e;
    public fv0 f;
    public long g;
    public boolean j;
    public boolean k;
    public boolean l;

    /* renamed from: a, reason: collision with root package name */
    public final int f2379a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final i8 f2380b = new i8(true, null);
    public final r42 c = new r42(2048);
    public int i = -1;
    public long h = -1;

    public h8() {
        r42 r42Var = new r42(10);
        this.d = r42Var;
        this.e = new nn3(r42Var.f4098a, 2, (Object) null);
    }

    public final int a(ev0 ev0Var) {
        int i = 0;
        while (true) {
            r42 r42Var = this.d;
            ev0Var.b(0, r42Var.f4098a, 10);
            r42Var.G(0);
            if (r42Var.x() != 4801587) {
                break;
            }
            r42Var.H(3);
            int u = r42Var.u();
            i += u + 10;
            ev0Var.g(u);
        }
        ev0Var.l();
        ev0Var.g(i);
        if (this.h == -1) {
            this.h = i;
        }
        return i;
    }

    @Override // defpackage.dv0
    public final boolean d(ev0 ev0Var) {
        boolean z;
        int a2 = a(ev0Var);
        int i = a2;
        int i2 = 0;
        int i3 = 0;
        do {
            r42 r42Var = this.d;
            ih0 ih0Var = (ih0) ev0Var;
            ih0Var.e(r42Var.f4098a, 0, 2, false);
            r42Var.G(0);
            if ((r42Var.A() & 65526) == 65520) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                i++;
                ih0Var.f = 0;
                ih0Var.n(i, false);
            } else {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                ih0Var.e(r42Var.f4098a, 0, 4, false);
                nn3 nn3Var = this.e;
                nn3Var.o(14);
                int i4 = nn3Var.i(13);
                if (i4 <= 6) {
                    i++;
                    ih0Var.f = 0;
                    ih0Var.n(i, false);
                } else {
                    ih0Var.n(i4 - 6, false);
                    i3 += i4;
                }
            }
            i2 = 0;
            i3 = 0;
        } while (i - a2 < 8192);
        return false;
    }

    @Override // defpackage.dv0
    public final void e(long j, long j2) {
        this.k = false;
        this.f2380b.c();
        this.g = j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0090, code lost:            r19.j = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0099, code lost:            throw defpackage.u42.a("Malformed ADTS stream", null);     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bd  */
    @Override // defpackage.dv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(defpackage.ev0 r20, defpackage.lm2 r21) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h8.f(ev0, lm2):int");
    }

    @Override // defpackage.dv0
    public final void i(fv0 fv0Var) {
        this.f = fv0Var;
        this.f2380b.f(fv0Var, new qc3(0, 1));
        fv0Var.j();
    }

    @Override // defpackage.dv0
    public final void release() {
    }
}
