package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class JB implements Runnable {
    public static byte[] A03;
    public final /* synthetic */ C7S A00;
    public final /* synthetic */ JE A01;
    public final /* synthetic */ String A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 121);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{3, 27, 5, 60, 61, 39, 32, 59, 38, 45, 89, 78, 91, 68, 89, 95, 66, 69, 76, 54, 33, 53, 49, 33, 55, 48, 27, 45, 32};
    }

    public JB(JE je, String str, C7S c7s) {
        this.A01 = je;
        this.A02 = str;
        this.A00 = c7s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        List list2;
        ArrayList arrayList;
        List list3;
        int i;
        int i2;
        int i3;
        if (K0.A02(this)) {
            return;
        }
        try {
            C02007y c02007y = new C02007y(A00(0, 3, 52));
            JSONObject jSONObject = new JSONObject();
            JSONArray logArray = new JSONArray();
            jSONObject.put(A00(3, 7, 45), logArray);
            jSONObject.put(A00(19, 10, 61), this.A02);
            list = this.A01.A0D;
            synchronized (list) {
                list2 = this.A01.A0D;
                arrayList = new ArrayList(list2);
                list3 = this.A01.A0D;
                list3.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                JD jd = (JD) it.next();
                StringBuilder append = new StringBuilder().append(A00(0, 0, 60));
                i = jd.A00;
                StringBuilder append2 = append.append(i).append(';');
                i2 = jd.A02;
                StringBuilder append3 = append2.append(i2).append(';');
                i3 = jd.A01;
                logArray.put(append3.append(i3).toString());
            }
            c02007y.A05(jSONObject);
            c02007y.A03(1);
            this.A00.A07().A9N(A00(10, 9, 82), C01997x.A2Q, c02007y);
        } catch (JSONException unused) {
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
