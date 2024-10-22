package defpackage;

/* loaded from: classes.dex */
public final class oq1 extends gt3 {
    public final boolean l;
    public final z83 m;
    public final y83 n;
    public mq1 o;
    public lq1 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public oq1(fo foVar, boolean z) {
        super(foVar);
        boolean z2;
        if (z && foVar.h()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.l = z2;
        this.m = new z83();
        this.n = new y83();
        a93 f = foVar.f();
        if (f != null) {
            this.o = new mq1(f, null, null);
            this.s = true;
        } else {
            this.o = new mq1(new nq1(foVar.g()), z83.r, mq1.h);
        }
    }

    public final void A(long j) {
        lq1 lq1Var = this.p;
        int b2 = this.o.b(lq1Var.f3173a.f3536a);
        if (b2 == -1) {
            return;
        }
        mq1 mq1Var = this.o;
        y83 y83Var = this.n;
        mq1Var.g(b2, y83Var, false);
        long j2 = y83Var.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        lq1Var.g = j;
    }

    @Override // defpackage.j40, defpackage.fo
    public final void i() {
    }

    @Override // defpackage.fo
    public final void m(lt1 lt1Var) {
        ((lq1) lt1Var).l();
        if (lt1Var == this.p) {
            this.p = null;
        }
    }

    @Override // defpackage.j40, defpackage.fo
    public final void o() {
        this.r = false;
        this.q = false;
        super.o();
    }

    @Override // defpackage.gt3
    public final rt1 w(rt1 rt1Var) {
        Object obj = rt1Var.f3536a;
        Object obj2 = this.o.g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = mq1.h;
        }
        return rt1Var.b(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c8  */
    @Override // defpackage.gt3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(defpackage.a93 r15) {
        /*
            r14 = this;
            boolean r0 = r14.r
            if (r0 == 0) goto L1c
            mq1 r0 = r14.o
            mq1 r1 = new mq1
            java.lang.Object r2 = r0.f
            java.lang.Object r0 = r0.g
            r1.<init>(r15, r2, r0)
            r14.o = r1
            lq1 r15 = r14.p
            if (r15 == 0) goto Lbb
            long r0 = r15.g
            r14.A(r0)
            goto Lbb
        L1c:
            boolean r0 = r15.q()
            if (r0 == 0) goto L40
            boolean r0 = r14.s
            if (r0 == 0) goto L32
            mq1 r0 = r14.o
            mq1 r1 = new mq1
            java.lang.Object r2 = r0.f
            java.lang.Object r0 = r0.g
            r1.<init>(r15, r2, r0)
            goto L3c
        L32:
            java.lang.Object r0 = defpackage.z83.r
            java.lang.Object r1 = defpackage.mq1.h
            mq1 r2 = new mq1
            r2.<init>(r15, r0, r1)
            r1 = r2
        L3c:
            r14.o = r1
            goto Lbb
        L40:
            r0 = 0
            z83 r1 = r14.m
            r15.n(r0, r1)
            long r2 = r1.m
            java.lang.Object r4 = r1.f5444a
            lq1 r5 = r14.p
            if (r5 == 0) goto L6c
            mq1 r6 = r14.o
            rt1 r7 = r5.f3173a
            java.lang.Object r7 = r7.f3536a
            y83 r8 = r14.n
            r6.h(r7, r8)
            long r6 = r8.e
            long r8 = r5.f3174b
            long r6 = r6 + r8
            mq1 r5 = r14.o
            z83 r0 = r5.n(r0, r1)
            long r0 = r0.m
            int r5 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r5 == 0) goto L6c
            r12 = r6
            goto L6d
        L6c:
            r12 = r2
        L6d:
            z83 r9 = r14.m
            y83 r10 = r14.n
            r11 = 0
            r8 = r15
            android.util.Pair r0 = r8.j(r9, r10, r11, r12)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            boolean r0 = r14.s
            if (r0 == 0) goto L91
            mq1 r0 = r14.o
            mq1 r1 = new mq1
            java.lang.Object r4 = r0.f
            java.lang.Object r0 = r0.g
            r1.<init>(r15, r4, r0)
            goto L97
        L91:
            mq1 r0 = new mq1
            r0.<init>(r15, r4, r1)
            r1 = r0
        L97:
            r14.o = r1
            lq1 r15 = r14.p
            if (r15 == 0) goto Lbb
            r14.A(r2)
            rt1 r15 = r15.f3173a
            java.lang.Object r0 = r15.f3536a
            mq1 r1 = r14.o
            java.lang.Object r1 = r1.g
            if (r1 == 0) goto Lb6
            java.lang.Object r1 = defpackage.mq1.h
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Lb6
            mq1 r0 = r14.o
            java.lang.Object r0 = r0.g
        Lb6:
            rt1 r15 = r15.b(r0)
            goto Lbc
        Lbb:
            r15 = 0
        Lbc:
            r0 = 1
            r14.s = r0
            r14.r = r0
            mq1 r0 = r14.o
            r14.l(r0)
            if (r15 == 0) goto Ld0
            lq1 r0 = r14.p
            r0.getClass()
            r0.j(r15)
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oq1.x(a93):void");
    }

    @Override // defpackage.gt3
    public final void y() {
        if (!this.l) {
            this.q = true;
            v(null, this.k);
        }
    }

    @Override // defpackage.fo
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final lq1 a(rt1 rt1Var, cf0 cf0Var, long j) {
        boolean z;
        lq1 lq1Var = new lq1(rt1Var, cf0Var, j);
        if (lq1Var.d == null) {
            z = true;
        } else {
            z = false;
        }
        cp3.m(z);
        fo foVar = this.k;
        lq1Var.d = foVar;
        if (this.r) {
            Object obj = this.o.g;
            Object obj2 = rt1Var.f3536a;
            if (obj != null && obj2.equals(mq1.h)) {
                obj2 = this.o.g;
            }
            lq1Var.j(rt1Var.b(obj2));
        } else {
            this.p = lq1Var;
            if (!this.q) {
                this.q = true;
                v(null, foVar);
            }
        }
        return lq1Var;
    }
}
