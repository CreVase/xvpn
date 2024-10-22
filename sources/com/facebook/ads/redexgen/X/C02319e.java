package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;

/* renamed from: com.facebook.ads.redexgen.X.9e, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02319e {
    public final int A00;
    public final long A01;
    public final long A02;
    public final AbstractC02519z A03;
    public final EW A04;
    public final TrackGroupArray A05;
    public final GS A06;
    public final Object A07;
    public final boolean A08;
    public volatile long A09;
    public volatile long A0A;

    public C02319e(AbstractC02519z abstractC02519z, long j, TrackGroupArray trackGroupArray, GS gs) {
        this(abstractC02519z, null, new EW(0), j, -9223372036854775807L, 1, false, trackGroupArray, gs);
    }

    public C02319e(AbstractC02519z abstractC02519z, Object obj, EW ew, long j, long j2, int i, boolean z, TrackGroupArray trackGroupArray, GS gs) {
        this.A03 = abstractC02519z;
        this.A07 = obj;
        this.A04 = ew;
        this.A02 = j;
        this.A01 = j2;
        this.A0A = j;
        this.A09 = j;
        this.A00 = i;
        this.A08 = z;
        this.A05 = trackGroupArray;
        this.A06 = gs;
    }

    public static void A00(C02319e c02319e, C02319e c02319e2) {
        c02319e2.A0A = c02319e.A0A;
        c02319e2.A09 = c02319e.A09;
    }

    public final C02319e A01(int i) {
        C02319e c02319e = new C02319e(this.A03, this.A07, this.A04.A00(i), this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, c02319e);
        return c02319e;
    }

    public final C02319e A02(int i) {
        C02319e playbackInfo = new C02319e(this.A03, this.A07, this.A04, this.A02, this.A01, i, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C02319e A03(AbstractC02519z abstractC02519z, Object obj) {
        C02319e playbackInfo = new C02319e(abstractC02519z, obj, this.A04, this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C02319e A04(EW ew, long j, long j2) {
        long j3 = j2;
        AbstractC02519z abstractC02519z = this.A03;
        Object obj = this.A07;
        if (!ew.A01()) {
            j3 = -9223372036854775807L;
        }
        return new C02319e(abstractC02519z, obj, ew, j, j3, this.A00, this.A08, this.A05, this.A06);
    }

    public final C02319e A05(TrackGroupArray trackGroupArray, GS gs) {
        C02319e playbackInfo = new C02319e(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, this.A08, trackGroupArray, gs);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C02319e A06(boolean z) {
        C02319e playbackInfo = new C02319e(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, z, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }
}
