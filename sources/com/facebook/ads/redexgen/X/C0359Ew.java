package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ew, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0359Ew extends AbstractC0905a9 {
    public C0359Ew(YA ya, C00511r c00511r) {
        super(ya, c00511r);
    }

    private C0902a6 A00(Runnable runnable) {
        return new C0902a6(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0905a9
    public final C1C A0F() {
        C0941aj successfullyLoadedAdapter = (C0941aj) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0905a9
    public final void A0L() {
        C0941aj interstitialAdapter = (C0941aj) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0905a9
    public final void A0N(InterfaceC00220o interfaceC00220o, C8F c8f, C8D c8d, C00521s c00521s) {
        C0941aj c0941aj = (C0941aj) interfaceC00220o;
        C0903a7 c0903a7 = new C0903a7(this, c00521s, c0941aj);
        A0E().postDelayed(c0903a7, c8f.A05().A05());
        c0941aj.A0A(this.A0B, A00(c0903a7), c00521s, this.A07.A0A, this.A07.A04, this.A07.A05, this.A07.A02);
    }
}
