package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class AI extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 103);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{35, 75, 121, 47, 35, 68, 7, 12, 5, 10, 10, 1, 8, 23, 68, 13, 10, 68, 1, 10, 7, 11, 0, 13, 10, 3, 68, 18, 41, 47, 38, 41, 35, 43, 34, 35, 103, 33, 40, 53, 42, 38, 51, 125, 103};
    }

    public AI(int i, int i2, int i3) {
        super(A00(27, 18, 32) + i + A00(0, 5, 100) + i2 + A00(5, 22, 3) + i3);
    }
}
