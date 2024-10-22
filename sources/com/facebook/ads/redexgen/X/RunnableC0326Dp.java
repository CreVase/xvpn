package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Dp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0326Dp implements Runnable {
    public static byte[] A01;
    public static String[] A02 = {"trtHxdWfI8aUUasJnLCFOWNhTEgT5SfR", "ildDLLQ3Py5XZqRSamTTI6YoT50zpskF", "dVw5UxmZMKob3SUb3uvB6OES0lFAFJfM", "IR8fXYoB6j0jxnrkbU78JZ5o5XE94BNQ", "b3RCFjVWO3b8eRQaxF9", "jCTIeE11ZTJ65IoFy1xYkV7ELZ3vCqIN", "TgSfnKfrSSedvNLmmcoIbwvrw3BnVtDY", "eNW8IuS2yi6nO7dU30TIFIzk8f1M77f"};
    public final /* synthetic */ C0335Dy A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] ^ i3) ^ 26;
            if (A02[0].charAt(19) == 't') {
                throw new RuntimeException();
            }
            A02[6] = "Wfj4XOUJd4uRzIFmDg2tyEJWBqTNOatQ";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{76, 110, 121, 100, 98, 99, 45, 107, 100, 97, 104, 45, 97, 98, 108, 105, 100, 99, 106, 45, 107, 108, 100, 97, 104, 105, 35, 12, 39, 63, 38, 36, 39, 41, 44, 5, 41, 38, 41, 47, 45, 58};
    }

    static {
        A01();
    }

    public RunnableC0326Dp(C0335Dy c0335Dy) {
        this.A00 = c0335Dy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DownloadAction[] actions;
        Handler handler;
        C0317De c0317De;
        DownloadAction.Deserializer[] deserializerArr;
        if (K0.A02(this)) {
            return;
        }
        try {
            try {
                c0317De = this.A00.A09;
                deserializerArr = this.A00.A0E;
                actions = c0317De.A03(deserializerArr);
            } catch (Throwable th) {
                Log.e(A00(27, 15, 82), A00(0, 27, 23), th);
                actions = new DownloadAction[0];
            }
            handler = this.A00.A07;
            handler.post(new RunnableC0325Do(this, actions));
        } catch (Throwable th2) {
            K0.A00(th2, this);
        }
    }
}
