package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0818Wy implements InterfaceC0278Ba {
    public static byte[] A07;
    public static String[] A08 = {"ovn62aUcwqSIvWTqoELg4J4D8wHkUDmq", "Ycr5XQrqBi4bqXq", "xp8qJzBZ1bRZYruPJEcRAHgYPTR5RYjX", "i3q4o3QoTWkNmhcyfYOgrV6edePVNuRX", "3foLzBlJQPuSe9je9cnopJfCpNuQ", "jIofLs5qujimwrYxWQlB52zkZNTbvGhY", "Oin2hfMzoDcJa9P29jyigMxfd8hffyV", "DiUz7SyfwAQ"};
    public static final InterfaceC0281Bd A09;
    public static final int A0A;
    public static final byte[] A0B;
    public static final byte[] A0C;
    public static final int[] A0D;
    public static final int[] A0E;
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC0288Bm A03;
    public boolean A04;
    public boolean A05;
    public final byte[] A06 = new byte[1];

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b2 = (byte) ((copyOfRange[i4] - i3) - 104);
            String[] strArr = A08;
            if (strArr[4].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A08[7] = "o17bMTHd2bo";
            copyOfRange[i4] = b2;
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        byte[] bArr = {-89, -19, -7, -24, -12, -20, -89, -5, 0, -9, -20, -89, -65, -67, -35, -23, -18, -90, -17, -19, 13, 25, 30, -7, 35, 14, -42, 14, 58, 64, 55, 47, -21, 57, 58, 63, -21, 49, 52, 57, 47, -21, 12, 24, 29, -21, 51, 48, 44, 47, 48, 61, -7, 37, 72, 72, 65, 67, 61, 72, -4, 29, 41, 46, -4, 36, 73, 81, 60, 71, 68, 63, -5, 75, 60, 63, 63, 68, 73, 66, -5, 61, 68, 79, 78, -5, 65, 74, 77, -5, 65, 77, 60, 72, 64, -5, 67, 64, 60, 63, 64, 77, -5, -53, -65, -34, -55, 67, 87, 70, 75, 81, 17, 21, 73, 82, 82, -3, 17, 0, 5, 11, -53, -3, 9, 14, -55, 19, -2};
        if (A08[6].length() != 31) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[0] = "iWdi7SFZoODeZbEJMl3L6ntPbKeDMNvO";
        strArr[2] = "0wFRuzGYIju4XbKNAoPYNxHAh615x32s";
        A07 = bArr;
    }

    static {
        A05();
        A09 = new C0819Wz();
        A0D = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        A0E = iArr;
        A0B = C0436Hx.A0i(A03(12, 6, 52));
        A0C = C0436Hx.A0i(A03(18, 9, 100));
        A0A = iArr[8];
    }

    private int A00(int i) throws C02309d {
        String A03;
        if (!A07(i)) {
            StringBuilder append = new StringBuilder().append(A03(53, 12, 116));
            if (!this.A05) {
                A03 = A03(103, 2, 21);
            } else if (A08[6].length() == 31) {
                A08[7] = "wEjTIiVmShi";
                A03 = A03(105, 2, 31);
            }
            throw new C02309d(append.append(A03).append(A03(0, 12, 31)).append(i).toString());
        }
        if (this.A05) {
            return A0E[i];
        }
        int[] iArr = A0D;
        if (A08[6].length() == 31) {
            String[] strArr = A08;
            strArr[4] = "W5GqdpRCUv4UTAd2FZcqfYNQbOUH";
            strArr[1] = "vSYrWd8JkI4l23w";
            return iArr[i];
        }
        throw new RuntimeException();
    }

    private int A01(InterfaceC0279Bb interfaceC0279Bb) throws IOException, InterruptedException {
        interfaceC0279Bb.AEm();
        interfaceC0279Bb.ADl(this.A06, 0, 1);
        byte b2 = this.A06[0];
        if ((b2 & 131) <= 0) {
            return A00((b2 >> 3) & 15);
        }
        throw new C02309d(A03(65, 38, 115) + ((int) b2));
    }

    private int A02(InterfaceC0279Bb interfaceC0279Bb) throws IOException, InterruptedException {
        if (this.A00 == 0) {
            try {
                int A01 = A01(interfaceC0279Bb);
                this.A01 = A01;
                this.A00 = A01;
            } catch (EOFException unused) {
                return -1;
            }
        }
        int AEq = this.A03.AEq(interfaceC0279Bb, this.A00, true);
        if (AEq == -1) {
            return -1;
        }
        int bytesAppended = this.A00 - AEq;
        this.A00 = bytesAppended;
        if (bytesAppended > 0) {
            return 0;
        }
        this.A03.AEs(this.A02, 1, this.A01, 0, null);
        this.A02 += 20000;
        return 0;
    }

    private void A04() {
        if (!this.A04) {
            this.A04 = true;
            boolean z = this.A05;
            this.A03.A5j(Format.A06(null, z ? A03(117, 12, 52) : A03(107, 10, 122), null, -1, A0A, 1, z ? 16000 : 8000, -1, null, null, 0, null));
        }
    }

    private boolean A06(int i) {
        return !this.A05 && (i < 12 || i > 14);
    }

    private boolean A07(int i) {
        return i >= 0 && i <= 15 && (A08(i) || A06(i));
    }

    private boolean A08(int i) {
        if (this.A05) {
            if (i >= 10) {
                if (A08[6].length() != 31) {
                    throw new RuntimeException();
                }
                A08[5] = "qMGeUOCLNxoOBJxwE1u31s5i7NTepy4l";
                if (i > 13) {
                }
            }
            return true;
        }
        return false;
    }

    private boolean A09(InterfaceC0279Bb interfaceC0279Bb) throws IOException, InterruptedException {
        byte[] bArr = A0B;
        if (A0A(interfaceC0279Bb, bArr)) {
            this.A05 = false;
            interfaceC0279Bb.AFe(bArr.length);
            return true;
        }
        byte[] bArr2 = A0C;
        if (!A0A(interfaceC0279Bb, bArr2)) {
            return false;
        }
        this.A05 = true;
        interfaceC0279Bb.AFe(bArr2.length);
        return true;
    }

    private boolean A0A(InterfaceC0279Bb interfaceC0279Bb, byte[] bArr) throws IOException, InterruptedException {
        interfaceC0279Bb.AEm();
        byte[] bArr2 = new byte[bArr.length];
        interfaceC0279Bb.ADl(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0278Ba
    public final void A8e(InterfaceC0280Bc interfaceC0280Bc) {
        interfaceC0280Bc.AEx(new X0(-9223372036854775807L));
        this.A03 = interfaceC0280Bc.AFx(0, 1);
        interfaceC0280Bc.A5T();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0278Ba
    public final int AE9(InterfaceC0279Bb interfaceC0279Bb, C0283Bh c0283Bh) throws IOException, InterruptedException {
        if (interfaceC0279Bb.A7a() != 0 || A09(interfaceC0279Bb)) {
            A04();
            return A02(interfaceC0279Bb);
        }
        throw new C02309d(A03(27, 26, 99));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0278Ba
    public final void AEw(long j, long j2) {
        this.A02 = 0L;
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0278Ba
    public final boolean AFg(InterfaceC0279Bb interfaceC0279Bb) throws IOException, InterruptedException {
        return A09(interfaceC0279Bb);
    }
}
