package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Cd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0298Cd {
    public static byte[] A00;
    public static String[] A01 = {"7VlHbmI4sHauhoCWaFlUZM9mZRV70mzp", "LqGkn09UNvdqUAgssIpSCyoRJ1iI6QKK", "ZmFU8Mfu7g0bs6JKYNiQ5l9NQyV6", "IM1BduvbFOrOx4pkelis2wS2axXVXfJJ", "7P5Q", "68Q2Pgf", "FTYWHoYlDOl1N68V4e618z2hAoSaWMYg", "QxGNaBvq4MkZwy6AnQRq9NbnhINTK41p"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C0297Cc A04(C0420Hh c0420Hh) throws C02309d {
        A0A(1, c0420Hh, false);
        long A0K = c0420Hh.A0K();
        int A0E = c0420Hh.A0E();
        long A0K2 = c0420Hh.A0K();
        int A0A = c0420Hh.A0A();
        int A0A2 = c0420Hh.A0A();
        int A0A3 = c0420Hh.A0A();
        int A0E2 = c0420Hh.A0E();
        return new C0297Cc(A0K, A0E, A0K2, A0A, A0A2, A0A3, (int) Math.pow(2.0d, A0E2 & 15), (int) Math.pow(2.0d, (A0E2 & 240) >> 4), (c0420Hh.A0E() & 1) > 0, Arrays.copyOf(c0420Hh.A00, c0420Hh.A07()));
    }

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 2);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{116, 77, 80, 64, 75, 81, 119, 86, 75, 78, 28, 1, 9, 28, 26, 13, 28, 29, 89, 26, 17, 24, 11, 24, 26, 13, 28, 11, 10, 89, 94, 15, 22, 11, 27, 16, 10, 94, 87, 74, 66, 87, 81, 70, 87, 86, 18, 81, 93, 86, 87, 18, 80, 93, 93, 89, 18, 70, 93, 18, 65, 70, 83, 64, 70, 18, 69, 91, 70, 90, 18, 105, 2, 74, 7, 4, 30, 18, 2, 74, 6, 1, 30, 18, 2, 74, 6, 0, 111, 18, 83, 70, 18, 78, 83, 91, 78, 72, 95, 78, 79, 11, 67, 78, 74, 79, 78, 89, 11, 95, 82, 91, 78, 11, 70, 76, 79, 79, 82, 0, 84, 89, 80, 69, 0, 71, 82, 69, 65, 84, 69, 82, 0, 84, 72, 65, 78, 0, 17, 0, 78, 79, 84, 0, 68, 69, 67, 79, 68, 65, 66, 76, 69, 26, 0, 49, 37, 54, 58, 62, 57, 48, 119, 53, 62, 35, 119, 54, 49, 35, 50, 37, 119, 58, 56, 51, 50, 36, 119, 57, 56, 35, 119, 36, 50, 35, 119, 54, 36, 119, 50, 47, 39, 50, 52, 35, 50, 51, 48, 36, 55, 59, 63, 56, 49, 118, 52, 63, 34, 118, 51, 46, 38, 51, 53, 34, 51, 50, 118, 34, 57, 118, 52, 51, 118, 37, 51, 34, 16, 19, 19, 23, 9, 12, 92, 8, 5, 12, 25, 92, 27, 14, 25, 29, 8, 25, 14, 92, 8, 20, 29, 18, 92, 78, 92, 18, 19, 8, 92, 24, 25, 31, 19, 24, 29, 30, 16, 25, 70, 92, 104, 100, 117, 117, 108, 107, 98, 37, 113, 124, 117, 96, 37, 106, 113, 109, 96, 119, 37, 113, 109, 100, 107, 37, 53, 37, 107, 106, 113, 37, 118, 112, 117, 117, 106, 119, 113, 96, 97, 63, 37, 93, 65, 76, 78, 72, 69, 66, 65, 73, 72, 95, 13, 66, 75, 13, 89, 68, 64, 72, 13, 73, 66, 64, 76, 68, 67, 13, 89, 95, 76, 67, 94, 75, 66, 95, 64, 94, 13, 67, 66, 89, 13, 87, 72, 95, 66, 72, 73, 13, 66, 88, 89, 114, 101, 115, 105, 100, 117, 101, 84, 121, 112, 101, 32, 103, 114, 101, 97, 116, 101, 114, 32, 116, 104, 97, 110, 32, 50, 32, 105, 115, 32, 110, 111, 116, 32, 100, 101, 99, 111, 100, 97, 98, 108, 101, 107, 112, 63, 109, 122, 108, 122, 109, 105, 122, 123, 63, 125, 118, 107, 108, 63, 114, 106, 108, 107, 63, 125, 122, 63, 101, 122, 109, 112, 63, 126, 121, 107, 122, 109, 63, 114, 126, 111, 111, 118, 113, 120, 63, 124, 112, 106, 111, 115, 118, 113, 120, 63, 108, 107, 122, 111, 108, 82, 73, 73, 6, 85, 78, 73, 84, 82, 6, 78, 67, 71, 66, 67, 84, 28, 6};
        if (A01[2].length() != 28) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[6] = "mgdhOJqoKNbrHZTmAlzuBC741swozh2A";
        strArr[0] = "We2DdWBOrlseFOiGq0myNglhwb5nF2sN";
    }

    static {
        A06();
    }

    public static int A00(int i) {
        int val = 0;
        while (i > 0) {
            val++;
            i >>>= 1;
        }
        return val;
    }

    public static long A01(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bf, code lost:            if (r12 <= 2) goto L36;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c1, code lost:            if (r12 == 1) goto L38;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c3, code lost:            if (r12 != r0) goto L43;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ea, code lost:            return new com.facebook.ads.redexgen.X.CZ(r9, r10, r11, r12, r13);     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c5, code lost:            r14.A03(32);        r14.A03(32);        r4 = r14.A02(4) + 1;        r14.A03(1);     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d5, code lost:            if (r12 != 1) goto L46;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d7, code lost:            if (r9 == 0) goto L45;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d9, code lost:            r0 = A01(r10, r9);     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00df, code lost:            r0 = (int) (r4 * r0);        r14.A03(r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00eb, code lost:            r0 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ee, code lost:            r0 = r10 * r9;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0116, code lost:            throw new com.facebook.ads.redexgen.X.C02309d(A05(228, 42, 126) + r12);     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f3, code lost:            if (r12 <= 2) goto L36;     */
    /* JADX WARN: Incorrect condition in loop: B:48:0x0083 */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0025 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.CZ A02(com.facebook.ads.redexgen.X.CX r14) throws com.facebook.ads.redexgen.X.C02309d {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0298Cd.A02(com.facebook.ads.redexgen.X.CX):com.facebook.ads.redexgen.X.CZ");
    }

    public static C0296Ca A03(C0420Hh c0420Hh) throws C02309d {
        A0A(3, c0420Hh, false);
        int length = (int) c0420Hh.A0K();
        String A0S = c0420Hh.A0S(length);
        int length2 = A0S.length();
        int i = 7 + 4 + length2;
        long A0K = c0420Hh.A0K();
        int length3 = (int) A0K;
        String[] strArr = new String[length3];
        int i2 = i + 4;
        int i3 = 0;
        while (true) {
            long j = i3;
            if (A01[3].charAt(18) != 'i') {
                throw new RuntimeException();
            }
            A01[5] = "ziwCMa4";
            if (j < A0K) {
                int length4 = (int) c0420Hh.A0K();
                strArr[i3] = c0420Hh.A0S(length4);
                int length5 = strArr[i3].length();
                i2 = i2 + 4 + length5;
                i3++;
            } else {
                int length6 = c0420Hh.A0E();
                if ((length6 & 1) != 0) {
                    return new C0296Ca(A0S, strArr, i2 + 1);
                }
                String vendor = A05(198, 30, 84);
                throw new C02309d(vendor);
            }
        }
    }

    public static void A07(int i, CX cx) throws C02309d {
        int j;
        int A02 = cx.A02(6) + 1;
        for (int i2 = 0; i2 < A02; i2++) {
            int A022 = cx.A02(16);
            switch (A022) {
                case 0:
                    if (cx.A04()) {
                        j = cx.A02(4) + 1;
                    } else {
                        j = 1;
                    }
                    if (cx.A04()) {
                        int i3 = cx.A02(8);
                        int i4 = i3 + 1;
                        for (int i5 = 0; i5 < i4; i5++) {
                            int mappingsCount = i - 1;
                            cx.A03(A00(mappingsCount));
                            int mappingsCount2 = i - 1;
                            cx.A03(A00(mappingsCount2));
                        }
                    }
                    int mappingsCount3 = cx.A02(2);
                    if (mappingsCount3 == 0) {
                        if (j > 1) {
                            for (int i6 = 0; i6 < i; i6++) {
                                cx.A03(4);
                                String[] strArr = A01;
                                String str = strArr[6];
                                String str2 = strArr[0];
                                int charAt = str.charAt(31);
                                int mappingsCount4 = str2.charAt(31);
                                if (charAt == mappingsCount4) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A01;
                                strArr2[6] = "Wlyx46da0LhUJCMQF7d9pJYsMbXYpIdM";
                                strArr2[0] = "HglI0wxUFDuveiNJ2qiTiY5BYhneBiG1";
                            }
                        }
                        for (int mappingsCount5 = 0; mappingsCount5 < j; mappingsCount5++) {
                            cx.A03(8);
                            cx.A03(8);
                            cx.A03(8);
                        }
                        break;
                    } else {
                        throw new C02309d(A05(406, 58, 29));
                    }
                default:
                    Log.e(A05(0, 10, 32), A05(SubsamplingScaleImageView.ORIENTATION_270, 41, 7) + A022);
                    break;
            }
        }
    }

    public static void A08(CX cx) throws C02309d {
        int A02 = cx.A02(6) + 1;
        for (int maximumClass = 0; maximumClass < A02; maximumClass++) {
            int floorType = cx.A02(16);
            switch (floorType) {
                case 0:
                    cx.A03(8);
                    cx.A03(16);
                    cx.A03(16);
                    cx.A03(6);
                    cx.A03(8);
                    int floorCount = cx.A02(4);
                    int floorCount2 = floorCount + 1;
                    for (int i = 0; i < floorCount2; i++) {
                        cx.A03(8);
                    }
                    break;
                case 1:
                    int count = cx.A02(5);
                    int i2 = -1;
                    int[] iArr = new int[count];
                    for (int floorCount3 = 0; floorCount3 < count; floorCount3++) {
                        iArr[floorCount3] = cx.A02(4);
                        if (iArr[floorCount3] > i2) {
                            i2 = iArr[floorCount3];
                        }
                    }
                    int[] iArr2 = new int[i2 + 1];
                    for (int i3 = 0; i3 < iArr2.length; i3++) {
                        iArr2[i3] = cx.A02(3) + 1;
                        int A022 = cx.A02(2);
                        if (A022 > 0) {
                            cx.A03(8);
                        }
                        for (int floorCount4 = 0; floorCount4 < (1 << A022); floorCount4++) {
                            cx.A03(8);
                        }
                    }
                    cx.A03(2);
                    int partitions = cx.A02(4);
                    int i4 = 0;
                    int floorCount5 = 0;
                    for (int i5 = 0; i5 < count; i5++) {
                        i4 += iArr2[iArr[i5]];
                        while (floorCount5 < i4) {
                            cx.A03(partitions);
                            floorCount5++;
                        }
                    }
                    break;
                default:
                    throw new C02309d(A05(114, 41, 34) + floorType);
            }
        }
    }

    public static void A09(CX cx) throws C02309d {
        int A02 = cx.A02(6) + 1;
        for (int i = 0; i < A02; i++) {
            int residueCount = cx.A02(16);
            if (residueCount <= 2) {
                cx.A03(24);
                cx.A03(24);
                cx.A03(24);
                int A022 = cx.A02(6) + 1;
                cx.A03(8);
                int[] iArr = new int[A022];
                for (int i2 = 0; i2 < A022; i2++) {
                    int i3 = 0;
                    int residueCount2 = cx.A02(3);
                    if (cx.A04()) {
                        i3 = cx.A02(5);
                    }
                    iArr[i2] = (i3 * 8) + residueCount2;
                }
                for (int i4 = 0; i4 < A022; i4++) {
                    for (int i5 = 0; i5 < 8; i5++) {
                        int residueCount3 = iArr[i4];
                        if ((residueCount3 & (1 << i5)) != 0) {
                            cx.A03(8);
                        }
                    }
                }
            } else {
                throw new C02309d(A05(363, 43, 2));
            }
        }
    }

    public static boolean A0A(int i, C0420Hh c0420Hh, boolean z) throws C02309d {
        if (c0420Hh.A04() < 7) {
            if (z) {
                return false;
            }
            throw new C02309d(A05(464, 18, 36) + c0420Hh.A04());
        }
        if (c0420Hh.A0E() != i) {
            if (z) {
                return false;
            }
            throw new C02309d(A05(93, 21, 41) + Integer.toHexString(i));
        }
        if (c0420Hh.A0E() != 118 || c0420Hh.A0E() != 111 || c0420Hh.A0E() != 114 || c0420Hh.A0E() != 98 || c0420Hh.A0E() != 105 || c0420Hh.A0E() != 115) {
            if (z) {
                return false;
            }
            throw new C02309d(A05(10, 28, 123));
        }
        return true;
    }

    public static Cb[] A0B(CX cx) {
        int A02 = cx.A02(6) + 1;
        Cb[] cbArr = new Cb[A02];
        for (int windowType = 0; windowType < A02; windowType++) {
            boolean A04 = cx.A04();
            int A022 = cx.A02(16);
            int i = cx.A02(16);
            cbArr[windowType] = new Cb(A04, A022, i, cx.A02(8));
        }
        return cbArr;
    }

    public static Cb[] A0C(C0420Hh c0420Hh, int i) throws C02309d {
        A0A(5, c0420Hh, false);
        int A0E = c0420Hh.A0E() + 1;
        CX cx = new CX(c0420Hh.A00);
        int numberOfBooks = c0420Hh.A06();
        cx.A03(numberOfBooks * 8);
        for (int numberOfBooks2 = 0; numberOfBooks2 < A0E; numberOfBooks2++) {
            A02(cx);
        }
        int numberOfBooks3 = cx.A02(6);
        int timeCount = numberOfBooks3 + 1;
        for (int i2 = 0; i2 < timeCount; i2++) {
            int numberOfBooks4 = cx.A02(16);
            if (numberOfBooks4 != 0) {
                throw new C02309d(A05(311, 52, 47));
            }
        }
        A08(cx);
        A09(cx);
        A07(i, cx);
        Cb[] A0B = A0B(cx);
        if (cx.A04()) {
            return A0B;
        }
        throw new C02309d(A05(155, 43, 85));
    }
}
