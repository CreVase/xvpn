package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Oy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0614Oy implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C8C A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 86);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{116, 75, 70, 71, 77, 114, 78, 67, 91, 64, 67, 65, 73, 103, 80, 80, 77, 80};
    }

    public RunnableC0614Oy(C8C c8c) {
        this.A00 = c8c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        P0 p0;
        if (K0.A02(this)) {
            return;
        }
        try {
            p0 = this.A00.A00.A0F;
            p0.ADN(A00(0, 18, 116));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
