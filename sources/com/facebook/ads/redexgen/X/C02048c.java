package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02048c {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 51);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-2, -15, -17, -5, -2, -16, -21, -16, -19, 0, -19, -18, -19, -1, -15};
    }

    public static InterfaceC02068e A00(Y9 y9) {
        try {
            return new C0820Xa(y9);
        } catch (IOException e) {
            y9.A07().A9M(A02(0, 15, 89), C01997x.A2J, new C02007y(e));
            return new C0823Xd();
        }
    }

    public static C0323Dm A01(Y9 y9) {
        return new C0323Dm(y9);
    }
}
