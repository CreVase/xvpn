package defpackage;

/* loaded from: classes2.dex */
public final class io1 extends go1 {
    static {
        new io1(1L, 0L);
    }

    public final boolean c(long j) {
        if (this.f2291a <= j && j <= this.f2292b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:            if (r6 == false) goto L14;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.io1
            r1 = 0
            if (r0 == 0) goto L32
            r0 = 1
            long r2 = r11.f2291a
            long r4 = r11.f2292b
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L10
            r6 = 1
            goto L11
        L10:
            r6 = 0
        L11:
            if (r6 == 0) goto L23
            r6 = r12
            io1 r6 = (defpackage.io1) r6
            long r7 = r6.f2291a
            long r9 = r6.f2292b
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 <= 0) goto L20
            r6 = 1
            goto L21
        L20:
            r6 = 0
        L21:
            if (r6 != 0) goto L31
        L23:
            io1 r12 = (defpackage.io1) r12
            long r6 = r12.f2291a
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 != 0) goto L32
            long r2 = r12.f2292b
            int r12 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r12 != 0) goto L32
        L31:
            r1 = 1
        L32:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        boolean z;
        long j = this.f2291a;
        long j2 = this.f2292b;
        if (j > j2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return -1;
        }
        return (int) ((31 * (j ^ (j >>> 32))) + ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        return this.f2291a + ".." + this.f2292b;
    }
}
