package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class X5 implements InterfaceC0285Bj {
    public static byte[] A06;
    public static String[] A07 = {"HjdDham6vZahXcTgWUbgEUyOKT1h9oJK", "zmqCaLmLP1EpiJCwLkXvkq6", "CCbuEfBP0uWpi7Hb1GvcX1U", "o4gQJY", "SL8jfjRVMuAieuHRUGCaPmGht5z7gRIo", "vKspY8ykEL6aMh62Xj5Lb9b4d0l6Zd9e", "qubnoWgXtnI1btvkRUNPdfYA8lWuJej8", "m2UxGDvrz36qppfZRjFAvHiLdTY4MpZ4"};
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    public final long[] A03;
    public final long[] A04;
    public final long A05;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A07[4].charAt(10) != 'A') {
                throw new RuntimeException();
            }
            A07[4] = "JIPli7exaIAIPM4JFFKoxJbhk98Su8Fy";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 64);
            i4++;
        }
    }

    public static void A02() {
        A06 = new byte[]{-102, -67, -79, -11, 6, 3, -14, 5, -6, 0, -1, 4, -26, 4, -50, -115, -127, -48, -57, -57, -44, -58, -43, -44, -98, -44, -56, 27, 17, 34, 13, 27, -27, -60, -72, 12, 1, 5, -3, -19, 11, -43, -83, -46, -33, -40, -43, -77, -40, -50, -49, -30, -110, -42, -49, -40, -47, -34, -46, -89};
    }

    static {
        A02();
    }

    public X5(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.A01 = iArr;
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A04 = jArr3;
        int length = iArr.length;
        this.A00 = length;
        if (length > 0) {
            this.A05 = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.A05 = 0L;
        }
    }

    private final int A00(long j) {
        return C0436Hx.A0B(this.A04, j, true, true);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0285Bj
    public final long A6k() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0285Bj
    public final C0284Bi A7l(long j) {
        int A00 = A00(j);
        C0286Bk c0286Bk = new C0286Bk(this.A04[A00], this.A03[A00]);
        if (c0286Bk.A01 < j) {
            int chunkIndex = this.A00;
            if (A00 != chunkIndex - 1) {
                int chunkIndex2 = A00 + 1;
                long j2 = this.A04[chunkIndex2];
                int chunkIndex3 = A00 + 1;
                C0286Bk seekPoint = new C0286Bk(j2, this.A03[chunkIndex3]);
                return new C0284Bi(c0286Bk, seekPoint);
            }
        }
        return new C0284Bi(c0286Bk);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0285Bj
    public final boolean A95() {
        return true;
    }

    public final String toString() {
        return A01(42, 18, 42) + this.A00 + A01(25, 8, 104) + Arrays.toString(this.A01) + A01(15, 10, 33) + Arrays.toString(this.A03) + A01(33, 9, 88) + Arrays.toString(this.A04) + A01(1, 14, 81) + Arrays.toString(this.A02) + A01(0, 1, 49);
    }
}
