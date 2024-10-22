package defpackage;

/* loaded from: classes.dex */
public final class gp extends ve0 {
    public long j;
    public int k;
    public int l;

    public gp() {
        super(2);
        this.l = 32;
    }

    @Override // defpackage.ve0
    public final void i() {
        super.i();
        this.k = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:            if ((r0.remaining() + r3.position()) > 3072000) goto L20;     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(defpackage.ve0 r5) {
        /*
            r4 = this;
            r0 = 1073741824(0x40000000, float:2.0)
            boolean r0 = r5.g(r0)
            r1 = 1
            r0 = r0 ^ r1
            defpackage.cp3.e(r0)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            boolean r0 = r5.g(r0)
            r0 = r0 ^ r1
            defpackage.cp3.e(r0)
            r0 = 4
            boolean r0 = r5.g(r0)
            r0 = r0 ^ r1
            defpackage.cp3.e(r0)
            int r0 = r4.k
            r2 = 0
            if (r0 <= 0) goto L25
            r3 = 1
            goto L26
        L25:
            r3 = 0
        L26:
            if (r3 != 0) goto L29
            goto L51
        L29:
            int r3 = r4.l
            if (r0 < r3) goto L2e
            goto L4f
        L2e:
            boolean r0 = r5.h()
            boolean r3 = r4.h()
            if (r0 == r3) goto L39
            goto L4f
        L39:
            java.nio.ByteBuffer r0 = r5.d
            if (r0 == 0) goto L51
            java.nio.ByteBuffer r3 = r4.d
            if (r3 == 0) goto L51
            int r3 = r3.position()
            int r0 = r0.remaining()
            int r0 = r0 + r3
            r3 = 3072000(0x2ee000, float:4.304789E-39)
            if (r0 <= r3) goto L51
        L4f:
            r0 = 0
            goto L52
        L51:
            r0 = 1
        L52:
            if (r0 != 0) goto L55
            return r2
        L55:
            int r0 = r4.k
            int r2 = r0 + 1
            r4.k = r2
            if (r0 != 0) goto L69
            long r2 = r5.f
            r4.f = r2
            boolean r0 = r5.g(r1)
            if (r0 == 0) goto L69
            r4.f3342b = r1
        L69:
            boolean r0 = r5.h()
            if (r0 == 0) goto L73
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4.f3342b = r0
        L73:
            java.nio.ByteBuffer r0 = r5.d
            if (r0 == 0) goto L83
            int r2 = r0.remaining()
            r4.k(r2)
            java.nio.ByteBuffer r2 = r4.d
            r2.put(r0)
        L83:
            long r2 = r5.f
            r4.j = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gp.m(ve0):boolean");
    }
}
