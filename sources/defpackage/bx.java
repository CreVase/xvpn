package defpackage;

/* loaded from: classes2.dex */
public final class bx extends zw {
    static {
        new bx((char) 1, (char) 0);
    }

    public final boolean c(char c) {
        if (m20.W(this.f5561a, c) <= 0 && m20.W(c, this.f5562b) <= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:            if (r3 == false) goto L14;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.bx
            r1 = 0
            if (r0 == 0) goto L32
            char r0 = r6.f5561a
            char r2 = r6.f5562b
            int r3 = defpackage.m20.W(r0, r2)
            r4 = 1
            if (r3 <= 0) goto L12
            r3 = 1
            goto L13
        L12:
            r3 = 0
        L13:
            if (r3 == 0) goto L27
            r3 = r7
            bx r3 = (defpackage.bx) r3
            char r5 = r3.f5561a
            char r3 = r3.f5562b
            int r3 = defpackage.m20.W(r5, r3)
            if (r3 <= 0) goto L24
            r3 = 1
            goto L25
        L24:
            r3 = 0
        L25:
            if (r3 != 0) goto L31
        L27:
            bx r7 = (defpackage.bx) r7
            char r3 = r7.f5561a
            if (r0 != r3) goto L32
            char r7 = r7.f5562b
            if (r2 != r7) goto L32
        L31:
            r1 = 1
        L32:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        boolean z;
        char c = this.f5561a;
        char c2 = this.f5562b;
        if (m20.W(c, c2) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return -1;
        }
        return (c * 31) + c2;
    }

    public final String toString() {
        return this.f5561a + ".." + this.f5562b;
    }
}
