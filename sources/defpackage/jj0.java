package defpackage;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class jj0 extends lj0 implements Comparable {
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final boolean m;

    public jj0(int i, ua3 ua3Var, int i2, gj0 gj0Var, int i3, String str) {
        super(i, i2, ua3Var);
        boolean z;
        boolean z2;
        hb1 hb1Var;
        int i4;
        boolean z3;
        boolean z4;
        boolean z5;
        int i5 = 0;
        this.f = nj0.f(i3, false);
        int i6 = this.d.d & (~gj0Var.u);
        if ((i6 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.g = z;
        if ((i6 & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.h = z2;
        hb1 hb1Var2 = gj0Var.s;
        if (hb1Var2.isEmpty()) {
            hb1Var = hb1.q("");
        } else {
            hb1Var = hb1Var2;
        }
        int i7 = 0;
        while (true) {
            if (i7 < hb1Var.size()) {
                i4 = nj0.e(this.d, (String) hb1Var.get(i7), gj0Var.v);
                if (i4 > 0) {
                    break;
                } else {
                    i7++;
                }
            } else {
                i7 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
        }
        this.i = i7;
        this.j = i4;
        int b2 = nj0.b(this.d.e, gj0Var.t);
        this.k = b2;
        if ((this.d.e & 1088) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.m = z3;
        if (nj0.h(str) == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        int e = nj0.e(this.d, str, z4);
        this.l = e;
        if (i4 <= 0 && ((!hb1Var2.isEmpty() || b2 <= 0) && !this.g && (!this.h || e <= 0))) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (nj0.f(i3, gj0Var.w0) && z5) {
            i5 = 1;
        }
        this.e = i5;
    }

    @Override // defpackage.lj0
    public final int a() {
        return this.e;
    }

    @Override // defpackage.lj0
    public final /* bridge */ /* synthetic */ boolean b(lj0 lj0Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(jj0 jj0Var) {
        w20 c = w20.f4928a.c(this.f, jj0Var.f);
        Integer valueOf = Integer.valueOf(this.i);
        Integer valueOf2 = Integer.valueOf(jj0Var.i);
        Comparator comparator = xy1.f5247a;
        comparator.getClass();
        tk2 tk2Var = tk2.f4523a;
        w20 b2 = c.b(valueOf, valueOf2, tk2Var);
        int i = this.j;
        w20 a2 = b2.a(i, jj0Var.j);
        int i2 = this.k;
        w20 c2 = a2.a(i2, jj0Var.k).c(this.g, jj0Var.g);
        Boolean valueOf3 = Boolean.valueOf(this.h);
        Boolean valueOf4 = Boolean.valueOf(jj0Var.h);
        if (i != 0) {
            comparator = tk2Var;
        }
        w20 a3 = c2.b(valueOf3, valueOf4, comparator).a(this.l, jj0Var.l);
        if (i2 == 0) {
            a3 = a3.d(this.m, jj0Var.m);
        }
        return a3.e();
    }
}
