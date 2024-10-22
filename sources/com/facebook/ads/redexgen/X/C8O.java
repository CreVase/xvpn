package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.8O, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8O {
    public static HashMap<String, String> A00;
    public static byte[] A01;

    static {
        A03();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 101);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{63, 46, 46, 60, 43, 55, 50, 58, 118, 103, 103, 121, 118, 122, 114, 27, 10, 10, 12, 31, 8, 9, 14, 25, 2, 8, 0, 9, 47, 45, 38, 39, 46, 15, 19, 53, 41, 44, 63, 40, 41, 101, 114, 125, 114, 101, 106, 126, 119, 100, 115, 114, 104, 110, 111, 126, 104, 126, 126, 100, 98, 99, 114, 100, 105, 51, 60, 54, 32, 61, 59, 54};
    }

    public static synchronized Map<String, String> A01(C7S c7s) {
        synchronized (C8O.class) {
            if (A00 != null) {
                return new HashMap(A00);
            }
            HashMap<String, String> hashMap = new HashMap<>();
            A00 = hashMap;
            hashMap.put(A00(22, 6, 41), c7s.getPackageName());
            A02(c7s, A00);
            return new HashMap(A00);
        }
    }

    public static synchronized Map<String, String> A02(C7S c7s, Map<String, String> map) {
        synchronized (C8O.class) {
            map.put(A00(41, 3, 83), A00(65, 7, 55));
            map.put(A00(44, 11, 68), c7s.A04().A89());
            map.put(A00(33, 2, 37), c7s.A04().A88());
            map.put(A00(35, 6, 31), AnonymousClass87.A03);
            AnonymousClass87 anonymousClass87 = new AnonymousClass87(c7s);
            map.put(A00(15, 7, 63), anonymousClass87.A06());
            map.put(A00(8, 7, 82), anonymousClass87.A05());
            map.put(A00(0, 8, 27), String.valueOf(anonymousClass87.A04()));
            map.put(A00(28, 5, 7), anonymousClass87.A0A());
            map.put(A00(55, 10, 72), c7s.A08().A02());
        }
        return map;
    }
}
