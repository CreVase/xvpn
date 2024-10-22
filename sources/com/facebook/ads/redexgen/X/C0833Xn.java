package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Xn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0833Xn implements C0T {
    public static byte[] A01;
    public static String[] A02 = {"EcOoOPxvgIM5VM8gU5MNIX90mja3CaI7", "nhJ", "HCYDUCxXnFbS3htlRPDiG7BoiyzyMxIV", "Fv3YAwH75PiBj9X6AN971g", "yIx", "", "9xkhFmOksAfwag3lVFNPfz", "xjMRz"};
    public final C7S A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 90);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        String[] strArr = A02;
        if (strArr[1].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[0] = "mKsg4hxQhHaV0fiKABuoeRg1A6SJU8YP";
        strArr2[2] = "TgUrCFxQKf96ICwhyLjRHk1rYV6JKdAm";
        A01 = new byte[]{-91, -111, -94, -120, -18, 29, 22, 22, 13, 20, -12, 35, 28, 28, 19, 26, -24, -50, -3, 12, 34, -16, 33, 16, 25, 31, 10, -37, -22, -29, -29, -38, -31, 57, 72, 65, 65, 56, 63, 50, 63, 66, 58, 58, 56, 55};
    }

    static {
        A01();
    }

    public C0833Xn(C7S c7s) {
        this.A00 = c7s;
    }

    private void A02(int i, String str, JSONObject jSONObject, boolean z) {
        C02007y c02007y = new C02007y(A00(4, 6, 78));
        c02007y.A05(jSONObject);
        c02007y.A03(1);
        c02007y.A07(z);
        try {
            jSONObject.put(A00(33, 13, 121), C01937r.A0H(this.A00));
        } catch (JSONException unused) {
        }
        this.A00.A07().A9N(A00(27, 6, 27), i + 4000, c02007y);
        if (this.A00.A04().A8o()) {
            String str2 = A00(10, 8, 84) + str + A00(0, 1, 35) + i + A00(1, 3, 14) + jSONObject.toString();
        }
    }

    public static boolean A03(C0U c0u) {
        for (C0U c0u2 : C0825Xf.A09) {
            if (c0u2.equals(c0u)) {
                String[] strArr = A02;
                if (strArr[5].length() == strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[0] = "Wnbl1SxbPUMoFXuq6aB18pNeXqZWWzDi";
                strArr2[2] = "Lc0ARXxjXBXBpMD71LOao0gY4EKFysHu";
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C0T
    public final void A9O(C0U c0u, JSONObject jSONObject) {
        A02(c0u.A02(), c0u.toString(), jSONObject, A03(c0u));
    }

    @Override // com.facebook.ads.redexgen.X.C0T
    public final void A9b(int i, JSONObject jSONObject) {
        A02(i, A00(18, 9, 81) + i, jSONObject, false);
    }
}
