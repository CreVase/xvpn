package com.facebook.ads.redexgen.X;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.util.common.Preconditions;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Xa, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0820Xa implements InterfaceC02068e {
    public static byte[] A03;
    public static final String A04;
    public final Y9 A00;
    public final InterfaceC02168p<C0441Ic> A01;
    public final InterfaceC02168p<C0441Ic> A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 70);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{102, 100, 43, 34, 100, 48, 61, 52, 33, 126, 100, 24, 61, 28, 47, 60, 55, 45, 10, 45, 54, 43, 56, 62, 60, 11, 60, 58, 54, 43, 61, 29, 56, 45, 56, 59, 56, 42, 60, 105, 72, 65, 72, 89, 72, 73, 13, 72, 91, 72, 67, 89, 23, 13, 15, 66, 101, 109, 104, 97, 96, 36, 112, 107, 36, 103, 104, 97, 101, 118, 36, 97, 114, 97, 106, 112, 119, 36, 119, 112, 107, 118, 101, 99, 97, 97, 70, 78, 75, 66, 67, 7, 83, 72, 7, 67, 66, 84, 66, 85, 78, 70, 75, 78, 93, 66, 7, 70, 73, 7, 66, 81, 66, 73, 83, 7, 65, 85, 72, 74, 7, 67, 70, 83, 70, 69, 70, 84, 66, 7, 107, 76, 68, 65, 72, 73, 13, 89, 66, 13, 64, 66, 91, 72, 13, 72, 91, 72, 67, 89, 94, 13, 75, 95, 66, 64, 13, 68, 67, 0, 75, 65, 68, 74, 69, 89, 13, 94, 89, 66, 95, 76, 74, 72, 13, 79, 76, 78, 70, 13, 89, 66, 13, 72, 91, 72, 67, 89, 94, 13, 73, 76, 89, 76, 79, 76, 94, 72, 118, 81, 89, 92, 85, 84, 16, 68, 95, 16, 64, 81, 66, 67, 85, 16, 81, 94, 16, 85, 70, 85, 94, 68, 16, 86, 66, 95, 93, 16, 89, 94, 29, 86, 92, 89, 87, 88, 68, 16, 67, 68, 95, 66, 81, 87, 85, 123, 92, 84, 81, 88, 89, 29, 73, 82, 29, 79, 88, 92, 89, 29, 73, 85, 88, 29, 83, 72, 80, 95, 88, 79, 29, 82, 91, 29, 88, 75, 88, 83, 73, 78, 29, 91, 79, 82, 80, 29, 89, 92, 73, 92, 95, 92, 78, 88, 12, 43, 35, 38, 47, 46, 106, 62, 37, 106, 57, 47, 56, 35, 43, 38, 35, 48, 47, 106, 43, 46, 106, 47, 60, 47, 36, 62, 105, 78, 70, 76, 73, 71, 72, 84, 13, 97, 68, 101, 86, 69, 78, 84, 115, 84, 79, 82, 65, 71, 69, 114, 69, 67, 79, 82, 68, 100, 65, 84, 65, 66, 65, 83, 69, 56, 15, 9, 5, 24, 14, 74, 14, 11, 30, 11, 8, 11, 25, 15, 74, 12, 11, 3, 6, 31, 24, 15, 74, 5, 9, 9, 31, 24, 24, 15, 14, 74, 29, 2, 15, 4, 74, 24, 15, 11, 14, 3, 4, 13, 74, 15, 28, 15, 4, 30, 25, 68, 61, 40, 40, 57, 49, 44, 40, 28, 25, 12, 25, 47, 34, 95, 72, 78, 66, 95, 73, 114, 73, 76, 89, 76, 79, 76, 94, 72, 65, 87, 65, 65, 91, 93, 92, 109, 91, 86, 46, 56, 46, 46, 52, 50, 51, 2, 41, 52, 48, 56, 100, 121, 125, 117, 49, 42, 46, 32, 43, 88, 85, 92, 73, 12, 23, 18, 23, 22, 14, 23};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0 A[Catch: 8y -> 0x0136, TryCatch #4 {8y -> 0x0136, blocks: (B:33:0x00e4, B:35:0x00f0, B:36:0x00ff, B:19:0x0088, B:24:0x008e, B:26:0x009a, B:27:0x00da, B:62:0x0108, B:63:0x010c, B:65:0x0112, B:67:0x0122, B:68:0x0126, B:70:0x012c), top: B:32:0x00e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A0B(int r13, java.util.Set<java.lang.String> r14, java.util.Set<java.lang.String> r15) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0820Xa.A0B(int, java.util.Set, java.util.Set):int");
    }

    static {
        A03();
        A04 = C0820Xa.class.getSimpleName();
    }

    public C0820Xa(Y9 y9) throws IOException {
        this.A00 = y9;
        this.A01 = new XX(C02138m.A00(A00(11, 28, 31), y9), new C0822Xc(this));
        this.A02 = new XX(C02138m.A00(A00(322, 37, 102), y9), new C0821Xb(this));
    }

    private List<JSONObject> A01(List<JSONObject> list, byte[] bArr, int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            if (i2 == 0) {
                break;
            }
            try {
                list.add(A02(bArr, i, i2));
            } catch (JSONException jsone) {
                if (this.A00.A04().A8o()) {
                    Log.e(A04, A00(85, 45, 97), jsone);
                }
                int start = C01997x.A2O;
                A05(start, jsone);
            }
            i += i2;
        }
        return list;
    }

    public static JSONObject A02(byte[] bArr, int i, int i2) throws JSONException {
        return new JSONObject(new String(Arrays.copyOfRange(bArr, i, i + i2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(int i, String str) {
        C02007y c02007y = new C02007y(str);
        c02007y.A03(1);
        this.A00.A07().A9N(A00(425, 15, 107), i, c02007y);
    }

    private void A05(int i, Throwable th) {
        this.A00.A07().A9M(A00(425, 15, 107), i, new C02007y(th));
    }

    public static byte[] A07(C7S c7s, String str, C0441Ic c0441Ic) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(423, 2, 0), str);
            jSONObject.put(A00(466, 5, 3), c0441Ic.A08());
            jSONObject.put(A00(471, 4, 106), c0441Ic.A06().toString());
            jSONObject.put(A00(462, 4, 86), LM.A02(c0441Ic.A04()));
            jSONObject.put(A00(450, 12, 27), LM.A02(c0441Ic.A03()));
            jSONObject.put(A00(440, 10, 116), c0441Ic.A07());
            String A00 = A00(419, 4, 62);
            JSONObject eventJson = new JSONObject(c0441Ic.A09());
            jSONObject.put(A00, eventJson);
            jSONObject.put(A00(412, 7, 26), 0);
        } catch (JSONException e) {
            if (c7s.A04().A8o()) {
                Log.e(A04, A00(294, 28, 12), e);
            }
        }
        return jSONObject.toString().getBytes();
    }

    public static byte[] A09(JSONObject jSONObject) {
        return jSONObject.toString().getBytes();
    }

    public final int A0A() {
        try {
            return this.A01.A7f();
        } catch (C02258y e) {
            if (this.A00.A04().A8o()) {
                Log.e(A04, A00(245, 49, 123), e);
                return 0;
            }
            return 0;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:14:0x0054 */
    /* JADX WARN: Incorrect condition in loop: B:19:0x006e */
    /* JADX WARN: Incorrect condition in loop: B:8:0x002c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<org.json.JSONObject> A0C(int r8) {
        /*
            r7 = this;
            r6 = 0
            r0 = -1
            if (r8 != r0) goto L7
            r6 = 1
            r8 = 30
        L7:
            int[] r1 = new int[r8]
            int r0 = r8 * 1000
            byte[] r4 = new byte[r0]
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            com.facebook.ads.redexgen.X.8p<com.facebook.ads.redexgen.X.Ic> r0 = r7.A01     // Catch: com.facebook.ads.redexgen.X.C02258y -> L7a
            com.facebook.ads.redexgen.X.8o r0 = r0.A5a(r4, r1)     // Catch: com.facebook.ads.redexgen.X.C02258y -> L7a
            r3.add(r0)     // Catch: com.facebook.ads.redexgen.X.C02258y -> L7a
            int r2 = r0.A5b()     // Catch: com.facebook.ads.redexgen.X.C02258y -> L7a
            java.util.List r5 = r7.A01(r5, r4, r1)     // Catch: com.facebook.ads.redexgen.X.C02258y -> L7a
        L28:
            boolean r0 = r0.AA0()     // Catch: com.facebook.ads.redexgen.X.C02258y -> L7a
            if (r0 == 0) goto L4c
            if (r2 < r8) goto L32
            if (r6 == 0) goto L4c
        L32:
            if (r6 == 0) goto L35
            goto L3a
        L35:
            int r0 = r8 - r2
            int[] r1 = new int[r0]     // Catch: com.facebook.ads.redexgen.X.C02258y -> L7a
            goto L3e
        L3a:
            r0 = 0
            java.util.Arrays.fill(r1, r0)     // Catch: com.facebook.ads.redexgen.X.C02258y -> L7a
        L3e:
            com.facebook.ads.redexgen.X.8p<com.facebook.ads.redexgen.X.Ic> r0 = r7.A01     // Catch: com.facebook.ads.redexgen.X.C02258y -> L7a
            com.facebook.ads.redexgen.X.8o r0 = r0.A5a(r4, r1)     // Catch: com.facebook.ads.redexgen.X.C02258y -> L7a
            r3.add(r0)     // Catch: com.facebook.ads.redexgen.X.C02258y -> L7a
            java.util.List r5 = r7.A01(r5, r4, r1)     // Catch: com.facebook.ads.redexgen.X.C02258y -> L7a
            goto L28
        L4c:
            java.util.Iterator r2 = r5.iterator()     // Catch: com.facebook.ads.redexgen.X.C02258y -> L7a
        L50:
            boolean r0 = r2.hasNext()     // Catch: com.facebook.ads.redexgen.X.C02258y -> L7a
            if (r0 == 0) goto L66
            java.lang.Object r0 = r2.next()     // Catch: com.facebook.ads.redexgen.X.C02258y -> L7a
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: com.facebook.ads.redexgen.X.C02258y -> L7a
            com.facebook.ads.redexgen.X.8p<com.facebook.ads.redexgen.X.Ic> r1 = r7.A02     // Catch: com.facebook.ads.redexgen.X.C02258y -> L7a
            byte[] r0 = A09(r0)     // Catch: com.facebook.ads.redexgen.X.C02258y -> L7a
            r1.AFq(r0)     // Catch: com.facebook.ads.redexgen.X.C02258y -> L7a
            goto L50
        L66:
            java.util.Iterator r1 = r3.iterator()     // Catch: com.facebook.ads.redexgen.X.C02258y -> L7a
        L6a:
            boolean r0 = r1.hasNext()     // Catch: com.facebook.ads.redexgen.X.C02258y -> L7a
            if (r0 == 0) goto L9b
            java.lang.Object r0 = r1.next()     // Catch: com.facebook.ads.redexgen.X.C02258y -> L7a
            com.facebook.ads.redexgen.X.8o r0 = (com.facebook.ads.redexgen.X.InterfaceC02158o) r0     // Catch: com.facebook.ads.redexgen.X.C02258y -> L7a
            r0.A4y()     // Catch: com.facebook.ads.redexgen.X.C02258y -> L7a
            goto L6a
        L7a:
            r4 = move-exception
            com.facebook.ads.redexgen.X.Y9 r0 = r7.A00
            com.facebook.ads.redexgen.X.7X r0 = r0.A04()
            boolean r0 = r0.A8o()
            if (r0 == 0) goto L96
            java.lang.String r3 = com.facebook.ads.redexgen.X.C0820Xa.A04
            r2 = 359(0x167, float:5.03E-43)
            r1 = 53
            r0 = 44
            java.lang.String r0 = A00(r2, r1, r0)
            android.util.Log.e(r3, r0, r4)
        L96:
            int r0 = com.facebook.ads.redexgen.X.C01997x.A2L
            r7.A05(r0, r4)
        L9b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0820Xa.A0C(int):java.util.List");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02068e
    public final void A4G() {
        try {
            this.A01.clear();
            this.A02.clear();
        } catch (C02258y e) {
            if (this.A00.A04().A8o()) {
                Log.e(A04, A00(55, 30, 66), e);
            }
            A05(C01997x.A2I, e);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8b != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC02068e
    public final void AGT(final C0441Ic c0441Ic, final AbstractC02038b<String> abstractC02038b) {
        Executor executor = ExecutorC0512La.A07;
        final InterfaceC02168p<C0441Ic> interfaceC02168p = this.A01;
        final Y9 y9 = this.A00;
        LX.A00(executor, new AsyncTask<Void, Void, String>(c0441Ic, abstractC02038b, interfaceC02168p, y9) { // from class: com.facebook.ads.redexgen.X.8f
            public static byte[] A05;
            public static String[] A06 = {"eZRg0", "9V6E8W", "xj5QhV", "OA95VIvTvwhgOpg1JzD5APn5ld4Fxl09", "KVXKxw3vFVm2nsonOqXLQ2M9", "1wiEXg5TWKy6aTJl", "hr3sX5JQ1zlqribj", "Vt9t5ut5ZgjhHbMTByjzA5y3IT5Rov5"};
            public C02258y A00;
            public final C7S A01;
            public final AbstractC02038b<String> A02;
            public final InterfaceC02168p<C0441Ic> A03;
            public final C0441Ic A04;

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 55);
                }
                return new String(copyOfRange);
            }

            public static void A02() {
                A05 = new byte[]{26, 40, 31, 31, 2, 31, 77, 0, 8, 30, 30, 12, 10, 8, 77, 14, 12, 3, 3, 2, 25, 77, 15, 8, 77, 3, 24, 1, 1, 13, 46, 38, 38, 40, 47, 38, 97, 36, 55, 36, 47, 53, 123, 97, 9, 30, 24, 20, 9, 31, 36, 31, 26, 15, 26, 25, 26, 8, 30};
            }

            static {
                A02();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8b != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8p != com.facebook.ads.internal.eventstorage.record.RecordDatabase<com.facebook.ads.internal.logging.AdEvent> */
            {
                this.A04 = c0441Ic;
                this.A03 = interfaceC02168p;
                this.A02 = abstractC02038b;
                this.A01 = y9;
            }

            private final String A01(Void... voidArr) {
                byte[] A07;
                if (K0.A02(this)) {
                    return null;
                }
                String str = null;
                try {
                    try {
                        str = UUID.randomUUID().toString();
                        this.A01.A07().A8b(this.A04.A06().toString());
                    } catch (C02258y e) {
                        this.A00 = e;
                        InterfaceC01987w A072 = this.A01.A07();
                        String eventId = A00(44, 15, 76);
                        A072.A9M(eventId, C01997x.A2M, new C02007y(e));
                    }
                    if (TextUtils.isEmpty(this.A04.A08())) {
                        return null;
                    }
                    if (this.A01.A04().A8o()) {
                        String str2 = A00(29, 15, 118) + this.A04.A06().toString() + A00(0, 1, 13) + this.A04.A09().toString();
                    }
                    InterfaceC02168p<C0441Ic> interfaceC02168p2 = this.A03;
                    A07 = C0820Xa.A07(this.A01, str, this.A04);
                    interfaceC02168p2.AFq(A07);
                    return str;
                } catch (Throwable th) {
                    K0.A00(th, this);
                    return null;
                }
            }

            private final void A03(String str) {
                if (K0.A02(this)) {
                    return;
                }
                try {
                    C02258y c02258y = this.A00;
                    if (c02258y == null) {
                        this.A02.A02(str);
                    } else {
                        this.A02.A01(0, (String) Preconditions.checkNotNull(c02258y.getMessage(), A00(1, 28, 90)));
                    }
                } catch (Throwable th) {
                    K0.A00(th, this);
                    String[] strArr = A06;
                    if (strArr[5].length() != strArr[6].length()) {
                        throw new RuntimeException();
                    }
                    A06[1] = "UcJj";
                }
            }

            @Override // android.os.AsyncTask
            public final /* bridge */ /* synthetic */ String doInBackground(Void[] voidArr) {
                if (K0.A02(this)) {
                    return null;
                }
                try {
                    return A01(voidArr);
                } catch (Throwable th) {
                    K0.A00(th, this);
                    if (A06[7].length() != 31) {
                        throw new RuntimeException();
                    }
                    A06[1] = "V";
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            public final /* bridge */ /* synthetic */ void onPostExecute(String str) {
                if (K0.A02(this)) {
                    return;
                }
                try {
                    A03(str);
                } catch (Throwable th) {
                    K0.A00(th, this);
                }
            }
        }, new Void[0]);
    }
}
