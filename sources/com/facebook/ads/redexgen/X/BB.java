package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.UUID;

/* loaded from: assets/audience_network.dex */
public final class BB extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 127);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{47, 7, 6, 11, 3, 66, 6, 13, 7, 17, 66, 12, 13, 22, 66, 17, 23, 18, 18, 13, 16, 22, 66, 23, 23, 11, 6, 88, 66};
    }

    public BB(UUID uuid) {
        super(A00(0, 29, 29) + uuid);
    }
}
