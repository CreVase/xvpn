package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class SX extends K8 {
    public static byte[] A02;
    public final /* synthetic */ OZ A00;
    public final /* synthetic */ AnonymousClass71 A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 46);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{93, 106, 121, 121, 122, 109, 118, 113, 120, 63, 118, 113, 123, 122, 121, 118, 113, 118, 107, 122, 115, 102};
    }

    public SX(OZ oz, AnonymousClass71 anonymousClass71) {
        this.A00 = oz;
        this.A01 = anonymousClass71;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        RX rx;
        RX rx2;
        rx = this.A00.A0D;
        if (rx.getState() == QY.A02) {
            rx2 = this.A00.A0D;
            if (rx2.getCurrentPositionInMillis() == A00()) {
                this.A00.A0I(A00(0, 22, 49));
            }
        }
    }
}
