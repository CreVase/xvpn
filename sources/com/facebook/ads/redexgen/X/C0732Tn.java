package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Tn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0732Tn implements N5 {
    public final /* synthetic */ InterfaceC0531Lt A00;
    public final /* synthetic */ C0730Tl A01;

    public C0732Tn(C0730Tl c0730Tl, InterfaceC0531Lt interfaceC0531Lt) {
        this.A01 = c0730Tl;
        this.A00 = interfaceC0531Lt;
    }

    @Override // com.facebook.ads.redexgen.X.N5
    public final void ACG(String str) {
        C0561Mx c0561Mx;
        c0561Mx = this.A01.A0A;
        c0561Mx.setProgress(100);
        this.A01.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.X.N5
    public final void ACI(String str) {
        C0560Mw c0560Mw;
        this.A01.A05 = true;
        c0560Mw = this.A01.A09;
        c0560Mw.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.X.N5
    public final void ACa(int i) {
        boolean z;
        C0561Mx c0561Mx;
        z = this.A01.A05;
        if (z) {
            c0561Mx = this.A01.A0A;
            c0561Mx.setProgress(i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.N5
    public final void ACf(String str) {
        C0560Mw c0560Mw;
        c0560Mw = this.A01.A09;
        c0560Mw.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.X.N5
    public final void ACh() {
        this.A00.AAl(14);
    }
}
