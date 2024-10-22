package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Ur, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0762Ur implements R8 {
    public static byte[] A02;
    public final /* synthetic */ Y9 A00;
    public final /* synthetic */ R6 A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 32);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-120, -121, -125, -106, -105, -108, -121, -127, -123, -111, -112, -120, -117, -119};
    }

    public C0762Ur(R6 r6, Y9 y9) {
        this.A01 = r6;
        this.A00 = y9;
    }

    @Override // com.facebook.ads.redexgen.X.R8
    public final void A41() {
        try {
            IP.A0Q(this.A00).A2T(this.A01.A6b().optJSONObject(A00(0, 14, 2)));
        } catch (JSONException e) {
            this.A00.A07().A3Y(e);
        }
    }
}
