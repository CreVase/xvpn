package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class NL {
    public static byte[] A01;
    public static String[] A02 = {"CvydOG1rdpeZVjh1I2HxFGGpkCBtP1uR", "LPAb8wO4e9Bm4297vBHQiNlf50jewka4", "p6i6iSivtdsam", "kr1L5mV", "OjxdnAkOIagRjcigNYlctVvlDEXS237l", "CTcf", "XEPmNqkHOtxVdZCukAC2cQoZWEBCmlPv", "qw43eBE0dfm3vpW8jqKcT1ME9HQ7Rm2E"};
    public final Map<String, String> A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 113);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {71, 90, 86, 80, 67, 125, 74, 75, 76, 86, 81, 5, 30, 4, 18, 25};
        String[] strArr = A02;
        if (strArr[6].charAt(15) == strArr[1].charAt(15)) {
            throw new RuntimeException();
        }
        A02[3] = "rnLFNN7HWa";
        A01 = bArr;
    }

    static {
        A01();
    }

    public NL() {
        this.A00 = new HashMap();
    }

    public NL(Map<String, String> extraData) {
        this.A00 = extraData;
    }

    public final NL A02(LN ln) {
        if (ln != null) {
            this.A00.put(A00(11, 5, 0), L0.A01(ln.A04()));
        }
        return this;
    }

    public final NL A03(C0643Qb c0643Qb) {
        if (c0643Qb != null) {
            this.A00.putAll(c0643Qb.A0S());
        }
        return this;
    }

    public final NL A04(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.A00.put(A00(0, 11, 83), str);
        }
        return this;
    }

    public final Map<String, String> A05() {
        return this.A00;
    }
}
