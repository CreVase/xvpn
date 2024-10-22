package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class SP extends K8 {
    public static byte[] A01;
    public static String[] A02 = {"WjVP47fRQbzFkvh8jITH65ubc4v5SvCG", "KHLch0xvttS1s7pDGgDEm0ErGuqh2Feh", "", "N5tYdahQHQ8ekE9zsl4KMP3kvK277KXb", "RTyub6Z4XGd49fcp4oLDuBYuJ7e8bv6c", "EESkLRk7pQiV173Cki8Pyh", "g0C3qbvxb6pNRGtaTLmHtkzFJg0jsK6T", "9AN"};
    public final /* synthetic */ SM A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[1].charAt(5) != '0') {
                throw new RuntimeException();
            }
            A02[4] = "dM73aw5ks7hDwKSnbdFWLVfeJ3xGYIch";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            int i5 = (copyOfRange[i4] - i3) - 81;
            String[] strArr = A02;
            if (strArr[2].length() != strArr[5].length()) {
                A02[0] = "hwwcl2mktrJEeqefr8kwHu1pjzQ1LhvY";
                copyOfRange[i4] = (byte) i5;
                i4++;
            } else {
                A02[7] = "CzI";
                copyOfRange[i4] = (byte) i5;
                i4 += 0;
            }
        }
    }

    public static void A02() {
        A01 = new byte[]{27, 46, 41, 42, 52, -27, 60, 38, 56, -27, 51, 42, 59, 42, 55, -27, 53, 55, 42, 53, 38, 55, 42, 41};
    }

    static {
        A02();
    }

    public SP(SM sm) {
        this.A00 = sm;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        boolean z;
        P0 p0;
        z = this.A00.A07;
        if (!z) {
            p0 = this.A00.A0F;
            p0.ADN(A00(0, 24, 116));
        }
    }
}
