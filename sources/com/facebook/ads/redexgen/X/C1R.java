package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1R, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1R implements Serializable {
    public static byte[] A04 = null;
    public static String[] A05 = {"d", "N8LJkoTRbuRbC1tJ", "jfJOiGRwPDVL1NrTNwB42KXE8H2UBngU", "vBF5X8psVmC8vN2i9Fb6pwYPcFw8P16Y", "MnzIPqWVO6BB6yg7oNwcPff6zueAQoos", "vMZUyoTb2kOawbdq3lii4zyBkGUB4gvd", "5yRYj6PaRtwfaNlpyi5ySSeMn9NdrDw4", "Ti3I"};
    public static final long serialVersionUID = 238472947123L;
    public int A00;
    public String A01;
    public String A02;
    public String A03;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] ^ i3) ^ 96;
            String[] strArr = A05;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[0] = "o";
            strArr2[1] = "Fs5WcDJhxaD3DdRX";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A04 = new byte[]{34, 51, 51, 28, 42, 39, 46, 63, 61, 53, 63, 57, 59, 1, 48, 63, 51, 59, 15, 24, 27, 24, 15, 15, 24, 15, 126, 105, 124, 99, 126, 120, 101, 98, 107, 83, 97, 99, 104, 105};
    }

    static {
        A05();
    }

    public C1R(String str, String str2, String str3, int i) {
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = i;
    }

    public static C1R A00(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(A04(0, 6, 35));
        String optString2 = jSONObject.optString(A04(18, 8, 29));
        String packageName = jSONObject.optString(A04(6, 12, 62));
        int optInt = jSONObject.optInt(A04(26, 14, 108), -1);
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || TextUtils.isEmpty(packageName) || optInt == -1) {
            return null;
        }
        return new C1R(optString, optString2, packageName, optInt);
    }

    private final String A01() {
        return this.A01;
    }

    private final String A02() {
        return this.A02;
    }

    private final String A03() {
        return this.A03;
    }

    public static void A06(C1R c1r, Context context) {
        if (c1r != null && c1r.A08()) {
            new C0747Uc(context).A01(true, c1r.A01(), c1r.A03(), c1r.A02(), System.currentTimeMillis());
        }
    }

    public static void A07(C1R c1r, Context context) {
        if (c1r != null && c1r.A09()) {
            new C0747Uc(context).A01(false, c1r.A01(), c1r.A03(), c1r.A02(), System.currentTimeMillis());
        }
    }

    private final boolean A08() {
        return (this.A00 & 2) != 0;
    }

    private final boolean A09() {
        return (this.A00 & 1) != 0;
    }
}
