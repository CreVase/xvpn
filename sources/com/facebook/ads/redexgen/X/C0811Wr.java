package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0811Wr implements InterfaceC0292Bs {
    public static byte[] A07;
    public static String[] A08 = {"S6y5l6jxI9", "6mnEH66ZFffSlH4yeHJS8qNG", "YOAMbMDgHDJdJlquETda64yXe2Dsnigk", "hsyrHKVntalAWTsGKMDD", "vPfGZ", "fU8euoLNwl", "f8hQ6WKdo4yu3", "0USUeFTSnT76dGHmDwgcSkrJJgtZvyOb"};
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC0293Bu A03;
    public final byte[] A06 = new byte[8];
    public final ArrayDeque<C0291Br> A05 = new ArrayDeque<>();
    public final C0295Bz A04 = new C0295Bz();

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 40);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A07 = new byte[]{124, -95, -87, -108, -97, -100, -105, 83, -104, -97, -104, -96, -104, -95, -89, 83, -89, -84, -93, -104, 83, -100, -63, -55, -76, -65, -68, -73, 115, -71, -65, -62, -76, -57, 115, -58, -68, -51, -72, -115, 115, -27, 10, 18, -3, 8, 5, 0, -68, 5, 10, 16, 1, 3, 1, 14, -68, 15, 5, 22, 1, -42, -68, -127, -94, -96, -105, -100, -107, 78, -109, -102, -109, -101, -109, -100, -94, 78, -95, -105, -88, -109, 104, 78};
    }

    static {
        A05();
    }

    private double A00(InterfaceC0279Bb interfaceC0279Bb, int i) throws IOException, InterruptedException {
        long A02 = A02(interfaceC0279Bb, i);
        if (i == 4) {
            return Float.intBitsToFloat((int) A02);
        }
        return Double.longBitsToDouble(A02);
    }

    private long A01(InterfaceC0279Bb interfaceC0279Bb) throws IOException, InterruptedException {
        interfaceC0279Bb.AEm();
        while (true) {
            interfaceC0279Bb.ADl(this.A06, 0, 4);
            int A00 = C0295Bz.A00(this.A06[0]);
            if (A00 != -1 && A00 <= 4) {
                int A01 = (int) C0295Bz.A01(this.A06, A00, false);
                if (this.A03.A8v(A01)) {
                    interfaceC0279Bb.AFe(A00);
                    return A01;
                }
            }
            interfaceC0279Bb.AFe(1);
        }
    }

    private long A02(InterfaceC0279Bb interfaceC0279Bb, int i) throws IOException, InterruptedException {
        interfaceC0279Bb.readFully(this.A06, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long value = this.A06[i2] & 255;
            j = (j << 8) | value;
        }
        return j;
    }

    private String A04(InterfaceC0279Bb interfaceC0279Bb, int i) throws IOException, InterruptedException {
        if (i == 0) {
            return A03(0, 0, 103);
        }
        byte[] bArr = new byte[i];
        interfaceC0279Bb.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0292Bs
    public final void A8f(InterfaceC0293Bu interfaceC0293Bu) {
        this.A03 = interfaceC0293Bu;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0292Bs
    public final boolean AEB(InterfaceC0279Bb interfaceC0279Bb) throws IOException, InterruptedException {
        long j;
        int i;
        HI.A04(this.A03 != null);
        while (true) {
            if (!this.A05.isEmpty()) {
                long A7a = interfaceC0279Bb.A7a();
                C0291Br peek = this.A05.peek();
                if (A08[4].length() == 19) {
                    throw new RuntimeException();
                }
                A08[1] = "iTM85rd";
                j = peek.A01;
                if (A7a >= j) {
                    InterfaceC0293Bu interfaceC0293Bu = this.A03;
                    i = this.A05.pop().A00;
                    interfaceC0293Bu.A5S(i);
                    return true;
                }
            }
            if (this.A01 == 0) {
                long A05 = this.A04.A05(interfaceC0279Bb, true, false, 4);
                if (A05 == -2) {
                    A05 = A01(interfaceC0279Bb);
                }
                if (A05 == -1) {
                    return false;
                }
                this.A00 = (int) A05;
                this.A01 = 1;
            }
            if (this.A01 == 1) {
                this.A02 = this.A04.A05(interfaceC0279Bb, false, true, 8);
                this.A01 = 2;
            }
            int A6l = this.A03.A6l(this.A00);
            switch (A6l) {
                case 0:
                    int type = (int) this.A02;
                    interfaceC0279Bb.AFe(type);
                    this.A01 = 0;
                case 1:
                    long elementContentPosition = interfaceC0279Bb.A7a();
                    this.A05.push(new C0291Br(this.A00, elementContentPosition + this.A02));
                    InterfaceC0293Bu interfaceC0293Bu2 = this.A03;
                    int i2 = this.A00;
                    long elementEndPosition = this.A02;
                    interfaceC0293Bu2.AFj(i2, elementContentPosition, elementEndPosition);
                    this.A01 = 0;
                    return true;
                case 2:
                    long j2 = this.A02;
                    if (j2 <= 8) {
                        this.A03.A8j(this.A00, A02(interfaceC0279Bb, (int) j2));
                        this.A01 = 0;
                        return true;
                    }
                    throw new C02309d(A03(41, 22, 116) + this.A02);
                case 3:
                    long j3 = this.A02;
                    if (j3 <= 2147483647L) {
                        this.A03.AFr(this.A00, A04(interfaceC0279Bb, (int) j3));
                        this.A01 = 0;
                        return true;
                    }
                    throw new C02309d(A03(63, 21, 6) + this.A02);
                case 4:
                    this.A03.A3y(this.A00, (int) this.A02, interfaceC0279Bb);
                    if (A08[7].charAt(2) != 'S') {
                        A08[2] = "x8X2xTnJq9Kheln0ABdW7PO8kghsREvE";
                        this.A01 = 0;
                        return true;
                    }
                    A08[4] = "mGqeeb15RRoJ11oGs7LhfnjQvY";
                    this.A01 = 0;
                    return true;
                case 5:
                    long j4 = this.A02;
                    if (j4 == 4 || j4 == 8) {
                        this.A03.A5f(this.A00, A00(interfaceC0279Bb, (int) j4));
                        this.A01 = 0;
                        return true;
                    }
                    throw new C02309d(A03(21, 20, 43) + this.A02);
                default:
                    throw new C02309d(A03(0, 21, 11) + A6l);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0292Bs
    public final void reset() {
        this.A01 = 0;
        this.A05.clear();
        this.A04.A06();
    }
}
