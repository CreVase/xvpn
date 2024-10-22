package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Ug, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0751Ug implements InterfaceC0442Id {
    public static byte[] A02;
    public static String[] A03 = {"4VJF", "NMiFc9mQHDdEdTYDts8ebbMyjIljV2c0", "gJxI4lQggzgG7l1t48TOLBAVsZm4smpW", "RC", "7emK", "VnvWTQ3PSRLSSOUq71E5D", "jZ42e8scbVg896gjqaujwC7", "gj"};
    public static final String A04;
    public Y9 A00;
    public InterfaceC0824Xe A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A03;
            if (strArr[0].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "6iaNxoAqzoeupDn53l2Cm";
            strArr2[6] = "N7vye13Dqewush4C3JTfsv4";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 104);
            i4++;
        }
    }

    public static void A05() {
        A02 = new byte[]{21, 83, 90, 71, 21, 80, 67, 80, 91, 65, 124, 81, 21, 60, 111, 105, Byte.MAX_VALUE, Byte.MAX_VALUE, 121, 111, 111, 122, 105, 112, 112, 101, 50, 110, 101, 68, 77, 68, 85, 68, 69, 1, 68, 87, 68, 79, 85, 82, 1, 68, 89, 66, 68, 68, 69, 68, 69, 1, 83, 68, 85, 83, 88, 1, 77, 72, 76, 72, 85, 15, 1, 98, 78, 84, 79, 85, 27, 1, 72, 123, 104, 99, 121, 45, 121, 116, 125, 104, 45, 125, Byte.MAX_VALUE, 98, 110, 104, 126, 126, 104, 105, 45, 111, 116, 45, 121, 101, 104, 45, 126, 104, Byte.MAX_VALUE, 123, 104, Byte.MAX_VALUE, 55, 45, 84, 115, 123, 126, 119, 118, 50, 102, 125, 50, 98, 115, 96, 97, 119, 50, 115, 124, 50, 119, 100, 119, 124, 102, 50, 123, 124, 50, 119, 100, 119, 124, 102, 97, 50, 115, 96, 96, 115, 107, 50, 116, 125, 96, 50, 118, 123, 97, 98, 115, 102, 113, 122, 50, 116, 115, 123, 126, 103, 96, 119, 60, 65, 119, 96, 100, 119, 96, 50, 98, 96, 125, 113, 119, 97, 97, 119, 118, 50, 119, 100, 119, 124, 102, 91, 118, 50, 50, 4, 19, 23, 4, 19, 65, 19, 4, 21, 20, 19, 15, 4, 5, 65, 15, 14, 15, 76, 19, 4, 21, 19, 24, 0, 3, 13, 4, 65, 4, 19, 19, 14, 19, 65, 2, 14, 5, 4, 65, 42, 28, 11, 15, 28, 11, 89, 11, 28, 13, 12, 11, 23, 28, 29, 89, 11, 28, 13, 11, 0, 24, 27, 21, 28, 89, 28, 11, 11, 22, 11, 89, 26, 22, 29, 28, 89, 86, 109, 98, 97, 111, 102, 35, 119, 108, 35, 115, 98, 113, 112, 102, 35, 103, 102, 97, 118, 100, 79, 108, 100, 70, 117, 102, 109, 119, 35, 98, 119, 35, 6, 61, 50, 49, 63, 54, 115, 39, 60, 115, 35, 50, 33, 32, 54, 115, 54, 37, 54, 61, 39, 115, 50, 39, 115, 111, 84, 91, 88, 86, 95, 26, 78, 85, 26, 74, 91, 72, 73, 95, 26, 73, 95, 72, 76, 95, 72, 26, 72, 95, 73, 74, 85, 84, 73, 95, 26, 91, 78, 26, 74, 85, 73, 83, 78, 83, 85, 84, 26, 80, 92, 87, 86, 104, 109, 120, 109, 110, 109, Byte.MAX_VALUE, 105, 17, 2, 17, 26, 0, 7, 6, 5, 1, 20, 21, 18, 5, 77, 3, 15, 14, 6, 9, 7, 77, 5, 22, 5, 14, 20, 77, 13, 1, 7, 9, 3, 33, 34, 38, 51, 50, 53, 34, 24, 36, 40, 41, 33, 46, 32, 44, 33, 71, 90, 94, 86, 60, 39, 35, 45, 38, 59};
    }

    static {
        A05();
        A04 = C0751Ug.class.getSimpleName();
    }

    public C0751Ug(Y9 y9, InterfaceC0824Xe interfaceC0824Xe) {
        this.A00 = y9;
        this.A01 = interfaceC0824Xe;
    }

    public static JSONArray A01(Y9 y9, JSONArray jSONArray, JSONArray jSONArray2) {
        int i = 0;
        if (jSONArray != null) {
            int limit = jSONArray.length();
            i = 0 + limit;
        }
        if (jSONArray2 != null) {
            int limit2 = jSONArray2.length();
            i += limit2;
        }
        return A02(y9, jSONArray, jSONArray2, i);
    }

    public static JSONArray A02(Y9 y9, JSONArray jSONArray, JSONArray jSONArray2, int i) {
        if (jSONArray == null) {
            return jSONArray2;
        }
        if (jSONArray2 == null) {
            return jSONArray;
        }
        int length = jSONArray.length();
        int length2 = jSONArray2.length();
        JSONArray jSONArray3 = new JSONArray();
        int eventsIdx = 0;
        int debugIdx = 0;
        JSONObject jSONObject = null;
        JSONObject jSONObject2 = null;
        double d = Double.MAX_VALUE;
        double d2 = Double.MAX_VALUE;
        while (true) {
            if ((eventsIdx < length || debugIdx < length2) && i > 0) {
                String[] strArr = A03;
                if (strArr[0].length() != strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A03;
                strArr2[7] = "aN";
                strArr2[3] = "P5";
                String A00 = A00(435, 4, 91);
                if (eventsIdx < length && jSONObject == null) {
                    try {
                        jSONObject = jSONArray.getJSONObject(eventsIdx);
                        d = jSONObject.getDouble(A00);
                    } catch (JSONException e) {
                        if (y9.A04().A8o()) {
                            Log.e(A04, A00(273, 33, 107) + eventsIdx, e);
                        }
                        jSONObject = null;
                        d = Double.MAX_VALUE;
                    }
                    eventsIdx++;
                }
                if (debugIdx < length2 && jSONObject2 == null) {
                    try {
                        jSONObject2 = jSONArray2.getJSONObject(debugIdx);
                        d2 = jSONObject2.getDouble(A00);
                    } catch (JSONException e2) {
                        if (y9.A04().A8o()) {
                            Log.e(A04, A00(306, 25, 59) + debugIdx, e2);
                        }
                        jSONObject2 = null;
                        d2 = Double.MAX_VALUE;
                    }
                    debugIdx++;
                }
                if (jSONObject != null || jSONObject2 != null) {
                    if (jSONObject == null || d2 < d) {
                        jSONArray3.put(jSONObject2);
                        jSONObject2 = null;
                        d2 = Double.MAX_VALUE;
                    } else {
                        jSONArray3.put(jSONObject);
                        jSONObject = null;
                        d = Double.MAX_VALUE;
                    }
                    i--;
                }
            }
        }
        if (i > 0) {
            if (jSONObject != null) {
                jSONArray3.put(jSONObject);
            } else if (jSONObject2 != null) {
                jSONArray3.put(jSONObject2);
            }
        }
        return jSONArray3;
    }

    private JSONObject A03() {
        JSONArray A032;
        JSONObject A5u = this.A01.A5u();
        JSONArray A5t = this.A01.A5t();
        if (IR.A0P(this.A00) && (A032 = C02017z.A03(this.A00)) != null && A032.length() > 0) {
            Y9 y9 = this.A00;
            String[] strArr = A03;
            if (strArr[7].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[1] = "DqeH9SIpXFi3b8zfs8mhzwqF8zVFhPmm";
            strArr2[2] = "TV1z9woSYeZeWz7dxNs9KlrMFeTbS55S";
            A5t = A01(y9, A032, A5t);
        }
        JSONObject jSONObject = null;
        if (A5t != null) {
            try {
                jSONObject = new JSONObject();
                if (A5u != null) {
                    jSONObject.put(A00(439, 6, 32), A5u);
                }
                jSONObject.put(A00(387, 6, 28), A5t);
            } catch (JSONException unused) {
                return null;
            }
        }
        return jSONObject;
    }

    private JSONObject A04(int i) {
        int A08;
        JSONArray A042;
        Pair<JSONObject, JSONArray> tokensAndEvents = this.A01.A80(i);
        JSONObject jSONObject = (JSONObject) tokensAndEvents.first;
        JSONArray debugLogEvents = (JSONArray) tokensAndEvents.second;
        if (IR.A0P(this.A00) && (A042 = C02017z.A04(this.A00, (A08 = IR.A08(this.A00)))) != null && A042.length() > 0) {
            debugLogEvents = A02(this.A00, A042, debugLogEvents, i + A08);
        }
        JSONObject payload = null;
        if (debugLogEvents != null) {
            try {
                payload = new JSONObject();
                if (jSONObject != null) {
                    payload.put(A00(439, 6, 32), jSONObject);
                }
                payload.put(A00(387, 6, 28), debugLogEvents);
            } catch (JSONException unused) {
                return null;
            }
        }
        return payload;
    }

    private void A06(String str) {
        if (C02017z.A0I(str)) {
            C02017z.A0B(this.A00, str);
        } else {
            this.A01.A8c(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0442Id
    public final JSONObject A4X() {
        int eventLimit = IR.A0F(this.A00);
        return eventLimit > 0 ? A04(eventLimit) : A03();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0442Id
    public final boolean A8y() {
        int eventCount = IR.A0F(this.A00);
        if (eventCount < 1) {
            return false;
        }
        int A6s = this.A01.A6s();
        int eventLimit = C02017z.A00(this.A00);
        return A6s + eventLimit > eventCount;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0442Id
    public final void AAT() {
        int A4F = this.A01.A4F(IR.A0G(this.A00));
        if (A4F > 0) {
            this.A00.A07().A9M(A00(379, 8, 100), C01997x.A10, new C02007y(A00(28, 44, 73) + A4F));
        }
        Y9 y9 = this.A00;
        String[] strArr = A03;
        String str = strArr[5];
        String str2 = strArr[6];
        int attemptsExceededEventsCount = str.length();
        int retryLimit = str2.length();
        if (attemptsExceededEventsCount == retryLimit) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[5] = "bzDkK7DGlCk2AgYUikBmx";
        strArr2[6] = "oAHu9PBino36rPxONmBwiLk";
        C02017z.A0F(y9);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0442Id
    public final void AB3(JSONArray jSONArray) {
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                A06(jSONArray.getJSONObject(i).getString(A00(433, 2, 45)));
            } catch (JSONException e) {
                if (this.A00.A04().A8o()) {
                    String str = A04;
                    String[] strArr = A03;
                    String str2 = strArr[5];
                    String str3 = strArr[6];
                    int i2 = str2.length();
                    int length2 = str3.length();
                    if (i2 == length2) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A03;
                    strArr2[1] = "UiT9WvgcUGvh4UJIWCcVV8uUv9KhPAuj";
                    strArr2[2] = "iCLGRVxWINjUDSHIa5c9b6YKh720uR79";
                    Log.e(str, A00(108, 62, 122), e);
                } else {
                    continue;
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0442Id
    public final boolean AB5(JSONArray jSONArray) {
        String A00 = A00(27, 1, 40);
        boolean z = true;
        boolean A0P = IR.A0P(this.A00);
        for (int errorCode = 0; errorCode < jSONArray.length(); errorCode++) {
            try {
                JSONObject event = jSONArray.getJSONObject(errorCode);
                String string = event.getString(A00(433, 2, 45));
                if (A00(393, 26, 8).equals(string)) {
                    IP.A0Q(this.A00).A2S(event.getString(A00(419, 14, 47)));
                    this.A00.A03().AA1();
                } else {
                    int i = event.getInt(A00(375, 4, 91));
                    if (i == 1) {
                        if (this.A00.A04().A8o()) {
                            String str = A00(170, 25, 122) + string + A00(13, 14, 116);
                            String eventId = this.A01.A6v(string);
                            if (eventId != null) {
                                String str2 = A00(72, 36, 101) + eventId;
                            }
                        }
                        if (!this.A01.A4z(string) && A0P) {
                            C02017z.A0D(string);
                        }
                    } else {
                        String A002 = A00(0, 13, 93);
                        if (i >= 1000 && i < 2000) {
                            if (this.A00.A04().A8o()) {
                                Log.e(A04, A00(236, 37, 17) + i + A002 + string + A00);
                            }
                            A06(string);
                            z = false;
                        } else if (i >= 2000 && i < 3000) {
                            if (this.A00.A04().A8o()) {
                                Log.e(A04, A00(195, 41, 9) + i + A002 + string + A00);
                            }
                            if (!this.A01.A4z(string) && A0P) {
                                C02017z.A0D(string);
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (this.A00.A04().A8o()) {
                    Log.e(A04, A00(331, 44, 82) + errorCode + A00, e);
                }
                z = false;
            }
        }
        return z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0442Id
    public final void ACd() {
        this.A01.A4G();
        C02017z.A07(this.A00);
    }
}
