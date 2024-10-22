package com.facebook.ads.redexgen.X;

import android.database.Cursor;
import android.util.Log;
import android.util.Pair;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Dm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0323Dm implements InterfaceC0824Xe {
    public static byte[] A03;
    public static String[] A04 = {"zSqnO64p11LQVC3SPrHTwk7q", "RQQcRArwNRw7pCFobI7zm4AECBhyO", "uX7W3VjoXSZ8mIic8tH9fb17VHeYN2EI", "VdQ4q", "h", "roUcO9bhLUMzgbi0", "6tdL5l5B64y16QievzXwm2hdxMIwTdT2", "M1EyYsdVjnJYnVOvo"};
    public boolean A00 = true;
    public final Y9 A01;
    public final C7b A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 85);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        String[] strArr = A04;
        if (strArr[7].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[0] = "GUa5RhIL61d4FW3HWW0RBx9i";
        strArr2[1] = "4nKtohmUbY7tHai9z2t8ojCMJbrZv";
        A03 = new byte[]{62, 28, 19, 90, 9, 93, 25, 24, 17, 24, 9, 24, 93, 28, 9, 9, 24, 16, 13, 9, 14, 93, 24, 5, 30, 24, 24, 25, 24, 25, 93, 24, 11, 24, 19, 9, 14, 83, 16, 21, 7, 24, 21, 46, 59, 59, 42, 34, 63, 59, Byte.MAX_VALUE, 122, 111, 122, 16, 29, 50, 36, 50, 50, 40, 46, 47, 30, 40, 37, 32, 54, 32, 32, 58, 60, 61, 12, 39, 58, 62, 54, 76, 81, 85, 93, 20, 15, 11, 5, 14, 63, 9, 4, Byte.MAX_VALUE, 114, 123, 110};
    }

    static {
        A04();
    }

    public C0323Dm(Y9 y9) {
        this.A01 = y9;
        this.A02 = new C7b(y9);
    }

    private JSONArray A01(Cursor cursor) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(54, 2, 44), cursor.getString(Y8.A04.A00));
            jSONObject.put(A00(82, 8, 53), cursor.getString(Y8.A09.A00));
            jSONObject.put(A00(90, 4, 94), cursor.getString(Y8.A0A.A00));
            jSONObject.put(A00(78, 4, 109), LM.A02(cursor.getDouble(Y8.A08.A00)));
            jSONObject.put(A00(66, 12, 6), LM.A02(cursor.getDouble(Y8.A07.A00)));
            jSONObject.put(A00(56, 10, 20), cursor.getString(Y8.A06.A00));
            String string = cursor.getString(Y8.A03.A00);
            jSONObject.put(A00(50, 4, 78), string != null ? new JSONObject(string) : new JSONObject());
            jSONObject.put(A00(43, 7, 26), cursor.getString(Y8.A02.A00));
            jSONObject.put(A00(38, 5, 36), this.A01.A03().A7A());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    private JSONArray A02(Cursor cursor) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(54, 2, 44), cursor.getString(2));
            jSONObject.put(A00(82, 8, 53), cursor.getString(0));
            jSONObject.put(A00(90, 4, 94), cursor.getString(4));
            jSONObject.put(A00(78, 4, 109), LM.A02(cursor.getDouble(5)));
            jSONObject.put(A00(66, 12, 6), LM.A02(cursor.getDouble(6)));
            jSONObject.put(A00(56, 10, 20), cursor.getString(7));
            String string = cursor.getString(8);
            jSONObject.put(A00(50, 4, 78), string != null ? new JSONObject(string) : new JSONObject());
            jSONObject.put(A00(43, 7, 26), cursor.getString(9));
            jSONObject.put(A00(38, 5, 36), this.A01.A03().A7A());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static JSONObject A03(Cursor cursor) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        while (cursor.moveToNext()) {
            String string = cursor.getString(Y7.A02.A00);
            String string2 = cursor.getString(Y7.A01.A00);
            String[] strArr = A04;
            if (strArr[6].charAt(14) != strArr[2].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[7] = "IfQdYzKY6vCyBSxPg";
            strArr2[5] = "fxZpsWnZoPKbT5Dt";
            jSONObject.put(string, string2);
        }
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02058d
    public final int A4F(int i) {
        int i2 = 0;
        if (i > -1) {
            try {
                i2 = this.A02.A08(i);
            } catch (Exception e) {
                if (this.A01.A04().A8o()) {
                    Log.e(InterfaceC0824Xe.A00, A00(0, 38, 40), e);
                }
            }
        }
        this.A02.A0I();
        if (this.A00) {
            this.A02.A0J();
        }
        return i2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02068e
    public final void A4G() {
        this.A02.A0H();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02058d
    public final boolean A4z(String str) {
        return this.A02.A0K(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02058d
    public final JSONArray A5t() {
        Cursor cursor = null;
        try {
            cursor = this.A02.A0A();
            JSONArray jSONArray = null;
            if (cursor.getCount() > 0) {
                jSONArray = A01(cursor);
            }
            if (cursor != null) {
                cursor.close();
            }
            return jSONArray;
        } catch (JSONException unused) {
            if (cursor != null) {
                cursor.close();
                return null;
            }
            return null;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02058d
    public final JSONObject A5u() {
        Cursor cursor = null;
        try {
            cursor = this.A02.A0B();
            JSONObject jSONObject = null;
            if (cursor.getCount() > 0) {
                jSONObject = A03(cursor);
            }
            if (cursor != null) {
                cursor.close();
            }
            return jSONObject;
        } catch (JSONException unused) {
            if (cursor != null) {
                cursor.close();
                return null;
            }
            return null;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02058d
    public final int A6s() {
        Cursor cursor = null;
        try {
            cursor = this.A02.A09();
            return cursor.moveToFirst() ? cursor.getInt(0) : 0;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02058d
    public final String A6v(String str) {
        String str2 = null;
        Cursor A0D = this.A02.A0D(str);
        if (A0D != null) {
            if (A0D.moveToNext() && A0D.getCount() > 0) {
                C7Z c7z = Y8.A0A;
                String[] strArr = A04;
                String str3 = strArr[7];
                String eventType = strArr[5];
                if (str3.length() == eventType.length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A04;
                strArr2[3] = "VgiME";
                strArr2[4] = "4";
                String eventType2 = c7z.A01;
                str2 = A0D.getString(A0D.getColumnIndex(eventType2));
            }
            A0D.close();
        }
        return str2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02058d
    public final Pair<JSONObject, JSONArray> A80(int i) {
        Cursor cursor = null;
        try {
            try {
                cursor = this.A02.A0C(i);
                JSONArray events = null;
                JSONObject tokens = null;
                if (cursor.getCount() > 0) {
                    tokens = A03(cursor);
                    events = A02(cursor);
                }
                Pair<JSONObject, JSONArray> pair = new Pair<>(tokens, events);
                if (cursor != null) {
                    cursor.close();
                }
                return pair;
            } catch (JSONException unused) {
                Pair<JSONObject, JSONArray> pair2 = new Pair<>(null, null);
                if (cursor != null) {
                    cursor.close();
                }
                return pair2;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02058d
    public final boolean A8c(String str) {
        return this.A02.A0L(str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8b != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC02068e
    public final void AGT(C0441Ic c0441Ic, AbstractC02038b<String> abstractC02038b) {
        this.A02.A0G(c0441Ic.A08(), c0441Ic.A05().A00, c0441Ic.A06().toString(), c0441Ic.A04(), c0441Ic.A03(), c0441Ic.A07(), c0441Ic.A09(), abstractC02038b);
    }
}
