package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class XW implements C9Z {
    public static byte[] A0A;
    public static String[] A0B = {"QBw2naITCC87BBmeZEHB", "QG9qcoN67OZ9HCiBeCwQ37yZ8k9VzRIx", "huClURZcVSvs210svchTpygB", "SPjUxwmyMxCkovVHB3ukUPObWP0MyL9L", "Qo3gDbJmZiOUOvD4YrLGADsp8gVNY68y", "aCbITSFANaeoynFt6tlPTZT3Ud0BkJzi", "LC42BZreN0Trrj0tndAjNl8pur2kDdxK", "yIqlj0SUGgDzqSotNJk32MbE6gj6YGfF"};
    public int A00;
    public boolean A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final VJ A07;
    public final C0424Hl A08;
    public final boolean A09;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 83);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{-97, -30, -32, -19, -19, -18, -13, -97, -31, -28, -97, -21, -28, -14, -14, -97, -13, -25, -32, -19, -97, -55, -27, -8, -23, -23, -24, -11, -55, -14, -11, -45, -17, -28, -4, -27, -28, -26, -18, -60, -23, -9, -24, -11, -43, -24, -27, -8, -23, -23, -24, -11, -48, -10, 3, 22, 7, 7, 6, 19, -25, 16, 19, -15, 13, 2, 26, 3, 2, 4, 12, -18, 20, 25, 13, 36, -18, 33, 18, 18, 17, 30, -7, 31, -64, -68, -63, -107, -56, -71, -71, -72, -59, -96, -58};
    }

    static {
        A02();
    }

    public XW() {
        this(new VJ(true, 65536));
    }

    @Deprecated
    public XW(VJ vj) {
        this(vj, 15000, 50000, 2500, 5000, -1, true);
    }

    @Deprecated
    public XW(VJ vj, int i, int i2, int i3, int i4, int i5, boolean z) {
        this(vj, i, i2, i3, i4, i5, z, null);
    }

    @Deprecated
    public XW(VJ vj, int i, int i2, int i3, int i4, int i5, boolean z, C0424Hl c0424Hl) {
        String A01 = A01(54, 19, 78);
        String A012 = A01(21, 1, 70);
        A03(i3, 0, A01, A012);
        String A013 = A01(22, 32, 48);
        A03(i4, 0, A013, A012);
        String A014 = A01(84, 11, 0);
        A03(i, i3, A014, A01);
        A03(i, i4, A014, A013);
        A03(i2, i, A01(73, 11, 89), A014);
        this.A07 = vj;
        this.A06 = i * 1000;
        this.A05 = i2 * 1000;
        this.A04 = i3 * 1000;
        this.A03 = i4 * 1000;
        this.A02 = i5;
        this.A09 = z;
        this.A08 = c0424Hl;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0003 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int A00(com.facebook.ads.redexgen.X.XS[] r4, com.facebook.ads.redexgen.X.GP r5) {
        /*
            r3 = this;
            r2 = 0
            r1 = 0
        L2:
            int r0 = r4.length
            if (r1 >= r0) goto L19
            com.facebook.ads.redexgen.X.GO r0 = r5.A00(r1)
            if (r0 == 0) goto L16
            r0 = r4[r1]
            int r0 = r0.A83()
            int r0 = com.facebook.ads.redexgen.X.C0436Hx.A01(r0)
            int r2 = r2 + r0
        L16:
            int r1 = r1 + 1
            goto L2
        L19:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.XW.A00(com.facebook.ads.redexgen.X.XS[], com.facebook.ads.redexgen.X.GP):int");
    }

    public static void A03(int i, int i2, String str, String str2) {
        HI.A05(i >= i2, str + A01(0, 21, 44) + str2);
    }

    private void A04(boolean z) {
        this.A00 = 0;
        C0424Hl c0424Hl = this.A08;
        if (c0424Hl != null && this.A01) {
            c0424Hl.A03(0);
        }
        this.A01 = false;
        if (z) {
            this.A07.A03();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9Z
    public final VJ A5v() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.C9Z
    public final long A60() {
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.X.C9Z
    public final void ACg() {
        A04(true);
    }

    @Override // com.facebook.ads.redexgen.X.C9Z
    public final void AD4() {
        A04(true);
    }

    @Override // com.facebook.ads.redexgen.X.C9Z
    public final void ADD(XS[] xsArr, TrackGroupArray trackGroupArray, GP gp) {
        int i = this.A02;
        if (i == -1) {
            i = A00(xsArr, gp);
        }
        this.A00 = i;
        this.A07.A04(i);
    }

    @Override // com.facebook.ads.redexgen.X.C9Z
    public final boolean AEo() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C9Z
    public final boolean AFX(long j, float f) {
        boolean targetBufferSizeReached;
        boolean z = true;
        boolean z2 = this.A07.A02() >= this.A00;
        boolean z3 = this.A01;
        long j2 = this.A06;
        if (f > 1.0f) {
            j2 = Math.min(C0436Hx.A0C(j2, f), this.A05);
        }
        if (j < j2) {
            if (!this.A09 && z2) {
                z = false;
            }
            this.A01 = z;
        } else if (j > this.A05 || z2) {
            this.A01 = false;
        }
        C0424Hl c0424Hl = this.A08;
        if (A0B[0].length() != 20) {
            throw new RuntimeException();
        }
        String[] strArr = A0B;
        strArr[1] = "QKQzs8A5eNnCMvZO6Czn4VC5jQwn3nPR";
        strArr[4] = "QpEe5JzrMZm1KKJ9dYBmwnmG628Fesko";
        if (c0424Hl != null && (targetBufferSizeReached = this.A01) != z3) {
            if (targetBufferSizeReached) {
                c0424Hl.A00(0);
            } else {
                c0424Hl.A03(0);
            }
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.C9Z
    public final boolean AFa(long j, float f, boolean z) {
        long A0D = C0436Hx.A0D(j, f);
        long j2 = z ? this.A03 : this.A04;
        return j2 <= 0 || A0D >= j2 || (!this.A09 && this.A07.A02() >= this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.C9Z
    public final void onPrepared() {
        A04(false);
    }
}
