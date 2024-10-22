package com.facebook.ads.redexgen.X;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.am, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0944am extends AbstractC0642Qa {
    public final /* synthetic */ C0942ak A00;

    public C0944am(C0942ak c0942ak) {
        this.A00 = c0942ak;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0642Qa
    public final void A03() {
        LN ln;
        LN ln2;
        C0336Dz c0336Dz;
        C0930aY c0930aY;
        C0336Dz c0336Dz2;
        F6 f6;
        C0643Qb c0643Qb;
        LN ln3;
        F6 f62;
        InterfaceC0444If interfaceC0444If;
        F6 f63;
        F6 f64;
        F6 f65;
        C1R A0x;
        C0336Dz c0336Dz3;
        C0643Qb c0643Qb2;
        ln = this.A00.A05;
        if (!ln.A07()) {
            ln2 = this.A00.A05;
            ln2.A05();
            c0336Dz = this.A00.A03;
            InterfaceC0961b3 A0E = c0336Dz.A0E();
            c0930aY = this.A00.A01;
            A0E.A3g(c0930aY != null);
            c0336Dz2 = this.A00.A03;
            c0336Dz2.A0E().A2g();
            f6 = this.A00.A02;
            C2C.A00(f6.A0M());
            NL nl = new NL();
            c0643Qb = this.A00.A0A;
            NL A03 = nl.A03(c0643Qb);
            ln3 = this.A00.A05;
            NL A02 = A03.A02(ln3);
            f62 = this.A00.A02;
            Map<String, String> A05 = A02.A04(f62.A0N()).A05();
            interfaceC0444If = this.A00.A04;
            f63 = this.A00.A02;
            interfaceC0444If.A9S(f63.A11(), A05);
            f64 = this.A00.A02;
            if (f64 == null) {
                A0x = null;
            } else {
                f65 = this.A00.A02;
                A0x = f65.A0x();
            }
            c0336Dz3 = this.A00.A03;
            C1R.A07(A0x, c0336Dz3);
            c0643Qb2 = this.A00.A0A;
            c0643Qb2.A0V();
        }
    }
}
