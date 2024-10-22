package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashSet;

/* renamed from: com.facebook.ads.redexgen.X.9U, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9U {
    public static String A00;
    public static byte[] A01;
    public static final HashSet<String> A02;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 50);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-15, -7, -7, -15, -72, -17, 2, -7, -72, -19, -7, -4, -17};
    }

    static {
        A02();
        A02 = new HashSet<>();
        A00 = A01(0, 13, 88);
    }

    public static synchronized String A00() {
        String str;
        synchronized (C9U.class) {
            str = A00;
        }
        return str;
    }
}
