package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class dj0 extends lj0 implements Comparable {
    public final int e;
    public final boolean f;
    public final String g;
    public final gj0 h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final boolean m;
    public final int n;
    public final int o;
    public final boolean p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final boolean u;
    public final boolean v;

    public dj0(int i, ua3 ua3Var, int i2, gj0 gj0Var, int i3, boolean z, cj0 cj0Var) {
        super(i, i2, ua3Var);
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        boolean z4;
        int i6;
        boolean z5;
        boolean z6;
        boolean z7;
        this.h = gj0Var;
        this.g = nj0.h(this.d.c);
        int i7 = 0;
        this.i = nj0.f(i3, false);
        int i8 = 0;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i8 < gj0Var.n.size()) {
                i5 = nj0.e(this.d, (String) gj0Var.n.get(i8), false);
                if (i5 > 0) {
                    break;
                } else {
                    i8++;
                }
            } else {
                i8 = Integer.MAX_VALUE;
                i5 = 0;
                break;
            }
        }
        this.k = i8;
        this.j = i5;
        this.l = nj0.b(this.d.e, gj0Var.o);
        y01 y01Var = this.d;
        int i9 = y01Var.e;
        if (i9 != 0 && (i9 & 1) == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.m = z2;
        if ((y01Var.d & 1) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.p = z3;
        int i10 = y01Var.y;
        this.q = i10;
        this.r = y01Var.z;
        int i11 = y01Var.h;
        this.s = i11;
        if ((i11 == -1 || i11 <= gj0Var.q) && ((i10 == -1 || i10 <= gj0Var.p) && cj0Var.apply(y01Var))) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f = z4;
        String[] u = wi3.u();
        int i12 = 0;
        while (true) {
            if (i12 < u.length) {
                i6 = nj0.e(this.d, u[i12], false);
                if (i6 > 0) {
                    break;
                } else {
                    i12++;
                }
            } else {
                i12 = Integer.MAX_VALUE;
                i6 = 0;
                break;
            }
        }
        this.n = i12;
        this.o = i6;
        int i13 = 0;
        while (true) {
            hb1 hb1Var = gj0Var.r;
            if (i13 < hb1Var.size()) {
                String str = this.d.l;
                if (str != null && str.equals(hb1Var.get(i13))) {
                    i4 = i13;
                    break;
                }
                i13++;
            } else {
                break;
            }
        }
        this.t = i4;
        if (p71.c(i3) == 128) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.u = z5;
        if (p71.e(i3) == 64) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.v = z6;
        gj0 gj0Var2 = this.h;
        if (nj0.f(i3, gj0Var2.w0) && ((z7 = this.f) || gj0Var2.q0)) {
            i7 = (!nj0.f(i3, false) || !z7 || this.d.h == -1 || gj0Var2.x || gj0Var2.w || (!gj0Var2.y0 && z)) ? 1 : 2;
        }
        this.e = i7;
    }

    @Override // defpackage.lj0
    public final int a() {
        return this.e;
    }

    @Override // defpackage.lj0
    public final boolean b(lj0 lj0Var) {
        int i;
        String str;
        int i2;
        dj0 dj0Var = (dj0) lj0Var;
        gj0 gj0Var = this.h;
        boolean z = gj0Var.t0;
        y01 y01Var = dj0Var.d;
        y01 y01Var2 = this.d;
        if ((z || ((i2 = y01Var2.y) != -1 && i2 == y01Var.y)) && ((gj0Var.r0 || ((str = y01Var2.l) != null && TextUtils.equals(str, y01Var.l))) && (gj0Var.s0 || ((i = y01Var2.z) != -1 && i == y01Var.z)))) {
            if (!gj0Var.u0) {
                if (this.u != dj0Var.u || this.v != dj0Var.v) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(dj0 dj0Var) {
        t32 a2;
        t32 t32Var;
        boolean z = this.i;
        boolean z2 = this.f;
        if (z2 && z) {
            a2 = nj0.i;
        } else {
            a2 = nj0.i.a();
        }
        w20 c = w20.f4928a.c(z, dj0Var.i);
        Integer valueOf = Integer.valueOf(this.k);
        Integer valueOf2 = Integer.valueOf(dj0Var.k);
        xy1.f5247a.getClass();
        tk2 tk2Var = tk2.f4523a;
        w20 b2 = c.b(valueOf, valueOf2, tk2Var).a(this.j, dj0Var.j).a(this.l, dj0Var.l).c(this.p, dj0Var.p).c(this.m, dj0Var.m).b(Integer.valueOf(this.n), Integer.valueOf(dj0Var.n), tk2Var).a(this.o, dj0Var.o).c(z2, dj0Var.f).b(Integer.valueOf(this.t), Integer.valueOf(dj0Var.t), tk2Var);
        int i = this.s;
        Integer valueOf3 = Integer.valueOf(i);
        int i2 = dj0Var.s;
        Integer valueOf4 = Integer.valueOf(i2);
        if (this.h.w) {
            t32Var = nj0.i.a();
        } else {
            t32Var = nj0.j;
        }
        w20 b3 = b2.b(valueOf3, valueOf4, t32Var).c(this.u, dj0Var.u).c(this.v, dj0Var.v).b(Integer.valueOf(this.q), Integer.valueOf(dj0Var.q), a2).b(Integer.valueOf(this.r), Integer.valueOf(dj0Var.r), a2);
        Integer valueOf5 = Integer.valueOf(i);
        Integer valueOf6 = Integer.valueOf(i2);
        if (!wi3.a(this.g, dj0Var.g)) {
            a2 = nj0.j;
        }
        return b3.b(valueOf5, valueOf6, a2).e();
    }
}
