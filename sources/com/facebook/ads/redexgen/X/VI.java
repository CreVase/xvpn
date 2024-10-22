package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public final class VI implements GX, InterfaceC0411Gy<Object> {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public final Handler A06;
    public final GW A07;
    public final HL A08;
    public final C0431Hs A09;

    public VI() {
        this(null, null, 1000000L, 2000, HL.A00);
    }

    public VI(Handler handler, GW gw, long j, int i, HL hl) {
        this.A06 = handler;
        this.A07 = gw;
        this.A09 = new C0431Hs(i);
        this.A08 = hl;
        this.A01 = j;
    }

    private void A01(int i, long j, long j2) {
        Handler handler = this.A06;
        if (handler != null && this.A07 != null) {
            handler.post(new Gh(this, i, j, j2));
        }
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final synchronized long A62() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0411Gy
    public final synchronized void AAm(Object obj, int i) {
        this.A02 += i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0411Gy
    public final synchronized void ADE(Object obj) {
        HI.A04(this.A00 > 0);
        long nowMs = this.A08.A5O();
        int i = (int) (nowMs - this.A03);
        this.A05 += i;
        long j = this.A04;
        long j2 = this.A02;
        this.A04 = j + j2;
        if (i > 0) {
            this.A09.A03((int) Math.sqrt(j2), (float) ((8000 * j2) / i));
            if (this.A05 >= 2000 || this.A04 >= 524288) {
                this.A01 = this.A09.A02(0.5f);
            }
        }
        A01(i, this.A02, this.A01);
        int sampleElapsedTimeMs = this.A00 - 1;
        this.A00 = sampleElapsedTimeMs;
        if (sampleElapsedTimeMs > 0) {
            this.A03 = nowMs;
        }
        this.A02 = 0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0411Gy
    public final synchronized void ADF(Object obj, C0395Gg c0395Gg) {
        if (this.A00 == 0) {
            this.A03 = this.A08.A5O();
        }
        this.A00++;
    }
}
