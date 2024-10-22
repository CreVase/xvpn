package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Cx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0313Cx {
    public static byte[] A00;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static W2 A00(InterfaceC0279Bb interfaceC0279Bb) throws IOException, InterruptedException {
        HI.A01(interfaceC0279Bb);
        C0420Hh c0420Hh = new C0420Hh(16);
        if (C0312Cw.A00(interfaceC0279Bb, c0420Hh).A00 != C0436Hx.A08(A01(111, 4, 112))) {
            return null;
        }
        int i = 0;
        interfaceC0279Bb.ADl(c0420Hh.A00, 0, 4);
        c0420Hh.A0Y(0);
        int A08 = c0420Hh.A08();
        int A082 = C0436Hx.A08(A01(195, 4, 13));
        String A01 = A01(199, 15, 13);
        if (A08 != A082) {
            Log.e(A01, A01(115, 25, 27) + A08);
            return null;
        }
        C0312Cw A002 = C0312Cw.A00(interfaceC0279Bb, c0420Hh);
        while (A002.A00 != C0436Hx.A08(A01(218, 4, 32))) {
            interfaceC0279Bb.A3S((int) A002.A01);
            A002 = C0312Cw.A00(interfaceC0279Bb, c0420Hh);
        }
        HI.A04(A002.A01 >= 16);
        interfaceC0279Bb.ADl(c0420Hh.A00, 0, 16);
        c0420Hh.A0Y(0);
        int A0C = c0420Hh.A0C();
        int A0C2 = c0420Hh.A0C();
        int A0B = c0420Hh.A0B();
        int A0B2 = c0420Hh.A0B();
        int A0C3 = c0420Hh.A0C();
        int A0C4 = c0420Hh.A0C();
        int i2 = (A0C2 * A0C4) / 8;
        if (A0C3 != i2) {
            throw new C02309d(A01(57, 26, 48) + i2 + A01(10, 7, 62) + A0C3);
        }
        switch (A0C) {
            case 1:
            case 65534:
                i = C0436Hx.A02(A0C4);
                break;
            case 3:
                if (A0C4 == 32) {
                    i = 4;
                    break;
                }
                break;
            default:
                Log.e(A01, A01(166, 29, 30) + A0C);
                return null;
        }
        if (i == 0) {
            Log.e(A01, A01(140, 26, 101) + A0C4 + A01(0, 10, 35) + A0C);
            return null;
        }
        interfaceC0279Bb.A3S(((int) A002.A01) - 16);
        return new W2(A0C2, A0B, A0B2, A0C3, A0C4, i);
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 36);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{39, 97, 104, 117, 39, 115, 126, 119, 98, 39, 33, 58, 125, 117, 110, 32, 58, 123, 80, 77, 86, 83, 24, 81, 75, 24, 76, 87, 87, 24, 84, 89, 74, 95, 93, 24, 16, 70, 10, Byte.MAX_VALUE, 122, 19, 17, 24, 76, 87, 24, 75, 83, 81, 72, 3, 24, 81, 92, 2, 24, 81, 108, 100, 113, 119, 96, 113, 112, 52, 118, 120, 123, 119, Byte.MAX_VALUE, 52, 117, 120, 125, 115, 122, 121, 113, 122, 96, 46, 52, 103, 73, 64, 65, 92, 71, 64, 73, 14, 91, 64, 69, 64, 65, 89, 64, 14, 121, 111, 120, 14, 77, 70, 91, 64, 69, 20, 14, 6, 29, 18, 18, 106, 81, 76, 74, 79, 79, 80, 77, 75, 90, 91, 31, 109, 118, 121, 121, 31, 89, 80, 77, 82, 94, 75, 5, 31, 20, 47, 50, 52, 49, 49, 46, 51, 53, 36, 37, 97, 22, 0, 23, 97, 35, 40, 53, 97, 37, 36, 49, 53, 41, 97, 111, 84, 73, 79, 74, 74, 85, 72, 78, 95, 94, 26, 109, 123, 108, 26, 92, 85, 72, 87, 91, 78, 26, 78, 67, 74, 95, 0, 26, 126, 104, Byte.MAX_VALUE, 108, 126, 72, 95, 97, 76, 72, 77, 76, 91, 123, 76, 72, 77, 76, 91, 10, 15, 26, 15, 98, 105, 112, 36};
    }

    public static void A03(InterfaceC0279Bb interfaceC0279Bb, W2 w2) throws IOException, InterruptedException {
        HI.A01(interfaceC0279Bb);
        HI.A01(w2);
        interfaceC0279Bb.AEm();
        C0420Hh c0420Hh = new C0420Hh(8);
        C0312Cw A002 = C0312Cw.A00(interfaceC0279Bb, c0420Hh);
        while (A002.A00 != C0436Hx.A08(A01(214, 4, 74))) {
            Log.w(A01(199, 15, 13), A01(83, 28, 10) + A002.A00);
            long j = A002.A01 + 8;
            if (A002.A00 == C0436Hx.A08(A01(111, 4, 112))) {
                j = 12;
            }
            if (j <= 2147483647L) {
                interfaceC0279Bb.AFe((int) j);
                A002 = C0312Cw.A00(interfaceC0279Bb, c0420Hh);
            } else {
                throw new C02309d(A01(17, 40, 28) + A002.A00);
            }
        }
        interfaceC0279Bb.AFe(8);
        w2.A06(interfaceC0279Bb.A7a(), A002.A01);
    }
}
