package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.be, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0991be {
    public InterfaceC0992bf A00;

    public final void A00() {
        InterfaceC0992bf interfaceC0992bf = this.A00;
        if (interfaceC0992bf != null) {
            interfaceC0992bf.onStart();
        }
    }

    public final void A01() {
        InterfaceC0992bf interfaceC0992bf = this.A00;
        if (interfaceC0992bf != null) {
            interfaceC0992bf.onStop();
        }
    }

    public final void A02(InterfaceC0992bf interfaceC0992bf) {
        this.A00 = interfaceC0992bf;
    }
}
