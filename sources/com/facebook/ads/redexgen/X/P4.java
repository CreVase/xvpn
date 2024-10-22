package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class P4 implements Runnable {
    public static byte[] A01;
    public static String[] A02 = {"8vJSkdftfADdQfAHliFxPF8rPO9WPGls", "GhlXUiQB5e5u02XqNxNWNeCKPeVKjYEZ", "Gph9c0UvmRxipzP0t5nr5UcpcMkZF", "2Hx", "Z7V0Td9h4", "73nZsDchDyg56oZ4XPBfjpsU", "FVxK20XbexvbAX1X2tgr9gQBHO7cWF", "2kskKAMtduGXueKHObaD2J8oFHf05nvp"};
    public final /* synthetic */ C7N A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 18);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {12, 51, 62, 63, 53, 10, 54, 59, 35, 56, 59, 57, 49, 31, 40, 40, 53, 40};
        if (A02[1].charAt(23) != 'K') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[7] = "A0q876J4tZs52Ekfd4RAns8rddsLZMZI";
        strArr[0] = "8q1dRMivP5Tdv15zR8IgwT8qhlVYesmy";
        A01 = bArr;
    }

    static {
        A01();
    }

    public P4(C7N c7n) {
        this.A00 = c7n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A0G(A00(0, 18, 72));
        } catch (Throwable th) {
            if (A02[1].charAt(23) != 'K') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[4] = "fqamCUNwf";
            strArr[5] = "B5vyeoYMTrLFIeMZvtcbxM1r";
            K0.A00(th, this);
        }
    }
}
