package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Gl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0398Gl implements R6 {
    public static byte[] A05;
    public static String[] A06 = {"yJwczGSbba5UrkwzZOW60Je1LUoZxQIl", "oZp", "SLRT1bjVboXCxkvYGWPu27FVIHxKKecJ", "WHpvXVjPup", "", "gRWAa43vtpEz38T6Kt4HiTmitjJp6SmI", "", "QpBNbg2dQWhW"};
    public JSONObject A00;
    public JSONObject A01;
    public final R7 A03;
    public final List<R8> A04 = new ArrayList();
    public boolean A02 = false;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 27);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        if (A06[7].length() != 12) {
            throw new RuntimeException();
        }
        A06[3] = "GbTE4j9vTw";
        A05 = new byte[]{58, 13, 22, 28, 20, 29, 88, 93, 11, 88, 28, 25, 12, 25, 88, 13, 8, 28, 25, 12, 29, 66, 114, 82, 82, 88, 28, 25, 12, 25, 88, 82, 82, 114, 93, 11, 114, 82, 82, 88, 30, 17, 22, 31, 29, 10, 8, 10, 17, 22, 12, 88, 82, 82, 114, 93, 11, 89, 110, 117, Byte.MAX_VALUE, 119, 126, 59, 115, 122, 104, 59, 117, 116, 59, 125, 114, 117, 124, 126, 105, 107, 105, 114, 117, 111, 32, 23, 12, 6, 14, 7, 66, 11, 17, 66, 12, 13, 22, 66, 16, 7, 3, 6, 27, 43, 46, 59, 46, 111, 114, 114, 111, 33, 58, 35, 35, 107, 100, 99, 106, 104, Byte.MAX_VALUE, 125, Byte.MAX_VALUE, 100, 99, 121, 45, 44, 48, 45, 99, 120, 97, 97, 125, 114, 117, 124, 126, 105, 107, 105, 114, 117, 111, 59, 38, 38, 59, 117, 110, 119, 119, 77, 86, 79, 79};
    }

    static {
        A03();
    }

    public C0398Gl(R7 r7) {
        this.A03 = r7;
    }

    private boolean A04(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return false;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return true;
        }
        boolean A02 = R5.A02(jSONObject, jSONObject2);
        String[] strArr = A06;
        if (strArr[0].charAt(8) != strArr[2].charAt(8)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[4] = "";
        strArr2[6] = "";
        return true ^ A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:            if (r8.A03.A04() == false) goto L34;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a7, code lost:            throw new java.lang.IllegalArgumentException(A02(113, 19, 22));     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean A05(org.json.JSONObject r9, org.json.JSONObject r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            if (r9 == 0) goto La8
            if (r10 != 0) goto L1d
            com.facebook.ads.redexgen.X.R7 r0 = r8.A03     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = r0.A04()     // Catch: java.lang.Throwable -> Lb8
            if (r0 != 0) goto Le
            goto L1d
        Le:
            r2 = 132(0x84, float:1.85E-43)
            r1 = 19
            r0 = 0
            java.lang.String r1 = A02(r2, r1, r0)     // Catch: java.lang.Throwable -> Lb8
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lb8
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb8
            throw r0     // Catch: java.lang.Throwable -> Lb8
        L1d:
            if (r10 == 0) goto L27
            com.facebook.ads.redexgen.X.R7 r0 = r8.A03     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = r0.A04()     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto L98
        L27:
            org.json.JSONObject r0 = r8.A01     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = r8.A04(r0, r10)     // Catch: java.lang.Throwable -> Lb8
            r3 = 0
            if (r0 != 0) goto L38
            org.json.JSONObject r0 = r8.A00     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = r8.A04(r0, r9)     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto L96
        L38:
            r8.A00 = r9     // Catch: java.lang.Throwable -> Lb8
            r8.A01 = r10     // Catch: java.lang.Throwable -> Lb8
            r7 = 1
            r8.A02 = r7     // Catch: java.lang.Throwable -> Lb8
            java.util.List<com.facebook.ads.redexgen.X.R8> r0 = r8.A04     // Catch: java.lang.Throwable -> Lb8
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> Lb8
        L45:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto L55
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> Lb8
            com.facebook.ads.redexgen.X.R8 r0 = (com.facebook.ads.redexgen.X.R8) r0     // Catch: java.lang.Throwable -> Lb8
            r0.A41()     // Catch: java.lang.Throwable -> Lb8
            goto L45
        L55:
            java.util.Locale r6 = java.util.Locale.US     // Catch: org.json.JSONException -> L94 java.lang.Throwable -> Lb8
            r2 = 0
            r1 = 57
            r0 = 99
            java.lang.String r5 = A02(r2, r1, r0)     // Catch: org.json.JSONException -> L94 java.lang.Throwable -> Lb8
            r0 = 3
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: org.json.JSONException -> L94 java.lang.Throwable -> Lb8
            com.facebook.ads.redexgen.X.R7 r0 = r8.A03     // Catch: org.json.JSONException -> L94 java.lang.Throwable -> Lb8
            r4[r3] = r0     // Catch: org.json.JSONException -> L94 java.lang.Throwable -> Lb8
            org.json.JSONObject r0 = r8.A00     // Catch: org.json.JSONException -> L94 java.lang.Throwable -> Lb8
            r3 = 2
            if (r0 != 0) goto L8f
            r2 = 151(0x97, float:2.12E-43)
            r1 = 4
            r0 = 56
            java.lang.String r0 = A02(r2, r1, r0)     // Catch: org.json.JSONException -> L94 java.lang.Throwable -> Lb8
        L75:
            r4[r7] = r0     // Catch: org.json.JSONException -> L94 java.lang.Throwable -> Lb8
            org.json.JSONObject r0 = r8.A01     // Catch: org.json.JSONException -> L94 java.lang.Throwable -> Lb8
            if (r0 != 0) goto L8a
            r2 = 151(0x97, float:2.12E-43)
            r1 = 4
            r0 = 56
            java.lang.String r0 = A02(r2, r1, r0)     // Catch: org.json.JSONException -> L94 java.lang.Throwable -> Lb8
        L84:
            r4[r3] = r0     // Catch: org.json.JSONException -> L94 java.lang.Throwable -> Lb8
            java.lang.String.format(r6, r5, r4)     // Catch: org.json.JSONException -> L94 java.lang.Throwable -> Lb8
            goto L94
        L8a:
            java.lang.String r0 = r0.toString(r3)     // Catch: org.json.JSONException -> L94 java.lang.Throwable -> Lb8
            goto L84
        L8f:
            java.lang.String r0 = r0.toString(r3)     // Catch: org.json.JSONException -> L94 java.lang.Throwable -> Lb8
            goto L75
        L94:
            monitor-exit(r8)
            return r7
        L96:
            monitor-exit(r8)
            return r3
        L98:
            r2 = 113(0x71, float:1.58E-43)
            r1 = 19
            r0 = 22
            java.lang.String r1 = A02(r2, r1, r0)     // Catch: java.lang.Throwable -> Lb8
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lb8
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb8
            throw r0     // Catch: java.lang.Throwable -> Lb8
        La8:
            r2 = 101(0x65, float:1.42E-43)
            r1 = 12
            r0 = 84
            java.lang.String r1 = A02(r2, r1, r0)     // Catch: java.lang.Throwable -> Lb8
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lb8
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb8
            throw r0     // Catch: java.lang.Throwable -> Lb8
        Lb8:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0398Gl.A05(org.json.JSONObject, org.json.JSONObject):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.R6
    public final synchronized void A3N(R8 r8) {
        this.A04.add(r8);
    }

    @Override // com.facebook.ads.redexgen.X.R6
    public final synchronized JSONObject A6b() {
        JSONObject jSONObject;
        jSONObject = this.A00;
        if (jSONObject == null) {
            throw new IllegalStateException(A02(82, 19, 121));
        }
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.R6
    public final synchronized JSONObject A6y() {
        JSONObject jSONObject;
        if (this.A03.A04()) {
            jSONObject = this.A01;
            if (jSONObject == null) {
                throw new IllegalStateException(A02(82, 19, 121));
            }
        } else {
            throw new IllegalStateException(A02(57, 25, 0));
        }
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.R6
    public final R7 A73() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.R6
    public final synchronized boolean A90() {
        return this.A02;
    }
}
