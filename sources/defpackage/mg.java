package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class mg {
    public lg d;

    /* renamed from: a, reason: collision with root package name */
    public ix2 f3286a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f3287b = 0.0f;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public mg(wq2 wq2Var) {
        this.d = new hg(this, wq2Var);
    }

    public final void a(ok1 ok1Var, int i) {
        this.d.k(ok1Var.j(i), 1.0f);
        this.d.k(ok1Var.j(i), -1.0f);
    }

    public final void b(ix2 ix2Var, ix2 ix2Var2, ix2 ix2Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f3287b = i;
        }
        if (!z) {
            this.d.k(ix2Var, -1.0f);
            this.d.k(ix2Var2, 1.0f);
            this.d.k(ix2Var3, 1.0f);
        } else {
            this.d.k(ix2Var, 1.0f);
            this.d.k(ix2Var2, -1.0f);
            this.d.k(ix2Var3, -1.0f);
        }
    }

    public final void c(ix2 ix2Var, ix2 ix2Var2, ix2 ix2Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f3287b = i;
        }
        if (!z) {
            this.d.k(ix2Var, -1.0f);
            this.d.k(ix2Var2, 1.0f);
            this.d.k(ix2Var3, -1.0f);
        } else {
            this.d.k(ix2Var, 1.0f);
            this.d.k(ix2Var2, -1.0f);
            this.d.k(ix2Var3, 1.0f);
        }
    }

    public ix2 d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        if (this.f3286a == null && this.f3287b == 0.0f && this.d.c() == 0) {
            return true;
        }
        return false;
    }

    public final ix2 f(boolean[] zArr, ix2 ix2Var) {
        int i;
        int c = this.d.c();
        ix2 ix2Var2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < c; i2++) {
            float g = this.d.g(i2);
            if (g < 0.0f) {
                ix2 d = this.d.d(i2);
                if ((zArr == null || !zArr[d.f2671b]) && d != ix2Var && (((i = d.l) == 3 || i == 4) && g < f)) {
                    f = g;
                    ix2Var2 = d;
                }
            }
        }
        return ix2Var2;
    }

    public final void g(ix2 ix2Var) {
        ix2 ix2Var2 = this.f3286a;
        if (ix2Var2 != null) {
            this.d.k(ix2Var2, -1.0f);
            this.f3286a.c = -1;
            this.f3286a = null;
        }
        float h = this.d.h(ix2Var, true) * (-1.0f);
        this.f3286a = ix2Var;
        if (h == 1.0f) {
            return;
        }
        this.f3287b /= h;
        this.d.j(h);
    }

    public final void h(ok1 ok1Var, ix2 ix2Var, boolean z) {
        if (ix2Var != null && ix2Var.f) {
            float a2 = this.d.a(ix2Var);
            this.f3287b = (ix2Var.e * a2) + this.f3287b;
            this.d.h(ix2Var, z);
            if (z) {
                ix2Var.b(this);
            }
            if (this.d.c() == 0) {
                this.e = true;
                ok1Var.f3683a = true;
            }
        }
    }

    public void i(ok1 ok1Var, mg mgVar, boolean z) {
        float i = this.d.i(mgVar, z);
        this.f3287b = (mgVar.f3287b * i) + this.f3287b;
        if (z) {
            mgVar.f3286a.b(this);
        }
        if (this.f3286a != null && this.d.c() == 0) {
            this.e = true;
            ok1Var.f3683a = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r8 = this;
            ix2 r0 = r8.f3286a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            ix2 r1 = r8.f3286a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = defpackage.p71.l(r0, r1)
            float r1 = r8.f3287b
            r2 = 0
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L34
            java.lang.StringBuilder r0 = defpackage.p71.n(r0)
            float r1 = r8.f3287b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 1
            goto L35
        L34:
            r1 = 0
        L35:
            lg r4 = r8.d
            int r4 = r4.c()
        L3b:
            if (r2 >= r4) goto L9b
            lg r5 = r8.d
            ix2 r5 = r5.d(r2)
            if (r5 != 0) goto L46
            goto L98
        L46:
            lg r6 = r8.d
            float r6 = r6.g(r2)
            int r7 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r7 != 0) goto L51
            goto L98
        L51:
            java.lang.String r5 = r5.toString()
            if (r1 != 0) goto L62
            int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r1 >= 0) goto L75
            java.lang.String r1 = "- "
            java.lang.String r0 = defpackage.p71.l(r0, r1)
            goto L71
        L62:
            if (r7 <= 0) goto L6b
            java.lang.String r1 = " + "
            java.lang.String r0 = defpackage.p71.l(r0, r1)
            goto L75
        L6b:
            java.lang.String r1 = " - "
            java.lang.String r0 = defpackage.p71.l(r0, r1)
        L71:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r6 = r6 * r1
        L75:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto L80
            java.lang.String r0 = defpackage.p71.l(r0, r5)
            goto L97
        L80:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
        L97:
            r1 = 1
        L98:
            int r2 = r2 + 1
            goto L3b
        L9b:
            if (r1 != 0) goto La3
            java.lang.String r1 = "0.0"
            java.lang.String r0 = defpackage.p71.l(r0, r1)
        La3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mg.toString():java.lang.String");
    }
}
