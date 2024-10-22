package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0839Xt implements KE {
    public static byte[] A01;
    public final /* synthetic */ Y9 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 15);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{68, 64, 67, 119, 102, 107, 103, 108, 97, 103, 76, 103, 118, 117, 109, 112, 105, 15, 52, 63, 34, 42, 63, 57, 46, 63, 62, 122, 63, 40, 40, 53, 40, 116, 121, 104, 123, 105, 114, 69, 105, 114, 115, Byte.MAX_VALUE, 118, 126};
    }

    public C0839Xt(Y9 y9) {
        this.A00 = y9;
    }

    @Override // com.facebook.ads.redexgen.X.KE
    public final void A9E(int i, Throwable th) {
        Log.e(A00(0, 17, 13), A00(17, 17, 85), th);
        this.A00.A07().A9M(A00(34, 12, 21), i, new C02007y(th));
    }
}
