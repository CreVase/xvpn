package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class TY implements InterfaceC0529Lr {
    public final /* synthetic */ TU A00;

    public TY(TU tu) {
        this.A00 = tu;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0529Lr
    public final void AAr() {
        boolean A0Z;
        boolean z;
        C0452In c0452In;
        InterfaceC0531Lt interfaceC0531Lt;
        MM mm;
        AtomicBoolean atomicBoolean;
        boolean A0Y;
        AtomicBoolean atomicBoolean2;
        C0570Ng c0570Ng;
        A0Z = this.A00.A0Z();
        if (A0Z) {
            atomicBoolean2 = this.A00.A0T;
            if (!atomicBoolean2.get()) {
                c0570Ng = this.A00.A0R;
                c0570Ng.A07(this.A00);
                return;
            }
        }
        z = this.A00.A0V;
        if (z) {
            atomicBoolean = this.A00.A0T;
            if (!atomicBoolean.get()) {
                A0Y = this.A00.A0Y();
                if (A0Y) {
                    this.A00.A0Y.setToolbarActionMode(0);
                    this.A00.A0M();
                    return;
                }
            }
        }
        c0452In = this.A00.A0L;
        c0452In.A04(EnumC0451Im.A07, null);
        interfaceC0531Lt = this.A00.A0O;
        mm = this.A00.A0P;
        interfaceC0531Lt.A3z(mm.A6n());
    }
}
