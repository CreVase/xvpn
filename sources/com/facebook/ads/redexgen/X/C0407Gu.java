package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Gu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0407Gu extends IOException {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 21);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{94, 68, -86, -61, -70, -51, -59, -70, -72, -55, -70, -71, 117};
    }

    public C0407Gu(Throwable th) {
        super(A00(2, 11, 64) + th.getClass().getSimpleName() + A00(0, 2, 15) + th.getMessage(), th);
    }
}
