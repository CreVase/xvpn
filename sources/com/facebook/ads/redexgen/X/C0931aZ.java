package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0931aZ extends K8 {
    public static byte[] A01;
    public final /* synthetic */ C0930aY A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 95);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-20, -29, -8, -29, -11, -27, -12, -21, -14, -10, -68};
    }

    public C0931aZ(C0930aY c0930aY) {
        this.A00 = c0930aY;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        YA ya;
        NB nb;
        C0932aa c0932aa;
        ya = this.A00.A02;
        ya.A0E().AGJ();
        nb = this.A00.A04;
        StringBuilder append = new StringBuilder().append(A00(0, 11, 35));
        c0932aa = this.A00.A00;
        nb.loadUrl(append.append(c0932aa.A03()).toString());
    }
}
