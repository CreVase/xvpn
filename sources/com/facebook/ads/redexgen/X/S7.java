package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class S7 extends K8 {
    public static byte[] A02;
    public final /* synthetic */ C7K A00;
    public final /* synthetic */ AnonymousClass71 A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-126, -75, -90, -90, -91, -78, -87, -82, -89, 96, -87, -82, -92, -91, -90, -87, -82, -87, -76, -91, -84, -71};
    }

    public S7(C7K c7k, AnonymousClass71 anonymousClass71) {
        this.A00 = c7k;
        this.A01 = anonymousClass71;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        RX rx;
        RX rx2;
        rx = this.A00.A0B;
        if (rx.getState() == QY.A02) {
            rx2 = this.A00.A0B;
            if (rx2.getCurrentPositionInMillis() == A00()) {
                this.A00.A0G(A00(0, 22, 11));
            }
        }
    }
}
