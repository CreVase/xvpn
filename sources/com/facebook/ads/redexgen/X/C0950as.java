package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.as, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0950as extends K8 {
    public static byte[] A02;
    public final /* synthetic */ C00290v A00;
    public final /* synthetic */ JSONObject A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 21);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{7, 19, 4, 16, 20, 4, 15, 2, 24, 62, 2, 0, 17, 17, 8, 15, 6};
    }

    public C0950as(C00290v c00290v, JSONObject jSONObject) {
        this.A00 = c00290v;
        this.A01 = jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        C7S c7s;
        C7S c7s2;
        CountDownLatch countDownLatch;
        C00280u c00280u;
        C00280u c00280u2;
        CountDownLatch countDownLatch2;
        try {
            countDownLatch = this.A00.A05;
            countDownLatch.await();
            c00280u = this.A00.A02;
            synchronized (c00280u) {
                c00280u2 = this.A00.A02;
                c00280u2.A0B(this.A01);
                countDownLatch2 = this.A00.A06;
                countDownLatch2.countDown();
            }
        } catch (InterruptedException e) {
            c7s2 = this.A00.A03;
            c7s2.A07().A9M(A00(0, 17, 116), C01997x.A1B, new C02007y(e));
        } catch (JSONException e2) {
            this.A00.A0M();
            c7s = this.A00.A03;
            c7s.A07().A9M(A00(0, 17, 116), C01997x.A1A, new C02007y(e2));
        }
    }
}
