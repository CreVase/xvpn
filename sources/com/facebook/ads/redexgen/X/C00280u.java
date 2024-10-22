package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.0u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C00280u {
    public static byte[] A03;
    public final LinkedHashSet<String> A01 = new LinkedHashSet<>();
    public JSONObject A00 = new JSONObject();
    public final AtomicReference<String> A02 = new AtomicReference<>(A01(0, 2, 25));

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{13, 11, 56, 58, 43, 74, 65, 76, 93, 86, 95, 91, 74, 75, 112, 78, 75, 112, 70, 75, 112, 64, 93, 70, 72, 70, 65, 78, 67, 94, 85, 88, 73, 66, 75, 79, 94, 95, 100, 82, 95, 114, 126, 103, 64, 124, 126, 111, 111, 122, 123, 64, 126, 109, 109, 126, 102, 64, 115, 122, 113, 120, 107, 119, 12, 0, 0, 22, 17, 17, 6, 13, 0, 6, 16, 30, 11, 28, 7, 1, 10, 97, 118, 108, 109, 70, 118, 122, 122, 108, 107, 107, 124, 119, 122, 124, 70, 106, 124, 122, 106, 108, 123, 97, 96, 75, 100, 113, 102, 125, 123, 112};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final synchronized void A0A(String str) throws JSONException, C02007y {
        if (str != null) {
            if (!str.trim().isEmpty()) {
                this.A00 = new JSONObject(str);
                HashMap hashMap = new HashMap();
                Iterator<String> keys = this.A00.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (this.A00.get(next) instanceof String) {
                        hashMap.put(next, A00(next, new JSONObject((String) this.A00.get(next))));
                    }
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    this.A00.put((String) entry.getKey(), entry.getValue());
                }
            }
        }
    }

    private final synchronized C1Q A00(String str, JSONObject jSONObject) throws JSONException, C02007y {
        C1Q frequencyCappingData;
        if (str.equals(jSONObject.optString(A01(29, 12, 116), null))) {
            frequencyCappingData = new C1Q(str);
            A03(frequencyCappingData, jSONObject);
        } else {
            C02007y c02007y = new C02007y(new IllegalArgumentException());
            jSONObject.put(A01(5, 24, 96), str);
            c02007y.A05(jSONObject);
            c02007y.A03(1);
            throw c02007y;
        }
        return frequencyCappingData;
    }

    private void A03(C1Q c1q, JSONObject jSONObject) throws JSONException {
        int optInt = jSONObject.optInt(A01(75, 6, 33));
        int optInt2 = jSONObject.optInt(A01(101, 11, 91));
        int maxCappedArrayLength = jSONObject.optInt(A01(41, 23, 80), 50);
        long optLong = jSONObject.optLong(A01(2, 3, 20));
        String A01 = A01(64, 11, 44);
        if (jSONObject.has(A01)) {
            c1q.A06((JSONArray) jSONObject.get(A01));
        }
        String A012 = A01(81, 20, 86);
        if (jSONObject.has(A012)) {
            int cappingTimeSecs = jSONObject.optInt(A012);
            c1q.A04(cappingTimeSecs);
        }
        c1q.A05(optInt, optInt2, optLong, maxCappedArrayLength);
    }

    public final String A04() {
        String list = this.A02.get();
        return list == null ? A01(0, 2, 25) : list;
    }

    public final synchronized JSONObject A05() {
        return this.A00;
    }

    public final synchronized void A06() {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.A01.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        this.A02.set(jSONArray.toString());
    }

    public final synchronized void A07(String str) {
        if (this.A01.size() >= C1Q.A00()) {
            Iterator<String> it = this.A01.iterator();
            if (it.hasNext()) {
                this.A01.remove(it.next());
            }
        }
        this.A01.add(str);
        C6H.A03();
    }

    public final synchronized void A08(String str) throws JSONException {
        if (str != null) {
            if (!str.trim().isEmpty()) {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length() && i < C1Q.A00(); i++) {
                    this.A01.add(jSONArray.getString(i));
                }
            }
        }
    }

    public final synchronized void A09(String str) {
        this.A01.remove(str);
        C6H.A03();
    }

    public final synchronized void A0B(JSONObject jSONObject) throws JSONException {
        C1Q frequencyCappingData;
        String optString = jSONObject.optString(A01(29, 12, 116), null);
        if (optString == null) {
            return;
        }
        if (this.A00.has(optString) && (this.A00.get(optString) instanceof C1Q)) {
            frequencyCappingData = (C1Q) this.A00.get(optString);
        } else {
            frequencyCappingData = new C1Q(optString);
        }
        A03(frequencyCappingData, jSONObject);
        this.A00.put(optString, frequencyCappingData);
    }
}
