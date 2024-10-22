package defpackage;

/* loaded from: classes2.dex */
public abstract class g23 extends f23 {
    public static final void O0(String str) {
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0027, code lost:            if (r3 == '+') goto L17;     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Integer P0(java.lang.String r10) {
        /*
            r0 = 10
            defpackage.fl.p(r0)
            int r1 = r10.length()
            if (r1 != 0) goto Lc
            goto L51
        Lc:
            r2 = 0
            char r3 = r10.charAt(r2)
            r4 = 48
            int r4 = defpackage.m20.W(r3, r4)
            if (r4 >= 0) goto L2a
            r4 = 1
            if (r1 != r4) goto L1d
            goto L51
        L1d:
            r5 = 45
            if (r3 != r5) goto L25
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 1
            goto L2f
        L25:
            r5 = 43
            if (r3 != r5) goto L51
            goto L2b
        L2a:
            r4 = 0
        L2b:
            r3 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            r5 = 0
        L2f:
            r6 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r7 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
        L35:
            if (r4 >= r1) goto L57
            char r8 = r10.charAt(r4)
            int r8 = java.lang.Character.digit(r8, r0)
            if (r8 >= 0) goto L42
            goto L51
        L42:
            if (r2 >= r7) goto L4b
            if (r7 != r6) goto L51
            int r7 = r3 / 10
            if (r2 >= r7) goto L4b
            goto L51
        L4b:
            int r2 = r2 * 10
            int r9 = r3 + r8
            if (r2 >= r9) goto L53
        L51:
            r10 = 0
            goto L63
        L53:
            int r2 = r2 - r8
            int r4 = r4 + 1
            goto L35
        L57:
            if (r5 == 0) goto L5e
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            goto L63
        L5e:
            int r10 = -r2
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
        L63:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g23.P0(java.lang.String):java.lang.Integer");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x002a, code lost:            if (r4 == '+') goto L17;     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Long Q0(java.lang.String r18) {
        /*
            r0 = r18
            r1 = 10
            defpackage.fl.p(r1)
            int r2 = r18.length()
            if (r2 != 0) goto Le
            goto L62
        Le:
            r3 = 0
            char r4 = r0.charAt(r3)
            r5 = 48
            int r5 = defpackage.m20.W(r4, r5)
            if (r5 >= 0) goto L2d
            r5 = 1
            if (r2 != r5) goto L1f
            goto L62
        L1f:
            r6 = 45
            if (r4 != r6) goto L28
            r3 = -9223372036854775808
            r6 = r3
            r3 = 1
            goto L33
        L28:
            r6 = 43
            if (r4 != r6) goto L62
            goto L2e
        L2d:
            r5 = 0
        L2e:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L33:
            r8 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r10 = 0
            r12 = r8
        L3b:
            if (r5 >= r2) goto L68
            char r4 = r0.charAt(r5)
            int r4 = java.lang.Character.digit(r4, r1)
            if (r4 >= 0) goto L48
            goto L62
        L48:
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 >= 0) goto L58
            int r14 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r14 != 0) goto L62
            long r12 = (long) r1
            long r12 = r6 / r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 >= 0) goto L58
            goto L62
        L58:
            long r14 = (long) r1
            long r10 = r10 * r14
            long r14 = (long) r4
            long r16 = r6 + r14
            int r4 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r4 >= 0) goto L64
        L62:
            r0 = 0
            goto L74
        L64:
            long r10 = r10 - r14
            int r5 = r5 + 1
            goto L3b
        L68:
            if (r3 == 0) goto L6f
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            goto L74
        L6f:
            long r0 = -r10
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g23.Q0(java.lang.String):java.lang.Long");
    }
}
