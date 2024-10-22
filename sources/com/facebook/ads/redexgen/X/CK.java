package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class CK {
    public static byte[] A00;
    public static String[] A01 = {"bdaFL9zMZ", "I63pCoSBBbO7fDlHhIa7BrZ6Ava1cIF3", "x5nJfB3W8HSDeHix", "yyLZDQNtNFC811gZWNvs8tiPSoT", "kE4kWLsRx96QKHczqOKboI9lp", "rJUZcTDeN", "z735Hr0viTdtcy9jRTmcNapxWooAX9zU", "rl5X7GmnpjWHRCYLou0FtooQfFV"};
    public static final int[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[0].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[3] = "MWn";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 122);
            if (A01[7].length() == 12) {
                throw new RuntimeException();
            }
            A01[7] = "KMAr4";
            i4++;
        }
    }

    public static void A01() {
        A00 = new byte[]{-44, 8, -45, 2, 25, 77, 24, 72, -8, 44, 42, -5, 22, 74, 74, 25, -49, 3, 12, -20, 32, 43, -17, 14, 66, 78, 17, -42, -67, -54, -87, 63, 38, 72, 18, 63, 38, 72, 66, -41, -35, -40, -32, 4, 25, 6, -44, 19, -31, 35, -51, 27, 24, 41, -28, 12, 26, 7, -43, 23, 33, 29, -32, 55, 65, 61, 1, 62, 72, 68, 9, -9, 1, -3, -61, 9, 19, 15, -42, 40, 50, 46, 44, 14, 7, 7, 12, 24, 27, -33, -36, 97, 100, 40, 38, -10, -7, -91, -91};
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ef, code lost:            if (r3 == 1) goto L56;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fd, code lost:            if (com.facebook.ads.redexgen.X.CK.A01[7].length() == 12) goto L88;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ff, code lost:            com.facebook.ads.redexgen.X.CK.A01[7] = "X5YHVW4uSpKOduvkf9RISQBbBxib";        r9.A0Z(4);     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x013d, code lost:            throw new java.lang.RuntimeException();     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0117, code lost:            if (A02(r9.A08()) == false) goto L95;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0119, code lost:            r14 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011a, code lost:            if (r14 != false) goto L70;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011c, code lost:            return false;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010c, code lost:            if (r3 == 1) goto L56;     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a4, code lost:            if (r14 == false) goto L96;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a8, code lost:            if (r17 != r11) goto L97;     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00aa, code lost:            return true;     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:            return r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:            return r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00a3, code lost:            r11 = true;     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A05(com.facebook.ads.redexgen.X.InterfaceC0279Bb r16, boolean r17) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.CK.A05(com.facebook.ads.redexgen.X.Bb, boolean):boolean");
    }

    static {
        A01();
        A02 = new int[]{C0436Hx.A08(A00(79, 4, 69)), C0436Hx.A08(A00(59, 4, 52)), C0436Hx.A08(A00(63, 4, 84)), C0436Hx.A08(A00(67, 4, 91)), C0436Hx.A08(A00(71, 4, 20)), C0436Hx.A08(A00(75, 4, 38)), C0436Hx.A08(A00(43, 4, 41)), C0436Hx.A08(A00(55, 4, 42)), C0436Hx.A08(A00(51, 4, 57)), C0436Hx.A08(A00(87, 4, 49)), C0436Hx.A08(A00(91, 4, 122)), C0436Hx.A08(A00(0, 4, 39)), C0436Hx.A08(A00(4, 4, 108)), C0436Hx.A08(A00(19, 4, 63)), C0436Hx.A08(A00(23, 4, 97)), C0436Hx.A08(A00(8, 4, 75)), C0436Hx.A08(A00(12, 4, 105)), C0436Hx.A08(A00(31, 4, 120)), C0436Hx.A08(A00(27, 4, 15)), C0436Hx.A08(A00(47, 4, 51)), C0436Hx.A08(A00(83, 4, 41)), C0436Hx.A08(A00(35, 4, 120)), C0436Hx.A08(A00(95, 4, 11)), C0436Hx.A08(A00(39, 4, 16))};
    }

    public static boolean A02(int i) {
        if ((i >>> 8) == C0436Hx.A08(A00(16, 3, 34))) {
            return true;
        }
        for (int i2 : A02) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean A03(InterfaceC0279Bb interfaceC0279Bb) throws IOException, InterruptedException {
        return A05(interfaceC0279Bb, true);
    }

    public static boolean A04(InterfaceC0279Bb interfaceC0279Bb) throws IOException, InterruptedException {
        return A05(interfaceC0279Bb, false);
    }
}
