package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class W2 implements InterfaceC0285Bj {
    public long A00;
    public long A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;

    public W2(int i, int i2, int i3, int i4, int i5, int i6) {
        this.A06 = i;
        this.A07 = i2;
        this.A02 = i3;
        this.A04 = i4;
        this.A03 = i5;
        this.A05 = i6;
    }

    public final int A00() {
        return this.A07 * this.A03 * this.A06;
    }

    public final int A01() {
        return this.A04;
    }

    public final int A02() {
        return this.A05;
    }

    public final int A03() {
        return this.A06;
    }

    public final int A04() {
        return this.A07;
    }

    public final long A05(long j) {
        long positionOffset = Math.max(0L, j - this.A01);
        long j2 = 1000000 * positionOffset;
        long positionOffset2 = this.A02;
        return j2 / positionOffset2;
    }

    public final void A06(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public final boolean A07() {
        return (this.A01 == 0 || this.A00 == 0) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0285Bj
    public final long A6k() {
        long j = 1000000 * (this.A00 / this.A04);
        long numFrames = this.A07;
        return j / numFrames;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0285Bj
    public final C0284Bi A7l(long j) {
        int i = this.A04;
        long positionOffset = i;
        long j2 = ((this.A02 * j) / 1000000) / positionOffset;
        long positionOffset2 = i;
        long A0E = C0436Hx.A0E(j2 * positionOffset2, 0L, this.A00 - i);
        long j3 = this.A01 + A0E;
        long A05 = A05(j3);
        C0286Bk seekPoint = new C0286Bk(A05, j3);
        if (A05 < j) {
            long j4 = this.A00;
            int i2 = this.A04;
            if (A0E != j4 - i2) {
                long seekTimeUs = i2 + j3;
                long seekPosition = A05(seekTimeUs);
                return new C0284Bi(seekPoint, new C0286Bk(seekPosition, seekTimeUs));
            }
        }
        return new C0284Bi(seekPoint);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0285Bj
    public final boolean A95() {
        return true;
    }
}
