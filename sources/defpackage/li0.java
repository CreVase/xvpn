package defpackage;

/* loaded from: classes.dex */
public final class li0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3131a;

    /* renamed from: b, reason: collision with root package name */
    public int f3132b;
    public long c;
    public final rt1 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ mi0 g;

    public li0(mi0 mi0Var, String str, int i, rt1 rt1Var) {
        long j;
        this.g = mi0Var;
        this.f3131a = str;
        this.f3132b = i;
        if (rt1Var == null) {
            j = -1;
        } else {
            j = rt1Var.d;
        }
        this.c = j;
        if (rt1Var != null && rt1Var.a()) {
            this.d = rt1Var;
        }
    }

    public final boolean a(wa waVar) {
        rt1 rt1Var = waVar.d;
        if (rt1Var == null) {
            if (this.f3132b != waVar.c) {
                return true;
            }
            return false;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (rt1Var.d > j) {
            return true;
        }
        rt1 rt1Var2 = this.d;
        if (rt1Var2 == null) {
            return false;
        }
        a93 a93Var = waVar.f4969b;
        int b2 = a93Var.b(rt1Var.f3536a);
        int b3 = a93Var.b(rt1Var2.f3536a);
        if (rt1Var.d < rt1Var2.d || b2 < b3) {
            return false;
        }
        if (b2 > b3) {
            return true;
        }
        boolean a2 = rt1Var.a();
        int i = rt1Var2.f3537b;
        if (a2) {
            int i2 = rt1Var.f3537b;
            if (i2 > i) {
                return true;
            }
            if (i2 == i) {
                if (rt1Var.c > rt1Var2.c) {
                    return true;
                }
            }
            return false;
        }
        int i3 = rt1Var.e;
        if (i3 == -1 || i3 > i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:            if (r0 < r8.p()) goto L15;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(defpackage.a93 r7, defpackage.a93 r8) {
        /*
            r6 = this;
            int r0 = r6.f3132b
            int r1 = r7.p()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L13
            int r7 = r8.p()
            if (r0 >= r7) goto L11
            goto L38
        L11:
            r0 = -1
            goto L38
        L13:
            mi0 r1 = r6.g
            z83 r4 = r1.f3301a
            r7.n(r0, r4)
            z83 r0 = r1.f3301a
            int r4 = r0.o
        L1e:
            int r5 = r0.p
            if (r4 > r5) goto L11
            java.lang.Object r5 = r7.m(r4)
            int r5 = r8.b(r5)
            if (r5 == r3) goto L35
            y83 r7 = r1.f3302b
            y83 r7 = r8.g(r5, r7, r2)
            int r0 = r7.c
            goto L38
        L35:
            int r4 = r4 + 1
            goto L1e
        L38:
            r6.f3132b = r0
            if (r0 != r3) goto L3d
            return r2
        L3d:
            r7 = 1
            rt1 r0 = r6.d
            if (r0 != 0) goto L43
            return r7
        L43:
            java.lang.Object r0 = r0.f3536a
            int r8 = r8.b(r0)
            if (r8 == r3) goto L4c
            r2 = 1
        L4c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.li0.b(a93, a93):boolean");
    }
}
