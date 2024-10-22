package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Dl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0322Dl implements XS, InterfaceC02459s {
    public int A00;
    public int A01;
    public long A02;
    public C02469t A03;
    public InterfaceC0356Et A04;
    public boolean A05 = true;
    public boolean A06;
    public Format[] A07;
    public final int A08;

    public AbstractC0322Dl(int i) {
        this.A08 = i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BK != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<?> */
    public static boolean A0x(BK<?> bk, DrmInitData drmInitData) {
        if (drmInitData == null) {
            return true;
        }
        if (bk == null) {
            return false;
        }
        return bk.A46(drmInitData);
    }

    public final int A0y() {
        return this.A00;
    }

    public final int A0z(long j) {
        return this.A04.AFd(j - this.A02);
    }

    public final int A10(C9X c9x, XE xe, boolean z) {
        int AEC = this.A04.AEC(c9x, xe, z);
        if (AEC == -4) {
            if (xe.A04()) {
                this.A05 = true;
                return this.A06 ? -4 : -3;
            }
            xe.A00 += this.A02;
        } else if (AEC == -5) {
            Format format = c9x.A00;
            if (format.A0G != Long.MAX_VALUE) {
                c9x.A00 = format.A0H(format.A0G + this.A02);
            }
        }
        return AEC;
    }

    public final C02469t A11() {
        return this.A03;
    }

    public void A12() {
    }

    public void A13() throws C9K {
    }

    public void A14() throws C9K {
    }

    public void A15(long j, boolean z) throws C9K {
    }

    public void A16(boolean z) throws C9K {
    }

    public void A17(Format[] formatArr, long j) throws C9K {
    }

    public final boolean A18() {
        return this.A05 ? this.A06 : this.A04.A90();
    }

    public final Format[] A19() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.XS
    public final void A53() {
        HI.A04(this.A01 == 1);
        this.A01 = 0;
        this.A04 = null;
        this.A07 = null;
        this.A06 = false;
        A12();
    }

    @Override // com.facebook.ads.redexgen.X.XS
    public final void A5Q(C02469t c02469t, Format[] formatArr, InterfaceC0356Et interfaceC0356Et, long j, boolean z, long j2) throws C9K {
        HI.A04(this.A01 == 0);
        this.A03 = c02469t;
        this.A01 = 1;
        A16(z);
        AEd(formatArr, interfaceC0356Et, j2);
        A15(j, z);
    }

    @Override // com.facebook.ads.redexgen.X.XS
    public final InterfaceC02459s A6D() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.XS
    public HY A7F() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.XS
    public final int A7t() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.XS
    public final InterfaceC0356Et A7w() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.XS, com.facebook.ads.redexgen.X.InterfaceC02459s
    public final int A83() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02429p
    public void A8L(int i, Object obj) throws C9K {
    }

    @Override // com.facebook.ads.redexgen.X.XS
    public final boolean A8Q() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.XS
    public final boolean A8n() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.XS
    public final void AA5() throws IOException {
        this.A04.AA2();
    }

    @Override // com.facebook.ads.redexgen.X.XS
    public final void AEd(Format[] formatArr, InterfaceC0356Et interfaceC0356Et, long j) throws C9K {
        HI.A04(!this.A06);
        this.A04 = interfaceC0356Et;
        this.A05 = false;
        this.A07 = formatArr;
        this.A02 = j;
        A17(formatArr, j);
    }

    @Override // com.facebook.ads.redexgen.X.XS
    public final void AEn(long j) throws C9K {
        this.A06 = false;
        this.A05 = false;
        A15(j, false);
    }

    @Override // com.facebook.ads.redexgen.X.XS
    public final void AFE() {
        this.A06 = true;
    }

    @Override // com.facebook.ads.redexgen.X.XS
    public final void AFH(int i) {
        this.A00 = i;
    }

    public int AFv() throws C9K {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.XS
    public final void start() throws C9K {
        HI.A04(this.A01 == 1);
        this.A01 = 2;
        A13();
    }

    @Override // com.facebook.ads.redexgen.X.XS
    public final void stop() throws C9K {
        HI.A04(this.A01 == 2);
        this.A01 = 1;
        A14();
    }
}
