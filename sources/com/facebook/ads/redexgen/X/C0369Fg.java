package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Fg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0369Fg {
    public static byte[] A00;
    public static String[] A01 = {"UAa0Z", "y84zlLC7EVblAi9s6IjzDwtWlv", "hWSmc3nAoC6lO20JdXQ8UQAJh4", "HAxIJdFwG2BHjJ6kBVBijNmfixc4v4eM", "sMFPtSIIwmEBUNkX5nfAspCddytOxG7k", "XuEZcwrwjFPAmN9wFCdffjeuCf3K5K0k", "0bJFkLVdjL4ExnLkyIfxNw93FYOhEgu9", "GtmYUKm65Uny9K5bn1TkELKUpeSnjSJ3"};
    public static final int A02;
    public static final int A03;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 55);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{56, 30, 26, 46, 15, 18, 23, 37, 53, 38, 80, 40, 46, 86, 91, 108, 84, 86, 79, 79, 86, 81, 88, 31, 77, 90, 82, 94, 86, 81, 91, 90, 77, 31, 80, 89, 31, 82, 94, 83, 89, 80, 77, 82, 90, 91, 31, 108, 122, 118, 31, 113, 126, 115, 31, 74, 81, 86, 75, 17};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A03(long j, C0420Hh c0420Hh, InterfaceC0288Bm[] interfaceC0288BmArr) {
        while (c0420Hh.A04() > 1) {
            int A002 = A00(c0420Hh);
            int A003 = A00(c0420Hh);
            int A06 = c0420Hh.A06();
            if (A01[3].charAt(16) != 'B') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "sJRWMhzWyXWsYNwcYdMxu9waYeZJW4nD";
            strArr[5] = "JDck5DNLGL8VXNpOftdo1S17ghv9bSuy";
            int i = A06 + A003;
            if (A003 == -1 || A003 > c0420Hh.A04()) {
                Log.w(A01(0, 7, 76), A01(15, 45, 8));
                i = c0420Hh.A07();
            } else if (A002 == 4 && A003 >= 8) {
                int A0E = c0420Hh.A0E();
                int A0I = c0420Hh.A0I();
                int A08 = A0I == 49 ? c0420Hh.A08() : 0;
                int A0E2 = c0420Hh.A0E();
                if (A0I == 47) {
                    c0420Hh.A0Z(1);
                }
                boolean z = A0E == 181 && (A0I == 49 || A0I == 47) && A0E2 == 3;
                if (A0I == 49) {
                    z &= A08 == A03 || A08 == A02;
                }
                if (z) {
                    int A0E3 = c0420Hh.A0E() & 31;
                    c0420Hh.A0Z(1);
                    int i2 = A0E3 * 3;
                    int A062 = c0420Hh.A06();
                    for (InterfaceC0288Bm interfaceC0288Bm : interfaceC0288BmArr) {
                        c0420Hh.A0Y(A062);
                        interfaceC0288Bm.AEr(c0420Hh, i2);
                        interfaceC0288Bm.AEs(j, 1, i2, 0, null);
                    }
                }
            }
            c0420Hh.A0Y(i);
        }
    }

    static {
        A02();
        A03 = C0436Hx.A08(A01(11, 4, 88));
        A02 = C0436Hx.A08(A01(7, 4, 86));
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(com.facebook.ads.redexgen.X.C0420Hh r3) {
        /*
            r2 = 0
        L1:
            int r0 = r3.A04()
            if (r0 != 0) goto L1a
            r3 = -1
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0369Fg.A01
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 5
            if (r1 == r0) goto L24
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L1a:
            int r1 = r3.A0E()
            int r2 = r2 + r1
            r0 = 255(0xff, float:3.57E-43)
            if (r1 == r0) goto L1
            return r2
        L24:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0369Fg.A01
            java.lang.String r1 = "XY7JbweA6fzPXsut6MPl2wkiFN"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "9Cope1RtGoIRUkWui2tRq11YR8"
            r0 = 1
            r2[r0] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0369Fg.A00(com.facebook.ads.redexgen.X.Hh):int");
    }
}
