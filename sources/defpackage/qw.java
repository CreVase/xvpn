package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final class qw extends to2 {
    public final or e;
    public final AtomicReferenceArray f;

    public qw(long j, qw qwVar, or orVar, int i) {
        super(j, qwVar, i);
        this.e = orVar;
        this.f = new AtomicReferenceArray(qr.f4043b * 2);
    }

    @Override // defpackage.to2
    public final int f() {
        return qr.f4043b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x005b, code lost:            m(r7, null);     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x005e, code lost:            if (r1 == false) goto L69;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0060, code lost:            r7 = r5.f3716b;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0062, code lost:            if (r7 == null) goto L70;     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0064, code lost:            r7 = defpackage.t9.s(r7, r0, null);     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0068, code lost:            if (r7 == null) goto L71;     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x006a, code lost:            defpackage.zf3.H(r8, r7);     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x006d, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:            return;     */
    @Override // defpackage.to2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r7, defpackage.t90 r8) {
        /*
            r6 = this;
            int r0 = defpackage.qr.f4043b
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f
            int r2 = r7 * 2
            java.lang.Object r0 = r0.get(r2)
        L12:
            java.lang.Object r2 = r6.k(r7)
            boolean r3 = r2 instanceof defpackage.do3
            r4 = 0
            or r5 = r6.e
            if (r3 != 0) goto L6e
            boolean r3 = r2 instanceof defpackage.eo3
            if (r3 == 0) goto L22
            goto L6e
        L22:
            pq0 r3 = defpackage.qr.j
            if (r2 == r3) goto L5b
            pq0 r3 = defpackage.qr.k
            if (r2 != r3) goto L2b
            goto L5b
        L2b:
            pq0 r3 = defpackage.qr.g
            if (r2 == r3) goto L12
            pq0 r3 = defpackage.qr.f
            if (r2 != r3) goto L34
            goto L12
        L34:
            pq0 r7 = defpackage.qr.i
            if (r2 == r7) goto L5a
            pq0 r7 = defpackage.qr.d
            if (r2 != r7) goto L3d
            goto L5a
        L3d:
            pq0 r7 = defpackage.qr.l
            if (r2 != r7) goto L42
            return
        L42:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected state: "
            r8.<init>(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L5a:
            return
        L5b:
            r6.m(r7, r4)
            if (r1 == 0) goto L6d
            x31 r7 = r5.f3716b
            if (r7 == 0) goto L6d
            j11 r7 = defpackage.t9.s(r7, r0, r4)
            if (r7 == 0) goto L6d
            defpackage.zf3.H(r8, r7)
        L6d:
            return
        L6e:
            if (r1 == 0) goto L73
            pq0 r3 = defpackage.qr.j
            goto L75
        L73:
            pq0 r3 = defpackage.qr.k
        L75:
            boolean r2 = r6.j(r7, r2, r3)
            if (r2 == 0) goto L12
            r6.m(r7, r4)
            r2 = r1 ^ 1
            r6.l(r7, r2)
            if (r1 == 0) goto L92
            x31 r7 = r5.f3716b
            if (r7 == 0) goto L92
            j11 r7 = defpackage.t9.s(r7, r0, r4)
            if (r7 == 0) goto L92
            defpackage.zf3.H(r8, r7)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qw.g(int, t90):void");
    }

    public final boolean j(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f;
        int i2 = (i * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
            if (atomicReferenceArray.get(i2) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i) {
        return this.f.get((i * 2) + 1);
    }

    public final void l(int i, boolean z) {
        if (z) {
            this.e.G((this.c * qr.f4043b) + i);
        }
        h();
    }

    public final void m(int i, Object obj) {
        this.f.lazySet(i * 2, obj);
    }

    public final void n(int i, pq0 pq0Var) {
        this.f.set((i * 2) + 1, pq0Var);
    }
}
