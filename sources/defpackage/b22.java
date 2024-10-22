package defpackage;

/* loaded from: classes.dex */
public final class b22 implements dv0 {

    /* renamed from: a, reason: collision with root package name */
    public fv0 f388a;

    /* renamed from: b, reason: collision with root package name */
    public r13 f389b;
    public boolean c;

    public final boolean a(ev0 ev0Var) {
        boolean z;
        boolean z2;
        c22 c22Var = new c22();
        if (c22Var.a(ev0Var, true) && (c22Var.f570a & 2) == 2) {
            int min = Math.min(c22Var.e, 8);
            r42 r42Var = new r42(min);
            ev0Var.b(0, r42Var.f4098a, min);
            r42Var.G(0);
            if (r42Var.c - r42Var.f4099b >= 5 && r42Var.v() == 127 && r42Var.w() == 1179402563) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f389b = new sy0();
            } else {
                r42Var.G(0);
                try {
                    z2 = sn3.c(1, r42Var, true);
                } catch (u42 unused) {
                    z2 = false;
                }
                if (z2) {
                    this.f389b = new pn3();
                } else {
                    r42Var.G(0);
                    if (s32.e(r42Var, s32.o)) {
                        this.f389b = new s32();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.dv0
    public final boolean d(ev0 ev0Var) {
        try {
            return a(ev0Var);
        } catch (u42 unused) {
            return false;
        }
    }

    @Override // defpackage.dv0
    public final void e(long j, long j2) {
        r13 r13Var = this.f389b;
        if (r13Var != null) {
            tp tpVar = r13Var.f4089a;
            c22 c22Var = tpVar.d;
            c22Var.f570a = 0;
            c22Var.f571b = 0L;
            c22Var.c = 0;
            c22Var.d = 0;
            c22Var.e = 0;
            tpVar.e.D(0);
            tpVar.f4554a = -1;
            tpVar.c = false;
            if (j == 0) {
                r13Var.d(!r13Var.l);
                return;
            }
            if (r13Var.h != 0) {
                long j3 = (r13Var.i * j2) / 1000000;
                r13Var.e = j3;
                d22 d22Var = r13Var.d;
                int i = wi3.f5017a;
                d22Var.m(j3);
                r13Var.h = 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.dv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(defpackage.ev0 r21, defpackage.lm2 r22) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b22.f(ev0, lm2):int");
    }

    @Override // defpackage.dv0
    public final void i(fv0 fv0Var) {
        this.f388a = fv0Var;
    }

    @Override // defpackage.dv0
    public final void release() {
    }
}
