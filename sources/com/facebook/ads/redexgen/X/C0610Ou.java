package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Ou, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0610Ou {
    public static byte[] A00;
    public static String[] A01 = {"xPMOoUfbkmQ5kvnU3jbgLL47OcFEjU7z", "1dodMLotzUEJucQn2MWgY64F", "Ei0kY7ZOP", "czo3jP2JN", "", "hHdeWCinA2EaAz86iaUgwk6OrkZVXmHI", "CkfkaUvdCRi5J5AIUl6JSr62iIVQ3RiE", "AT3hLPm3hPYjZ73rxoY4ER"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 25 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C0609Ot A00(YA ya, JSONObject jSONObject, C6Q c6q, C0452In c0452In, OU ou, boolean z) {
        boolean z2;
        String str;
        String str2;
        boolean z3 = z;
        String A012 = A01(142, 3, 82);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        String optString = jSONObject.optString(A01(92, 26, 126));
        String optString2 = jSONObject.optString(A01(51, 41, 80));
        arrayList3.add(optString);
        arrayList3.add(optString2);
        if (z3) {
            str = c6q.A0R(optString);
            str2 = c6q.A0R(optString2);
            if (optString.equals(str) || optString2.equals(str2)) {
                z3 = false;
                z2 = false;
            } else {
                z2 = z3;
            }
        } else {
            z2 = z3;
            str = optString;
            str2 = optString2;
        }
        c0452In.A04(EnumC0451Im.A0P, null);
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(A01(133, 4, 36));
            if (optJSONObject != null && optJSONObject.optString(A012) != null) {
                arrayList.add(optJSONObject.optString(A012));
                if (z2) {
                    optJSONObject.put(A012, c6q.A0Q(optJSONObject.optString(A012)));
                }
            }
            JSONArray optJSONArray = jSONObject.optJSONArray(A01(118, 15, 1));
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString3 = optJSONArray.optString(i);
                    arrayList.add(optString3);
                    if (z2) {
                        optJSONArray.put(i, c6q.A0Q(optString3));
                    }
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray(A01(43, 8, 26));
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    A03(arrayList, arrayList2, optJSONArray2.optJSONObject(i2), c6q, z2);
                }
            } else {
                A03(arrayList, arrayList2, jSONObject, c6q, z2);
            }
        } catch (JSONException unused) {
            ou.A04(C01997x.A15, A01(0, 43, 79));
        }
        return new C0609Ot(jSONObject, str, str2, arrayList, arrayList2, arrayList3, z3);
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{69, 114, 114, 111, 114, 32, 116, 114, 97, 110, 115, 102, 111, 114, 109, 105, 110, 103, 32, 74, 83, 79, 78, 32, 105, 110, 32, 117, 112, 100, 97, 116, 101, 67, 97, 99, 104, 101, 100, 85, 114, 108, 115, 54, 52, 39, 58, 32, 38, 48, 57, 123, 102, 113, 126, 114, 118, 124, 64, 108, 123, 116, 64, 115, 126, 102, 122, 109, 64, 124, 112, 114, 111, 126, 113, 118, 112, 113, 64, 105, 118, 122, 104, 64, 119, 107, 114, 115, 64, 106, 109, 115, 85, 72, 95, 80, 92, 88, 82, 110, 66, 85, 90, 110, 93, 80, 72, 84, 67, 110, 89, 69, 92, 93, 110, 68, 67, 93, 43, 32, 42, 17, 45, 47, 60, 42, 17, 39, 35, 47, 41, 43, 61, 2, 8, 4, 5, 76, 72, 68, 66, 64, 104, 111, 113, 21, 10, 7, 6, 12, 60, 22, 17, 15};
    }

    static {
        A02();
    }

    public static void A03(ArrayList<String> videoUrls, ArrayList<String> arrayList, JSONObject jSONObject, C6Q c6q, boolean z) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject(A01(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 5, 106));
        if (optJSONObject != null) {
            String A012 = A01(142, 3, 82);
            if (A01[1].length() == 1) {
                throw new RuntimeException();
            }
            A01[7] = "G1neCcMuoIIVUH8A2yIEObncf";
            if (optJSONObject.optString(A012) != null) {
                String optString = optJSONObject.optString(A012);
                videoUrls.add(optString);
                if (z) {
                    optJSONObject.put(A012, c6q.A0Q(optString));
                }
            }
        }
        String A013 = A01(145, 9, 44);
        if (!TextUtils.isEmpty(jSONObject.optString(A013))) {
            String optString2 = jSONObject.optString(A013);
            arrayList.add(optString2);
            if (z) {
                jSONObject.put(A013, c6q.A0R(optString2));
            }
        }
    }
}
