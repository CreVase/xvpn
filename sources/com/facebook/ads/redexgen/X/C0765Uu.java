package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Uu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0765Uu implements HY {
    public long A00;
    public long A01;
    public C02329f A02 = C02329f.A04;
    public boolean A03;
    public final HL A04;

    public C0765Uu(HL hl) {
        this.A04 = hl;
    }

    public final void A00() {
        if (!this.A03) {
            this.A00 = this.A04.A5O();
            this.A03 = true;
        }
    }

    public final void A01() {
        if (this.A03) {
            A02(A7c());
            this.A03 = false;
        }
    }

    public final void A02(long j) {
        this.A01 = j;
        if (this.A03) {
            this.A00 = this.A04.A5O();
        }
    }

    @Override // com.facebook.ads.redexgen.X.HY
    public final C02329f A7Z() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.HY
    public final long A7c() {
        long elapsedSinceBaseMs = this.A01;
        if (this.A03) {
            long A5O = this.A04.A5O();
            long positionUs = this.A00;
            long j = A5O - positionUs;
            if (this.A02.A01 == 1.0f) {
                long positionUs2 = C9E.A00(j);
                return elapsedSinceBaseMs + positionUs2;
            }
            long positionUs3 = this.A02.A00(j);
            return elapsedSinceBaseMs + positionUs3;
        }
        return elapsedSinceBaseMs;
    }

    @Override // com.facebook.ads.redexgen.X.HY
    public final C02329f AFP(C02329f c02329f) {
        if (this.A03) {
            A02(A7c());
        }
        this.A02 = c02329f;
        return c02329f;
    }
}
