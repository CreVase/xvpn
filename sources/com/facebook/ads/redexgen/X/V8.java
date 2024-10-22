package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class V8 extends C0399Gm {
    public static byte[] A02;
    public final int A00;
    public final Map<String, List<String>> A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 27);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{48, 7, 17, 18, 13, 12, 17, 7, 66, 1, 13, 6, 7, 88, 66};
    }

    public V8(int i, Map<String, List<String>> map, C0395Gg c0395Gg) {
        super(A00(0, 15, 121) + i, c0395Gg, 1);
        this.A00 = i;
        this.A01 = map;
    }
}
