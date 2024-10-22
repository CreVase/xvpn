package com.facebook.ads.redexgen.X;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class CS {
    public static byte[] A0B;
    public static final int A0C;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public final int[] A09 = new int[255];
    public final C0420Hh A0A = new C0420Hh(255);

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 10);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0B = new byte[]{122, -110, -110, 126, -85, -66, -74, -85, -87, -70, -85, -86, 102, -107, -83, -83, -103, 102, -87, -89, -74, -70, -69, -72, -85, 102, -74, -89, -70, -70, -85, -72, -76, 102, -89, -70, 102, -88, -85, -83, -81, -76, 102, -75, -84, 102, -74, -89, -83, -85, -63, -70, -65, -63, -68, -68, -69, -66, -64, -79, -80, 108, -82, -75, -64, 108, -65, -64, -66, -79, -83, -71, 108, -66, -79, -62, -75, -65, -75, -69, -70};
    }

    static {
        A01();
        A0C = C0436Hx.A08(A00(0, 4, 33));
    }

    public final void A02() {
        this.A03 = 0;
        this.A04 = 0;
        this.A05 = 0L;
        this.A08 = 0L;
        this.A07 = 0L;
        this.A06 = 0L;
        this.A02 = 0;
        this.A01 = 0;
        this.A00 = 0;
    }

    public final boolean A03(InterfaceC0279Bb interfaceC0279Bb, boolean z) throws IOException, InterruptedException {
        this.A0A.A0V();
        A02();
        boolean hasEnoughBytes = interfaceC0279Bb.A7B() == -1 || interfaceC0279Bb.A7B() - interfaceC0279Bb.A7V() >= 27;
        if (hasEnoughBytes) {
            boolean hasEnoughBytes2 = interfaceC0279Bb.ADm(this.A0A.A00, 0, 27, true);
            if (hasEnoughBytes2) {
                if (this.A0A.A0M() != A0C) {
                    if (z) {
                        return false;
                    }
                    throw new C02309d(A00(4, 46, 60));
                }
                int A0E = this.A0A.A0E();
                this.A03 = A0E;
                if (A0E != 0) {
                    if (z) {
                        return false;
                    }
                    throw new C02309d(A00(50, 31, 66));
                }
                this.A04 = this.A0A.A0E();
                this.A05 = this.A0A.A0J();
                this.A08 = this.A0A.A0K();
                this.A07 = this.A0A.A0K();
                this.A06 = this.A0A.A0K();
                int A0E2 = this.A0A.A0E();
                this.A02 = A0E2;
                this.A01 = A0E2 + 27;
                this.A0A.A0V();
                interfaceC0279Bb.ADl(this.A0A.A00, 0, this.A02);
                for (int i = 0; i < this.A02; i++) {
                    this.A09[i] = this.A0A.A0E();
                    int i2 = this.A00;
                    this.A00 = i2 + this.A09[i];
                }
                return true;
            }
        }
        if (z) {
            return false;
        }
        throw new EOFException();
    }
}
