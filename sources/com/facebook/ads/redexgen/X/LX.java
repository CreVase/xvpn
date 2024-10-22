package com.facebook.ads.redexgen.X;

import android.os.AsyncTask;
import android.os.Build;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* loaded from: assets/audience_network.dex */
public final class LX {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 118);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-9, 4, -6, 8, 5, -1, -6, -60, 5, 9, -60, -41, 9, 15, 4, -7, -22, -9, 9, 1};
    }

    public static <P, PR, R> AsyncTask<P, PR, R> A00(Executor executor, AsyncTask<P, PR, R> task, P... params) {
        if (Build.VERSION.SDK_INT >= 11) {
            task.executeOnExecutor(executor, params);
        } else {
            task.execute(params);
        }
        return task;
    }

    public static void A02() {
        try {
            Class.forName(A01(0, 20, 32));
        } catch (Throwable unused) {
        }
    }
}
