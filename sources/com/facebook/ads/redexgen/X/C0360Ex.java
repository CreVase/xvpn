package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ex, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0360Ex extends AbstractC0905a9 {
    public View A00;
    public C0336Dz A01;

    public C0360Ex(C0336Dz c0336Dz, C00511r c00511r) {
        super(c0336Dz, c00511r);
        this.A01 = c0336Dz;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0905a9
    public final void A0L() {
        if (this.A00 != null) {
            this.A01.A0E().A3u();
            this.A06.A0E(this.A00);
        } else {
            this.A01.A0E().A3v();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0905a9
    public final void A0N(InterfaceC00220o interfaceC00220o, C8F c8f, C8D c8d, C00521s c00521s) {
        this.A01.A0E().A3o();
        C0942ak c0942ak = (C0942ak) interfaceC00220o;
        C0908aC c0908aC = new C0908aC(this, c00521s, c0942ak);
        A0E().postDelayed(c0908aC, c8f.A05().A05());
        c0942ak.A0I(this.A01, this.A08, this.A07.A07, new C0907aB(this, c0908aC), c00521s);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0905a9
    public final void A0Q(String str) {
        this.A01.A0E().A3t(str != null);
        super.A0Q(str);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0905a9
    public final void A0T(boolean z) {
        super.A0T(z);
        this.A00 = null;
    }
}
