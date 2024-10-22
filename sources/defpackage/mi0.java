package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes.dex */
public final class mi0 {
    public static final mt0 g = new mt0(1);
    public static final Random h = new Random();
    public r52 d;
    public String f;

    /* renamed from: a, reason: collision with root package name */
    public final z83 f3301a = new z83();

    /* renamed from: b, reason: collision with root package name */
    public final y83 f3302b = new y83();
    public final HashMap c = new HashMap();
    public a93 e = a93.f42a;

    public final synchronized void a(wa waVar) {
        r52 r52Var;
        this.f = null;
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            li0 li0Var = (li0) it.next();
            it.remove();
            if (li0Var.e && (r52Var = this.d) != null) {
                ((jt1) r52Var).h(waVar, li0Var.f3131a);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:            if (r16 == r8.f3132b) goto L29;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005f, code lost:            r10 = true;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.li0 b(int r16, defpackage.rt1 r17) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            java.util.HashMap r3 = r0.c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L15:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L80
            java.lang.Object r8 = r4.next()
            li0 r8 = (defpackage.li0) r8
            long r9 = r8.c
            r11 = -1
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto L33
            int r9 = r8.f3132b
            if (r1 != r9) goto L33
            if (r2 == 0) goto L33
            long r9 = r2.d
            r8.c = r9
        L33:
            rt1 r9 = r8.d
            if (r2 != 0) goto L3c
            int r10 = r8.f3132b
            if (r1 != r10) goto L61
            goto L5f
        L3c:
            long r13 = r2.d
            if (r9 != 0) goto L4d
            boolean r10 = r17.a()
            if (r10 != 0) goto L61
            long r11 = r8.c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 != 0) goto L61
            goto L5f
        L4d:
            long r10 = r9.d
            int r12 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r12 != 0) goto L61
            int r10 = r2.f3537b
            int r11 = r9.f3537b
            if (r10 != r11) goto L61
            int r10 = r2.c
            int r11 = r9.c
            if (r10 != r11) goto L61
        L5f:
            r10 = 1
            goto L62
        L61:
            r10 = 0
        L62:
            if (r10 == 0) goto L15
            long r10 = r8.c
            r12 = -1
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L7d
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 >= 0) goto L71
            goto L7d
        L71:
            if (r12 != 0) goto L15
            int r10 = defpackage.wi3.f5017a
            rt1 r10 = r5.d
            if (r10 == 0) goto L15
            if (r9 == 0) goto L15
            r5 = r8
            goto L15
        L7d:
            r5 = r8
            r6 = r10
            goto L15
        L80:
            if (r5 != 0) goto L92
            mt0 r4 = defpackage.mi0.g
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            li0 r5 = new li0
            r5.<init>(r15, r4, r1, r2)
            r3.put(r4, r5)
        L92:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mi0.b(int, rt1):li0");
    }

    public final void c(wa waVar) {
        rt1 rt1Var;
        if (waVar.f4969b.q()) {
            this.f = null;
            return;
        }
        li0 li0Var = (li0) this.c.get(this.f);
        int i = waVar.c;
        rt1 rt1Var2 = waVar.d;
        this.f = b(i, rt1Var2).f3131a;
        d(waVar);
        if (rt1Var2 != null && rt1Var2.a()) {
            long j = rt1Var2.d;
            if (li0Var == null || li0Var.c != j || (rt1Var = li0Var.d) == null || rt1Var.f3537b != rt1Var2.f3537b || rt1Var.c != rt1Var2.c) {
                b(i, new rt1(rt1Var2.f3536a, j));
                this.d.getClass();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0034, code lost:            if (r1.d < r3) goto L18;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void d(defpackage.wa r9) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mi0.d(wa):void");
    }

    public final synchronized void e(wa waVar, int i) {
        boolean z;
        this.d.getClass();
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            li0 li0Var = (li0) it.next();
            if (li0Var.a(waVar)) {
                it.remove();
                if (li0Var.e) {
                    boolean equals = li0Var.f3131a.equals(this.f);
                    if (z && equals) {
                        boolean z2 = li0Var.f;
                    }
                    if (equals) {
                        this.f = null;
                    }
                    ((jt1) this.d).h(waVar, li0Var.f3131a);
                }
            }
        }
        c(waVar);
    }
}
