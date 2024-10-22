package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import com.vungle.ads.VungleError;

/* loaded from: assets/audience_network.dex */
public final class VP implements GN {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final GX A06;
    public final HL A07;

    public VP(GX gx) {
        this(gx, VungleError.DEFAULT, 25000, 25000, 0.75f, 0.75f, 2000L, HL.A00);
    }

    public VP(GX gx, int i, int i2, int i3, float f, float f2, long j, HL hl) {
        this.A06 = gx;
        this.A03 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A00 = f;
        this.A01 = f2;
        this.A05 = j;
        this.A07 = hl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.GN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final BC A4k(TrackGroup trackGroup, int... iArr) {
        return new BC(trackGroup, iArr, this.A06, this.A03, this.A02, this.A04, this.A00, this.A01, this.A05, this.A07);
    }
}
