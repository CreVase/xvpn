package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Cn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0304Cn {
    public int A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final InterfaceC0299Cg A05;
    public final C0419Hg A06 = new C0419Hg(new byte[64]);
    public final C0432Ht A07;

    public C0304Cn(InterfaceC0299Cg interfaceC0299Cg, C0432Ht c0432Ht) {
        this.A05 = interfaceC0299Cg;
        this.A07 = c0432Ht;
    }

    private void A00() {
        this.A06.A08(8);
        this.A03 = this.A06.A0F();
        this.A02 = this.A06.A0F();
        this.A06.A08(6);
        this.A00 = this.A06.A04(8);
    }

    private void A01() {
        this.A01 = 0L;
        if (this.A03) {
            this.A06.A08(4);
            this.A06.A08(1);
            long pts = this.A06.A04(15) << 15;
            long A04 = (this.A06.A04(3) << 30) | pts;
            this.A06.A08(1);
            long pts2 = this.A06.A04(15);
            long j = A04 | pts2;
            this.A06.A08(1);
            if (!this.A04 && this.A02) {
                this.A06.A08(4);
                long pts3 = this.A06.A04(3);
                this.A06.A08(1);
                this.A06.A08(1);
                this.A06.A08(1);
                this.A07.A07((pts3 << 30) | (this.A06.A04(15) << 15) | this.A06.A04(15));
                this.A04 = true;
            }
            this.A01 = this.A07.A07(j);
        }
    }

    public final void A02() {
        this.A04 = false;
        this.A05.AEv();
    }

    public final void A03(C0420Hh c0420Hh) throws C02309d {
        c0420Hh.A0c(this.A06.A00, 0, 3);
        this.A06.A07(0);
        A00();
        c0420Hh.A0c(this.A06.A00, 0, this.A00);
        this.A06.A07(0);
        A01();
        this.A05.ADj(this.A01, true);
        this.A05.A4O(c0420Hh);
        this.A05.ADi();
    }
}
