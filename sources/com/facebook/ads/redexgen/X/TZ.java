package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class TZ implements InterfaceC0500Km {
    public static byte[] A01;
    public final /* synthetic */ TU A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 97);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{108, 120, 121, 98, 110, 97, 100, 110, 102};
    }

    public TZ(TU tu) {
        this.A00 = tu;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0500Km
    public final void AAv() {
        boolean z;
        boolean z2;
        z = this.A00.A0B;
        if (!z) {
            z2 = this.A00.A09;
            if (!z2) {
                this.A00.A0X(false, A00(0, 9, 108));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0500Km
    public final void ACZ(float f) {
    }
}
