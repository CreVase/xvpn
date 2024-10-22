package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class A6 extends MU {
    public static byte[] A01;
    public final /* synthetic */ TS A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 63);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{72, 87, 90, 91, 81, 119, 80, 74, 91, 76, 77, 74, 87, 74, 95, 82, 123, 72, 91, 80, 74};
    }

    public A6(TS ts) {
        this.A00 = ts;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC02028a
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(AnonymousClass72 anonymousClass72) {
        InterfaceC0531Lt interfaceC0531Lt;
        interfaceC0531Lt = this.A00.A06;
        interfaceC0531Lt.A40(A00(0, 21, 1), anonymousClass72);
    }
}
