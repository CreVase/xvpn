package defpackage;

/* loaded from: classes.dex */
public abstract class pp3 implements lk0 {

    /* renamed from: a, reason: collision with root package name */
    public int f3894a;

    /* renamed from: b, reason: collision with root package name */
    public r70 f3895b;
    public sl2 c;
    public int d;
    public final ml0 e = new ml0(this);
    public int f = 0;
    public boolean g = false;
    public final qk0 h = new qk0(this);
    public final qk0 i = new qk0(this);
    public int j = 1;

    public pp3(r70 r70Var) {
        this.f3895b = r70Var;
    }

    public static void b(qk0 qk0Var, qk0 qk0Var2, int i) {
        qk0Var.l.add(qk0Var2);
        qk0Var.f = i;
        qk0Var2.k.add(qk0Var);
    }

    public static qk0 h(z60 z60Var) {
        z60 z60Var2 = z60Var.f;
        if (z60Var2 == null) {
            return null;
        }
        int ordinal = z60Var2.e.ordinal();
        r70 r70Var = z60Var2.d;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            return null;
                        }
                        return r70Var.e.k;
                    }
                    return r70Var.e.i;
                }
                return r70Var.d.i;
            }
            return r70Var.e.h;
        }
        return r70Var.d.h;
    }

    public static qk0 i(z60 z60Var, int i) {
        pp3 pp3Var;
        z60 z60Var2 = z60Var.f;
        if (z60Var2 == null) {
            return null;
        }
        r70 r70Var = z60Var2.d;
        if (i == 0) {
            pp3Var = r70Var.d;
        } else {
            pp3Var = r70Var.e;
        }
        int ordinal = z60Var2.e.ordinal();
        if (ordinal != 1 && ordinal != 2) {
            if (ordinal != 3 && ordinal != 4) {
                return null;
            }
            return pp3Var.i;
        }
        return pp3Var.h;
    }

    public final void c(qk0 qk0Var, qk0 qk0Var2, int i, ml0 ml0Var) {
        qk0Var.l.add(qk0Var2);
        qk0Var.l.add(this.e);
        qk0Var.h = i;
        qk0Var.i = ml0Var;
        qk0Var2.k.add(qk0Var);
        ml0Var.k.add(qk0Var);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            r70 r70Var = this.f3895b;
            int i3 = r70Var.v;
            max = Math.max(r70Var.u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            r70 r70Var2 = this.f3895b;
            int i4 = r70Var2.y;
            max = Math.max(r70Var2.x, i);
            if (i4 > 0) {
                max = Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    public long j() {
        if (this.e.j) {
            return r0.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:            if (r9.f3894a == 3) goto L50;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(defpackage.z60 r12, defpackage.z60 r13, int r14) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pp3.l(z60, z60, int):void");
    }
}
