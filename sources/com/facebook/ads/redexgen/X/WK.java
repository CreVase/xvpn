package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class WK implements InterfaceC0299Cg {
    public static byte[] A06;
    public static String[] A07 = {"c0KpkRjZorNQD76", "v", "0d4inMg3wDkuo1aYYl0ssqqGC", "DDXERfdvXnPt4luj6e7N9DVUtx6ZaQcR", "MB0SdpAzdDPGS5LRihVQgeZ9YJgSZ4OW", "1ftUnjVA0zWQWzcI2VyXZGsvfHTse3XE", "DWX3euW52jSmR8J8g1ui9PfHl", "CNcDYli8yhj93EfpNTcuq0KbKbZRyRug"};
    public int A00;
    public int A01;
    public long A02;
    public boolean A03;
    public final List<C0307Cr> A04;
    public final InterfaceC0288Bm[] A05;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 85);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{52, 67, 67, 63, 60, 54, 52, 71, 60, 66, 65, 2, 55, 73, 53, 70, 72, 53, 70};
    }

    static {
        A01();
    }

    public WK(List<C0307Cr> list) {
        this.A04 = list;
        this.A05 = new InterfaceC0288Bm[list.size()];
    }

    private boolean A02(C0420Hh c0420Hh, int i) {
        if (c0420Hh.A04() == 0) {
            return false;
        }
        if (c0420Hh.A0E() != i) {
            this.A03 = false;
        }
        this.A00--;
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0299Cg
    public final void A4O(C0420Hh c0420Hh) {
        if (this.A03) {
            if (this.A00 == 2 && !A02(c0420Hh, 32)) {
                return;
            }
            if (this.A00 == 1 && !A02(c0420Hh, 0)) {
                return;
            }
            int A062 = c0420Hh.A06();
            if (A07[5].charAt(6) != 'V') {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[2] = "JHIe8W9CfwFDjJjaFpf1hCiFr";
            strArr[6] = "vBjglJY7hKXluELD1o7ad0wQv";
            int A04 = c0420Hh.A04();
            for (InterfaceC0288Bm interfaceC0288Bm : this.A05) {
                c0420Hh.A0Y(A062);
                interfaceC0288Bm.AEr(c0420Hh, A04);
            }
            int dataPosition = this.A01;
            this.A01 = dataPosition + A04;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0299Cg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A4l(com.facebook.ads.redexgen.X.InterfaceC0280Bc r15, com.facebook.ads.redexgen.X.C0310Cu r16) {
        /*
            r14 = this;
            r2 = 0
        L1:
            com.facebook.ads.redexgen.X.Bm[] r0 = r14.A05
            int r0 = r0.length
            if (r2 >= r0) goto L41
            java.util.List<com.facebook.ads.redexgen.X.Cr> r0 = r14.A04
            java.lang.Object r5 = r0.get(r2)
            com.facebook.ads.redexgen.X.Cr r5 = (com.facebook.ads.redexgen.X.C0307Cr) r5
            r16.A05()
            int r1 = r16.A03()
            r0 = 3
            com.facebook.ads.redexgen.X.Bm r1 = r15.AFx(r1, r0)
            java.lang.String r6 = r16.A04()
            r4 = 0
            r3 = 19
            r0 = 126(0x7e, float:1.77E-43)
            java.lang.String r7 = A00(r4, r3, r0)
            r8 = 0
            r9 = -1
            r10 = 0
            byte[] r0 = r5.A02
            java.util.List r11 = java.util.Collections.singletonList(r0)
            java.lang.String r12 = r5.A01
            r13 = 0
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(r6, r7, r8, r9, r10, r11, r12, r13)
            r1.A5j(r0)
            com.facebook.ads.redexgen.X.Bm[] r0 = r14.A05
            r0[r2] = r1
            int r2 = r2 + 1
            goto L1
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WK.A4l(com.facebook.ads.redexgen.X.Bc, com.facebook.ads.redexgen.X.Cu):void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0299Cg
    public final void ADi() {
        if (this.A03) {
            for (InterfaceC0288Bm interfaceC0288Bm : this.A05) {
                interfaceC0288Bm.AEs(this.A02, 1, this.A01, 0, null);
            }
            this.A03 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0299Cg
    public final void ADj(long j, boolean z) {
        if (!z) {
            return;
        }
        this.A03 = true;
        this.A02 = j;
        this.A01 = 0;
        this.A00 = 2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0299Cg
    public final void AEv() {
        this.A03 = false;
    }
}
