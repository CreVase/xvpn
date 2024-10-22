package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class SY extends K8 {
    public static byte[] A01;
    public final /* synthetic */ OZ A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 80);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-78, -59, -64, -63, -53, 124, -45, -67, -49, 124, -54, -63, -46, -63, -50, 124, -52, -50, -63, -52, -67, -50, -63, -64};
    }

    public SY(OZ oz) {
        this.A00 = oz;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        boolean z;
        z = this.A00.A03;
        if (!z) {
            this.A00.A0I(A00(0, 24, 12));
        }
    }
}
