package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class KO implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ YA A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 118);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{97, 122, 125, 98, 97, 99, 104, 99, 116, 111, 101};
    }

    public KO(YA ya) {
        this.A00 = ya;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (K0.A02(this)) {
            return;
        }
        try {
            C02007y c02007y = new C02007y(A00(0, 4, 88));
            c02007y.A03(1);
            c02007y.A04(1);
            c02007y.A08(false);
            this.A00.A07().A9N(A00(4, 7, 112), C01997x.A1Y, c02007y);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
