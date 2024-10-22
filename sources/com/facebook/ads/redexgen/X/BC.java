package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;

/* loaded from: assets/audience_network.dex */
public final class BC extends VO {
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public final float A04;
    public final float A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final GX A0A;
    public final HL A0B;

    public BC(TrackGroup trackGroup, int[] iArr, GX gx, long j, long j2, long j3, float f, float f2, long j4, HL hl) {
        super(trackGroup, iArr);
        this.A0A = gx;
        this.A07 = j * 1000;
        this.A06 = j2 * 1000;
        this.A08 = 1000 * j3;
        this.A04 = f;
        this.A05 = f2;
        this.A09 = j4;
        this.A0B = hl;
        this.A00 = 1.0f;
        this.A01 = 1;
        this.A03 = -9223372036854775807L;
        this.A02 = A00(Long.MIN_VALUE);
    }

    private int A00(long j) {
        long A62 = ((float) this.A0A.A62()) * this.A04;
        int i = 0;
        for (int i2 = 0; i2 < super.A03; i2++) {
            if (j == Long.MIN_VALUE || !A00(i2, j)) {
                if (Math.round(A6z(i2).A04 * this.A00) <= A62) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    @Override // com.facebook.ads.redexgen.X.VO, com.facebook.ads.redexgen.X.GO
    public final void A5P() {
        this.A03 = -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.X.GO
    public final int A7n() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.VO, com.facebook.ads.redexgen.X.GO
    public final void ACP(float f) {
        this.A00 = f;
    }
}
