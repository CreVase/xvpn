package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A03' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: assets/audience_network.dex */
public abstract class R4 {
    public static byte[] A00;
    public static String[] A01 = {"nA8fLeyOwVmNwvq6aIqKxCaagHA5eYr", "8Z3ODqLNUnEAqB2P3Amw9Ur1PSsugik5", "YRmdf", "zIg3Ob9eurpeZ06C2uEHUxbrUPW1iO5", "DwODnBhAs5I9lGAPLwBjllp42Gjp41Mv", "6IL6kP5nz", "IHg6IZuYXxuMxytmBHiV", "YXmTZGEBqQ8NuPQvZDB03"};
    public static final /* synthetic */ R4[] A02;
    public static final R4 A03;
    public static final R4 A04;
    public static final R4 A05;
    public static final R4 A06;
    public static final R4 A07;
    public static final R4 A08;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 4);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-82, -33, -33, -50, -26, 110, -101, -101, -104, -111, -115, -102, -103, -60, -54, -73, -63, -70, Byte.MAX_VALUE, -92, -86, 101, 120, Byte.MIN_VALUE, 123, 121, -118, 123, -100, -102, -111, -106, -113, -99, -74, -77, -74, -73, -65, -74, 104, -68, -63, -72, -83, 104, -73, -82, 104, -78, -69, -73, -74, 104, -73, -86, -78, -83, -85, -68, 104, -77, -83, -63};
    }

    public abstract boolean A04(JSONArray jSONArray, int i);

    public abstract boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i);

    public abstract boolean A06(JSONObject jSONObject, String str);

    public abstract boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str);

    static {
        A03();
        final String A022 = A02(0, 5, 105);
        final int i = 0;
        R4 r4 = new R4(A022, i) { // from class: com.facebook.ads.redexgen.X.HB
            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A04(JSONArray jSONArray, int i2) {
                return jSONArray.optJSONArray(i2) != null;
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i2) {
                return R5.A01(jSONArray.optJSONArray(i2), jSONArray2.optJSONArray(i2));
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optJSONArray(str) != null;
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return R5.A01(jSONObject.optJSONArray(str), jSONObject2.optJSONArray(str));
            }
        };
        A03 = r4;
        final String A023 = A02(5, 7, 40);
        final int i2 = 1;
        R4 r42 = new R4(A023, i2) { // from class: com.facebook.ads.redexgen.X.H5
            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A04(JSONArray jSONArray, int i3) {
                return jSONArray.optBoolean(i3, true) == jSONArray.optBoolean(i3, false);
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i3) {
                return jSONArray.optBoolean(i3) == jSONArray2.optBoolean(i3);
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optBoolean(str, true) == jSONObject.optBoolean(str, false);
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optBoolean(str) == jSONObject2.optBoolean(str);
            }
        };
        A04 = r42;
        final String A024 = A02(12, 6, 81);
        final int i3 = 2;
        R4 r43 = new R4(A024, i3) { // from class: com.facebook.ads.redexgen.X.H3
            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A04(JSONArray jSONArray, int i4) {
                return jSONArray.optInt(i4, 0) == jSONArray.optInt(i4, 1) && jSONArray.optDouble(i4, 0.0d) == jSONArray.optDouble(i4, 1.0d) && ((double) jSONArray.optInt(i4, 0)) != jSONArray.optDouble(i4, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i4) {
                return jSONArray.optDouble(i4) == jSONArray2.optDouble(i4);
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) && jSONObject.optDouble(str, 0.0d) == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) != jSONObject.optDouble(str, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optDouble(str) == jSONObject2.optDouble(str);
            }
        };
        A05 = r43;
        final String A025 = A02(18, 3, 50);
        final int i4 = 3;
        R4 r44 = new R4(A025, i4) { // from class: com.facebook.ads.redexgen.X.Gz
            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A04(JSONArray jSONArray, int i5) {
                return jSONArray.optInt(i5, 0) == jSONArray.optInt(i5, 1) && jSONArray.optDouble(i5, 0.0d) == jSONArray.optDouble(i5, 1.0d) && ((double) jSONArray.optInt(i5, 0)) == jSONArray.optDouble(i5, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i5) {
                return jSONArray.optInt(i5) == jSONArray2.optInt(i5);
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) && jSONObject.optDouble(str, 0.0d) == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) == jSONObject.optDouble(str, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optInt(str) == jSONObject2.optInt(str);
            }
        };
        A06 = r44;
        final String A026 = A02(21, 6, 18);
        final int i5 = 4;
        R4 r45 = new R4(A026, i5) { // from class: com.facebook.ads.redexgen.X.Gw
            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A04(JSONArray jSONArray, int i6) {
                return jSONArray.optJSONObject(i6) != null;
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i6) {
                return R5.A02(jSONArray.optJSONObject(i6), jSONArray2.optJSONObject(i6));
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optJSONObject(str) != null;
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return R5.A02(jSONObject.optJSONObject(str), jSONObject2.optJSONObject(str));
            }
        };
        A07 = r45;
        final String A027 = A02(27, 6, 36);
        final int i6 = 5;
        R4 r46 = new R4(A027, i6) { // from class: com.facebook.ads.redexgen.X.Gt
            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A04(JSONArray jSONArray, int i7) {
                return jSONArray.optString(i7) != null;
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i7) {
                return jSONArray.optString(i7).equals(jSONArray2.optString(i7));
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optString(str) != null;
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optString(str).equals(jSONObject2.optString(str));
            }
        };
        A08 = r46;
        A02 = new R4[]{r4, r42, r43, r44, r45, r46};
    }

    public R4(String str, int i) {
    }

    public static R4 A00(JSONArray jSONArray, int i) {
        for (R4 type : values()) {
            if (A01[1].charAt(14) != '2') {
                throw new RuntimeException();
            }
            A01[4] = "PUsgFaltT51mxPXWqnHKjq6lqfkoVDea";
            if (type.A04(jSONArray, i)) {
                return type;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static R4 A01(JSONObject jSONObject, String str) {
        for (R4 r4 : values()) {
            boolean A062 = r4.A06(jSONObject, str);
            if (A01[5].length() != 9) {
                throw new RuntimeException();
            }
            A01[6] = "GmRRmI3tzaTgoS0GQtjO0";
            if (A062) {
                return r4;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static R4 valueOf(String str) {
        return (R4) Enum.valueOf(R4.class, str);
    }

    public static R4[] values() {
        return (R4[]) A02.clone();
    }
}
