package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class VJ implements GU {
    public static byte[] A08;
    public int A00;
    public int A01;
    public int A02;
    public GT[] A03;
    public final int A04;
    public final boolean A05;
    public final byte[] A06;
    public final GT[] A07;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{100, 104, 40, 19, 24, 5, 13, 24, 30, 9, 24, 25, 93, 28, 17, 17, 18, 30, 28, 9, 20, 18, 19, 71, 93};
    }

    public VJ(boolean z, int i) {
        this(z, i, 0);
    }

    public VJ(boolean z, int i, int i2) {
        HI.A03(i > 0);
        HI.A03(i2 >= 0);
        this.A05 = z;
        this.A04 = i;
        this.A01 = i2;
        this.A03 = new GT[i2 + 100];
        if (i2 > 0) {
            this.A06 = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.A03[i3] = new GT(this.A06, i3 * i);
            }
        } else {
            this.A06 = null;
        }
        this.A07 = new GT[1];
    }

    public final synchronized int A02() {
        return this.A00 * this.A04;
    }

    public final synchronized void A03() {
        if (this.A05) {
            A04(0);
        }
    }

    public final synchronized void A04(int i) {
        boolean targetBufferSizeReduced = i < this.A02;
        this.A02 = i;
        if (targetBufferSizeReduced) {
            AFy();
        }
    }

    @Override // com.facebook.ads.redexgen.X.GU
    public final synchronized GT A3T() {
        GT gt;
        this.A00++;
        int i = this.A01;
        if (i > 0) {
            GT[] gtArr = this.A03;
            int i2 = i - 1;
            this.A01 = i2;
            gt = gtArr[i2];
            gtArr[i2] = null;
        } else {
            gt = new GT(new byte[this.A04], 0);
        }
        return gt;
    }

    @Override // com.facebook.ads.redexgen.X.GU
    public final int A76() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.GU
    public final synchronized void AEP(GT gt) {
        GT[] gtArr = this.A07;
        gtArr[0] = gt;
        AEQ(gtArr);
    }

    @Override // com.facebook.ads.redexgen.X.GU
    public final synchronized void AEQ(GT[] gtArr) {
        int i = this.A01;
        int length = gtArr.length + i;
        GT[] gtArr2 = this.A03;
        if (length >= gtArr2.length) {
            this.A03 = (GT[]) Arrays.copyOf(gtArr2, Math.max(gtArr2.length * 2, i + gtArr.length));
        }
        for (GT gt : gtArr) {
            if (gt.A01 == this.A06 || gt.A01.length == this.A04) {
                GT[] gtArr3 = this.A03;
                int i2 = this.A01;
                this.A01 = i2 + 1;
                gtArr3[i2] = gt;
            } else {
                throw new IllegalArgumentException(A00(2, 23, 110) + System.identityHashCode(gt.A01) + A00(0, 2, 91) + System.identityHashCode(this.A06) + A00(0, 2, 91) + gt.A01.length + A00(0, 2, 91) + this.A04);
            }
        }
        this.A00 -= gtArr.length;
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.X.GU
    public final synchronized void AFy() {
        int A04 = C0436Hx.A04(this.A02, this.A04);
        int targetAllocationCount = this.A00;
        int highIndex = Math.max(0, A04 - targetAllocationCount);
        int targetAvailableCount = this.A01;
        if (highIndex >= targetAvailableCount) {
            return;
        }
        if (this.A06 != null) {
            int lowIndex = 0;
            int i = targetAvailableCount - 1;
            while (lowIndex <= i) {
                GT highAllocation = this.A03[lowIndex];
                if (highAllocation.A01 == this.A06) {
                    lowIndex++;
                } else {
                    GT lowAllocation = this.A03[i];
                    if (lowAllocation.A01 != this.A06) {
                        i--;
                    } else {
                        GT[] gtArr = this.A03;
                        gtArr[lowIndex] = lowAllocation;
                        int targetAllocationCount2 = i - 1;
                        gtArr[i] = highAllocation;
                        i = targetAllocationCount2;
                        lowIndex++;
                    }
                }
            }
            highIndex = Math.max(highIndex, lowIndex);
            int targetAllocationCount3 = this.A01;
            if (highIndex >= targetAllocationCount3) {
                return;
            }
        }
        Arrays.fill(this.A03, highIndex, this.A01, (Object) null);
        this.A01 = highIndex;
    }
}
