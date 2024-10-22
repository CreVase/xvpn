package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class W3 implements InterfaceC0278Ba {
    public static byte[] A05;
    public static String[] A06 = {"4UYaWsXN1cGpTlRGsO1EVWVYv3mJMVWU", "hbK8JAe0mxfaYRX1PJWZwY", "A0tXjRJ", "osk77A0r9", "0YYQ7Ec", "0ahCLR5uyRlwKx93emwBc8GJDT750HRT", "YIO", "F1mMZvBQ8EiEftVGCLgPL0zcj9avMacR"};
    public static final InterfaceC0281Bd A07;
    public int A00;
    public int A01;
    public InterfaceC0280Bc A02;
    public InterfaceC0288Bm A03;
    public W2 A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{53, 78, 83, 85, 80, 80, 79, 82, 84, 69, 68, 0, 79, 82, 0, 85, 78, 82, 69, 67, 79, 71, 78, 73, 90, 69, 68, 0, 87, 65, 86, 0, 72, 69, 65, 68, 69, 82, 14, 52, 72, 55, 60, 66, 2, 69, 52, 74};
    }

    static {
        A01();
        A07 = new W4();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0278Ba
    public final void A8e(InterfaceC0280Bc interfaceC0280Bc) {
        this.A02 = interfaceC0280Bc;
        this.A03 = interfaceC0280Bc.AFx(0, 1);
        this.A04 = null;
        interfaceC0280Bc.A5T();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0278Ba
    public final int AE9(InterfaceC0279Bb interfaceC0279Bb, C0283Bh c0283Bh) throws IOException, InterruptedException {
        if (this.A04 == null) {
            W2 A00 = C0313Cx.A00(interfaceC0279Bb);
            this.A04 = A00;
            if (A00 != null) {
                this.A03.A5j(Format.A06(null, A00(39, 9, 113), null, A00.A00(), 32768, this.A04.A03(), this.A04.A04(), this.A04.A02(), null, null, 0, null));
                this.A00 = this.A04.A01();
            } else {
                throw new C02309d(A00(0, 39, 126));
            }
        }
        W2 w2 = this.A04;
        if (A06[0].charAt(24) != 'v') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[6] = "XBd";
        strArr[3] = "hS3DTCCH9";
        if (!w2.A07()) {
            C0313Cx.A03(interfaceC0279Bb, this.A04);
            this.A02.AEx(this.A04);
        }
        int AEq = this.A03.AEq(interfaceC0279Bb, 32768 - this.A01, true);
        if (AEq != -1) {
            this.A01 += AEq;
        }
        int i = this.A01 / this.A00;
        if (i > 0) {
            long A052 = this.A04.A05(interfaceC0279Bb.A7a() - this.A01);
            int i2 = this.A00 * i;
            int i3 = this.A01 - i2;
            this.A01 = i3;
            this.A03.AEs(A052, 1, i2, i3, null);
        }
        return AEq == -1 ? -1 : 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0278Ba
    public final void AEw(long j, long j2) {
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0278Ba
    public final boolean AFg(InterfaceC0279Bb interfaceC0279Bb) throws IOException, InterruptedException {
        return C0313Cx.A00(interfaceC0279Bb) != null;
    }
}
