package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Uf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0750Uf extends K8 {
    public static byte[] A01;
    public final /* synthetic */ C7S A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 51);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{111, 99, 97, 34, 106, 109, 111, 105, 110, 99, 99, 103, 34, 109, 104, Byte.MAX_VALUE, 34, 64, 67, 79, 77, 64, 83, 79, 67, 89, 66, 88, 73, 94, 95, 88, 91, 87, 85, 88, 107, 87, 91, 65, 90, 64, 81, 70, 71, 84, 92, 88, 74, 76, 75, 92, 93, 102, 74, 92, 74, 74, 80, 86, 87, 102, 80, 93, 108, 100, 96, 114, 116, 115, 100, 101, 94, 114, 100, 114, 114, 104, 110, 111, 94, 117, 104, 108, 100};
    }

    public C0750Uf(C7S c7s) {
        this.A00 = c7s;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        AtomicInteger atomicInteger;
        SharedPreferences sharedPreferences = null;
        try {
            sharedPreferences = this.A00.getApplicationContext().getSharedPreferences(ProcessUtils.getProcessSpecificName(A00(0, 31, 63), this.A00), 0);
            Map<String, ?> all = sharedPreferences.getAll();
            if (all.size() > 1) {
                C7S c7s = this.A00;
                C0455Iq.A06(c7s, C0667Qz.A00(c7s), all);
            }
            sharedPreferences.edit().clear().apply();
            sharedPreferences.edit().putString(A00(45, 19, 10), this.A00.A08().A02()).putString(A00(64, 21, 50), LM.A02(this.A00.A08().A01())).apply();
        } catch (JSONException e) {
            this.A00.A07().A9M(A00(31, 14, 7), 3502, new C02007y(e));
            sharedPreferences.edit().clear().apply();
        }
        synchronized (C0455Iq.class) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (Map.Entry entry : C0455Iq.A02().entrySet()) {
                edit.putInt((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
            }
            edit.apply();
            atomicInteger = C0455Iq.A04;
            atomicInteger.set(2);
        }
    }
}
