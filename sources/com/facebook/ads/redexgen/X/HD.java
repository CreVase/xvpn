package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class HD {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 99);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{64, 93, 74, 122, 73, 64, 75, 10, 23, 0, 48, 29, 10, 11, 6, 29};
    }

    public static long A00(HC hc) {
        return hc.A5l(A02(0, 7, 70), -1L);
    }

    public static Uri A01(HC hc) {
        String A5n = hc.A5n(A02(7, 9, 12), null);
        if (A5n == null) {
            return null;
        }
        return Uri.parse(A5n);
    }

    public static void A04(HE he) {
        he.A01(A02(7, 9, 12));
    }

    public static void A05(HE he, long j) {
        he.A02(A02(0, 7, 70), j);
    }

    public static void A06(HE he, Uri uri) {
        he.A03(A02(7, 9, 12), uri.toString());
    }
}
