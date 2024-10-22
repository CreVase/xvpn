package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class S4 extends K8 {
    public static byte[] A01;
    public final /* synthetic */ C7K A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{100, 91, 86, 87, 93, 18, 69, 83, 65, 18, 92, 87, 68, 87, 64, 18, 66, 64, 87, 66, 83, 64, 87, 86};
    }

    public S4(C7K c7k) {
        this.A00 = c7k;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        boolean z;
        z = this.A00.A07;
        if (!z) {
            this.A00.A0G(A00(0, 24, 76));
        }
    }
}
