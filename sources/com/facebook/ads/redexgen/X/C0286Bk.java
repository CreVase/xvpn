package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Bk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0286Bk {
    public static byte[] A02;
    public static final C0286Bk A03;
    public final long A00;
    public final long A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{114, 126, 46, 49, 45, 55, 42, 55, 49, 48, 99, 50, 29, 0, 4, 12, 60, 26, 84, 102};
    }

    static {
        A01();
        A03 = new C0286Bk(0L, 0L);
    }

    public C0286Bk(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0286Bk c0286Bk = (C0286Bk) obj;
        return this.A01 == c0286Bk.A01 && this.A00 == c0286Bk.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public final String toString() {
        return A00(11, 8, 83) + this.A01 + A00(0, 11, 100) + this.A00 + A00(19, 1, 1);
    }
}
