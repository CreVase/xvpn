package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Ok, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0600Ok {
    public static byte[] A00;
    public static String[] A01 = {"CXRchRuqobcH0303RF", "0PvsG2xJSmQLgGTcWH9EYe7sEgRs7pRt", "Ep2muPcKb5OPprn584rkOKVS7ZwPor7u", "ESdTFl6hgzo0PrNou", "ifIc3126Iu24LMQAqXU9MKX3mrrg1qWL", "gYyPZy3RrUjZ7", "cRp6DEQTFSLuVCLvwOm8", "Iag0U1Rq9Q0ZydVPffrz8fjunI2ky4CH"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static WebResourceResponse A00(YA ya, WebResourceRequest webResourceRequest, Uri uri, String str, HashMap<String, String> hashMap) throws IOException {
        String A02;
        String A022 = A02(85, 5, 49);
        C0770Uz A0F = QN.A05(ya.A01()).A0F(ya);
        C6Q.A0H(ya, uri.toString());
        try {
            C0601Ol c0601Ol = new C0601Ol(ya.A01(), uri, A0F);
            int available = c0601Ol.available();
            if (available <= 0) {
                A05(ya, 1, new Pair[]{new Pair(A02(61, 9, 77), String.valueOf(available))});
                return null;
            }
            String A03 = A03(webResourceRequest.getRequestHeaders());
            if (A03 == null) {
                ya.A0E().A5J();
                A06(hashMap, available);
                return new WebResourceResponse(str, null, 200, A02(44, 2, 15), hashMap, c0601Ol);
            }
            try {
                C0599Oj A012 = A01(A03);
                if (A012.A03) {
                    int i = A012.A01;
                    int i2 = A012.A00 == -1 ? available - 1 : A012.A00;
                    A06(hashMap, available);
                    hashMap.put(A02(31, 13, 81), A02(75, 6, 17) + i + A02(1, 1, 52) + i2 + A02(2, 1, 110) + available);
                    ya.A0E().A5J();
                    return new WebResourceResponse(str, null, 206, A02(46, 15, 36), hashMap, c0601Ol);
                }
                Pair[] pairArr = new Pair[1];
                if (A012.A02 != null) {
                    A02 = A012.A02;
                } else {
                    if (A01[2].charAt(11) != 'P') {
                        throw new RuntimeException();
                    }
                    A01[0] = "OMRpqA07uUbGIz9l3e";
                    A02 = A02(90, 4, 76);
                }
                pairArr[0] = new Pair(A02(94, 5, 44), A02);
                A05(ya, 0, pairArr);
                return null;
            } catch (NumberFormatException e) {
                A05(ya, 3, new Pair[]{new Pair(A022, e.toString())});
                return null;
            }
        } catch (IOException e2) {
            A05(ya, 2, new Pair[]{new Pair(A022, e2.toString())});
            return null;
        }
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 91);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-119, -68, -8, -14, -50, -16, -16, -14, -3, 1, -70, -33, -18, -5, -12, -14, 0, -46, -2, -3, 3, -12, -3, 3, -68, -37, -12, -3, -10, 3, -9, -17, 27, 26, 32, 17, 26, 32, -39, -2, 13, 26, 19, 17, -71, -75, -49, -32, -15, -13, -24, -32, -21, -97, -62, -18, -19, -13, -28, -19, -13, 9, 30, 9, 17, 20, 9, 10, 20, 13, -7, 16, 11, -4, 10, -50, -27, -32, -47, -33, -116, 4, 16, 5, 6, -15, -2, -2, -5, -2, 21, 28, 19, 19, -7, -24, -11, -18, -20};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A05(YA ya, int i, Pair<String, String>[] pairArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A02(81, 4, 70), i);
            for (Pair<String, String> pair : pairArr) {
                jSONObject.put((String) pair.first, pair.second);
            }
        } catch (JSONException unused) {
        }
        ya.A0E().A5I(jSONObject.toString());
    }

    static {
        A04();
    }

    public static C0599Oj A01(String str) {
        if (str == null) {
            C0599Oj parseResult = new C0599Oj();
            parseResult.A03 = false;
            parseResult.A02 = null;
            return parseResult;
        }
        String[] split = str.split(A02(3, 1, 90));
        if (split.length >= 2) {
            if (A02(70, 5, 60).equals(split[0].toLowerCase(Locale.US).trim())) {
                if (split[1].trim().split(A02(0, 1, 2)).length != 1) {
                    C0599Oj c0599Oj = new C0599Oj();
                    c0599Oj.A03 = false;
                    c0599Oj.A02 = str;
                    return c0599Oj;
                }
                String[] ranges = split[1].trim().split(A02(1, 1, 52));
                C0599Oj c0599Oj2 = new C0599Oj();
                c0599Oj2.A03 = true;
                c0599Oj2.A02 = str;
                c0599Oj2.A01 = TextUtils.isEmpty(ranges[0]) ? 0 : Integer.parseInt(ranges[0]);
                if (ranges.length > 1) {
                    c0599Oj2.A00 = TextUtils.isEmpty(ranges[1]) ? -1 : Integer.parseInt(ranges[1]);
                } else {
                    c0599Oj2.A00 = -1;
                }
                return c0599Oj2;
            }
        }
        C0599Oj c0599Oj3 = new C0599Oj();
        c0599Oj3.A03 = false;
        c0599Oj3.A02 = str;
        return c0599Oj3;
    }

    public static String A03(Map<String, String> map) {
        for (String str : map.keySet()) {
            if (A02(94, 5, 44).equals(str.toLowerCase(Locale.US))) {
                return map.get(str);
            }
        }
        return null;
    }

    public static void A06(HashMap<String, String> hashMap, int i) {
        hashMap.put(A02(4, 13, 50), A02(70, 5, 60));
        hashMap.put(A02(17, 14, 52), String.valueOf(i));
    }
}
