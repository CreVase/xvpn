package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.aQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0922aQ extends C1C implements Serializable {
    public static byte[] A0A = null;
    public static String[] A0B = {"Y1a5U13ty71QFnyeZB3YxisAAvg7l3fM", "vP", "roZ2Db2w31DgWTY1oGehTdyGNewX8eXS", "I2NTYMYLYsNyCs0logd6ULXXnbjyHCad", "3brQnbpmNBxYuH5lF741sBi9dGi0pOZr", "3fAMLw4w5Yud0wL2utfDbR4mKZlWQuB2", "wSrWvvXZ9ekOd4qM7VWdouqMZx6NVgDc", "r9"};
    public static final long serialVersionUID = 3751287062553772011L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final List<AbstractC0924aS> A09;
    public final ArrayList<Integer> A08 = new ArrayList<>();
    public boolean A06 = false;
    public boolean A05 = false;
    public boolean A04 = false;
    public final String A07 = UUID.randomUUID().toString();

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0B;
            if (strArr[1].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[0] = "ksKrUe0otL7CQDvNz8iG7T5OcxZuVq1Y";
            strArr2[4] = "xaZ8PqWmutKQFInRkVw3BesrM2XhV7TN";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 107);
            i4++;
        }
    }

    public static void A05() {
        A0A = new byte[]{-17, -14, 1, -7, -2, -9, -1, 4, -11, 6, -9, 8, -9, 3, 9, 70, 75, 68, 76, 81, 72, 71, 66, 68, 71, 86, 66, 70, 82, 88, 81, 87, 76, 81, 74, 82, 87, 78, 77, 72, 74, 77, 92, 72, 86, 74, 97, 72, 77, 94, 91, 74, 93, 82, 88, 87, 74, 79, 72, 80, 85, 76, 75, 70, 72, 75, 90, 70, 93, 72, 89, 80, 76, 85, 91, -40, -35, -42, -34, -29, -34, -29, -36, -44, -37, -28, -25, -40, -38, -44, -21, -34, -38, -20, -44, -23, -34, -30, -38, -24, 61, 70, 60, 55, 59, 57, 74, 60, 55, 57, 77, 76, 71, 55, 59, 68, 71, 75, 61, 55, 76, 65, 69, 61, -26, -39, -28, -29, -26, -24, -45, -38, -35, -26, -25, -24, -45, -39, -41, -28, -31, -45, -29, -30, -32, -19, -27, -40, -29, -30, -27, -25, -46, -39, -36, -27, -26, -25, -46, -36, -32, -29, -27, -40, -26, -26, -36, -30, -31, -46, -30, -31, -33, -20, 11, 8, 4, 1, 12, -9, -2, 7, 10, -5, -3, -9, 14, 1, -3, 15};
    }

    static {
        A05();
    }

    public C0922aQ(List<AbstractC0924aS> list) {
        this.A09 = list;
    }

    public static C0922aQ A02(JSONObject jSONObject, YA ya) throws JSONException {
        return A03(jSONObject, ya, false);
    }

    public static C0922aQ A03(JSONObject jSONObject, YA ya, boolean z) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray(A04(0, 3, 35));
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            if (z) {
                arrayList.add(F0.A02(jSONArray.getJSONObject(i), ya));
            } else {
                arrayList.add(C0361Ey.A02(jSONArray.getJSONObject(i), ya));
            }
        }
        C0922aQ c0922aQ = new C0922aQ(arrayList);
        JSONObject chainingParams = jSONObject.getJSONObject(A04(3, 12, 43));
        c0922aQ.A01 = chainingParams.optInt(A04(15, 17, 120), arrayList.size());
        c0922aQ.A03 = chainingParams.optInt(A04(32, 24, 126), 0);
        c0922aQ.A02 = chainingParams.optInt(A04(100, 24, 109), 0);
        c0922aQ.A00 = chainingParams.optInt(A04(56, 19, 124), 2);
        c0922aQ.A0b(chainingParams);
        c0922aQ.A06 = chainingParams.optBoolean(A04(174, 16, 45), false);
        c0922aQ.A05 = chainingParams.optBoolean(A04(146, 28, 8), false);
        c0922aQ.A04 = chainingParams.optBoolean(A04(124, 22, 9), false);
        JSONArray optJSONArray = chainingParams.optJSONArray(A04(75, 25, 10));
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                c0922aQ.A08.add(Integer.valueOf(optJSONArray.optInt(i2, 0)));
            }
        }
        return c0922aQ;
    }

    @Override // com.facebook.ads.redexgen.X.C1C
    public final int A0F() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.X.C1C
    public final int A0G() {
        return this.A03 + this.A02;
    }

    public final int A0p() {
        return this.A00;
    }

    public final int A0q() {
        return this.A01;
    }

    public final int A0r() {
        return this.A02;
    }

    public final AbstractC0924aS A0s() {
        if (!this.A09.isEmpty()) {
            AbstractC0924aS abstractC0924aS = this.A09.get(0);
            if (A0B[3].charAt(30) != 'a') {
                throw new RuntimeException();
            }
            String[] strArr = A0B;
            strArr[0] = "kalcuJUd13OWB3p352R0B2fkOk5TQQvY";
            strArr[4] = "xCP6b54EQCdUXuQWfLaOcoZzurPDdDGU";
            return abstractC0924aS;
        }
        return null;
    }

    public final AbstractC0924aS A0t(int i) {
        return this.A09.get(i);
    }

    public final String A0u() {
        return this.A07;
    }

    public final String A0v() {
        AbstractC0924aS firstAdDataBundle = A0s();
        if (firstAdDataBundle != null) {
            return firstAdDataBundle.A11();
        }
        return null;
    }

    public final ArrayList<Integer> A0w() {
        return this.A08;
    }

    public final void A0x(int i) {
        this.A09.remove(i);
        this.A01--;
    }

    public final boolean A0y() {
        return this.A00 == 0;
    }

    public final boolean A0z() {
        return this.A04;
    }

    public final boolean A10() {
        return this.A05;
    }

    public final boolean A11() {
        return this.A06;
    }
}
