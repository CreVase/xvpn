package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Ez, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0362Ez extends AbstractC0924aS {
    public static byte[] A00 = null;
    public static String[] A01 = {"jMc", "F9KJU5nWCxEJfH1MtrJPQ98rlg2xhqhb", "7jNlYgKw34wypv3TsOCVRM97qni1IFkS", "W5gvHzH3tQhCbbf1Q7sr07NWbFeRHxz0", "QDsxhdyObZs2LD8uuSUlwesP8VUImdt4", "RqkZZA1TQwwc7Sj8gFRGBwQRvCLKOG1p", "3", "FXFS7BhAGvbRYPXLgdilxhgSLH2Ol13Z"};
    public static final long serialVersionUID = 5751287062553772012L;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[0].length() == 16) {
                throw new RuntimeException();
            }
            A01[0] = "basKOcZiobbMvO07tra14WeVIAzrAzDF";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 105);
            i4++;
        }
    }

    public static void A04() {
        A00 = new byte[]{5, -8, 11, 0, 13, -4};
    }

    static {
        A04();
    }

    public C0362Ez(List<C1D> list) {
        super(list);
    }

    public static C0362Ez A02(JSONObject jSONObject, YA ya) {
        C0362Ez c0362Ez = new C0362Ez(AbstractC0924aS.A08(jSONObject, ya, new C0920aO()));
        c0362Ez.A15(jSONObject);
        c0362Ez.A0Z(A03(0, 6, 46));
        return c0362Ez;
    }

    @Override // com.facebook.ads.redexgen.X.C1C
    public final int A0F() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.C1C
    public final int A0G() {
        return 0;
    }
}
