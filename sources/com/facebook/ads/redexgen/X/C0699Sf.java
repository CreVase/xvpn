package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Sf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0699Sf implements OY {
    public static byte[] A01;
    public final /* synthetic */ AnonymousClass96 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 23);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-49, -53, -64, -40};
    }

    public C0699Sf(AnonymousClass96 anonymousClass96) {
        this.A00 = anonymousClass96;
    }

    @Override // com.facebook.ads.redexgen.X.OY
    public final void ADO(String str, JSONObject jSONObject) {
        C0597Oh c0597Oh;
        YA ya;
        YA ya2;
        if (str.equals(A00(0, 4, 72))) {
            this.A00.AFn();
            ya = this.A00.A07;
            if (IP.A1X(ya)) {
                ya2 = this.A00.A07;
                ya2.A0A().AB1();
            }
        }
        c0597Oh = this.A00.A0F;
        c0597Oh.A0h(str, jSONObject);
    }
}
