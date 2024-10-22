package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class C2 {
    public static byte[] A09;
    public static String[] A0A = {"WDcyaL9oeoAbLzImXLrrdZNjVRrzcxRy", "ME9PFK50DMSVlKN2bxn", "gAphC5qX8pzOC3bbBnmZFpQJv5fhqgvp", "JPEMy1g84hpaqLtC7n4l8lpeHeJzlyM", "bln1Uon0G", "FjG6mf5q9yXvdNgXZQEHKWlpLPgsZNOr", "dYpTLYsEmL6RycpaLs1UjMTFbai8", "KiONmpfliC6BX3IrEZz"};
    public int A00;
    public int A01;
    public long A02;
    public int A03;
    public int A04;
    public final int A05;
    public final C0420Hh A06;
    public final C0420Hh A07;
    public final boolean A08;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 43);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {109, 98, 121, 120, Byte.MAX_VALUE, 84, 104, 99, 126, 101, 96, 43, 102, 126, 120, Byte.MAX_VALUE, 43, 105, 110, 43, 58};
        String[] strArr = A0A;
        if (strArr[1].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[3] = "zNoXMjNr5peo3NkCnCQ1IuM2DM0yQ7k";
        strArr2[6] = "1lOT5Wh9g7SFemsLLNpHXLUAtLi5";
        A09 = bArr;
    }

    static {
        A01();
    }

    public C2(C0420Hh c0420Hh, C0420Hh c0420Hh2, boolean z) {
        this.A07 = c0420Hh;
        this.A06 = c0420Hh2;
        this.A08 = z;
        c0420Hh2.A0Y(12);
        this.A05 = c0420Hh2.A0H();
        c0420Hh.A0Y(12);
        this.A04 = c0420Hh.A0H();
        HI.A06(c0420Hh.A08() == 1, A00(0, 21, 32));
        this.A00 = -1;
    }

    public final boolean A02() {
        long A0M;
        int i;
        int i2 = this.A00 + 1;
        this.A00 = i2;
        if (i2 == this.A05) {
            return false;
        }
        if (this.A08) {
            A0M = this.A06.A0N();
        } else {
            A0M = this.A06.A0M();
        }
        this.A02 = A0M;
        if (this.A00 == this.A03) {
            this.A01 = this.A07.A0H();
            this.A07.A0Z(4);
            int i3 = this.A04 - 1;
            this.A04 = i3;
            if (i3 > 0) {
                int A0H = this.A07.A0H();
                if (A0A[5].charAt(17) != 'Q') {
                    throw new RuntimeException();
                }
                A0A[4] = "w3cW";
                i = A0H - 1;
            } else {
                i = -1;
            }
            this.A03 = i;
        }
        return true;
    }
}
